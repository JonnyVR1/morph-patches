package p009l;

import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.HeartBeat;
import com.p1.mobile.putong.core.message.R;
import java.util.Objects;
import l.c4g0;
import l.e30;
import l.e51;
import l.ghd0;
import l.iwx;
import l.lsi0;
import l.mkd0;
import l.u44;
import l.w9j;
import l.xhx;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sgd0 {

    /* JADX INFO: renamed from: a */
    public final qsm0 f20242a;

    /* JADX INFO: renamed from: b */
    public c4g0 f20243b;

    /* JADX INFO: renamed from: c */
    public c4g0 f20244c;

    /* JADX INFO: renamed from: d */
    public c4g0 f20245d;

    /* JADX INFO: renamed from: e */
    public c4g0 f20246e;

    /* JADX INFO: renamed from: f */
    public long f20247f;

    /* JADX INFO: renamed from: g */
    public long f20248g = 45;

    /* JADX INFO: renamed from: h */
    public boolean f20249h;

    public sgd0(qsm0 qsm0Var) {
        this.f20242a = qsm0Var;
        m22175m();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22166d(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m22170h(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m22172j(int i) {
        if (i == 0) {
            m22181s();
            return;
        }
        if (i != 2) {
            return;
        }
        if (!ghd0.c()) {
            ghd0.d();
            lsi0.h(R.string.l7);
            return;
        }
        String str = this.f20242a.m21245f().f22266h;
        boolean zM21254o = this.f20242a.m21254o();
        qsm0 qsm0Var = this.f20242a;
        String str2 = zM21254o ? qsm0Var.m21245f().f22265g : qsm0Var.m21245f().f22264f;
        String str3 = this.f20242a.m21245f().f22267i;
        String str4 = this.f20242a.m21245f().f22269k;
        String str5 = this.f20242a.m21245f().f22268j;
        String str6 = this.f20242a.m21245f().f22270l;
        m22182t();
        xhx.C().K(str3, str6, str4, str5, str, str2);
        this.f20249h = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m22173k(boolean z) {
        if (z) {
            m22174l();
        } else if (this.f20242a.m21249j() - this.f20247f >= this.f20248g) {
            this.f20247f = this.f20242a.m21249j();
            this.f20248g = 45L;
            m22174l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m22174l() {
        CoreModule.c.R0.o3(this.f20242a.m21251l(), Long.valueOf(xhx.C().B())).subscribe(mkd0.H(new e30() { // from class: l.pgd0
            public final void call(Object obj) {
                this.f18536a.m22177o((HeartBeat) obj);
            }
        }, new e30() { // from class: l.qgd0
            public final void call(Object obj) {
                this.f19233a.m22178p((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m22175m() {
        this.f20243b = this.f20242a.m21259t("rtcHelper", new e30() { // from class: l.igd0
            public final void call(Object obj) {
                this.f14611a.m22172j(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m22176n() {
        CoreModule.c.f0.ap(this.f20242a.m21251l());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m22177o(HeartBeat heartBeat) {
        int i = heartBeat.interval;
        if (i > 0) {
            this.f20248g = i;
        } else {
            this.f20248g = 45L;
        }
        e51.H(App.e, new Runnable() { // from class: l.rgd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19825a.m22176n();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m22178p(Throwable th) {
        this.f20248g = 45L;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m22179q(Long l2) {
        this.f20242a.m21261v(l2.longValue());
        m22173k(false);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m22180r(u44 u44Var) {
        if (u44Var == u44.f) {
            this.f20247f = 0L;
            m22173k(true);
        } else if (u44Var == u44.c) {
            iwx.b(App.e);
        } else if (u44Var == u44.g) {
            iwx.a(App.e, iwx.b);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m22181s() {
        if (this.f20249h) {
            this.f20249h = false;
            xhx.C().S(0);
            xhx.C().V();
        }
        mkd0.z(this.f20245d);
        mkd0.z(this.f20246e);
        mkd0.z(this.f20244c);
    }

    /* JADX INFO: renamed from: t */
    public final void m22182t() {
        mkd0.z(this.f20245d);
        this.f20245d = xhx.C().l.skip(1).filter(new w9j() { // from class: l.jgd0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.kgd0
            public final void call(Object obj) {
                this.f15664a.m22179q((Long) obj);
            }
        }, new e30() { // from class: l.lgd0
            public final void call(Object obj) {
                sgd0.m22170h((Throwable) obj);
            }
        }));
        mkd0.z(this.f20246e);
        this.f20246e = xhx.C().v().subscribe(mkd0.G(new e30() { // from class: l.mgd0
            public final void call(Object obj) {
                this.f16889a.m22180r((u44) obj);
            }
        }));
        mkd0.z(this.f20244c);
        c cVarSkip = xhx.C().v().skip(1);
        final qsm0 qsm0Var = this.f20242a;
        Objects.requireNonNull(qsm0Var);
        this.f20244c = cVarSkip.subscribe(mkd0.H(new e30() { // from class: l.ngd0
            public final void call(Object obj) {
                qsm0Var.m21252m((u44) obj);
            }
        }, new e30() { // from class: l.ogd0
            public final void call(Object obj) {
                sgd0.m22166d((Throwable) obj);
            }
        }));
    }
}
