object Bob {
    fun hey(inputIn: String): String {
        val input = inputIn
            .filter{it-> it==' '||it=='?' || it.isLetter()}
            .trim()
            
        val isQuestion = input.lastOrNull()=='?'
        val question = input.replace("?","")
        
        val value = when(isQuestion){
            true->when{
                question.isNotEmpty() && input.uppercase()==input->"Calm down, I know what I'm doing!"
                else->"Sure."
            }
            false->when{
                question.isNotEmpty() && question.uppercase()==input ->"Whoa, chill out!"
                inputIn.trim().isEmpty() -> "Fine. Be that way!"
                else -> "Whatever."
            }
            
        }
        return value
    }
}
