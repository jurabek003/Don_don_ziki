import java.util.Random
import java.util.Scanner

fun main() {
    val list= listOf("Tosh","Qaychi","Qog'oz")
    val input=Scanner(System.`in`)

    while (true){
        val random1=Random().nextInt(3)
        val random2=Random().nextInt(3)
        val random3=Random().nextInt(3)
        print("Ali -> ")
        val a=list[random1]
        println(a)
        print("G'ani -> ")
        val b=list[random2]
        println(b)
        print("Vali -> ")
        val c=list[random3]
        println(c)
        if (a == "Tosh" && b=="Tosh" && c=="Qog'oz"){
            println("Vali")
        }else if (a == "Qog'oz" && b=="Qog'oz" && c=="Qaychi"){
            println("Vali")
        }else if (a == "Qaychi" && b=="Qaychi" && c=="Tosh"){
            println("Vali")
        }
        else if (a == "Qog'oz" && b=="Qaychi" && c=="Qog'oz"){
            println("G'ani")
        }else if (a == "Qaychi" && b=="Tosh" && c=="Qaychi"){
            println("G'ani")
        }else if (a == "Tosh" && b=="Qog'oz" && c=="Tosh"){
            println("G'ani")
        }else if (a == "Tosh" && b=="Qaychi" && c=="Qaychi"){
            println("Ali")
        }else if (a == "Qog'oz" && b=="Tosh" && c=="Tosh"){
            println("Ali")
        }else if (a == "Qaychi" && b=="Qog'oz" && c=="Qog'oz") {
            println("Ali")
        }else if (a ==b && a==c){
            println("?")
        }else{
            println("?")
        }
        break
    }
}