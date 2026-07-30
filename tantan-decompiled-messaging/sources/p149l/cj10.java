package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class cj10 {

    /* JADX INFO: renamed from: a */
    private Class<?> f81131a;

    /* JADX INFO: renamed from: b */
    private Class<?> f81132b;

    /* JADX INFO: renamed from: c */
    private Class<?> f81133c;

    public cj10(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        m107105a(cls, cls2, cls3);
    }

    /* JADX INFO: renamed from: a */
    public void m107105a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f81131a = cls;
        this.f81132b = cls2;
        this.f81133c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cj10 cj10Var = (cj10) obj;
        return this.f81131a.equals(cj10Var.f81131a) && this.f81132b.equals(cj10Var.f81132b) && sck0.m183404d(this.f81133c, cj10Var.f81133c);
    }

    public int hashCode() {
        int iHashCode = ((this.f81131a.hashCode() * 31) + this.f81132b.hashCode()) * 31;
        Class<?> cls = this.f81133c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f81131a + ", second=" + this.f81132b + '}';
    }

    public cj10() {
    }
}
