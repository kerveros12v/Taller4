public class tienda {
	private String nombreTienda;
	private String[] productos;
	private int totalProductos;

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String[] getProductos() {
		return productos;
	}

	public void setProductos(String[] productos) {
		this.productos = productos;
	}

	public int getTotalProductos() {
		return totalProductos;
	}

	public void setTotalProductos(int totalProductos) {
		this.totalProductos = totalProductos;
	}
    public tienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
		this.productos = new String[10];
		this.totalProductos = 0;
	}
    public void registrarProductos(String nombre) {
		if (totalProductos < productos.length) {
			productos[totalProductos] = nombre;
			totalProductos++;
			System.out.println("Producto registrado: " + nombre);
		} else {
			System.out.println("Limite de productos a registrar alcanzado (Limite: 10)");
		}
	}
    public void buscarProducto(String nombre) {
        boolean encontrado = false;

        for (int i = 0; i < totalProductos; i++) {
            if (productos[i].equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado: " + nombre);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado: " + nombre);
        }
	}

}