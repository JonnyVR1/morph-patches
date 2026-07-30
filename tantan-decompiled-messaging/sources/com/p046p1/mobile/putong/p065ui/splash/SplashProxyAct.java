package com.p046p1.mobile.putong.p065ui.splash;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import io.agora.rtc2.internal.AudioRoutingController;
import p133rx.subjects.C22392a;
import p149l.bne0;
import p149l.c4g0;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.e6c0;
import p149l.edk0;
import p149l.epd0;
import p149l.j760;
import p149l.mkd0;
import p149l.qib0;
import p149l.rke0;
import p149l.roj0;
import p149l.tpd0;
import p149l.u700;
import p149l.v0c0;
import p149l.v4e;
import p149l.vwb;
import p149l.w4e;
import p149l.x4e;
import p149l.xdl0;
import p149l.xgw;
import p149l.yni;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class SplashProxyAct extends Activity {

    /* JADX INFO: renamed from: i */
    public static long f54725i;

    /* JADX INFO: renamed from: b */
    public long f54727b;

    /* JADX INFO: renamed from: h */
    public c4g0 f54733h;

    /* JADX INFO: renamed from: a */
    public boolean f54726a = true;

    /* JADX INFO: renamed from: c */
    public cwf0 f54728c = new cwf0("p_second_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: d */
    public cwf0 f54729d = new cwf0("p_sys_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: e */
    public cwf0 f54730e = new cwf0("p_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: f */
    public final tpd0 f54731f = new tpd0("welcome_session", 0);

    /* JADX INFO: renamed from: g */
    public final tpd0 f54732g = new tpd0("application_started", 0);

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$a */
    public class C13141a implements x4e {
        public C13141a() {
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: a */
        public void mo37401a() {
            zvf0.m220396r("e_second_prompt_phone_auth_popup_open_button", "p_second_prompt_phone_auth_popup_view");
            SplashProxyAct.this.f54728c.m109035k();
            SplashProxyAct.this.f54728c.m109034j();
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: c */
        public void mo37403c() {
            SplashProxyAct.this.f54728c.m109033i();
            SplashProxyAct.this.f54728c.m109036l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$b */
    public class C13142b implements w4e {
        public C13142b() {
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: a */
        public void mo37390a() {
            zvf0.m220396r("e_prompt_phone_auth_popup_open_button", "p_prompt_phone_auth_popup_view");
            SplashProxyAct.this.f54730e.m109035k();
            SplashProxyAct.this.f54730e.m109034j();
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: c */
        public void mo37392c() {
            SplashProxyAct.this.f54730e.m109033i();
            SplashProxyAct.this.f54730e.m109036l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$c */
    public class C13143c implements v4e {
        public C13143c() {
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
            zvf0.m220396r("e_sys_phone_auth_popup_allowed_button", "p_sys_phone_auth_popup_view");
            SplashProxyAct.this.f54729d.m109035k();
            SplashProxyAct.this.f54729d.m109034j();
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            zvf0.m220399u("e_sys_phone_auth_popup_denied_button", "p_sys_phone_auth_popup_view", vwb.m200311Y("no_longer_ask", z ? "on" : BLiveOperationTitleShowType.off));
            SplashProxyAct.this.f54729d.m109035k();
            SplashProxyAct.this.f54729d.m109034j();
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
            SplashProxyAct.this.f54729d.m109033i();
            SplashProxyAct.this.f54729d.m109036l();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80099d(d30 d30Var, roj0 roj0Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public static Intent m80105l(Context context) {
        Intent intent = new Intent(context, (Class<?>) SplashProxyAct.class);
        intent.addFlags(268468224);
        return intent;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m80106m() {
        return PermissionHelper.m79881b(PermissionHelper.f54616a);
    }

    @Override // android.app.Activity
    public void finish() {
        yni.m215415d(LaunchStep.SplashProxyAll);
        overridePendingTransition(0, 0);
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m80107j(d30 d30Var) {
        if (TantanApp.f17179b == null) {
            qib0 qib0Var = new qib0();
            TantanApp.f17179b = qib0Var;
            qib0Var.mo20435m();
            TantanApp.f17188k = false;
        }
        FakeSplashView.setVisitorHasClick(false);
        if (PermissionHelper.m79881b(PermissionHelper.f54616a)) {
            m80114s(d30Var);
        } else {
            d30Var.call();
            m80108k();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m80108k() {
        PermissionHelper.m79882c().m79900r(PermissionHelper.f54616a).m79893k(this.f54726a).m79905w(!this.f54726a).m79903u(false).m79892j(false).m79895m(new d30() { // from class: l.dpf0
            @Override // p149l.d30
            public final void call() {
                this.f87270a.m80109n();
            }
        }, null).m79898p(new C13143c()).m79902t(new C13142b()).m79904v(new C13141a()).m79901s(null).m79891i(this);
        this.f54726a = false;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m80109n() {
        e51.m114742G(new Runnable() { // from class: l.epf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92651a.m80113r();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m80110o() {
        m80107j(null);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        try {
            if (TextUtils.isEmpty(MMKV.getRootDir())) {
                edk0.m115811a(this, false, false);
            }
        } catch (Throwable unused) {
        }
        xgw.m208704f();
        try {
            epd0 epd0Var = TantanApp.f17182e;
            if (epd0Var.mo108248b() == null || !TantanApp.f17181d.mo108248b().booleanValue()) {
                xgw.m208706h();
            } else {
                xgw.m208708j(epd0Var.mo108248b().userId);
            }
        } catch (Exception unused2) {
        }
        yni.m215415d(LaunchStep.SplashStartWait);
        yni.m215417f(LaunchStep.SplashProxyCreate, LaunchStep.SplashProxyAll);
        C22392a<j760<Boolean, Boolean>> c22392a = qib0.f154680A0;
        c22392a.onNext(new j760<>(Boolean.TRUE, c22392a.m221515e().f116565b));
        f54725i = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (NullChecker.m81304b(intent) && !TantanApp.f17188k) {
            PhotonPushManager.getInstance().logPushClick(intent);
        }
        if (intent != null) {
            try {
                data = intent.getData();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        } else {
            data = null;
        }
        if (data != null) {
            rke0.m179732d(data.toString());
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra(Constants.DEEP_LINK_KEY);
            if (!TextUtils.isEmpty(stringExtra)) {
                rke0.m179732d(stringExtra);
            }
        }
        if (!isTaskRoot() && NullChecker.m81304b(intent)) {
            String action = intent.getAction();
            if (intent.hasCategory("android.intent.category.LAUNCHER") && TextUtils.equals("android.intent.action.MAIN", action) && !intent.hasExtra("custom")) {
                finish();
                return;
            }
        }
        if (this.f54732g.get().intValue() == 0 && this.f54731f.get().intValue() == 0) {
            zvf0.m220371D("e_first_app_open_pre", "", new j760[0]);
        }
        if (this.f54731f.get().intValue() < 3) {
            tpd0 tpd0Var = this.f54731f;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        }
        PutongAct.setLightStatusBar(getWindow(), 1024);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (bne0.m102781j()) {
            PutongAct.MIUISetStatusBarLightMode(getWindow(), true);
        }
        if (bne0.m102778g()) {
            PutongAct.FlymeSetStatusBarLightMode(getWindow(), true);
        }
        if (TantanApp.f17188k || getIntent().getBooleanExtra("signout", false)) {
            FakeSplashViewOld fakeSplashViewOld = (FakeSplashViewOld) getLayoutInflater().inflate(e6c0.f89536R, (ViewGroup) null);
            fakeSplashViewOld.f54719l = new Runnable() { // from class: l.apf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71035a.m80111p();
                }
            };
            setContentView(fakeSplashViewOld);
            fakeSplashViewOld.setPadding(0, xdl0.m208331F0(), 0, 0);
            getWindow().setStatusBarColor(getResources().getColor(v0c0.f179106m));
            getWindow().setNavigationBarColor(getResources().getColor(v0c0.f179106m));
        } else if (m80106m()) {
            m80113r();
        }
        yni.m215415d(LaunchStep.SplashProxyCreate);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        c4g0 c4g0Var = this.f54733h;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f54733h.unsubscribe();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (TantanApp.f17188k || getIntent().getBooleanExtra("signout", false)) {
            return;
        }
        if (m80106m()) {
            m80113r();
        } else {
            m80113r();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m80111p() {
        e51.m114743H(this, new Runnable() { // from class: l.bpf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f76623a.m80110o();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m80112q(d30 d30Var) {
        yni.m215415d(LaunchStep.SplashWaitModuleLoad);
        if (d30Var != null) {
            d30Var.call();
        }
        getIntent().putExtra("signout", false);
        Intent intent = getIntent();
        Intent intent2 = new Intent();
        intent.putExtra("first_welcome", this.f54731f.get().intValue() == 1);
        intent2.putExtra("extra_intent", intent);
        yni.m215417f(LaunchStep.SplashPageCreateWait);
        startActivity(intent2.setClass(this, qib0.f154714c0.mo97525t5()));
        finish();
    }

    /* JADX INFO: renamed from: r */
    public final void m80113r() {
        m80114s(null);
    }

    /* JADX INFO: renamed from: s */
    public final void m80114s(final d30 d30Var) {
        if (System.currentTimeMillis() - this.f54727b < 200) {
            return;
        }
        this.f54727b = System.currentTimeMillis();
        yni.m215417f(LaunchStep.SplashWaitModuleLoad);
        m80115t(new d30() { // from class: l.zof0
            @Override // p149l.d30
            public final void call() {
                this.f204107a.m80112q(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m80115t(final d30 d30Var) {
        if (qib0.f154721j0 == null) {
            qib0.f154721j0 = u700.m192052r();
        }
        this.f54733h = qib0.f154721j0.m192071y(SchemeKey.account).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.cpf0
            @Override // p149l.e30
            public final void call(Object obj) {
                SplashProxyAct.m80099d(d30Var, (roj0) obj);
            }
        }));
    }
}
