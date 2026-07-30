package com.p000p1.mobile.putong.p004ui.splash;

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
import com.cosmos.photon.push.PhotonPushManager;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.p004ui.splash.SplashProxyAct;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import l.bne0;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.e6c0;
import l.edk0;
import l.j760;
import l.mkd0;
import l.qib0;
import l.rke0;
import l.roj0;
import l.tpd0;
import l.u700;
import l.v0c0;
import l.vwb;
import l.xdl0;
import l.xgw;
import l.zvf0;
import p009l.epd0;
import p009l.v4e;
import p009l.w4e;
import p009l.x4e;
import p009l.yni;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SplashProxyAct extends Activity {

    /* JADX INFO: renamed from: i */
    public static long f8331i;

    /* JADX INFO: renamed from: b */
    public long f8333b;

    /* JADX INFO: renamed from: h */
    public c4g0 f8339h;

    /* JADX INFO: renamed from: a */
    public boolean f8332a = true;

    /* JADX INFO: renamed from: c */
    public cwf0 f8334c = new cwf0("p_second_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: d */
    public cwf0 f8335d = new cwf0("p_sys_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: e */
    public cwf0 f8336e = new cwf0("p_prompt_phone_auth_popup_view", Dialog.class.getName());

    /* JADX INFO: renamed from: f */
    public final tpd0 f8337f = new tpd0("welcome_session", 0);

    /* JADX INFO: renamed from: g */
    public final tpd0 f8338g = new tpd0("application_started", 0);

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$a */
    public class C0543a implements x4e {
        public C0543a() {
        }

        @Override // p009l.x4e
        /* JADX INFO: renamed from: a */
        public void mo1372a() {
            zvf0.r("e_second_prompt_phone_auth_popup_open_button", "p_second_prompt_phone_auth_popup_view");
            SplashProxyAct.this.f8334c.k();
            SplashProxyAct.this.f8334c.j();
        }

        @Override // p009l.x4e
        /* JADX INFO: renamed from: b */
        public void mo1373b() {
        }

        @Override // p009l.x4e
        /* JADX INFO: renamed from: c */
        public void mo1374c() {
            SplashProxyAct.this.f8334c.i();
            SplashProxyAct.this.f8334c.l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$b */
    public class C0544b implements w4e {
        public C0544b() {
        }

        @Override // p009l.w4e
        /* JADX INFO: renamed from: a */
        public void mo1359a() {
            zvf0.r("e_prompt_phone_auth_popup_open_button", "p_prompt_phone_auth_popup_view");
            SplashProxyAct.this.f8336e.k();
            SplashProxyAct.this.f8336e.j();
        }

        @Override // p009l.w4e
        /* JADX INFO: renamed from: b */
        public void mo1360b() {
        }

        @Override // p009l.w4e
        /* JADX INFO: renamed from: c */
        public void mo1361c() {
            SplashProxyAct.this.f8336e.i();
            SplashProxyAct.this.f8336e.l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.SplashProxyAct$c */
    public class C0545c implements v4e {
        public C0545c() {
        }

        @Override // p009l.v4e
        /* JADX INFO: renamed from: a */
        public void mo1362a() {
            zvf0.r("e_sys_phone_auth_popup_allowed_button", "p_sys_phone_auth_popup_view");
            SplashProxyAct.this.f8335d.k();
            SplashProxyAct.this.f8335d.j();
        }

        @Override // p009l.v4e
        /* JADX INFO: renamed from: b */
        public void mo1363b(boolean z) {
            zvf0.u("e_sys_phone_auth_popup_denied_button", "p_sys_phone_auth_popup_view", new j760[]{vwb.Y("no_longer_ask", z ? "on" : "off")});
            SplashProxyAct.this.f8335d.k();
            SplashProxyAct.this.f8335d.j();
        }

        @Override // p009l.v4e
        /* JADX INFO: renamed from: c */
        public void mo1364c() {
            SplashProxyAct.this.f8335d.i();
            SplashProxyAct.this.f8335d.l();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10428d(d30 d30Var, roj0 roj0Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public static Intent m10434l(Context context) {
        Intent intent = new Intent(context, (Class<?>) SplashProxyAct.class);
        intent.addFlags(268468224);
        return intent;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10435m() {
        return PermissionHelper.m10210b(PermissionHelper.f8222a);
    }

    @Override // android.app.Activity
    public void finish() {
        yni.m25472d(LaunchStep.SplashProxyAll);
        overridePendingTransition(0, 0);
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10436j(d30 d30Var) {
        if (TantanApp.b == null) {
            qib0 qib0Var = new qib0();
            TantanApp.b = qib0Var;
            qib0Var.m();
            TantanApp.k = false;
        }
        FakeSplashView.setVisitorHasClick(false);
        if (PermissionHelper.m10210b(PermissionHelper.f8222a)) {
            m10443s(d30Var);
        } else {
            d30Var.call();
            m10437k();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m10437k() {
        PermissionHelper.m10211c().m10229r(PermissionHelper.f8222a).m10222k(this.f8332a).m10234w(!this.f8332a).m10232u(false).m10221j(false).m10224m(new d30() { // from class: l.dpf0
            public final void call() {
                this.f11936a.m10438n();
            }
        }, null).m10227p(new C0545c()).m10231t(new C0544b()).m10233v(new C0543a()).m10230s(null).m10220i(this);
        this.f8332a = false;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10438n() {
        e51.G(new Runnable() { // from class: l.epf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12647a.m10442r();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m10439o() {
        m10436j(null);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        try {
            if (TextUtils.isEmpty(MMKV.getRootDir())) {
                edk0.a(this, false, false);
            }
        } catch (Throwable unused) {
        }
        xgw.f();
        try {
            epd0 epd0Var = TantanApp.e;
            if (epd0Var.b() == null || !((Boolean) TantanApp.d.b()).booleanValue()) {
                xgw.h();
            } else {
                xgw.j(((AuthData) epd0Var.b()).userId);
            }
        } catch (Exception unused2) {
        }
        yni.m25472d(LaunchStep.SplashStartWait);
        yni.m25474f(LaunchStep.SplashProxyCreate, LaunchStep.SplashProxyAll);
        a aVar = qib0.A0;
        aVar.onNext(new j760(Boolean.TRUE, (Boolean) ((j760) aVar.e()).b));
        f8331i = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (NullChecker.b(intent) && !TantanApp.k) {
            PhotonPushManager.getInstance().logPushClick(intent);
        }
        if (intent != null) {
            try {
                data = intent.getData();
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        } else {
            data = null;
        }
        if (data != null) {
            rke0.d(data.toString());
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra("wzrk_dl");
            if (!TextUtils.isEmpty(stringExtra)) {
                rke0.d(stringExtra);
            }
        }
        if (!isTaskRoot() && NullChecker.b(intent)) {
            String action = intent.getAction();
            if (intent.hasCategory("android.intent.category.LAUNCHER") && TextUtils.equals("android.intent.action.MAIN", action) && !intent.hasExtra("custom")) {
                finish();
                return;
            }
        }
        if (((Integer) this.f8338g.get()).intValue() == 0 && ((Integer) this.f8337f.get()).intValue() == 0) {
            zvf0.D("e_first_app_open_pre", "", new j760[0]);
        }
        if (((Integer) this.f8337f.get()).intValue() < 3) {
            tpd0 tpd0Var = this.f8337f;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        }
        PutongAct.setLightStatusBar(getWindow(), 1024);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (bne0.j()) {
            PutongAct.MIUISetStatusBarLightMode(getWindow(), true);
        }
        if (bne0.g()) {
            PutongAct.FlymeSetStatusBarLightMode(getWindow(), true);
        }
        if (TantanApp.k || getIntent().getBooleanExtra("signout", false)) {
            FakeSplashViewOld fakeSplashViewOld = (FakeSplashViewOld) getLayoutInflater().inflate(e6c0.R, (ViewGroup) null);
            fakeSplashViewOld.f8325l = new Runnable() { // from class: l.apf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9615a.m10440p();
                }
            };
            setContentView(fakeSplashViewOld);
            fakeSplashViewOld.setPadding(0, xdl0.F0(), 0, 0);
            getWindow().setStatusBarColor(getResources().getColor(v0c0.m));
            getWindow().setNavigationBarColor(getResources().getColor(v0c0.m));
        } else if (m10435m()) {
            m10442r();
        }
        yni.m25472d(LaunchStep.SplashProxyCreate);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        c4g0 c4g0Var = this.f8339h;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f8339h.unsubscribe();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (TantanApp.k || getIntent().getBooleanExtra("signout", false)) {
            return;
        }
        if (m10435m()) {
            m10442r();
        } else {
            m10442r();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m10440p() {
        e51.H(this, new Runnable() { // from class: l.bpf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10229a.m10439o();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10441q(d30 d30Var) {
        yni.m25472d(LaunchStep.SplashWaitModuleLoad);
        if (d30Var != null) {
            d30Var.call();
        }
        getIntent().putExtra("signout", false);
        Intent intent = getIntent();
        Intent intent2 = new Intent();
        intent.putExtra("first_welcome", ((Integer) this.f8337f.get()).intValue() == 1);
        intent2.putExtra("extra_intent", intent);
        yni.m25474f(LaunchStep.SplashPageCreateWait);
        startActivity(intent2.setClass(this, qib0.c0.t5()));
        finish();
    }

    /* JADX INFO: renamed from: r */
    public final void m10442r() {
        m10443s(null);
    }

    /* JADX INFO: renamed from: s */
    public final void m10443s(final d30 d30Var) {
        if (System.currentTimeMillis() - this.f8333b < 200) {
            return;
        }
        this.f8333b = System.currentTimeMillis();
        yni.m25474f(LaunchStep.SplashWaitModuleLoad);
        m10444t(new d30() { // from class: l.zof0
            public final void call() {
                this.f23807a.m10441q(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m10444t(final d30 d30Var) {
        if (qib0.j0 == null) {
            qib0.j0 = u700.r();
        }
        this.f8339h = qib0.j0.y("account").take(1).subscribe(mkd0.G(new e30() { // from class: l.cpf0
            public final void call(Object obj) {
                SplashProxyAct.m10428d(d30Var, (roj0) obj);
            }
        }));
    }
}
