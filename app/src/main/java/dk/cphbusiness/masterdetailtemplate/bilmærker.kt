package dk.cphbusiness.masterdetailtemplate

//cars
val Skoda = Car("Skoda", 100)
val Ferrari = Car("Ferrari", 1200)
val Audi = Car("Audi", 400)
val Fishelling = Car("Fishelling", 5000)
val Kia = Car("Kia", 350)
val Peugeot = Car("Peugeot", 800)

//owners
val lind = "Lind"
val marco = "Marco"
val anders = "Anders"

//Cities

val Copenhagen = City("Copenhagen")
val Lyngby = City("Lyngby")
val Roskilde = City("Roskilde")


fun owner(name: String, city: City, vararg car: Car) = Owner(name, city, car.toList())
val orderedCars = setOf(Skoda, Ferrari, Audi, Fishelling, Kia, Peugeot)
val sortedOwners = listOf(lind,marco,anders)
