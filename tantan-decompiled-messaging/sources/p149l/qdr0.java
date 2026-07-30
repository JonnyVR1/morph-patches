package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class qdr0 {

    /* JADX INFO: renamed from: a */
    public final m7r0 f153950a;

    /* JADX INFO: renamed from: d */
    public eer0 f153953d;

    /* JADX INFO: renamed from: e */
    public cdr0 f153954e;

    /* JADX INFO: renamed from: f */
    public int f153955f;

    /* JADX INFO: renamed from: g */
    public int f153956g;

    /* JADX INFO: renamed from: h */
    public int f153957h;

    /* JADX INFO: renamed from: i */
    public int f153958i;

    /* JADX INFO: renamed from: l */
    public boolean f153961l;

    /* JADX INFO: renamed from: b */
    public final der0 f153951b = new der0();

    /* JADX INFO: renamed from: c */
    public final v6w0 f153952c = new v6w0();

    /* JADX INFO: renamed from: j */
    public final v6w0 f153959j = new v6w0(1);

    /* JADX INFO: renamed from: k */
    public final v6w0 f153960k = new v6w0();

    public qdr0(m7r0 m7r0Var, eer0 eer0Var, cdr0 cdr0Var) {
        this.f153950a = m7r0Var;
        this.f153953d = eer0Var;
        this.f153954e = cdr0Var;
        m174094h(eer0Var, cdr0Var);
    }

    /* JADX INFO: renamed from: a */
    public final int m174088a() {
        int i;
        if (this.f153961l) {
            i = this.f153951b.f85844j[this.f153955f] ? 1 : 0;
        } else {
            i = this.f153953d.f90779g[this.f153955f];
        }
        return m174093f() != null ? 1073741824 | i : i;
    }

    /* JADX INFO: renamed from: b */
    public final int m174089b() {
        return !this.f153961l ? this.f153953d.f90776d[this.f153955f] : this.f153951b.f85842h[this.f153955f];
    }

    /* JADX INFO: renamed from: c */
    public final int m174090c(int i, int i2) {
        v6w0 v6w0Var;
        cer0 cer0VarM174093f = m174093f();
        if (cer0VarM174093f == null) {
            return 0;
        }
        int i3 = cer0VarM174093f.f80488d;
        if (i3 != 0) {
            v6w0Var = this.f153951b.f85848n;
        } else {
            byte[] bArr = cer0VarM174093f.f80489e;
            int i4 = ggw0.f102568a;
            v6w0 v6w0Var2 = this.f153960k;
            int length = bArr.length;
            v6w0Var2.m197260i(bArr, length);
            v6w0Var = this.f153960k;
            i3 = length;
        }
        boolean zM111391b = this.f153951b.m111391b(this.f153955f);
        boolean z = zM111391b || i2 != 0;
        v6w0 v6w0Var3 = this.f153959j;
        v6w0Var3.m197264m()[0] = (byte) ((true != z ? 0 : 128) | i3);
        v6w0Var3.m197262k(0);
        this.f153950a.mo134528a(this.f153959j, 1, 1);
        this.f153950a.mo134528a(v6w0Var, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zM111391b) {
            this.f153952c.m197259h(8);
            v6w0 v6w0Var4 = this.f153952c;
            byte[] bArrM197264m = v6w0Var4.m197264m();
            bArrM197264m[0] = 0;
            bArrM197264m[1] = 1;
            bArrM197264m[2] = 0;
            bArrM197264m[3] = (byte) i2;
            bArrM197264m[4] = (byte) ((i >> 24) & 255);
            bArrM197264m[5] = (byte) ((i >> 16) & 255);
            bArrM197264m[6] = (byte) ((i >> 8) & 255);
            bArrM197264m[7] = (byte) (i & 255);
            this.f153950a.mo134528a(v6w0Var4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        v6w0 v6w0Var5 = this.f153951b.f85848n;
        int iM197242F = v6w0Var5.m197242F();
        v6w0Var5.m197263l(-2);
        int i6 = (iM197242F * 6) + 2;
        if (i2 != 0) {
            this.f153952c.m197259h(i6);
            byte[] bArrM197264m2 = this.f153952c.m197264m();
            v6w0Var5.m197258g(bArrM197264m2, 0, i6);
            int i7 = (((bArrM197264m2[2] & 255) << 8) | (bArrM197264m2[3] & 255)) + i2;
            bArrM197264m2[2] = (byte) ((i7 >> 8) & 255);
            bArrM197264m2[3] = (byte) (i7 & 255);
            v6w0Var5 = this.f153952c;
        }
        this.f153950a.mo134528a(v6w0Var5, i6, 1);
        return i5 + i6;
    }

    /* JADX INFO: renamed from: d */
    public final long m174091d() {
        return !this.f153961l ? this.f153953d.f90775c[this.f153955f] : this.f153951b.f85840f[this.f153957h];
    }

    /* JADX INFO: renamed from: e */
    public final long m174092e() {
        if (!this.f153961l) {
            return this.f153953d.f90778f[this.f153955f];
        }
        der0 der0Var = this.f153951b;
        return der0Var.f85843i[this.f153955f];
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final cer0 m174093f() {
        if (!this.f153961l) {
            return null;
        }
        der0 der0Var = this.f153951b;
        cdr0 cdr0Var = der0Var.f85835a;
        int i = ggw0.f102568a;
        int i2 = cdr0Var.f80401a;
        cer0 cer0VarM101417a = der0Var.f85847m;
        if (cer0VarM101417a == null) {
            cer0VarM101417a = this.f153953d.f90773a.m101417a(i2);
        }
        if (cer0VarM101417a == null || !cer0VarM101417a.f80485a) {
            return null;
        }
        return cer0VarM101417a;
    }

    /* JADX INFO: renamed from: h */
    public final void m174094h(eer0 eer0Var, cdr0 cdr0Var) {
        this.f153953d = eer0Var;
        this.f153954e = cdr0Var;
        this.f153950a.mo134531d(eer0Var.f90773a.f75230f);
        m174095i();
    }

    /* JADX INFO: renamed from: i */
    public final void m174095i() {
        der0 der0Var = this.f153951b;
        der0Var.f85838d = 0;
        der0Var.f85850p = 0L;
        der0Var.f85851q = false;
        der0Var.f85845k = false;
        der0Var.f85849o = false;
        der0Var.f85847m = null;
        this.f153955f = 0;
        this.f153957h = 0;
        this.f153956g = 0;
        this.f153958i = 0;
        this.f153961l = false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m174096k() {
        this.f153955f++;
        if (!this.f153961l) {
            return false;
        }
        int i = this.f153956g + 1;
        this.f153956g = i;
        int[] iArr = this.f153951b.f85841g;
        int i2 = this.f153957h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f153957h = i2 + 1;
        this.f153956g = 0;
        return false;
    }
}
