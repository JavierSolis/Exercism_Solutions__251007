object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        if(start<=0) throw IllegalArgumentException("Invalid $start")
        var finalNumber =  start 
        var stepCount = 0
        while(finalNumber!=1 && stepCount<200){
            finalNumber = if(finalNumber%2==0) finalNumber/2 else finalNumber*3+1 
            stepCount++
        }
        return stepCount
    }
}
