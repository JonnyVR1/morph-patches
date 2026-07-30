package com.tencent.liteav.basic.p093c;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Message;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14176f implements HandlerC14177g.a, InterfaceC14183m {

    /* JADX INFO: renamed from: d */
    private InterfaceC14184n f58993d;

    /* JADX INFO: renamed from: b */
    private volatile HandlerThread f58991b = null;

    /* JADX INFO: renamed from: c */
    private volatile HandlerC14177g f58992c = null;

    /* JADX INFO: renamed from: e */
    private int[] f58994e = null;

    /* JADX INFO: renamed from: f */
    private SurfaceTexture f58995f = null;

    /* JADX INFO: renamed from: g */
    private boolean f58996g = false;

    /* JADX INFO: renamed from: a */
    public int f58990a = 25;

    /* JADX INFO: renamed from: h */
    private long f58997h = 0;

    /* JADX INFO: renamed from: i */
    private long f58998i = 0;

    /* JADX INFO: renamed from: j */
    private float[] f58999j = new float[16];

    /* JADX INFO: renamed from: b */
    private void m83943b() {
        m83944f();
        synchronized (this) {
            this.f58991b = new HandlerThread("TXGLSurfaceTextureThread");
            this.f58991b.start();
            this.f58992c = new HandlerC14177g(this.f58991b.getLooper());
            this.f58992c.m83961a(this);
            this.f58992c.f59004a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
            this.f58992c.f59005b = 720;
            TXCLog.m84156w("TXGLSurfaceTextureThread", "create gl thread " + this.f58991b.getName());
        }
        m83937a(100);
    }

    /* JADX INFO: renamed from: f */
    private void m83944f() {
        synchronized (this) {
            try {
                if (this.f58992c != null) {
                    HandlerC14177g.m83954a(this.f58992c, this.f58991b);
                    TXCLog.m84156w("TXGLSurfaceTextureThread", "destroy gl thread");
                }
                this.f58992c = null;
                this.f58991b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m83945g() {
        TXCLog.m84156w("TXGLSurfaceTextureThread", "destroy surface texture ");
        InterfaceC14184n interfaceC14184n = this.f58993d;
        if (interfaceC14184n != null) {
            interfaceC14184n.mo84024b(this.f58995f);
        }
        SurfaceTexture surfaceTexture = this.f58995f;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.f58995f.release();
            this.f58996g = false;
            this.f58995f = null;
        }
        int[] iArr = this.f58994e;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f58994e = null;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m83946h() {
        TXCLog.m84156w("TXGLSurfaceTextureThread", "init surface texture ");
        this.f58994e = new int[]{C14180j.m84017b()};
        if (this.f58994e[0] <= 0) {
            this.f58994e = null;
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f58994e[0]);
        this.f58995f = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720);
        this.f58995f.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.basic.c.f.2
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C14176f.this.m83939a(103, new Runnable() { // from class: com.tencent.liteav.basic.c.f.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C14176f.this.f58996g = true;
                        C14176f.this.m83937a(102);
                    }
                });
                surfaceTexture2.setOnFrameAvailableListener(null);
            }
        });
        InterfaceC14184n interfaceC14184n = this.f58993d;
        if (interfaceC14184n != null) {
            interfaceC14184n.mo84022a(this.f58995f);
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m83947i() {
        if (!this.f58996g) {
            this.f58997h = 0L;
            this.f58998i = System.nanoTime();
            return false;
        }
        long jNanoTime = System.nanoTime();
        long j = this.f58998i;
        if (jNanoTime < ((this.f58997h * 1000000000) / ((long) this.f58990a)) + j) {
            return false;
        }
        if (j == 0) {
            this.f58998i = jNanoTime;
        } else if (jNanoTime > j + 1000000000) {
            this.f58997h = 0L;
            this.f58998i = jNanoTime;
        }
        this.f58997h++;
        return true;
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83952a(boolean z) {
        synchronized (this) {
            try {
                try {
                    if (this.f58992c != null) {
                        this.f58992c.removeCallbacksAndMessages(null);
                    }
                    this.f58996g = false;
                    SurfaceTexture surfaceTexture = this.f58995f;
                    if (surfaceTexture != null && this.f58994e != null) {
                        surfaceTexture.updateTexImage();
                        this.f58995f.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.basic.c.f.1
                            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                            public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                                C14176f.this.m83939a(103, new Runnable() { // from class: com.tencent.liteav.basic.c.f.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        C14176f.this.f58996g = true;
                                        C14176f.this.m83937a(102);
                                    }
                                });
                                surfaceTexture2.setOnFrameAvailableListener(null);
                            }
                        });
                    }
                } catch (Exception e) {
                    TXCLog.m84149e("TXGLSurfaceTextureThread", "updateTexImage failed." + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.p093c.HandlerC14177g.a
    /* JADX INFO: renamed from: c */
    public void mo83934c() {
        m83946h();
    }

    @Override // com.tencent.liteav.basic.p093c.HandlerC14177g.a
    /* JADX INFO: renamed from: d */
    public void mo83935d() {
        SurfaceTexture surfaceTexture;
        m83938a(102, 5L);
        if (!m83947i() || (surfaceTexture = this.f58995f) == null || this.f58994e == null) {
            return;
        }
        try {
            surfaceTexture.updateTexImage();
            this.f58995f.getTransformMatrix(this.f58999j);
        } catch (Exception e) {
            TXCLog.m84149e("TXGLSurfaceTextureThread", "onMsgRend Exception " + e.getMessage());
        }
        InterfaceC14184n interfaceC14184n = this.f58993d;
        if (interfaceC14184n != null) {
            interfaceC14184n.mo84021a(this.f58994e[0], this.f58999j);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.HandlerC14177g.a
    /* JADX INFO: renamed from: e */
    public void mo83936e() {
        m83945g();
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public EGLContext getGLContext() {
        EGLContext eGLContextM83960a;
        synchronized (this) {
            try {
                eGLContextM83960a = this.f58992c != null ? this.f58992c.m83960a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eGLContextM83960a;
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public SurfaceTexture getSurfaceTexture() {
        return this.f58995f;
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public void setRendMirror(int i) {
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public void setRendMode(int i) {
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    public void setSurfaceTextureListener(InterfaceC14184n interfaceC14184n) {
        this.f58993d = interfaceC14184n;
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83953a(byte[] bArr) {
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83949a(int i, boolean z) {
        this.f58990a = i;
        m83943b();
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83948a() {
        m83944f();
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83951a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f58992c != null) {
                    this.f58992c.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14183m
    /* JADX INFO: renamed from: a */
    public void mo83950a(int i, boolean z, int i2, int i3, int i4, boolean z2) {
    }

    /* JADX INFO: renamed from: a */
    private void m83938a(int i, long j) {
        synchronized (this) {
            try {
                if (this.f58992c != null) {
                    this.f58992c.sendEmptyMessageDelayed(i, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83937a(int i) {
        synchronized (this) {
            try {
                if (this.f58992c != null) {
                    this.f58992c.sendEmptyMessage(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83939a(int i, Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f58992c != null) {
                    Message message = new Message();
                    message.what = i;
                    message.obj = runnable;
                    this.f58992c.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
