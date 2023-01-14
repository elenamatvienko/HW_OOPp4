public class Bus extends Transport {

    private final String capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = String.valueOf(capacity);
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void finishMovement() {
        System.out.println("Закончить движение");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость: " + capacity);
        }
    }

    public enum Capacity {
        ESPECIALLY_SMALL(null, 10),
        SMALL(null, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);

        private final Integer minQuantity;
        private final Integer maxQuantity;

        Capacity(Integer minQuantity, Integer maxQuantity) {
            this.minQuantity = minQuantity;
            this.maxQuantity = maxQuantity;
        }

        @Override
        public String toString() {
            return "Вместимость: " + minQuantity + " - " + maxQuantity + " мест.";
        }

        public Integer getMinQuantity() {
            return minQuantity;
        }

        public Integer getMaxQuantity() {
            return maxQuantity;
        }
    }

}
