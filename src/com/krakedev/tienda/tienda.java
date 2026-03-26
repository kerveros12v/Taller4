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

}