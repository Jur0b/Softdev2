package MySQLlab15;

public class TestCarDAO {

	public static void main(String[] args) {
		CarDAO carDAO = new CarDAO();
		Car car = new Car();
		car.setId(3);
		car.setRegnum("07MO222");
		car.setMake("Ford");
		car.setEnginecc(1995);
		carDAO.insert(car);

	}

}
