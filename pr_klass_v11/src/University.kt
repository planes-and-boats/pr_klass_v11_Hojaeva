class University (
    var name: String,
    var type: String,
    var studentCount: Int
    ){
    constructor(name: String): this(
        name,
        "неизвестно",
        0
    )
    fun DisplayInfo() {
        println("Название университета: $name" +
                "\nВид (направление): $type" +
                "\nКоличество студентов: $studentCount")
    }
    fun IsActive() {
        println("Активность университета на данный момент:")
        if (studentCount > 0) {
            println("Университет работает, ведь есть кому учиться. Количество студентов: $studentCount")
        }
        else {
            println("Некому учиться, университет в отпуске! Количество студентов: $studentCount")
        }
    }
    fun UpdateType() {
        println("Смена направления/вида для университета.")
        print("Введите новое направление/вид: ")
        var newType = readln()
        println("Смена направление с $type на $newType")
        type = newType
    }
    fun EveryoneHaveAPair() {
        print("Каждый имеет пару: ")
        if (studentCount == 0) {
            println("в университете никто не учится. Невозможно распределить пары.")
        }
        else if (studentCount % 2 != 0) {
            println("один студент остался без пары.")
        }
        else {
            println("у всех студентов есть пара!")
        }
    }
}