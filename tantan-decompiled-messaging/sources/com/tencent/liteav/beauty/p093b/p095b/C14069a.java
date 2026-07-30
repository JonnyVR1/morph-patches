package com.tencent.liteav.beauty.p093b.p095b;

import android.util.Log;
import com.tencent.liteav.beauty.p093b.C14068b;
import com.tencent.liteav.beauty.p093b.C14091s;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14069a extends C14068b {

    /* JADX INFO: renamed from: r */
    private C14070b f58639r = null;

    /* JADX INFO: renamed from: s */
    private C14091s f58640s = null;

    /* JADX INFO: renamed from: t */
    private String f58641t = "TXCBeauty3Filter";

    /* JADX INFO: renamed from: u */
    private float f58642u = 0.0f;

    /* JADX INFO: renamed from: v */
    private float f58643v = 0.0f;

    /* JADX INFO: renamed from: w */
    private float f58644w = 0.0f;

    /* JADX INFO: renamed from: x */
    private float f58645x = 0.0f;

    /* JADX INFO: renamed from: d */
    private boolean m83104d(int i, int i2) {
        if (this.f58639r == null) {
            C14070b c14070b = new C14070b();
            this.f58639r = c14070b;
            c14070b.m82793a(true);
            if (!this.f58639r.mo82796a()) {
                Log.e(this.f58641t, "m_verticalFilter init failed!!, break init");
                return false;
            }
        }
        this.f58639r.mo82786a(i, i2);
        if (this.f58640s == null) {
            C14091s c14091s = new C14091s();
            this.f58640s = c14091s;
            c14091s.m82793a(true);
            if (!this.f58640s.mo82796a()) {
                Log.e(this.f58641t, "mSharpnessFilter init failed!!, break init");
                return false;
            }
        }
        this.f58640s.mo82786a(i, i2);
        return true;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        if (this.f58172e == i && this.f58173f == i2) {
            return;
        }
        this.f58172e = i;
        this.f58173f = i2;
        m83104d(i, i2);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        if (this.f58642u > 0.0f || this.f58643v > 0.0f || this.f58644w > 0.0f) {
            i = this.f58639r.mo82798b(i);
        }
        return this.f58645x > 0.0f ? this.f58640s.mo82798b(i) : i;
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: c */
    public void mo83092c(int i) {
        float f = i / 10.0f;
        this.f58642u = f;
        C14070b c14070b = this.f58639r;
        if (c14070b != null) {
            c14070b.m83107a(f);
        }
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: e */
    public void mo83095e(int i) {
        float f = i / 10.0f;
        this.f58644w = f;
        C14070b c14070b = this.f58639r;
        if (c14070b != null) {
            c14070b.m83109c(f);
        }
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: f */
    public void mo83096f(int i) {
        float f = i / 20.0f;
        if (Math.abs(this.f58645x - f) < 0.001d) {
            return;
        }
        this.f58645x = f;
        C14091s c14091s = this.f58640s;
        if (c14091s != null) {
            c14091s.m83153a(f);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m83105q() {
        C14070b c14070b = this.f58639r;
        if (c14070b != null) {
            c14070b.mo82807e();
            this.f58639r = null;
        }
        C14091s c14091s = this.f58640s;
        if (c14091s != null) {
            c14091s.mo82807e();
            this.f58640s = null;
        }
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: c */
    public boolean mo83093c(int i, int i2) {
        return m83104d(i, i2);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        super.mo82807e();
        m83105q();
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: d */
    public void mo83094d(int i) {
        float f = i / 10.0f;
        this.f58643v = f;
        C14070b c14070b = this.f58639r;
        if (c14070b != null) {
            c14070b.m83108b(f);
        }
    }
}
