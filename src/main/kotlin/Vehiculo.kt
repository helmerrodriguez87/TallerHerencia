open class Vehiculo(
    val marca: String,
    val modelo: String,
    val año: Int,
    val precio: Int
) {
    open fun mostrarDetalles() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $año")
        println("Precio: $precio")
    }
}