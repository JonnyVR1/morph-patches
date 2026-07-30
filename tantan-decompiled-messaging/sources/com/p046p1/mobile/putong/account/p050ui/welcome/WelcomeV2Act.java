package com.p046p1.mobile.putong.account.p050ui.welcome;

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
import com.facebook.C1577c;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpProfileImageAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeV2Act;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.remote_config.C13099b;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.wxapi.WXEntryActivity;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.AbstractC19863s6;
import p149l.c6c0;
import p149l.d30;
import p149l.dyd;
import p149l.e30;
import p149l.e51;
import p149l.f4q0;
import p149l.hkf0;
import p149l.i0e;
import p149l.j760;
import p149l.kop0;
import p149l.lsi0;
import p149l.mu5;
import p149l.q4c0;
import p149l.qib0;
import p149l.sh50;
import p149l.t100;
import p149l.uqd0;
import p149l.uye0;
import p149l.vij;
import p149l.vwb;
import p149l.xdl0;
import p149l.y2q0;
import p149l.yij0;

/* JADX INFO: loaded from: classes9.dex */
public class WelcomeV2Act extends WelcomeBaseAct {

    /* JADX INFO: renamed from: c */
    public boolean f17065c = false;

    /* JADX INFO: renamed from: d */
    public y2q0 f17066d;

    /* JADX INFO: renamed from: e */
    public AbstractC19863s6 f17067e;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m29273A2() {
        dialog().m20507G0("android id").m20504F(dyd.m114056b()).m20567z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public /* synthetic */ void m29274C2() {
        Dialog dialogM20567z = dialog().m20507G0("device id 点击可复制").m20517M(c6c0.f79517p).m20567z();
        TextView textView = (TextView) dialogM20567z.m20458P().findViewById(q4c0.f152610p);
        textView.setText(dyd.m114055a());
        dyd.m114055a();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.pwp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151591a.m29313B2(view);
            }
        });
        dialogM20567z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public /* synthetic */ void m29275D2() {
        uye0.m196286a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public /* synthetic */ void m29276E2() {
        i0e.m133795d(act()).m133819I("Change ip").m133814D(100).m133815E(1).m133818H("").m133816F(new e30() { // from class: l.twp0
            @Override // p149l.e30
            public final void call(Object obj) {
                m850.f132521e = (String) obj;
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m29277F2() {
        SignUpData signUpData = new SignUpData();
        signUpData.gender = Gender.get("female");
        startActivity(FacebookSignUpProfileImageAct.m28583V1(this.act, signUpData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m29278H2(Dialog dialog, View view, int i, CharSequence charSequence) {
        mu5.m156380e(charSequence.equals("tantanapp"));
        mu5.f135733a.put(charSequence.toString());
        RemoteConfig.m79298x().m79321b0();
        e51.m114747L(this, SplashAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m29279I2() {
        C13099b.m79348a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m29280K2() {
        vij.INSTANCE.m198583c(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m29281M2() {
        Dialog dialogM20567z = dialog().m20507G0("one id 点击可复制").m20517M(c6c0.f79517p).m20567z();
        TextView textView = (TextView) dialogM20567z.m20458P().findViewById(q4c0.f152610p);
        textView.setText(sh50.m184159d());
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.nwp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140963a.m29314L2(view);
            }
        });
        dialogM20567z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m29282N2(EditText editText) {
        mu5.m156380e(editText.getText().toString().equals("tantanapp"));
        mu5.f135733a.put(editText.getText().toString());
        RemoteConfig.m79298x().m79321b0();
        e51.m114747L(this, SplashAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public /* synthetic */ void m29283Q2() {
        final EditText editText = new EditText(this);
        editText.setBackground(null);
        editText.setText(mu5.f135733a.get());
        editText.setHint("name.dev.p1staff");
        editText.setSelection(editText.getText().length());
        xdl0.m208370d0(editText, t100.m186890d(23.0f));
        dialog().m20507G0("Connect to developer's machine").m20536f0(new String[]{"tantanapp", "staging1.p1staff", "staging2.p1staff", "growth.dev.p1staff"}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.qwp0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f156753a.m29278H2(dialog, view, i, charSequence);
            }
        }).m20520P(editText, true).m20556t0(R$string.f16307y, new Runnable() { // from class: l.rwp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161364a.m29282N2(editText);
            }
        }).m20567z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m29284R2() {
        String str;
        Location locationM78865q = qib0.f154687E.m78865q();
        if (locationM78865q != null) {
            str = locationM78865q.m78831u() + Constants.SEPARATOR_COMMA + locationM78865q.m78833x();
        } else {
            str = "";
        }
        i0e.m133795d(act()).m133819I("Change location").m133814D(100).m133815E(1).m133825r("39.9385466,116.1172739").m133818H(str).m133816F(new e30() { // from class: l.uwp0
            @Override // p149l.e30
            public final void call(Object obj) {
                WelcomeV2Act.m29299k2((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m29285S2() {
        startActivityForResult(AccountModule.m28132H().toIntlMaps(this, 1, true), 1092);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m29286T2() {
        SignUpData signUpData = new SignUpData();
        signUpData.name = "Wencharm";
        signUpData.birthdate = Double.valueOf(SystemClock.currentThreadTimeMillis() - 628992000000L);
        signUpData.gender = Gender.get("male");
        signUpData.password = "000000";
        signUpData.countryCode = 86;
        signUpData.phoneNumber = "123456";
        startActivity(SignUpProfileImageAct.m28503X1(this, signUpData));
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ void m29299k2(String str) {
        if (TextUtils.isEmpty(str)) {
            qib0.f154687E.f53964a.put(Boolean.FALSE);
            qib0.f154687E.m78868t();
            return;
        }
        String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
        double d = Double.parseDouble(strArrSplit[0]);
        double d2 = Double.parseDouble(strArrSplit[1]);
        qib0.f154687E.f53965b.put(Double.valueOf(d));
        qib0.f154687E.f53966c.put(Double.valueOf(d2));
        qib0.f154687E.f53964a.put(Boolean.TRUE);
        qib0.f154687E.m78868t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$1() {
        hkf0.m131486d().m131491h(this, "phone", SignInGrantType.password);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$19() {
        final uqd0 uqd0Var = AccountModule.f16036b.f71983a;
        i0e.m133795d(act()).m133819I("Change Account Sdk Client Id").m133814D(100).m133815E(1).m133825r("100003").m133818H(uqd0Var.get()).m133816F(new e30() { // from class: l.mwp0
            @Override // p149l.e30
            public final void call(Object obj) {
                uqd0Var.put((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$21() {
        i0e.m133795d(act()).m133819I("Change MCC").m133814D(3).m133815E(1).m133824q(2).m133818H("" + qib0.f154717f0).m133816F(new e30() { // from class: l.swp0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.f154717f0 = Integer.parseInt((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m29313B2(View view) {
        ((ClipboardManager) getSystemService(DataType.CLIPBOARD)).setText(dyd.m114055a());
        lsi0.m151595y("已复制");
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m29314L2(View view) {
        ((ClipboardManager) getSystemService(DataType.CLIPBOARD)).setText(sh50.m184159d());
        lsi0.m151595y("已复制");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.m200311Y("smart save", new d30() { // from class: l.dwp0
            @Override // p149l.d30
            public final void call() {
                this.f88198a.lambda$debugItems$1();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Connect to developer's machine", new d30() { // from class: l.cxp0
            @Override // p149l.d30
            public final void call() {
                this.f82886a.m29283Q2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Change location", new d30() { // from class: l.ewp0
            @Override // p149l.d30
            public final void call() {
                this.f93523a.m29284R2();
            }
        }));
        if (NullChecker.m81303a(AccountModule.m28132H())) {
            arrayListDebugItems.add(vwb.m200311Y("Pick city", new d30() { // from class: l.fwp0
                @Override // p149l.d30
                public final void call() {
                    this.f99677a.m29285S2();
                }
            }));
        }
        arrayListDebugItems.add(vwb.m200311Y("Toggle facebookAppId", new d30() { // from class: l.gwp0
            @Override // p149l.d30
            public final void call() {
                C1577c.m8034N("407465776312149");
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Start SignUpProfileImageAct", new d30() { // from class: l.hwp0
            @Override // p149l.d30
            public final void call() {
                this.f109779a.m29286T2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show android id", new d30() { // from class: l.iwp0
            @Override // p149l.d30
            public final void call() {
                this.f115290a.m29273A2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show device id", new d30() { // from class: l.jwp0
            @Override // p149l.d30
            public final void call() {
                this.f120105a.m29274C2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("shortcut badger show", new d30() { // from class: l.kwp0
            @Override // p149l.d30
            public final void call() {
                this.f125007a.m29275D2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("pull alive test ", new kop0()));
        arrayListDebugItems.add(vwb.m200311Y("Change ip for httpdns", new d30() { // from class: l.owp0
            @Override // p149l.d30
            public final void call() {
                this.f146077a.m29276E2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("pull httpdns data", new d30() { // from class: l.vwp0
            @Override // p149l.d30
            public final void call() {
                m850.m153455i().m153457e();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Facebook profile image page", new d30() { // from class: l.wwp0
            @Override // p149l.d30
            public final void call() {
                this.f188397a.m29277F2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Change Account Sdk Client Id", new d30() { // from class: l.xwp0
            @Override // p149l.d30
            public final void call() {
                this.f194752a.lambda$debugItems$19();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Intl change MCC", new d30() { // from class: l.ywp0
            @Override // p149l.d30
            public final void call() {
                this.f200521a.lambda$debugItems$21();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show RemoteConfig", new d30() { // from class: l.zwp0
            @Override // p149l.d30
            public final void call() {
                this.f205255a.m29279I2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("图形滑块", new d30() { // from class: l.axp0
            @Override // p149l.d30
            public final void call() {
                this.f72231a.m29280K2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show one id", new d30() { // from class: l.bxp0
            @Override // p149l.d30
            public final void call() {
                this.f77818a.m29281M2();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17067e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17066d = new y2q0(this);
        f4q0 f4q0Var = new f4q0(this);
        this.f17067e = f4q0Var;
        this.f17066d.mo51532C(f4q0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        super.initPageHelper();
        if (!NullChecker.m81303a(getIntent())) {
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
        this.pageHelper.m109040p(vwb.m200311Y("show_status", AccountModule.m28131F().signedIn_() ? "after_sign" : "before_sign"), vwb.m200311Y("landingpage_source", str));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17066d.mo39470a0();
        creates(new e30() { // from class: l.lwp0
            @Override // p149l.e30
            public final void call(Object obj) {
                f7r.m119818b();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f17066d.m212712t5(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        this.f17066d.m212709U5();
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f17066d.m212713v5(list);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.f17066d.m212715y5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f17066d.m212716z5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return WXEntryActivity.PID;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(1024);
        this.f17066d.f195670a = getIntent().getBooleanExtra("show_update_dialog", false);
        this.f17065c = getIntent().getBooleanExtra("is_clear_task", false);
        this.f17066d.f195677h = getIntent().getBooleanExtra("from_splash", false);
        this.f17066d.f195671b = (AccountTempApi.InactiveType) getIntent().getSerializableExtra("inactive_type");
        this.f17066d.f195672c = getIntent().getStringExtra("inactive_category");
        this.f17066d.f195678i = getIntent().getBooleanExtra("hasContract", false);
        this.f17066d.f195679j = getIntent().getBooleanExtra("first_welcome", false);
        setSwipeBackEnable(getIntent().getBooleanExtra("enable_back", false));
        if (this.f17065c) {
            yij0.m214941S(this);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldRemarginContent() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return vwb.m200324f0("app session", App.f15373i.get(), qib0.f154690F0);
    }
}
