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
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.C14180j;
import com.tencent.liteav.basic.p093c.C14182l;
import com.tencent.liteav.basic.p093c.EnumC14181k;
import com.tencent.liteav.basic.p093c.InterfaceC14183m;
import com.tencent.liteav.basic.p093c.InterfaceC14184n;
import com.tencent.liteav.basic.p093c.InterfaceC14185o;
import com.tencent.liteav.basic.util.C14215f;
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
public class TXCGLSurfaceView extends TXCGLSurfaceViewBase implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer, InterfaceC14183m {

    /* JADX INFO: renamed from: A */
    private InterfaceC14185o f60455A;

    /* JADX INFO: renamed from: B */
    private int f60456B;

    /* JADX INFO: renamed from: C */
    private int f60457C;

    /* JADX INFO: renamed from: D */
    private boolean f60458D;

    /* JADX INFO: renamed from: E */
    private boolean f60459E;

    /* JADX INFO: renamed from: F */
    private InterfaceC14184n f60460F;

    /* JADX INFO: renamed from: G */
    private long f60461G;

    /* JADX INFO: renamed from: H */
    private byte[] f60462H;

    /* JADX INFO: renamed from: I */
    private long f60463I;

    /* JADX INFO: renamed from: J */
    private int f60464J;

    /* JADX INFO: renamed from: K */
    private int f60465K;

    /* JADX INFO: renamed from: L */
    private final Queue<Runnable> f60466L;

    /* JADX INFO: renamed from: a */
    WeakReference<InterfaceC14170b> f60467a;

    /* JADX INFO: renamed from: g */
    private SurfaceTexture f60468g;

    /* JADX INFO: renamed from: h */
    private EGLContext f60469h;

    /* JADX INFO: renamed from: i */
    private C14178h f60470i;

    /* JADX INFO: renamed from: j */
    private int[] f60471j;

    /* JADX INFO: renamed from: k */
    private float[] f60472k;

    /* JADX INFO: renamed from: l */
    private int f60473l;

    /* JADX INFO: renamed from: m */
    private boolean f60474m;

    /* JADX INFO: renamed from: n */
    private float f60475n;

    /* JADX INFO: renamed from: o */
    private float f60476o;

    /* JADX INFO: renamed from: p */
    private int f60477p;

    /* JADX INFO: renamed from: q */
    private long f60478q;

    /* JADX INFO: renamed from: r */
    private long f60479r;

    /* JADX INFO: renamed from: s */
    private int f60480s;

    /* JADX INFO: renamed from: t */
    private boolean f60481t;

    /* JADX INFO: renamed from: u */
    private boolean f60482u;

    /* JADX INFO: renamed from: v */
    private Object f60483v;

    /* JADX INFO: renamed from: w */
    private Handler f60484w;

    /* JADX INFO: renamed from: x */
    private int f60485x;

    /* JADX INFO: renamed from: y */
    private int f60486y;

    /* JADX INFO: renamed from: z */
    private boolean f60487z;

    public TXCGLSurfaceView(Context context) {
        super(context);
        this.f60472k = new float[16];
        this.f60473l = 0;
        this.f60474m = false;
        this.f60475n = 1.0f;
        this.f60476o = 1.0f;
        this.f60477p = 20;
        this.f60478q = 0L;
        this.f60479r = 0L;
        this.f60480s = CommandMessage.COMMAND_BASE;
        this.f60481t = true;
        this.f60482u = false;
        this.f60483v = new Object();
        this.f60485x = 0;
        this.f60486y = 0;
        this.f60487z = true;
        this.f60455A = null;
        this.f60456B = 0;
        this.f60457C = 0;
        this.f60458D = true;
        this.f60459E = true;
        this.f60462H = null;
        this.f60463I = 0L;
        this.f60464J = 0;
        this.f60465K = 0;
        this.f60466L = new LinkedList();
        setEGLContextClientVersion(2);
        m84979a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    /* JADX INFO: renamed from: g */
    private void m84963g() {
        boolean z = this.f60459E;
        SurfaceTexture surfaceTexture = this.f60468g;
        if (!z) {
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
            }
        } else if (surfaceTexture != null) {
            if (this.f60484w == null) {
                HandlerThread handlerThread = new HandlerThread("VideoCaptureThread");
                handlerThread.start();
                this.f60484w = new Handler(handlerThread.getLooper());
            }
            this.f60468g.setOnFrameAvailableListener(this, this.f60484w);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83950a(int i, boolean z, int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        if (this.f60470i == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f60503c) {
                    return;
                }
                GLES20.glClear(16640);
                int width = getWidth();
                int height = getHeight();
                int i7 = this.f60456B;
                if (i7 != 0 && i7 == 1) {
                    int i8 = (720 - i2) % 360;
                    boolean z3 = i8 == 90 || i8 == 270;
                    int[] iArrM84959a = m84959a(width, height, z3 ? i4 : i3, z3 ? i3 : i4);
                    int i9 = iArrM84959a[0];
                    int i10 = iArrM84959a[1];
                    i5 = iArrM84959a[2];
                    i6 = iArrM84959a[3];
                    width = i9;
                    height = i10;
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                this.f60485x = width;
                this.f60486y = height;
                GLES20.glViewport(i5, i6, width, height);
                int i11 = this.f60457C;
                boolean z4 = (i11 != 1 ? !(i11 == 2 && z2) : z2) ? z : !z;
                float f = height != 0 ? width / height : 1.0f;
                float f2 = i4 != 0 ? i3 / i4 : 1.0f;
                if (this.f60474m != z4 || this.f60473l != i2 || this.f60475n != f || this.f60476o != f2 || this.f60458D != z2) {
                    this.f60474m = z4;
                    this.f60473l = i2;
                    this.f60475n = f;
                    this.f60476o = f2;
                    this.f60458D = z2;
                    int i12 = (720 - i2) % 360;
                    boolean z5 = i12 == 90 || i12 == 270;
                    int i13 = z5 ? height : width;
                    if (!z5) {
                        width = height;
                    }
                    this.f60470i.m83970a(i3, i4, i12, C14182l.m84020a(EnumC14181k.NORMAL, false, true), i13 / width, z5 ? false : this.f60474m, z5 ? this.f60474m : false);
                    C14178h c14178h = this.f60470i;
                    if (z5) {
                        c14178h.m83992g();
                    } else {
                        c14178h.m83993h();
                    }
                }
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
                this.f60470i.m83966a(i);
                m84956a(i5, i6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    /* JADX INFO: renamed from: b */
    public void mo84965b() {
        TXCLog.m84152i("TXCGLSurfaceView", "onSurfaceDestroyed-->enter with mSurfaceTextureListener:" + this.f60460F);
        InterfaceC14184n interfaceC14184n = this.f60460F;
        if (interfaceC14184n != null) {
            interfaceC14184n.mo84024b(this.f60468g);
        }
        SurfaceTexture surfaceTexture = this.f60468g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f60468g = null;
        }
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    /* JADX INFO: renamed from: c */
    public int mo84967c() {
        if (this.f60480s != 12288) {
            TXCLog.m84149e("TXCGLSurfaceView", "background capture swapbuffer error : " + this.f60480s);
        }
        return this.f60480s;
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public EGLContext getGLContext() {
        return this.f60469h;
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public SurfaceTexture getSurfaceTexture() {
        return this.f60468g;
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f60484w;
        if (handler != null) {
            handler.getLooper().quitSafely();
            this.f60484w = null;
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
        int iM84982e;
        m84958a(this.f60466L);
        boolean z4 = true;
        while (true) {
            jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.f60479r;
            if (j2 == 0 || jCurrentTimeMillis < j2) {
                this.f60479r = jCurrentTimeMillis;
            }
            j = this.f60479r;
            if (jCurrentTimeMillis - j >= (this.f60478q * 1000) / ((long) this.f60477p)) {
                break;
            }
            m84957a(15L);
            z4 = false;
        }
        if (jCurrentTimeMillis - j > 1000) {
            this.f60478q = 1L;
            this.f60479r = System.currentTimeMillis();
            z = true;
        } else {
            z = false;
        }
        if (this.f60481t) {
            return;
        }
        try {
            synchronized (this) {
                try {
                    bArr = null;
                    if (this.f60482u) {
                        byte[] bArr2 = this.f60462H;
                        if (bArr2 != null) {
                            this.f60462H = null;
                            SurfaceTexture surfaceTexture = this.f60468g;
                            if (surfaceTexture != null) {
                                surfaceTexture.updateTexImage();
                                this.f60468g.getTransformMatrix(this.f60472k);
                            }
                            bArr = bArr2;
                        } else {
                            SurfaceTexture surfaceTexture2 = this.f60468g;
                            if (surfaceTexture2 != null) {
                                surfaceTexture2.updateTexImage();
                                this.f60468g.getTransformMatrix(this.f60472k);
                            }
                        }
                        if (z) {
                            this.f60478q = 1L;
                        } else {
                            this.f60478q++;
                        }
                        this.f60482u = false;
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
                    m84957a(5L);
                    return;
                }
                return;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            double d = jCurrentTimeMillis2;
            long j3 = this.f60463I;
            if (d > j3 + 1000.0d) {
                this.f60464J = ((int) ((((double) this.f60465K) * 1000.0d) / (jCurrentTimeMillis2 - j3))) + 1;
                this.f60463I = jCurrentTimeMillis2;
                this.f60465K = 0;
            }
            this.f60465K++;
            InterfaceC14184n interfaceC14184n = this.f60460F;
            if (interfaceC14184n != null) {
                if (bArr != null) {
                    interfaceC14184n.mo84023a(bArr, this.f60472k);
                } else {
                    interfaceC14184n.mo84021a(this.f60471j[0], this.f60472k);
                }
            }
            synchronized (this) {
                z3 = this.f60503c;
            }
            if (z3 || (iM84982e = m84982e()) == 12288 || System.currentTimeMillis() - this.f60461G <= 2000) {
                return;
            }
            TXCLog.m84156w("TXCGLSurfaceView", "background capture swapBuffer error : " + iM84982e);
            this.f60461G = System.currentTimeMillis();
            Bundle bundle = new Bundle();
            bundle.putInt("EVT_PARAM1", iM84982e);
            bundle.putInt("EVT_ID", 2110);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Failed to render video");
            C14215f.m84218a(this.f60467a, 2110, bundle);
        } catch (Exception e) {
            TXCLog.m84150e("TXCGLSurfaceView", "onDrawFrame failed", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f60481t = false;
        synchronized (this) {
            this.f60482u = true;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f60469h = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.f60471j = new int[]{C14180j.m84017b()};
        if (this.f60471j[0] <= 0) {
            this.f60471j = null;
            TXCLog.m84149e("TXCGLSurfaceView", "create oes texture error!! at glsurfaceview");
            return;
        }
        this.f60468g = new SurfaceTexture(this.f60471j[0]);
        m84963g();
        C14178h c14178h = new C14178h();
        this.f60470i = c14178h;
        if (c14178h.mo83979a()) {
            this.f60470i.m83978a(C14182l.f59081e, C14182l.m84020a(EnumC14181k.NORMAL, false, false));
            InterfaceC14184n interfaceC14184n = this.f60460F;
            if (interfaceC14184n != null) {
                interfaceC14184n.mo84022a(this.f60468g);
            }
        }
    }

    public void setFPS(final int i) {
        m84966b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f60477p = i;
                int i2 = TXCGLSurfaceView.this.f60477p;
                TXCGLSurfaceView tXCGLSurfaceView = TXCGLSurfaceView.this;
                if (i2 <= 0) {
                    tXCGLSurfaceView.f60477p = 1;
                } else if (tXCGLSurfaceView.f60477p > 60) {
                    TXCGLSurfaceView.this.f60477p = 60;
                }
                TXCGLSurfaceView.this.f60479r = 0L;
                TXCGLSurfaceView.this.f60478q = 0L;
            }
        });
    }

    public void setNotifyListener(InterfaceC14170b interfaceC14170b) {
        this.f60467a = new WeakReference<>(interfaceC14170b);
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public void setRendMirror(final int i) {
        m84966b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f60457C = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public void setRendMode(final int i) {
        m84966b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f60456B = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    public void setRunInBackground(boolean z) {
        if (!z) {
            m84966b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        TXCLog.m84152i("TXCGLSurfaceView", "background capture exit background");
                        TXCGLSurfaceView.this.f60503c = false;
                    }
                }
            });
            return;
        }
        synchronized (this) {
            TXCLog.m84152i("TXCGLSurfaceView", "background capture enter background");
            this.f60503c = true;
        }
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public void setSurfaceTextureListener(InterfaceC14184n interfaceC14184n) {
        this.f60460F = interfaceC14184n;
    }

    /* JADX INFO: renamed from: b */
    public void m84966b(Runnable runnable) {
        synchronized (this.f60466L) {
            this.f60466L.add(runnable);
        }
    }

    public TXCGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60472k = new float[16];
        this.f60473l = 0;
        this.f60474m = false;
        this.f60475n = 1.0f;
        this.f60476o = 1.0f;
        this.f60477p = 20;
        this.f60478q = 0L;
        this.f60479r = 0L;
        this.f60480s = CommandMessage.COMMAND_BASE;
        this.f60481t = true;
        this.f60482u = false;
        this.f60483v = new Object();
        this.f60485x = 0;
        this.f60486y = 0;
        this.f60487z = true;
        this.f60455A = null;
        this.f60456B = 0;
        this.f60457C = 0;
        this.f60458D = true;
        this.f60459E = true;
        this.f60462H = null;
        this.f60463I = 0L;
        this.f60464J = 0;
        this.f60465K = 0;
        this.f60466L = new LinkedList();
        setEGLContextClientVersion(2);
        m84979a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    /* JADX INFO: renamed from: a */
    public void m84964a(InterfaceC14185o interfaceC14185o) {
        this.f60455A = interfaceC14185o;
        this.f60487z = true;
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83953a(byte[] bArr) {
        synchronized (this) {
            this.f60462H = bArr;
            this.f60481t = false;
            this.f60482u = true;
        }
    }

    /* JADX INFO: renamed from: a */
    private int[] m84959a(int i, int i2, int i3, int i4) {
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

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83949a(int i, boolean z) {
        this.f60477p = i;
        if (i <= 0) {
            this.f60477p = 1;
        } else if (i > 60) {
            this.f60477p = 60;
        }
        this.f60455A = null;
        this.f60487z = false;
        this.f60464J = 0;
        this.f60463I = 0L;
        this.f60465K = 0;
        m84980b(true);
        this.f60459E = z;
        this.f60461G = 0L;
        m84963g();
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83948a() {
        m84980b(false);
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83951a(Runnable runnable) {
        synchronized (this.f60466L) {
            this.f60466L.add(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m84958a(Queue<Runnable> queue) {
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
    private void m84956a(int i, int i2) {
        TXCGLSurfaceView tXCGLSurfaceView;
        int i3;
        int i4;
        int i5;
        if (this.f60487z) {
            int i6 = this.f60485x;
            if (i6 == 0 || (i3 = this.f60486y) == 0) {
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
                final InterfaceC14185o interfaceC14185o = this.f60455A;
                if (interfaceC14185o != null) {
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
                                TXCLog.m84156w("TXCGLSurfaceView", "takePhoto error " + e);
                            } catch (Exception e2) {
                                TXCLog.m84156w("TXCGLSurfaceView", "takePhoto error " + e2);
                            }
                            interfaceC14185o.onTakePhotoComplete(bitmapCreateBitmap2);
                            bitmapCreateBitmap.recycle();
                        }
                    }).start();
                } else {
                    tXCGLSurfaceView = this;
                }
            }
            tXCGLSurfaceView.f60455A = null;
            tXCGLSurfaceView.f60487z = false;
        }
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83952a(boolean z) {
        this.f60481t = true;
        if (z) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            this.f60480s = m84982e();
        }
        synchronized (this) {
            try {
                if (this.f60482u) {
                    this.f60482u = false;
                    SurfaceTexture surfaceTexture = this.f60468g;
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
    private void m84957a(long j) {
        try {
            Thread.sleep(j);
        } catch (Exception unused) {
        }
    }
}
