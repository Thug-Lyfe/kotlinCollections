package dk.cphbusiness.masterdetailtemplate

data class Car(val name: String, val price: Int){
    override fun toString() = "The $name costs $price dollars"
}

data class Owner(val name: String, val city: City, val cars: List<Car> ){
    override fun toString() = "$name from ${city.name}"
}

data class City(val name: String){
    override fun toString() = name
}

