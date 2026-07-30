package com.p046p1.mobile.putong.account.p050ui.welcome;

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
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.welcome.SplashAct;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.WebSocketManager;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.cwf0;
import p149l.du2;
import p149l.e30;
import p149l.er2;
import p149l.j2e0;
import p149l.j760;
import p149l.jo0;
import p149l.mgh0;
import p149l.mkd0;
import p149l.pzb0;
import p149l.qib0;
import p149l.roj0;
import p149l.ssk0;
import p149l.u660;
import p149l.w2e0;
import p149l.w9j;
import p149l.x9j;
import p149l.ydb0;
import p149l.ygj0;
import p149l.yni;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class SplashAct extends Activity {

    /* JADX INFO: renamed from: b */
    public c4g0 f17047b;

    /* JADX INFO: renamed from: d */
    public long f17049d;

    /* JADX INFO: renamed from: e */
    public c4g0 f17050e;

    /* JADX INFO: renamed from: f */
    public c4g0 f17051f;

    /* JADX INFO: renamed from: g */
    public c4g0 f17052g;

    /* JADX INFO: renamed from: a */
    public cwf0 f17046a = null;

    /* JADX INFO: renamed from: c */
    public boolean f17048c = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.welcome.SplashAct$a */
    public class C4673a extends er2 {
        public C4673a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_landing_view";
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m29206k(DialogInterface dialogInterface, int i) {
        du2.m113670a("[common][DatabaseStore]", "userMeStateErrorDialog click retry");
        qib0.m174817f1();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (IntlCountryCodeController.m28126v()) {
            context = ygj0.m214728c(context);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        yni.m215416e(LaunchStep.SplashAll, LaunchStep.MainStartWait);
    }

    /* JADX INFO: renamed from: l */
    public final void m29207l() {
        if (this.f17048c) {
            m29210o(getIntent());
        } else {
            this.f17048c = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m29208m() {
        finish();
        overridePendingTransition(pzb0.f151937b, pzb0.f151938c);
        yni.m215421j();
    }

    /* JADX INFO: renamed from: n */
    public final void m29209n() {
        this.f17046a = new cwf0(new C4673a(), SplashAct.class.getName());
    }

    /* JADX INFO: renamed from: o */
    public final void m29210o(final Intent intent) {
        if (!NullChecker.m81303a(intent) || !TantanApp.f17180c.m214267p(intent)) {
            this.f17050e = (AccountModule.m28131F().signedIn_() ? qib0.f154721j0.f174912f.take(1) : C22306c.just(roj0.f160388a)).subscribe(mkd0.m154955G(new e30() { // from class: l.oof0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144869a.m29211p(intent, (roj0) obj);
                }
            }));
        } else {
            setIntent(null);
            m29208m();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
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
            CrashHelper.m81296c(new Exception("tankerFlag", th));
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (IntlCountryCodeController.m28126v()) {
            configuration = ygj0.m214727b(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        yni.m215415d(LaunchStep.SplashPageCreateWait);
        yni.m215417f(LaunchStep.SplashCreate, LaunchStep.SplashAll);
        yni.m215422k();
        u660.m191956e().m191958b(this);
        super.onCreate(bundle);
        m29209n();
        this.f17046a.m109027c();
        this.f17046a.m109042r();
        ssk0.m185749a(this);
        try {
            intent = (Intent) getIntent().getParcelableExtra("extra_intent");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            intent = null;
        }
        if (NullChecker.m81303a(intent)) {
            setIntent(intent);
            getIntent().setExtrasClassLoader(getClassLoader());
        }
        WebSocketManager.m29423Q().m29478l0(true);
        ydb0.m214234r(this);
        if (AccountModule.m28131F().signedIn_()) {
            qib0.f154687E.m78869u(Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        }
        m29217v();
        yni.m215415d(LaunchStep.SplashCreate);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c4g0 c4g0Var = this.f17047b;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f17047b.unsubscribe();
        }
        c4g0 c4g0Var2 = this.f17050e;
        if (c4g0Var2 != null && !c4g0Var2.isUnsubscribed()) {
            this.f17050e.unsubscribe();
        }
        c4g0 c4g0Var3 = this.f17051f;
        if (c4g0Var3 != null && !c4g0Var3.isUnsubscribed()) {
            this.f17051f.unsubscribe();
        }
        c4g0 c4g0Var4 = this.f17052g;
        if (c4g0Var4 != null && !c4g0Var4.isUnsubscribed()) {
            this.f17052g.unsubscribe();
        }
        this.f17046a.m109031g();
        this.f17046a.m109029e();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f17048c = false;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f17048c) {
            m29207l();
        }
        this.f17048c = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        u660.m191956e().m191966k(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m29211p(Intent intent, roj0 roj0Var) {
        if (AccountModule.m28131F().signedIn_()) {
            TantanApp.f17180c.m214266e0();
            Uri data = intent != null ? intent.getData() : null;
            if (data != null) {
                try {
                    AppOpenWayStats.m29672d(data.toString());
                } catch (Exception e) {
                    CrashHelper.m81300g(e);
                    startActivity(new Intent(qib0.f154714c0.getMainActIntent(this)));
                }
            }
            j2e0.m139446m(this, data);
        } else {
            Intent intent2 = new Intent(this, (Class<?>) WelcomeAct.class);
            intent2.putExtra("from_splash", true);
            m29215t(NullChecker.m81303a(intent) ? intent.getData() : null);
            if (NullChecker.m81305c(intent, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
                intent2.putExtra("first_welcome", intent.getBooleanExtra("first_welcome", false));
                startActivity(intent2);
            }
        }
        m29208m();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m29212q(DialogInterface dialogInterface, int i) {
        zvf0.m220369B("e_auto_logout", "", j760.m140076a("logout_type", "db_crash"));
        du2.m113670a("[common][DatabaseStore]", "userMeStateErrorDialog click signout");
        qib0.m174827q0();
        m29218w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ roj0 m29213r(String str) {
        if (Network.hasInvalidHash()) {
            ABManager.m29362v(1);
        }
        if (this.f17049d == 0) {
            this.f17049d = SystemClock.elapsedRealtime();
        }
        yni.m215415d(LaunchStep.SplashWaitAb);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m29214s(Integer num) {
        if (num.intValue() == 0) {
            m29218w();
        } else if (num.intValue() == 1) {
            m29218w();
        } else if (num.intValue() == 2) {
            m29216u();
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    /* JADX INFO: renamed from: t */
    public final void m29215t(Uri uri) {
        if (uri != null && NullChecker.m81303a(uri.getScheme()) && uri.getScheme().startsWith("tantan")) {
            if (uri.toString().startsWith("tantanapp://join_group?groupId=") || uri.toString().startsWith("tantanapp://web/login/oauth")) {
                w2e0.f184217g = uri.toString();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m29216u() {
        DialogInterfaceC0074a dialogInterfaceC0074aCreate = new DialogInterfaceC0074a.a(this).setMessage(R$string.f16101L3).setPositiveButton(R$string.f16106M3, new DialogInterface.OnClickListener() { // from class: l.yof0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SplashAct.m29206k(dialogInterface, i);
            }
        }).setNegativeButton(R$string.f16111N3, new DialogInterface.OnClickListener() { // from class: l.pof0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f150501a.m29212q(dialogInterface, i);
            }
        }).setCancelable(false).create();
        dialogInterfaceC0074aCreate.setCanceledOnTouchOutside(false);
        dialogInterfaceC0074aCreate.show();
    }

    /* JADX INFO: renamed from: v */
    public final void m29217v() {
        C22306c c22306cJust;
        yni.m215417f(LaunchStep.SplashWaitUser);
        if (AccountModule.m28131F().signedIn_()) {
            yni.m215417f(LaunchStep.SplashWaitAb, LaunchStep.SplashWaitPlugin);
            c22306cJust = C22306c.combineLatest(Network.hash().filter(new w9j() { // from class: l.qof0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!Network.hasInvalidHash());
                }
            }).timeout(5L, TimeUnit.SECONDS, C22306c.just(null)).observeOn(jo0.m142408a()).take(1).map(new w9j() { // from class: l.rof0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f160382a.m29213r((String) obj);
                }
            }), qib0.f154721j0.f174908b.doOnNext(new e30() { // from class: l.sof0
                @Override // p149l.e30
                public final void call(Object obj) {
                    yni.m215415d(LaunchStep.SplashWaitPlugin);
                }
            }).map(new w9j() { // from class: l.tof0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return roj0.f160388a;
                }
            }), new x9j() { // from class: l.uof0
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return roj0.f160388a;
                }
            }).take(1);
        } else {
            c22306cJust = C22306c.just(roj0.f160388a);
        }
        this.f17052g = c22306cJust.switchMap(new w9j() { // from class: l.vof0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154739w0.doOnNext(new e30() { // from class: l.xof0
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        yni.m215415d(LaunchStep.SplashWaitUser);
                    }
                });
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.wof0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187410a.m29214s((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m29218w() {
        Intent intentM154562r = mgh0.m154562r(getIntent());
        if (NullChecker.m81303a(intentM154562r)) {
            intentM154562r.addFlags(65536);
            try {
                startActivity(intentM154562r);
                finish();
                overridePendingTransition(pzb0.f151937b, pzb0.f151938c);
                return;
            } catch (SecurityException e) {
                CrashHelper.m81296c(e);
            }
        }
        m29210o(getIntent());
    }
}
