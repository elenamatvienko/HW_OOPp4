public enum Capacity {
    ESPECIALLY_SMALL(null, 10),
    SMALL(10, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    ESPECIALLY_LARGE(100, 120);

    private final Integer minQuantity;
    private final Integer maxQuantity;

    Capacity(Integer minQuantity, Integer maxQuantity) {
        this.minQuantity = minQuantity;
        this.maxQuantity = maxQuantity;
    }

    public Integer getMinQuantity() {
        return minQuantity;
    }

    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    @Override
    public String toString() {
        if (minQuantity == null)
            System.out.println("Вместимость: до " + maxQuantity);

        return null;
    }
}
