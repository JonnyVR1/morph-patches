package com.p051p1.mobile.putong.account.p055ui.welcome;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.bpea.entry.common.DataType;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpProfileImageAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeV2Act;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.remote_config.C13262b;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.wxapi.WXEntryActivity;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.AbstractC19302p6;
import p153l.b7f0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.ccq0;
import p153l.hec0;
import p153l.jdq0;
import p153l.jyb;
import p153l.l51;
import p153l.o1j0;
import p153l.olj;
import p153l.oxp0;
import p153l.pf60;
import p153l.qa00;
import p153l.qsf0;
import p153l.qv5;
import p153l.qzd;
import p153l.uqb0;
import p153l.w1e;
import p153l.wcc0;
import p153l.wyd0;
import p153l.x20;
import p153l.y20;
import p153l.yp50;

/* JADX INFO: loaded from: classes9.dex */
public class WelcomeV2Act extends WelcomeBaseAct {

    /* JADX INFO: renamed from: c */
    public boolean f17784c = false;

    /* JADX INFO: renamed from: d */
    public ccq0 f17785d;

    /* JADX INFO: renamed from: e */
    public AbstractC19302p6 f17786e;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m30272B2() {
        dialog().m21506G0("android id").m21503F(qzd.m178769b()).m21566z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public /* synthetic */ void m30273D2() {
        Dialog dialogM21566z = dialog().m21506G0("device id 点击可复制").m21516M(hec0.f109129p).m21566z();
        TextView textView = (TextView) dialogM21566z.m21457P().findViewById(wcc0.f188458p);
        textView.setText(qzd.m178768a());
        qzd.m178768a();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.t5q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172223a.m30311C2(view);
            }
        });
        dialogM21566z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public /* synthetic */ void m30274E2() {
        b7f0.m102838a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m30275F2() {
        w1e.m204400d(act()).m204424I("Change ip").m204419D(100).m204420E(1).m204423H("").m204421F(new y20() { // from class: l.x5q0
            @Override // p153l.y20
            public final void call(Object obj) {
                tg50.f174038e = (String) obj;
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m30276H2() {
        SignUpData signUpData = new SignUpData();
        signUpData.gender = Gender.get("female");
        startActivity(FacebookSignUpProfileImageAct.m29582X1(this.act, signUpData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m30277I2(Dialog dialog, View view, int i, CharSequence charSequence) {
        qv5.m178251e(charSequence.equals("tantanapp"));
        qv5.f159697a.put(charSequence.toString());
        RemoteConfig.m80481x().m80504b0();
        l51.m152892L(this, SplashAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m30278K2() {
        C13262b.m80531a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public /* synthetic */ void m30279L2() {
        olj.INSTANCE.m168130c(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m30280N2() {
        Dialog dialogM21566z = dialog().m21506G0("one id 点击可复制").m21516M(hec0.f109129p).m21566z();
        TextView textView = (TextView) dialogM21566z.m21457P().findViewById(wcc0.f188458p);
        textView.setText(yp50.m217001d());
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.r5q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161375a.m30312M2(view);
            }
        });
        dialogM21566z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public /* synthetic */ void m30281Q2(EditText editText) {
        qv5.m178251e(editText.getText().toString().equals("tantanapp"));
        qv5.f159697a.put(editText.getText().toString());
        RemoteConfig.m80481x().m80504b0();
        l51.m152892L(this, SplashAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m30282R2() {
        final EditText editText = new EditText(this);
        editText.setBackground(null);
        editText.setText(qv5.f159697a.get());
        editText.setHint("name.dev.p1staff");
        editText.setSelection(editText.getText().length());
        bnl0.m105550d0(editText, qa00.m175859d(23.0f));
        dialog().m21506G0("Connect to developer's machine").m21535f0(new String[]{"tantanapp", "staging1.p1staff", "staging2.p1staff", "growth.dev.p1staff"}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.u5q0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f177668a.m30277I2(dialog, view, i, charSequence);
            }
        }).m21519P(editText, true).m21555t0(R$string.f17026y, new Runnable() { // from class: l.v5q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182564a.m30281Q2(editText);
            }
        }).m21566z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m30283S2() {
        String str;
        Location locationM80048q = uqb0.f180370E.m80048q();
        if (locationM80048q != null) {
            str = locationM80048q.m80014u() + Constants.SEPARATOR_COMMA + locationM80048q.m80016x();
        } else {
            str = "";
        }
        w1e.m204400d(act()).m204424I("Change location").m204419D(100).m204420E(1).m204430r("39.9385466,116.1172739").m204423H(str).m204421F(new y20() { // from class: l.y5q0
            @Override // p153l.y20
            public final void call(Object obj) {
                WelcomeV2Act.m30298l2((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m30284T2() {
        startActivityForResult(AccountModule.m29131H().toIntlMaps(this, 1, true), 1092);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m30285U2() {
        SignUpData signUpData = new SignUpData();
        signUpData.name = "Wencharm";
        signUpData.birthdate = Double.valueOf(SystemClock.currentThreadTimeMillis() - 628992000000L);
        signUpData.gender = Gender.get("male");
        signUpData.password = "000000";
        signUpData.countryCode = 86;
        signUpData.phoneNumber = "123456";
        startActivity(SignUpProfileImageAct.m29502Y1(this, signUpData));
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m30298l2(String str) {
        if (TextUtils.isEmpty(str)) {
            uqb0.f180370E.f54812a.put(Boolean.FALSE);
            uqb0.f180370E.m80051t();
            return;
        }
        String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
        double d = Double.parseDouble(strArrSplit[0]);
        double d2 = Double.parseDouble(strArrSplit[1]);
        uqb0.f180370E.f54813b.put(Double.valueOf(d));
        uqb0.f180370E.f54814c.put(Double.valueOf(d2));
        uqb0.f180370E.f54812a.put(Boolean.TRUE);
        uqb0.f180370E.m80051t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$1() {
        qsf0.m177799d().m177804h(this, "phone", SignInGrantType.password);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$19() {
        final wyd0 wyd0Var = AccountModule.f16755b.f181104a;
        w1e.m204400d(act()).m204424I("Change Account Sdk Client Id").m204419D(100).m204420E(1).m204430r("100003").m204423H(wyd0Var.get()).m204421F(new y20() { // from class: l.q5q0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyd0Var.put((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$21() {
        w1e.m204400d(act()).m204424I("Change MCC").m204419D(3).m204420E(1).m204429q(2).m204423H("" + uqb0.f180400f0).m204421F(new y20() { // from class: l.w5q0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.f180400f0 = Integer.parseInt((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m30311C2(View view) {
        ((ClipboardManager) getSystemService(DataType.CLIPBOARD)).setText(qzd.m178768a());
        o1j0.m165651y("已复制");
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m30312M2(View view) {
        ((ClipboardManager) getSystemService(DataType.CLIPBOARD)).setText(yp50.m217001d());
        o1j0.m165651y("已复制");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(jyb.m147494Y("smart save", new x20() { // from class: l.h5q0
            @Override // p153l.x20
            public final void call() {
                this.f107966a.lambda$debugItems$1();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Connect to developer's machine", new x20() { // from class: l.g6q0
            @Override // p153l.x20
            public final void call() {
                this.f102475a.m30282R2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Change location", new x20() { // from class: l.i5q0
            @Override // p153l.x20
            public final void call() {
                this.f113088a.m30283S2();
            }
        }));
        if (NullChecker.m82486a(AccountModule.m29131H())) {
            arrayListDebugItems.add(jyb.m147494Y("Pick city", new x20() { // from class: l.j5q0
                @Override // p153l.x20
                public final void call() {
                    this.f118491a.m30284T2();
                }
            }));
        }
        arrayListDebugItems.add(jyb.m147494Y("Toggle facebookAppId", new x20() { // from class: l.k5q0
            @Override // p153l.x20
            public final void call() {
                C1600c.m8088N("407465776312149");
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Start SignUpProfileImageAct", new x20() { // from class: l.l5q0
            @Override // p153l.x20
            public final void call() {
                this.f130160a.m30285U2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show android id", new x20() { // from class: l.m5q0
            @Override // p153l.x20
            public final void call() {
                this.f134923a.m30272B2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show device id", new x20() { // from class: l.n5q0
            @Override // p153l.x20
            public final void call() {
                this.f140377a.m30273D2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("shortcut badger show", new x20() { // from class: l.o5q0
            @Override // p153l.x20
            public final void call() {
                this.f145103a.m30274E2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("pull alive test ", new oxp0()));
        arrayListDebugItems.add(jyb.m147494Y("Change ip for httpdns", new x20() { // from class: l.s5q0
            @Override // p153l.x20
            public final void call() {
                this.f166447a.m30275F2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("pull httpdns data", new x20() { // from class: l.z5q0
            @Override // p153l.x20
            public final void call() {
                tg50.m191018g().m191020e();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Facebook profile image page", new x20() { // from class: l.a6q0
            @Override // p153l.x20
            public final void call() {
                this.f68748a.m30276H2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Change Account Sdk Client Id", new x20() { // from class: l.b6q0
            @Override // p153l.x20
            public final void call() {
                this.f75203a.lambda$debugItems$19();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Intl change MCC", new x20() { // from class: l.c6q0
            @Override // p153l.x20
            public final void call() {
                this.f79987a.lambda$debugItems$21();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show RemoteConfig", new x20() { // from class: l.d6q0
            @Override // p153l.x20
            public final void call() {
                this.f85393a.m30278K2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("图形滑块", new x20() { // from class: l.e6q0
            @Override // p153l.x20
            public final void call() {
                this.f92340a.m30279L2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show one id", new x20() { // from class: l.f6q0
            @Override // p153l.x20
            public final void call() {
                this.f97438a.m30280N2();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17786e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17785d = new ccq0(this);
        jdq0 jdq0Var = new jdq0(this);
        this.f17786e = jdq0Var;
        this.f17785d.mo52715C(jdq0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        super.initPageHelper();
        if (!NullChecker.m82486a(getIntent())) {
            str = "other";
        } else if (getIntent().getBooleanExtra("enable_back", false)) {
            str = "add_account";
        } else if (getIntent().getBooleanExtra("delete_account_popup", false)) {
            str = "delete_account_popup";
        } else if (getIntent().getBooleanExtra("isFromSignOut", false)) {
            str = "sign_out";
        } else if (getIntent().getBooleanExtra("from_splash", false)) {
            str = "onboard";
        } else {
            str = "other";
        }
        this.pageHelper.m152781p(jyb.m147494Y("show_status", AccountModule.m29130F().signedIn_() ? "after_sign" : "before_sign"), jyb.m147494Y("landingpage_source", str));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17785d.mo40473a0();
        creates(new y20() { // from class: l.p5q0
            @Override // p153l.y20
            public final void call(Object obj) {
                g9r.m129599b();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f17785d.m109015t5(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        this.f17785d.m109012U5();
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f17785d.m109016v5(list);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.f17785d.m109018y5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f17785d.m109019z5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return WXEntryActivity.PID;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(1024);
        this.f17785d.f80992a = getIntent().getBooleanExtra("show_update_dialog", false);
        this.f17784c = getIntent().getBooleanExtra("is_clear_task", false);
        this.f17785d.f80999h = getIntent().getBooleanExtra("from_splash", false);
        this.f17785d.f80993b = (AccountTempApi.InactiveType) getIntent().getSerializableExtra("inactive_type");
        this.f17785d.f80994c = getIntent().getStringExtra("inactive_category");
        this.f17785d.f81000i = getIntent().getBooleanExtra("hasContract", false);
        this.f17785d.f81001j = getIntent().getBooleanExtra("first_welcome", false);
        setSwipeBackEnable(getIntent().getBooleanExtra("enable_back", false));
        if (this.f17784c) {
            bsj0.m106261S(this);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldRemarginContent() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return jyb.m147507f0("app session", App.f16092i.get(), uqb0.f180373F0);
    }
}
