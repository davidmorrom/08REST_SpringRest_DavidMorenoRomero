package serviciorest.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import serviciorest.modelo.entidad.Videojuego;

@Component
public class DaoVideojuego {

	public List<Videojuego> listaVideojuegos;
	public int contador;

	public DaoVideojuego() {
		System.out.println("DaoPersona -> Creando la lista de videojuegos!");
		listaVideojuegos = new ArrayList<Videojuego>();
		Videojuego p1 = new Videojuego(contador++, "Call of Duty", "Activision", 9);
		Videojuego p2 = new Videojuego(contador++, "FIFA", "EA", 8);
		Videojuego p3 = new Videojuego(contador++, "Minecraft", "Mojang", 10);
		Videojuego p4 = new Videojuego(contador++, "League of Legends", "Riot", 7);
		Videojuego p5 = new Videojuego(contador++, "Fortnite", "Epic Games", 6);
		listaVideojuegos.add(p1);
		listaVideojuegos.add(p2);
		listaVideojuegos.add(p3);
		listaVideojuegos.add(p4);
		listaVideojuegos.add(p5);
	}

	public Videojuego get(int posicion) {
		try {
			return listaVideojuegos.get(posicion);
		} catch (IndexOutOfBoundsException iobe) {
			System.out.println("Persona fuera de rango");
			return null;
		}
	}
	
	public Videojuego getByName(String nombre) {
		for (Videojuego p : listaVideojuegos) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				return p;
			}
		}
		return null;
	}

	public List<Videojuego> list() {
		return listaVideojuegos;
	}
	
	public void add(Videojuego p) {
		p.setId(contador++);
		listaVideojuegos.add(p);
	}
	
	public Videojuego delete(int posicion) {
		try {
			return listaVideojuegos.remove(posicion);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("delete -> Videjuego fuera de rango");
			return null;
		}
	}

	public Videojuego update(Videojuego p) {
		try {
			Videojuego pAux = listaVideojuegos.get(p.getId());
			pAux.setNombre(p.getNombre());
			pAux.setCompania(p.getCompania());
			pAux.setNota(p.getNota());

			return pAux;
		} catch (IndexOutOfBoundsException iobe) {
			System.out.println("update -> Persona fuera de rango");
			return null;
		}
	}
	
	public List<Videojuego> listByCompania(String compania) {
		List<Videojuego> listaPersonasAux = new ArrayList<Videojuego>();
		for (Videojuego p : listaVideojuegos) {
			if (p.getCompania().equalsIgnoreCase(compania)) {// contains()
				listaPersonasAux.add(p);
			}
		}
		return listaPersonasAux;
	}
}
