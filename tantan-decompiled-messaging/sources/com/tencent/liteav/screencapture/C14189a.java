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
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14009b;
import com.tencent.liteav.basic.p088c.C14016i;
import com.tencent.liteav.basic.p088c.C14017j;
import com.tencent.liteav.basic.p088c.C14019l;
import com.tencent.liteav.basic.p088c.EnumC14018k;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.HandlerC14051e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.Locale;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.screencapture.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14189a {

    /* JADX INFO: renamed from: j */
    private final boolean f59871j;

    /* JADX INFO: renamed from: k */
    private final Context f59872k;

    /* JADX INFO: renamed from: p */
    private WeakReference<a> f59877p;

    /* JADX INFO: renamed from: b */
    protected volatile HandlerThread f59863b = null;

    /* JADX INFO: renamed from: c */
    protected volatile b f59864c = null;

    /* JADX INFO: renamed from: d */
    protected volatile WeakReference<InterfaceC14190b> f59865d = null;

    /* JADX INFO: renamed from: e */
    protected volatile int f59866e = 0;

    /* JADX INFO: renamed from: f */
    protected int f59867f = 720;

    /* JADX INFO: renamed from: g */
    protected int f59868g = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;

    /* JADX INFO: renamed from: h */
    protected int f59869h = 20;

    /* JADX INFO: renamed from: i */
    protected boolean f59870i = true;

    /* JADX INFO: renamed from: l */
    private Object f59873l = null;

    /* JADX INFO: renamed from: m */
    private int f59874m = 720;

    /* JADX INFO: renamed from: n */
    private int f59875n = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;

    /* JADX INFO: renamed from: o */
    private WeakReference<InterfaceC14007b> f59876o = null;

    /* JADX INFO: renamed from: q */
    private C14191c.b f59878q = new C14191c.b() { // from class: com.tencent.liteav.screencapture.a.1
        @Override // com.tencent.liteav.screencapture.C14191c.b
        /* JADX INFO: renamed from: a */
        public void mo83985a() {
            C14052f.m83036a((WeakReference<InterfaceC14007b>) C14189a.this.f59876o, TXLiteAVCode.ERR_SCREEN_CAPTURE_STOPPED, "Screen recording stopped. It may be preempted by other apps");
            a aVarM83961d = C14189a.this.m83961d();
            C14189a.this.f59877p = null;
            if (aVarM83961d != null) {
                aVarM83961d.onScreenCaptureStopped(1);
            }
        }

        @Override // com.tencent.liteav.screencapture.C14191c.b
        /* JADX INFO: renamed from: a */
        public void mo83987a(boolean z, boolean z2) {
            C14189a c14189a = C14189a.this;
            if (z) {
                c14189a.m83979b(106);
            } else {
                c14189a.f59877p = null;
                C14052f.m83036a((WeakReference<InterfaceC14007b>) C14189a.this.f59876o, -1308, "Failed to share screen");
            }
        }

        @Override // com.tencent.liteav.screencapture.C14191c.b
        /* JADX INFO: renamed from: a */
        public void mo83986a(boolean z) {
            if (C14189a.this.f59871j) {
                C14189a.this.m83982b(z);
                C14189a c14189a = C14189a.this;
                c14189a.m83981b(105, c14189a.f59874m, C14189a.this.f59875n);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    protected final Handler f59862a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.tencent.liteav.screencapture.a$a */
    public interface a {
        void onScreenCapturePaused();

        void onScreenCaptureResumed();

        void onScreenCaptureStarted();

        void onScreenCaptureStopped(int i);
    }

    public C14189a(Context context, boolean z, a aVar) {
        this.f59877p = new WeakReference<>(aVar);
        this.f59872k = context.getApplicationContext();
        this.f59871j = z;
    }

    /* JADX INFO: renamed from: c */
    private void m83958c(int i, int i2) {
        if (this.f59871j) {
            int rotation = ((WindowManager) this.f59872k.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRotation();
            if (rotation == 0 || rotation == 2) {
                if (i > i2) {
                    this.f59867f = i2;
                    this.f59868g = i;
                } else {
                    this.f59867f = i;
                    this.f59868g = i2;
                }
            } else if (i < i2) {
                this.f59867f = i2;
                this.f59868g = i;
            } else {
                this.f59867f = i;
                this.f59868g = i2;
            }
        } else {
            this.f59867f = i;
            this.f59868g = i2;
        }
        this.f59874m = this.f59867f;
        this.f59875n = this.f59868g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public a m83961d() {
        WeakReference<a> weakReference = this.f59877p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m83967a() {
        m83978b();
        synchronized (this) {
            this.f59863b = new HandlerThread("ScreenCaptureGLThread");
            this.f59863b.start();
            this.f59864c = new b(this.f59863b.getLooper(), this);
            int i = 1;
            this.f59866e++;
            this.f59864c.f59886a = this.f59866e;
            this.f59864c.f59890e = this.f59874m;
            this.f59864c.f59891f = this.f59875n;
            b bVar = this.f59864c;
            int i2 = this.f59869h;
            if (i2 >= 1) {
                i = i2;
            }
            bVar.f59892g = i;
        }
        m83979b(100);
    }

    /* JADX INFO: renamed from: b */
    public void m83982b(boolean z) {
        int i = this.f59867f;
        if (z) {
            int i2 = this.f59868g;
            this.f59874m = i < i2 ? i : i2;
            if (i < i2) {
                i = i2;
            }
            this.f59875n = i;
        } else {
            int i3 = this.f59868g;
            this.f59874m = i < i3 ? i3 : i;
            if (i >= i3) {
                i = i3;
            }
            this.f59875n = i;
        }
        TXCLog.m82969i("TXCScreenCapture", String.format(Locale.ENGLISH, "reset screen capture isPortrait[%b] output size[%d/%d]", Boolean.valueOf(z), Integer.valueOf(this.f59874m), Integer.valueOf(this.f59875n)));
    }

    /* JADX INFO: renamed from: com.tencent.liteav.screencapture.a$b */
    public class b extends Handler {

        /* JADX INFO: renamed from: a */
        public int f59886a;

        /* JADX INFO: renamed from: b */
        public int[] f59887b;

        /* JADX INFO: renamed from: c */
        public Surface f59888c;

        /* JADX INFO: renamed from: d */
        public SurfaceTexture f59889d;

        /* JADX INFO: renamed from: e */
        public int f59890e;

        /* JADX INFO: renamed from: f */
        public int f59891f;

        /* JADX INFO: renamed from: g */
        public int f59892g;

        /* JADX INFO: renamed from: h */
        protected boolean f59893h;

        /* JADX INFO: renamed from: i */
        protected long f59894i;

        /* JADX INFO: renamed from: j */
        protected long f59895j;

        /* JADX INFO: renamed from: k */
        protected C14009b f59896k;

        /* JADX INFO: renamed from: l */
        protected C14016i f59897l;

        /* JADX INFO: renamed from: m */
        float[] f59898m;

        /* JADX INFO: renamed from: o */
        private boolean f59900o;

        public b(Looper looper, C14189a c14189a) {
            super(looper);
            this.f59886a = 0;
            this.f59887b = null;
            this.f59888c = null;
            this.f59889d = null;
            this.f59890e = 720;
            this.f59891f = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
            this.f59892g = 25;
            this.f59893h = false;
            this.f59894i = 0L;
            this.f59895j = 0L;
            this.f59896k = null;
            this.f59897l = null;
            this.f59898m = new float[16];
            this.f59900o = true;
            TXCLog.m82970i("TXCScreenCapture", "TXCScreenCaptureGLThreadHandler inited. hashCode: %d", Integer.valueOf(hashCode()));
        }

        /* JADX INFO: renamed from: a */
        public void m83988a() {
            if (this.f59900o && this.f59896k != null) {
                Bundle bundle = new Bundle();
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Screen recording started successfully");
                C14052f.m83035a((WeakReference<InterfaceC14007b>) C14189a.this.f59876o, 1004, bundle);
                C14189a.this.m83984c(0);
            }
            this.f59900o = false;
        }

        /* JADX INFO: renamed from: b */
        public boolean m83991b() {
            TXCLog.m82969i("TXCScreenCapture", String.format("init egl size[%d/%d]", Integer.valueOf(this.f59890e), Integer.valueOf(this.f59891f)));
            C14009b c14009bM82715a = C14009b.m82715a(null, null, null, this.f59890e, this.f59891f);
            this.f59896k = c14009bM82715a;
            if (c14009bM82715a == null) {
                return false;
            }
            C14016i c14016i = new C14016i();
            this.f59897l = c14016i;
            if (!c14016i.mo82796a()) {
                return false;
            }
            this.f59897l.m82793a(true);
            this.f59897l.mo82786a(this.f59890e, this.f59891f);
            this.f59897l.m82795a(C14019l.f58233e, C14019l.m82837a(EnumC14018k.NORMAL, false, false));
            m83996e();
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m83993c(Message message) {
            C14189a.this.m83970a(102, 5L);
            if (C14189a.this.f59870i) {
                if (this.f59896k == null) {
                    TXCLog.m82966e("TXCScreenCapture", "eglhelper is null");
                    return;
                }
                if (!this.f59893h) {
                    this.f59894i = 0L;
                    this.f59895j = System.nanoTime();
                    return;
                }
                long jNanoTime = System.nanoTime();
                long j = this.f59895j;
                if (jNanoTime < ((this.f59894i * 1000000000) / ((long) this.f59892g)) + j) {
                    return;
                }
                if (j == 0) {
                    this.f59895j = jNanoTime;
                } else if (jNanoTime > j + 1000000000) {
                    this.f59894i = 0L;
                    this.f59895j = jNanoTime;
                }
                this.f59894i++;
                SurfaceTexture surfaceTexture = this.f59889d;
                if (surfaceTexture == null || this.f59887b == null) {
                    return;
                }
                surfaceTexture.getTransformMatrix(this.f59898m);
                try {
                    this.f59889d.updateTexImage();
                } catch (Exception e) {
                    TXCLog.m82966e("TXCScreenCapture", "onMsgRend Exception " + e.getMessage());
                }
                this.f59897l.mo82794a(this.f59898m);
                GLES20.glViewport(0, 0, this.f59890e, this.f59891f);
                C14189a.this.m83972a(0, this.f59896k.m82722d(), this.f59897l.mo82798b(this.f59887b[0]), this.f59890e, this.f59891f, TXCTimeUtil.getTimeTick());
            }
        }

        /* JADX INFO: renamed from: d */
        public void m83994d() {
            new HandlerC14051e(Looper.getMainLooper()).m83029a(new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C14191c.m83998a(C14189a.this.f59872k).m84009a(b.this.f59888c);
                }
            });
            Surface surface = this.f59888c;
            if (surface != null) {
                surface.release();
                this.f59888c = null;
            }
            SurfaceTexture surfaceTexture = this.f59889d;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
                this.f59889d.release();
                this.f59893h = false;
                this.f59889d = null;
            }
            int[] iArr = this.f59887b;
            if (iArr != null) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.f59887b = null;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m83996e() {
            this.f59887b = new int[]{C14017j.m82834b()};
            if (this.f59887b[0] <= 0) {
                this.f59887b = null;
                return;
            }
            this.f59889d = new SurfaceTexture(this.f59887b[0]);
            this.f59888c = new Surface(this.f59889d);
            this.f59889d.setDefaultBufferSize(this.f59890e, this.f59891f);
            this.f59889d.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.screencapture.a.b.2
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    C14189a.this.m83971a(104, new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b bVar = b.this;
                            bVar.f59893h = true;
                            C14189a.this.m83979b(102);
                        }
                    });
                    surfaceTexture.setOnFrameAvailableListener(null);
                }
            });
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.3
                @Override // java.lang.Runnable
                public void run() {
                    C14191c c14191cM83998a = C14191c.m83998a(C14189a.this.f59872k);
                    b bVar = b.this;
                    c14191cM83998a.m84010a(bVar.f59888c, bVar.f59890e, bVar.f59891f, C14189a.this.f59878q);
                }
            });
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            if (this.f59886a == C14189a.this.f59866e || 101 == message.what) {
                switch (message.what) {
                    case 100:
                        m83989a(message);
                        break;
                    case 101:
                        m83990b(message);
                        break;
                    case 102:
                        try {
                            m83993c(message);
                        } catch (Exception e) {
                            TXCLog.m82967e("TXCScreenCapture", "render failed.", e);
                        }
                        break;
                    case 103:
                        m83995d(message);
                        break;
                    case 105:
                        m83997e(message);
                        break;
                    case 106:
                        m83988a();
                        break;
                }
                Object obj = message.obj;
                if (obj != null) {
                    ((Runnable) obj).run();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m83989a(Message message) {
            this.f59894i = 0L;
            this.f59895j = 0L;
            if (m83991b()) {
                return;
            }
            m83992c();
            C14189a.this.m83978b();
            C14189a.this.m83984c(20000003);
        }

        /* JADX INFO: renamed from: d */
        public void m83995d(Message message) {
            if (message == null) {
                return;
            }
            int i = message.arg1;
            if (i < 1) {
                i = 1;
            }
            this.f59892g = i;
            this.f59894i = 0L;
            this.f59895j = 0L;
        }

        /* JADX INFO: renamed from: e */
        public void m83997e(Message message) {
            if (message == null) {
                return;
            }
            this.f59890e = message.arg1;
            this.f59891f = message.arg2;
            m83994d();
            this.f59897l.mo82786a(this.f59890e, this.f59891f);
            m83996e();
            TXCLog.m82969i("TXCScreenCapture", String.format("set screen capture size[%d/%d]", Integer.valueOf(C14189a.this.f59874m), Integer.valueOf(C14189a.this.f59875n)));
        }

        /* JADX INFO: renamed from: b */
        public void m83990b(Message message) {
            C14189a c14189a = C14189a.this;
            c14189a.f59870i = false;
            a aVarM83961d = c14189a.m83961d();
            if (aVarM83961d != null) {
                aVarM83961d.onScreenCaptureStopped(0);
            }
            InterfaceC14190b interfaceC14190bM83983c = C14189a.this.m83983c();
            if (interfaceC14190bM83983c != null) {
                interfaceC14190bM83983c.mo83602a(C14189a.this.f59873l);
            }
            m83992c();
        }

        /* JADX INFO: renamed from: c */
        public void m83992c() {
            m83994d();
            C14016i c14016i = this.f59897l;
            if (c14016i != null) {
                c14016i.mo82806d();
                this.f59897l = null;
            }
            C14009b c14009b = this.f59896k;
            if (c14009b != null) {
                c14009b.m82721c();
                this.f59896k = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC14190b m83983c() {
        if (this.f59865d == null) {
            return null;
        }
        return this.f59865d.get();
    }

    /* JADX INFO: renamed from: c */
    public void m83984c(int i) {
        a aVarM83961d = m83961d();
        if (aVarM83961d == null || i != 0) {
            return;
        }
        aVarM83961d.onScreenCaptureStarted();
    }

    /* JADX INFO: renamed from: b */
    public void m83978b() {
        synchronized (this) {
            try {
                this.f59866e++;
                if (this.f59864c != null) {
                    final HandlerThread handlerThread = this.f59863b;
                    final b bVar = this.f59864c;
                    m83971a(101, new Runnable() { // from class: com.tencent.liteav.screencapture.a.3
                        @Override // java.lang.Runnable
                        public void run() {
                            C14189a.this.f59862a.post(new Runnable() { // from class: com.tencent.liteav.screencapture.a.3.1
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
                this.f59864c = null;
                this.f59863b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m83966a(int i, int i2, int i3) {
        this.f59869h = i3;
        m83958c(i, i2);
        m83967a();
        TXCLog.m82969i("TXCScreenCapture", "start screen capture");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m83979b(int i) {
        synchronized (this) {
            try {
                if (this.f59864c != null) {
                    this.f59864c.sendEmptyMessage(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83975a(Object obj) {
        TXCLog.m82969i("TXCScreenCapture", "stop encode: " + obj);
        this.f59873l = obj;
        m83978b();
    }

    /* JADX INFO: renamed from: b */
    public void m83980b(int i, int i2) {
        synchronized (this) {
            try {
                if (this.f59864c != null) {
                    Message message = new Message();
                    message.what = i;
                    message.arg1 = i2;
                    this.f59864c.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83977a(final boolean z) {
        synchronized (this) {
            try {
                Runnable runnable = new Runnable() { // from class: com.tencent.liteav.screencapture.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a aVarM83961d = C14189a.this.m83961d();
                        boolean z2 = C14189a.this.f59870i;
                        boolean z3 = z;
                        if (z2 != z3 && aVarM83961d != null) {
                            if (z3) {
                                aVarM83961d.onScreenCaptureResumed();
                            } else {
                                aVarM83961d.onScreenCapturePaused();
                            }
                        }
                        C14189a.this.f59870i = z;
                    }
                };
                if (this.f59864c != null) {
                    this.f59864c.post(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83981b(int i, int i2, int i3) {
        synchronized (this) {
            try {
                if (this.f59864c != null) {
                    Message message = new Message();
                    message.what = i;
                    message.arg1 = i2;
                    message.arg2 = i3;
                    this.f59864c.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83974a(InterfaceC14190b interfaceC14190b) {
        this.f59865d = new WeakReference<>(interfaceC14190b);
    }

    /* JADX INFO: renamed from: a */
    public void m83973a(InterfaceC14007b interfaceC14007b) {
        this.f59876o = new WeakReference<>(interfaceC14007b);
    }

    /* JADX INFO: renamed from: a */
    public void m83968a(int i) {
        this.f59869h = i;
        m83980b(103, i);
    }

    /* JADX INFO: renamed from: a */
    public void m83969a(int i, int i2) {
        m83958c(i, i2);
        m83981b(105, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83976a(Runnable runnable) {
        if (this.f59864c != null) {
            this.f59864c.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83970a(int i, long j) {
        synchronized (this) {
            try {
                if (this.f59864c != null) {
                    this.f59864c.sendEmptyMessageDelayed(i, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83971a(int i, Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f59864c != null) {
                    Message message = new Message();
                    message.what = i;
                    message.obj = runnable;
                    this.f59864c.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83972a(int i, EGLContext eGLContext, int i2, int i3, int i4, long j) {
        InterfaceC14190b interfaceC14190bM83983c = m83983c();
        if (interfaceC14190bM83983c != null) {
            interfaceC14190bM83983c.mo83601a(i, eGLContext, i2, i3, i4, j);
        }
    }
}
