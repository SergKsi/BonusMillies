public class Main {
    public static void main(String[] args) {
        int priceTicket = 49;        // стоимость билета
        int countRubBonusMiles = 20; // количество рублей для одной бонусной милли
        int countBonusMilies = 0;   // количество бонусных миль

        // формула расчета :
        // за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
        countBonusMilies = (priceTicket * 1) / countRubBonusMiles;

        System.out.println("Количество бонусных миль = " + countBonusMilies);
    }
}
