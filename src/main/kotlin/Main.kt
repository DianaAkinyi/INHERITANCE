fun main() {

    var car = Car("subaru","legacy","grey",14)
    car.carry(17)
     car.identity()
     println(car.calculateParkingFees(3))
     var bus =Bus("salon","climax","blue",76)
    println(bus.maxTripFare(3000.0))
    println(bus.calculateParkingFees(5))

}

   open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(People: Int) {
        var x = People - capacity
        if (People <= (capacity)) {
            println("Carrying $People passangers")
        } else {
            println("Over capacity by $x People")

        }
    }

    fun identity(){
     println("i am a $color $make $model")
 }
   open fun calculateParkingFees(hours:Int):Int{
        var p=hours*20
        return  p
    }

}

class Bus( make:String,model:String, color:String, capacity:Int,):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var amount =fare*capacity
        return amount
    }
    override fun calculateParkingFees(hours:Int):Int{
        return capacity*hours
    }
}