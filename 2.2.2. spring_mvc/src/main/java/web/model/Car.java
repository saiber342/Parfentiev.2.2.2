package web.model;

public class Car {

        private int price;
        private String model;
        private int series;

        public Car() {

        }

        public Car(int price, String model, int series) {
            this.price = price;
            this.model = model;
            this.series = series;
        }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
