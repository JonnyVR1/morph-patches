package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.HeartBeat;
import com.p046p1.mobile.putong.core.message.R$string;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class sgd0 {

    /* JADX INFO: renamed from: a */
    public final qsm0 f164410a;

    /* JADX INFO: renamed from: b */
    public c4g0 f164411b;

    /* JADX INFO: renamed from: c */
    public c4g0 f164412c;

    /* JADX INFO: renamed from: d */
    public c4g0 f164413d;

    /* JADX INFO: renamed from: e */
    public c4g0 f164414e;

    /* JADX INFO: renamed from: f */
    public long f164415f;

    /* JADX INFO: renamed from: g */
    public long f164416g = 45;

    /* JADX INFO: renamed from: h */
    public boolean f164417h;

    public sgd0(qsm0 qsm0Var) {
        this.f164410a = qsm0Var;
        m184061m();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m184052d(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m184056h(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m184058j(int i) {
        if (i == 0) {
            m184067s();
            return;
        }
        if (i != 2) {
            return;
        }
        if (!ghd0.m126179c()) {
            ghd0.m126180d();
            lsi0.m151578h(R$string.f21023l7);
            return;
        }
        String str = this.f164410a.m176312f().f187551h;
        boolean zM176321o = this.f164410a.m176321o();
        qsm0 qsm0Var = this.f164410a;
        String str2 = zM176321o ? qsm0Var.m176312f().f187550g : qsm0Var.m176312f().f187549f;
        String str3 = this.f164410a.m176312f().f187552i;
        String str4 = this.f164410a.m176312f().f187554k;
        String str5 = this.f164410a.m176312f().f187553j;
        String str6 = this.f164410a.m176312f().f187555l;
        m184068t();
        xhx.m208850C().m208883K(str3, str6, str4, str5, str, str2);
        this.f164417h = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m184059k(boolean z) {
        if (z) {
            m184060l();
        } else if (this.f164410a.m176316j() - this.f164415f >= this.f164416g) {
            this.f164415f = this.f164410a.m176316j();
            this.f164416g = 45L;
            m184060l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m184060l() {
        CoreModule.f17545c.f19601R0.m112450o3(this.f164410a.m176318l(), Long.valueOf(xhx.m208850C().m208875B())).subscribe(mkd0.m154956H(new e30() { // from class: l.pgd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148634a.m184063o((HeartBeat) obj);
            }
        }, new e30() { // from class: l.qgd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154324a.m184064p((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m184061m() {
        this.f164411b = this.f164410a.m176326t("rtcHelper", new e30() { // from class: l.igd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113107a.m184058j(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m184062n() {
        CoreModule.f17545c.f19642f0.m32902ap(this.f164410a.m176318l());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m184063o(HeartBeat heartBeat) {
        int i = heartBeat.interval;
        if (i > 0) {
            this.f164416g = i;
        } else {
            this.f164416g = 45L;
        }
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.rgd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159240a.m184062n();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m184064p(Throwable th) {
        this.f164416g = 45L;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m184065q(Long l2) {
        this.f164410a.m176328v(l2.longValue());
        m184059k(false);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m184066r(u44 u44Var) {
        if (u44Var == u44.f173686f) {
            this.f164415f = 0L;
            m184059k(true);
        } else if (u44Var == u44.f173683c) {
            iwx.m138782b(App.f15369e);
        } else if (u44Var == u44.f173687g) {
            iwx.m138781a(App.f15369e, iwx.f115315b);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m184067s() {
        if (this.f164417h) {
            this.f164417h = false;
            xhx.m208850C().m208891S(0);
            xhx.m208850C().m208893V();
        }
        mkd0.m154992z(this.f164413d);
        mkd0.m154992z(this.f164414e);
        mkd0.m154992z(this.f164412c);
    }

    /* JADX INFO: renamed from: t */
    public final void m184068t() {
        mkd0.m154992z(this.f164413d);
        this.f164413d = xhx.m208850C().f192943l.skip(1).filter(new w9j() { // from class: l.jgd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.kgd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123024a.m184065q((Long) obj);
            }
        }, new e30() { // from class: l.lgd0
            @Override // p149l.e30
            public final void call(Object obj) {
                sgd0.m184056h((Throwable) obj);
            }
        }));
        mkd0.m154992z(this.f164414e);
        this.f164414e = xhx.m208850C().m208899v().subscribe(mkd0.m154955G(new e30() { // from class: l.mgd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133673a.m184066r((u44) obj);
            }
        }));
        mkd0.m154992z(this.f164412c);
        C22306c<u44> c22306cSkip = xhx.m208850C().m208899v().skip(1);
        final qsm0 qsm0Var = this.f164410a;
        Objects.requireNonNull(qsm0Var);
        this.f164412c = c22306cSkip.subscribe(mkd0.m154956H(new e30() { // from class: l.ngd0
            @Override // p149l.e30
            public final void call(Object obj) {
                qsm0Var.m176319m((u44) obj);
            }
        }, new e30() { // from class: l.ogd0
            @Override // p149l.e30
            public final void call(Object obj) {
                sgd0.m184052d((Throwable) obj);
            }
        }));
    }
}
