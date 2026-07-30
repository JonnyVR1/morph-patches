package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.HeartBeat;
import com.p051p1.mobile.putong.core.message.R$string;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class vod0 {

    /* JADX INFO: renamed from: a */
    public final u1n0 f185028a;

    /* JADX INFO: renamed from: b */
    public kcg0 f185029b;

    /* JADX INFO: renamed from: c */
    public kcg0 f185030c;

    /* JADX INFO: renamed from: d */
    public kcg0 f185031d;

    /* JADX INFO: renamed from: e */
    public kcg0 f185032e;

    /* JADX INFO: renamed from: f */
    public long f185033f;

    /* JADX INFO: renamed from: g */
    public long f185034g = 45;

    /* JADX INFO: renamed from: h */
    public boolean f185035h;

    public vod0(u1n0 u1n0Var) {
        this.f185028a = u1n0Var;
        m202103m();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m202094d(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m202098h(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m202100j(int i) {
        if (i == 0) {
            m202109s();
            return;
        }
        if (i != 2) {
            return;
        }
        if (!jpd0.m146488c()) {
            jpd0.m146489d();
            o1j0.m165634h(R$string.f21765l7);
            return;
        }
        String str = this.f185028a.m194030f().f74160h;
        boolean zM194039o = this.f185028a.m194039o();
        u1n0 u1n0Var = this.f185028a;
        String str2 = zM194039o ? u1n0Var.m194030f().f74159g : u1n0Var.m194030f().f74158f;
        String str3 = this.f185028a.m194030f().f74161i;
        String str4 = this.f185028a.m194030f().f74163k;
        String str5 = this.f185028a.m194030f().f74162j;
        String str6 = this.f185028a.m194030f().f74164l;
        m202110t();
        uqx.m197379C().m197412K(str3, str6, str4, str5, str, str2);
        this.f185035h = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m202101k(boolean z) {
        if (z) {
            m202102l();
        } else if (this.f185028a.m194034j() - this.f185033f >= this.f185034g) {
            this.f185033f = this.f185028a.m194034j();
            this.f185034g = 45L;
            m202102l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m202102l() {
        CoreModule.f18264c.f20343R0.m182164o3(this.f185028a.m194036l(), Long.valueOf(uqx.m197379C().m197404B())).subscribe(psd0.m173597H(new y20() { // from class: l.sod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169880a.m202105o((HeartBeat) obj);
            }
        }, new y20() { // from class: l.tod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175395a.m202106p((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m202103m() {
        this.f185029b = this.f185028a.m194044t("rtcHelper", new y20() { // from class: l.lod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132895a.m202100j(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m202104n() {
        CoreModule.f18264c.f20384f0.m33905ap(this.f185028a.m194036l());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m202105o(HeartBeat heartBeat) {
        int i = heartBeat.interval;
        if (i > 0) {
            this.f185034g = i;
        } else {
            this.f185034g = 45L;
        }
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.uod0
            @Override // java.lang.Runnable
            public final void run() {
                this.f180035a.m202104n();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m202106p(Throwable th) {
        this.f185034g = 45L;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m202107q(Long l2) {
        this.f185028a.m194046v(l2.longValue());
        m202101k(false);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m202108r(t54 t54Var) {
        if (t54Var == t54.f172175f) {
            this.f185033f = 0L;
            m202101k(true);
        } else if (t54Var == t54.f172172c) {
            f5y.m124261b(App.f16088e);
        } else if (t54Var == t54.f172176g) {
            f5y.m124260a(App.f16088e, f5y.f97354b);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m202109s() {
        if (this.f185035h) {
            this.f185035h = false;
            uqx.m197379C().m197420S(0);
            uqx.m197379C().m197422V();
        }
        psd0.m173633z(this.f185031d);
        psd0.m173633z(this.f185032e);
        psd0.m173633z(this.f185030c);
    }

    /* JADX INFO: renamed from: t */
    public final void m202110t() {
        psd0.m173633z(this.f185031d);
        this.f185031d = uqx.m197379C().f180530l.skip(1).filter(new qcj() { // from class: l.mod0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.nod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142975a.m202107q((Long) obj);
            }
        }, new y20() { // from class: l.ood0
            @Override // p153l.y20
            public final void call(Object obj) {
                vod0.m202098h((Throwable) obj);
            }
        }));
        psd0.m173633z(this.f185032e);
        this.f185032e = uqx.m197379C().m197428v().subscribe(psd0.m173596G(new y20() { // from class: l.pod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153395a.m202108r((t54) obj);
            }
        }));
        psd0.m173633z(this.f185030c);
        C22421c<t54> c22421cSkip = uqx.m197379C().m197428v().skip(1);
        final u1n0 u1n0Var = this.f185028a;
        Objects.requireNonNull(u1n0Var);
        this.f185030c = c22421cSkip.subscribe(psd0.m173597H(new y20() { // from class: l.qod0
            @Override // p153l.y20
            public final void call(Object obj) {
                u1n0Var.m194037m((t54) obj);
            }
        }, new y20() { // from class: l.rod0
            @Override // p153l.y20
            public final void call(Object obj) {
                vod0.m202094d((Throwable) obj);
            }
        }));
    }
}
