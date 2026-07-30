package p153l;

import android.app.Application;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes5.dex */
public class jx5 {

    /* JADX INFO: renamed from: d */
    public wxl f122990d;

    /* JADX INFO: renamed from: e */
    public smc0 f122991e;

    /* JADX INFO: renamed from: f */
    public kcg0 f122992f;

    /* JADX INFO: renamed from: h */
    public Handler f122994h;

    /* JADX INFO: renamed from: i */
    public HandlerThread f122995i;

    /* JADX INFO: renamed from: n */
    public InterfaceC13050a f123000n;

    /* JADX INFO: renamed from: a */
    public final Object f122987a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f122988b = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f122989c = new Object();

    /* JADX INFO: renamed from: g */
    public int f122993g = 0;

    /* JADX INFO: renamed from: j */
    public gxl.AbstractC17341g f122996j = new C18048a();

    /* JADX INFO: renamed from: k */
    public AtomicBoolean f122997k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    public volatile AtomicBoolean f122998l = new AtomicBoolean(true);

    /* JADX INFO: renamed from: m */
    public AtomicBoolean f122999m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l.jx5$a */
    public class C18048a extends gxl.AbstractC17341g {
        public C18048a() {
        }

        @Override // p153l.gxl.AbstractC17341g
        /* JADX INFO: renamed from: c */
        public void mo132884c(int i, int i2, gxl gxlVar) {
            jx5.this.m147312K(i, i2, gxlVar);
            boolean z = jx5.this.f122999m.get();
            jx5 jx5Var = jx5.this;
            if (z) {
                jx5Var.f122991e.m186795m().mo204126a("change state failed, because is force stop");
                return;
            }
            if (!jx5Var.f122997k.get()) {
                jx5.this.f122991e.m186795m().mo204126a("change state failed, because is stop");
                return;
            }
            if (i2 == 4) {
                jx5.this.m147316O(4);
                jx5.this.m147324v();
            } else if (i2 == 6) {
                jx5.this.m147315N();
                jx5.this.m147317P();
            } else if (i2 == 7) {
                jx5.this.m147326x(i2);
            } else if (i2 == 5) {
                jx5.this.m147318Q();
                jx5.this.m147324v();
            } else if (i2 == 12) {
                jx5.this.m147326x(i2);
            } else if (i2 == 13) {
                jx5.this.f122991e.m186791i().mo135096a(new TimeoutException("keep alive time out"));
                jx5.this.m147326x(i2);
            }
            nsh0.m164608j("[live]long_link_status", gxlVar.m132878c() + ",currentState=" + i2);
        }
    }

    /* JADX INFO: renamed from: l.jx5$b */
    public class C18049b implements Handler.Callback {
        public C18049b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                jx5.this.m147303B();
            } else if (i == 2) {
                jx5.this.m147302A();
            } else if (i == 3) {
                jx5.this.m147304C();
            } else if (i == 4) {
                jx5.this.m147305D();
            }
            return true;
        }
    }

    public jx5(smc0 smc0Var, Application application) {
        HandlerThread handlerThread = new HandlerThread("live_long_link_connect_event");
        this.f122995i = handlerThread;
        handlerThread.start();
        this.f122994h = new Handler(this.f122995i.getLooper(), new C18049b());
        this.f122991e = smc0Var;
        smc0Var.m186789g().m152763c(new qcj() { // from class: l.fx5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((l4f.InterfaceC18342a) obj) instanceof gxl);
            }
        }, this.f122996j);
        this.f122992f = ConnectivityReceiver.m82473m().distinctUntilChanged().onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.gx5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106892a.m147306E((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m147285a(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: A */
    public final void m147302A() {
        if (!this.f122997k.get()) {
            this.f122991e.m186795m().mo204126a("is no start can not connect");
            return;
        }
        if (!this.f122998l.get()) {
            this.f122991e.m186795m().mo204126a("connect network not available for retryConnect");
            return;
        }
        InterfaceC13050a interfaceC13050a = this.f123000n;
        if (interfaceC13050a != null && interfaceC13050a.isConnected()) {
            this.f122991e.m186795m().mo204126a("connection connect for retryConnect");
            return;
        }
        synchronized (this.f122989c) {
            this.f122993g++;
        }
        this.f122991e.m186797o().f161094i = 1;
        this.f122991e.m186797o().f161096k = pzi0.m174454o();
        this.f122991e.m186797o().f161100o = this.f122993g;
        if (vxr.m203876d().m170964A0()) {
            z1w.m218383d(this.f122991e.m186797o()).subscribe(dhw.m115829h(new y20() { // from class: l.hx5
                @Override // p153l.y20
                public final void call(Object obj) {
                    jx5.m147285a((uxj0) obj);
                }
            }));
        }
        m147314M();
    }

    /* JADX INFO: renamed from: B */
    public final void m147303B() {
        this.f122991e.m186797o().f161094i = 0;
        long jM174454o = pzi0.m174454o();
        this.f122991e.m186797o().f161095j = jM174454o;
        this.f122991e.m186797o().f161096k = jM174454o;
        this.f122991e.m186795m().mo204126a("do start connect");
        if (!this.f122998l.get()) {
            this.f122991e.m186795m().mo204126a("connect network not available for startConnect");
            return;
        }
        InterfaceC13050a interfaceC13050a = this.f123000n;
        if (interfaceC13050a != null && interfaceC13050a.isConnected()) {
            this.f122991e.m186795m().mo204126a("already connected return");
        } else {
            this.f122991e.m186793k().mo76666d();
            m147314M();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m147304C() {
        this.f122991e.m186797o().f161097l = pzi0.m174454o();
        this.f122991e.m186795m().mo204126a("handle stop connect");
        InterfaceC13050a interfaceC13050a = this.f123000n;
        if (interfaceC13050a == null || !interfaceC13050a.isConnected()) {
            return;
        }
        this.f122991e.m186795m().mo204126a("stop connect done");
        m147308G();
        this.f123000n.mo76692c();
    }

    /* JADX INFO: renamed from: D */
    public final void m147305D() {
        m147323u();
        m147304C();
        m147322t();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m147306E(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m82467g()) {
            m147310I();
        } else {
            m147311J();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m147307F() {
        this.f122991e.m186783a(new gzq());
    }

    /* JADX INFO: renamed from: G */
    public final void m147308G() {
        this.f122991e.m186793k().mo76666d();
        this.f122991e.m186794l().mo76666d();
        this.f122991e.m186784b().mo76666d();
        this.f122991e.m186796n().mo76666d();
        Iterator<bzm> it = this.f122991e.m186792j().iterator();
        while (it.hasNext()) {
            it.next().mo76666d();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m147309H() {
        this.f122991e.m186793k().mo107179e();
        this.f122991e.m186794l().mo107179e();
        this.f122991e.m186784b().mo107179e();
        this.f122991e.m186796n().mo107179e();
        Iterator<bzm> it = this.f122991e.m186792j().iterator();
        while (it.hasNext()) {
            it.next().mo107179e();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m147310I() {
        this.f122991e.m186795m().mo204126a("network connect");
        this.f122991e.m186791i().mo135099d(true);
        if (this.f122998l.compareAndSet(false, true)) {
            m147324v();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m147311J() {
        this.f122991e.m186795m().mo204126a("network disconnect");
        this.f122998l.set(false);
        this.f122991e.m186791i().mo135099d(false);
        m147315N();
    }

    /* JADX INFO: renamed from: K */
    public void m147312K(int i, int i2, gxl gxlVar) {
        this.f122991e.m186795m().mo204126a(m3g0.m156929a(i) + "----->" + m3g0.m156929a(i2));
        this.f122991e.m186791i().mo135097b(i, i2, gxlVar);
    }

    /* JADX INFO: renamed from: L */
    public BufferedSource m147313L() throws Exception {
        BufferedSource bufferedSource;
        synchronized (this.f122987a) {
            try {
                InterfaceC13050a interfaceC13050a = this.f123000n;
                if (interfaceC13050a == null) {
                    throw new Exception("connection is null writePacket start wait");
                }
                if (!interfaceC13050a.isConnected()) {
                    throw new Exception("readPacket error state:" + m3g0.m156929a(this.f123000n.getCurrentState()));
                }
                bufferedSource = this.f123000n.read();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bufferedSource;
    }

    /* JADX INFO: renamed from: M */
    public final void m147314M() {
        try {
            this.f123000n = this.f122991e.m186787e().mo76695a(this.f122991e, this.f122993g);
            if (this.f122997k.get()) {
                this.f123000n.mo76680a();
            } else {
                m147322t();
            }
        } catch (Exception e) {
            this.f122991e.m186795m().mo204127b(e);
            this.f122991e.m186791i().mo135096a(e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m147315N() {
        synchronized (this.f122989c) {
            this.f122993g = 0;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m147316O(int i) {
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
        this.f122991e.m186797o().f161101p = String.valueOf(i2);
    }

    /* JADX INFO: renamed from: P */
    public final void m147317P() {
        if (this.f122991e.m186801s() != null) {
            m147318Q();
            wxl wxlVarMo107428b = this.f122991e.m186801s().mo107428b(new Runnable() { // from class: l.ix5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117341a.m147307F();
                }
            }, this.f122991e.m186800r());
            this.f122990d = wxlVarMo107428b;
            wxlVarMo107428b.start();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m147318Q() {
        wxl wxlVar = this.f122990d;
        if (wxlVar != null) {
            wxlVar.stop();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m147319R(Buffer buffer) throws Exception {
        synchronized (this.f122988b) {
            try {
                InterfaceC13050a interfaceC13050a = this.f123000n;
                if (interfaceC13050a == null) {
                    this.f122991e.m186795m().mo204126a("connection is null writePacket start wait");
                    return;
                }
                if (interfaceC13050a.isConnected()) {
                    this.f123000n.mo76681b(buffer);
                    return;
                }
                this.f122991e.m186795m().mo204126a("writePacket drop this packet current state:" + m3g0.m156929a(this.f123000n.getCurrentState()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m147320r() {
        try {
            if (this.f122997k.compareAndSet(false, true)) {
                m147325w();
            } else {
                this.f122991e.m186795m().mo204126a("already started can not connect");
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            this.f122991e.m186795m().mo204127b(e);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m147321s() {
        try {
            if (this.f122997k.compareAndSet(true, false)) {
                m147327y();
            } else {
                this.f122991e.m186795m().mo204126a("already stop can not disconnect");
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            this.f122991e.m186795m().mo204127b(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m147322t() {
        this.f122991e.m186789g().m152764d(this.f122996j);
        this.f122991e.m186800r().m221993c();
        this.f122991e.m186791i().mo135100e();
        try {
            this.f122995i.quit();
        } catch (SecurityException unused) {
        }
        m147315N();
        this.f122998l.set(true);
        this.f122999m.set(false);
    }

    /* JADX INFO: renamed from: u */
    public final void m147323u() {
        this.f122991e.m186795m().mo204126a("shutdown the connect");
        m147315N();
        psd0.m173633z(this.f122992f);
        m147318Q();
        m147309H();
        this.f122991e.m186786d().m188949h();
    }

    /* JADX INFO: renamed from: v */
    public final void m147324v() {
        this.f122994h.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: w */
    public final void m147325w() {
        this.f122994h.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: x */
    public final void m147326x(int i) {
        m147316O(i);
        this.f122991e.m186795m().mo204126a("doStopConnect");
        this.f122994h.removeMessages(3);
        this.f122994h.sendEmptyMessage(3);
    }

    /* JADX INFO: renamed from: y */
    public final void m147327y() {
        this.f122994h.removeMessages(2);
        this.f122994h.removeMessages(3);
        this.f122994h.sendEmptyMessage(4);
    }

    /* JADX INFO: renamed from: z */
    public void m147328z() {
        this.f122999m.set(true);
    }
}
