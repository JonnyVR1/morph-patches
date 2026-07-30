package com.p046p1.mobile.putong.core;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p046p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p046p1.mobile.putong.app.SQLDBDamagedException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.C4741g0;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.DBCorruptException;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.putong.module.Module;
import p133rx.C22306c;
import p149l.a39;
import p149l.aok;
import p149l.c4g0;
import p149l.ch0;
import p149l.du2;
import p149l.e51;
import p149l.ek8;
import p149l.f700;
import p149l.f8c;
import p149l.gr2;
import p149l.h4g0;
import p149l.jva;
import p149l.qib0;
import p149l.r07;
import p149l.roj0;
import p149l.ura;
import p149l.vx6;
import p149l.xz6;
import p149l.yni;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreModule", path = "/base_module/module")
public class CoreModule implements Module {

    /* JADX INFO: renamed from: b */
    public static Application f17544b;

    /* JADX INFO: renamed from: c */
    public static C4732c f17545c;

    /* JADX INFO: renamed from: d */
    public static vx6 f17546d;

    /* JADX INFO: renamed from: e */
    public static C4741g0 f17547e;

    /* JADX INFO: renamed from: f */
    public static aok f17548f;

    /* JADX INFO: renamed from: g */
    public static ch0 f17549g;

    /* JADX INFO: renamed from: h */
    public static jva f17550h;

    /* JADX INFO: renamed from: i */
    public static c4g0 f17551i;

    /* JADX INFO: renamed from: j */
    public static c4g0 f17552j;

    /* JADX INFO: renamed from: k */
    public static ek8 f17553k;

    /* JADX INFO: renamed from: l */
    public static a39 f17554l;

    /* JADX INFO: renamed from: m */
    public static gr2 f17555m;

    /* JADX INFO: renamed from: n */
    public static r07 f17556n;

    /* JADX INFO: renamed from: o */
    public static ura f17557o;

    /* JADX INFO: renamed from: a */
    public f700 f17558a = f700.m119712k();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m29930F() {
        C4728a.m31200G("");
        CoreData.new_();
    }

    /* JADX INFO: renamed from: H */
    public static AccountService m29931H() {
        return qib0.f154713b0.f139230a;
    }

    /* JADX INFO: renamed from: K */
    public static CoreService m29932K() {
        return qib0.f154713b0.f139231b;
    }

    /* JADX INFO: renamed from: M */
    private void m29933M() {
        if (f17555m == null) {
            f17555m = new gr2();
        }
    }

    /* JADX INFO: renamed from: N */
    public static FeedService m29934N() {
        return qib0.f154713b0.f139233d;
    }

    /* JADX INFO: renamed from: P */
    public static a39 m29935P() {
        return f17554l;
    }

    /* JADX INFO: renamed from: Q */
    public static LiveService m29936Q() {
        return qib0.f154713b0.f139232c;
    }

    /* JADX INFO: renamed from: R */
    public static void m29937R() {
        f17551i = h4g0.m129242c(f17545c.m31472D3(), f17556n.m177374S(), xz6.m211889h().m211898q());
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ai */
    public void mo29911Ai() {
        this.f17558a.m119713e();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo28134Ec() {
        f17550h = new jva();
        this.f17558a.m119717i();
        f17548f = new aok();
        f17546d = new vx6();
        this.f17558a.m119717i();
        f17547e = new C4741g0();
        f17549g = new ch0();
        AssetsSettingsBaseApi.m29402H(AssetsSettingsBaseApi.Module.CORE, 8);
    }

    /* JADX INFO: renamed from: J */
    public final void m29938J(Exception exc) {
        CrashHelper.m81296c(exc);
        C4732c c4732c = f17545c;
        if (c4732c != null) {
            try {
                c4732c.clearRequestsAndStop();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                du2.m113670a("[putong-common][userMeState]", "Error when coreApi.clearRequestsAndStop() after ".concat(exc.getClass().getSimpleName()));
            }
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        return this.f17558a.m119724q();
    }

    /* JADX INFO: renamed from: L */
    public final void m29939L(boolean z) {
        if (z || f17545c == null) {
            f17545c = new C4732c();
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo28136Ma() {
        ek8 ek8Var = f17553k;
        if (ek8Var != null) {
            ek8Var.mo100767i();
        }
        ek8 ek8Var2 = new ek8();
        f8c.m119878o().m119901y(ek8Var2);
        f17553k = ek8Var2;
        this.f17558a.m119718j();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        m29933M();
        this.f17558a.m119714f();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Wn */
    public void mo29912Wn() {
        this.f17558a.m119716h();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22306c<roj0> mo28138ft() {
        m29939L(true);
        return this.f17558a.m119723p();
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return f17544b;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        f17544b = (Application) context;
        f17554l = a39.m94650c();
        f17557o = ura.m195053e();
        e51.m114768s(new Runnable() { // from class: l.ss9
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.m29930F();
            }
        });
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo28139ms() {
        f17545c.f19639e0.m169445U6();
        this.f17558a.m119721n();
    }

    @Override // com.tantanapp.putong.module.Module
    public void onLowMemory() {
        this.f17558a.m119720m();
    }

    @Override // com.tantanapp.putong.module.Module
    public void onTrimMemory(int i) {
        this.f17558a.m119722o(i);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo28140tr(boolean z) {
        try {
            LaunchStep launchStep = LaunchStep.EnsureCoreApi;
            yni.m215417f(launchStep);
            m29939L(false);
            LaunchStep launchStep2 = LaunchStep.CreateMe;
            yni.m215416e(launchStep, launchStep2);
            User userM169527p9 = f17545c.f19639e0.m169527p9();
            yni.m215415d(launchStep2);
            if (userM169527p9 == null) {
                du2.m113670a("[putong-common][userMeState]", "Query user me null after ensureCoreApi");
                throw new DBCorruptException("Query user me null after ensureCoreApi");
            }
            f17545c.f19639e0.f149362e5 = userM169527p9.hasAuditedMarray();
            f17545c.f19639e0.f149370f5 = userM169527p9.isFakePlayEnable();
            qib0.f154743y0 = userM169527p9.regionTag;
            m29933M();
            f17556n = new r07(f17545c);
            m29937R();
            LaunchStep launchStep3 = LaunchStep.CoreOtherAfterSignIn;
            yni.m215417f(launchStep3);
            this.f17558a.m119715g(z);
            yni.m215415d(launchStep3);
            if (z) {
                f17545c.m31471C3();
            }
            f17545c.f19639e0.m169407K7();
            f17545c.f19639e0.m169395H7();
            f17545c.f19677q2.m137718y3();
        } catch (SQLiteException e) {
            CrashHelper.m81296c(e);
            if (!NullChecker.m81303a(e.getMessage()) || (!e.getMessage().startsWith("Failed to change locale for db ") && !e.getMessage().contains("no such table"))) {
                throw e;
            }
            m29938J(e);
            throw new SQLDBDamagedException(e.getMessage());
        } catch (DBCorruptException e2) {
            CrashHelper.m81296c(e2);
            m29938J(e2);
            throw e2;
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: zf */
    public void mo29940zf() {
        this.f17558a.m119719l();
    }
}
