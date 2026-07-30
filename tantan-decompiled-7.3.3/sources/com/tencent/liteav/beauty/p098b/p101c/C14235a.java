package com.tencent.liteav.beauty.p098b.p101c;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.p098b.C14231b;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14235a extends C14231b {

    /* JADX INFO: renamed from: r */
    private C14238d f59511r = null;

    /* JADX INFO: renamed from: s */
    private C14238d f59512s = null;

    /* JADX INFO: renamed from: t */
    private C14236b f59513t = null;

    /* JADX INFO: renamed from: u */
    private C14237c f59514u = null;

    /* JADX INFO: renamed from: v */
    private C14238d f59515v = null;

    /* JADX INFO: renamed from: w */
    private C14238d f59516w = null;

    /* JADX INFO: renamed from: x */
    private float f59517x = 0.2f;

    /* JADX INFO: renamed from: y */
    private float f59518y = 0.2f;

    /* JADX INFO: renamed from: z */
    private float f59519z = 0.2f;

    /* JADX INFO: renamed from: d */
    private boolean m84300d(int i, int i2) {
        if (this.f59511r == null) {
            C14238d c14238d = new C14238d(true);
            this.f59511r = c14238d;
            c14238d.m83976a(true);
            if (!this.f59511r.mo83979a()) {
                TXCLog.m84149e("TXCBeauty4Filter", "mSkinBlurFilterVertical init failed!!, break init");
                return false;
            }
        }
        if (this.f59512s == null) {
            C14238d c14238d2 = new C14238d(false);
            this.f59512s = c14238d2;
            c14238d2.m83976a(true);
            if (!this.f59512s.mo83979a()) {
                TXCLog.m84149e("TXCBeauty4Filter", "mSkinBlurFilterHorizontal init failed!!, break init");
                return false;
            }
        }
        if (this.f59513t == null) {
            C14236b c14236b = new C14236b();
            this.f59513t = c14236b;
            c14236b.m83976a(true);
            if (!this.f59513t.mo83979a()) {
                TXCLog.m84149e("TXCBeauty4Filter", "mBorderFilter init failed!!, break init");
                return false;
            }
        }
        if (this.f59515v == null) {
            C14238d c14238d3 = new C14238d(true);
            this.f59515v = c14238d3;
            c14238d3.m83976a(true);
            if (!this.f59515v.mo83979a()) {
                TXCLog.m84149e("TXCBeauty4Filter", "mBorderBlurFilterVertical init failed!!, break init");
                return false;
            }
        }
        if (this.f59516w == null) {
            C14238d c14238d4 = new C14238d(false);
            this.f59516w = c14238d4;
            c14238d4.m83976a(true);
            if (!this.f59516w.mo83979a()) {
                TXCLog.m84149e("TXCBeauty4Filter", "mBorderBlurFilterHorizontal init failed!!, break init");
                return false;
            }
        }
        if (this.f59514u == null) {
            C14237c c14237c = new C14237c();
            this.f59514u = c14237c;
            c14237c.m83976a(true);
            if (!this.f59514u.mo83979a()) {
                TXCLog.m84149e("TXCBeauty4Filter", "mSmoothFilter init failed!!, break init");
                return false;
            }
        }
        this.f59514u.m84303a(360.0f, 640.0f);
        this.f59514u.m84302a(this.f59517x);
        this.f59514u.m84304b(this.f59518y);
        this.f59514u.m84305c(this.f59519z);
        mo83969a(i, i2);
        return true;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        super.mo83969a(i, i2);
        this.f59020e = i;
        this.f59021f = i2;
        this.f59511r.mo83969a(i, i2);
        this.f59512s.mo83969a(i, i2);
        this.f59513t.mo83969a(i, i2);
        this.f59515v.mo83969a(i, i2);
        this.f59516w.mo83969a(i, i2);
        this.f59514u.mo83969a(i, i2);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        if (this.f59517x <= 0.0f && this.f59518y <= 0.0f && this.f59519z <= 0.0f) {
            return i;
        }
        int iMo83981b = this.f59512s.mo83981b(this.f59511r.mo83981b(i));
        return this.f59514u.mo83967a(i, iMo83981b, this.f59516w.mo83981b(this.f59515v.mo83981b(this.f59513t.m84341c(i, iMo83981b))));
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: c */
    public void mo84275c(int i) {
        float f = i / 10.0f;
        this.f59517x = f;
        C14237c c14237c = this.f59514u;
        if (c14237c != null) {
            c14237c.m84302a(f);
        }
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: e */
    public void mo84278e(int i) {
        float f = i / 10.0f;
        this.f59519z = f;
        C14237c c14237c = this.f59514u;
        if (c14237c != null) {
            c14237c.m84305c(f);
        }
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: f */
    public void mo84279f(int i) {
        this.f59514u.m84306d(i / 10.0f);
    }

    /* JADX INFO: renamed from: q */
    public void m84301q() {
        C14238d c14238d = this.f59511r;
        if (c14238d != null) {
            c14238d.mo83990e();
            this.f59511r = null;
        }
        C14238d c14238d2 = this.f59512s;
        if (c14238d2 != null) {
            c14238d2.mo83990e();
            this.f59512s = null;
        }
        C14236b c14236b = this.f59513t;
        if (c14236b != null) {
            c14236b.mo83990e();
            this.f59513t = null;
        }
        C14237c c14237c = this.f59514u;
        if (c14237c != null) {
            c14237c.mo83990e();
            this.f59514u = null;
        }
        C14238d c14238d3 = this.f59515v;
        if (c14238d3 != null) {
            c14238d3.mo83990e();
            this.f59515v = null;
        }
        C14238d c14238d4 = this.f59516w;
        if (c14238d4 != null) {
            c14238d4.mo83990e();
            this.f59516w = null;
        }
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: c */
    public boolean mo84276c(int i, int i2) {
        this.f59020e = i;
        this.f59021f = i2;
        return m84300d(i, i2);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        super.mo83990e();
        m84301q();
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: d */
    public void mo84277d(int i) {
        float f = i / 10.0f;
        this.f59518y = f;
        C14237c c14237c = this.f59514u;
        if (c14237c != null) {
            c14237c.m84304b(f);
        }
    }
}
