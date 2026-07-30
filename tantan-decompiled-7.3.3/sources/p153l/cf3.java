package p153l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class cf3 {

    /* JADX INFO: renamed from: a */
    public final d13 f81469a;

    /* JADX INFO: renamed from: b */
    public final s5d0 f81470b;

    /* JADX INFO: renamed from: c */
    public final s5d0 f81471c;

    /* JADX INFO: renamed from: d */
    public final s5d0 f81472d;

    /* JADX INFO: renamed from: e */
    public final s5d0 f81473e;

    /* JADX INFO: renamed from: f */
    public final int f81474f;

    /* JADX INFO: renamed from: g */
    public final int f81475g;

    /* JADX INFO: renamed from: h */
    public final int f81476h;

    /* JADX INFO: renamed from: i */
    public final int f81477i;

    public cf3(d13 d13Var, s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, s5d0 s5d0Var4) throws NotFoundException {
        boolean z = s5d0Var == null || s5d0Var2 == null;
        boolean z2 = s5d0Var3 == null || s5d0Var4 == null;
        if (z && z2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z) {
            s5d0Var = new s5d0(0.0f, s5d0Var3.m184658d());
            s5d0Var2 = new s5d0(0.0f, s5d0Var4.m184658d());
        } else if (z2) {
            s5d0Var3 = new s5d0(d13Var.m113486m() - 1, s5d0Var.m184658d());
            s5d0Var4 = new s5d0(d13Var.m113486m() - 1, s5d0Var2.m184658d());
        }
        this.f81469a = d13Var;
        this.f81470b = s5d0Var;
        this.f81471c = s5d0Var2;
        this.f81472d = s5d0Var3;
        this.f81473e = s5d0Var4;
        this.f81474f = (int) Math.min(s5d0Var.m184657c(), s5d0Var2.m184657c());
        this.f81475g = (int) Math.max(s5d0Var3.m184657c(), s5d0Var4.m184657c());
        this.f81476h = (int) Math.min(s5d0Var.m184658d(), s5d0Var3.m184658d());
        this.f81477i = (int) Math.max(s5d0Var2.m184658d(), s5d0Var4.m184658d());
    }

    /* JADX INFO: renamed from: j */
    public static cf3 m109513j(cf3 cf3Var, cf3 cf3Var2) throws NotFoundException {
        if (cf3Var == null) {
            return cf3Var2;
        }
        return cf3Var2 == null ? cf3Var : new cf3(cf3Var.f81469a, cf3Var.f81470b, cf3Var.f81471c, cf3Var2.f81472d, cf3Var2.f81473e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX INFO: renamed from: a */
    public cf3 m109514a(int i, int i2, boolean z) throws NotFoundException {
        s5d0 s5d0Var;
        s5d0 s5d0Var2;
        s5d0 s5d0Var3;
        s5d0 s5d0Var4;
        s5d0 s5d0Var5;
        int iM184658d;
        s5d0 s5d0Var6;
        s5d0 s5d0Var7 = this.f81470b;
        s5d0 s5d0Var8 = this.f81471c;
        s5d0 s5d0Var9 = this.f81472d;
        s5d0 s5d0Var10 = this.f81473e;
        if (i > 0) {
            s5d0 s5d0Var11 = z ? s5d0Var7 : s5d0Var9;
            int iM184658d2 = ((int) s5d0Var11.m184658d()) - i;
            if (iM184658d2 < 0) {
                iM184658d2 = 0;
            }
            s5d0 s5d0Var12 = new s5d0(s5d0Var11.m184657c(), iM184658d2);
            if (z) {
                s5d0Var = s5d0Var12;
            } else {
                s5d0Var2 = s5d0Var12;
                s5d0Var = s5d0Var7;
            }
            if (i2 > 0) {
                if (z) {
                    s5d0Var5 = this.f81471c;
                } else {
                    s5d0Var5 = this.f81473e;
                }
                iM184658d = ((int) s5d0Var5.m184658d()) + i2;
                if (iM184658d >= this.f81469a.m113483j()) {
                    iM184658d = this.f81469a.m113483j() - 1;
                }
                s5d0Var6 = new s5d0(s5d0Var5.m184657c(), iM184658d);
                if (z) {
                    s5d0Var3 = s5d0Var6;
                } else {
                    s5d0Var4 = s5d0Var6;
                    s5d0Var3 = s5d0Var8;
                }
                return new cf3(this.f81469a, s5d0Var, s5d0Var3, s5d0Var2, s5d0Var4);
            }
            s5d0Var3 = s5d0Var8;
            s5d0Var4 = s5d0Var10;
            return new cf3(this.f81469a, s5d0Var, s5d0Var3, s5d0Var2, s5d0Var4);
        }
        s5d0Var = s5d0Var7;
        s5d0Var2 = s5d0Var9;
        if (i2 > 0) {
            if (z) {
                s5d0Var5 = this.f81471c;
            } else {
                s5d0Var5 = this.f81473e;
            }
            iM184658d = ((int) s5d0Var5.m184658d()) + i2;
            if (iM184658d >= this.f81469a.m113483j()) {
                iM184658d = this.f81469a.m113483j() - 1;
            }
            s5d0Var6 = new s5d0(s5d0Var5.m184657c(), iM184658d);
            if (z) {
                s5d0Var3 = s5d0Var6;
            } else {
                s5d0Var4 = s5d0Var6;
                s5d0Var3 = s5d0Var8;
            }
            return new cf3(this.f81469a, s5d0Var, s5d0Var3, s5d0Var2, s5d0Var4);
        }
        s5d0Var3 = s5d0Var8;
        s5d0Var4 = s5d0Var10;
        return new cf3(this.f81469a, s5d0Var, s5d0Var3, s5d0Var2, s5d0Var4);
    }

    /* JADX INFO: renamed from: b */
    public s5d0 m109515b() {
        return this.f81471c;
    }

    /* JADX INFO: renamed from: c */
    public s5d0 m109516c() {
        return this.f81473e;
    }

    /* JADX INFO: renamed from: d */
    public int m109517d() {
        return this.f81475g;
    }

    /* JADX INFO: renamed from: e */
    public int m109518e() {
        return this.f81477i;
    }

    /* JADX INFO: renamed from: f */
    public int m109519f() {
        return this.f81474f;
    }

    /* JADX INFO: renamed from: g */
    public int m109520g() {
        return this.f81476h;
    }

    /* JADX INFO: renamed from: h */
    public s5d0 m109521h() {
        return this.f81470b;
    }

    /* JADX INFO: renamed from: i */
    public s5d0 m109522i() {
        return this.f81472d;
    }

    public cf3(cf3 cf3Var) {
        this.f81469a = cf3Var.f81469a;
        this.f81470b = cf3Var.m109521h();
        this.f81471c = cf3Var.m109515b();
        this.f81472d = cf3Var.m109522i();
        this.f81473e = cf3Var.m109516c();
        this.f81474f = cf3Var.m109519f();
        this.f81475g = cf3Var.m109517d();
        this.f81476h = cf3Var.m109520g();
        this.f81477i = cf3Var.m109518e();
    }
}
