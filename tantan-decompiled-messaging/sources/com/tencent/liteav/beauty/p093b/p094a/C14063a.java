package com.tencent.liteav.beauty.p093b.p094a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.p093b.C14068b;
import com.tencent.liteav.beauty.p093b.C14080h;
import com.tencent.liteav.beauty.p093b.C14090r;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14063a extends C14068b {

    /* JADX INFO: renamed from: r */
    private C14065c f58615r = null;

    /* JADX INFO: renamed from: s */
    private C14066d f58616s = null;

    /* JADX INFO: renamed from: t */
    private C14067e f58617t = null;

    /* JADX INFO: renamed from: u */
    private C14080h f58618u = null;

    /* JADX INFO: renamed from: v */
    private C14090r f58619v = null;

    /* JADX INFO: renamed from: w */
    private C14064b f58620w = null;

    /* JADX INFO: renamed from: x */
    private String f58621x = "TXCBeauty2Filter";

    /* JADX INFO: renamed from: y */
    private int f58622y = 0;

    /* JADX INFO: renamed from: z */
    private int f58623z = 0;

    /* JADX INFO: renamed from: A */
    private int f58606A = 0;

    /* JADX INFO: renamed from: B */
    private float f58607B = 1.0f;

    /* JADX INFO: renamed from: C */
    private final float f58608C = 0.7f;

    /* JADX INFO: renamed from: D */
    private float f58609D = 0.8f;

    /* JADX INFO: renamed from: E */
    private float f58610E = 2.0f;

    /* JADX INFO: renamed from: F */
    private int f58611F = 0;

    /* JADX INFO: renamed from: G */
    private int f58612G = 0;

    /* JADX INFO: renamed from: H */
    private int f58613H = 0;

    /* JADX INFO: renamed from: I */
    private int f58614I = 0;

    /* JADX INFO: renamed from: d */
    private boolean m83090d(int i, int i2) {
        this.f58611F = i;
        this.f58612G = i2;
        this.f58613H = i;
        this.f58614I = i2;
        float f = this.f58610E;
        if (1.0f != f) {
            this.f58613H = (int) (i / f);
            this.f58614I = (int) (i2 / f);
        }
        TXCLog.m82969i(this.f58621x, "mResampleRatio " + this.f58610E + " mResampleWidth " + this.f58613H + " mResampleHeight " + this.f58614I);
        if (this.f58620w == null) {
            C14064b c14064b = new C14064b();
            this.f58620w = c14064b;
            c14064b.m82793a(true);
            if (!this.f58620w.mo82796a()) {
                TXCLog.m82966e(this.f58621x, "mBeautyBlendFilter init failed!!, break init");
                return false;
            }
        }
        this.f58620w.mo82786a(i, i2);
        if (this.f58616s == null) {
            C14066d c14066d = new C14066d();
            this.f58616s = c14066d;
            c14066d.m82793a(true);
            if (!this.f58616s.mo82796a()) {
                TXCLog.m82966e(this.f58621x, "m_horizontalFilter init failed!!, break init");
                return false;
            }
        }
        this.f58616s.mo82786a(this.f58613H, this.f58614I);
        if (this.f58617t == null) {
            C14067e c14067e = new C14067e();
            this.f58617t = c14067e;
            c14067e.m82793a(true);
            this.f58617t.m82802b(1.0f != this.f58610E);
            if (!this.f58617t.mo82796a()) {
                TXCLog.m82966e(this.f58621x, "m_verticalFilter init failed!!, break init");
                return false;
            }
        }
        this.f58617t.mo82786a(this.f58613H, this.f58614I);
        if (this.f58618u == null) {
            C14080h c14080h = new C14080h(1.0f);
            this.f58618u = c14080h;
            c14080h.m82793a(true);
            if (!this.f58618u.mo82796a()) {
                TXCLog.m82966e(this.f58621x, "m_gammaFilter init failed!!, break init");
                return false;
            }
        }
        this.f58618u.mo82786a(this.f58613H, this.f58614I);
        if (this.f58619v == null) {
            C14090r c14090r = new C14090r();
            this.f58619v = c14090r;
            c14090r.m82793a(true);
            if (!this.f58619v.mo82796a()) {
                TXCLog.m82966e(this.f58621x, "mSharpenFilter init failed!!, break init");
                return false;
            }
        }
        this.f58619v.mo82786a(i, i2);
        return true;
    }

    /* JADX INFO: renamed from: g */
    private void m83091g(int i) {
        float f = 1.0f - (i / 50.0f);
        this.f58607B = f;
        C14080h c14080h = this.f58618u;
        if (c14080h != null) {
            c14080h.m83127a(f);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        if (this.f58172e == i && this.f58173f == i2) {
            return;
        }
        this.f58172e = i;
        this.f58173f = i2;
        m83090d(i, i2);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        if (1.0f != this.f58610E) {
            GLES20.glViewport(0, 0, this.f58613H, this.f58614I);
        }
        int iM83158c = this.f58617t.m83158c(this.f58616s.mo82798b(i), i);
        if (1.0f != this.f58610E) {
            GLES20.glViewport(0, 0, this.f58611F, this.f58612G);
        }
        if (this.f58609D > 0.7f) {
            iM83158c = this.f58619v.mo82798b(iM83158c);
        }
        return this.f58620w.m83158c(iM83158c, i);
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: c */
    public void mo83092c(int i) {
        C14067e c14067e = this.f58617t;
        if (c14067e != null) {
            c14067e.m83102a(i / 10.0f);
        }
        this.f58622y = i;
        m83091g(i);
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: e */
    public void mo83095e(int i) {
        C14064b c14064b = this.f58620w;
        if (c14064b != null) {
            c14064b.m83100b(i / 10.0f);
        }
        this.f58606A = i;
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: f */
    public void mo83096f(int i) {
        float f = (i / 12.0f) + 0.7f;
        if (Math.abs(this.f58609D - f) < 0.001d) {
            return;
        }
        this.f58609D = f;
        TXCLog.m82969i(this.f58621x, "set mSharpenLevel " + i);
        C14090r c14090r = this.f58619v;
        if (c14090r != null) {
            c14090r.m83152a(this.f58609D);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m83097q() {
        C14064b c14064b = this.f58620w;
        if (c14064b != null) {
            c14064b.mo82806d();
            this.f58620w = null;
        }
        C14066d c14066d = this.f58616s;
        if (c14066d != null) {
            c14066d.mo82806d();
            this.f58616s = null;
        }
        C14067e c14067e = this.f58617t;
        if (c14067e != null) {
            c14067e.mo82806d();
            this.f58617t = null;
        }
        C14080h c14080h = this.f58618u;
        if (c14080h != null) {
            c14080h.mo82806d();
            this.f58618u = null;
        }
        C14090r c14090r = this.f58619v;
        if (c14090r != null) {
            c14090r.mo82806d();
            this.f58619v = null;
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        super.mo82807e();
        m83097q();
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: c */
    public boolean mo83093c(int i, int i2) {
        return m83090d(i, i2);
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: d */
    public void mo83094d(int i) {
        C14064b c14064b = this.f58620w;
        if (c14064b != null) {
            c14064b.m83099a(i / 10.0f);
        }
        this.f58623z = i;
    }
}
