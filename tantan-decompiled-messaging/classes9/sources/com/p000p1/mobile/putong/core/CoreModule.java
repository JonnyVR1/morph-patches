package com.p000p1.mobile.putong.core;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p000p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p000p1.mobile.putong.app.SQLDBDamagedException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.core.api.C0167g0;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.DBCorruptException;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.putong.module.Module;
import l.c4g0;
import l.du2;
import l.e51;
import l.f8c;
import l.gr2;
import l.h4g0;
import l.r07;
import l.roj0;
import l.yni;
import p006l.a39;
import p006l.aok;
import p006l.ch0;
import p006l.ek8;
import p006l.f700;
import p006l.jva;
import p006l.qib0;
import p006l.ura;
import p006l.vx6;
import p006l.xz6;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "CoreModule", path = "/base_module/module")
public class CoreModule implements Module {

    /* JADX INFO: renamed from: b */
    public static Application f1533b;

    /* JADX INFO: renamed from: c */
    public static C0158c f1534c;

    /* JADX INFO: renamed from: d */
    public static vx6 f1535d;

    /* JADX INFO: renamed from: e */
    public static C0167g0 f1536e;

    /* JADX INFO: renamed from: f */
    public static aok f1537f;

    /* JADX INFO: renamed from: g */
    public static ch0 f1538g;

    /* JADX INFO: renamed from: h */
    public static jva f1539h;

    /* JADX INFO: renamed from: i */
    public static c4g0 f1540i;

    /* JADX INFO: renamed from: j */
    public static c4g0 f1541j;

    /* JADX INFO: renamed from: k */
    public static ek8 f1542k;

    /* JADX INFO: renamed from: l */
    public static a39 f1543l;

    /* JADX INFO: renamed from: m */
    public static gr2 f1544m;

    /* JADX INFO: renamed from: n */
    public static r07 f1545n;

    /* JADX INFO: renamed from: o */
    public static ura f1546o;

    /* JADX INFO: renamed from: a */
    public f700 f1547a = f700.m15089k();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m1849F() {
        C0154a.m3130G("");
        CoreData.new_();
    }

    /* JADX INFO: renamed from: H */
    public static AccountService m1850H() {
        return qib0.f19804b0.f17706a;
    }

    /* JADX INFO: renamed from: K */
    public static CoreService m1851K() {
        return qib0.f19804b0.f17707b;
    }

    /* JADX INFO: renamed from: M */
    private void m1852M() {
        if (f1544m == null) {
            f1544m = new gr2();
        }
    }

    /* JADX INFO: renamed from: N */
    public static FeedService m1853N() {
        return qib0.f19804b0.f17709d;
    }

    /* JADX INFO: renamed from: P */
    public static a39 m1854P() {
        return f1543l;
    }

    /* JADX INFO: renamed from: Q */
    public static LiveService m1855Q() {
        return qib0.f19804b0.f17708c;
    }

    /* JADX INFO: renamed from: R */
    public static void m1856R() {
        f1540i = h4g0.c(new c4g0[]{f1534c.m3402D3(), f1545n.S(), xz6.m27689h().m27698q()});
    }

    /* JADX INFO: renamed from: Ai */
    public void m1857Ai() {
        this.f1547a.m15090e();
    }

    /* JADX INFO: renamed from: Ec */
    public void m1858Ec() {
        f1539h = new jva();
        this.f1547a.m15094i();
        f1537f = new aok();
        f1535d = new vx6();
        this.f1547a.m15094i();
        f1536e = new C0167g0();
        f1538g = new ch0();
        AssetsSettingsBaseApi.m1308H(AssetsSettingsBaseApi.Module.CORE, 8);
    }

    /* JADX INFO: renamed from: J */
    public final void m1859J(Exception exc) {
        CrashHelper.c(exc);
        C0158c c0158c = f1534c;
        if (c0158c != null) {
            try {
                c0158c.clearRequestsAndStop();
            } catch (Exception e) {
                CrashHelper.c(e);
                du2.a("[putong-common][userMeState]", "Error when coreApi.clearRequestsAndStop() after ".concat(exc.getClass().getSimpleName()));
            }
        }
    }

    /* JADX INFO: renamed from: Jh */
    public c<roj0> m1860Jh() {
        return this.f1547a.m15101q();
    }

    /* JADX INFO: renamed from: L */
    public final void m1861L(boolean z) {
        if (z || f1534c == null) {
            f1534c = new C0158c();
        }
    }

    /* JADX INFO: renamed from: Ma */
    public void m1862Ma() {
        ek8 ek8Var = f1542k;
        if (ek8Var != null) {
            ek8Var.m14636i();
        }
        ek8 ek8Var2 = new ek8();
        f8c.o().y(ek8Var2);
        f1542k = ek8Var2;
        this.f1547a.m15095j();
    }

    /* JADX INFO: renamed from: Qh */
    public void m1863Qh() {
        m1852M();
        this.f1547a.m15091f();
    }

    /* JADX INFO: renamed from: Wn */
    public void m1864Wn() {
        this.f1547a.m15093h();
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m1865ft() {
        m1861L(true);
        return this.f1547a.m15100p();
    }

    public Context getContext() {
        return f1533b;
    }

    public void init(Context context) {
        f1533b = (Application) context;
        f1543l = a39.m11705c();
        f1546o = ura.m25555e();
        e51.s(new Runnable() { // from class: l.ss9
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.m1849F();
            }
        });
    }

    /* JADX INFO: renamed from: ms */
    public void m1866ms() {
        f1534c.f3628e0.m21408U6();
        this.f1547a.m15098n();
    }

    public void onLowMemory() {
        this.f1547a.m15097m();
    }

    public void onTrimMemory(int i) {
        this.f1547a.m15099o(i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.utils.DBCorruptException */
    /* JADX INFO: renamed from: tr */
    public void m1867tr(boolean z) throws DBCorruptException {
        try {
            LaunchStep launchStep = LaunchStep.EnsureCoreApi;
            yni.f(new LaunchStep[]{launchStep});
            m1861L(false);
            LaunchStep launchStep2 = LaunchStep.CreateMe;
            yni.e(launchStep, launchStep2);
            User userM21490p9 = f1534c.f3628e0.m21490p9();
            yni.d(launchStep2);
            if (userM21490p9 == null) {
                du2.a("[putong-common][userMeState]", "Query user me null after ensureCoreApi");
                throw new DBCorruptException("Query user me null after ensureCoreApi");
            }
            f1534c.f3628e0.f18974e5 = userM21490p9.hasAuditedMarray();
            f1534c.f3628e0.f18982f5 = userM21490p9.isFakePlayEnable();
            qib0.f19834y0 = userM21490p9.regionTag;
            m1852M();
            f1545n = new r07(f1534c);
            m1856R();
            LaunchStep launchStep3 = LaunchStep.CoreOtherAfterSignIn;
            yni.f(new LaunchStep[]{launchStep3});
            this.f1547a.m15092g(z);
            yni.d(launchStep3);
            if (z) {
                f1534c.m3401C3();
            }
            f1534c.f3628e0.m21370K7();
            f1534c.f3628e0.m21358H7();
            f1534c.f3666q2.m16905y3();
        } catch (SQLiteException e) {
            CrashHelper.c(e);
            if (!NullChecker.a(e.getMessage()) || (!e.getMessage().startsWith("Failed to change locale for db ") && !e.getMessage().contains("no such table"))) {
                throw e;
            }
            m1859J(e);
            throw new SQLDBDamagedException(e.getMessage());
        } catch (DBCorruptException e2) {
            CrashHelper.c(e2);
            m1859J(e2);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: zf */
    public void m1868zf() {
        this.f1547a.m15096l();
    }
}
