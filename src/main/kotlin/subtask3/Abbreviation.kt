package subtask3

import java.lang.StringBuilder

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {

        val reg = Regex("[^${b}]")

       val res = a.toUpperCase().replace(reg,"")
        return if (res.equals(b)){
            "YES"}
        else{
            "NO"
        }
    }
}
