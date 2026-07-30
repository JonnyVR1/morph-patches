package com.tencent.liteav.p102c;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14171a;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.C14180j;
import com.tencent.liteav.basic.p093c.C14182l;
import com.tencent.liteav.basic.p095e.C14190a;
import com.tencent.liteav.beauty.C14263d;
import com.tencent.liteav.beauty.InterfaceC14264e;
import com.tencent.liteav.beauty.p098b.C14250o;
import com.tencent.liteav.beauty.p098b.C14260y;

/* JADX INFO: renamed from: com.tencent.liteav.c.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14267a {

    /* JADX INFO: renamed from: f */
    private C14260y f59907f = null;

    /* JADX INFO: renamed from: a */
    C14178h f59902a = null;

    /* JADX INFO: renamed from: b */
    C14178h f59903b = null;

    /* JADX INFO: renamed from: g */
    private C14250o f59908g = null;

    /* JADX INFO: renamed from: h */
    private final int f59909h = 2;

    /* JADX INFO: renamed from: i */
    private final int f59910i = 3;

    /* JADX INFO: renamed from: j */
    private int f59911j = 0;

    /* JADX INFO: renamed from: k */
    private int f59912k = 0;

    /* JADX INFO: renamed from: l */
    private int f59913l = 0;

    /* JADX INFO: renamed from: m */
    private int f59914m = 0;

    /* JADX INFO: renamed from: n */
    private C14171a f59915n = null;

    /* JADX INFO: renamed from: o */
    private float[] f59916o = {0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    protected C14180j.a[] f59904c = null;

    /* JADX INFO: renamed from: d */
    protected C14180j.a f59905d = null;

    /* JADX INFO: renamed from: e */
    protected int[] f59906e = null;

    /* JADX INFO: renamed from: p */
    private InterfaceC14264e f59917p = null;

    /* JADX INFO: renamed from: q */
    private String f59918q = "CombineVideoFilter";

    /* JADX INFO: renamed from: b */
    private void m84555b(int i, int i2) {
        if (this.f59902a == null) {
            C14178h c14178h = new C14178h();
            this.f59902a = c14178h;
            c14178h.m83976a(true);
            if (!this.f59902a.mo83979a()) {
                TXCLog.m84149e(this.f59918q, "mOutputFilter.init failed!");
                return;
            }
        }
        C14178h c14178h2 = this.f59902a;
        if (c14178h2 != null) {
            c14178h2.mo83969a(i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84557c(int i, int i2) {
        if (this.f59907f == null) {
            C14260y c14260y = new C14260y();
            this.f59907f = c14260y;
            c14260y.m83976a(true);
            if (!this.f59907f.mo83979a()) {
                TXCLog.m84149e(this.f59918q, "TXCGPUWatermarkTextureFilter.init failed!");
                return;
            }
        }
        C14260y c14260y2 = this.f59907f;
        if (c14260y2 != null) {
            c14260y2.mo83969a(i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m84559d(int i, int i2) {
        if (this.f59903b == null) {
            C14178h c14178h = new C14178h();
            this.f59903b = c14178h;
            c14178h.m83976a(true);
            if (!this.f59903b.mo83979a()) {
                TXCLog.m84149e(this.f59918q, "mCropFilter.init failed!");
                return false;
            }
        }
        C14178h c14178h2 = this.f59903b;
        if (c14178h2 != null) {
            c14178h2.mo83969a(i, i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m84560a(C14190a[] c14190aArr, int i) {
        int i2;
        C14171a c14171a;
        if (c14190aArr == null || this.f59911j <= 0 || this.f59912k <= 0) {
            Log.e(this.f59918q, "frames or canvaceSize if null!");
            return -1;
        }
        m84553a(c14190aArr);
        if (this.f59907f != null) {
            i2 = 0;
            for (int i3 = 0; i3 < c14190aArr.length; i3++) {
                GLES20.glBindFramebuffer(36160, this.f59904c[i3].f59068a[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                C14263d.f[] fVarArr = {new C14263d.f()};
                C14263d.f fVar = fVarArr[0];
                C14190a c14190a = c14190aArr[i3];
                fVar.f59874e = c14190a.f59254a;
                C14171a c14171a2 = c14190a.f59259f;
                int i4 = c14171a2.f58929c;
                fVar.f59875f = i4;
                fVar.f59876g = c14171a2.f58930d;
                float f = c14171a2.f58927a * 1.0f;
                int i5 = this.f59911j;
                fVar.f59871b = f / i5;
                fVar.f59872c = (c14171a2.f58928b * 1.0f) / this.f59912k;
                fVar.f59873d = (i4 * 1.0f) / i5;
                C14190a.a aVar = c14190a.f59258e;
                if (aVar != null) {
                    this.f59907f.m84348a(aVar.f59260a);
                    this.f59907f.m84349c(c14190aArr[i3].f59258e.f59261b);
                }
                this.f59907f.m83897a(fVarArr);
                GLES20.glViewport(0, 0, this.f59911j, this.f59912k);
                C14260y c14260y = this.f59907f;
                if (i3 == 0) {
                    c14260y.m83966a(this.f59905d.f59069b[0]);
                } else {
                    c14260y.m83966a(this.f59904c[i3 - 1].f59069b[0]);
                }
                GLES20.glBindFramebuffer(36160, 0);
                i2 = i3;
            }
        } else {
            i2 = 0;
        }
        int iMo83981b = this.f59904c[i2].f59069b[0];
        int i6 = this.f59911j;
        int i7 = this.f59912k;
        if (this.f59903b != null && (c14171a = this.f59915n) != null) {
            GLES20.glViewport(0, 0, c14171a.f58929c, c14171a.f58930d);
            iMo83981b = this.f59903b.mo83981b(iMo83981b);
        }
        if (this.f59902a != null) {
            GLES20.glViewport(0, 0, this.f59913l, this.f59914m);
            iMo83981b = this.f59902a.mo83981b(iMo83981b);
            i6 = this.f59913l;
            i7 = this.f59914m;
        }
        int i8 = iMo83981b;
        int i9 = i6;
        int i10 = i7;
        InterfaceC14264e interfaceC14264e = this.f59917p;
        if (interfaceC14264e != null) {
            interfaceC14264e.mo84462a(i8, i9, i10, i);
        }
        return i8;
    }

    /* JADX INFO: renamed from: b */
    private void m84554b() {
        C14178h c14178h = this.f59902a;
        if (c14178h != null) {
            c14178h.mo83989d();
            this.f59902a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84556c() {
        C14178h c14178h = this.f59903b;
        if (c14178h != null) {
            c14178h.mo83989d();
            this.f59903b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m84558d() {
        C14260y c14260y = this.f59907f;
        if (c14260y != null) {
            c14260y.mo83989d();
            this.f59907f = null;
        }
        m84554b();
        C14178h c14178h = this.f59903b;
        if (c14178h != null) {
            c14178h.mo83989d();
            this.f59903b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84563a(C14171a c14171a) {
        this.f59915n = c14171a;
    }

    /* JADX INFO: renamed from: a */
    public void m84562a(int i, int i2) {
        if (i > 0 && i2 > 0 && (i != this.f59911j || i2 != this.f59912k)) {
            C14180j.m84015a(this.f59904c);
            this.f59904c = null;
        }
        this.f59911j = i;
        this.f59912k = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m84561a() {
        C14180j.m84015a(this.f59904c);
        this.f59904c = null;
        m84558d();
        C14180j.a aVar = this.f59905d;
        if (aVar != null) {
            C14180j.m84010a(aVar);
            this.f59905d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84552a(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        C14180j.a[] aVarArr = this.f59904c;
        if (aVarArr == null || i3 != aVarArr.length) {
            C14180j.m84015a(aVarArr);
            this.f59904c = null;
            this.f59904c = C14180j.m84016a((C14180j.a[]) null, i3, i, i2);
            if (this.f59906e == null) {
                int[] iArr = new int[1];
                this.f59906e = iArr;
                iArr[0] = C14180j.m84005a(i, i2, 6408, 6408, iArr);
            }
            C14180j.a aVar = this.f59905d;
            if (aVar != null) {
                C14180j.m84010a(aVar);
                this.f59905d = null;
            }
            C14180j.a aVar2 = this.f59905d;
            if (aVar2 == null) {
                this.f59905d = C14180j.m84011a(aVar2, i, i2);
            }
            if (this.f59908g != null) {
                GLES20.glBindFramebuffer(36160, this.f59905d.f59068a[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                this.f59908g.m84334b(this.f59916o);
                this.f59908g.m83966a(-1);
                GLES20.glBindFramebuffer(36160, 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84553a(C14190a[] c14190aArr) {
        int i;
        m84557c(this.f59911j, this.f59912k);
        if (this.f59908g == null) {
            C14250o c14250o = new C14250o();
            this.f59908g = c14250o;
            if (!c14250o.mo83979a()) {
                TXCLog.m84149e(this.f59918q, "mCropFilter.init failed!");
                return;
            }
        }
        C14250o c14250o2 = this.f59908g;
        if (c14250o2 != null) {
            c14250o2.mo83969a(this.f59911j, this.f59912k);
        }
        m84552a(this.f59911j, this.f59912k, c14190aArr.length);
        C14171a c14171a = this.f59915n;
        if (c14171a != null) {
            m84559d(c14171a.f58929c, c14171a.f58930d);
            C14178h c14178h = this.f59903b;
            if (c14178h != null) {
                this.f59903b.m83978a(C14182l.f59081e, c14178h.m83980a(this.f59911j, this.f59912k, null, this.f59915n, 0));
            }
        } else {
            m84556c();
        }
        int i2 = this.f59913l;
        if (i2 <= 0 || (i = this.f59914m) <= 0) {
            return;
        }
        m84555b(i2, i);
    }
}
