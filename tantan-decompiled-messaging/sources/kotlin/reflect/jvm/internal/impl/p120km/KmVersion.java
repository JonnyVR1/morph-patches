package kotlin.reflect.jvm.internal.impl.p120km;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KmVersion {

    /* JADX INFO: renamed from: a */
    public final int f64570a;

    /* JADX INFO: renamed from: b */
    public final int f64571b;

    /* JADX INFO: renamed from: c */
    public final int f64572c;

    public KmVersion(int i, int i2, int i3) {
        this.f64570a = i;
        this.f64571b = i2;
        this.f64572c = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmVersion)) {
            return false;
        }
        KmVersion kmVersion = (KmVersion) obj;
        return this.f64570a == kmVersion.f64570a && this.f64571b == kmVersion.f64571b && this.f64572c == kmVersion.f64572c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f64570a) * 31) + Integer.hashCode(this.f64571b)) * 31) + Integer.hashCode(this.f64572c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f64570a);
        sb.append('.');
        sb.append(this.f64571b);
        sb.append('.');
        sb.append(this.f64572c);
        return sb.toString();
    }
}
