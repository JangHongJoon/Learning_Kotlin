package ex_class

class Person{
    var name: String=""
    var age: Int=0
}

fun main(args: Array<String>){
    val person: Person
    person = Person()
    person.name="장홍준"
    person.age=23

    println(person.name)
}