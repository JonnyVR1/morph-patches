package com.bytedance.hume.readapk;

/* JADX INFO: renamed from: com.bytedance.hume.readapk.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1136c<A, B> {

    /* JADX INFO: renamed from: a */
    private final A f4764a;

    /* JADX INFO: renamed from: b */
    private final B f4765b;

    private C1136c(A a, B b) {
        this.f4764a = a;
        this.f4765b = b;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B> C1136c<A, B> m5734a(A a, B b) {
        return new C1136c<>(a, b);
    }

    /* JADX INFO: renamed from: b */
    public B m5736b() {
        return this.f4765b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1136c.class != obj.getClass()) {
            return false;
        }
        C1136c c1136c = (C1136c) obj;
        A a = this.f4764a;
        A a2 = c1136c.f4764a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        } else if (!a.equals(a2)) {
            return false;
        }
        B b = this.f4765b;
        B b2 = c1136c.f4765b;
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
        A a = this.f4764a;
        int iHashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.f4765b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    /* JADX INFO: renamed from: a */
    public A m5735a() {
        return this.f4764a;
    }
}
