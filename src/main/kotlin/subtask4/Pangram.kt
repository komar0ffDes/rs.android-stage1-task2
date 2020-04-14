package subtask4

import java.lang.StringBuilder
import java.util.Comparator

class Pangram {


    fun getResult(inputString: String): String {
        val blankRg = Regex("\\s+")
        val arr = inputString.split(blankRg).toMutableList()

        if (arr.size == 2 && arr[0] == "" && arr[1] == ""){
            return ""
        }
        val templ = if (isPangramString(inputString)) "aiueoy" else "qwrtpsdfghjklzxcvbnm"
        arr.remove("")

        val ctInWord = IntArray(arr.size)
            for (i in arr.indices){
                var tmp = ""
                val sb = StringBuilder()
                var ct = 0
                for (j in arr[i].indices){
                        if (templ.contains(arr[i][j],true)){
                            sb.append(arr[i][j].toUpperCase())
                            ct++
                        }else {
                            sb.append(arr[i][j])
                        }
                    }
                ctInWord[i] = ct
                arr[i] = ct.toString()+sb.toString()
                }
            arr.sortWith(kotlin.Comparator { o1, o2 ->
                            val i1 = o1[0]
                            val i2 = o2[0]
                            i1.compareTo(i2)})
            return arr.joinToString(" ")
    }

    fun isPangramString(str: String): Boolean{
        val regString = ("(?i)(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)"
                + "(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)"
                + "(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)"
                + "(?=.*w)(?=.*x)(?=.*y)(?=.*z).*")
        val rg = Regex(regString)
        return str.toLowerCase().matches(rg)
    }
}
