fun main() {
    // Int
    var scoreMatematic: Int = 80
    var scoreEnglish: Int = 70

    if (scoreMatematic <= scoreEnglish) {
        println("You Smart")
    } else {
        println("You Smart too")
    }

    // Boolean
    var isLogin: Boolean = true
    if (isLogin == true) {
        println("Go to dashboard")
    } else {
        println("login now")
    }

    // String
    var myName: String = "Anju"
    if (myName == "Anju") {
        println("Welcome $myName")
    } else {
        println("You name not $myName")
    }

    var timeSleep: Int = 22
    if (timeSleep > 22) {
        println("saya sudah tidur")
    } else if (timeSleep < 22) {
        println("saya belum tidur")
    } else {
        print("ntah")
    }
}
