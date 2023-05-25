package recetas;

public class Gachamiguero {
    public static String cocinar(int ingrediente) {
        String plato = ingrediente + "";
        if (ingrediente % 3 == 0){
            plato ="Gacha";
        }
        if (ingrediente % 5 == 0){
            plato = " Miga";
        }
        if (ingrediente % 15 == 0){
             plato ="Gachamiga";
        }
        return  plato;
    }
}


