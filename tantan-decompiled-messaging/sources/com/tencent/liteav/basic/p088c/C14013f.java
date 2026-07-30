package com.tencent.liteav.basic.p088c;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Message;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14013f implements HandlerC14014g.a, InterfaceC14020m {

    /* JADX INFO: renamed from: d */
    private InterfaceC14021n f58145d;

    /* JADX INFO: renamed from: b */
    private volatile HandlerThread f58143b = null;

    /* JADX INFO: renamed from: c */
    private volatile HandlerC14014g f58144c = null;

    /* JADX INFO: renamed from: e */
    private int[] f58146e = null;

    /* JADX INFO: renamed from: f */
    private SurfaceTexture f58147f = null;

    /* JADX INFO: renamed from: g */
    private boolean f58148g = false;

    /* JADX INFO: renamed from: a */
    public int f58142a = 25;

    /* JADX INFO: renamed from: h */
    private long f58149h = 0;

    /* JADX INFO: renamed from: i */
    private long f58150i = 0;

    /* JADX INFO: renamed from: j */
    private float[] f58151j = new float[16];

    /* JADX INFO: renamed from: b */
    private void m82760b() {
        m82761f();
        synchronized (this) {
            this.f58143b = new HandlerThread("TXGLSurfaceTextureThread");
            this.f58143b.start();
            this.f58144c = new HandlerC14014g(this.f58143b.getLooper());
            this.f58144c.m82778a(this);
            this.f58144c.f58156a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
            this.f58144c.f58157b = 720;
            TXCLog.m82973w("TXGLSurfaceTextureThread", "create gl thread " + this.f58143b.getName());
        }
        m82754a(100);
    }

    /* JADX INFO: renamed from: f */
    private void m82761f() {
        synchronized (this) {
            try {
                if (this.f58144c != null) {
                    HandlerC14014g.m82771a(this.f58144c, this.f58143b);
                    TXCLog.m82973w("TXGLSurfaceTextureThread", "destroy gl thread");
                }
                this.f58144c = null;
                this.f58143b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m82762g() {
        TXCLog.m82973w("TXGLSurfaceTextureThread", "destroy surface texture ");
        InterfaceC14021n interfaceC14021n = this.f58145d;
        if (interfaceC14021n != null) {
            interfaceC14021n.mo82841b(this.f58147f);
        }
        SurfaceTexture surfaceTexture = this.f58147f;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.f58147f.release();
            this.f58148g = false;
            this.f58147f = null;
        }
        int[] iArr = this.f58146e;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f58146e = null;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m82763h() {
        TXCLog.m82973w("TXGLSurfaceTextureThread", "init surface texture ");
        this.f58146e = new int[]{C14017j.m82834b()};
        if (this.f58146e[0] <= 0) {
            this.f58146e = null;
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f58146e[0]);
        this.f58147f = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720);
        this.f58147f.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.basic.c.f.2
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C14013f.this.m82756a(103, new Runnable() { // from class: com.tencent.liteav.basic.c.f.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C14013f.this.f58148g = true;
                        C14013f.this.m82754a(102);
                    }
                });
                surfaceTexture2.setOnFrameAvailableListener(null);
            }
        });
        InterfaceC14021n interfaceC14021n = this.f58145d;
        if (interfaceC14021n != null) {
            interfaceC14021n.mo82839a(this.f58147f);
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m82764i() {
        if (!this.f58148g) {
            this.f58149h = 0L;
            this.f58150i = System.nanoTime();
            return false;
        }
        long jNanoTime = System.nanoTime();
        long j = this.f58150i;
        if (jNanoTime < ((this.f58149h * 1000000000) / ((long) this.f58142a)) + j) {
            return false;
        }
        if (j == 0) {
            this.f58150i = jNanoTime;
        } else if (jNanoTime > j + 1000000000) {
            this.f58149h = 0L;
            this.f58150i = jNanoTime;
        }
        this.f58149h++;
        return true;
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82769a(boolean z) {
        synchronized (this) {
            try {
                try {
                    if (this.f58144c != null) {
                        this.f58144c.removeCallbacksAndMessages(null);
                    }
                    this.f58148g = false;
                    SurfaceTexture surfaceTexture = this.f58147f;
                    if (surfaceTexture != null && this.f58146e != null) {
                        surfaceTexture.updateTexImage();
                        this.f58147f.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.basic.c.f.1
                            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                            public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                                C14013f.this.m82756a(103, new Runnable() { // from class: com.tencent.liteav.basic.c.f.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        C14013f.this.f58148g = true;
                                        C14013f.this.m82754a(102);
                                    }
                                });
                                surfaceTexture2.setOnFrameAvailableListener(null);
                            }
                        });
                    }
                } catch (Exception e) {
                    TXCLog.m82966e("TXGLSurfaceTextureThread", "updateTexImage failed." + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.p088c.HandlerC14014g.a
    /* JADX INFO: renamed from: c */
    public void mo82751c() {
        m82763h();
    }

    @Override // com.tencent.liteav.basic.p088c.HandlerC14014g.a
    /* JADX INFO: renamed from: d */
    public void mo82752d() {
        SurfaceTexture surfaceTexture;
        m82755a(102, 5L);
        if (!m82764i() || (surfaceTexture = this.f58147f) == null || this.f58146e == null) {
            return;
        }
        try {
            surfaceTexture.updateTexImage();
            this.f58147f.getTransformMatrix(this.f58151j);
        } catch (Exception e) {
            TXCLog.m82966e("TXGLSurfaceTextureThread", "onMsgRend Exception " + e.getMessage());
        }
        InterfaceC14021n interfaceC14021n = this.f58145d;
        if (interfaceC14021n != null) {
            interfaceC14021n.mo82838a(this.f58146e[0], this.f58151j);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.HandlerC14014g.a
    /* JADX INFO: renamed from: e */
    public void mo82753e() {
        m82762g();
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public EGLContext getGLContext() {
        EGLContext eGLContextM82777a;
        synchronized (this) {
            try {
                eGLContextM82777a = this.f58144c != null ? this.f58144c.m82777a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eGLContextM82777a;
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public SurfaceTexture getSurfaceTexture() {
        return this.f58147f;
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public void setRendMirror(int i) {
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public void setRendMode(int i) {
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    public void setSurfaceTextureListener(InterfaceC14021n interfaceC14021n) {
        this.f58145d = interfaceC14021n;
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82770a(byte[] bArr) {
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82766a(int i, boolean z) {
        this.f58142a = i;
        m82760b();
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82765a() {
        m82761f();
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82768a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f58144c != null) {
                    this.f58144c.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14020m
    /* JADX INFO: renamed from: a */
    public void mo82767a(int i, boolean z, int i2, int i3, int i4, boolean z2) {
    }

    /* JADX INFO: renamed from: a */
    private void m82755a(int i, long j) {
        synchronized (this) {
            try {
                if (this.f58144c != null) {
                    this.f58144c.sendEmptyMessageDelayed(i, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82754a(int i) {
        synchronized (this) {
            try {
                if (this.f58144c != null) {
                    this.f58144c.sendEmptyMessage(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82756a(int i, Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f58144c != null) {
                    Message message = new Message();
                    message.what = i;
                    message.obj = runnable;
                    this.f58144c.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
