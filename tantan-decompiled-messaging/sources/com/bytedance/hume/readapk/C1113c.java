package com.bytedance.hume.readapk;

/* JADX INFO: renamed from: com.bytedance.hume.readapk.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1113c<A, B> {

    /* JADX INFO: renamed from: a */
    private final A f4727a;

    /* JADX INFO: renamed from: b */
    private final B f4728b;

    private C1113c(A a, B b) {
        this.f4727a = a;
        this.f4728b = b;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B> C1113c<A, B> m5680a(A a, B b) {
        return new C1113c<>(a, b);
    }

    /* JADX INFO: renamed from: b */
    public B m5682b() {
        return this.f4728b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1113c.class != obj.getClass()) {
            return false;
        }
        C1113c c1113c = (C1113c) obj;
        A a = this.f4727a;
        A a2 = c1113c.f4727a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        } else if (!a.equals(a2)) {
            return false;
        }
        B b = this.f4728b;
        B b2 = c1113c.f4728b;
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
        A a = this.f4727a;
        int iHashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.f4728b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    /* JADX INFO: renamed from: a */
    public A m5681a() {
        return this.f4727a;
    }
}
