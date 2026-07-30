package com.tencent.liteav.beauty.p098b.p100b;

import android.util.Log;
import com.tencent.liteav.beauty.p098b.C14231b;
import com.tencent.liteav.beauty.p098b.C14254s;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14232a extends C14231b {

    /* JADX INFO: renamed from: r */
    private C14233b f59487r = null;

    /* JADX INFO: renamed from: s */
    private C14254s f59488s = null;

    /* JADX INFO: renamed from: t */
    private String f59489t = "TXCBeauty3Filter";

    /* JADX INFO: renamed from: u */
    private float f59490u = 0.0f;

    /* JADX INFO: renamed from: v */
    private float f59491v = 0.0f;

    /* JADX INFO: renamed from: w */
    private float f59492w = 0.0f;

    /* JADX INFO: renamed from: x */
    private float f59493x = 0.0f;

    /* JADX INFO: renamed from: d */
    private boolean m84287d(int i, int i2) {
        if (this.f59487r == null) {
            C14233b c14233b = new C14233b();
            this.f59487r = c14233b;
            c14233b.m83976a(true);
            if (!this.f59487r.mo83979a()) {
                Log.e(this.f59489t, "m_verticalFilter init failed!!, break init");
                return false;
            }
        }
        this.f59487r.mo83969a(i, i2);
        if (this.f59488s == null) {
            C14254s c14254s = new C14254s();
            this.f59488s = c14254s;
            c14254s.m83976a(true);
            if (!this.f59488s.mo83979a()) {
                Log.e(this.f59489t, "mSharpnessFilter init failed!!, break init");
                return false;
            }
        }
        this.f59488s.mo83969a(i, i2);
        return true;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        if (this.f59020e == i && this.f59021f == i2) {
            return;
        }
        this.f59020e = i;
        this.f59021f = i2;
        m84287d(i, i2);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        if (this.f59490u > 0.0f || this.f59491v > 0.0f || this.f59492w > 0.0f) {
            i = this.f59487r.mo83981b(i);
        }
        return this.f59493x > 0.0f ? this.f59488s.mo83981b(i) : i;
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: c */
    public void mo84275c(int i) {
        float f = i / 10.0f;
        this.f59490u = f;
        C14233b c14233b = this.f59487r;
        if (c14233b != null) {
            c14233b.m84290a(f);
        }
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: e */
    public void mo84278e(int i) {
        float f = i / 10.0f;
        this.f59492w = f;
        C14233b c14233b = this.f59487r;
        if (c14233b != null) {
            c14233b.m84292c(f);
        }
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: f */
    public void mo84279f(int i) {
        float f = i / 20.0f;
        if (Math.abs(this.f59493x - f) < 0.001d) {
            return;
        }
        this.f59493x = f;
        C14254s c14254s = this.f59488s;
        if (c14254s != null) {
            c14254s.m84336a(f);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m84288q() {
        C14233b c14233b = this.f59487r;
        if (c14233b != null) {
            c14233b.mo83990e();
            this.f59487r = null;
        }
        C14254s c14254s = this.f59488s;
        if (c14254s != null) {
            c14254s.mo83990e();
            this.f59488s = null;
        }
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: c */
    public boolean mo84276c(int i, int i2) {
        return m84287d(i, i2);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        super.mo83990e();
        m84288q();
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: d */
    public void mo84277d(int i) {
        float f = i / 10.0f;
        this.f59491v = f;
        C14233b c14233b = this.f59487r;
        if (c14233b != null) {
            c14233b.m84291b(f);
        }
    }
}
