package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class mr10 {

    /* JADX INFO: renamed from: a */
    private Class<?> f138288a;

    /* JADX INFO: renamed from: b */
    private Class<?> f138289b;

    /* JADX INFO: renamed from: c */
    private Class<?> f138290c;

    public mr10(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        m159618a(cls, cls2, cls3);
    }

    /* JADX INFO: renamed from: a */
    public void m159618a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f138288a = cls;
        this.f138289b = cls2;
        this.f138290c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mr10 mr10Var = (mr10) obj;
        return this.f138288a.equals(mr10Var.f138288a) && this.f138289b.equals(mr10Var.f138289b) && ylk0.m216580d(this.f138290c, mr10Var.f138290c);
    }

    public int hashCode() {
        int iHashCode = ((this.f138288a.hashCode() * 31) + this.f138289b.hashCode()) * 31;
        Class<?> cls = this.f138290c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f138288a + ", second=" + this.f138289b + '}';
    }

    public mr10() {
    }
}
