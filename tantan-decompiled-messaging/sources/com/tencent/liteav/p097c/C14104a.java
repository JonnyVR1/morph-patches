package com.tencent.liteav.p097c;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14008a;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.C14017j;
import com.tencent.liteav.basic.p088c.C14019l;
import com.tencent.liteav.basic.p090e.C14027a;
import com.tencent.liteav.beauty.C14100d;
import com.tencent.liteav.beauty.InterfaceC14101e;
import com.tencent.liteav.beauty.p093b.C14087o;
import com.tencent.liteav.beauty.p093b.C14097y;

/* JADX INFO: renamed from: com.tencent.liteav.c.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14104a {

    /* JADX INFO: renamed from: f */
    private C14097y f59059f = null;

    /* JADX INFO: renamed from: a */
    C14015h f59054a = null;

    /* JADX INFO: renamed from: b */
    C14015h f59055b = null;

    /* JADX INFO: renamed from: g */
    private C14087o f59060g = null;

    /* JADX INFO: renamed from: h */
    private final int f59061h = 2;

    /* JADX INFO: renamed from: i */
    private final int f59062i = 3;

    /* JADX INFO: renamed from: j */
    private int f59063j = 0;

    /* JADX INFO: renamed from: k */
    private int f59064k = 0;

    /* JADX INFO: renamed from: l */
    private int f59065l = 0;

    /* JADX INFO: renamed from: m */
    private int f59066m = 0;

    /* JADX INFO: renamed from: n */
    private C14008a f59067n = null;

    /* JADX INFO: renamed from: o */
    private float[] f59068o = {0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    protected C14017j.a[] f59056c = null;

    /* JADX INFO: renamed from: d */
    protected C14017j.a f59057d = null;

    /* JADX INFO: renamed from: e */
    protected int[] f59058e = null;

    /* JADX INFO: renamed from: p */
    private InterfaceC14101e f59069p = null;

    /* JADX INFO: renamed from: q */
    private String f59070q = "CombineVideoFilter";

    /* JADX INFO: renamed from: b */
    private void m83372b(int i, int i2) {
        if (this.f59054a == null) {
            C14015h c14015h = new C14015h();
            this.f59054a = c14015h;
            c14015h.m82793a(true);
            if (!this.f59054a.mo82796a()) {
                TXCLog.m82966e(this.f59070q, "mOutputFilter.init failed!");
                return;
            }
        }
        C14015h c14015h2 = this.f59054a;
        if (c14015h2 != null) {
            c14015h2.mo82786a(i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m83374c(int i, int i2) {
        if (this.f59059f == null) {
            C14097y c14097y = new C14097y();
            this.f59059f = c14097y;
            c14097y.m82793a(true);
            if (!this.f59059f.mo82796a()) {
                TXCLog.m82966e(this.f59070q, "TXCGPUWatermarkTextureFilter.init failed!");
                return;
            }
        }
        C14097y c14097y2 = this.f59059f;
        if (c14097y2 != null) {
            c14097y2.mo82786a(i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m83376d(int i, int i2) {
        if (this.f59055b == null) {
            C14015h c14015h = new C14015h();
            this.f59055b = c14015h;
            c14015h.m82793a(true);
            if (!this.f59055b.mo82796a()) {
                TXCLog.m82966e(this.f59070q, "mCropFilter.init failed!");
                return false;
            }
        }
        C14015h c14015h2 = this.f59055b;
        if (c14015h2 != null) {
            c14015h2.mo82786a(i, i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m83377a(C14027a[] c14027aArr, int i) {
        int i2;
        C14008a c14008a;
        if (c14027aArr == null || this.f59063j <= 0 || this.f59064k <= 0) {
            Log.e(this.f59070q, "frames or canvaceSize if null!");
            return -1;
        }
        m83370a(c14027aArr);
        if (this.f59059f != null) {
            i2 = 0;
            for (int i3 = 0; i3 < c14027aArr.length; i3++) {
                GLES20.glBindFramebuffer(36160, this.f59056c[i3].f58220a[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                C14100d.f[] fVarArr = {new C14100d.f()};
                C14100d.f fVar = fVarArr[0];
                C14027a c14027a = c14027aArr[i3];
                fVar.f59026e = c14027a.f58406a;
                C14008a c14008a2 = c14027a.f58411f;
                int i4 = c14008a2.f58081c;
                fVar.f59027f = i4;
                fVar.f59028g = c14008a2.f58082d;
                float f = c14008a2.f58079a * 1.0f;
                int i5 = this.f59063j;
                fVar.f59023b = f / i5;
                fVar.f59024c = (c14008a2.f58080b * 1.0f) / this.f59064k;
                fVar.f59025d = (i4 * 1.0f) / i5;
                C14027a.a aVar = c14027a.f58410e;
                if (aVar != null) {
                    this.f59059f.m83165a(aVar.f58412a);
                    this.f59059f.m83166c(c14027aArr[i3].f58410e.f58413b);
                }
                this.f59059f.m82714a(fVarArr);
                GLES20.glViewport(0, 0, this.f59063j, this.f59064k);
                C14097y c14097y = this.f59059f;
                if (i3 == 0) {
                    c14097y.m82783a(this.f59057d.f58221b[0]);
                } else {
                    c14097y.m82783a(this.f59056c[i3 - 1].f58221b[0]);
                }
                GLES20.glBindFramebuffer(36160, 0);
                i2 = i3;
            }
        } else {
            i2 = 0;
        }
        int iMo82798b = this.f59056c[i2].f58221b[0];
        int i6 = this.f59063j;
        int i7 = this.f59064k;
        if (this.f59055b != null && (c14008a = this.f59067n) != null) {
            GLES20.glViewport(0, 0, c14008a.f58081c, c14008a.f58082d);
            iMo82798b = this.f59055b.mo82798b(iMo82798b);
        }
        if (this.f59054a != null) {
            GLES20.glViewport(0, 0, this.f59065l, this.f59066m);
            iMo82798b = this.f59054a.mo82798b(iMo82798b);
            i6 = this.f59065l;
            i7 = this.f59066m;
        }
        int i8 = iMo82798b;
        int i9 = i6;
        int i10 = i7;
        InterfaceC14101e interfaceC14101e = this.f59069p;
        if (interfaceC14101e != null) {
            interfaceC14101e.mo83279a(i8, i9, i10, i);
        }
        return i8;
    }

    /* JADX INFO: renamed from: b */
    private void m83371b() {
        C14015h c14015h = this.f59054a;
        if (c14015h != null) {
            c14015h.mo82806d();
            this.f59054a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m83373c() {
        C14015h c14015h = this.f59055b;
        if (c14015h != null) {
            c14015h.mo82806d();
            this.f59055b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m83375d() {
        C14097y c14097y = this.f59059f;
        if (c14097y != null) {
            c14097y.mo82806d();
            this.f59059f = null;
        }
        m83371b();
        C14015h c14015h = this.f59055b;
        if (c14015h != null) {
            c14015h.mo82806d();
            this.f59055b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83380a(C14008a c14008a) {
        this.f59067n = c14008a;
    }

    /* JADX INFO: renamed from: a */
    public void m83379a(int i, int i2) {
        if (i > 0 && i2 > 0 && (i != this.f59063j || i2 != this.f59064k)) {
            C14017j.m82832a(this.f59056c);
            this.f59056c = null;
        }
        this.f59063j = i;
        this.f59064k = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m83378a() {
        C14017j.m82832a(this.f59056c);
        this.f59056c = null;
        m83375d();
        C14017j.a aVar = this.f59057d;
        if (aVar != null) {
            C14017j.m82827a(aVar);
            this.f59057d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83369a(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        C14017j.a[] aVarArr = this.f59056c;
        if (aVarArr == null || i3 != aVarArr.length) {
            C14017j.m82832a(aVarArr);
            this.f59056c = null;
            this.f59056c = C14017j.m82833a((C14017j.a[]) null, i3, i, i2);
            if (this.f59058e == null) {
                int[] iArr = new int[1];
                this.f59058e = iArr;
                iArr[0] = C14017j.m82822a(i, i2, 6408, 6408, iArr);
            }
            C14017j.a aVar = this.f59057d;
            if (aVar != null) {
                C14017j.m82827a(aVar);
                this.f59057d = null;
            }
            C14017j.a aVar2 = this.f59057d;
            if (aVar2 == null) {
                this.f59057d = C14017j.m82828a(aVar2, i, i2);
            }
            if (this.f59060g != null) {
                GLES20.glBindFramebuffer(36160, this.f59057d.f58220a[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                this.f59060g.m83151b(this.f59068o);
                this.f59060g.m82783a(-1);
                GLES20.glBindFramebuffer(36160, 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83370a(C14027a[] c14027aArr) {
        int i;
        m83374c(this.f59063j, this.f59064k);
        if (this.f59060g == null) {
            C14087o c14087o = new C14087o();
            this.f59060g = c14087o;
            if (!c14087o.mo82796a()) {
                TXCLog.m82966e(this.f59070q, "mCropFilter.init failed!");
                return;
            }
        }
        C14087o c14087o2 = this.f59060g;
        if (c14087o2 != null) {
            c14087o2.mo82786a(this.f59063j, this.f59064k);
        }
        m83369a(this.f59063j, this.f59064k, c14027aArr.length);
        C14008a c14008a = this.f59067n;
        if (c14008a != null) {
            m83376d(c14008a.f58081c, c14008a.f58082d);
            C14015h c14015h = this.f59055b;
            if (c14015h != null) {
                this.f59055b.m82795a(C14019l.f58233e, c14015h.m82797a(this.f59063j, this.f59064k, null, this.f59067n, 0));
            }
        } else {
            m83373c();
        }
        int i2 = this.f59065l;
        if (i2 <= 0 || (i = this.f59066m) <= 0) {
            return;
        }
        m83372b(i2, i);
    }
}
