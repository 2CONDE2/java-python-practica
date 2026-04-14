package secuencia;
class Suma implements Functor {

    public int operar(int uno) {
        return uno;
    }

    public int operar(int uno, int dos) {
        return uno + dos;
    }
}
