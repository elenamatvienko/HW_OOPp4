public enum LoadCapacity {

    CAPACITY_SMALL(null, 3.5f),
    CAPACITY_AVERAGE(3.5f, 12f),
    CAPACITY_BIG(12f, null);
    private final Float minWeight;
    private final Float maxWeight;

    LoadCapacity(Float minWeight, Float maxWeight) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public Float getMinWeight() {
        return minWeight;
    }

    public Float getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString() {
        if (minWeight == null)
            System.out.println("Грузоподъемность: до " + maxWeight);
        if (maxWeight == null)
            System.out.println("Грузоподъемность: от " + minWeight);
        else
            System.out.println("Грузоподъемность: от " +  minWeight + " тонн до " + maxWeight + " тонн");
        return null;
    }
}


