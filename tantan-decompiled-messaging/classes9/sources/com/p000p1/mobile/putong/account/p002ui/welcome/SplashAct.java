package com.p000p1.mobile.putong.account.p002ui.welcome;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.welcome.SplashAct;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.WebSocketManager;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p000p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.cwf0;
import l.du2;
import l.e30;
import l.er2;
import l.j760;
import l.jo0;
import l.jvy0;
import l.mgh0;
import l.mkd0;
import l.roj0;
import l.u660;
import l.w9j;
import l.x9j;
import l.ygj0;
import l.yni;
import l.zvf0;
import p006l.j2e0;
import p006l.pzb0;
import p006l.qib0;
import p006l.ssk0;
import p006l.w2e0;
import p006l.ydb0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SplashAct extends Activity {

    /* JADX INFO: renamed from: b */
    public c4g0 f1036b;

    /* JADX INFO: renamed from: d */
    public long f1038d;

    /* JADX INFO: renamed from: e */
    public c4g0 f1039e;

    /* JADX INFO: renamed from: f */
    public c4g0 f1040f;

    /* JADX INFO: renamed from: g */
    public c4g0 f1041g;

    /* JADX INFO: renamed from: a */
    public cwf0 f1035a = null;

    /* JADX INFO: renamed from: c */
    public boolean f1037c = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.welcome.SplashAct$a */
    public class C0099a extends er2 {
        public C0099a() {
        }

        public String pageId() {
            return "p_landing_view";
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m1112k(DialogInterface dialogInterface, int i) {
        du2.a("[common][DatabaseStore]", "userMeStateErrorDialog click retry");
        qib0.m22161f1();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (IntlCountryCodeController.m21v()) {
            context = ygj0.c(context);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        yni.e(LaunchStep.SplashAll, LaunchStep.MainStartWait);
    }

    /* JADX INFO: renamed from: l */
    public final void m1113l() {
        if (this.f1037c) {
            m1116o(getIntent());
        } else {
            this.f1037c = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1114m() {
        finish();
        overridePendingTransition(pzb0.f19462b, pzb0.f19463c);
        yni.j();
    }

    /* JADX INFO: renamed from: n */
    public final void m1115n() {
        this.f1035a = new cwf0(new C0099a(), SplashAct.class.getName());
    }

    /* JADX INFO: renamed from: o */
    public final void m1116o(final Intent intent) {
        if (!NullChecker.a(intent) || !TantanApp.f1169c.m28214p(intent)) {
            this.f1039e = (AccountModule.m26F().signedIn_() ? qib0.f19812j0.f.take(1) : c.just(roj0.a)).subscribe(mkd0.G(new e30() { // from class: l.oof0
                public final void call(Object obj) {
                    this.f18306a.m1117p(intent, (roj0) obj);
                }
            }));
        } else {
            setIntent(null);
            m1114m();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            jvy0.a(attributes, 1);
            getWindow().setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            Intent intent = getIntent();
            if (intent != null) {
                intent.hasExtra("android.view.autofill.extra.RESTORE_SESSION_TOKEN");
            }
        } catch (Throwable th) {
            setIntent(null);
            CrashHelper.c(new Exception("tankerFlag", th));
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (IntlCountryCodeController.m21v()) {
            configuration = ygj0.b(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        yni.d(LaunchStep.SplashPageCreateWait);
        yni.f(new LaunchStep[]{LaunchStep.SplashCreate, LaunchStep.SplashAll});
        yni.k();
        u660.e().b(this);
        super.onCreate(bundle);
        m1115n();
        this.f1035a.c();
        this.f1035a.r();
        ssk0.m24191a(this);
        try {
            intent = (Intent) getIntent().getParcelableExtra("extra_intent");
        } catch (Exception e) {
            CrashHelper.c(e);
            intent = null;
        }
        if (NullChecker.a(intent)) {
            setIntent(intent);
            getIntent().setExtrasClassLoader(getClassLoader());
        }
        WebSocketManager.m1329Q().m1384l0(true);
        ydb0.m28181r(this);
        if (AccountModule.m26F().signedIn_()) {
            qib0.f19778E.u(300000L);
        }
        m1123v();
        yni.d(LaunchStep.SplashCreate);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c4g0 c4g0Var = this.f1036b;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f1036b.unsubscribe();
        }
        c4g0 c4g0Var2 = this.f1039e;
        if (c4g0Var2 != null && !c4g0Var2.isUnsubscribed()) {
            this.f1039e.unsubscribe();
        }
        c4g0 c4g0Var3 = this.f1040f;
        if (c4g0Var3 != null && !c4g0Var3.isUnsubscribed()) {
            this.f1040f.unsubscribe();
        }
        c4g0 c4g0Var4 = this.f1041g;
        if (c4g0Var4 != null && !c4g0Var4.isUnsubscribed()) {
            this.f1041g.unsubscribe();
        }
        this.f1035a.g();
        this.f1035a.e();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f1037c = false;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f1037c) {
            m1113l();
        }
        this.f1037c = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        u660.e().k(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m1117p(Intent intent, roj0 roj0Var) {
        if (AccountModule.m26F().signedIn_()) {
            TantanApp.f1169c.m28213e0();
            Uri data = intent != null ? intent.getData() : null;
            if (data != null) {
                try {
                    AppOpenWayStats.m1582d(data.toString());
                } catch (Exception e) {
                    CrashHelper.g(e);
                    startActivity(new Intent(qib0.f19805c0.getMainActIntent(this)));
                }
            }
            j2e0.m17248m(this, data);
        } else {
            Intent intent2 = new Intent(this, (Class<?>) WelcomeAct.class);
            intent2.putExtra("from_splash", true);
            m1121t(NullChecker.a(intent) ? intent.getData() : null);
            if (NullChecker.c(intent, "account", CrashHelper.ReportLevel.p9)) {
                intent2.putExtra("first_welcome", intent.getBooleanExtra("first_welcome", false));
                startActivity(intent2);
            }
        }
        m1114m();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m1118q(DialogInterface dialogInterface, int i) {
        zvf0.B("e_auto_logout", "", new j760[]{j760.a("logout_type", "db_crash")});
        du2.a("[common][DatabaseStore]", "userMeStateErrorDialog click signout");
        qib0.m22171q0();
        m1124w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ roj0 m1119r(String str) {
        if (Network.hasInvalidHash()) {
            ABManager.m1268v(1);
        }
        if (this.f1038d == 0) {
            this.f1038d = SystemClock.elapsedRealtime();
        }
        yni.d(LaunchStep.SplashWaitAb);
        return roj0.a;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m1120s(Integer num) {
        if (num.intValue() == 0) {
            m1124w();
        } else if (num.intValue() == 1) {
            m1124w();
        } else if (num.intValue() == 2) {
            m1122u();
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    /* JADX INFO: renamed from: t */
    public final void m1121t(Uri uri) {
        if (uri != null && NullChecker.a(uri.getScheme()) && uri.getScheme().startsWith("tantan")) {
            if (uri.toString().startsWith("tantanapp://join_group?groupId=") || uri.toString().startsWith("tantanapp://web/login/oauth")) {
                w2e0.f24878g = uri.toString();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1122u() {
        a aVarCreate = new a.a(this).setMessage(R$string.f90L3).setPositiveButton(R$string.f95M3, new DialogInterface.OnClickListener() { // from class: l.yof0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SplashAct.m1112k(dialogInterface, i);
            }
        }).setNegativeButton(R$string.f100N3, new DialogInterface.OnClickListener() { // from class: l.pof0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f19238a.m1118q(dialogInterface, i);
            }
        }).setCancelable(false).create();
        aVarCreate.setCanceledOnTouchOutside(false);
        aVarCreate.show();
    }

    /* JADX INFO: renamed from: v */
    public final void m1123v() {
        c cVarJust;
        yni.f(new LaunchStep[]{LaunchStep.SplashWaitUser});
        if (AccountModule.m26F().signedIn_()) {
            yni.f(new LaunchStep[]{LaunchStep.SplashWaitAb, LaunchStep.SplashWaitPlugin});
            cVarJust = c.combineLatest(Network.hash().filter(new w9j() { // from class: l.qof0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!Network.hasInvalidHash());
                }
            }).timeout(5L, TimeUnit.SECONDS, c.just((Object) null)).observeOn(jo0.a()).take(1).map(new w9j() { // from class: l.rof0
                public final Object call(Object obj) {
                    return this.f20663a.m1119r((String) obj);
                }
            }), qib0.f19812j0.b.doOnNext(new e30() { // from class: l.sof0
                public final void call(Object obj) {
                    yni.d(LaunchStep.SplashWaitPlugin);
                }
            }).map(new w9j() { // from class: l.tof0
                public final Object call(Object obj) {
                    return roj0.a;
                }
            }), new x9j() { // from class: l.uof0
                public final Object call(Object obj, Object obj2) {
                    return roj0.a;
                }
            }).take(1);
        } else {
            cVarJust = c.just(roj0.a);
        }
        this.f1041g = cVarJust.switchMap(new w9j() { // from class: l.vof0
            public final Object call(Object obj) {
                return qib0.f19830w0.doOnNext(new e30() { // from class: l.xof0
                    public final void call(Object obj2) {
                        yni.d(LaunchStep.SplashWaitUser);
                    }
                });
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.wof0
            public final void call(Object obj) {
                this.f25266a.m1120s((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m1124w() {
        Intent intentR = mgh0.r(getIntent());
        if (NullChecker.a(intentR)) {
            intentR.addFlags(65536);
            try {
                startActivity(intentR);
                finish();
                overridePendingTransition(pzb0.f19462b, pzb0.f19463c);
                return;
            } catch (SecurityException e) {
                CrashHelper.c(e);
            }
        }
        m1116o(getIntent());
    }
}
