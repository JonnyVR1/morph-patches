package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class xyw0 extends gyw0 {

    /* JADX INFO: renamed from: a */
    public final int f196793a;

    /* JADX INFO: renamed from: b */
    public final int f196794b;

    /* JADX INFO: renamed from: c */
    public final int f196795c;

    /* JADX INFO: renamed from: d */
    public final int f196796d;

    /* JADX INFO: renamed from: e */
    public final vyw0 f196797e;

    /* JADX INFO: renamed from: f */
    public final uyw0 f196798f;

    public /* synthetic */ xyw0(int i, int i2, int i3, int i4, vyw0 vyw0Var, uyw0 uyw0Var, wyw0 wyw0Var) {
        this.f196793a = i;
        this.f196794b = i2;
        this.f196795c = i3;
        this.f196796d = i4;
        this.f196797e = vyw0Var;
        this.f196798f = uyw0Var;
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return this.f196797e != vyw0.f186430d;
    }

    /* JADX INFO: renamed from: b */
    public final int m213652b() {
        return this.f196793a;
    }

    /* JADX INFO: renamed from: c */
    public final int m213653c() {
        return this.f196794b;
    }

    /* JADX INFO: renamed from: d */
    public final int m213654d() {
        return this.f196795c;
    }

    /* JADX INFO: renamed from: e */
    public final int m213655e() {
        return this.f196796d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xyw0)) {
            return false;
        }
        xyw0 xyw0Var = (xyw0) obj;
        return xyw0Var.f196793a == this.f196793a && xyw0Var.f196794b == this.f196794b && xyw0Var.f196795c == this.f196795c && xyw0Var.f196796d == this.f196796d && xyw0Var.f196797e == this.f196797e && xyw0Var.f196798f == this.f196798f;
    }

    /* JADX INFO: renamed from: f */
    public final uyw0 m213656f() {
        return this.f196798f;
    }

    /* JADX INFO: renamed from: g */
    public final vyw0 m213657g() {
        return this.f196797e;
    }

    public final int hashCode() {
        return Objects.hash(xyw0.class, Integer.valueOf(this.f196793a), Integer.valueOf(this.f196794b), Integer.valueOf(this.f196795c), Integer.valueOf(this.f196796d), this.f196797e, this.f196798f);
    }

    public final String toString() {
        uyw0 uyw0Var = this.f196798f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.f196797e) + ", hashType: " + String.valueOf(uyw0Var) + ", " + this.f196795c + "-byte IV, and " + this.f196796d + "-byte tags, and " + this.f196793a + "-byte AES key, and " + this.f196794b + "-byte HMAC key)";
    }
}
