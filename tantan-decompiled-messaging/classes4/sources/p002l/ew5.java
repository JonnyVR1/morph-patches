package p002l;

import android.app.Application;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import l.c4g0;
import l.e30;
import l.ffw;
import l.gkh0;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.uvr;
import l.w9j;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ew5 {

    /* JADX INFO: renamed from: d */
    public evl f10006d;

    /* JADX INFO: renamed from: e */
    public lec0 f10007e;

    /* JADX INFO: renamed from: f */
    public c4g0 f10008f;

    /* JADX INFO: renamed from: h */
    public Handler f10010h;

    /* JADX INFO: renamed from: i */
    public HandlerThread f10011i;

    /* JADX INFO: renamed from: n */
    public InterfaceC0476a f10016n;

    /* JADX INFO: renamed from: a */
    public final Object f10003a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f10004b = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f10005c = new Object();

    /* JADX INFO: renamed from: g */
    public int f10009g = 0;

    /* JADX INFO: renamed from: j */
    public tul.AbstractC0845g f10012j = new C0552a();

    /* JADX INFO: renamed from: k */
    public AtomicBoolean f10013k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    public volatile AtomicBoolean f10014l = new AtomicBoolean(true);

    /* JADX INFO: renamed from: m */
    public AtomicBoolean f10015m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l.ew5$a */
    public class C0552a extends tul.AbstractC0845g {
        public C0552a() {
        }

        @Override // p002l.tul.AbstractC0845g
        /* JADX INFO: renamed from: c */
        public void mo12792c(int i, int i2, tul tulVar) {
            ew5.this.m12775K(i, i2, tulVar);
            boolean z = ew5.this.f10015m.get();
            ew5 ew5Var = ew5.this;
            if (z) {
                ew5Var.f10007e.m17157m().mo26978a("change state failed, because is force stop");
                return;
            }
            if (!ew5Var.f10013k.get()) {
                ew5.this.f10007e.m17157m().mo26978a("change state failed, because is stop");
                return;
            }
            if (i2 == 4) {
                ew5.this.m12779O(4);
                ew5.this.m12787v();
            } else if (i2 == 6) {
                ew5.this.m12778N();
                ew5.this.m12780P();
            } else if (i2 == 7) {
                ew5.this.m12789x(i2);
            } else if (i2 == 5) {
                ew5.this.m12781Q();
                ew5.this.m12787v();
            } else if (i2 == 12) {
                ew5.this.m12789x(i2);
            } else if (i2 == 13) {
                ew5.this.f10007e.m17153i().mo9786a(new TimeoutException("keep alive time out"));
                ew5.this.m12789x(i2);
            }
            gkh0.j("[live]long_link_status", tulVar.m23174c() + ",currentState=" + i2);
        }
    }

    /* JADX INFO: renamed from: l.ew5$b */
    public class C0553b implements Handler.Callback {
        public C0553b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ew5.this.m12766B();
            } else if (i == 2) {
                ew5.this.m12765A();
            } else if (i == 3) {
                ew5.this.m12767C();
            } else if (i == 4) {
                ew5.this.m12768D();
            }
            return true;
        }
    }

    public ew5(lec0 lec0Var, Application application) {
        HandlerThread handlerThread = new HandlerThread("live_long_link_connect_event");
        this.f10011i = handlerThread;
        handlerThread.start();
        this.f10010h = new Handler(this.f10011i.getLooper(), new C0553b());
        this.f10007e = lec0Var;
        lec0Var.m17151g().m13542c(new w9j() { // from class: l.aw5
            public final Object call(Object obj) {
                return Boolean.valueOf(((g3f.InterfaceC0581a) obj) instanceof tul);
            }
        }, this.f10012j);
        this.f10008f = ConnectivityReceiver.m().distinctUntilChanged().onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.bw5
            public final void call(Object obj) {
                this.f8386a.m12769E((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12748a(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: A */
    public final void m12765A() {
        if (!this.f10013k.get()) {
            this.f10007e.m17157m().mo26978a("is no start can not connect");
            return;
        }
        if (!this.f10014l.get()) {
            this.f10007e.m17157m().mo26978a("connect network not available for retryConnect");
            return;
        }
        InterfaceC0476a interfaceC0476a = this.f10016n;
        if (interfaceC0476a != null && interfaceC0476a.isConnected()) {
            this.f10007e.m17157m().mo26978a("connection connect for retryConnect");
            return;
        }
        synchronized (this.f10005c) {
            this.f10009g++;
        }
        this.f10007e.m17159o().f19374i = 1;
        this.f10007e.m17159o().f19376k = mqi0.o();
        this.f10007e.m17159o().f19380o = this.f10009g;
        if (uvr.d().A0()) {
            b0w.m10144d(this.f10007e.m17159o()).subscribe(ffw.h(new e30() { // from class: l.cw5
                public final void call(Object obj) {
                    ew5.m12748a((roj0) obj);
                }
            }));
        }
        m12777M();
    }

    /* JADX INFO: renamed from: B */
    public final void m12766B() {
        this.f10007e.m17159o().f19374i = 0;
        long jO = mqi0.o();
        this.f10007e.m17159o().f19375j = jO;
        this.f10007e.m17159o().f19376k = jO;
        this.f10007e.m17157m().mo26978a("do start connect");
        if (!this.f10014l.get()) {
            this.f10007e.m17157m().mo26978a("connect network not available for startConnect");
            return;
        }
        InterfaceC0476a interfaceC0476a = this.f10016n;
        if (interfaceC0476a != null && interfaceC0476a.isConnected()) {
            this.f10007e.m17157m().mo26978a("already connected return");
        } else {
            this.f10007e.m17155k().mo9118d();
            m12777M();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m12767C() {
        this.f10007e.m17159o().f19377l = mqi0.o();
        this.f10007e.m17157m().mo26978a("handle stop connect");
        InterfaceC0476a interfaceC0476a = this.f10016n;
        if (interfaceC0476a == null || !interfaceC0476a.isConnected()) {
            return;
        }
        this.f10007e.m17157m().mo26978a("stop connect done");
        m12771G();
        this.f10016n.mo9144c();
    }

    /* JADX INFO: renamed from: D */
    public final void m12768D() {
        m12786u();
        m12767C();
        m12785t();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m12769E(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.g()) {
            m12773I();
        } else {
            m12774J();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m12770F() {
        this.f10007e.m17145a(new gxq());
    }

    /* JADX INFO: renamed from: G */
    public final void m12771G() {
        this.f10007e.m17155k().mo9118d();
        this.f10007e.m17156l().mo9118d();
        this.f10007e.m17146b().mo9118d();
        this.f10007e.m17158n().mo9118d();
        Iterator<bxm> it = this.f10007e.m17154j().iterator();
        while (it.hasNext()) {
            it.next().mo9118d();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m12772H() {
        this.f10007e.m17155k().mo10636e();
        this.f10007e.m17156l().mo10636e();
        this.f10007e.m17146b().mo10636e();
        this.f10007e.m17158n().mo10636e();
        Iterator<bxm> it = this.f10007e.m17154j().iterator();
        while (it.hasNext()) {
            it.next().mo10636e();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m12773I() {
        this.f10007e.m17157m().mo26978a("network connect");
        this.f10007e.m17153i().mo9789d(true);
        if (this.f10014l.compareAndSet(false, true)) {
            m12787v();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m12774J() {
        this.f10007e.m17157m().mo26978a("network disconnect");
        this.f10014l.set(false);
        this.f10007e.m17153i().mo9789d(false);
        m12778N();
    }

    /* JADX INFO: renamed from: K */
    public void m12775K(int i, int i2, tul tulVar) {
        this.f10007e.m17157m().mo26978a(dvf0.m12059a(i) + "----->" + dvf0.m12059a(i2));
        this.f10007e.m17153i().mo9787b(i, i2, tulVar);
    }

    /* JADX INFO: renamed from: L */
    public BufferedSource m12776L() throws Exception {
        BufferedSource bufferedSource;
        synchronized (this.f10003a) {
            try {
                InterfaceC0476a interfaceC0476a = this.f10016n;
                if (interfaceC0476a == null) {
                    throw new Exception("connection is null writePacket start wait");
                }
                if (!interfaceC0476a.isConnected()) {
                    throw new Exception("readPacket error state:" + dvf0.m12059a(this.f10016n.getCurrentState()));
                }
                bufferedSource = this.f10016n.read();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bufferedSource;
    }

    /* JADX INFO: renamed from: M */
    public final void m12777M() {
        try {
            this.f10016n = this.f10007e.m17149e().mo9147a(this.f10007e, this.f10009g);
            if (this.f10013k.get()) {
                this.f10016n.mo9132a();
            } else {
                m12785t();
            }
        } catch (Exception e) {
            this.f10007e.m17157m().mo26979b(e);
            this.f10007e.m17153i().mo9786a(e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m12778N() {
        synchronized (this.f10005c) {
            this.f10009g = 0;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m12779O(int i) {
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
        this.f10007e.m17159o().f19381p = String.valueOf(i2);
    }

    /* JADX INFO: renamed from: P */
    public final void m12780P() {
        if (this.f10007e.m17163s() != null) {
            m12781Q();
            evl evlVarMo10140b = this.f10007e.m17163s().mo10140b(new Runnable() { // from class: l.dw5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9459a.m12770F();
                }
            }, this.f10007e.m17162r());
            this.f10006d = evlVarMo10140b;
            evlVarMo10140b.start();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m12781Q() {
        evl evlVar = this.f10006d;
        if (evlVar != null) {
            evlVar.stop();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m12782R(Buffer buffer) throws Exception {
        synchronized (this.f10004b) {
            try {
                InterfaceC0476a interfaceC0476a = this.f10016n;
                if (interfaceC0476a == null) {
                    this.f10007e.m17157m().mo26978a("connection is null writePacket start wait");
                    return;
                }
                if (interfaceC0476a.isConnected()) {
                    this.f10016n.mo9133b(buffer);
                    return;
                }
                this.f10007e.m17157m().mo26978a("writePacket drop this packet current state:" + dvf0.m12059a(this.f10016n.getCurrentState()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m12783r() {
        try {
            if (this.f10013k.compareAndSet(false, true)) {
                m12788w();
            } else {
                this.f10007e.m17157m().mo26978a("already started can not connect");
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            this.f10007e.m17157m().mo26979b(e);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m12784s() {
        try {
            if (this.f10013k.compareAndSet(true, false)) {
                m12790y();
            } else {
                this.f10007e.m17157m().mo26978a("already stop can not disconnect");
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            this.f10007e.m17157m().mo26979b(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12785t() {
        this.f10007e.m17151g().m13543d(this.f10012j);
        this.f10007e.m17162r().m26046c();
        this.f10007e.m17153i().mo9790e();
        try {
            this.f10011i.quit();
        } catch (SecurityException unused) {
        }
        m12778N();
        this.f10014l.set(true);
        this.f10015m.set(false);
    }

    /* JADX INFO: renamed from: u */
    public final void m12786u() {
        this.f10007e.m17157m().mo26978a("shutdown the connect");
        m12778N();
        mkd0.z(this.f10008f);
        m12781Q();
        m12772H();
        this.f10007e.m17148d().m23255h();
    }

    /* JADX INFO: renamed from: v */
    public final void m12787v() {
        this.f10010h.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: w */
    public final void m12788w() {
        this.f10010h.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: x */
    public final void m12789x(int i) {
        m12779O(i);
        this.f10007e.m17157m().mo26978a("doStopConnect");
        this.f10010h.removeMessages(3);
        this.f10010h.sendEmptyMessage(3);
    }

    /* JADX INFO: renamed from: y */
    public final void m12790y() {
        this.f10010h.removeMessages(2);
        this.f10010h.removeMessages(3);
        this.f10010h.sendEmptyMessage(4);
    }

    /* JADX INFO: renamed from: z */
    public void m12791z() {
        this.f10015m.set(true);
    }
}
