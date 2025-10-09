object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        val letterIn = c.uppercase() 
        return when{
            "A, E, I, O, U, L, N, R, S, T".contains(letterIn)->1
            "D, G".contains(letterIn)->	2
            "B, C, M, P".contains(letterIn)->	3
            "F, H, V, W, Y".contains(letterIn)->	4
            "K".contains(letterIn)->	5
            "J, X".contains(letterIn)->	8
            "Q, Z".contains(letterIn)->	10
            else->0
        }
    }

    fun scoreWord(word: String): Int {
        var sumTotal = 0
        word.forEach{
            sumTotal+= scoreLetter(it)
        }
        return sumTotal
    }
}
