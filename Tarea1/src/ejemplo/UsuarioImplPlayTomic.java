package ejemplo;

public class UsuarioImplPlayTomic implements Usuario {

	@Override
	public void insertarUsuario() {
		System.out.println("Insertando Usuario en Play Tomic");
		
	}

	@Override
	public void eliminarUsuarioById(int id) {
		System.out.println("Eliminando Usuario de Play Tomic: " + id);
		
	}

}
