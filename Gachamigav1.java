package recetas;


public class Gachamigav1 {
    public static String catar(int ingrediente) {
        if (ingrediente % 15 == 0){
            return "Gachamiga";
        }
        if (ingrediente % 3 == 0){
            return "Gacha";
        }
        if (ingrediente % 5 == 0){
            return "Miga";
        }
        return ingrediente + "";
    }
}