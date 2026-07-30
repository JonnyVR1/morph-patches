package com.p051p1.mobile.putong.core;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p051p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p051p1.mobile.putong.app.SQLDBDamagedException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.C4892g0;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.DBCorruptException;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.putong.module.Module;
import p137rx.C22421c;
import p153l.a17;
import p153l.gta;
import p153l.il8;
import p153l.j49;
import p153l.kcg0;
import p153l.l51;
import p153l.l9c;
import p153l.of00;
import p153l.pcg0;
import p153l.qqk;
import p153l.tu2;
import p153l.u17;
import p153l.uqb0;
import p153l.uqi;
import p153l.uxj0;
import p153l.vwa;
import p153l.wr2;
import p153l.yg0;
import p153l.yy6;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreModule", path = "/base_module/module")
public class CoreModule implements Module {

    /* JADX INFO: renamed from: b */
    public static Application f18263b;

    /* JADX INFO: renamed from: c */
    public static C4883c f18264c;

    /* JADX INFO: renamed from: d */
    public static yy6 f18265d;

    /* JADX INFO: renamed from: e */
    public static C4892g0 f18266e;

    /* JADX INFO: renamed from: f */
    public static qqk f18267f;

    /* JADX INFO: renamed from: g */
    public static yg0 f18268g;

    /* JADX INFO: renamed from: h */
    public static vwa f18269h;

    /* JADX INFO: renamed from: i */
    public static kcg0 f18270i;

    /* JADX INFO: renamed from: j */
    public static kcg0 f18271j;

    /* JADX INFO: renamed from: k */
    public static il8 f18272k;

    /* JADX INFO: renamed from: l */
    public static j49 f18273l;

    /* JADX INFO: renamed from: m */
    public static wr2 f18274m;

    /* JADX INFO: renamed from: n */
    public static u17 f18275n;

    /* JADX INFO: renamed from: o */
    public static gta f18276o;

    /* JADX INFO: renamed from: a */
    public of00 f18277a = of00.m167378k();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m30928F() {
        C4879a.m32203G("");
        CoreData.new_();
    }

    /* JADX INFO: renamed from: H */
    public static AccountService m30929H() {
        return uqb0.f180396b0.f170324a;
    }

    /* JADX INFO: renamed from: K */
    public static CoreService m30930K() {
        return uqb0.f180396b0.f170325b;
    }

    /* JADX INFO: renamed from: M */
    private void m30931M() {
        if (f18274m == null) {
            f18274m = new wr2();
        }
    }

    /* JADX INFO: renamed from: N */
    public static FeedService m30932N() {
        return uqb0.f180396b0.f170327d;
    }

    /* JADX INFO: renamed from: P */
    public static j49 m30933P() {
        return f18273l;
    }

    /* JADX INFO: renamed from: Q */
    public static LiveService m30934Q() {
        return uqb0.f180396b0.f170326c;
    }

    /* JADX INFO: renamed from: R */
    public static void m30935R() {
        f18270i = pcg0.m171650c(f18264c.m32475D3(), f18275n.m193943S(), a17.m95457h().m95466q());
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ai */
    public void mo30909Ai() {
        this.f18277a.m167379e();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo29133Ec() {
        f18269h = new vwa();
        this.f18277a.m167383i();
        f18267f = new qqk();
        f18265d = new yy6();
        this.f18277a.m167383i();
        f18266e = new C4892g0();
        f18268g = new yg0();
        AssetsSettingsBaseApi.m30400H(AssetsSettingsBaseApi.Module.CORE, 8);
    }

    /* JADX INFO: renamed from: J */
    public final void m30936J(Exception exc) {
        CrashHelper.m82479c(exc);
        C4883c c4883c = f18264c;
        if (c4883c != null) {
            try {
                c4883c.clearRequestsAndStop();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                tu2.m192703a("[putong-common][userMeState]", "Error when coreApi.clearRequestsAndStop() after ".concat(exc.getClass().getSimpleName()));
            }
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        return this.f18277a.m167390q();
    }

    /* JADX INFO: renamed from: L */
    public final void m30937L(boolean z) {
        if (z || f18264c == null) {
            f18264c = new C4883c();
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo29135Ma() {
        il8 il8Var = f18272k;
        if (il8Var != null) {
            il8Var.mo133950i();
        }
        il8 il8Var2 = new il8();
        l9c.m153394o().m153417y(il8Var2);
        f18272k = il8Var2;
        this.f18277a.m167384j();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        m30931M();
        this.f18277a.m167380f();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Wn */
    public void mo30910Wn() {
        this.f18277a.m167382h();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22421c<uxj0> mo29137ft() {
        m30937L(true);
        return this.f18277a.m167389p();
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return f18263b;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        f18263b = (Application) context;
        f18273l = j49.m143404c();
        f18276o = gta.m132210e();
        l51.m152913s(new Runnable() { // from class: l.du9
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.m30928F();
            }
        });
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo29138ms() {
        f18264c.f20381e0.m116518U6();
        this.f18277a.m167387n();
    }

    @Override // com.tantanapp.putong.module.Module
    public void onLowMemory() {
        this.f18277a.m167386m();
    }

    @Override // com.tantanapp.putong.module.Module
    public void onTrimMemory(int i) {
        this.f18277a.m167388o(i);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo29139tr(boolean z) {
        try {
            LaunchStep launchStep = LaunchStep.EnsureCoreApi;
            uqi.m197339f(launchStep);
            m30937L(false);
            LaunchStep launchStep2 = LaunchStep.CreateMe;
            uqi.m197338e(launchStep, launchStep2);
            User userM116600p9 = f18264c.f20381e0.m116600p9();
            uqi.m197337d(launchStep2);
            if (userM116600p9 == null) {
                tu2.m192703a("[putong-common][userMeState]", "Query user me null after ensureCoreApi");
                throw new DBCorruptException("Query user me null after ensureCoreApi");
            }
            f18264c.f20381e0.f89219e5 = userM116600p9.hasAuditedMarray();
            f18264c.f20381e0.f89227f5 = userM116600p9.isFakePlayEnable();
            uqb0.f180426y0 = userM116600p9.regionTag;
            m30931M();
            f18275n = new u17(f18264c);
            m30935R();
            LaunchStep launchStep3 = LaunchStep.CoreOtherAfterSignIn;
            uqi.m197339f(launchStep3);
            this.f18277a.m167381g(z);
            uqi.m197337d(launchStep3);
            if (z) {
                f18264c.m32474C3();
            }
            f18264c.f20381e0.m116480K7();
            f18264c.f20381e0.m116468H7();
            f18264c.f20419q2.m197499y3();
        } catch (SQLiteException e) {
            CrashHelper.m82479c(e);
            if (!NullChecker.m82486a(e.getMessage()) || (!e.getMessage().startsWith("Failed to change locale for db ") && !e.getMessage().contains("no such table"))) {
                throw e;
            }
            m30936J(e);
            throw new SQLDBDamagedException(e.getMessage());
        } catch (DBCorruptException e2) {
            CrashHelper.m82479c(e2);
            m30936J(e2);
            throw e2;
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: zf */
    public void mo30938zf() {
        this.f18277a.m167385l();
    }
}
