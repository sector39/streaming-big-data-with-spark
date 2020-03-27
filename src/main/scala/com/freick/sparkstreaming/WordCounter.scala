package com.freick.sparkstreaming

import org.apache.spark._

/** Create a RDD of lines from a text file, and keep count of
 *  how often each word appears.
 */
object WordCounter extends App {

      val conf = new SparkConf().setAppName("WordCount")
      conf.setMaster("local[*]")
      val sc = new SparkContext(conf)

      // Create a RDD of lines of text in our book
      val input = sc.textFile("book.txt")
      // Use flatMap to convert this into an rdd of each word in each line
      val words = input.flatMap(line => line.split(' '))
      // Convert these words to lowercase
      val lowerCaseWords = words.map(x => (x.toLowerCase, 1L)).reduceByKey(_ + _).sortBy(_._2, false)
      // Count up the occurence of each unique word
      val wordCounts = lowerCaseWords.collect() //countByValue()

      // Print the first 20 results
      val sample = wordCounts.take(20)

      for ((word, count) <- sample) {
        println(word + " " + count)
      }

      sc.stop()

}
