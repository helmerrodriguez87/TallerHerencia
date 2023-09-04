fun main() {
    try {
    val miAutomovil = Automovil("Ferrari", "El Aperta", 2016, 870000000, "Deportivo", "Negro")
    val miMoto = Moto("Kawasaki", "Z400", 2022, 32490000, 399, "Deportiva")

    println("Detalles del Automóvil:")
    miAutomovil.mostrarDetalles()

    println("\nDetalles de la Moto:")
    miMoto.mostrarDetalles()

    } catch (ex: Exception) {
        println("Una excepción: ${ex.message}")
    }

}