//class Car2(color : String, speed: Int){
//    var color : String = ""
//    var speed : Int = 0
//    init{
//        this.color = color
//        this.speed = speed
//    }
//    fun upSpeed(value: Int){
//        if(speed + value >= 200)
//            speed = 200
//        else
//            speed +=value
//    }
//
//    fun downSpeed(value : Int){
//        if(speed - value <= 0)
//            speed = 0
//        else
//            speed = speed - value
//    }
//}

// kotiln은 기본적으로 클래스 상속을 금지하기에 상속을 허용하기 위해서 open 키워드 사용
open class Car{
    var color : String = ""
    var speed : Int = 0
    companion object{
        var carCount : Int = 0
        // const val을 붙이면 값을 변경할 수 없는 상수가 된다. (상수필드)
        const val MAXSPEED : Int = 200
        const val MINSPEED : Int = 0

        fun currentCarCount() : Int{
            return carCount
        }
    }

    constructor(color : String, speed: Int){
        //this: 자기 자신의 클래스를 의미
        this.color = color
        this.speed = speed
        carCount++
    }
    // 오버로딩: 한 클래스 내에서 메소드의 이름이 같아도 파라미터의 개수나 데이터 형식만 다르다면 여러 개를 선언할 수 있음
    constructor(speed : Int){
        this.speed = speed
    }
    // 오버로딩: 한 클래스 내에서 메소드의 이름이 같아도 파라미터의 개수나 데이터 형식만 다르다면 여러 개를 선언할 수 있음
    constructor(){      }


    open fun upSpeed(value: Int){
        if(speed + value >= 200)
            speed = 200
        else
            speed +=value
    }

    fun downSpeed(value : Int){
        if(speed - value <= 0)
            speed = 0
        else
            speed = speed - value
    }
}



fun main(args: Array<String>) {

    var myCar1: Car = Car("빨강", 0)

    var myCar2: Car = Car("파랑", 0)

    var myCar3: Car = Car("초록", 0)

    println("생산된 차의 대수(정적필드) ==> ${Car.carCount}")
    println("생산된 차의 대수(정적 메소드)==> ${Car.currentCarCount()}")
    println("차의 최고 제한 속도 ==> ${Car.MAXSPEED}")

    // Math클래스의 상수 필드인 PI 출력
    println("PI의 값 ==> ${Math.PI}")
    // Math클래스의 정적 메소드인 pow() 사용
    println("3의 5제곱 ==> ${Math.pow(3.0, 5.0).toInt()}")


    myCar1.upSpeed(50)
    println("자동차1의 색상은 ${myCar1.color}이며, 속도는 ${myCar1.speed}km 입니다.")

    myCar2.upSpeed(50)
    println("자동차2의 색상은 ${myCar2.color}이며, 속도는 ${myCar2.speed}km 입니다.")

    myCar3.upSpeed(50)
    println("자동차3의 색상은 ${myCar3.color}이며, 속도는 ${myCar3.speed}km 입니다.")
}