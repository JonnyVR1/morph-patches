package com.p046p1.mobile.putong.account;

import android.app.Application;
import android.content.Context;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.api.ThirdPartLoginApi;
import com.p046p1.mobile.putong.account.p050ui.jsbridge.AccountBridgeImplementation;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p133rx.C22306c;
import p149l.C15735aw;
import p149l.C15852bg;
import p149l.C16636ek;
import p149l.C17133gp;
import p149l.C20742vw;
import p149l.C21777zv;
import p149l.doq;
import p149l.eje;
import p149l.f8c;
import p149l.ilo;
import p149l.l2i0;
import p149l.qib0;
import p149l.roj0;
import p149l.rpq;
import p149l.waf0;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "AccountModule", path = "/account_module/module")
public class AccountModule implements Module {

    /* JADX INFO: renamed from: a */
    public static Application f16035a;

    /* JADX INFO: renamed from: b */
    public static C15735aw f16036b;

    /* JADX INFO: renamed from: c */
    public static C4575a f16037c;

    /* JADX INFO: renamed from: d */
    public static C20742vw f16038d;

    /* JADX INFO: renamed from: e */
    public static ThirdPartLoginApi f16039e;

    /* JADX INFO: renamed from: f */
    public static C15852bg f16040f;

    /* JADX INFO: renamed from: g */
    public static C16636ek f16041g;

    /* JADX INFO: renamed from: F */
    public static AccountService m28131F() {
        return qib0.f154713b0.f139230a;
    }

    /* JADX INFO: renamed from: H */
    public static CoreService m28132H() {
        return qib0.f154713b0.f139231b;
    }

    /* JADX INFO: renamed from: J */
    public static FeedService m28133J() {
        return qib0.f154713b0.f139233d;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ec */
    public void mo28134Ec() {
        rpq.m180387b().m180391e(CommonData.JSON_ADAPTER, null);
        ABManager.m29325R(new C17133gp());
        f16037c = new C4575a();
        f16036b = new C15735aw();
        f16039e = new ThirdPartLoginApi();
        C21777zv.m220286a("100032", false);
        C21777zv.m220287b(new l2i0());
        f16038d = new C20742vw();
        f16040f = new C15852bg();
        AssetsSettingsBaseApi.m29402H(AssetsSettingsBaseApi.Module.ACCOUNT, 3);
        waf0.m202385c().m202393h();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ma */
    public void mo28136Ma() {
        C16636ek c16636ek = f16041g;
        if (c16636ek != null) {
            c16636ek.mo100767i();
        }
        C16636ek c16636ek2 = new C16636ek();
        f8c.m119878o().m119901y(c16636ek2);
        f16041g = c16636ek2;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        f16037c.m28333g1();
        doq.m112810e().m112817h(AccountBridgeImplementation.class);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22306c<roj0> mo28138ft() {
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return f16035a;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        f16035a = (Application) context;
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo28139ms() {
        eje.m116825l();
        WelcomeAct.f17057f = "";
        ilo.INSTANCE.m137008a();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo28140tr(boolean z) {
        waf0.m202388i();
        waf0.m202390k().put(Boolean.TRUE);
        waf0.m202389j(m28131F().getAuthData().mo108248b());
        waf0.m202387g().clear();
        m28131F().mo28177y8();
    }
}
