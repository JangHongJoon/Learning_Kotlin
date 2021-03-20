package ex_object

fun main(args: Array<String>){
    val person = object{
        val name:String="장홍준"
        val age: Int=23
    }

    println(person.name)
    println(person.age)
}