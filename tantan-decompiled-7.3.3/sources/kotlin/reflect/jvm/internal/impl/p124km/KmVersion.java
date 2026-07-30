package kotlin.reflect.jvm.internal.impl.p124km;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KmVersion {

    /* JADX INFO: renamed from: a */
    public final int f65244a;

    /* JADX INFO: renamed from: b */
    public final int f65245b;

    /* JADX INFO: renamed from: c */
    public final int f65246c;

    public KmVersion(int i, int i2, int i3) {
        this.f65244a = i;
        this.f65245b = i2;
        this.f65246c = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmVersion)) {
            return false;
        }
        KmVersion kmVersion = (KmVersion) obj;
        return this.f65244a == kmVersion.f65244a && this.f65245b == kmVersion.f65245b && this.f65246c == kmVersion.f65246c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f65244a) * 31) + Integer.hashCode(this.f65245b)) * 31) + Integer.hashCode(this.f65246c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f65244a);
        sb.append('.');
        sb.append(this.f65245b);
        sb.append('.');
        sb.append(this.f65246c);
        return sb.toString();
    }
}
