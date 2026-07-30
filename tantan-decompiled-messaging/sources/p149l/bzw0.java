package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class bzw0 extends l0x0 {

    /* JADX INFO: renamed from: a */
    public final int f78088a;

    /* JADX INFO: renamed from: b */
    public final int f78089b;

    /* JADX INFO: renamed from: c */
    public final zyw0 f78090c;

    public /* synthetic */ bzw0(int i, int i2, zyw0 zyw0Var, azw0 azw0Var) {
        this.f78088a = i;
        this.f78089b = i2;
        this.f78090c = zyw0Var;
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return this.f78090c != zyw0.f205755e;
    }

    /* JADX INFO: renamed from: b */
    public final int m104697b() {
        return this.f78089b;
    }

    /* JADX INFO: renamed from: c */
    public final int m104698c() {
        return this.f78088a;
    }

    /* JADX INFO: renamed from: d */
    public final int m104699d() {
        zyw0 zyw0Var = this.f78090c;
        if (zyw0Var == zyw0.f205755e) {
            return this.f78089b;
        }
        if (zyw0Var == zyw0.f205752b || zyw0Var == zyw0.f205753c || zyw0Var == zyw0.f205754d) {
            return this.f78089b + 5;
        }
        qkq0.m175383a("Unknown variant");
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final zyw0 m104700e() {
        return this.f78090c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bzw0)) {
            return false;
        }
        bzw0 bzw0Var = (bzw0) obj;
        return bzw0Var.f78088a == this.f78088a && bzw0Var.m104699d() == m104699d() && bzw0Var.f78090c == this.f78090c;
    }

    public final int hashCode() {
        return Objects.hash(bzw0.class, Integer.valueOf(this.f78088a), Integer.valueOf(this.f78089b), this.f78090c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f78090c) + ", " + this.f78089b + "-byte tags, and " + this.f78088a + "-byte key)";
    }
}
