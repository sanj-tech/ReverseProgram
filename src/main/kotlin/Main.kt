fun main(args: Array<String>) {

    //Reverse String by reverse metho

    var myString = "My journey in Kotlin"
    var reverse: String = myString.reversed().toString()
    println("$reverse")

// second way to reverse a string by using StringBuilder calss
    val reversed: String = StringBuilder(myString).reverse().toString()
    println("$reversed")

    // using ReadLine Method

    println("Enter a string")
    var reader = readLine()
    val reverseString: String = reader?.reversed().toString()
    println("$reverseString")

    //

    println("Enter a string")
    var inputreader = readLine()
    val reverseInputString: String = StringBuilder(inputreader).reverse().toString()
    println("$reverseInputString")

}

//outPut
