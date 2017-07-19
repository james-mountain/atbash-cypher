/**
  * Created by Administrator on 19/07/2017.
  */
object Cypher extends App {
  val range = 'a'.toByte to 'z'.toByte
  val pivot = 'n'.toByte

  def centralDiff(asciiRep : Int) = (pivot - asciiRep) + (pivot - 1)
  def atbashEncode(inputString : String): String = {
    inputString.map(char => if (range.contains(char.toByte)) centralDiff(char.toByte).toChar else char)
  }
}
