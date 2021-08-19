public class BonusMilesService {
    public int calculate(int cost) {
        int priceForOneMile = 20;
        int miles = cost / priceForOneMile;
        return miles;
    }
}
