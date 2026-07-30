package com.tencent.liteav.basic.p088c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14012e implements HandlerC14014g.a {

    /* JADX INFO: renamed from: a */
    private volatile HandlerThread f58108a = null;

    /* JADX INFO: renamed from: b */
    private volatile HandlerC14014g f58109b = null;

    /* JADX INFO: renamed from: c */
    private C14015h f58110c = null;

    /* JADX INFO: renamed from: d */
    private int f58111d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f58112e = false;

    /* JADX INFO: renamed from: f */
    private float f58113f = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f58114g = 1.0f;

    /* JADX INFO: renamed from: h */
    private int f58115h = 0;

    /* JADX INFO: renamed from: i */
    private int f58116i = 0;

    /* JADX INFO: renamed from: j */
    private int f58117j = 0;

    /* JADX INFO: renamed from: k */
    private int f58118k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f58119l = false;

    /* JADX INFO: renamed from: m */
    private InterfaceC14022o f58120m = null;

    /* JADX INFO: renamed from: n */
    private boolean f58121n = false;

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX INFO: renamed from: a */
    private void m82735a(int i, int i2) {
        C14012e c14012e;
        int i3;
        int i4;
        int i5;
        if (this.f58119l) {
            int i6 = this.f58117j;
            if (i6 == 0 || (i3 = this.f58118k) == 0) {
                c14012e = this;
            } else {
                boolean z = i6 <= i3;
                int i7 = i3 >= i6 ? i3 : i6;
                if (i3 < i6) {
                    i6 = i3;
                }
                if (z) {
                    i5 = i6;
                    i4 = i7;
                } else {
                    i4 = i6;
                    i5 = i7;
                }
                final ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i5 * i4 * 4);
                final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i4, Bitmap.Config.ARGB_8888);
                byteBufferAllocate.position(0);
                GLES20.glReadPixels(i, i2, i5, i4, 6408, 5121, byteBufferAllocate);
                final InterfaceC14022o interfaceC14022o = this.f58120m;
                if (interfaceC14022o != null) {
                    c14012e = this;
                    final int i8 = i5;
                    final int i9 = i4;
                    new Thread(new Runnable() { // from class: com.tencent.liteav.basic.c.e.4
                        @Override // java.lang.Runnable
                        public void run() {
                            byteBufferAllocate.position(0);
                            bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                            Matrix matrix = new Matrix();
                            matrix.setScale(1.0f, -1.0f);
                            interfaceC14022o.onTakePhotoComplete(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i8, i9, matrix, false));
                            bitmapCreateBitmap.recycle();
                        }
                    }).start();
                } else {
                    c14012e = this;
                }
            }
            c14012e.f58120m = null;
            c14012e.f58119l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82739b(int i, boolean z, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        int i7;
        boolean z4;
        boolean z5;
        if (i5 == 0 || i6 == 0 || this.f58110c == null) {
            return;
        }
        int i8 = 0;
        if (this.f58121n) {
            this.f58121n = false;
            return;
        }
        int i9 = 16640;
        if (z2) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glBindFramebuffer(36160, 0);
            if (this.f58109b != null) {
                this.f58109b.m82780c();
            }
            this.f58121n = true;
        }
        int i10 = i3 != 0 ? i3 : i5;
        int i11 = i4 != 0 ? i4 : i6;
        int i12 = this.f58115h;
        if (i12 != 0 && i12 == 1) {
            int i13 = (720 - this.f58111d) % 360;
            boolean z6 = i13 == 90 || i13 == 270;
            i9 = 16640;
            int[] iArrM82737a = m82737a(i10, i11, z6 ? i6 : i5, z6 ? i5 : i6);
            int i14 = iArrM82737a[0];
            int i15 = iArrM82737a[1];
            int i16 = iArrM82737a[2];
            i7 = iArrM82737a[3];
            i10 = i14;
            i11 = i15;
            i8 = i16;
        } else {
            i7 = i8;
        }
        this.f58117j = i10;
        this.f58118k = i11;
        GLES20.glViewport(i8, i7, i10, i11);
        int i17 = this.f58116i;
        boolean z7 = (i17 != 1 ? !(i17 == 2 && z3) : z3) ? z : !z;
        float f = i11 != 0 ? i10 / i11 : 1.0f;
        float f2 = i6 != 0 ? i5 / i6 : 1.0f;
        if (this.f58112e == z7 && this.f58111d == i2 && this.f58113f == f && this.f58114g == f2) {
            i8 = i8;
        } else {
            this.f58112e = z7;
            this.f58111d = i2;
            this.f58113f = f;
            this.f58114g = f2;
            int i18 = (720 - i2) % 360;
            boolean z8 = i18 == 90 || i18 == 270;
            int i19 = z8 ? i11 : i10;
            if (!z8) {
                i10 = i11;
            }
            C14015h c14015h = this.f58110c;
            float[] fArrM82837a = C14019l.m82837a(EnumC14018k.NORMAL, false, true);
            float f3 = i19 / i10;
            boolean z9 = z8 ? false : this.f58112e;
            if (z8) {
                z5 = this.f58112e;
                z4 = z9;
            } else {
                z4 = z9;
                z5 = false;
            }
            c14015h.m82787a(i5, i6, i18, fArrM82837a, f3, z4, z5);
            C14015h c14015h2 = this.f58110c;
            if (z8) {
                c14015h2.m82809g();
            } else {
                c14015h2.m82810h();
            }
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(i9);
        GLES20.glBindFramebuffer(36160, 0);
        this.f58110c.m82783a(i);
        m82735a(i8, i7);
        if (this.f58109b != null) {
            this.f58109b.m82780c();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m82742f() {
        synchronized (this) {
            try {
                if (this.f58109b != null) {
                    HandlerC14014g.m82771a(this.f58109b, this.f58108a);
                    TXCLog.m82973w("TXGLSurfaceRenderThread", "surface-render: destroy gl thread");
                }
                this.f58109b = null;
                this.f58108a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.p088c.HandlerC14014g.a
    /* JADX INFO: renamed from: c */
    public void mo82751c() {
        C14015h c14015h = new C14015h();
        this.f58110c = c14015h;
        if (c14015h.mo82796a()) {
            this.f58110c.m82795a(C14019l.f58233e, C14019l.m82837a(EnumC14018k.NORMAL, false, false));
        }
    }

    @Override // com.tencent.liteav.basic.p088c.HandlerC14014g.a
    /* JADX INFO: renamed from: d */
    public void mo82752d() {
    }

    @Override // com.tencent.liteav.basic.p088c.HandlerC14014g.a
    /* JADX INFO: renamed from: e */
    public void mo82753e() {
        C14015h c14015h = this.f58110c;
        if (c14015h != null) {
            c14015h.mo82806d();
            this.f58110c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m82741c(int i) {
        synchronized (this) {
            try {
                if (this.f58109b != null) {
                    this.f58109b.sendEmptyMessage(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82747a(Object obj, Surface surface) {
        TXCLog.m82969i("TXGLSurfaceRenderThread", "surface-render: surface render start " + surface + ", " + this);
        m82740b(obj, surface);
    }

    /* JADX INFO: renamed from: a */
    public void m82743a() {
        TXCLog.m82969i("TXGLSurfaceRenderThread", "surface-render: surface render stop " + this);
        m82742f();
    }

    /* JADX INFO: renamed from: a */
    public void m82744a(final int i) {
        m82748a(new Runnable() { // from class: com.tencent.liteav.basic.c.e.1
            @Override // java.lang.Runnable
            public void run() {
                C14012e.this.f58115h = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m82748a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f58109b != null) {
                    this.f58109b.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82745a(final int i, final boolean z, final int i2, final int i3, final int i4, final int i5, final int i6, final boolean z2, final boolean z3) {
        GLES20.glFinish();
        synchronized (this) {
            try {
                if (this.f58109b != null) {
                    this.f58109b.post(new Runnable() { // from class: com.tencent.liteav.basic.c.e.3
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                C14012e.this.m82739b(i, z, i2, i3, i4, i5, i6, z2, z3);
                            } catch (Exception e) {
                                TXCLog.m82966e("TXGLSurfaceRenderThread", "surface-render: render texture error occurred!" + e.getMessage());
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82746a(InterfaceC14022o interfaceC14022o) {
        this.f58120m = interfaceC14022o;
        this.f58119l = true;
    }

    /* JADX INFO: renamed from: a */
    private int[] m82737a(int i, int i2, int i3, int i4) {
        int i5;
        float f = i2;
        float f2 = i;
        float f3 = i4 / i3;
        int i6 = 0;
        if (f / f2 > f3) {
            int i7 = (int) (f2 * f3);
            int i8 = (i2 - i7) / 2;
            i2 = i7;
            i5 = i8;
        } else {
            int i9 = (int) (f / f3);
            int i10 = (i - i9) / 2;
            i = i9;
            i5 = 0;
            i6 = i10;
        }
        return new int[]{i, i2, i6, i5};
    }

    /* JADX INFO: renamed from: b */
    public Surface m82749b() {
        Surface surfaceM82779b;
        synchronized (this) {
            try {
                surfaceM82779b = this.f58109b != null ? this.f58109b.m82779b() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return surfaceM82779b;
    }

    /* JADX INFO: renamed from: b */
    public void m82750b(final int i) {
        m82748a(new Runnable() { // from class: com.tencent.liteav.basic.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                C14012e.this.f58116i = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m82740b(Object obj, Surface surface) {
        m82742f();
        synchronized (this) {
            try {
                this.f58108a = new HandlerThread("TXGLSurfaceRenderThread");
                this.f58108a.start();
                this.f58109b = new HandlerC14014g(this.f58108a.getLooper());
                this.f58109b.m82778a(this);
                if (obj != null && !(obj instanceof EGLContext)) {
                    this.f58109b.f58159d = true;
                    this.f58109b.f58161f = (android.opengl.EGLContext) obj;
                } else {
                    this.f58109b.f58159d = false;
                    this.f58109b.f58163h = (EGLContext) obj;
                }
                this.f58109b.f58158c = surface;
                TXCLog.m82973w("TXGLSurfaceRenderThread", "surface-render: create gl thread " + this.f58108a.getName());
            } catch (Throwable th) {
                throw th;
            }
        }
        m82741c(100);
    }
}
