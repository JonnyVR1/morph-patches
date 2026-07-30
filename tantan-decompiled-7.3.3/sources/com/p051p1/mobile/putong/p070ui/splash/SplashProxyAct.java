package com.p051p1.mobile.putong.p070ui.splash;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.PhotonPushManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import io.agora.rtc2.internal.AudioRoutingController;
import p137rx.subjects.C22507a;
import p153l.b9c0;
import p153l.bnl0;
import p153l.dg00;
import p153l.gxd0;
import p153l.i4g0;
import p153l.ive0;
import p153l.j6e;
import p153l.jec0;
import p153l.jyb;
import p153l.k6e;
import p153l.kcg0;
import p153l.kmk0;
import p153l.l4g0;
import p153l.l51;
import p153l.l6e;
import p153l.pf60;
import p153l.psd0;
import p153l.uqb0;
import p153l.uqi;
import p153l.uxj0;
import p153l.vxd0;
import p153l.wiw;
import p153l.wse0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class SplashProxyAct extends Activity {

    /* JADX INFO: renamed from: i */
    public static long f55573i;

    /* JADX INFO: renamed from: b */
    public long f55575b;

    /* JADX INFO: renamed from: h */
    public kcg0 f55581h;

    /* JADX INFO: renamed from: a */
    public boolean f55574a = true;

    /* JADX INFO: renamed from: c */
    public l4g0 f55576c = new l4g0("p_second_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: d */
    public l4g0 f55577d = new l4g0("p_sys_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: e */
    public l4g0 f55578e = new l4g0("p_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: f */
    public final vxd0 f55579f = new vxd0("welcome_session", 0);

    /* JADX INFO: renamed from: g */
    public final vxd0 f55580g = new vxd0("application_started", 0);

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$a */
    public class C13304a implements l6e {
        public C13304a() {
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: a */
        public void mo38404a() {
            i4g0.m138520r("e_second_prompt_phone_auth_popup_open_button", "p_second_prompt_phone_auth_popup_view");
            SplashProxyAct.this.f55576c.m152776k();
            SplashProxyAct.this.f55576c.m152775j();
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: c */
        public void mo38406c() {
            SplashProxyAct.this.f55576c.m152774i();
            SplashProxyAct.this.f55576c.m152777l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$b */
    public class C13305b implements k6e {
        public C13305b() {
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: a */
        public void mo38393a() {
            i4g0.m138520r("e_prompt_phone_auth_popup_open_button", "p_prompt_phone_auth_popup_view");
            SplashProxyAct.this.f55578e.m152776k();
            SplashProxyAct.this.f55578e.m152775j();
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: c */
        public void mo38395c() {
            SplashProxyAct.this.f55578e.m152774i();
            SplashProxyAct.this.f55578e.m152777l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$c */
    public class C13306c implements j6e {
        public C13306c() {
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
            i4g0.m138520r("e_sys_phone_auth_popup_allowed_button", "p_sys_phone_auth_popup_view");
            SplashProxyAct.this.f55577d.m152776k();
            SplashProxyAct.this.f55577d.m152775j();
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            i4g0.m138523u("e_sys_phone_auth_popup_denied_button", "p_sys_phone_auth_popup_view", jyb.m147494Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
            SplashProxyAct.this.f55577d.m152776k();
            SplashProxyAct.this.f55577d.m152775j();
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
            SplashProxyAct.this.f55577d.m152774i();
            SplashProxyAct.this.f55577d.m152777l();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m81282d(x20 x20Var, uxj0 uxj0Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public static Intent m81288l(Context context) {
        Intent intent = new Intent(context, (Class<?>) SplashProxyAct.class);
        intent.addFlags(268468224);
        return intent;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m81289m() {
        return PermissionHelper.m81064b(PermissionHelper.f55464a);
    }

    @Override // android.app.Activity
    public void finish() {
        uqi.m197337d(LaunchStep.SplashProxyAll);
        overridePendingTransition(0, 0);
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m81290j(x20 x20Var) {
        if (TantanApp.f17898b == null) {
            uqb0 uqb0Var = new uqb0();
            TantanApp.f17898b = uqb0Var;
            uqb0Var.mo21434m();
            TantanApp.f17907k = false;
        }
        FakeSplashView.setVisitorHasClick(false);
        if (PermissionHelper.m81064b(PermissionHelper.f55464a)) {
            m81297s(x20Var);
        } else {
            x20Var.call();
            m81291k();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m81291k() {
        PermissionHelper.m81065c().m81083r(PermissionHelper.f55464a).m81076k(this.f55574a).m81088w(!this.f55574a).m81086u(false).m81075j(false).m81078m(new x20() { // from class: l.mxf0
            @Override // p153l.x20
            public final void call() {
                this.f139232a.m81292n();
            }
        }, null).m81081p(new C13306c()).m81085t(new C13305b()).m81087v(new C13304a()).m81084s(null).m81074i(this);
        this.f55574a = false;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m81292n() {
        l51.m152887G(new Runnable() { // from class: l.nxf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144121a.m81296r();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m81293o() {
        m81290j(null);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        try {
            if (TextUtils.isEmpty(MMKV.getRootDir())) {
                kmk0.m150487a(this, false, false);
            }
        } catch (Throwable unused) {
        }
        wiw.m206605f();
        try {
            gxd0 gxd0Var = TantanApp.f17901e;
            if (gxd0Var.mo107143b() == null || !TantanApp.f17900d.mo107143b().booleanValue()) {
                wiw.m206607h();
            } else {
                wiw.m206609j(gxd0Var.mo107143b().userId);
            }
        } catch (Exception unused2) {
        }
        uqi.m197337d(LaunchStep.SplashStartWait);
        uqi.m197339f(LaunchStep.SplashProxyCreate, LaunchStep.SplashProxyAll);
        C22507a<pf60<Boolean, Boolean>> c22507a = uqb0.f180363A0;
        c22507a.onNext(new pf60<>(Boolean.TRUE, c22507a.m222761e().f152157b));
        f55573i = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (NullChecker.m82487b(intent) && !TantanApp.f17907k) {
            PhotonPushManager.getInstance().logPushClick(intent);
        }
        if (intent != null) {
            try {
                data = intent.getData();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        } else {
            data = null;
        }
        if (data != null) {
            wse0.m207756d(data.toString());
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra(Constants.DEEP_LINK_KEY);
            if (!TextUtils.isEmpty(stringExtra)) {
                wse0.m207756d(stringExtra);
            }
        }
        if (!isTaskRoot() && NullChecker.m82487b(intent)) {
            String action = intent.getAction();
            if (intent.hasCategory("android.intent.category.LAUNCHER") && TextUtils.equals("android.intent.action.MAIN", action) && !intent.hasExtra("custom")) {
                finish();
                return;
            }
        }
        if (this.f55580g.get().intValue() == 0 && this.f55579f.get().intValue() == 0) {
            i4g0.m138495D("e_first_app_open_pre", "", new pf60[0]);
        }
        if (this.f55579f.get().intValue() < 3) {
            vxd0 vxd0Var = this.f55579f;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        }
        PutongAct.setLightStatusBar(getWindow(), 1024);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (ive0.m142296j()) {
            PutongAct.MIUISetStatusBarLightMode(getWindow(), true);
        }
        if (ive0.m142293g()) {
            PutongAct.FlymeSetStatusBarLightMode(getWindow(), true);
        }
        if (TantanApp.f17907k || getIntent().getBooleanExtra("signout", false)) {
            FakeSplashViewOld fakeSplashViewOld = (FakeSplashViewOld) getLayoutInflater().inflate(jec0.f120449R, (ViewGroup) null);
            fakeSplashViewOld.f55567l = new Runnable() { // from class: l.jxf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123031a.m81294p();
                }
            };
            setContentView(fakeSplashViewOld);
            fakeSplashViewOld.setPadding(0, bnl0.m105511F0(), 0, 0);
            getWindow().setStatusBarColor(getResources().getColor(b9c0.f75567m));
            getWindow().setNavigationBarColor(getResources().getColor(b9c0.f75567m));
        } else if (m81289m()) {
            m81296r();
        }
        uqi.m197337d(LaunchStep.SplashProxyCreate);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        kcg0 kcg0Var = this.f55581h;
        if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
            this.f55581h.unsubscribe();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (TantanApp.f17907k || getIntent().getBooleanExtra("signout", false)) {
            return;
        }
        if (m81289m()) {
            m81296r();
        } else {
            m81296r();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m81294p() {
        l51.m152888H(this, new Runnable() { // from class: l.kxf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129203a.m81293o();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m81295q(x20 x20Var) {
        uqi.m197337d(LaunchStep.SplashWaitModuleLoad);
        if (x20Var != null) {
            x20Var.call();
        }
        getIntent().putExtra("signout", false);
        Intent intent = getIntent();
        Intent intent2 = new Intent();
        intent.putExtra("first_welcome", this.f55579f.get().intValue() == 1);
        intent2.putExtra("extra_intent", intent);
        uqi.m197339f(LaunchStep.SplashPageCreateWait);
        startActivity(intent2.setClass(this, uqb0.f180397c0.mo105314t5()));
        finish();
    }

    /* JADX INFO: renamed from: r */
    public final void m81296r() {
        m81297s(null);
    }

    /* JADX INFO: renamed from: s */
    public final void m81297s(final x20 x20Var) {
        if (System.currentTimeMillis() - this.f55575b < 200) {
            return;
        }
        this.f55575b = System.currentTimeMillis();
        uqi.m197339f(LaunchStep.SplashWaitModuleLoad);
        m81298t(new x20() { // from class: l.ixf0
            @Override // p153l.x20
            public final void call() {
                this.f117396a.m81295q(x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m81298t(final x20 x20Var) {
        if (uqb0.f180404j0 == null) {
            uqb0.f180404j0 = dg00.m115582r();
        }
        this.f55581h = uqb0.f180404j0.m115601y(SchemeKey.account).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.lxf0
            @Override // p153l.y20
            public final void call(Object obj) {
                SplashProxyAct.m81282d(x20Var, (uxj0) obj);
            }
        }));
    }
}
