public class Truck extends Transport {

    private final String loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = String.valueOf(loadCapacity);
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void finishMovement() {
        System.out.println("Закончить движение");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузопдъемность: " + loadCapacity);
        }
    }

    public enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, null);
        private final Float minWeight;
        private final Float maxWeight;

        LoadCapacity(Float minWeight, Float maxWeight) {
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }


        @Override
        public String toString() {
            return "Грузопдъемность: от " + minWeight + " тонн до " + maxWeight + " тонн";
        }

        public Float getMinWeight() {
            return minWeight;
        }

        public Float getMaxWeight() {
            return maxWeight;
        }
    }
}
