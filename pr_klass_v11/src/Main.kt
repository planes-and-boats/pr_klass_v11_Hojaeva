fun main() {
    try {
        var universities = Array(3) {i -> University("")}
        for (i in 0..2) {
            print("Университет ${i + 1}" +
                    "\nВведите название: ")
            universities[i].name = readln()
            print("Введите вид/направление: ")
            universities[i].type = readln()
            do {
                print("Введите количество студентов (> 0): ")
                universities[i].studentCount = readln().toInt()
            } while (universities[i].studentCount < 0)
        }
        for (i in 0..2) {
            println("Университет ${i + 1}")
            universities[i].DisplayInfo()
            universities[i].UpdateType()
            universities[i].IsActive()
            println("Проведем работу в паре. У всех студентов есть ли пара?")
            universities[i].EveryoneHaveAPair()
        }
    }
    catch (e:NumberFormatException) {
        println("неверный формат данных")
    }
}