package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class vrw0 extends apw0 {

    /* JADX INFO: renamed from: a */
    public final int f182750a;

    /* JADX INFO: renamed from: b */
    public final trw0 f182751b;

    public /* synthetic */ vrw0(int i, trw0 trw0Var, urw0 urw0Var) {
        this.f182750a = i;
        this.f182751b = trw0Var;
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return this.f182751b != trw0.f171877d;
    }

    /* JADX INFO: renamed from: b */
    public final int m199754b() {
        return this.f182750a;
    }

    /* JADX INFO: renamed from: c */
    public final trw0 m199755c() {
        return this.f182751b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vrw0)) {
            return false;
        }
        vrw0 vrw0Var = (vrw0) obj;
        return vrw0Var.f182750a == this.f182750a && vrw0Var.f182751b == this.f182751b;
    }

    public final int hashCode() {
        return Objects.hash(vrw0.class, Integer.valueOf(this.f182750a), this.f182751b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f182751b) + ", " + this.f182750a + "-byte key)";
    }
}
