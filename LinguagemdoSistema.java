import java.util.Locale;

public class LinguagemdoSistema {
    public static void main(String[] args) {
        
        System.out.println(" a linguagem do seu simtema é: ");
        System.out.println(Locale.getDefault().getLanguage());
        System.out.println(Locale.getDefault().getCountry());
    }
}
