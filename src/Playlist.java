public class Playlist {
    private String[] canciones;

    public Playlist() {
        canciones = new String[0];
    }

    public void agregarCancion(String cancion) {
        String[] nuevaLista = new String[canciones.length + 1];
        for (int i = 0; i < canciones.length; i++) {
            nuevaLista[i] = canciones[i];
        }
        nuevaLista[canciones.length] = cancion;
        canciones = nuevaLista;
    }

    public void mostrarCanciones() {
        for (String cancion : canciones) {
            System.out.println(cancion);
        }
    }

    public void editarCancion(int indice, String nuevaCancion) {
        if (indice >= 0 && indice < canciones.length) {
            canciones[indice] = nuevaCancion;
        } else {
            System.out.println("la playlist no existe");
        }
    }
}