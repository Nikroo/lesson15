package by.itacademy.builder;

public class Good {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    private Good(Builder builder) {
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
        e = builder.e;
        f = builder.f;
    }
    //Реализация Builder через статический внутренний класс

    public static class Builder {
        //Обязательные поля
        public int a;
        public int b;
        //Необязательные поля
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;

        //Конструктор с обязательными параметрами
        public Builder(int a, int b) {
            this.a = a;
            this.b = b;
        }


        public Builder c(int val) {
            c = val;
            return this;
        }

        public Builder d(int val) {
            d = val;
            return this;
        }

        public Builder e(int val) {
            e = val;
            return this;
        }

        public Builder f(int val) {
            f = val;
            return this;
        }

        public Good build() {
            return new Good(this);
        }
    }

    @Override
    public String toString() {
        return "Good{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                '}';
    }
}
