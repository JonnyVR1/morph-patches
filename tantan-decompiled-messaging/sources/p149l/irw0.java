package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class irw0 extends apw0 {

    /* JADX INFO: renamed from: a */
    public final int f114693a;

    /* JADX INFO: renamed from: b */
    public final int f114694b = 12;

    /* JADX INFO: renamed from: c */
    public final int f114695c = 16;

    /* JADX INFO: renamed from: d */
    public final grw0 f114696d;

    public /* synthetic */ irw0(int i, int i2, int i3, grw0 grw0Var, hrw0 hrw0Var) {
        this.f114693a = i;
        this.f114696d = grw0Var;
    }

    /* JADX INFO: renamed from: c */
    public static frw0 m137918c() {
        return new frw0(null);
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return this.f114696d != grw0.f104123d;
    }

    /* JADX INFO: renamed from: b */
    public final int m137919b() {
        return this.f114693a;
    }

    /* JADX INFO: renamed from: d */
    public final grw0 m137920d() {
        return this.f114696d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof irw0)) {
            return false;
        }
        irw0 irw0Var = (irw0) obj;
        return irw0Var.f114693a == this.f114693a && irw0Var.f114696d == this.f114696d;
    }

    public final int hashCode() {
        return Objects.hash(irw0.class, Integer.valueOf(this.f114693a), 12, 16, this.f114696d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f114696d) + ", 12-byte IV, 16-byte tag, and " + this.f114693a + "-byte key)";
    }
}
