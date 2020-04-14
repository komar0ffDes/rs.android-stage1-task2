package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val hr = Integer.parseInt(hour)
        val min = Integer.parseInt(minute)
        val numbers = arrayOf("zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine")
        when (min){
            0 -> return "${numbers[hr]} o' clock"
            30 -> return "half past ${numbers[hr]}"
            15 -> return "quarter past ${numbers[hr]}"
            45 -> return "quarter to ${numbers[hr+1]}"
            in 1..29 -> return "${numbers[min]} minutes past ${numbers[hr]}"
            in 31..60 -> return "${numbers[60-min]} minutes to ${numbers[hr+1]}"
        }

       return ""
    }
}
