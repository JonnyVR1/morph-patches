package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class i5l0 {

    /* JADX INFO: renamed from: a */
    public final ooi f111598a = new ooi();

    /* JADX INFO: renamed from: b */
    @Nullable
    public final InterfaceC17485b f111599b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final ChoreographerFrameCallbackC17488e f111600c;

    /* JADX INFO: renamed from: d */
    public boolean f111601d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Surface f111602e;

    /* JADX INFO: renamed from: f */
    public float f111603f;

    /* JADX INFO: renamed from: g */
    public float f111604g;

    /* JADX INFO: renamed from: h */
    public float f111605h;

    /* JADX INFO: renamed from: i */
    public float f111606i;

    /* JADX INFO: renamed from: j */
    public int f111607j;

    /* JADX INFO: renamed from: k */
    public long f111608k;

    /* JADX INFO: renamed from: l */
    public long f111609l;

    /* JADX INFO: renamed from: m */
    public long f111610m;

    /* JADX INFO: renamed from: n */
    public long f111611n;

    /* JADX INFO: renamed from: o */
    public long f111612o;

    /* JADX INFO: renamed from: p */
    public long f111613p;

    /* JADX INFO: renamed from: q */
    public long f111614q;

    /* JADX INFO: renamed from: l.i5l0$a */
    @RequiresApi(30)
    public static final class C17484a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m134506a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                jwv.m143684d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: renamed from: l.i5l0$b */
    public interface InterfaceC17485b {

        /* JADX INFO: renamed from: l.i5l0$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo124530a(@Nullable Display display);
        }

        /* JADX INFO: renamed from: a */
        void mo134507a(a aVar);

        void unregister();
    }

    /* JADX INFO: renamed from: l.i5l0$e */
    public static final class ChoreographerFrameCallbackC17488e implements Choreographer.FrameCallback, Handler.Callback {
        private static final ChoreographerFrameCallbackC17488e INSTANCE = new ChoreographerFrameCallbackC17488e();

        /* JADX INFO: renamed from: a */
        public volatile long f111618a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public final Handler f111619b;

        /* JADX INFO: renamed from: c */
        public final HandlerThread f111620c;

        /* JADX INFO: renamed from: d */
        public Choreographer f111621d;

        /* JADX INFO: renamed from: e */
        public int f111622e;

        public ChoreographerFrameCallbackC17488e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f111620c = handlerThread;
            handlerThread.start();
            Handler handlerM197894v = vck0.m197894v(handlerThread.getLooper(), this);
            this.f111619b = handlerM197894v;
            handlerM197894v.sendEmptyMessage(0);
        }

        /* JADX INFO: renamed from: d */
        public static ChoreographerFrameCallbackC17488e m134511d() {
            return INSTANCE;
        }

        /* JADX INFO: renamed from: a */
        public void m134512a() {
            this.f111619b.sendEmptyMessage(1);
        }

        /* JADX INFO: renamed from: b */
        public final void m134513b() {
            Choreographer choreographer = this.f111621d;
            if (choreographer != null) {
                int i = this.f111622e + 1;
                this.f111622e = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m134514c() {
            try {
                this.f111621d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                jwv.m143690j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f111618a = j;
            ((Choreographer) p11.m167011e(this.f111621d)).postFrameCallbackDelayed(this, 500L);
        }

        /* JADX INFO: renamed from: e */
        public void m134515e() {
            this.f111619b.sendEmptyMessage(2);
        }

        /* JADX INFO: renamed from: f */
        public final void m134516f() {
            Choreographer choreographer = this.f111621d;
            if (choreographer != null) {
                int i = this.f111622e - 1;
                this.f111622e = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f111618a = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m134514c();
                return true;
            }
            if (i == 1) {
                m134513b();
                return true;
            }
            if (i != 2) {
                return false;
            }
            m134516f();
            return true;
        }
    }

    public i5l0(@Nullable Context context) {
        InterfaceC17485b interfaceC17485bM134491f = m134491f(context);
        this.f111599b = interfaceC17485bM134491f;
        this.f111600c = interfaceC17485bM134491f != null ? ChoreographerFrameCallbackC17488e.m134511d() : null;
        this.f111608k = -9223372036854775807L;
        this.f111609l = -9223372036854775807L;
        this.f111603f = -1.0f;
        this.f111606i = 1.0f;
        this.f111607j = 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m134489c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* JADX INFO: renamed from: e */
    public static long m134490e(long j, long j2, long j3) {
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
    public static InterfaceC17485b m134491f(@Nullable Context context) {
        InterfaceC17485b interfaceC17485bM134509c = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            interfaceC17485bM134509c = vck0.f180948a >= 17 ? C17487d.m134509c(applicationContext) : null;
            if (interfaceC17485bM134509c == null) {
                return C17486c.m134508b(applicationContext);
            }
        }
        return interfaceC17485bM134509c;
    }

    /* JADX INFO: renamed from: b */
    public long m134492b(long j) {
        long j2;
        if (this.f111613p == -1 || !this.f111598a.m165262e()) {
            j2 = j;
        } else {
            long jM165258a = this.f111614q + ((long) ((this.f111598a.m165258a() * (this.f111610m - this.f111613p)) / this.f111606i));
            if (m134489c(j, jM165258a)) {
                j2 = jM165258a;
            } else {
                m134501n();
                j2 = j;
            }
        }
        this.f111611n = this.f111610m;
        this.f111612o = j2;
        ChoreographerFrameCallbackC17488e choreographerFrameCallbackC17488e = this.f111600c;
        if (choreographerFrameCallbackC17488e != null && this.f111608k != -9223372036854775807L) {
            long j3 = choreographerFrameCallbackC17488e.f111618a;
            if (j3 != -9223372036854775807L) {
                return m134490e(j2, j3, this.f111608k) - this.f111609l;
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: d */
    public final void m134493d() {
        Surface surface;
        if (vck0.f180948a < 30 || (surface = this.f111602e) == null || this.f111607j == Integer.MIN_VALUE || this.f111605h == 0.0f) {
            return;
        }
        this.f111605h = 0.0f;
        C17484a.m134506a(surface, 0.0f);
    }

    /* JADX INFO: renamed from: g */
    public void m134494g(float f) {
        this.f111603f = f;
        this.f111598a.m165264g();
        m134504q();
    }

    /* JADX INFO: renamed from: h */
    public void m134495h(long j) {
        long j2 = this.f111611n;
        if (j2 != -1) {
            this.f111613p = j2;
            this.f111614q = this.f111612o;
        }
        this.f111610m++;
        this.f111598a.m165263f(j * 1000);
        m134504q();
    }

    /* JADX INFO: renamed from: i */
    public void m134496i(float f) {
        this.f111606i = f;
        m134501n();
        m134505r(false);
    }

    /* JADX INFO: renamed from: j */
    public void m134497j() {
        m134501n();
    }

    /* JADX INFO: renamed from: k */
    public void m134498k() {
        this.f111601d = true;
        m134501n();
        if (this.f111599b != null) {
            ((ChoreographerFrameCallbackC17488e) p11.m167011e(this.f111600c)).m134512a();
            this.f111599b.mo134507a(new InterfaceC17485b.a() { // from class: l.g5l0
                @Override // p149l.i5l0.InterfaceC17485b.a
                /* JADX INFO: renamed from: a */
                public final void mo124530a(Display display) {
                    this.f101171a.m134503p(display);
                }
            });
        }
        m134505r(false);
    }

    /* JADX INFO: renamed from: l */
    public void m134499l() {
        this.f111601d = false;
        InterfaceC17485b interfaceC17485b = this.f111599b;
        if (interfaceC17485b != null) {
            interfaceC17485b.unregister();
            ((ChoreographerFrameCallbackC17488e) p11.m167011e(this.f111600c)).m134515e();
        }
        m134493d();
    }

    /* JADX INFO: renamed from: m */
    public void m134500m(@Nullable Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f111602e == surface) {
            return;
        }
        m134493d();
        this.f111602e = surface;
        m134505r(true);
    }

    /* JADX INFO: renamed from: n */
    public final void m134501n() {
        this.f111610m = 0L;
        this.f111613p = -1L;
        this.f111611n = -1L;
    }

    /* JADX INFO: renamed from: o */
    public void m134502o(int i) {
        if (this.f111607j == i) {
            return;
        }
        this.f111607j = i;
        m134505r(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m134503p(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f111608k = refreshRate;
            this.f111609l = (refreshRate * 80) / 100;
        } else {
            jwv.m143689i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f111608k = -9223372036854775807L;
            this.f111609l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m134504q() {
        if (vck0.f180948a < 30 || this.f111602e == null) {
            return;
        }
        float fM165259b = this.f111598a.m165262e() ? this.f111598a.m165259b() : this.f111603f;
        float f = this.f111604g;
        if (fM165259b == f) {
            return;
        }
        if (fM165259b != -1.0f && f != -1.0f) {
            if (Math.abs(fM165259b - this.f111604g) < ((!this.f111598a.m165262e() || this.f111598a.m165261d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fM165259b == -1.0f && this.f111598a.m165260c() < 30) {
            return;
        }
        this.f111604g = fM165259b;
        m134505r(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX INFO: renamed from: r */
    public final void m134505r(boolean z) {
        Surface surface;
        float f;
        if (vck0.f180948a < 30 || (surface = this.f111602e) == null || this.f111607j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f111601d) {
            float f2 = this.f111604g;
            if (f2 != -1.0f) {
                f = f2 * this.f111606i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f111605h != f) {
            this.f111605h = f;
            C17484a.m134506a(surface, f);
        }
    }

    /* JADX INFO: renamed from: l.i5l0$c */
    public static final class C17486c implements InterfaceC17485b {

        /* JADX INFO: renamed from: a */
        public final WindowManager f111615a;

        public C17486c(WindowManager windowManager) {
            this.f111615a = windowManager;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static InterfaceC17485b m134508b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
            if (windowManager != null) {
                return new C17486c(windowManager);
            }
            return null;
        }

        @Override // p149l.i5l0.InterfaceC17485b
        /* JADX INFO: renamed from: a */
        public void mo134507a(InterfaceC17485b.a aVar) {
            aVar.mo124530a(this.f111615a.getDefaultDisplay());
        }

        @Override // p149l.i5l0.InterfaceC17485b
        public void unregister() {
        }
    }

    /* JADX INFO: renamed from: l.i5l0$d */
    @RequiresApi(17)
    public static final class C17487d implements InterfaceC17485b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a */
        public final DisplayManager f111616a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public InterfaceC17485b.a f111617b;

        public C17487d(DisplayManager displayManager) {
            this.f111616a = displayManager;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static InterfaceC17485b m134509c(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (displayManager != null) {
                return new C17487d(displayManager);
            }
            return null;
        }

        @Override // p149l.i5l0.InterfaceC17485b
        /* JADX INFO: renamed from: a */
        public void mo134507a(InterfaceC17485b.a aVar) {
            this.f111617b = aVar;
            this.f111616a.registerDisplayListener(this, vck0.m197896w());
            aVar.mo124530a(m134510b());
        }

        /* JADX INFO: renamed from: b */
        public final Display m134510b() {
            return this.f111616a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            InterfaceC17485b.a aVar = this.f111617b;
            if (aVar == null || i != 0) {
                return;
            }
            aVar.mo124530a(m134510b());
        }

        @Override // p149l.i5l0.InterfaceC17485b
        public void unregister() {
            this.f111616a.unregisterDisplayListener(this);
            this.f111617b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
