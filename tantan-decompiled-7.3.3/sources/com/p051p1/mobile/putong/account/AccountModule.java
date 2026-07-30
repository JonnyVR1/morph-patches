package com.p051p1.mobile.putong.account;

import android.app.Application;
import android.content.Context;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.api.ThirdPartLoginApi;
import com.p051p1.mobile.putong.account.p055ui.jsbridge.AccountBridgeImplementation;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p137rx.C22421c;
import p153l.C16074bp;
import p153l.C19457pw;
import p153l.C20407tv;
import p153l.C20681uv;
import p153l.C21091wf;
import p153l.C21827zj;
import p153l.cqq;
import p153l.djf0;
import p153l.ike;
import p153l.ino;
import p153l.l9c;
import p153l.rrq;
import p153l.uai0;
import p153l.uqb0;
import p153l.uxj0;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "AccountModule", path = "/account_module/module")
public class AccountModule implements Module {

    /* JADX INFO: renamed from: a */
    public static Application f16754a;

    /* JADX INFO: renamed from: b */
    public static C20681uv f16755b;

    /* JADX INFO: renamed from: c */
    public static C4726a f16756c;

    /* JADX INFO: renamed from: d */
    public static C19457pw f16757d;

    /* JADX INFO: renamed from: e */
    public static ThirdPartLoginApi f16758e;

    /* JADX INFO: renamed from: f */
    public static C21091wf f16759f;

    /* JADX INFO: renamed from: g */
    public static C21827zj f16760g;

    /* JADX INFO: renamed from: F */
    public static AccountService m29130F() {
        return uqb0.f180396b0.f170324a;
    }

    /* JADX INFO: renamed from: H */
    public static CoreService m29131H() {
        return uqb0.f180396b0.f170325b;
    }

    /* JADX INFO: renamed from: J */
    public static FeedService m29132J() {
        return uqb0.f180396b0.f170327d;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo29133Ec() {
        rrq.m182815b().m182819e(CommonData.JSON_ADAPTER, null);
        ABManager.m30323R(new C16074bp());
        f16756c = new C4726a();
        f16755b = new C20681uv();
        f16758e = new ThirdPartLoginApi();
        C20407tv.m192770a("100032", false);
        C20407tv.m192771b(new uai0());
        f16757d = new C19457pw();
        f16759f = new C21091wf();
        AssetsSettingsBaseApi.m30400H(AssetsSettingsBaseApi.Module.ACCOUNT, 3);
        djf0.m116082c().m116090h();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo29135Ma() {
        C21827zj c21827zj = f16760g;
        if (c21827zj != null) {
            c21827zj.mo133950i();
        }
        C21827zj c21827zj2 = new C21827zj();
        l9c.m153394o().m153417y(c21827zj2);
        f16760g = c21827zj2;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        f16756c.m29332g1();
        cqq.m111970e().m111977h(AccountBridgeImplementation.class);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22421c<uxj0> mo29137ft() {
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return f16754a;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        f16754a = (Application) context;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo29138ms() {
        ike.m140277l();
        WelcomeAct.f17776f = "";
        ino.INSTANCE.m141155a();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo29139tr(boolean z) {
        djf0.m116085i();
        djf0.m116087k().put(Boolean.TRUE);
        djf0.m116086j(m29130F().getAuthData().mo107143b());
        djf0.m116084g().clear();
        m29130F().mo29176y8();
    }
}
