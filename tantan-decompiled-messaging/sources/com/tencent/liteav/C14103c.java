package com.tencent.liteav;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p086a.EnumC14005c;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.InterfaceC14020m;
import com.tencent.liteav.basic.p088c.InterfaceC14021n;
import com.tencent.liteav.basic.structs.C14042b;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.capturer.C14105a;
import com.tencent.liteav.capturer.InterfaceC14106b;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14103c implements InterfaceC14007b, InterfaceC14021n, InterfaceC14106b, InterfaceC14114k {

    /* JADX INFO: renamed from: a */
    WeakReference<InterfaceC14007b> f59032a;

    /* JADX INFO: renamed from: b */
    private Context f59033b;

    /* JADX INFO: renamed from: d */
    private InterfaceC14115l f59035d;

    /* JADX INFO: renamed from: e */
    private boolean f59036e;

    /* JADX INFO: renamed from: f */
    private C14110g f59037f;

    /* JADX INFO: renamed from: h */
    private InterfaceC14020m f59039h;

    /* JADX INFO: renamed from: k */
    private long f59042k;

    /* JADX INFO: renamed from: g */
    private int f59038g = 0;

    /* JADX INFO: renamed from: i */
    private boolean f59040i = false;

    /* JADX INFO: renamed from: j */
    private long f59041j = 0;

    /* JADX INFO: renamed from: l */
    private long f59043l = 0;

    /* JADX INFO: renamed from: m */
    private int f59044m = 0;

    /* JADX INFO: renamed from: n */
    private Object f59045n = new Object();

    /* JADX INFO: renamed from: o */
    private HandlerThread f59046o = null;

    /* JADX INFO: renamed from: p */
    private Handler f59047p = null;

    /* JADX INFO: renamed from: q */
    private String f59048q = "";

    /* JADX INFO: renamed from: r */
    private boolean f59049r = true;

    /* JADX INFO: renamed from: c */
    private final C14105a f59034c = new C14105a();

    /* JADX INFO: renamed from: com.tencent.liteav.c$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f59053a;

        static {
            int[] iArr = new int[EnumC14005c.values().length];
            f59053a = iArr;
            try {
                iArr[EnumC14005c.RESOLUTION_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59053a[EnumC14005c.RESOLUTION_TYPE_360_640.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59053a[EnumC14005c.RESOLUTION_TYPE_540_960.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59053a[EnumC14005c.RESOLUTION_TYPE_1080_1920.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59053a[EnumC14005c.RESOLUTION_TYPE_320_480.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59053a[EnumC14005c.RESOLUTION_TYPE_720_1280.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C14103c(Context context, C14110g c14110g, InterfaceC14020m interfaceC14020m, boolean z) {
        this.f59039h = null;
        try {
            this.f59037f = (C14110g) c14110g.clone();
        } catch (CloneNotSupportedException e) {
            this.f59037f = new C14110g();
            e.printStackTrace();
        }
        this.f59033b = context;
        this.f59039h = interfaceC14020m;
        interfaceC14020m.setSurfaceTextureListener(this);
        C14110g c14110g2 = this.f59037f;
        c14110g2.f59302W = z;
        this.f59034c.m83395b(c14110g2.f59300U);
    }

    /* JADX INFO: renamed from: a */
    private void m83326a(int i, byte[] bArr, float[] fArr, int i2) {
        if (this.f59036e) {
            boolean z = true;
            if (!this.f59040i) {
                Monitor.m82978a(2, String.format("VideoCapture[%d]: capture first frame", Integer.valueOf(hashCode())), "", 0);
                C14052f.m83036a(this.f59032a, 1007, "First frame capture completed");
                this.f59040i = true;
                this.f59049r = true;
                TXCLog.m82969i("CameraCapture", "trtc_render: render first frame");
            }
            C14042b c14042b = new C14042b();
            c14042b.f58466e = this.f59034c.m83408j();
            c14042b.f58467f = this.f59034c.m83409k();
            C14110g c14110g = this.f59037f;
            c14042b.f58468g = c14110g.f59305a;
            c14042b.f58469h = c14110g.f59306b;
            c14042b.f58471j = this.f59034c.m83406h();
            boolean zM83407i = this.f59034c.m83407i();
            C14110g c14110g2 = this.f59037f;
            if (!zM83407i) {
                z = c14110g2.f59298S;
            } else if (c14110g2.f59298S) {
                z = false;
            }
            c14042b.f58470i = z;
            c14042b.f58462a = i;
            c14042b.f58464c = fArr;
            C14110g c14110g3 = this.f59037f;
            c14042b.f58465d = c14110g3.f59302W;
            c14042b.f58474m = bArr;
            c14042b.f58463b = i2;
            int i3 = c14042b.f58471j;
            if (i3 == 0 || i3 == 180) {
                c14042b.f58468g = c14110g3.f59306b;
                c14042b.f58469h = c14110g3.f59305a;
            } else {
                c14042b.f58468g = c14110g3.f59305a;
                c14042b.f58469h = c14110g3.f59306b;
            }
            c14042b.f58473l = C14052f.m83034a(c14042b.f58466e, c14042b.f58467f, c14110g3.f59306b, c14110g3.f59305a);
            InterfaceC14115l interfaceC14115l = this.f59035d;
            if (interfaceC14115l != null) {
                interfaceC14115l.mo83486b(c14042b);
            }
            if (this.f59049r) {
                this.f59049r = false;
                TXCLog.m82969i("CameraCapture", String.format("vsize onCaptureFrame w*h:%d*%d angle:%d", Integer.valueOf(c14042b.f58468g), Integer.valueOf(c14042b.f58469h), Integer.valueOf(c14042b.f58471j)));
            }
            this.f59041j++;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f59042k;
            if (jCurrentTimeMillis >= 1000) {
                TXCStatus.m82994a(this.f59048q, 1001, this.f59044m, Double.valueOf(((this.f59041j - this.f59043l) * 1000.0d) / jCurrentTimeMillis));
                this.f59043l = this.f59041j;
                this.f59042k += jCurrentTimeMillis;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m83329c(SurfaceTexture surfaceTexture) {
        C14105a c14105a;
        if (surfaceTexture == null || this.f59036e || (c14105a = this.f59034c) == null) {
            return;
        }
        c14105a.m83392a(this);
        this.f59034c.m83390a(surfaceTexture);
        this.f59034c.m83389a(this.f59037f.f59312h);
        this.f59034c.m83398c(this.f59037f.f59316l);
        this.f59034c.m83399c(this.f59037f.f59290K);
        this.f59034c.m83391a(m83332n());
        C14105a c14105a2 = this.f59034c;
        C14110g c14110g = this.f59037f;
        c14105a2.m83393a(c14110g.f59302W, c14110g.f59305a, c14110g.f59306b);
        TXCLog.m82969i("CameraCapture", String.format("vsize startCapture w*h:%d*%d orientation:%d", Integer.valueOf(this.f59037f.f59305a), Integer.valueOf(this.f59037f.f59306b), Integer.valueOf(this.f59037f.f59316l)));
        if (this.f59034c.m83401d(this.f59037f.f59317m) != 0) {
            this.f59036e = false;
            m83325a(-1301, "Failed to open camera, please confirm whether the camera permission is turned on");
            return;
        }
        this.f59036e = true;
        this.f59042k = System.currentTimeMillis();
        Monitor.m82978a(2, String.format("VideoCapture[%d]: start %s camera successfully", Integer.valueOf(hashCode()), this.f59037f.f59317m ? "front" : "back"), "", 0);
        m83325a(1003, "Enabled camera successfully");
        this.f59040i = false;
    }

    /* JADX INFO: renamed from: n */
    private C14105a.a m83332n() {
        C14110g c14110g = this.f59037f;
        if (c14110g.f59299T) {
            return C14105a.a.RESOLUTION_HIGHEST;
        }
        int i = AnonymousClass3.f59053a[c14110g.f59315k.ordinal()];
        if (i == 1) {
            return C14105a.a.RESOLUTION_INVALID;
        }
        if (i == 2) {
            return C14105a.a.RESOLUTION_360_640;
        }
        if (i == 3) {
            return C14105a.a.RESOLUTION_540_960;
        }
        if (i != 4) {
            return i != 5 ? C14105a.a.RESOLUTION_720_1280 : C14105a.a.RESOLUTION_320_480;
        }
        return C14105a.a.RESOLUTION_1080_1920;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public boolean m83333o() {
        try {
            Context context = this.f59033b;
            if (context != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    TXCLog.m82973w("CameraCapture", "List of RunningAppProcessInfo is null");
                    return false;
                }
                for (int i = 0; i < runningAppProcesses.size(); i++) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                    if (runningAppProcessInfo == null) {
                        TXCLog.m82973w("CameraCapture", "ActivityManager.RunningAppProcessInfo is null");
                    } else if (runningAppProcessInfo.processName.equals(this.f59033b.getPackageName()) && runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: b */
    public void mo83349b(boolean z) {
        C14105a c14105a;
        boolean z2;
        if (!this.f59036e || (c14105a = this.f59034c) == null) {
            return;
        }
        C14110g c14110g = this.f59037f;
        if (z) {
            z2 = !c14110g.f59317m;
        } else {
            z2 = c14110g.f59317m;
        }
        c14110g.f59317m = z2;
        c14105a.m83405g();
        this.f59039h.mo82769a(false);
        this.f59034c.m83389a(this.f59037f.f59312h);
        this.f59034c.m83398c(this.f59037f.f59316l);
        this.f59034c.m83391a(m83332n());
        C14105a c14105a2 = this.f59034c;
        C14110g c14110g2 = this.f59037f;
        c14105a2.m83393a(c14110g2.f59302W, c14110g2.f59305a, c14110g2.f59306b);
        this.f59034c.m83392a(this);
        this.f59034c.m83390a(this.f59039h.getSurfaceTexture());
        TXCLog.m82969i("CameraCapture", String.format("vsize refreshCapture w*h:%d*%d orientation:%d", Integer.valueOf(this.f59037f.f59305a), Integer.valueOf(this.f59037f.f59306b), Integer.valueOf(this.f59037f.f59316l)));
        if (this.f59034c.m83401d(this.f59037f.f59317m) == 0) {
            this.f59036e = true;
            Monitor.m82978a(2, String.format("VideoCapture[%d]: start %s camera successfully", Integer.valueOf(hashCode()), this.f59037f.f59317m ? "front" : "back"), "", 0);
            m83325a(1003, "Enabled camera successfully");
        } else {
            this.f59036e = false;
            m83325a(-1301, "Failed to open the camera, please confirm whether the camera permission is turned on");
        }
        this.f59040i = false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: d */
    public void mo83353d(int i) {
        InterfaceC14020m interfaceC14020m = this.f59039h;
        if (interfaceC14020m != null) {
            interfaceC14020m.setRendMirror(i);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: e */
    public void mo83357e(int i) {
        this.f59037f.f59316l = i;
        this.f59034c.m83398c(i);
        this.f59049r = true;
        TXCLog.m82969i("CameraCapture", String.format("vsize setCaptureOrientation w*h:%d*%d orientation:%d", Integer.valueOf(this.f59037f.f59305a), Integer.valueOf(this.f59037f.f59306b), Integer.valueOf(this.f59037f.f59316l)));
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: f */
    public void mo83360f(int i) {
        this.f59037f.f59312h = i;
        C14105a c14105a = this.f59034c;
        if (c14105a != null) {
            c14105a.m83389a(i);
        }
        InterfaceC14020m interfaceC14020m = this.f59039h;
        if (interfaceC14020m == null || !(interfaceC14020m instanceof TXCGLSurfaceView)) {
            return;
        }
        ((TXCGLSurfaceView) interfaceC14020m).setFPS(i);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: g */
    public int mo83361g() {
        return this.f59037f.f59312h;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: h */
    public boolean mo83363h() {
        C14105a c14105a = this.f59034c;
        if (c14105a != null) {
            return c14105a.m83396b();
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: i */
    public boolean mo83364i() {
        C14105a c14105a = this.f59034c;
        if (c14105a != null) {
            return c14105a.m83400c();
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: j */
    public boolean mo83365j() {
        C14105a c14105a = this.f59034c;
        if (c14105a != null) {
            return c14105a.m83402d();
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: k */
    public boolean mo83366k() {
        C14105a c14105a = this.f59034c;
        if (c14105a != null) {
            return c14105a.m83403e();
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: l */
    public boolean mo83367l() {
        C14105a c14105a = this.f59034c;
        if (c14105a != null) {
            return c14105a.m83407i();
        }
        return false;
    }

    @Override // com.tencent.liteav.capturer.InterfaceC14106b
    /* JADX INFO: renamed from: m */
    public void mo83368m() {
        if (this.f59034c.m83410l() != null) {
            this.f59034c.m83405g();
        }
        synchronized (this.f59045n) {
            try {
                if (this.f59046o == null) {
                    HandlerThread handlerThread = new HandlerThread("cameraMonitorThread");
                    this.f59046o = handlerThread;
                    handlerThread.start();
                    this.f59047p = new Handler(this.f59046o.getLooper());
                    TXCLog.m82973w("CameraCapture", "start camera monitor ");
                }
                Handler handler = this.f59047p;
                if (handler != null) {
                    handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.c.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                if (!C14103c.this.mo83354d() || !C14103c.this.m83333o() || C14103c.this.f59034c.m83410l() != null) {
                                    if (C14103c.this.f59047p != null) {
                                        C14103c.this.f59047p.postDelayed(this, 2000L);
                                        return;
                                    }
                                    return;
                                }
                                TXCLog.m82973w("CameraCapture", "camera monitor restart capture");
                                C14103c.this.f59034c.m83405g();
                                C14103c.this.f59039h.mo82769a(false);
                                C14103c.this.f59034c.m83389a(C14103c.this.f59037f.f59312h);
                                C14103c.this.f59034c.m83393a(C14103c.this.f59037f.f59302W, C14103c.this.f59037f.f59305a, C14103c.this.f59037f.f59306b);
                                C14103c.this.f59034c.m83390a(C14103c.this.f59039h.getSurfaceTexture());
                                C14103c.this.f59034c.m83401d(C14103c.this.f59037f.f59317m);
                            } catch (Exception unused) {
                                TXCLog.m82973w("CameraCapture", "camera monitor exception ");
                            }
                        }
                    }, 2000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.p087b.InterfaceC14007b
    public void onNotifyEvent(int i, Bundle bundle) {
        C14052f.m83035a(this.f59032a, i, bundle);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: g */
    public void mo83362g(int i) {
        this.f59044m = i;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: d */
    public boolean mo83354d() {
        return this.f59036e;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: d */
    public boolean mo83355d(boolean z) {
        return this.f59034c.m83394a(z);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: f */
    public EGLContext mo83359f() {
        return this.f59039h.getGLContext();
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: e */
    public int mo83356e() {
        return this.f59034c.m83404f();
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: e */
    public void mo83358e(boolean z) {
        this.f59037f.f59300U = z;
        this.f59034c.m83395b(z);
        this.f59049r = true;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: c */
    public void mo83350c() {
        TXCLog.m82969i("CameraCapture", "stopCapture->enter with null");
        this.f59034c.m83392a((InterfaceC14106b) null);
        this.f59034c.m83405g();
        this.f59036e = false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: c */
    public void mo83351c(int i) {
        InterfaceC14020m interfaceC14020m = this.f59039h;
        if (interfaceC14020m != null) {
            interfaceC14020m.setRendMode(i);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: c */
    public void mo83352c(final boolean z) {
        mo83341a(new Runnable() { // from class: com.tencent.liteav.c.1
            @Override // java.lang.Runnable
            public void run() {
                C14103c.this.f59037f.f59298S = z;
            }
        });
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: b */
    public void mo83346b() {
        TXCLog.m82969i("CameraCapture", "startCapture->enter with getSurfaceTexture:" + this.f59039h.getSurfaceTexture());
        m83329c(this.f59039h.getSurfaceTexture());
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: b */
    public void mo83347b(int i) {
        this.f59038g = i;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: b */
    public void mo83348b(int i, int i2) {
        C14110g c14110g = this.f59037f;
        c14110g.f59305a = i;
        c14110g.f59306b = i2;
        this.f59049r = true;
        TXCLog.m82969i("CameraCapture", String.format("vsize setVideoEncSize w*h:%d*%d orientation:%d", Integer.valueOf(i), Integer.valueOf(this.f59037f.f59306b), Integer.valueOf(this.f59037f.f59316l)));
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14021n
    /* JADX INFO: renamed from: b */
    public void mo82841b(SurfaceTexture surfaceTexture) {
        mo83350c();
        TXCLog.m82969i("CameraCapture", "onSurfaceTextureDestroy->enter with mListener:" + this.f59035d);
        InterfaceC14115l interfaceC14115l = this.f59035d;
        if (interfaceC14115l != null) {
            interfaceC14115l.mo83517q();
        }
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83334a() {
        Monitor.m82978a(2, String.format("VideoCapture[%d]: start camera", Integer.valueOf(hashCode())), "", 0);
        TXCLog.m82969i("CameraCapture", "start->enter with getSurfaceTexture:" + this.f59039h.getSurfaceTexture());
        InterfaceC14020m interfaceC14020m = this.f59039h;
        C14110g c14110g = this.f59037f;
        interfaceC14020m.mo82766a(c14110g.f59312h, !c14110g.f59302W);
        m83329c(this.f59039h.getSurfaceTexture());
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83343a(boolean z) {
        Monitor.m82978a(2, String.format("VideoCapture[%d]: stop camera", Integer.valueOf(hashCode())), "", 0);
        mo83350c();
        this.f59039h.mo82765a();
        synchronized (this.f59045n) {
            try {
                Handler handler = this.f59047p;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (this.f59046o != null) {
                    TXCLog.m82973w("CameraCapture", "stop camera monitor ");
                    this.f59046o.quit();
                    this.f59046o = null;
                    this.f59047p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83342a(String str) {
        this.f59048q = str;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public boolean mo83345a(int i) {
        return this.f59034c.m83397b(i);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83336a(int i, int i2) {
        this.f59034c.m83388a(i, i2);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83340a(InterfaceC14115l interfaceC14115l) {
        this.f59035d = interfaceC14115l;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83339a(C14042b c14042b) {
        InterfaceC14020m interfaceC14020m = this.f59039h;
        if (interfaceC14020m != null) {
            interfaceC14020m.mo82767a(c14042b.f58462a, c14042b.f58470i, this.f59038g, c14042b.f58466e, c14042b.f58467f, this.f59034c.m83407i());
        }
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83341a(Runnable runnable) {
        this.f59039h.mo82768a(runnable);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83338a(InterfaceC14007b interfaceC14007b) {
        this.f59032a = new WeakReference<>(interfaceC14007b);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83337a(EnumC14005c enumC14005c) {
        this.f59037f.f59315k = enumC14005c;
        this.f59049r = true;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83335a(float f, float f2) {
        C14105a c14105a = this.f59034c;
        if (c14105a == null || !this.f59037f.f59290K) {
            return;
        }
        c14105a.m83388a(f, f2);
    }

    /* JADX INFO: renamed from: a */
    private void m83325a(int i, String str) {
        C14052f.m83036a(this.f59032a, i, str);
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14021n
    /* JADX INFO: renamed from: a */
    public void mo82839a(SurfaceTexture surfaceTexture) {
        TXCLog.m82969i("CameraCapture", "onSurfaceTextureAvailable->enter with mListener:" + this.f59035d);
        m83329c(surfaceTexture);
        InterfaceC14115l interfaceC14115l = this.f59035d;
        if (interfaceC14115l != null) {
            interfaceC14115l.mo83473a(surfaceTexture);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14021n
    /* JADX INFO: renamed from: a */
    public int mo82838a(int i, float[] fArr) {
        m83326a(i, null, fArr, 4);
        return 0;
    }

    @Override // com.tencent.liteav.basic.p088c.InterfaceC14021n
    /* JADX INFO: renamed from: a */
    public void mo82840a(byte[] bArr, float[] fArr) {
        m83326a(-1, bArr, fArr, 3);
    }

    @Override // com.tencent.liteav.capturer.InterfaceC14106b
    /* JADX INFO: renamed from: a */
    public void mo83344a(byte[] bArr) {
        InterfaceC14020m interfaceC14020m = this.f59039h;
        if (interfaceC14020m != null) {
            interfaceC14020m.mo82770a(bArr);
        }
    }
}
