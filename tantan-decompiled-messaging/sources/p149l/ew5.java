package p149l;

import android.app.Application;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public class ew5 {

    /* JADX INFO: renamed from: d */
    public evl f93442d;

    /* JADX INFO: renamed from: e */
    public lec0 f93443e;

    /* JADX INFO: renamed from: f */
    public c4g0 f93444f;

    /* JADX INFO: renamed from: h */
    public Handler f93446h;

    /* JADX INFO: renamed from: i */
    public HandlerThread f93447i;

    /* JADX INFO: renamed from: n */
    public InterfaceC12887a f93452n;

    /* JADX INFO: renamed from: a */
    public final Object f93439a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f93440b = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f93441c = new Object();

    /* JADX INFO: renamed from: g */
    public int f93445g = 0;

    /* JADX INFO: renamed from: j */
    public tul.AbstractC20288g f93448j = new C16695a();

    /* JADX INFO: renamed from: k */
    public AtomicBoolean f93449k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    public volatile AtomicBoolean f93450l = new AtomicBoolean(true);

    /* JADX INFO: renamed from: m */
    public AtomicBoolean f93451m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l.ew5$a */
    public class C16695a extends tul.AbstractC20288g {
        public C16695a() {
        }

        @Override // p149l.tul.AbstractC20288g
        /* JADX INFO: renamed from: c */
        public void mo118457c(int i, int i2, tul tulVar) {
            ew5.this.m118440K(i, i2, tulVar);
            boolean z = ew5.this.f93451m.get();
            ew5 ew5Var = ew5.this;
            if (z) {
                ew5Var.f93443e.m149499m().mo216485a("change state failed, because is force stop");
                return;
            }
            if (!ew5Var.f93449k.get()) {
                ew5.this.f93443e.m149499m().mo216485a("change state failed, because is stop");
                return;
            }
            if (i2 == 4) {
                ew5.this.m118444O(4);
                ew5.this.m118452v();
            } else if (i2 == 6) {
                ew5.this.m118443N();
                ew5.this.m118445P();
            } else if (i2 == 7) {
                ew5.this.m118454x(i2);
            } else if (i2 == 5) {
                ew5.this.m118446Q();
                ew5.this.m118452v();
            } else if (i2 == 12) {
                ew5.this.m118454x(i2);
            } else if (i2 == 13) {
                ew5.this.f93443e.m149495i().mo96775a(new TimeoutException("keep alive time out"));
                ew5.this.m118454x(i2);
            }
            gkh0.m126627j("[live]long_link_status", tulVar.m190708c() + ",currentState=" + i2);
        }
    }

    /* JADX INFO: renamed from: l.ew5$b */
    public class C16696b implements Handler.Callback {
        public C16696b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ew5.this.m118431B();
            } else if (i == 2) {
                ew5.this.m118430A();
            } else if (i == 3) {
                ew5.this.m118432C();
            } else if (i == 4) {
                ew5.this.m118433D();
            }
            return true;
        }
    }

    public ew5(lec0 lec0Var, Application application) {
        HandlerThread handlerThread = new HandlerThread("live_long_link_connect_event");
        this.f93447i = handlerThread;
        handlerThread.start();
        this.f93446h = new Handler(this.f93447i.getLooper(), new C16696b());
        this.f93443e = lec0Var;
        lec0Var.m149493g().m124263c(new w9j() { // from class: l.aw5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((g3f.InterfaceC16988a) obj) instanceof tul);
            }
        }, this.f93448j);
        this.f93444f = ConnectivityReceiver.m81290m().distinctUntilChanged().onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.bw5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77582a.m118434E((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m118413a(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: A */
    public final void m118430A() {
        if (!this.f93449k.get()) {
            this.f93443e.m149499m().mo216485a("is no start can not connect");
            return;
        }
        if (!this.f93450l.get()) {
            this.f93443e.m149499m().mo216485a("connect network not available for retryConnect");
            return;
        }
        InterfaceC12887a interfaceC12887a = this.f93452n;
        if (interfaceC12887a != null && interfaceC12887a.isConnected()) {
            this.f93443e.m149499m().mo216485a("connection connect for retryConnect");
            return;
        }
        synchronized (this.f93441c) {
            this.f93445g++;
        }
        this.f93443e.m149501o().f167382i = 1;
        this.f93443e.m149501o().f167384k = mqi0.m155944o();
        this.f93443e.m149501o().f167388o = this.f93445g;
        if (uvr.m196087d().m162657A0()) {
            b0w.m99792d(this.f93443e.m149501o()).subscribe(ffw.m121197h(new e30() { // from class: l.cw5
                @Override // p149l.e30
                public final void call(Object obj) {
                    ew5.m118413a((roj0) obj);
                }
            }));
        }
        m118442M();
    }

    /* JADX INFO: renamed from: B */
    public final void m118431B() {
        this.f93443e.m149501o().f167382i = 0;
        long jM155944o = mqi0.m155944o();
        this.f93443e.m149501o().f167383j = jM155944o;
        this.f93443e.m149501o().f167384k = jM155944o;
        this.f93443e.m149499m().mo216485a("do start connect");
        if (!this.f93450l.get()) {
            this.f93443e.m149499m().mo216485a("connect network not available for startConnect");
            return;
        }
        InterfaceC12887a interfaceC12887a = this.f93452n;
        if (interfaceC12887a != null && interfaceC12887a.isConnected()) {
            this.f93443e.m149499m().mo216485a("already connected return");
        } else {
            this.f93443e.m149497k().mo75483d();
            m118442M();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m118432C() {
        this.f93443e.m149501o().f167385l = mqi0.m155944o();
        this.f93443e.m149499m().mo216485a("handle stop connect");
        InterfaceC12887a interfaceC12887a = this.f93452n;
        if (interfaceC12887a == null || !interfaceC12887a.isConnected()) {
            return;
        }
        this.f93443e.m149499m().mo216485a("stop connect done");
        m118436G();
        this.f93452n.mo75509c();
    }

    /* JADX INFO: renamed from: D */
    public final void m118433D() {
        m118451u();
        m118432C();
        m118450t();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m118434E(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m81284g()) {
            m118438I();
        } else {
            m118439J();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m118435F() {
        this.f93443e.m149487a(new gxq());
    }

    /* JADX INFO: renamed from: G */
    public final void m118436G() {
        this.f93443e.m149497k().mo75483d();
        this.f93443e.m149498l().mo75483d();
        this.f93443e.m149488b().mo75483d();
        this.f93443e.m149500n().mo75483d();
        Iterator<bxm> it = this.f93443e.m149496j().iterator();
        while (it.hasNext()) {
            it.next().mo75483d();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m118437H() {
        this.f93443e.m149497k().mo104317e();
        this.f93443e.m149498l().mo104317e();
        this.f93443e.m149488b().mo104317e();
        this.f93443e.m149500n().mo104317e();
        Iterator<bxm> it = this.f93443e.m149496j().iterator();
        while (it.hasNext()) {
            it.next().mo104317e();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m118438I() {
        this.f93443e.m149499m().mo216485a("network connect");
        this.f93443e.m149495i().mo96778d(true);
        if (this.f93450l.compareAndSet(false, true)) {
            m118452v();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m118439J() {
        this.f93443e.m149499m().mo216485a("network disconnect");
        this.f93450l.set(false);
        this.f93443e.m149495i().mo96778d(false);
        m118443N();
    }

    /* JADX INFO: renamed from: K */
    public void m118440K(int i, int i2, tul tulVar) {
        this.f93443e.m149499m().mo216485a(dvf0.m113777a(i) + "----->" + dvf0.m113777a(i2));
        this.f93443e.m149495i().mo96776b(i, i2, tulVar);
    }

    /* JADX INFO: renamed from: L */
    public BufferedSource m118441L() throws Exception {
        BufferedSource bufferedSource;
        synchronized (this.f93439a) {
            try {
                InterfaceC12887a interfaceC12887a = this.f93452n;
                if (interfaceC12887a == null) {
                    throw new Exception("connection is null writePacket start wait");
                }
                if (!interfaceC12887a.isConnected()) {
                    throw new Exception("readPacket error state:" + dvf0.m113777a(this.f93452n.getCurrentState()));
                }
                bufferedSource = this.f93452n.read();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bufferedSource;
    }

    /* JADX INFO: renamed from: M */
    public final void m118442M() {
        try {
            this.f93452n = this.f93443e.m149491e().mo75512a(this.f93443e, this.f93445g);
            if (this.f93449k.get()) {
                this.f93452n.mo75497a();
            } else {
                m118450t();
            }
        } catch (Exception e) {
            this.f93443e.m149499m().mo216486b(e);
            this.f93443e.m149495i().mo96775a(e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m118443N() {
        synchronized (this.f93441c) {
            this.f93445g = 0;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m118444O(int i) {
        int i2 = 4;
        if (i == 4) {
            i2 = 1;
        } else if (i == 7) {
            i2 = 2;
        } else if (i == 12) {
            i2 = 3;
        } else if (i != 13) {
            i2 = 0;
        }
        this.f93443e.m149501o().f167389p = String.valueOf(i2);
    }

    /* JADX INFO: renamed from: P */
    public final void m118445P() {
        if (this.f93443e.m149505s() != null) {
            m118446Q();
            evl evlVarMo99788b = this.f93443e.m149505s().mo99788b(new Runnable() { // from class: l.dw5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88140a.m118435F();
                }
            }, this.f93443e.m149504r());
            this.f93442d = evlVarMo99788b;
            evlVarMo99788b.start();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m118446Q() {
        evl evlVar = this.f93442d;
        if (evlVar != null) {
            evlVar.stop();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m118447R(Buffer buffer) throws Exception {
        synchronized (this.f93440b) {
            try {
                InterfaceC12887a interfaceC12887a = this.f93452n;
                if (interfaceC12887a == null) {
                    this.f93443e.m149499m().mo216485a("connection is null writePacket start wait");
                    return;
                }
                if (interfaceC12887a.isConnected()) {
                    this.f93452n.mo75498b(buffer);
                    return;
                }
                this.f93443e.m149499m().mo216485a("writePacket drop this packet current state:" + dvf0.m113777a(this.f93452n.getCurrentState()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m118448r() {
        try {
            if (this.f93449k.compareAndSet(false, true)) {
                m118453w();
            } else {
                this.f93443e.m149499m().mo216485a("already started can not connect");
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            this.f93443e.m149499m().mo216486b(e);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m118449s() {
        try {
            if (this.f93449k.compareAndSet(true, false)) {
                m118455y();
            } else {
                this.f93443e.m149499m().mo216485a("already stop can not disconnect");
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            this.f93443e.m149499m().mo216486b(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m118450t() {
        this.f93443e.m149493g().m124264d(this.f93448j);
        this.f93443e.m149504r().m210431c();
        this.f93443e.m149495i().mo96779e();
        try {
            this.f93447i.quit();
        } catch (SecurityException unused) {
        }
        m118443N();
        this.f93450l.set(true);
        this.f93451m.set(false);
    }

    /* JADX INFO: renamed from: u */
    public final void m118451u() {
        this.f93443e.m149499m().mo216485a("shutdown the connect");
        m118443N();
        mkd0.m154992z(this.f93444f);
        m118446Q();
        m118437H();
        this.f93443e.m149490d().m191411h();
    }

    /* JADX INFO: renamed from: v */
    public final void m118452v() {
        this.f93446h.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: w */
    public final void m118453w() {
        this.f93446h.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: x */
    public final void m118454x(int i) {
        m118444O(i);
        this.f93443e.m149499m().mo216485a("doStopConnect");
        this.f93446h.removeMessages(3);
        this.f93446h.sendEmptyMessage(3);
    }

    /* JADX INFO: renamed from: y */
    public final void m118455y() {
        this.f93446h.removeMessages(2);
        this.f93446h.removeMessages(3);
        this.f93446h.sendEmptyMessage(4);
    }

    /* JADX INFO: renamed from: z */
    public void m118456z() {
        this.f93451m.set(true);
    }
}
