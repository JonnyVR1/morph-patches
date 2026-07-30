package p153l;

/* JADX INFO: loaded from: classes7.dex */
final class of60<A, B> {

    /* JADX INFO: renamed from: a */
    private final A f147041a;

    /* JADX INFO: renamed from: b */
    private final B f147042b;

    private of60(A a, B b) {
        this.f147041a = a;
        this.f147042b = b;
    }

    /* JADX INFO: renamed from: b */
    public static <A, B> of60<A, B> m167406b(A a, B b) {
        return new of60<>(a, b);
    }

    /* JADX INFO: renamed from: a */
    public A m167407a() {
        return this.f147041a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || of60.class != obj.getClass()) {
            return false;
        }
        of60 of60Var = (of60) obj;
        A a = this.f147041a;
        A a2 = of60Var.f147041a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        } else if (!a.equals(a2)) {
            return false;
        }
        B b = this.f147042b;
        B b2 = of60Var.f147042b;
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
        A a = this.f147041a;
        int iHashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.f147042b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }
}
