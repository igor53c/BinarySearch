public class Result {
    public int step;
    public int index;

    public Result(int step, int index) {
        this.step = step;
        this.index = index;
    }

    @Override
    public String toString() {
        return "(step:" +  step + ", index: " + index + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Result r)) {
            return false;
        }
        if (o == this) {
            return true;
        }

        return r.step == this.step && r.index == this.index;
    }
}