package ejemplo;

public class UsuarioPartidoPadel {
	
	Usuario user;
	
	public UsuarioPartidoPadel(Usuario user) {
		this.user = user;
	}
	
	public void getInsertandoUsuario() {
		user.insertarUsuario();
	}

	public void getEliminandoUsuarioById(int id) {
		user.eliminarUsuarioById(id);
	}
}
