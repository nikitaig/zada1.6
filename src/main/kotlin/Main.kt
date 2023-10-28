fun main() {
    fun zadacha6(a: String, b: String): String {
        var str1: String? = null
        var str2: String? = null
        if ("$a$b".toInt() % 2 != 0) {
            str1 = "$a$b"
        }
        if ("$b$a".toInt() % 2 != 0) {
            str2 = "$b$a"
        }
        var res = ""
        if (str1 == null && str2 == null) return "Создать нечетное число невозможно"
        if (str1 != null) res += str1
        if (str2 != null) {
            if (str1 != null) res += " "
            res += str2
        }
        return res
    }
    print("Введите первое число: ")
    val str1 = readln()
    print("Введите второе число: ")
    val str2 = readln()

    println(zadacha6(str1, str2))
}