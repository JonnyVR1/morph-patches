package com.p051p1.mobile.putong.account.p055ui.welcome;

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
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.welcome.SplashAct;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.WebSocketManager;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.abe0;
import p153l.af60;
import p153l.bqj0;
import p153l.cmb0;
import p153l.fo0;
import p153l.i4g0;
import p153l.kcg0;
import p153l.l4g0;
import p153l.nae0;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.toh0;
import p153l.tu2;
import p153l.uqb0;
import p153l.uqi;
import p153l.ur2;
import p153l.uxj0;
import p153l.v7c0;
import p153l.y1l0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class SplashAct extends Activity {

    /* JADX INFO: renamed from: b */
    public kcg0 f17766b;

    /* JADX INFO: renamed from: d */
    public long f17768d;

    /* JADX INFO: renamed from: e */
    public kcg0 f17769e;

    /* JADX INFO: renamed from: f */
    public kcg0 f17770f;

    /* JADX INFO: renamed from: g */
    public kcg0 f17771g;

    /* JADX INFO: renamed from: a */
    public l4g0 f17765a = null;

    /* JADX INFO: renamed from: c */
    public boolean f17767c = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.welcome.SplashAct$a */
    public class C4824a extends ur2 {
        public C4824a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_landing_view";
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m30204k(DialogInterface dialogInterface, int i) {
        tu2.m192703a("[common][DatabaseStore]", "userMeStateErrorDialog click retry");
        uqb0.m197271f1();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (IntlCountryCodeController.m29125v()) {
            context = bqj0.m105946c(context);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        uqi.m197338e(LaunchStep.SplashAll, LaunchStep.MainStartWait);
    }

    /* JADX INFO: renamed from: l */
    public final void m30205l() {
        if (this.f17767c) {
            m30208o(getIntent());
        } else {
            this.f17767c = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m30206m() {
        finish();
        overridePendingTransition(v7c0.f182749b, v7c0.f182750c);
        uqi.m197343j();
    }

    /* JADX INFO: renamed from: n */
    public final void m30207n() {
        this.f17765a = new l4g0(new C4824a(), SplashAct.class.getName());
    }

    /* JADX INFO: renamed from: o */
    public final void m30208o(final Intent intent) {
        if (!NullChecker.m82486a(intent) || !TantanApp.f17899c.m111145p(intent)) {
            this.f17769e = (AccountModule.m29130F().signedIn_() ? uqb0.f180404j0.f88248f.take(1) : C22421c.just(uxj0.f181467a)).subscribe(psd0.m173596G(new y20() { // from class: l.xwf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196493a.m30209p(intent, (uxj0) obj);
                }
            }));
        } else {
            setIntent(null);
            m30206m();
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
            CrashHelper.m82479c(new Exception("tankerFlag", th));
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (IntlCountryCodeController.m29125v()) {
            configuration = bqj0.m105945b(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        uqi.m197337d(LaunchStep.SplashPageCreateWait);
        uqi.m197339f(LaunchStep.SplashCreate, LaunchStep.SplashAll);
        uqi.m197344k();
        af60.m97310e().m97312b(this);
        super.onCreate(bundle);
        m30207n();
        this.f17765a.m152768c();
        this.f17765a.m152783r();
        y1l0.m213956a(this);
        try {
            intent = (Intent) getIntent().getParcelableExtra("extra_intent");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            intent = null;
        }
        if (NullChecker.m82486a(intent)) {
            setIntent(intent);
            getIntent().setExtrasClassLoader(getClassLoader());
        }
        WebSocketManager.m30421Q().m30476l0(true);
        cmb0.m111112r(this);
        if (AccountModule.m29130F().signedIn_()) {
            uqb0.f180370E.m80052u(Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        }
        m30215v();
        uqi.m197337d(LaunchStep.SplashCreate);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kcg0 kcg0Var = this.f17766b;
        if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
            this.f17766b.unsubscribe();
        }
        kcg0 kcg0Var2 = this.f17769e;
        if (kcg0Var2 != null && !kcg0Var2.isUnsubscribed()) {
            this.f17769e.unsubscribe();
        }
        kcg0 kcg0Var3 = this.f17770f;
        if (kcg0Var3 != null && !kcg0Var3.isUnsubscribed()) {
            this.f17770f.unsubscribe();
        }
        kcg0 kcg0Var4 = this.f17771g;
        if (kcg0Var4 != null && !kcg0Var4.isUnsubscribed()) {
            this.f17771g.unsubscribe();
        }
        this.f17765a.m152772g();
        this.f17765a.m152770e();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f17767c = false;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f17767c) {
            m30205l();
        }
        this.f17767c = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        af60.m97310e().m97320k(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m30209p(Intent intent, uxj0 uxj0Var) {
        if (AccountModule.m29130F().signedIn_()) {
            TantanApp.f17899c.m111144e0();
            Uri data = intent != null ? intent.getData() : null;
            if (data != null) {
                try {
                    AppOpenWayStats.m30670d(data.toString());
                } catch (Exception e) {
                    CrashHelper.m82483g(e);
                    startActivity(new Intent(uqb0.f180397c0.getMainActIntent(this)));
                }
            }
            nae0.m162083m(this, data);
        } else {
            Intent intent2 = new Intent(this, (Class<?>) WelcomeAct.class);
            intent2.putExtra("from_splash", true);
            m30213t(NullChecker.m82486a(intent) ? intent.getData() : null);
            if (NullChecker.m82488c(intent, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
                intent2.putExtra("first_welcome", intent.getBooleanExtra("first_welcome", false));
                startActivity(intent2);
            }
        }
        m30206m();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m30210q(DialogInterface dialogInterface, int i) {
        i4g0.m138493B("e_auto_logout", "", pf60.m172085a("logout_type", "db_crash"));
        tu2.m192703a("[common][DatabaseStore]", "userMeStateErrorDialog click signout");
        uqb0.m197281q0();
        m30216w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ uxj0 m30211r(String str) {
        if (Network.hasInvalidHash()) {
            ABManager.m30360v(1);
        }
        if (this.f17768d == 0) {
            this.f17768d = SystemClock.elapsedRealtime();
        }
        uqi.m197337d(LaunchStep.SplashWaitAb);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m30212s(Integer num) {
        if (num.intValue() == 0) {
            m30216w();
        } else if (num.intValue() == 1) {
            m30216w();
        } else if (num.intValue() == 2) {
            m30214u();
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    /* JADX INFO: renamed from: t */
    public final void m30213t(Uri uri) {
        if (uri != null && NullChecker.m82486a(uri.getScheme()) && uri.getScheme().startsWith("tantan")) {
            if (uri.toString().startsWith("tantanapp://join_group?groupId=") || uri.toString().startsWith("tantanapp://web/login/oauth")) {
                abe0.f69605g = uri.toString();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m30214u() {
        DialogInterfaceC0075a dialogInterfaceC0075aCreate = new DialogInterfaceC0075a.a(this).setMessage(R$string.f16820L3).setPositiveButton(R$string.f16825M3, new DialogInterface.OnClickListener() { // from class: l.hxf0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SplashAct.m30204k(dialogInterface, i);
            }
        }).setNegativeButton(R$string.f16830N3, new DialogInterface.OnClickListener() { // from class: l.ywf0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f201827a.m30210q(dialogInterface, i);
            }
        }).setCancelable(false).create();
        dialogInterfaceC0075aCreate.setCanceledOnTouchOutside(false);
        dialogInterfaceC0075aCreate.show();
    }

    /* JADX INFO: renamed from: v */
    public final void m30215v() {
        C22421c c22421cJust;
        uqi.m197339f(LaunchStep.SplashWaitUser);
        if (AccountModule.m29130F().signedIn_()) {
            uqi.m197339f(LaunchStep.SplashWaitAb, LaunchStep.SplashWaitPlugin);
            c22421cJust = C22421c.combineLatest(Network.hash().filter(new qcj() { // from class: l.zwf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!Network.hasInvalidHash());
                }
            }).timeout(5L, TimeUnit.SECONDS, C22421c.just(null)).observeOn(fo0.m126432a()).take(1).map(new qcj() { // from class: l.axf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f73845a.m30211r((String) obj);
                }
            }), uqb0.f180404j0.f88244b.doOnNext(new y20() { // from class: l.bxf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqi.m197337d(LaunchStep.SplashWaitPlugin);
                }
            }).map(new qcj() { // from class: l.cxf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uxj0.f181467a;
                }
            }), new rcj() { // from class: l.dxf0
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return uxj0.f181467a;
                }
            }).take(1);
        } else {
            c22421cJust = C22421c.just(uxj0.f181467a);
        }
        this.f17771g = c22421cJust.switchMap(new qcj() { // from class: l.exf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180422w0.doOnNext(new y20() { // from class: l.gxf0
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        uqi.m197337d(LaunchStep.SplashWaitUser);
                    }
                });
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.fxf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101260a.m30212s((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m30216w() {
        Intent intentM192058r = toh0.m192058r(getIntent());
        if (NullChecker.m82486a(intentM192058r)) {
            intentM192058r.addFlags(65536);
            try {
                startActivity(intentM192058r);
                finish();
                overridePendingTransition(v7c0.f182749b, v7c0.f182750c);
                return;
            } catch (SecurityException e) {
                CrashHelper.m82479c(e);
            }
        }
        m30208o(getIntent());
    }
}
