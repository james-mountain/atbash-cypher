/**
  * Created by Administrator on 19/07/2017.
  */
class CypherTest extends BaseTest {
  "A string of wizard" should "convert into its reverse when cyphered" in {
    Cypher.atbashEncode("wizard") should be("draziw")
  }

  "A encoded string" should "be decodeable" in {
    Cypher.atbashEncode("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi") should be("this is an example of the atbash cipher")
  }

  "A encoded string with punctuation" should "be decodeable and retain punctuation" in {
    Cypher.atbashEncode("gsrh rh zm vcznkov! lu gsv zgyzhs xrksvi?") should be("this is an example! of the atbash cipher?")
  }
}
