package recetas;

public class Gachamigav2 {
    public static String cocinar(int ingrediente) {
        String plato = "";
        if (ingrediente % 3 == 0) {
            plato += "Gacha";
        }
        if (ingrediente % 5 == 0) {
            plato += "Miga";
        }
        if (plato.isEmpty()) {
            plato = String.valueOf(ingrediente);
        }
        return plato;
    }
}
