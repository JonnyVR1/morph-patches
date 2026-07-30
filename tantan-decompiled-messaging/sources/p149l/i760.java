package p149l;

/* JADX INFO: loaded from: classes7.dex */
final class i760<A, B> {

    /* JADX INFO: renamed from: a */
    private final A f111834a;

    /* JADX INFO: renamed from: b */
    private final B f111835b;

    private i760(A a, B b) {
        this.f111834a = a;
        this.f111835b = b;
    }

    /* JADX INFO: renamed from: b */
    public static <A, B> i760<A, B> m134744b(A a, B b) {
        return new i760<>(a, b);
    }

    /* JADX INFO: renamed from: a */
    public A m134745a() {
        return this.f111834a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i760.class != obj.getClass()) {
            return false;
        }
        i760 i760Var = (i760) obj;
        A a = this.f111834a;
        A a2 = i760Var.f111834a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        } else if (!a.equals(a2)) {
            return false;
        }
        B b = this.f111835b;
        B b2 = i760Var.f111835b;
        if (b == null) {
            if (b2 != null) {
                return false;
            }
        } else if (!b.equals(b2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.f111834a;
        int iHashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.f111835b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }
}
