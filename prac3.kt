fun main(args: Array<String>){
    var name = "Hello world"
    var myObject = Einstein()
    myObject.myFunction1(name)

}
class Einstein{
    fun myFunction1(name: String){
        println(name)

    }
}