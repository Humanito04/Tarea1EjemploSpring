package ejemplo;

public class UsuarioImplWPT implements Usuario {

	@Override
	public void insertarUsuario() {
		System.out.println("Insertando Usuario en WPT");
		
	}

	@Override
	public void eliminarUsuarioById(int id) {
		System.out.println("Eliminado Usuario de WPT: " + id);
		
	}

}
