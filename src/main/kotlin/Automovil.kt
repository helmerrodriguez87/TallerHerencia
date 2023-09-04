class Automovil(
    marca: String,
    modelo: String,
    año: Int,
    precio: Int,
    val tipo: String,
    val color: String
) : Vehiculo(marca, modelo, año, precio) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo: $tipo")
        println("Color: $color")
    }
}