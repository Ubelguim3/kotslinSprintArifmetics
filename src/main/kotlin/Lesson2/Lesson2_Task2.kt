fun task2() {
    val numberOfWorkers = 50
    val workersSalary = 30000
    val numberOfInterns = 30
    val internsSalary = 20000
    val expensesOnWorkers = numberOfWorkers * workersSalary
    println("Расходы на зарплату постоянным сотрудникам - $expensesOnWorkers")
    val summaryExpenses = expensesOnWorkers + (numberOfInterns * internsSalary)
    println("Общие расходы - $summaryExpenses")
    val averageExpensesOnPerson = summaryExpenses / (numberOfWorkers + numberOfInterns)
    println("Средняя зарплата одного сотрудника c учетом стажеров - $averageExpensesOnPerson")
}