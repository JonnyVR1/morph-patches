package com.p000p1.mobile.putong.account;

import android.app.Application;
import android.content.Context;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.api.ThirdPartLoginApi;
import com.p000p1.mobile.putong.account.p002ui.jsbridge.AccountBridgeImplementation;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import l.doq;
import l.f8c;
import l.pp2;
import l.roj0;
import l.rpq;
import l.zv;
import p006l.C0535aw;
import p006l.C0553bg;
import p006l.C0678ek;
import p006l.C0775gp;
import p006l.C1390vw;
import p006l.eje;
import p006l.ilo;
import p006l.l2i0;
import p006l.qib0;
import p006l.waf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "AccountModule", path = "/account_module/module")
public class AccountModule implements Module {

    /* JADX INFO: renamed from: a */
    public static Application f24a;

    /* JADX INFO: renamed from: b */
    public static C0535aw f25b;

    /* JADX INFO: renamed from: c */
    public static C0001a f26c;

    /* JADX INFO: renamed from: d */
    public static C1390vw f27d;

    /* JADX INFO: renamed from: e */
    public static ThirdPartLoginApi f28e;

    /* JADX INFO: renamed from: f */
    public static C0553bg f29f;

    /* JADX INFO: renamed from: g */
    public static C0678ek f30g;

    /* JADX INFO: renamed from: F */
    public static AccountService m26F() {
        return qib0.f19804b0.f17706a;
    }

    /* JADX INFO: renamed from: H */
    public static CoreService m27H() {
        return qib0.f19804b0.f17707b;
    }

    /* JADX INFO: renamed from: J */
    public static FeedService m28J() {
        return qib0.f19804b0.f17709d;
    }

    /* JADX INFO: renamed from: Ec */
    public void m29Ec() {
        rpq.b().e(CommonData.JSON_ADAPTER, (pp2) null);
        ABManager.m1231R(new C0775gp());
        f26c = new C0001a();
        f25b = new C0535aw();
        f28e = new ThirdPartLoginApi();
        zv.a("100032", false);
        zv.b(new l2i0());
        f27d = new C1390vw();
        f29f = new C0553bg();
        AssetsSettingsBaseApi.m1308H(AssetsSettingsBaseApi.Module.ACCOUNT, 3);
        waf0.m26299c().m26307h();
    }

    /* JADX INFO: renamed from: Jh */
    public c<roj0> m30Jh() {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Ma */
    public void m31Ma() {
        C0678ek c0678ek = f30g;
        if (c0678ek != null) {
            c0678ek.m14596i();
        }
        C0678ek c0678ek2 = new C0678ek();
        f8c.o().y(c0678ek2);
        f30g = c0678ek2;
    }

    /* JADX INFO: renamed from: Qh */
    public void m32Qh() {
        f26c.m228g1();
        doq.e().h(AccountBridgeImplementation.class);
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m33ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return f24a;
    }

    public void init(Context context) {
        f24a = (Application) context;
    }

    /* JADX INFO: renamed from: ms */
    public void m34ms() {
        eje.m14575l();
        WelcomeAct.f1046f = "";
        ilo.INSTANCE.m16730a();
    }

    /* JADX INFO: renamed from: tr */
    public void m35tr(boolean z) {
        waf0.m26302i();
        waf0.m26304k().put(Boolean.TRUE);
        waf0.m26303j((AuthData) m26F().getAuthData().b());
        waf0.m26301g().clear();
        m26F().mo72y8();
    }
}
