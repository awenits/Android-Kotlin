package com.example.kotlinfun

fun main(args:Array<String>) {
    var age : Int = 23  //use val age = 23 to make it immutable
    var candy : String = "snickers"
    var weight : Double = 59.5
    var isTheLightOn: Boolean = false
    //var canRide : Boolean = age > 11
    println(age)
    println(candy)
    println(weight)

    if(isTheLightOn) {
        println("Walk across the room")
    } else {
        println("Don't move a muscle!")
    }

    if(age > 11) {
        println("Enjoy the ride!")
    } else {
        println("Sorry son... maybe another day")
    }

    if(candy == "snickers") {
        println("Matched")
    }

    //Lists and Arrays
    var topCandyList : List<String> = listOf("Fun dip", "Snickers", "100 Grand Bar")       //lists are immutable
    //topCandyList[1] = "good"    //not possible with lists
    println(topCandyList[1])        //snickers indexing starts from 0
    var topCandyArray : Array<String> = arrayOf("Fun dip", "Snickers", "100 Grand Bar")
    topCandyArray[1] = "Black Thunder"
    println(topCandyArray[1])
    var topCandyMutableList : MutableList<String> = mutableListOf("Fun dip", "Snickers", "100 Grand Bar")    //multable list
    topCandyMutableList[1] = "Black Thunder"
    println(topCandyMutableList[1])
    topCandyMutableList.add(0, "Snickers")
    println(topCandyMutableList[3])

    //loops
//    for (x in 1..100) {
//        println(x)
//    }
    for(candy in topCandyMutableList){
        println(candy)
    }

    for(i in 0 until topCandyMutableList.size){             //0..topCandyMutableList.size-1 "until" excludes end index
        topCandyMutableList[i] = "##" + topCandyMutableList[i] + "##"
        println(topCandyMutableList[i])
    }

    //functions
    fun printHello() {
        println("Hello!")
    }
    printHello()

    fun addTwoNumbers(num1 : Int, num2 : Int){
        println(num1 + num2)
    }
    addTwoNumbers(2, 3)

    fun returnMultiplication(num1: Int, num2 : Int) : Int {
        return num1 * num2
    }
    println(returnMultiplication(2,3))

    //Classes
    
}

