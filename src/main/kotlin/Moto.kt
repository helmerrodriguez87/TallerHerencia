class Moto(
    marca: String,
    modelo: String,
    año: Int,
    precio: Int,
    val cilindrada: Int,
    val estilo: String
) : Vehiculo(marca, modelo, año, precio) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Cilindrada: $cilindrada cc")
        println("Estilo: $estilo")
    }
}