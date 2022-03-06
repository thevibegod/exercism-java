import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


class PythagoreanTriplet {
    int a, b, c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}

class PythagoreanTripletBuilder {
    ArrayList<ArrayList<Integer>> factors;
    int n;

    public PythagoreanTripletBuilder() {
        this.factors = new ArrayList<>();
        this.n = 0;
    }

    public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int num) {
        this.n = num;
        return this;
    }

    public PythagoreanTripletBuilder thatSumTo(int num) {
        this.n = num;
        return this;
    }

    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> triplets = new ArrayList<>();
        for (int i = 1; i < this.n; i++) {
            for (int j = i + 1; j < this.n; j++) {
                int k = this.n - (i + j);
                if (i < j && j < k && (i * i + j * j == k * k)) {
                    triplets.add(new PythagoreanTriplet(i, j, k));
                }
            }
        }
        return triplets;
    }
}