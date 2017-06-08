package basic.methods

class Methods {

   fun sumIntDouble(intParam: Int, doubleParam: Double): Double {
       return intParam + doubleParam
   }

   fun sumIntDouble2(intParam: Int, doubleParam: Double) = intParam + doubleParam

   fun printSumIntDouble2(intParam: Int, doubleParam: Double){
       print("Sum int $intParam and double $doubleParam is ${intParam + doubleParam}\n")
   }

    fun defValue(x: String = "default value", y: Int = 0) {

    }

    fun defValue2(x: String, y: Any = 10) {

    }
}

fun main(args: Array<String>) {
    Methods().defValue();
    Methods().defValue("not default value");
    Methods().defValue("not default value", 1);

    Methods().defValue2("asd");
}