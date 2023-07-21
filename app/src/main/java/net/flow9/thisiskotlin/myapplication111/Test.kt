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

class Calculator(var num1: Double, var num2: Double) {

    fun calculate(op: String) {
        when (op) {
            "+" -> println("$num1 + $num2 = ${num1 + num2}")
            "-" -> println("$num1 - $num2 = ${num1 - num2}")
            "*" -> println("$num1 * $num2 = ${num1 * num2}")
            "/" -> println("$num1 / $num2 = ${num1 / num2}")
            "%" -> println("$num1 % $num2 = ${num1 % num2}")
            else -> println("지원하지 않는 연산자입니다.")

        }
    }
}




//
//fun main() {
//    println("나는 츄르냥이다냥 계산을 하고 싶다면 츄르를 달라.")
//    println("알았다냥 / 싫다냥 중에 하나를 입력해라냥냥냥♪")
//
//    var rightAnswer = readLine()
//    when (rightAnswer) {
//        "알았다냥" -> {
//            println("첫번째 숫자를 달라냥!")
//            var num1 = readLine()!!.toDouble()
//            val calculator = CalculRator(num1)
//            calculator.inputnum()
//        }
//        else -> {
//            println("다른 츄르를 찾아봐라냥")
//        }
//    }
//}
//
//open class CalculRator(var num1: Double) {
//
//    open fun inputnum() {
//        println("원하는 등호를 넣어라냥")
//
//        var operator = readLine()!!.toString()
//
//
//        when (operator) {
//            "+" -> println("더할 숫자를 내놔라냥")
//            "-" -> println("뺄 숫자를 내놔라냥")
//            "/" -> println("나눌 숫자를 내놔라냥")
//            "*" -> println("곱할 숫자를 내놔라냥")
//            "%" -> println("나머지를 구하고 싶은 숫자를 내놔라냥")
//            else -> println("내가 원하는 답이 아니다냥")
//
//        }
//
//
//        var num2 = readLine()!!.toDouble()
//
//
//        when (operator) {
//            "+" -> println("${num1}와 ${num2}를 더했더니 ${num1 + num2}가 나왔다냥!")
//            "-" -> println("${num1}와 ${num2}를 뺏더니 ${num1 - num2}가 나왔다냥!")
//            "/" -> println("${num1}와 ${num2}를 나눴더니 ${num1 / num2}가 나왔다냥!")
//            "*" -> println("${num1}와 ${num2}를 나눴더니 ${num1 * num2}가 나왔다냥!")
//            "%" -> println("${num1}와 ${num2}를 나눴더니 ${num1 % num2}가 나왔다냥!")
//            else -> println("계산 똑바로 하게 잘 입력하라냥")
//        }
//    }
//}
//



//fun main() {
//
//    var bird = Bird("새")
//    var chicken = Chicken("닭")
//    var sparrow = Sparrow("참새")
//    var pigeon = Pigeon("비둘기")
//    var duck = Duck("비둘기")
//
//
//    bird.fly()
//    chicken.fly()
//    sparrow.fly()
//    pigeon.fly()
//    duck.fly()
//}
//
//
//open class Bird(name: String) {
//    var name: String = ""
//
//    init {
//        this.name = name
//    }
//
//    open fun fly(){
//        println("${name} 난다")
//    }
//
//}
//
//class Chicken(name:String) : Bird(name){
//
//}
//
//class Sparrow(name:String) : Bird(name){
//
//}
//
//class Pigeon(name:String) : Bird(name){
//
//}
//
//
//class Duck(name:String) : Bird(name), WaterBirdBehavior {
//    override fun swim() {
//        println("${name} 수영한다")
//    }
//}




//
//class Calculator(private val operation: AbstractOperation) {
//    fun addOperation(num1: Int, num2: Int): Int {
//        return operation.operate(num1, num2)
//    }
//}


