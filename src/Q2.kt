fun main(){

    var mylist= listOf("Maimoona","Amal","Mana");
    var myArray= arrayOf("Mohammed","Ahmed","Hasan");
    var myMutableList= mutableListOf("Adel","Sara","Osamah");

    println("");

    for ((index,value) in myArray.withIndex()){
        println("Index " + "$index" + " : The name is " + "$value");
    }

    println("");

    for (item in mylist.iterator()){
        println("$item");
    }
     print("")

    for (element in myMutableList.indices){
        println(myMutableList[element]);
    }
}
