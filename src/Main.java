public class Main {
	public static void main(String[] args) {

        int ticketPrice = 12597; // стоимость билета

        int rubPerMiles = 20; // количество бонусов за мили

        int bonusMiles = ticketPrice / rubPerMiles; // кол-во миль при указанной стоимости билета

        System.out.println(bonusMiles);

    }
}
