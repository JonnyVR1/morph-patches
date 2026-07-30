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
import com.tencent.liteav.basic.p091a.EnumC14168c;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.InterfaceC14183m;
import com.tencent.liteav.basic.p093c.InterfaceC14184n;
import com.tencent.liteav.basic.structs.C14205b;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.capturer.C14268a;
import com.tencent.liteav.capturer.InterfaceC14269b;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14266c implements InterfaceC14170b, InterfaceC14184n, InterfaceC14269b, InterfaceC14277k {

    /* JADX INFO: renamed from: a */
    WeakReference<InterfaceC14170b> f59880a;

    /* JADX INFO: renamed from: b */
    private Context f59881b;

    /* JADX INFO: renamed from: d */
    private InterfaceC14278l f59883d;

    /* JADX INFO: renamed from: e */
    private boolean f59884e;

    /* JADX INFO: renamed from: f */
    private C14273g f59885f;

    /* JADX INFO: renamed from: h */
    private InterfaceC14183m f59887h;

    /* JADX INFO: renamed from: k */
    private long f59890k;

    /* JADX INFO: renamed from: g */
    private int f59886g = 0;

    /* JADX INFO: renamed from: i */
    private boolean f59888i = false;

    /* JADX INFO: renamed from: j */
    private long f59889j = 0;

    /* JADX INFO: renamed from: l */
    private long f59891l = 0;

    /* JADX INFO: renamed from: m */
    private int f59892m = 0;

    /* JADX INFO: renamed from: n */
    private Object f59893n = new Object();

    /* JADX INFO: renamed from: o */
    private HandlerThread f59894o = null;

    /* JADX INFO: renamed from: p */
    private Handler f59895p = null;

    /* JADX INFO: renamed from: q */
    private String f59896q = "";

    /* JADX INFO: renamed from: r */
    private boolean f59897r = true;

    /* JADX INFO: renamed from: c */
    private final C14268a f59882c = new C14268a();

    /* JADX INFO: renamed from: com.tencent.liteav.c$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f59901a;

        static {
            int[] iArr = new int[EnumC14168c.values().length];
            f59901a = iArr;
            try {
                iArr[EnumC14168c.RESOLUTION_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59901a[EnumC14168c.RESOLUTION_TYPE_360_640.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59901a[EnumC14168c.RESOLUTION_TYPE_540_960.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59901a[EnumC14168c.RESOLUTION_TYPE_1080_1920.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59901a[EnumC14168c.RESOLUTION_TYPE_320_480.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59901a[EnumC14168c.RESOLUTION_TYPE_720_1280.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C14266c(Context context, C14273g c14273g, InterfaceC14183m interfaceC14183m, boolean z) {
        this.f59887h = null;
        try {
            this.f59885f = (C14273g) c14273g.clone();
        } catch (CloneNotSupportedException e) {
            this.f59885f = new C14273g();
            e.printStackTrace();
        }
        this.f59881b = context;
        this.f59887h = interfaceC14183m;
        interfaceC14183m.setSurfaceTextureListener(this);
        C14273g c14273g2 = this.f59885f;
        c14273g2.f60150W = z;
        this.f59882c.m84578b(c14273g2.f60148U);
    }

    /* JADX INFO: renamed from: a */
    private void m84509a(int i, byte[] bArr, float[] fArr, int i2) {
        if (this.f59884e) {
            boolean z = true;
            if (!this.f59888i) {
                Monitor.m84161a(2, String.format("VideoCapture[%d]: capture first frame", Integer.valueOf(hashCode())), "", 0);
                C14215f.m84219a(this.f59880a, 1007, "First frame capture completed");
                this.f59888i = true;
                this.f59897r = true;
                TXCLog.m84152i("CameraCapture", "trtc_render: render first frame");
            }
            C14205b c14205b = new C14205b();
            c14205b.f59314e = this.f59882c.m84591j();
            c14205b.f59315f = this.f59882c.m84592k();
            C14273g c14273g = this.f59885f;
            c14205b.f59316g = c14273g.f60153a;
            c14205b.f59317h = c14273g.f60154b;
            c14205b.f59319j = this.f59882c.m84589h();
            boolean zM84590i = this.f59882c.m84590i();
            C14273g c14273g2 = this.f59885f;
            if (!zM84590i) {
                z = c14273g2.f60146S;
            } else if (c14273g2.f60146S) {
                z = false;
            }
            c14205b.f59318i = z;
            c14205b.f59310a = i;
            c14205b.f59312c = fArr;
            C14273g c14273g3 = this.f59885f;
            c14205b.f59313d = c14273g3.f60150W;
            c14205b.f59322m = bArr;
            c14205b.f59311b = i2;
            int i3 = c14205b.f59319j;
            if (i3 == 0 || i3 == 180) {
                c14205b.f59316g = c14273g3.f60154b;
                c14205b.f59317h = c14273g3.f60153a;
            } else {
                c14205b.f59316g = c14273g3.f60153a;
                c14205b.f59317h = c14273g3.f60154b;
            }
            c14205b.f59321l = C14215f.m84217a(c14205b.f59314e, c14205b.f59315f, c14273g3.f60154b, c14273g3.f60153a);
            InterfaceC14278l interfaceC14278l = this.f59883d;
            if (interfaceC14278l != null) {
                interfaceC14278l.mo84669b(c14205b);
            }
            if (this.f59897r) {
                this.f59897r = false;
                TXCLog.m84152i("CameraCapture", String.format("vsize onCaptureFrame w*h:%d*%d angle:%d", Integer.valueOf(c14205b.f59316g), Integer.valueOf(c14205b.f59317h), Integer.valueOf(c14205b.f59319j)));
            }
            this.f59889j++;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f59890k;
            if (jCurrentTimeMillis >= 1000) {
                TXCStatus.m84177a(this.f59896q, 1001, this.f59892m, Double.valueOf(((this.f59889j - this.f59891l) * 1000.0d) / jCurrentTimeMillis));
                this.f59891l = this.f59889j;
                this.f59890k += jCurrentTimeMillis;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84512c(SurfaceTexture surfaceTexture) {
        C14268a c14268a;
        if (surfaceTexture == null || this.f59884e || (c14268a = this.f59882c) == null) {
            return;
        }
        c14268a.m84575a(this);
        this.f59882c.m84573a(surfaceTexture);
        this.f59882c.m84572a(this.f59885f.f60160h);
        this.f59882c.m84581c(this.f59885f.f60164l);
        this.f59882c.m84582c(this.f59885f.f60138K);
        this.f59882c.m84574a(m84515n());
        C14268a c14268a2 = this.f59882c;
        C14273g c14273g = this.f59885f;
        c14268a2.m84576a(c14273g.f60150W, c14273g.f60153a, c14273g.f60154b);
        TXCLog.m84152i("CameraCapture", String.format("vsize startCapture w*h:%d*%d orientation:%d", Integer.valueOf(this.f59885f.f60153a), Integer.valueOf(this.f59885f.f60154b), Integer.valueOf(this.f59885f.f60164l)));
        if (this.f59882c.m84584d(this.f59885f.f60165m) != 0) {
            this.f59884e = false;
            m84508a(-1301, "Failed to open camera, please confirm whether the camera permission is turned on");
            return;
        }
        this.f59884e = true;
        this.f59890k = System.currentTimeMillis();
        Monitor.m84161a(2, String.format("VideoCapture[%d]: start %s camera successfully", Integer.valueOf(hashCode()), this.f59885f.f60165m ? "front" : "back"), "", 0);
        m84508a(1003, "Enabled camera successfully");
        this.f59888i = false;
    }

    /* JADX INFO: renamed from: n */
    private C14268a.a m84515n() {
        C14273g c14273g = this.f59885f;
        if (c14273g.f60147T) {
            return C14268a.a.RESOLUTION_HIGHEST;
        }
        int i = AnonymousClass3.f59901a[c14273g.f60163k.ordinal()];
        if (i == 1) {
            return C14268a.a.RESOLUTION_INVALID;
        }
        if (i == 2) {
            return C14268a.a.RESOLUTION_360_640;
        }
        if (i == 3) {
            return C14268a.a.RESOLUTION_540_960;
        }
        if (i != 4) {
            return i != 5 ? C14268a.a.RESOLUTION_720_1280 : C14268a.a.RESOLUTION_320_480;
        }
        return C14268a.a.RESOLUTION_1080_1920;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public boolean m84516o() {
        try {
            Context context = this.f59881b;
            if (context != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    TXCLog.m84156w("CameraCapture", "List of RunningAppProcessInfo is null");
                    return false;
                }
                for (int i = 0; i < runningAppProcesses.size(); i++) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                    if (runningAppProcessInfo == null) {
                        TXCLog.m84156w("CameraCapture", "ActivityManager.RunningAppProcessInfo is null");
                    } else if (runningAppProcessInfo.processName.equals(this.f59881b.getPackageName()) && runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: b */
    public void mo84532b(boolean z) {
        C14268a c14268a;
        boolean z2;
        if (!this.f59884e || (c14268a = this.f59882c) == null) {
            return;
        }
        C14273g c14273g = this.f59885f;
        if (z) {
            z2 = !c14273g.f60165m;
        } else {
            z2 = c14273g.f60165m;
        }
        c14273g.f60165m = z2;
        c14268a.m84588g();
        this.f59887h.mo83952a(false);
        this.f59882c.m84572a(this.f59885f.f60160h);
        this.f59882c.m84581c(this.f59885f.f60164l);
        this.f59882c.m84574a(m84515n());
        C14268a c14268a2 = this.f59882c;
        C14273g c14273g2 = this.f59885f;
        c14268a2.m84576a(c14273g2.f60150W, c14273g2.f60153a, c14273g2.f60154b);
        this.f59882c.m84575a(this);
        this.f59882c.m84573a(this.f59887h.getSurfaceTexture());
        TXCLog.m84152i("CameraCapture", String.format("vsize refreshCapture w*h:%d*%d orientation:%d", Integer.valueOf(this.f59885f.f60153a), Integer.valueOf(this.f59885f.f60154b), Integer.valueOf(this.f59885f.f60164l)));
        if (this.f59882c.m84584d(this.f59885f.f60165m) == 0) {
            this.f59884e = true;
            Monitor.m84161a(2, String.format("VideoCapture[%d]: start %s camera successfully", Integer.valueOf(hashCode()), this.f59885f.f60165m ? "front" : "back"), "", 0);
            m84508a(1003, "Enabled camera successfully");
        } else {
            this.f59884e = false;
            m84508a(-1301, "Failed to open the camera, please confirm whether the camera permission is turned on");
        }
        this.f59888i = false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: d */
    public void mo84536d(int i) {
        InterfaceC14183m interfaceC14183m = this.f59887h;
        if (interfaceC14183m != null) {
            interfaceC14183m.setRendMirror(i);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: e */
    public void mo84540e(int i) {
        this.f59885f.f60164l = i;
        this.f59882c.m84581c(i);
        this.f59897r = true;
        TXCLog.m84152i("CameraCapture", String.format("vsize setCaptureOrientation w*h:%d*%d orientation:%d", Integer.valueOf(this.f59885f.f60153a), Integer.valueOf(this.f59885f.f60154b), Integer.valueOf(this.f59885f.f60164l)));
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: f */
    public void mo84543f(int i) {
        this.f59885f.f60160h = i;
        C14268a c14268a = this.f59882c;
        if (c14268a != null) {
            c14268a.m84572a(i);
        }
        InterfaceC14183m interfaceC14183m = this.f59887h;
        if (interfaceC14183m == null || !(interfaceC14183m instanceof TXCGLSurfaceView)) {
            return;
        }
        ((TXCGLSurfaceView) interfaceC14183m).setFPS(i);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: g */
    public int mo84544g() {
        return this.f59885f.f60160h;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: h */
    public boolean mo84546h() {
        C14268a c14268a = this.f59882c;
        if (c14268a != null) {
            return c14268a.m84579b();
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: i */
    public boolean mo84547i() {
        C14268a c14268a = this.f59882c;
        if (c14268a != null) {
            return c14268a.m84583c();
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: j */
    public boolean mo84548j() {
        C14268a c14268a = this.f59882c;
        if (c14268a != null) {
            return c14268a.m84585d();
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: k */
    public boolean mo84549k() {
        C14268a c14268a = this.f59882c;
        if (c14268a != null) {
            return c14268a.m84586e();
        }
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: l */
    public boolean mo84550l() {
        C14268a c14268a = this.f59882c;
        if (c14268a != null) {
            return c14268a.m84590i();
        }
        return false;
    }

    @Override // com.tencent.liteav.capturer.InterfaceC14269b
    /* JADX INFO: renamed from: m */
    public void mo84551m() {
        if (this.f59882c.m84593l() != null) {
            this.f59882c.m84588g();
        }
        synchronized (this.f59893n) {
            try {
                if (this.f59894o == null) {
                    HandlerThread handlerThread = new HandlerThread("cameraMonitorThread");
                    this.f59894o = handlerThread;
                    handlerThread.start();
                    this.f59895p = new Handler(this.f59894o.getLooper());
                    TXCLog.m84156w("CameraCapture", "start camera monitor ");
                }
                Handler handler = this.f59895p;
                if (handler != null) {
                    handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.c.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                if (!C14266c.this.mo84537d() || !C14266c.this.m84516o() || C14266c.this.f59882c.m84593l() != null) {
                                    if (C14266c.this.f59895p != null) {
                                        C14266c.this.f59895p.postDelayed(this, 2000L);
                                        return;
                                    }
                                    return;
                                }
                                TXCLog.m84156w("CameraCapture", "camera monitor restart capture");
                                C14266c.this.f59882c.m84588g();
                                C14266c.this.f59887h.mo83952a(false);
                                C14266c.this.f59882c.m84572a(C14266c.this.f59885f.f60160h);
                                C14266c.this.f59882c.m84576a(C14266c.this.f59885f.f60150W, C14266c.this.f59885f.f60153a, C14266c.this.f59885f.f60154b);
                                C14266c.this.f59882c.m84573a(C14266c.this.f59887h.getSurfaceTexture());
                                C14266c.this.f59882c.m84584d(C14266c.this.f59885f.f60165m);
                            } catch (Exception unused) {
                                TXCLog.m84156w("CameraCapture", "camera monitor exception ");
                            }
                        }
                    }, 2000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
    public void onNotifyEvent(int i, Bundle bundle) {
        C14215f.m84218a(this.f59880a, i, bundle);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: g */
    public void mo84545g(int i) {
        this.f59892m = i;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: d */
    public boolean mo84537d() {
        return this.f59884e;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: d */
    public boolean mo84538d(boolean z) {
        return this.f59882c.m84577a(z);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: f */
    public EGLContext mo84542f() {
        return this.f59887h.getGLContext();
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: e */
    public int mo84539e() {
        return this.f59882c.m84587f();
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: e */
    public void mo84541e(boolean z) {
        this.f59885f.f60148U = z;
        this.f59882c.m84578b(z);
        this.f59897r = true;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: c */
    public void mo84533c() {
        TXCLog.m84152i("CameraCapture", "stopCapture->enter with null");
        this.f59882c.m84575a((InterfaceC14269b) null);
        this.f59882c.m84588g();
        this.f59884e = false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: c */
    public void mo84534c(int i) {
        InterfaceC14183m interfaceC14183m = this.f59887h;
        if (interfaceC14183m != null) {
            interfaceC14183m.setRendMode(i);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: c */
    public void mo84535c(final boolean z) {
        mo84524a(new Runnable() { // from class: com.tencent.liteav.c.1
            @Override // java.lang.Runnable
            public void run() {
                C14266c.this.f59885f.f60146S = z;
            }
        });
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: b */
    public void mo84529b() {
        TXCLog.m84152i("CameraCapture", "startCapture->enter with getSurfaceTexture:" + this.f59887h.getSurfaceTexture());
        m84512c(this.f59887h.getSurfaceTexture());
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: b */
    public void mo84530b(int i) {
        this.f59886g = i;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: b */
    public void mo84531b(int i, int i2) {
        C14273g c14273g = this.f59885f;
        c14273g.f60153a = i;
        c14273g.f60154b = i2;
        this.f59897r = true;
        TXCLog.m84152i("CameraCapture", String.format("vsize setVideoEncSize w*h:%d*%d orientation:%d", Integer.valueOf(i), Integer.valueOf(this.f59885f.f60154b), Integer.valueOf(this.f59885f.f60164l)));
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14184n
    /* JADX INFO: renamed from: b */
    public void mo84024b(SurfaceTexture surfaceTexture) {
        mo84533c();
        TXCLog.m84152i("CameraCapture", "onSurfaceTextureDestroy->enter with mListener:" + this.f59883d);
        InterfaceC14278l interfaceC14278l = this.f59883d;
        if (interfaceC14278l != null) {
            interfaceC14278l.mo84700q();
        }
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84517a() {
        Monitor.m84161a(2, String.format("VideoCapture[%d]: start camera", Integer.valueOf(hashCode())), "", 0);
        TXCLog.m84152i("CameraCapture", "start->enter with getSurfaceTexture:" + this.f59887h.getSurfaceTexture());
        InterfaceC14183m interfaceC14183m = this.f59887h;
        C14273g c14273g = this.f59885f;
        interfaceC14183m.mo83949a(c14273g.f60160h, !c14273g.f60150W);
        m84512c(this.f59887h.getSurfaceTexture());
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84526a(boolean z) {
        Monitor.m84161a(2, String.format("VideoCapture[%d]: stop camera", Integer.valueOf(hashCode())), "", 0);
        mo84533c();
        this.f59887h.mo83948a();
        synchronized (this.f59893n) {
            try {
                Handler handler = this.f59895p;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (this.f59894o != null) {
                    TXCLog.m84156w("CameraCapture", "stop camera monitor ");
                    this.f59894o.quit();
                    this.f59894o = null;
                    this.f59895p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84525a(String str) {
        this.f59896q = str;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public boolean mo84528a(int i) {
        return this.f59882c.m84580b(i);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84519a(int i, int i2) {
        this.f59882c.m84571a(i, i2);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84523a(InterfaceC14278l interfaceC14278l) {
        this.f59883d = interfaceC14278l;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84522a(C14205b c14205b) {
        InterfaceC14183m interfaceC14183m = this.f59887h;
        if (interfaceC14183m != null) {
            interfaceC14183m.mo83950a(c14205b.f59310a, c14205b.f59318i, this.f59886g, c14205b.f59314e, c14205b.f59315f, this.f59882c.m84590i());
        }
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84524a(Runnable runnable) {
        this.f59887h.mo83951a(runnable);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84521a(InterfaceC14170b interfaceC14170b) {
        this.f59880a = new WeakReference<>(interfaceC14170b);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84520a(EnumC14168c enumC14168c) {
        this.f59885f.f60163k = enumC14168c;
        this.f59897r = true;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84518a(float f, float f2) {
        C14268a c14268a = this.f59882c;
        if (c14268a == null || !this.f59885f.f60138K) {
            return;
        }
        c14268a.m84571a(f, f2);
    }

    /* JADX INFO: renamed from: a */
    private void m84508a(int i, String str) {
        C14215f.m84219a(this.f59880a, i, str);
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14184n
    /* JADX INFO: renamed from: a */
    public void mo84022a(SurfaceTexture surfaceTexture) {
        TXCLog.m84152i("CameraCapture", "onSurfaceTextureAvailable->enter with mListener:" + this.f59883d);
        m84512c(surfaceTexture);
        InterfaceC14278l interfaceC14278l = this.f59883d;
        if (interfaceC14278l != null) {
            interfaceC14278l.mo84656a(surfaceTexture);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14184n
    /* JADX INFO: renamed from: a */
    public int mo84021a(int i, float[] fArr) {
        m84509a(i, null, fArr, 4);
        return 0;
    }

    @Override // com.tencent.liteav.basic.p093c.InterfaceC14184n
    /* JADX INFO: renamed from: a */
    public void mo84023a(byte[] bArr, float[] fArr) {
        m84509a(-1, bArr, fArr, 3);
    }

    @Override // com.tencent.liteav.capturer.InterfaceC14269b
    /* JADX INFO: renamed from: a */
    public void mo84527a(byte[] bArr) {
        InterfaceC14183m interfaceC14183m = this.f59887h;
        if (interfaceC14183m != null) {
            interfaceC14183m.mo83953a(bArr);
        }
    }
}
