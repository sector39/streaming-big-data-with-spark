import org.apache.commons.codec.binary.Hex

object ByteArrayTransformer extends App {
  val hexString: String = "026b6e746b2e696f2f6564647973746f"
  val bytes: Array[Byte] = Hex.decodeHex(hexString.toCharArray)
  val result: String = new String(bytes, "UTF-8")

  println(result) // Hier kommt kntk.io/eddysto raus
}
