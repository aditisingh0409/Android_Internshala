data class Timetable (var class1 : String, var class2 : String, var class3 : String)
data class Food (var breakfast : String, var lunch :String)

class Robot (var name : String) {
    fun ringAlarm(time : Double, day : String) {
        println("Wake Up. It's $time AM of $day.")
    }

    fun makeCoffee(milk : String, sugar : Int) {
        println("Your coffee with $milk milk and $sugar spoons sugar is ready.")
    }

    fun heatWater(temperature : Double) {
        println("Water has been heated to a temperature of $temperature degree celsius.")
    }

    fun pack(day : String) {
        val mon = Timetable("Maths", "Physics", "English")
        val tue = Timetable("History", "Maths", "Chemistry")
        val wed = Timetable("Physics", "English","Maths")
        val thu = Timetable("Maths", "Physics", "Chemistry")
        val fri = Timetable("Chemistry", "English", "Maths")
        val sat = Timetable("English", "History", "Maths")

        when(day)
        {
            "Monday" -> println("Books of ${mon.class1}, ${mon.class2} and ${mon.class3} are packed.")
            "Tuesday" -> println("Books of ${tue.class1}, ${tue.class2} and ${tue.class3} are packed.")
            "Wednesday" -> println("Books of ${wed.class1}, ${wed.class2} and ${wed.class3} are packed.")
            "Thursday" -> println("Books of ${thu.class1}, ${thu.class2} and ${thu.class3} are packed.")
            "Friday" -> println("Books of ${fri.class1}, ${fri.class2} and ${fri.class3} are packed.")
            "Saturday" -> println("Books of ${sat.class1}, ${sat.class2} and ${sat.class3} are packed.")
        }
    }

    fun cook() {
        val food1 = Food("Idli", "Dal Chawal")
        val food2 = Food("Aloo Paratha", "Oats")
        val food3 = Food("Omelet", "Rajma Chawal")
        val food4 = Food("Poha", "Egg Curry")
        val food5 = Food("Sprouts", "Chhola Bhatura")
        val food6 = Food("Pav Bhaji", "Cheese Sandwich")

        val menu = listOf(food1, food2, food3, food4, food5, food6)
        val food = menu.random()
        println("Your menu for today is ${food.breakfast} for breakfast and ${food.lunch} for lunch.")
    }

    fun iron(clothes :String) {
        println("Your $clothes has been ironed and ready for you to wear.")
    }
}

fun main() {
    val robo = Robot("Bucky")
    println("Good Morning, its your friendly robot ${robo.name}")

    robo.ringAlarm(6.00, "Monday")
    robo.makeCoffee("Half and half", 2)
    robo.heatWater(35.00)
    robo.pack("Monday")
    robo.cook()
    robo.iron("Red Avengers T-Shirt and Black Jeans")
}