public class Race {
    String winner = " ";
    int distance = 0;

    public void setWinner(Auto auto) {
        int autoDistance = 24 * auto.speed;
        if (this.distance < autoDistance){
            this.distance = autoDistance;
            this.winner = auto.name;
        }
    }
}
