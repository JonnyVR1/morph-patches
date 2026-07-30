package p153l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mel0 {

    /* JADX INFO: renamed from: a */
    public final kri f136520a = new kri();

    /* JADX INFO: renamed from: b */
    @Nullable
    public final InterfaceC18599b f136521b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final ChoreographerFrameCallbackC18602e f136522c;

    /* JADX INFO: renamed from: d */
    public boolean f136523d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Surface f136524e;

    /* JADX INFO: renamed from: f */
    public float f136525f;

    /* JADX INFO: renamed from: g */
    public float f136526g;

    /* JADX INFO: renamed from: h */
    public float f136527h;

    /* JADX INFO: renamed from: i */
    public float f136528i;

    /* JADX INFO: renamed from: j */
    public int f136529j;

    /* JADX INFO: renamed from: k */
    public long f136530k;

    /* JADX INFO: renamed from: l */
    public long f136531l;

    /* JADX INFO: renamed from: m */
    public long f136532m;

    /* JADX INFO: renamed from: n */
    public long f136533n;

    /* JADX INFO: renamed from: o */
    public long f136534o;

    /* JADX INFO: renamed from: p */
    public long f136535p;

    /* JADX INFO: renamed from: q */
    public long f136536q;

    /* JADX INFO: renamed from: l.mel0$a */
    @RequiresApi(30)
    public static final class C18598a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m158052a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                kyv.m152146d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: renamed from: l.mel0$b */
    public interface InterfaceC18599b {

        /* JADX INFO: renamed from: l.mel0$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo149338a(@Nullable Display display);
        }

        /* JADX INFO: renamed from: a */
        void mo158053a(a aVar);

        void unregister();
    }

    /* JADX INFO: renamed from: l.mel0$e */
    public static final class ChoreographerFrameCallbackC18602e implements Choreographer.FrameCallback, Handler.Callback {
        private static final ChoreographerFrameCallbackC18602e INSTANCE = new ChoreographerFrameCallbackC18602e();

        /* JADX INFO: renamed from: a */
        public volatile long f136540a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public final Handler f136541b;

        /* JADX INFO: renamed from: c */
        public final HandlerThread f136542c;

        /* JADX INFO: renamed from: d */
        public Choreographer f136543d;

        /* JADX INFO: renamed from: e */
        public int f136544e;

        public ChoreographerFrameCallbackC18602e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f136542c = handlerThread;
            handlerThread.start();
            Handler handlerM105172v = bmk0.m105172v(handlerThread.getLooper(), this);
            this.f136541b = handlerM105172v;
            handlerM105172v.sendEmptyMessage(0);
        }

        /* JADX INFO: renamed from: d */
        public static ChoreographerFrameCallbackC18602e m158057d() {
            return INSTANCE;
        }

        /* JADX INFO: renamed from: a */
        public void m158058a() {
            this.f136541b.sendEmptyMessage(1);
        }

        /* JADX INFO: renamed from: b */
        public final void m158059b() {
            Choreographer choreographer = this.f136543d;
            if (choreographer != null) {
                int i = this.f136544e + 1;
                this.f136544e = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m158060c() {
            try {
                this.f136543d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                kyv.m152152j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f136540a = j;
            ((Choreographer) w11.m204369e(this.f136543d)).postFrameCallbackDelayed(this, 500L);
        }

        /* JADX INFO: renamed from: e */
        public void m158061e() {
            this.f136541b.sendEmptyMessage(2);
        }

        /* JADX INFO: renamed from: f */
        public final void m158062f() {
            Choreographer choreographer = this.f136543d;
            if (choreographer != null) {
                int i = this.f136544e - 1;
                this.f136544e = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f136540a = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m158060c();
                return true;
            }
            if (i == 1) {
                m158059b();
                return true;
            }
            if (i != 2) {
                return false;
            }
            m158062f();
            return true;
        }
    }

    public mel0(@Nullable Context context) {
        InterfaceC18599b interfaceC18599bM158037f = m158037f(context);
        this.f136521b = interfaceC18599bM158037f;
        this.f136522c = interfaceC18599bM158037f != null ? ChoreographerFrameCallbackC18602e.m158057d() : null;
        this.f136530k = -9223372036854775807L;
        this.f136531l = -9223372036854775807L;
        this.f136525f = -1.0f;
        this.f136528i = 1.0f;
        this.f136529j = 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m158035c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* JADX INFO: renamed from: e */
    public static long m158036e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j3 + j5;
            j4 = j5;
            j5 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static InterfaceC18599b m158037f(@Nullable Context context) {
        InterfaceC18599b interfaceC18599bM158055c = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            interfaceC18599bM158055c = bmk0.f77313a >= 17 ? C18601d.m158055c(applicationContext) : null;
            if (interfaceC18599bM158055c == null) {
                return C18600c.m158054b(applicationContext);
            }
        }
        return interfaceC18599bM158055c;
    }

    /* JADX INFO: renamed from: b */
    public long m158038b(long j) {
        long j2;
        if (this.f136535p == -1 || !this.f136520a.m151083e()) {
            j2 = j;
        } else {
            long jM151079a = this.f136536q + ((long) ((this.f136520a.m151079a() * (this.f136532m - this.f136535p)) / this.f136528i));
            if (m158035c(j, jM151079a)) {
                j2 = jM151079a;
            } else {
                m158047n();
                j2 = j;
            }
        }
        this.f136533n = this.f136532m;
        this.f136534o = j2;
        ChoreographerFrameCallbackC18602e choreographerFrameCallbackC18602e = this.f136522c;
        if (choreographerFrameCallbackC18602e != null && this.f136530k != -9223372036854775807L) {
            long j3 = choreographerFrameCallbackC18602e.f136540a;
            if (j3 != -9223372036854775807L) {
                return m158036e(j2, j3, this.f136530k) - this.f136531l;
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: d */
    public final void m158039d() {
        Surface surface;
        if (bmk0.f77313a < 30 || (surface = this.f136524e) == null || this.f136529j == Integer.MIN_VALUE || this.f136527h == 0.0f) {
            return;
        }
        this.f136527h = 0.0f;
        C18598a.m158052a(surface, 0.0f);
    }

    /* JADX INFO: renamed from: g */
    public void m158040g(float f) {
        this.f136525f = f;
        this.f136520a.m151085g();
        m158050q();
    }

    /* JADX INFO: renamed from: h */
    public void m158041h(long j) {
        long j2 = this.f136533n;
        if (j2 != -1) {
            this.f136535p = j2;
            this.f136536q = this.f136534o;
        }
        this.f136532m++;
        this.f136520a.m151084f(j * 1000);
        m158050q();
    }

    /* JADX INFO: renamed from: i */
    public void m158042i(float f) {
        this.f136528i = f;
        m158047n();
        m158051r(false);
    }

    /* JADX INFO: renamed from: j */
    public void m158043j() {
        m158047n();
    }

    /* JADX INFO: renamed from: k */
    public void m158044k() {
        this.f136523d = true;
        m158047n();
        if (this.f136521b != null) {
            ((ChoreographerFrameCallbackC18602e) w11.m204369e(this.f136522c)).m158058a();
            this.f136521b.mo158053a(new InterfaceC18599b.a() { // from class: l.kel0
                @Override // p153l.mel0.InterfaceC18599b.a
                /* JADX INFO: renamed from: a */
                public final void mo149338a(Display display) {
                    this.f126200a.m158049p(display);
                }
            });
        }
        m158051r(false);
    }

    /* JADX INFO: renamed from: l */
    public void m158045l() {
        this.f136523d = false;
        InterfaceC18599b interfaceC18599b = this.f136521b;
        if (interfaceC18599b != null) {
            interfaceC18599b.unregister();
            ((ChoreographerFrameCallbackC18602e) w11.m204369e(this.f136522c)).m158061e();
        }
        m158039d();
    }

    /* JADX INFO: renamed from: m */
    public void m158046m(@Nullable Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f136524e == surface) {
            return;
        }
        m158039d();
        this.f136524e = surface;
        m158051r(true);
    }

    /* JADX INFO: renamed from: n */
    public final void m158047n() {
        this.f136532m = 0L;
        this.f136535p = -1L;
        this.f136533n = -1L;
    }

    /* JADX INFO: renamed from: o */
    public void m158048o(int i) {
        if (this.f136529j == i) {
            return;
        }
        this.f136529j = i;
        m158051r(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m158049p(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f136530k = refreshRate;
            this.f136531l = (refreshRate * 80) / 100;
        } else {
            kyv.m152151i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f136530k = -9223372036854775807L;
            this.f136531l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m158050q() {
        if (bmk0.f77313a < 30 || this.f136524e == null) {
            return;
        }
        float fM151080b = this.f136520a.m151083e() ? this.f136520a.m151080b() : this.f136525f;
        float f = this.f136526g;
        if (fM151080b == f) {
            return;
        }
        if (fM151080b != -1.0f && f != -1.0f) {
            if (Math.abs(fM151080b - this.f136526g) < ((!this.f136520a.m151083e() || this.f136520a.m151082d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fM151080b == -1.0f && this.f136520a.m151081c() < 30) {
            return;
        }
        this.f136526g = fM151080b;
        m158051r(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX INFO: renamed from: r */
    public final void m158051r(boolean z) {
        Surface surface;
        float f;
        if (bmk0.f77313a < 30 || (surface = this.f136524e) == null || this.f136529j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f136523d) {
            float f2 = this.f136526g;
            if (f2 != -1.0f) {
                f = f2 * this.f136528i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f136527h != f) {
            this.f136527h = f;
            C18598a.m158052a(surface, f);
        }
    }

    /* JADX INFO: renamed from: l.mel0$c */
    public static final class C18600c implements InterfaceC18599b {

        /* JADX INFO: renamed from: a */
        public final WindowManager f136537a;

        public C18600c(WindowManager windowManager) {
            this.f136537a = windowManager;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static InterfaceC18599b m158054b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
            if (windowManager != null) {
                return new C18600c(windowManager);
            }
            return null;
        }

        @Override // p153l.mel0.InterfaceC18599b
        /* JADX INFO: renamed from: a */
        public void mo158053a(InterfaceC18599b.a aVar) {
            aVar.mo149338a(this.f136537a.getDefaultDisplay());
        }

        @Override // p153l.mel0.InterfaceC18599b
        public void unregister() {
        }
    }

    /* JADX INFO: renamed from: l.mel0$d */
    @RequiresApi(17)
    public static final class C18601d implements InterfaceC18599b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a */
        public final DisplayManager f136538a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public InterfaceC18599b.a f136539b;

        public C18601d(DisplayManager displayManager) {
            this.f136538a = displayManager;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static InterfaceC18599b m158055c(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (displayManager != null) {
                return new C18601d(displayManager);
            }
            return null;
        }

        @Override // p153l.mel0.InterfaceC18599b
        /* JADX INFO: renamed from: a */
        public void mo158053a(InterfaceC18599b.a aVar) {
            this.f136539b = aVar;
            this.f136538a.registerDisplayListener(this, bmk0.m105174w());
            aVar.mo149338a(m158056b());
        }

        /* JADX INFO: renamed from: b */
        public final Display m158056b() {
            return this.f136538a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            InterfaceC18599b.a aVar = this.f136539b;
            if (aVar == null || i != 0) {
                return;
            }
            aVar.mo149338a(m158056b());
        }

        @Override // p153l.mel0.InterfaceC18599b
        public void unregister() {
            this.f136538a.unregisterDisplayListener(this);
            this.f136539b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
