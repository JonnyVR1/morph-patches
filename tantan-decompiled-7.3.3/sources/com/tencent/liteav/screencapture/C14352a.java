package com.tencent.liteav.screencapture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.WindowManager;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14172b;
import com.tencent.liteav.basic.p093c.C14179i;
import com.tencent.liteav.basic.p093c.C14180j;
import com.tencent.liteav.basic.p093c.C14182l;
import com.tencent.liteav.basic.p093c.EnumC14181k;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.HandlerC14214e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.Locale;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.screencapture.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14352a {

    /* JADX INFO: renamed from: j */
    private final boolean f60719j;

    /* JADX INFO: renamed from: k */
    private final Context f60720k;

    /* JADX INFO: renamed from: p */
    private WeakReference<a> f60725p;

    /* JADX INFO: renamed from: b */
    protected volatile HandlerThread f60711b = null;

    /* JADX INFO: renamed from: c */
    protected volatile b f60712c = null;

    /* JADX INFO: renamed from: d */
    protected volatile WeakReference<InterfaceC14353b> f60713d = null;

    /* JADX INFO: renamed from: e */
    protected volatile int f60714e = 0;

    /* JADX INFO: renamed from: f */
    protected int f60715f = 720;

    /* JADX INFO: renamed from: g */
    protected int f60716g = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;

    /* JADX INFO: renamed from: h */
    protected int f60717h = 20;

    /* JADX INFO: renamed from: i */
    protected boolean f60718i = true;

    /* JADX INFO: renamed from: l */
    private Object f60721l = null;

    /* JADX INFO: renamed from: m */
    private int f60722m = 720;

    /* JADX INFO: renamed from: n */
    private int f60723n = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;

    /* JADX INFO: renamed from: o */
    private WeakReference<InterfaceC14170b> f60724o = null;

    /* JADX INFO: renamed from: q */
    private C14354c.b f60726q = new C14354c.b() { // from class: com.tencent.liteav.screencapture.a.1
        @Override // com.tencent.liteav.screencapture.C14354c.b
        /* JADX INFO: renamed from: a */
        public void mo85168a() {
            C14215f.m84219a((WeakReference<InterfaceC14170b>) C14352a.this.f60724o, TXLiteAVCode.ERR_SCREEN_CAPTURE_STOPPED, "Screen recording stopped. It may be preempted by other apps");
            a aVarM85144d = C14352a.this.m85144d();
            C14352a.this.f60725p = null;
            if (aVarM85144d != null) {
                aVarM85144d.onScreenCaptureStopped(1);
            }
        }

        @Override // com.tencent.liteav.screencapture.C14354c.b
        /* JADX INFO: renamed from: a */
        public void mo85170a(boolean z, boolean z2) {
            C14352a c14352a = C14352a.this;
            if (z) {
                c14352a.m85162b(106);
            } else {
                c14352a.f60725p = null;
                C14215f.m84219a((WeakReference<InterfaceC14170b>) C14352a.this.f60724o, -1308, "Failed to share screen");
            }
        }

        @Override // com.tencent.liteav.screencapture.C14354c.b
        /* JADX INFO: renamed from: a */
        public void mo85169a(boolean z) {
            if (C14352a.this.f60719j) {
                C14352a.this.m85165b(z);
                C14352a c14352a = C14352a.this;
                c14352a.m85164b(105, c14352a.f60722m, C14352a.this.f60723n);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    protected final Handler f60710a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.tencent.liteav.screencapture.a$a */
    public interface a {
        void onScreenCapturePaused();

        void onScreenCaptureResumed();

        void onScreenCaptureStarted();

        void onScreenCaptureStopped(int i);
    }

    public C14352a(Context context, boolean z, a aVar) {
        this.f60725p = new WeakReference<>(aVar);
        this.f60720k = context.getApplicationContext();
        this.f60719j = z;
    }

    /* JADX INFO: renamed from: c */
    private void m85141c(int i, int i2) {
        if (this.f60719j) {
            int rotation = ((WindowManager) this.f60720k.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRotation();
            if (rotation == 0 || rotation == 2) {
                if (i > i2) {
                    this.f60715f = i2;
                    this.f60716g = i;
                } else {
                    this.f60715f = i;
                    this.f60716g = i2;
                }
            } else if (i < i2) {
                this.f60715f = i2;
                this.f60716g = i;
            } else {
                this.f60715f = i;
                this.f60716g = i2;
            }
        } else {
            this.f60715f = i;
            this.f60716g = i2;
        }
        this.f60722m = this.f60715f;
        this.f60723n = this.f60716g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public a m85144d() {
        WeakReference<a> weakReference = this.f60725p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m85150a() {
        m85161b();
        synchronized (this) {
            this.f60711b = new HandlerThread("ScreenCaptureGLThread");
            this.f60711b.start();
            this.f60712c = new b(this.f60711b.getLooper(), this);
            int i = 1;
            this.f60714e++;
            this.f60712c.f60734a = this.f60714e;
            this.f60712c.f60738e = this.f60722m;
            this.f60712c.f60739f = this.f60723n;
            b bVar = this.f60712c;
            int i2 = this.f60717h;
            if (i2 >= 1) {
                i = i2;
            }
            bVar.f60740g = i;
        }
        m85162b(100);
    }

    /* JADX INFO: renamed from: b */
    public void m85165b(boolean z) {
        int i = this.f60715f;
        if (z) {
            int i2 = this.f60716g;
            this.f60722m = i < i2 ? i : i2;
            if (i < i2) {
                i = i2;
            }
            this.f60723n = i;
        } else {
            int i3 = this.f60716g;
            this.f60722m = i < i3 ? i3 : i;
            if (i >= i3) {
                i = i3;
            }
            this.f60723n = i;
        }
        TXCLog.m84152i("TXCScreenCapture", String.format(Locale.ENGLISH, "reset screen capture isPortrait[%b] output size[%d/%d]", Boolean.valueOf(z), Integer.valueOf(this.f60722m), Integer.valueOf(this.f60723n)));
    }

    /* JADX INFO: renamed from: com.tencent.liteav.screencapture.a$b */
    public class b extends Handler {

        /* JADX INFO: renamed from: a */
        public int f60734a;

        /* JADX INFO: renamed from: b */
        public int[] f60735b;

        /* JADX INFO: renamed from: c */
        public Surface f60736c;

        /* JADX INFO: renamed from: d */
        public SurfaceTexture f60737d;

        /* JADX INFO: renamed from: e */
        public int f60738e;

        /* JADX INFO: renamed from: f */
        public int f60739f;

        /* JADX INFO: renamed from: g */
        public int f60740g;

        /* JADX INFO: renamed from: h */
        protected boolean f60741h;

        /* JADX INFO: renamed from: i */
        protected long f60742i;

        /* JADX INFO: renamed from: j */
        protected long f60743j;

        /* JADX INFO: renamed from: k */
        protected C14172b f60744k;

        /* JADX INFO: renamed from: l */
        protected C14179i f60745l;

        /* JADX INFO: renamed from: m */
        float[] f60746m;

        /* JADX INFO: renamed from: o */
        private boolean f60748o;

        public b(Looper looper, C14352a c14352a) {
            super(looper);
            this.f60734a = 0;
            this.f60735b = null;
            this.f60736c = null;
            this.f60737d = null;
            this.f60738e = 720;
            this.f60739f = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
            this.f60740g = 25;
            this.f60741h = false;
            this.f60742i = 0L;
            this.f60743j = 0L;
            this.f60744k = null;
            this.f60745l = null;
            this.f60746m = new float[16];
            this.f60748o = true;
            TXCLog.m84153i("TXCScreenCapture", "TXCScreenCaptureGLThreadHandler inited. hashCode: %d", Integer.valueOf(hashCode()));
        }

        /* JADX INFO: renamed from: a */
        public void m85171a() {
            if (this.f60748o && this.f60744k != null) {
                Bundle bundle = new Bundle();
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Screen recording started successfully");
                C14215f.m84218a((WeakReference<InterfaceC14170b>) C14352a.this.f60724o, 1004, bundle);
                C14352a.this.m85167c(0);
            }
            this.f60748o = false;
        }

        /* JADX INFO: renamed from: b */
        public boolean m85174b() {
            TXCLog.m84152i("TXCScreenCapture", String.format("init egl size[%d/%d]", Integer.valueOf(this.f60738e), Integer.valueOf(this.f60739f)));
            C14172b c14172bM83898a = C14172b.m83898a(null, null, null, this.f60738e, this.f60739f);
            this.f60744k = c14172bM83898a;
            if (c14172bM83898a == null) {
                return false;
            }
            C14179i c14179i = new C14179i();
            this.f60745l = c14179i;
            if (!c14179i.mo83979a()) {
                return false;
            }
            this.f60745l.m83976a(true);
            this.f60745l.mo83969a(this.f60738e, this.f60739f);
            this.f60745l.m83978a(C14182l.f59081e, C14182l.m84020a(EnumC14181k.NORMAL, false, false));
            m85179e();
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m85176c(Message message) {
            C14352a.this.m85153a(102, 5L);
            if (C14352a.this.f60718i) {
                if (this.f60744k == null) {
                    TXCLog.m84149e("TXCScreenCapture", "eglhelper is null");
                    return;
                }
                if (!this.f60741h) {
                    this.f60742i = 0L;
                    this.f60743j = System.nanoTime();
                    return;
                }
                long jNanoTime = System.nanoTime();
                long j = this.f60743j;
                if (jNanoTime < ((this.f60742i * 1000000000) / ((long) this.f60740g)) + j) {
                    return;
                }
                if (j == 0) {
                    this.f60743j = jNanoTime;
                } else if (jNanoTime > j + 1000000000) {
                    this.f60742i = 0L;
                    this.f60743j = jNanoTime;
                }
                this.f60742i++;
                SurfaceTexture surfaceTexture = this.f60737d;
                if (surfaceTexture == null || this.f60735b == null) {
                    return;
                }
                surfaceTexture.getTransformMatrix(this.f60746m);
                try {
                    this.f60737d.updateTexImage();
                } catch (Exception e) {
                    TXCLog.m84149e("TXCScreenCapture", "onMsgRend Exception " + e.getMessage());
                }
                this.f60745l.mo83977a(this.f60746m);
                GLES20.glViewport(0, 0, this.f60738e, this.f60739f);
                C14352a.this.m85155a(0, this.f60744k.m83905d(), this.f60745l.mo83981b(this.f60735b[0]), this.f60738e, this.f60739f, TXCTimeUtil.getTimeTick());
            }
        }

        /* JADX INFO: renamed from: d */
        public void m85177d() {
            new HandlerC14214e(Looper.getMainLooper()).m84212a(new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C14354c.m85181a(C14352a.this.f60720k).m85192a(b.this.f60736c);
                }
            });
            Surface surface = this.f60736c;
            if (surface != null) {
                surface.release();
                this.f60736c = null;
            }
            SurfaceTexture surfaceTexture = this.f60737d;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
                this.f60737d.release();
                this.f60741h = false;
                this.f60737d = null;
            }
            int[] iArr = this.f60735b;
            if (iArr != null) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.f60735b = null;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m85179e() {
            this.f60735b = new int[]{C14180j.m84017b()};
            if (this.f60735b[0] <= 0) {
                this.f60735b = null;
                return;
            }
            this.f60737d = new SurfaceTexture(this.f60735b[0]);
            this.f60736c = new Surface(this.f60737d);
            this.f60737d.setDefaultBufferSize(this.f60738e, this.f60739f);
            this.f60737d.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.screencapture.a.b.2
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    C14352a.this.m85154a(104, new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b bVar = b.this;
                            bVar.f60741h = true;
                            C14352a.this.m85162b(102);
                        }
                    });
                    surfaceTexture.setOnFrameAvailableListener(null);
                }
            });
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.3
                @Override // java.lang.Runnable
                public void run() {
                    C14354c c14354cM85181a = C14354c.m85181a(C14352a.this.f60720k);
                    b bVar = b.this;
                    c14354cM85181a.m85193a(bVar.f60736c, bVar.f60738e, bVar.f60739f, C14352a.this.f60726q);
                }
            });
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            if (this.f60734a == C14352a.this.f60714e || 101 == message.what) {
                switch (message.what) {
                    case 100:
                        m85172a(message);
                        break;
                    case 101:
                        m85173b(message);
                        break;
                    case 102:
                        try {
                            m85176c(message);
                        } catch (Exception e) {
                            TXCLog.m84150e("TXCScreenCapture", "render failed.", e);
                        }
                        break;
                    case 103:
                        m85178d(message);
                        break;
                    case 105:
                        m85180e(message);
                        break;
                    case 106:
                        m85171a();
                        break;
                }
                Object obj = message.obj;
                if (obj != null) {
                    ((Runnable) obj).run();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m85172a(Message message) {
            this.f60742i = 0L;
            this.f60743j = 0L;
            if (m85174b()) {
                return;
            }
            m85175c();
            C14352a.this.m85161b();
            C14352a.this.m85167c(20000003);
        }

        /* JADX INFO: renamed from: d */
        public void m85178d(Message message) {
            if (message == null) {
                return;
            }
            int i = message.arg1;
            if (i < 1) {
                i = 1;
            }
            this.f60740g = i;
            this.f60742i = 0L;
            this.f60743j = 0L;
        }

        /* JADX INFO: renamed from: e */
        public void m85180e(Message message) {
            if (message == null) {
                return;
            }
            this.f60738e = message.arg1;
            this.f60739f = message.arg2;
            m85177d();
            this.f60745l.mo83969a(this.f60738e, this.f60739f);
            m85179e();
            TXCLog.m84152i("TXCScreenCapture", String.format("set screen capture size[%d/%d]", Integer.valueOf(C14352a.this.f60722m), Integer.valueOf(C14352a.this.f60723n)));
        }

        /* JADX INFO: renamed from: b */
        public void m85173b(Message message) {
            C14352a c14352a = C14352a.this;
            c14352a.f60718i = false;
            a aVarM85144d = c14352a.m85144d();
            if (aVarM85144d != null) {
                aVarM85144d.onScreenCaptureStopped(0);
            }
            InterfaceC14353b interfaceC14353bM85166c = C14352a.this.m85166c();
            if (interfaceC14353bM85166c != null) {
                interfaceC14353bM85166c.mo84785a(C14352a.this.f60721l);
            }
            m85175c();
        }

        /* JADX INFO: renamed from: c */
        public void m85175c() {
            m85177d();
            C14179i c14179i = this.f60745l;
            if (c14179i != null) {
                c14179i.mo83989d();
                this.f60745l = null;
            }
            C14172b c14172b = this.f60744k;
            if (c14172b != null) {
                c14172b.m83904c();
                this.f60744k = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC14353b m85166c() {
        if (this.f60713d == null) {
            return null;
        }
        return this.f60713d.get();
    }

    /* JADX INFO: renamed from: c */
    public void m85167c(int i) {
        a aVarM85144d = m85144d();
        if (aVarM85144d == null || i != 0) {
            return;
        }
        aVarM85144d.onScreenCaptureStarted();
    }

    /* JADX INFO: renamed from: b */
    public void m85161b() {
        synchronized (this) {
            try {
                this.f60714e++;
                if (this.f60712c != null) {
                    final HandlerThread handlerThread = this.f60711b;
                    final b bVar = this.f60712c;
                    m85154a(101, new Runnable() { // from class: com.tencent.liteav.screencapture.a.3
                        @Override // java.lang.Runnable
                        public void run() {
                            C14352a.this.f60710a.post(new Runnable() { // from class: com.tencent.liteav.screencapture.a.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Handler handler = bVar;
                                    if (handler != null) {
                                        handler.removeCallbacksAndMessages(null);
                                    }
                                    HandlerThread handlerThread2 = handlerThread;
                                    if (handlerThread2 != null) {
                                        handlerThread2.quitSafely();
                                    }
                                }
                            });
                        }
                    });
                }
                this.f60712c = null;
                this.f60711b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m85149a(int i, int i2, int i3) {
        this.f60717h = i3;
        m85141c(i, i2);
        m85150a();
        TXCLog.m84152i("TXCScreenCapture", "start screen capture");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m85162b(int i) {
        synchronized (this) {
            try {
                if (this.f60712c != null) {
                    this.f60712c.sendEmptyMessage(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85158a(Object obj) {
        TXCLog.m84152i("TXCScreenCapture", "stop encode: " + obj);
        this.f60721l = obj;
        m85161b();
    }

    /* JADX INFO: renamed from: b */
    public void m85163b(int i, int i2) {
        synchronized (this) {
            try {
                if (this.f60712c != null) {
                    Message message = new Message();
                    message.what = i;
                    message.arg1 = i2;
                    this.f60712c.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85160a(final boolean z) {
        synchronized (this) {
            try {
                Runnable runnable = new Runnable() { // from class: com.tencent.liteav.screencapture.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a aVarM85144d = C14352a.this.m85144d();
                        boolean z2 = C14352a.this.f60718i;
                        boolean z3 = z;
                        if (z2 != z3 && aVarM85144d != null) {
                            if (z3) {
                                aVarM85144d.onScreenCaptureResumed();
                            } else {
                                aVarM85144d.onScreenCapturePaused();
                            }
                        }
                        C14352a.this.f60718i = z;
                    }
                };
                if (this.f60712c != null) {
                    this.f60712c.post(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85164b(int i, int i2, int i3) {
        synchronized (this) {
            try {
                if (this.f60712c != null) {
                    Message message = new Message();
                    message.what = i;
                    message.arg1 = i2;
                    message.arg2 = i3;
                    this.f60712c.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85157a(InterfaceC14353b interfaceC14353b) {
        this.f60713d = new WeakReference<>(interfaceC14353b);
    }

    /* JADX INFO: renamed from: a */
    public void m85156a(InterfaceC14170b interfaceC14170b) {
        this.f60724o = new WeakReference<>(interfaceC14170b);
    }

    /* JADX INFO: renamed from: a */
    public void m85151a(int i) {
        this.f60717h = i;
        m85163b(103, i);
    }

    /* JADX INFO: renamed from: a */
    public void m85152a(int i, int i2) {
        m85141c(i, i2);
        m85164b(105, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m85159a(Runnable runnable) {
        if (this.f60712c != null) {
            this.f60712c.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85153a(int i, long j) {
        synchronized (this) {
            try {
                if (this.f60712c != null) {
                    this.f60712c.sendEmptyMessageDelayed(i, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85154a(int i, Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f60712c != null) {
                    Message message = new Message();
                    message.what = i;
                    message.obj = runnable;
                    this.f60712c.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85155a(int i, EGLContext eGLContext, int i2, int i3, int i4, long j) {
        InterfaceC14353b interfaceC14353bM85166c = m85166c();
        if (interfaceC14353bM85166c != null) {
            interfaceC14353bM85166c.mo84784a(i, eGLContext, i2, i3, i4, j);
        }
    }
}
