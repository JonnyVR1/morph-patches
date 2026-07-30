package com.tencent.liteav.beauty.p093b.p096c;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.p093b.C14068b;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14072a extends C14068b {

    /* JADX INFO: renamed from: r */
    private C14075d f58663r = null;

    /* JADX INFO: renamed from: s */
    private C14075d f58664s = null;

    /* JADX INFO: renamed from: t */
    private C14073b f58665t = null;

    /* JADX INFO: renamed from: u */
    private C14074c f58666u = null;

    /* JADX INFO: renamed from: v */
    private C14075d f58667v = null;

    /* JADX INFO: renamed from: w */
    private C14075d f58668w = null;

    /* JADX INFO: renamed from: x */
    private float f58669x = 0.2f;

    /* JADX INFO: renamed from: y */
    private float f58670y = 0.2f;

    /* JADX INFO: renamed from: z */
    private float f58671z = 0.2f;

    /* JADX INFO: renamed from: d */
    private boolean m83117d(int i, int i2) {
        if (this.f58663r == null) {
            C14075d c14075d = new C14075d(true);
            this.f58663r = c14075d;
            c14075d.m82793a(true);
            if (!this.f58663r.mo82796a()) {
                TXCLog.m82966e("TXCBeauty4Filter", "mSkinBlurFilterVertical init failed!!, break init");
                return false;
            }
        }
        if (this.f58664s == null) {
            C14075d c14075d2 = new C14075d(false);
            this.f58664s = c14075d2;
            c14075d2.m82793a(true);
            if (!this.f58664s.mo82796a()) {
                TXCLog.m82966e("TXCBeauty4Filter", "mSkinBlurFilterHorizontal init failed!!, break init");
                return false;
            }
        }
        if (this.f58665t == null) {
            C14073b c14073b = new C14073b();
            this.f58665t = c14073b;
            c14073b.m82793a(true);
            if (!this.f58665t.mo82796a()) {
                TXCLog.m82966e("TXCBeauty4Filter", "mBorderFilter init failed!!, break init");
                return false;
            }
        }
        if (this.f58667v == null) {
            C14075d c14075d3 = new C14075d(true);
            this.f58667v = c14075d3;
            c14075d3.m82793a(true);
            if (!this.f58667v.mo82796a()) {
                TXCLog.m82966e("TXCBeauty4Filter", "mBorderBlurFilterVertical init failed!!, break init");
                return false;
            }
        }
        if (this.f58668w == null) {
            C14075d c14075d4 = new C14075d(false);
            this.f58668w = c14075d4;
            c14075d4.m82793a(true);
            if (!this.f58668w.mo82796a()) {
                TXCLog.m82966e("TXCBeauty4Filter", "mBorderBlurFilterHorizontal init failed!!, break init");
                return false;
            }
        }
        if (this.f58666u == null) {
            C14074c c14074c = new C14074c();
            this.f58666u = c14074c;
            c14074c.m82793a(true);
            if (!this.f58666u.mo82796a()) {
                TXCLog.m82966e("TXCBeauty4Filter", "mSmoothFilter init failed!!, break init");
                return false;
            }
        }
        this.f58666u.m83120a(360.0f, 640.0f);
        this.f58666u.m83119a(this.f58669x);
        this.f58666u.m83121b(this.f58670y);
        this.f58666u.m83122c(this.f58671z);
        mo82786a(i, i2);
        return true;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        super.mo82786a(i, i2);
        this.f58172e = i;
        this.f58173f = i2;
        this.f58663r.mo82786a(i, i2);
        this.f58664s.mo82786a(i, i2);
        this.f58665t.mo82786a(i, i2);
        this.f58667v.mo82786a(i, i2);
        this.f58668w.mo82786a(i, i2);
        this.f58666u.mo82786a(i, i2);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        if (this.f58669x <= 0.0f && this.f58670y <= 0.0f && this.f58671z <= 0.0f) {
            return i;
        }
        int iMo82798b = this.f58664s.mo82798b(this.f58663r.mo82798b(i));
        return this.f58666u.mo82784a(i, iMo82798b, this.f58668w.mo82798b(this.f58667v.mo82798b(this.f58665t.m83158c(i, iMo82798b))));
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: c */
    public void mo83092c(int i) {
        float f = i / 10.0f;
        this.f58669x = f;
        C14074c c14074c = this.f58666u;
        if (c14074c != null) {
            c14074c.m83119a(f);
        }
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: e */
    public void mo83095e(int i) {
        float f = i / 10.0f;
        this.f58671z = f;
        C14074c c14074c = this.f58666u;
        if (c14074c != null) {
            c14074c.m83122c(f);
        }
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: f */
    public void mo83096f(int i) {
        this.f58666u.m83123d(i / 10.0f);
    }

    /* JADX INFO: renamed from: q */
    public void m83118q() {
        C14075d c14075d = this.f58663r;
        if (c14075d != null) {
            c14075d.mo82807e();
            this.f58663r = null;
        }
        C14075d c14075d2 = this.f58664s;
        if (c14075d2 != null) {
            c14075d2.mo82807e();
            this.f58664s = null;
        }
        C14073b c14073b = this.f58665t;
        if (c14073b != null) {
            c14073b.mo82807e();
            this.f58665t = null;
        }
        C14074c c14074c = this.f58666u;
        if (c14074c != null) {
            c14074c.mo82807e();
            this.f58666u = null;
        }
        C14075d c14075d3 = this.f58667v;
        if (c14075d3 != null) {
            c14075d3.mo82807e();
            this.f58667v = null;
        }
        C14075d c14075d4 = this.f58668w;
        if (c14075d4 != null) {
            c14075d4.mo82807e();
            this.f58668w = null;
        }
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: c */
    public boolean mo83093c(int i, int i2) {
        this.f58172e = i;
        this.f58173f = i2;
        return m83117d(i, i2);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        super.mo82807e();
        m83118q();
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: d */
    public void mo83094d(int i) {
        float f = i / 10.0f;
        this.f58670y = f;
        C14074c c14074c = this.f58666u;
        if (c14074c != null) {
            c14074c.m83121b(f);
        }
    }
}
