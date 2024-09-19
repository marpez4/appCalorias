fun main(){
    val alimentos = mapOf(
        "Pizza" to 800,
        "Ensalada" to 200,
        "Hamburguesa" to 700,
        "Manzana" to 100,
        "Helado" to 300,
        "Pasta" to 600,
        "Yogurt" to 150
    )

    // 1. Mostrar la lista de alimentos y sus calorías

    println("Lista de alimentos y sus calorías:")
    for ((alimento, calorias) in alimentos) {
        println("$alimento: $calorias calorías")
    }

    // 2. Separar los alimentos en dos categorías: alimentos con más de 500 calorías ("altos en calorías") y alimentos con menos de 500 calorías ("bajos en calorías").

   // Altos en calorias
    println("\nAlimentos altos en calorias:")
    var countAltosCalorias = 0
    for ((alimento, caloria) in alimentos) {
        if(caloria >= 500){
            println("$alimento: $caloria")
            countAltosCalorias++
        }
    }

    // bajos en calorias
    println("\nAlimentos bajos en calorias:")
    for ((alimento, caloria) in alimentos) {
        if(caloria < 500){
            println("$alimento: $caloria")
        }
    }
    // 3. Calcular y mostrar el total de calorías consumidas.

    var totalCalorias = 0

    for(caloria in alimentos.values){
        totalCalorias += caloria
    }
    println("\nTotal de calorías consumidas: $totalCalorias")

    // 4. Mostrar cuántos alimentos están en la categoría de "altos en calorías".

    println("\nNúmero de alimentos altos en calorías: $countAltosCalorias")


}