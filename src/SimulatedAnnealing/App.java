package SimulatedAnnealing;

public class App {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			City city = new City();
			Repository.addCity(city);
		}

		SimulatedAnnealing simulatedAnnealing = new SimulatedAnnealing();
		simulatedAnnealing.simulation();

		System.out.println("Final approximated solution distance: " + simulatedAnnealing.getBestRoute().getDistance());
		System.out.println("Tour: " + simulatedAnnealing.getBestRoute());
	}
}
