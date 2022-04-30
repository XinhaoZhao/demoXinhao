public class laundry{
    public int cash;
    public laundry(int cash){
        this.cash = cash;
    }
    public int getBalance(int times){
        return cash - 3*times;
    }
}