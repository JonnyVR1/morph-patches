package com.tencent.liteav.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import com.heytap.mcssdk.mode.CommandMessage;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.C14017j;
import com.tencent.liteav.basic.p088c.C14019l;
import com.tencent.liteav.basic.p088c.EnumC14018k;
import com.tencent.liteav.basic.p088c.InterfaceC14020m;
import com.tencent.liteav.basic.p088c.InterfaceC14021n;
import com.tencent.liteav.basic.p088c.InterfaceC14022o;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGLSurfaceView extends TXCGLSurfaceViewBase implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer, InterfaceC14020m {

    /* JADX INFO: renamed from: A */
    private InterfaceC14022o f59607A;

    /* JADX INFO: renamed from: B */
    private int f59608B;

    /* JADX INFO: renamed from: C */
    private int f59609C;

    /* JADX INFO: renamed from: D */
    private boolean f59610D;

    /* JADX INFO: renamed from: E */
    private boolean f59611E;

    /* JADX INFO: renamed from: F */
    private InterfaceC14021n f59612F;

    /* JADX INFO: renamed from: G */
    private long f59613G;

    /* JADX INFO: renamed from: H */
    private byte[] f59614H;

    /* JADX INFO: renamed from: I */
    private long f59615I;

    /* JADX INFO: renamed from: J */
    private int f59616J;

    /* JADX INFO: renamed from: K */
    private int f59617K;

    /* JADX INFO: renamed from: L */
    private final Queue<Runnable> f59618L;

    /* JADX INFO: renamed from: a */
    WeakReference<InterfaceC14007b> f59619a;

    /* JADX INFO: renamed from: g */
    private SurfaceTexture f59620g;

    /* JADX INFO: renamed from: h */
    private EGLContext f59621h;

    /* JADX INFO: renamed from: i */
    private C14015h f59622i;

    /* JADX INFO: renamed from: j */
    private int[] f59623j;

    /* JADX INFO: renamed from: k */
    private float[] f59624k;

    /* JADX INFO: renamed from: l */
    private int f59625l;

    /* JADX INFO: renamed from: m */
    private boolean f59626m;

    /* JADX INFO: renamed from: n */
    private float f59627n;

    /* JADX INFO: renamed from: o */
    private float f59628o;

    /* JADX INFO: renamed from: p */
    private int f59629p;

    /* JADX INFO: renamed from: q */
    private long f59630q;

    /* JADX INFO: renamed from: r */
    private long f59631r;

    /* JADX INFO: renamed from: s */
    private int f59632s;

    /* JADX INFO: renamed from: t */
    private boolean f59633t;

    /* JADX INFO: renamed from: u */
    private boolean f59634u;

    /* JADX INFO: renamed from: v */
    private Object f59635v;

    /* JADX INFO: renamed from: w */
    private Handler f59636w;

    /* JADX INFO: renamed from: x */
    private int f59637x;

    /* JADX INFO: renamed from: y */
    private int f59638y;

    /* JADX INFO: renamed from: z */
    private boolean f59639z;

    public TXCGLSurfaceView(Context context) {
        super(context);
        this.f59624k = new float[16];
        this.f59625l = 0;
        this.f59626m = false;
        this.f59627n = 1.0f;
        this.f59628o = 1.0f;
        this.f59629p = 20;
        this.f59630q = 0L;
        this.f59631r = 0L;
        this.f59632s = CommandMessage.COMMAND_BASE;
        this.f59633t = true;
        this.f59634u = false;
        this.f59635v = new Object();
        this.f59637x = 0;
        this.f59638y = 0;
        this.f59639z = true;
        this.f59607A = null;
        this.f59608B = 0;
        this.f59609C = 0;
        this.f59610D = true;
        this.f59611E = true;
        this.f59614H = null;
        this.f59615I = 0L;
        this.f59616J = 0;
        this.f59617K = 0;
        this.f59618L = new LinkedList();
        setEGLContextClientVersion(2);
        m83796a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    /* JADX INFO: renamed from: g */
    private void m83780g() {
        boolean z = this.f59611E;
        SurfaceTexture surfaceTexture = this.f59620g;
        if (!z) {
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
            }
        } else if (surfaceTexture != null) {
            if (this.f59636w == null) {
                HandlerThread handlerThread = new HandlerThread("VideoCaptureThread");
                handlerThread.start();
                this.f59636w = new Handler(handlerThread.getLooper());
            }
            this.f59620g.setOnFrameAvailableListener(this, this.f59636w);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82767a(int i, boolean z, int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        if (this.f59622i == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f59655c) {
                    return;
                }
                GLES20.glClear(16640);
                int width = getWidth();
                int height = getHeight();
                int i7 = this.f59608B;
                if (i7 != 0 && i7 == 1) {
                    int i8 = (720 - i2) % 360;
                    boolean z3 = i8 == 90 || i8 == 270;
                    int[] iArrM83776a = m83776a(width, height, z3 ? i4 : i3, z3 ? i3 : i4);
                    int i9 = iArrM83776a[0];
                    int i10 = iArrM83776a[1];
                    i5 = iArrM83776a[2];
                    i6 = iArrM83776a[3];
                    width = i9;
                    height = i10;
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                this.f59637x = width;
                this.f59638y = height;
                GLES20.glViewport(i5, i6, width, height);
                int i11 = this.f59609C;
                boolean z4 = (i11 != 1 ? !(i11 == 2 && z2) : z2) ? z : !z;
                float f = height != 0 ? width / height : 1.0f;
                float f2 = i4 != 0 ? i3 / i4 : 1.0f;
                if (this.f59626m != z4 || this.f59625l != i2 || this.f59627n != f || this.f59628o != f2 || this.f59610D != z2) {
                    this.f59626m = z4;
                    this.f59625l = i2;
                    this.f59627n = f;
                    this.f59628o = f2;
                    this.f59610D = z2;
                    int i12 = (720 - i2) % 360;
                    boolean z5 = i12 == 90 || i12 == 270;
                    int i13 = z5 ? height : width;
                    if (!z5) {
                        width = height;
                    }
                    this.f59622i.m82787a(i3, i4, i12, C14019l.m82837a(EnumC14018k.NORMAL, false, true), i13 / width, z5 ? false : this.f59626m, z5 ? this.f59626m : false);
                    C14015h c14015h = this.f59622i;
                    if (z5) {
                        c14015h.m82809g();
                    } else {
                        c14015h.m82810h();
                    }
                }
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
                this.f59622i.m82783a(i);
                m83773a(i5, i6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    /* JADX INFO: renamed from: b */
    public void mo83782b() {
        TXCLog.m82969i("TXCGLSurfaceView", "onSurfaceDestroyed-->enter with mSurfaceTextureListener:" + this.f59612F);
        InterfaceC14021n interfaceC14021n = this.f59612F;
        if (interfaceC14021n != null) {
            interfaceC14021n.mo82841b(this.f59620g);
        }
        SurfaceTexture surfaceTexture = this.f59620g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f59620g = null;
        }
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    /* JADX INFO: renamed from: c */
    public int mo83784c() {
        if (this.f59632s != 12288) {
            TXCLog.m82966e("TXCGLSurfaceView", "background capture swapbuffer error : " + this.f59632s);
        }
        return this.f59632s;
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public EGLContext getGLContext() {
        return this.f59621h;
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public SurfaceTexture getSurfaceTexture() {
        return this.f59620g;
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f59636w;
        if (handler != null) {
            handler.getLooper().quitSafely();
            this.f59636w = null;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        long jCurrentTimeMillis;
        long j;
        boolean z;
        byte[] bArr;
        boolean z2;
        boolean z3;
        int iM83799e;
        m83775a(this.f59618L);
        boolean z4 = true;
        while (true) {
            jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.f59631r;
            if (j2 == 0 || jCurrentTimeMillis < j2) {
                this.f59631r = jCurrentTimeMillis;
            }
            j = this.f59631r;
            if (jCurrentTimeMillis - j >= (this.f59630q * 1000) / ((long) this.f59629p)) {
                break;
            }
            m83774a(15L);
            z4 = false;
        }
        if (jCurrentTimeMillis - j > 1000) {
            this.f59630q = 1L;
            this.f59631r = System.currentTimeMillis();
            z = true;
        } else {
            z = false;
        }
        if (this.f59633t) {
            return;
        }
        try {
            synchronized (this) {
                try {
                    bArr = null;
                    if (this.f59634u) {
                        byte[] bArr2 = this.f59614H;
                        if (bArr2 != null) {
                            this.f59614H = null;
                            SurfaceTexture surfaceTexture = this.f59620g;
                            if (surfaceTexture != null) {
                                surfaceTexture.updateTexImage();
                                this.f59620g.getTransformMatrix(this.f59624k);
                            }
                            bArr = bArr2;
                        } else {
                            SurfaceTexture surfaceTexture2 = this.f59620g;
                            if (surfaceTexture2 != null) {
                                surfaceTexture2.updateTexImage();
                                this.f59620g.getTransformMatrix(this.f59624k);
                            }
                        }
                        if (z) {
                            this.f59630q = 1L;
                        } else {
                            this.f59630q++;
                        }
                        this.f59634u = false;
                        z4 = false;
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (true == z2) {
                if (true == z4) {
                    m83774a(5L);
                    return;
                }
                return;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            double d = jCurrentTimeMillis2;
            long j3 = this.f59615I;
            if (d > j3 + 1000.0d) {
                this.f59616J = ((int) ((((double) this.f59617K) * 1000.0d) / (jCurrentTimeMillis2 - j3))) + 1;
                this.f59615I = jCurrentTimeMillis2;
                this.f59617K = 0;
            }
            this.f59617K++;
            InterfaceC14021n interfaceC14021n = this.f59612F;
            if (interfaceC14021n != null) {
                if (bArr != null) {
                    interfaceC14021n.mo82840a(bArr, this.f59624k);
                } else {
                    interfaceC14021n.mo82838a(this.f59623j[0], this.f59624k);
                }
            }
            synchronized (this) {
                z3 = this.f59655c;
            }
            if (z3 || (iM83799e = m83799e()) == 12288 || System.currentTimeMillis() - this.f59613G <= 2000) {
                return;
            }
            TXCLog.m82973w("TXCGLSurfaceView", "background capture swapBuffer error : " + iM83799e);
            this.f59613G = System.currentTimeMillis();
            Bundle bundle = new Bundle();
            bundle.putInt("EVT_PARAM1", iM83799e);
            bundle.putInt("EVT_ID", 2110);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Failed to render video");
            C14052f.m83035a(this.f59619a, 2110, bundle);
        } catch (Exception e) {
            TXCLog.m82967e("TXCGLSurfaceView", "onDrawFrame failed", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f59633t = false;
        synchronized (this) {
            this.f59634u = true;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f59621h = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.f59623j = new int[]{C14017j.m82834b()};
        if (this.f59623j[0] <= 0) {
            this.f59623j = null;
            TXCLog.m82966e("TXCGLSurfaceView", "create oes texture error!! at glsurfaceview");
            return;
        }
        this.f59620g = new SurfaceTexture(this.f59623j[0]);
        m83780g();
        C14015h c14015h = new C14015h();
        this.f59622i = c14015h;
        if (c14015h.mo82796a()) {
            this.f59622i.m82795a(C14019l.f58233e, C14019l.m82837a(EnumC14018k.NORMAL, false, false));
            InterfaceC14021n interfaceC14021n = this.f59612F;
            if (interfaceC14021n != null) {
                interfaceC14021n.mo82839a(this.f59620g);
            }
        }
    }

    public void setFPS(final int i) {
        m83783b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f59629p = i;
                int i2 = TXCGLSurfaceView.this.f59629p;
                TXCGLSurfaceView tXCGLSurfaceView = TXCGLSurfaceView.this;
                if (i2 <= 0) {
                    tXCGLSurfaceView.f59629p = 1;
                } else if (tXCGLSurfaceView.f59629p > 60) {
                    TXCGLSurfaceView.this.f59629p = 60;
                }
                TXCGLSurfaceView.this.f59631r = 0L;
                TXCGLSurfaceView.this.f59630q = 0L;
            }
        });
    }

    public void setNotifyListener(InterfaceC14007b interfaceC14007b) {
        this.f59619a = new WeakReference<>(interfaceC14007b);
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public void setRendMirror(final int i) {
        m83783b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f59609C = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public void setRendMode(final int i) {
        m83783b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f59608B = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    public void setRunInBackground(boolean z) {
        if (!z) {
            m83783b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        TXCLog.m82969i("TXCGLSurfaceView", "background capture exit background");
                        TXCGLSurfaceView.this.f59655c = false;
                    }
                }
            });
            return;
        }
        synchronized (this) {
            TXCLog.m82969i("TXCGLSurfaceView", "background capture enter background");
            this.f59655c = true;
        }
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public void setSurfaceTextureListener(InterfaceC14021n interfaceC14021n) {
        this.f59612F = interfaceC14021n;
    }

    /* JADX INFO: renamed from: b */
    public void m83783b(Runnable runnable) {
        synchronized (this.f59618L) {
            this.f59618L.add(runnable);
        }
    }

    public TXCGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59624k = new float[16];
        this.f59625l = 0;
        this.f59626m = false;
        this.f59627n = 1.0f;
        this.f59628o = 1.0f;
        this.f59629p = 20;
        this.f59630q = 0L;
        this.f59631r = 0L;
        this.f59632s = CommandMessage.COMMAND_BASE;
        this.f59633t = true;
        this.f59634u = false;
        this.f59635v = new Object();
        this.f59637x = 0;
        this.f59638y = 0;
        this.f59639z = true;
        this.f59607A = null;
        this.f59608B = 0;
        this.f59609C = 0;
        this.f59610D = true;
        this.f59611E = true;
        this.f59614H = null;
        this.f59615I = 0L;
        this.f59616J = 0;
        this.f59617K = 0;
        this.f59618L = new LinkedList();
        setEGLContextClientVersion(2);
        m83796a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    /* JADX INFO: renamed from: a */
    public void m83781a(InterfaceC14022o interfaceC14022o) {
        this.f59607A = interfaceC14022o;
        this.f59639z = true;
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82770a(byte[] bArr) {
        synchronized (this) {
            this.f59614H = bArr;
            this.f59633t = false;
            this.f59634u = true;
        }
    }

    /* JADX INFO: renamed from: a */
    private int[] m83776a(int i, int i2, int i3, int i4) {
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

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82766a(int i, boolean z) {
        this.f59629p = i;
        if (i <= 0) {
            this.f59629p = 1;
        } else if (i > 60) {
            this.f59629p = 60;
        }
        this.f59607A = null;
        this.f59639z = false;
        this.f59616J = 0;
        this.f59615I = 0L;
        this.f59617K = 0;
        m83797b(true);
        this.f59611E = z;
        this.f59613G = 0L;
        m83780g();
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82765a() {
        m83797b(false);
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82768a(Runnable runnable) {
        synchronized (this.f59618L) {
            this.f59618L.add(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m83775a(Queue<Runnable> queue) {
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return false;
                }
                Runnable runnablePoll = queue.poll();
                if (runnablePoll == null) {
                    return false;
                }
                runnablePoll.run();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX INFO: renamed from: a */
    private void m83773a(int i, int i2) {
        TXCGLSurfaceView tXCGLSurfaceView;
        int i3;
        int i4;
        int i5;
        if (this.f59639z) {
            int i6 = this.f59637x;
            if (i6 == 0 || (i3 = this.f59638y) == 0) {
                tXCGLSurfaceView = this;
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
                final InterfaceC14022o interfaceC14022o = this.f59607A;
                if (interfaceC14022o != null) {
                    tXCGLSurfaceView = this;
                    final int i8 = i5;
                    final int i9 = i4;
                    new Thread(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.5
                        @Override // java.lang.Runnable
                        public void run() {
                            Bitmap bitmapCreateBitmap2 = null;
                            try {
                                byteBufferAllocate.position(0);
                                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                                Matrix matrix = new Matrix();
                                matrix.setScale(1.0f, -1.0f);
                                bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i8, i9, matrix, false);
                            } catch (Error e) {
                                TXCLog.m82973w("TXCGLSurfaceView", "takePhoto error " + e);
                            } catch (Exception e2) {
                                TXCLog.m82973w("TXCGLSurfaceView", "takePhoto error " + e2);
                            }
                            interfaceC14022o.onTakePhotoComplete(bitmapCreateBitmap2);
                            bitmapCreateBitmap.recycle();
                        }
                    }).start();
                } else {
                    tXCGLSurfaceView = this;
                }
            }
            tXCGLSurfaceView.f59607A = null;
            tXCGLSurfaceView.f59639z = false;
        }
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82769a(boolean z) {
        this.f59633t = true;
        if (z) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            this.f59632s = m83799e();
        }
        synchronized (this) {
            try {
                if (this.f59634u) {
                    this.f59634u = false;
                    SurfaceTexture surfaceTexture = this.f59620g;
                    if (surfaceTexture != null) {
                        surfaceTexture.updateTexImage();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83774a(long j) {
        try {
            Thread.sleep(j);
        } catch (Exception unused) {
        }
    }
}
