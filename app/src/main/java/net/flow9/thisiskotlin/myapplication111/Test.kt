package net.flow9.thisiskotlin.myapplication111
fun main() {
    println("첫번째 숫자를 입력해주세요")
    var num1 = readLine()!!.toDouble() // 숫자1 입력

    println("연산자를 입력해주세요: + - * / %")
    var op = readLine()!!.toString() // 연산자 입력

    println("두번째 숫자를 입력해주세요")
    var num2 = readLine()!!.toDouble() // 숫자2 입력



    val cal = Calculator(num1, num2) // 생성자를 통해 객체 생성

    cal.calculate(op) // 클래스에 있는 calculate 함수 호출
}

open class Calculator(var num1: Double, var num2: Double) {

    open fun calculate(op: String) {

        var add = AddOperation(num1,num2)
        var sub = SubstractOperation(num1,num2)
        var mul = MultiplyOperation(num1,num2)
        var div = DivideOperation(num1,num2)
        var mod = ModOperation(num1,num2)

        when (op) {
            "+" -> println("$num1 + $num2 = ${add.add1}")
            "-" -> println("$num1 - $num2 = ${sub.sub1}")
            "*" -> println("$num1 * $num2 = ${mul.mul1}")
            "/" -> println("$num1 / $num2 = ${div.div1}")
            "%" -> println("$num1 % $num2 = ${mod.mod1}")
            else -> println("지원하지 않는 연산자입니다.")

        }
    }
}

class AddOperation (num1: Double,num2: Double){
    var add1 = num1+num2
}
class SubstractOperation(num1: Double,num2: Double){
    var sub1 = num1-num2
}
class MultiplyOperation(num1: Double,num2: Double){
    var mul1 = num1*num2
}
class DivideOperation(num1: Double,num2: Double){
    var div1 = num1/num2
}
class ModOperation(num1: Double,num2: Double){
    var mod1 = num1%num2
}
