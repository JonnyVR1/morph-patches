package p149l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class ne3 {

    /* JADX INFO: renamed from: a */
    public final o03 f138575a;

    /* JADX INFO: renamed from: b */
    public final pxc0 f138576b;

    /* JADX INFO: renamed from: c */
    public final pxc0 f138577c;

    /* JADX INFO: renamed from: d */
    public final pxc0 f138578d;

    /* JADX INFO: renamed from: e */
    public final pxc0 f138579e;

    /* JADX INFO: renamed from: f */
    public final int f138580f;

    /* JADX INFO: renamed from: g */
    public final int f138581g;

    /* JADX INFO: renamed from: h */
    public final int f138582h;

    /* JADX INFO: renamed from: i */
    public final int f138583i;

    public ne3(o03 o03Var, pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, pxc0 pxc0Var4) throws NotFoundException {
        boolean z = pxc0Var == null || pxc0Var2 == null;
        boolean z2 = pxc0Var3 == null || pxc0Var4 == null;
        if (z && z2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z) {
            pxc0Var = new pxc0(0.0f, pxc0Var3.m171832d());
            pxc0Var2 = new pxc0(0.0f, pxc0Var4.m171832d());
        } else if (z2) {
            pxc0Var3 = new pxc0(o03Var.m162116m() - 1, pxc0Var.m171832d());
            pxc0Var4 = new pxc0(o03Var.m162116m() - 1, pxc0Var2.m171832d());
        }
        this.f138575a = o03Var;
        this.f138576b = pxc0Var;
        this.f138577c = pxc0Var2;
        this.f138578d = pxc0Var3;
        this.f138579e = pxc0Var4;
        this.f138580f = (int) Math.min(pxc0Var.m171831c(), pxc0Var2.m171831c());
        this.f138581g = (int) Math.max(pxc0Var3.m171831c(), pxc0Var4.m171831c());
        this.f138582h = (int) Math.min(pxc0Var.m171832d(), pxc0Var3.m171832d());
        this.f138583i = (int) Math.max(pxc0Var2.m171832d(), pxc0Var4.m171832d());
    }

    /* JADX INFO: renamed from: j */
    public static ne3 m159090j(ne3 ne3Var, ne3 ne3Var2) throws NotFoundException {
        if (ne3Var == null) {
            return ne3Var2;
        }
        return ne3Var2 == null ? ne3Var : new ne3(ne3Var.f138575a, ne3Var.f138576b, ne3Var.f138577c, ne3Var2.f138578d, ne3Var2.f138579e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX INFO: renamed from: a */
    public ne3 m159091a(int i, int i2, boolean z) throws NotFoundException {
        pxc0 pxc0Var;
        pxc0 pxc0Var2;
        pxc0 pxc0Var3;
        pxc0 pxc0Var4;
        pxc0 pxc0Var5;
        int iM171832d;
        pxc0 pxc0Var6;
        pxc0 pxc0Var7 = this.f138576b;
        pxc0 pxc0Var8 = this.f138577c;
        pxc0 pxc0Var9 = this.f138578d;
        pxc0 pxc0Var10 = this.f138579e;
        if (i > 0) {
            pxc0 pxc0Var11 = z ? pxc0Var7 : pxc0Var9;
            int iM171832d2 = ((int) pxc0Var11.m171832d()) - i;
            if (iM171832d2 < 0) {
                iM171832d2 = 0;
            }
            pxc0 pxc0Var12 = new pxc0(pxc0Var11.m171831c(), iM171832d2);
            if (z) {
                pxc0Var = pxc0Var12;
            } else {
                pxc0Var2 = pxc0Var12;
                pxc0Var = pxc0Var7;
            }
            if (i2 > 0) {
                if (z) {
                    pxc0Var5 = this.f138577c;
                } else {
                    pxc0Var5 = this.f138579e;
                }
                iM171832d = ((int) pxc0Var5.m171832d()) + i2;
                if (iM171832d >= this.f138575a.m162113j()) {
                    iM171832d = this.f138575a.m162113j() - 1;
                }
                pxc0Var6 = new pxc0(pxc0Var5.m171831c(), iM171832d);
                if (z) {
                    pxc0Var3 = pxc0Var6;
                } else {
                    pxc0Var4 = pxc0Var6;
                    pxc0Var3 = pxc0Var8;
                }
                return new ne3(this.f138575a, pxc0Var, pxc0Var3, pxc0Var2, pxc0Var4);
            }
            pxc0Var3 = pxc0Var8;
            pxc0Var4 = pxc0Var10;
            return new ne3(this.f138575a, pxc0Var, pxc0Var3, pxc0Var2, pxc0Var4);
        }
        pxc0Var = pxc0Var7;
        pxc0Var2 = pxc0Var9;
        if (i2 > 0) {
            if (z) {
                pxc0Var5 = this.f138577c;
            } else {
                pxc0Var5 = this.f138579e;
            }
            iM171832d = ((int) pxc0Var5.m171832d()) + i2;
            if (iM171832d >= this.f138575a.m162113j()) {
                iM171832d = this.f138575a.m162113j() - 1;
            }
            pxc0Var6 = new pxc0(pxc0Var5.m171831c(), iM171832d);
            if (z) {
                pxc0Var3 = pxc0Var6;
            } else {
                pxc0Var4 = pxc0Var6;
                pxc0Var3 = pxc0Var8;
            }
            return new ne3(this.f138575a, pxc0Var, pxc0Var3, pxc0Var2, pxc0Var4);
        }
        pxc0Var3 = pxc0Var8;
        pxc0Var4 = pxc0Var10;
        return new ne3(this.f138575a, pxc0Var, pxc0Var3, pxc0Var2, pxc0Var4);
    }

    /* JADX INFO: renamed from: b */
    public pxc0 m159092b() {
        return this.f138577c;
    }

    /* JADX INFO: renamed from: c */
    public pxc0 m159093c() {
        return this.f138579e;
    }

    /* JADX INFO: renamed from: d */
    public int m159094d() {
        return this.f138581g;
    }

    /* JADX INFO: renamed from: e */
    public int m159095e() {
        return this.f138583i;
    }

    /* JADX INFO: renamed from: f */
    public int m159096f() {
        return this.f138580f;
    }

    /* JADX INFO: renamed from: g */
    public int m159097g() {
        return this.f138582h;
    }

    /* JADX INFO: renamed from: h */
    public pxc0 m159098h() {
        return this.f138576b;
    }

    /* JADX INFO: renamed from: i */
    public pxc0 m159099i() {
        return this.f138578d;
    }

    public ne3(ne3 ne3Var) {
        this.f138575a = ne3Var.f138575a;
        this.f138576b = ne3Var.m159098h();
        this.f138577c = ne3Var.m159092b();
        this.f138578d = ne3Var.m159099i();
        this.f138579e = ne3Var.m159093c();
        this.f138580f = ne3Var.m159096f();
        this.f138581g = ne3Var.m159094d();
        this.f138582h = ne3Var.m159097g();
        this.f138583i = ne3Var.m159095e();
    }
}
