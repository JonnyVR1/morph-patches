package com.tencent.liteav.beauty.p098b.p099a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.p098b.C14231b;
import com.tencent.liteav.beauty.p098b.C14243h;
import com.tencent.liteav.beauty.p098b.C14253r;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14226a extends C14231b {

    /* JADX INFO: renamed from: r */
    private C14228c f59463r = null;

    /* JADX INFO: renamed from: s */
    private C14229d f59464s = null;

    /* JADX INFO: renamed from: t */
    private C14230e f59465t = null;

    /* JADX INFO: renamed from: u */
    private C14243h f59466u = null;

    /* JADX INFO: renamed from: v */
    private C14253r f59467v = null;

    /* JADX INFO: renamed from: w */
    private C14227b f59468w = null;

    /* JADX INFO: renamed from: x */
    private String f59469x = "TXCBeauty2Filter";

    /* JADX INFO: renamed from: y */
    private int f59470y = 0;

    /* JADX INFO: renamed from: z */
    private int f59471z = 0;

    /* JADX INFO: renamed from: A */
    private int f59454A = 0;

    /* JADX INFO: renamed from: B */
    private float f59455B = 1.0f;

    /* JADX INFO: renamed from: C */
    private final float f59456C = 0.7f;

    /* JADX INFO: renamed from: D */
    private float f59457D = 0.8f;

    /* JADX INFO: renamed from: E */
    private float f59458E = 2.0f;

    /* JADX INFO: renamed from: F */
    private int f59459F = 0;

    /* JADX INFO: renamed from: G */
    private int f59460G = 0;

    /* JADX INFO: renamed from: H */
    private int f59461H = 0;

    /* JADX INFO: renamed from: I */
    private int f59462I = 0;

    /* JADX INFO: renamed from: d */
    private boolean m84273d(int i, int i2) {
        this.f59459F = i;
        this.f59460G = i2;
        this.f59461H = i;
        this.f59462I = i2;
        float f = this.f59458E;
        if (1.0f != f) {
            this.f59461H = (int) (i / f);
            this.f59462I = (int) (i2 / f);
        }
        TXCLog.m84152i(this.f59469x, "mResampleRatio " + this.f59458E + " mResampleWidth " + this.f59461H + " mResampleHeight " + this.f59462I);
        if (this.f59468w == null) {
            C14227b c14227b = new C14227b();
            this.f59468w = c14227b;
            c14227b.m83976a(true);
            if (!this.f59468w.mo83979a()) {
                TXCLog.m84149e(this.f59469x, "mBeautyBlendFilter init failed!!, break init");
                return false;
            }
        }
        this.f59468w.mo83969a(i, i2);
        if (this.f59464s == null) {
            C14229d c14229d = new C14229d();
            this.f59464s = c14229d;
            c14229d.m83976a(true);
            if (!this.f59464s.mo83979a()) {
                TXCLog.m84149e(this.f59469x, "m_horizontalFilter init failed!!, break init");
                return false;
            }
        }
        this.f59464s.mo83969a(this.f59461H, this.f59462I);
        if (this.f59465t == null) {
            C14230e c14230e = new C14230e();
            this.f59465t = c14230e;
            c14230e.m83976a(true);
            this.f59465t.m83985b(1.0f != this.f59458E);
            if (!this.f59465t.mo83979a()) {
                TXCLog.m84149e(this.f59469x, "m_verticalFilter init failed!!, break init");
                return false;
            }
        }
        this.f59465t.mo83969a(this.f59461H, this.f59462I);
        if (this.f59466u == null) {
            C14243h c14243h = new C14243h(1.0f);
            this.f59466u = c14243h;
            c14243h.m83976a(true);
            if (!this.f59466u.mo83979a()) {
                TXCLog.m84149e(this.f59469x, "m_gammaFilter init failed!!, break init");
                return false;
            }
        }
        this.f59466u.mo83969a(this.f59461H, this.f59462I);
        if (this.f59467v == null) {
            C14253r c14253r = new C14253r();
            this.f59467v = c14253r;
            c14253r.m83976a(true);
            if (!this.f59467v.mo83979a()) {
                TXCLog.m84149e(this.f59469x, "mSharpenFilter init failed!!, break init");
                return false;
            }
        }
        this.f59467v.mo83969a(i, i2);
        return true;
    }

    /* JADX INFO: renamed from: g */
    private void m84274g(int i) {
        float f = 1.0f - (i / 50.0f);
        this.f59455B = f;
        C14243h c14243h = this.f59466u;
        if (c14243h != null) {
            c14243h.m84310a(f);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        if (this.f59020e == i && this.f59021f == i2) {
            return;
        }
        this.f59020e = i;
        this.f59021f = i2;
        m84273d(i, i2);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        if (1.0f != this.f59458E) {
            GLES20.glViewport(0, 0, this.f59461H, this.f59462I);
        }
        int iM84341c = this.f59465t.m84341c(this.f59464s.mo83981b(i), i);
        if (1.0f != this.f59458E) {
            GLES20.glViewport(0, 0, this.f59459F, this.f59460G);
        }
        if (this.f59457D > 0.7f) {
            iM84341c = this.f59467v.mo83981b(iM84341c);
        }
        return this.f59468w.m84341c(iM84341c, i);
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: c */
    public void mo84275c(int i) {
        C14230e c14230e = this.f59465t;
        if (c14230e != null) {
            c14230e.m84285a(i / 10.0f);
        }
        this.f59470y = i;
        m84274g(i);
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: e */
    public void mo84278e(int i) {
        C14227b c14227b = this.f59468w;
        if (c14227b != null) {
            c14227b.m84283b(i / 10.0f);
        }
        this.f59454A = i;
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: f */
    public void mo84279f(int i) {
        float f = (i / 12.0f) + 0.7f;
        if (Math.abs(this.f59457D - f) < 0.001d) {
            return;
        }
        this.f59457D = f;
        TXCLog.m84152i(this.f59469x, "set mSharpenLevel " + i);
        C14253r c14253r = this.f59467v;
        if (c14253r != null) {
            c14253r.m84335a(this.f59457D);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m84280q() {
        C14227b c14227b = this.f59468w;
        if (c14227b != null) {
            c14227b.mo83989d();
            this.f59468w = null;
        }
        C14229d c14229d = this.f59464s;
        if (c14229d != null) {
            c14229d.mo83989d();
            this.f59464s = null;
        }
        C14230e c14230e = this.f59465t;
        if (c14230e != null) {
            c14230e.mo83989d();
            this.f59465t = null;
        }
        C14243h c14243h = this.f59466u;
        if (c14243h != null) {
            c14243h.mo83989d();
            this.f59466u = null;
        }
        C14253r c14253r = this.f59467v;
        if (c14253r != null) {
            c14253r.mo83989d();
            this.f59467v = null;
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        super.mo83990e();
        m84280q();
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: c */
    public boolean mo84276c(int i, int i2) {
        return m84273d(i, i2);
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: d */
    public void mo84277d(int i) {
        C14227b c14227b = this.f59468w;
        if (c14227b != null) {
            c14227b.m84282a(i / 10.0f);
        }
        this.f59471z = i;
    }
}
