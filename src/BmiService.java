public class BmiService {

    public int calculate(double heigtInMeters, int weightInKilograms) {

       double result = weightInKilograms / (heigtInMeters*heigtInMeters);
       int result1 = (int) result;
        return result1;
    }

}
