package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class wax0 {

    /* JADX INFO: renamed from: a */
    public final zww0 f188173a;

    /* JADX INFO: renamed from: b */
    public final int f188174b;

    /* JADX INFO: renamed from: c */
    public final String f188175c;

    /* JADX INFO: renamed from: d */
    public final String f188176d;

    public /* synthetic */ wax0(zww0 zww0Var, int i, String str, String str2, vax0 vax0Var) {
        this.f188173a = zww0Var;
        this.f188174b = i;
        this.f188175c = str;
        this.f188176d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m205688a() {
        return this.f188174b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wax0)) {
            return false;
        }
        wax0 wax0Var = (wax0) obj;
        return this.f188173a == wax0Var.f188173a && this.f188174b == wax0Var.f188174b && this.f188175c.equals(wax0Var.f188175c) && this.f188176d.equals(wax0Var.f188176d);
    }

    public final int hashCode() {
        return Objects.hash(this.f188173a, Integer.valueOf(this.f188174b), this.f188175c, this.f188176d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f188173a, Integer.valueOf(this.f188174b), this.f188175c, this.f188176d);
    }
}
