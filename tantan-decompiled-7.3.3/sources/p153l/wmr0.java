package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class wmr0 {

    /* JADX INFO: renamed from: a */
    public final sgr0 f189824a;

    /* JADX INFO: renamed from: d */
    public knr0 f189827d;

    /* JADX INFO: renamed from: e */
    public imr0 f189828e;

    /* JADX INFO: renamed from: f */
    public int f189829f;

    /* JADX INFO: renamed from: g */
    public int f189830g;

    /* JADX INFO: renamed from: h */
    public int f189831h;

    /* JADX INFO: renamed from: i */
    public int f189832i;

    /* JADX INFO: renamed from: l */
    public boolean f189835l;

    /* JADX INFO: renamed from: b */
    public final jnr0 f189825b = new jnr0();

    /* JADX INFO: renamed from: c */
    public final bgw0 f189826c = new bgw0();

    /* JADX INFO: renamed from: j */
    public final bgw0 f189833j = new bgw0(1);

    /* JADX INFO: renamed from: k */
    public final bgw0 f189834k = new bgw0();

    public wmr0(sgr0 sgr0Var, knr0 knr0Var, imr0 imr0Var) {
        this.f189824a = sgr0Var;
        this.f189827d = knr0Var;
        this.f189828e = imr0Var;
        m207130h(knr0Var, imr0Var);
    }

    /* JADX INFO: renamed from: a */
    public final int m207124a() {
        int i;
        if (this.f189835l) {
            i = this.f189825b.f121893j[this.f189829f] ? 1 : 0;
        } else {
            i = this.f189827d.f127634g[this.f189829f];
        }
        return m207129f() != null ? 1073741824 | i : i;
    }

    /* JADX INFO: renamed from: b */
    public final int m207125b() {
        return !this.f189835l ? this.f189827d.f127631d[this.f189829f] : this.f189825b.f121891h[this.f189829f];
    }

    /* JADX INFO: renamed from: c */
    public final int m207126c(int i, int i2) {
        bgw0 bgw0Var;
        inr0 inr0VarM207129f = m207129f();
        if (inr0VarM207129f == null) {
            return 0;
        }
        int i3 = inr0VarM207129f.f115996d;
        if (i3 != 0) {
            bgw0Var = this.f189825b.f121897n;
        } else {
            byte[] bArr = inr0VarM207129f.f115997e;
            int i4 = mpw0.f137957a;
            bgw0 bgw0Var2 = this.f189834k;
            int length = bArr.length;
            bgw0Var2.m104267i(bArr, length);
            bgw0Var = this.f189834k;
            i3 = length;
        }
        boolean zM146285b = this.f189825b.m146285b(this.f189829f);
        boolean z = zM146285b || i2 != 0;
        bgw0 bgw0Var3 = this.f189833j;
        bgw0Var3.m104271m()[0] = (byte) ((true != z ? 0 : 128) | i3);
        bgw0Var3.m104269k(0);
        this.f189824a.mo99370a(this.f189833j, 1, 1);
        this.f189824a.mo99370a(bgw0Var, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zM146285b) {
            this.f189826c.m104266h(8);
            bgw0 bgw0Var4 = this.f189826c;
            byte[] bArrM104271m = bgw0Var4.m104271m();
            bArrM104271m[0] = 0;
            bArrM104271m[1] = 1;
            bArrM104271m[2] = 0;
            bArrM104271m[3] = (byte) i2;
            bArrM104271m[4] = (byte) ((i >> 24) & 255);
            bArrM104271m[5] = (byte) ((i >> 16) & 255);
            bArrM104271m[6] = (byte) ((i >> 8) & 255);
            bArrM104271m[7] = (byte) (i & 255);
            this.f189824a.mo99370a(bgw0Var4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        bgw0 bgw0Var5 = this.f189825b.f121897n;
        int iM104249F = bgw0Var5.m104249F();
        bgw0Var5.m104270l(-2);
        int i6 = (iM104249F * 6) + 2;
        if (i2 != 0) {
            this.f189826c.m104266h(i6);
            byte[] bArrM104271m2 = this.f189826c.m104271m();
            bgw0Var5.m104265g(bArrM104271m2, 0, i6);
            int i7 = (((bArrM104271m2[2] & 255) << 8) | (bArrM104271m2[3] & 255)) + i2;
            bArrM104271m2[2] = (byte) ((i7 >> 8) & 255);
            bArrM104271m2[3] = (byte) (i7 & 255);
            bgw0Var5 = this.f189826c;
        }
        this.f189824a.mo99370a(bgw0Var5, i6, 1);
        return i5 + i6;
    }

    /* JADX INFO: renamed from: d */
    public final long m207127d() {
        return !this.f189835l ? this.f189827d.f127630c[this.f189829f] : this.f189825b.f121889f[this.f189831h];
    }

    /* JADX INFO: renamed from: e */
    public final long m207128e() {
        if (!this.f189835l) {
            return this.f189827d.f127633f[this.f189829f];
        }
        jnr0 jnr0Var = this.f189825b;
        return jnr0Var.f121892i[this.f189829f];
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final inr0 m207129f() {
        if (!this.f189835l) {
            return null;
        }
        jnr0 jnr0Var = this.f189825b;
        imr0 imr0Var = jnr0Var.f121884a;
        int i = mpw0.f137957a;
        int i2 = imr0Var.f115826a;
        inr0 inr0VarM136272a = jnr0Var.f121896m;
        if (inr0VarM136272a == null) {
            inr0VarM136272a = this.f189827d.f127628a.m136272a(i2);
        }
        if (inr0VarM136272a == null || !inr0VarM136272a.f115993a) {
            return null;
        }
        return inr0VarM136272a;
    }

    /* JADX INFO: renamed from: h */
    public final void m207130h(knr0 knr0Var, imr0 imr0Var) {
        this.f189827d = knr0Var;
        this.f189828e = imr0Var;
        this.f189824a.mo99373d(knr0Var.f127628a.f110820f);
        m207131i();
    }

    /* JADX INFO: renamed from: i */
    public final void m207131i() {
        jnr0 jnr0Var = this.f189825b;
        jnr0Var.f121887d = 0;
        jnr0Var.f121899p = 0L;
        jnr0Var.f121900q = false;
        jnr0Var.f121894k = false;
        jnr0Var.f121898o = false;
        jnr0Var.f121896m = null;
        this.f189829f = 0;
        this.f189831h = 0;
        this.f189830g = 0;
        this.f189832i = 0;
        this.f189835l = false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m207132k() {
        this.f189829f++;
        if (!this.f189835l) {
            return false;
        }
        int i = this.f189830g + 1;
        this.f189830g = i;
        int[] iArr = this.f189825b.f121890g;
        int i2 = this.f189831h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f189831h = i2 + 1;
        this.f189830g = 0;
        return false;
    }
}
