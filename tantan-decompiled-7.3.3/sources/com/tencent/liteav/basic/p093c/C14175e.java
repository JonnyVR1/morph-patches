package com.tencent.liteav.basic.p093c;

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
public class C14175e implements HandlerC14177g.a {

    /* JADX INFO: renamed from: a */
    private volatile HandlerThread f58956a = null;

    /* JADX INFO: renamed from: b */
    private volatile HandlerC14177g f58957b = null;

    /* JADX INFO: renamed from: c */
    private C14178h f58958c = null;

    /* JADX INFO: renamed from: d */
    private int f58959d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f58960e = false;

    /* JADX INFO: renamed from: f */
    private float f58961f = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f58962g = 1.0f;

    /* JADX INFO: renamed from: h */
    private int f58963h = 0;

    /* JADX INFO: renamed from: i */
    private int f58964i = 0;

    /* JADX INFO: renamed from: j */
    private int f58965j = 0;

    /* JADX INFO: renamed from: k */
    private int f58966k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f58967l = false;

    /* JADX INFO: renamed from: m */
    private InterfaceC14185o f58968m = null;

    /* JADX INFO: renamed from: n */
    private boolean f58969n = false;

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX INFO: renamed from: a */
    private void m83918a(int i, int i2) {
        C14175e c14175e;
        int i3;
        int i4;
        int i5;
        if (this.f58967l) {
            int i6 = this.f58965j;
            if (i6 == 0 || (i3 = this.f58966k) == 0) {
                c14175e = this;
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
                final InterfaceC14185o interfaceC14185o = this.f58968m;
                if (interfaceC14185o != null) {
                    c14175e = this;
                    final int i8 = i5;
                    final int i9 = i4;
                    new Thread(new Runnable() { // from class: com.tencent.liteav.basic.c.e.4
                        @Override // java.lang.Runnable
                        public void run() {
                            byteBufferAllocate.position(0);
                            bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                            Matrix matrix = new Matrix();
                            matrix.setScale(1.0f, -1.0f);
                            interfaceC14185o.onTakePhotoComplete(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i8, i9, matrix, false));
                            bitmapCreateBitmap.recycle();
                        }
                    }).start();
                } else {
                    c14175e = this;
                }
            }
            c14175e.f58968m = null;
            c14175e.f58967l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83922b(int i, boolean z, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        int i7;
        boolean z4;
        boolean z5;
        if (i5 == 0 || i6 == 0 || this.f58958c == null) {
            return;
        }
        int i8 = 0;
        if (this.f58969n) {
            this.f58969n = false;
            return;
        }
        int i9 = 16640;
        if (z2) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glBindFramebuffer(36160, 0);
            if (this.f58957b != null) {
                this.f58957b.m83963c();
            }
            this.f58969n = true;
        }
        int i10 = i3 != 0 ? i3 : i5;
        int i11 = i4 != 0 ? i4 : i6;
        int i12 = this.f58963h;
        if (i12 != 0 && i12 == 1) {
            int i13 = (720 - this.f58959d) % 360;
            boolean z6 = i13 == 90 || i13 == 270;
            i9 = 16640;
            int[] iArrM83920a = m83920a(i10, i11, z6 ? i6 : i5, z6 ? i5 : i6);
            int i14 = iArrM83920a[0];
            int i15 = iArrM83920a[1];
            int i16 = iArrM83920a[2];
            i7 = iArrM83920a[3];
            i10 = i14;
            i11 = i15;
            i8 = i16;
        } else {
            i7 = i8;
        }
        this.f58965j = i10;
        this.f58966k = i11;
        GLES20.glViewport(i8, i7, i10, i11);
        int i17 = this.f58964i;
        boolean z7 = (i17 != 1 ? !(i17 == 2 && z3) : z3) ? z : !z;
        float f = i11 != 0 ? i10 / i11 : 1.0f;
        float f2 = i6 != 0 ? i5 / i6 : 1.0f;
        if (this.f58960e == z7 && this.f58959d == i2 && this.f58961f == f && this.f58962g == f2) {
            i8 = i8;
        } else {
            this.f58960e = z7;
            this.f58959d = i2;
            this.f58961f = f;
            this.f58962g = f2;
            int i18 = (720 - i2) % 360;
            boolean z8 = i18 == 90 || i18 == 270;
            int i19 = z8 ? i11 : i10;
            if (!z8) {
                i10 = i11;
            }
            C14178h c14178h = this.f58958c;
            float[] fArrM84020a = C14182l.m84020a(EnumC14181k.NORMAL, false, true);
            float f3 = i19 / i10;
            boolean z9 = z8 ? false : this.f58960e;
            if (z8) {
                z5 = this.f58960e;
                z4 = z9;
            } else {
                z4 = z9;
                z5 = false;
            }
            c14178h.m83970a(i5, i6, i18, fArrM84020a, f3, z4, z5);
            C14178h c14178h2 = this.f58958c;
            if (z8) {
                c14178h2.m83992g();
            } else {
                c14178h2.m83993h();
            }
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(i9);
        GLES20.glBindFramebuffer(36160, 0);
        this.f58958c.m83966a(i);
        m83918a(i8, i7);
        if (this.f58957b != null) {
            this.f58957b.m83963c();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m83925f() {
        synchronized (this) {
            try {
                if (this.f58957b != null) {
                    HandlerC14177g.m83954a(this.f58957b, this.f58956a);
                    TXCLog.m84156w("TXGLSurfaceRenderThread", "surface-render: destroy gl thread");
                }
                this.f58957b = null;
                this.f58956a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.p093c.HandlerC14177g.a
    /* JADX INFO: renamed from: c */
    public void mo83934c() {
        C14178h c14178h = new C14178h();
        this.f58958c = c14178h;
        if (c14178h.mo83979a()) {
            this.f58958c.m83978a(C14182l.f59081e, C14182l.m84020a(EnumC14181k.NORMAL, false, false));
        }
    }

    @Override // com.tencent.liteav.basic.p093c.HandlerC14177g.a
    /* JADX INFO: renamed from: d */
    public void mo83935d() {
    }

    @Override // com.tencent.liteav.basic.p093c.HandlerC14177g.a
    /* JADX INFO: renamed from: e */
    public void mo83936e() {
        C14178h c14178h = this.f58958c;
        if (c14178h != null) {
            c14178h.mo83989d();
            this.f58958c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m83924c(int i) {
        synchronized (this) {
            try {
                if (this.f58957b != null) {
                    this.f58957b.sendEmptyMessage(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83930a(Object obj, Surface surface) {
        TXCLog.m84152i("TXGLSurfaceRenderThread", "surface-render: surface render start " + surface + ", " + this);
        m83923b(obj, surface);
    }

    /* JADX INFO: renamed from: a */
    public void m83926a() {
        TXCLog.m84152i("TXGLSurfaceRenderThread", "surface-render: surface render stop " + this);
        m83925f();
    }

    /* JADX INFO: renamed from: a */
    public void m83927a(final int i) {
        m83931a(new Runnable() { // from class: com.tencent.liteav.basic.c.e.1
            @Override // java.lang.Runnable
            public void run() {
                C14175e.this.f58963h = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83931a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f58957b != null) {
                    this.f58957b.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83928a(final int i, final boolean z, final int i2, final int i3, final int i4, final int i5, final int i6, final boolean z2, final boolean z3) {
        GLES20.glFinish();
        synchronized (this) {
            try {
                if (this.f58957b != null) {
                    this.f58957b.post(new Runnable() { // from class: com.tencent.liteav.basic.c.e.3
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                C14175e.this.m83922b(i, z, i2, i3, i4, i5, i6, z2, z3);
                            } catch (Exception e) {
                                TXCLog.m84149e("TXGLSurfaceRenderThread", "surface-render: render texture error occurred!" + e.getMessage());
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
    public void m83929a(InterfaceC14185o interfaceC14185o) {
        this.f58968m = interfaceC14185o;
        this.f58967l = true;
    }

    /* JADX INFO: renamed from: a */
    private int[] m83920a(int i, int i2, int i3, int i4) {
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
    public Surface m83932b() {
        Surface surfaceM83962b;
        synchronized (this) {
            try {
                surfaceM83962b = this.f58957b != null ? this.f58957b.m83962b() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return surfaceM83962b;
    }

    /* JADX INFO: renamed from: b */
    public void m83933b(final int i) {
        m83931a(new Runnable() { // from class: com.tencent.liteav.basic.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                C14175e.this.f58964i = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m83923b(Object obj, Surface surface) {
        m83925f();
        synchronized (this) {
            try {
                this.f58956a = new HandlerThread("TXGLSurfaceRenderThread");
                this.f58956a.start();
                this.f58957b = new HandlerC14177g(this.f58956a.getLooper());
                this.f58957b.m83961a(this);
                if (obj != null && !(obj instanceof EGLContext)) {
                    this.f58957b.f59007d = true;
                    this.f58957b.f59009f = (android.opengl.EGLContext) obj;
                } else {
                    this.f58957b.f59007d = false;
                    this.f58957b.f59011h = (EGLContext) obj;
                }
                this.f58957b.f59006c = surface;
                TXCLog.m84156w("TXGLSurfaceRenderThread", "surface-render: create gl thread " + this.f58956a.getName());
            } catch (Throwable th) {
                throw th;
            }
        }
        m83924c(100);
    }
}
