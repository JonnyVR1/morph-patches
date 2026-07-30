package com.p051p1.mobile.putong.account.p055ui.welcome;

import android.content.ClipboardManager;
import android.content.Context;
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
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
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
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p153l.AbstractC19037o6;
import p153l.ak20;
import p153l.b7f0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.f5q0;
import p153l.hec0;
import p153l.jyb;
import p153l.l51;
import p153l.lhl;
import p153l.o1j0;
import p153l.olj;
import p153l.oxp0;
import p153l.pf60;
import p153l.qa00;
import p153l.qsf0;
import p153l.qv5;
import p153l.qzd;
import p153l.uqb0;
import p153l.v3q0;
import p153l.w1e;
import p153l.wcc0;
import p153l.wyd0;
import p153l.x20;
import p153l.x95;
import p153l.y20;
import p153l.yp50;

/* JADX INFO: loaded from: classes9.dex */
public class WelcomeAct extends WelcomeBaseAct {

    /* JADX INFO: renamed from: f */
    public static String f17776f;

    /* JADX INFO: renamed from: g */
    public static String f17777g;

    /* JADX INFO: renamed from: h */
    public static String f17778h;

    /* JADX INFO: renamed from: c */
    public boolean f17779c = false;

    /* JADX INFO: renamed from: d */
    public v3q0 f17780d;

    /* JADX INFO: renamed from: e */
    public AbstractC19037o6 f17781e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.welcome.WelcomeAct$a */
    public class C4825a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f17782a;

        public C4825a(TextView textView) {
            this.f17782a = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit invoke(final String str) {
            this.f17782a.setText(str);
            this.f17782a.setOnClickListener(new View.OnClickListener() { // from class: l.wxp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191509a.m30270c(str, view);
                }
            });
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m30270c(String str, View view) {
            ((ClipboardManager) WelcomeAct.this.getSystemService(DataType.CLIPBOARD)).setText(str);
            o1j0.m165651y("已复制");
        }
    }

    /* JADX INFO: renamed from: E2 */
    public static Intent m30223E2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WelcomeAct.class);
        intent.putExtra("enable_back", z);
        return intent;
    }

    /* JADX INFO: renamed from: F2 */
    public static Intent m30224F2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WelcomeAct.class);
        intent.addFlags(268468224);
        intent.putExtra("show_update_dialog", z);
        intent.putExtra("is_clear_task", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m30225H2() {
        w1e.C20993b c20993bM204430r = w1e.m204400d(this.f17781e.getAct()).m204430r("输入虚拟ip");
        final wyd0 wyd0Var = ak20.f71953a;
        Objects.requireNonNull(wyd0Var);
        c20993bM204430r.m204421F(new y20() { // from class: l.jxp0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyd0Var.put((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m30226I2() {
        SignUpData signUpData = new SignUpData();
        signUpData.name = "Wencharm";
        signUpData.birthdate = Double.valueOf(SystemClock.currentThreadTimeMillis() - 628992000000L);
        signUpData.gender = Gender.get("male");
        signUpData.password = "000000";
        signUpData.countryCode = 86;
        signUpData.phoneNumber = "123456";
        startActivity(SignUpProfileImageAct.m29502Y1(this, signUpData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m30227K2() {
        dialog().m21506G0("android id").m21503F(qzd.m178769b()).m21566z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m30228M2() {
        Dialog dialogM21566z = dialog().m21506G0("device id 点击可复制").m21516M(hec0.f109129p).m21566z();
        TextView textView = (TextView) dialogM21566z.m21457P().findViewById(wcc0.f188458p);
        textView.setText(qzd.m178768a());
        qzd.m178768a();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ixp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117450a.m30264L2(view);
            }
        });
        dialogM21566z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m30229N2() {
        b7f0.m102838a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public /* synthetic */ void m30230Q2() {
        w1e.m204400d(act()).m204424I("Change ip").m204419D(100).m204420E(1).m204423H("").m204421F(new y20() { // from class: l.nxp0
            @Override // p153l.y20
            public final void call(Object obj) {
                tg50.f174038e = (String) obj;
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m30231S2() {
        w1e.m204400d(act()).m204424I("Change MCC").m204419D(3).m204420E(1).m204429q(2).m204423H("" + uqb0.f180400f0).m204421F(new y20() { // from class: l.hxp0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.f180400f0 = Integer.parseInt((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m30232T2() {
        C13262b.m80531a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m30233U2() {
        olj.INSTANCE.m168130c(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m30234W2() {
        Dialog dialogM21566z = dialog().m21506G0("one id 点击可复制").m21516M(hec0.f109129p).m21566z();
        TextView textView = (TextView) dialogM21566z.m21457P().findViewById(wcc0.f188458p);
        textView.setText(yp50.m217001d());
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.gxp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106980a.m30266V2(view);
            }
        });
        dialogM21566z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m30236X2() {
        Dialog dialogM21566z = dialog().m21506G0("one id 点击可复制").m21516M(hec0.f109129p).m21566z();
        x95.INSTANCE.m209788g(new C4825a((TextView) dialogM21566z.m21457P().findViewById(wcc0.f188458p)));
        dialogM21566z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m30240a3() {
        String str = qv5.f159697a.get();
        if (TextUtils.equals(str, "tantanapp") && lhl.INSTANCE.m154211d()) {
            str = "tantantribe";
        }
        final EditText editText = new EditText(this);
        editText.setBackground(null);
        editText.setText(str);
        editText.setHint("name.dev.p1staff");
        editText.setSelection(editText.getText().length());
        bnl0.m105550d0(editText, qa00.m175859d(23.0f));
        dialog().m21506G0("Connect to developer's machine").m21535f0(new String[]{"tantanapp", "tantantribe", "staging.tantantribe", "staging1.p1staff", "staging2.p1staff", "growth.dev.p1staff"}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.lxp0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f133976a.m30265R2(dialog, view, i, charSequence);
            }
        }).m21519P(editText, true).m21555t0(R$string.f17026y, new Runnable() { // from class: l.mxp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139259a.m30267Z2(editText);
            }
        }).m21566z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public /* synthetic */ void m30242b3() {
        String str;
        Location locationM80048q = uqb0.f180370E.m80048q();
        if (locationM80048q != null) {
            str = locationM80048q.m80014u() + Constants.SEPARATOR_COMMA + locationM80048q.m80016x();
        } else {
            str = "";
        }
        w1e.m204400d(act()).m204424I("Change location").m204419D(100).m204420E(1).m204430r("39.9385466,116.1172739").m204423H(str).m204421F(new y20() { // from class: l.fxp0
            @Override // p153l.y20
            public final void call(Object obj) {
                WelcomeAct.m30249i2((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public /* synthetic */ void m30244c3() {
        startActivityForResult(AccountModule.m29131H().toIntlMaps(this, 1, true), 1092);
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ void m30249i2(String str) {
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
    public /* synthetic */ void lambda$debugItems$19() {
        SignUpData signUpData = new SignUpData();
        signUpData.gender = Gender.get("female");
        startActivity(FacebookSignUpProfileImageAct.m29582X1(this.act, signUpData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$21() {
        final wyd0 wyd0Var = AccountModule.f16755b.f181104a;
        w1e.m204400d(act()).m204424I("Change Account Sdk Client Id").m204419D(100).m204420E(1).m204430r("100003").m204423H(wyd0Var.get()).m204421F(new y20() { // from class: l.kxp0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyd0Var.put((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m30264L2(View view) {
        ((ClipboardManager) getSystemService(DataType.CLIPBOARD)).setText(qzd.m178768a());
        o1j0.m165651y("已复制");
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m30265R2(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("tantantribe")) {
            lhl.INSTANCE.m154225r(true);
            charSequence = "tantanapp";
        } else {
            lhl.INSTANCE.m154225r(false);
        }
        qv5.m178251e(charSequence.equals("tantanapp"));
        qv5.f159697a.put(charSequence.toString());
        RemoteConfig.m80481x().m80504b0();
        l51.m152892L(this, SplashAct.class);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m30266V2(View view) {
        ((ClipboardManager) getSystemService(DataType.CLIPBOARD)).setText(yp50.m217001d());
        o1j0.m165651y("已复制");
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m30267Z2(EditText editText) {
        qv5.m178251e(editText.getText().toString().equals("tantanapp"));
        qv5.f159697a.put(editText.getText().toString());
        RemoteConfig.m80481x().m80504b0();
        l51.m152892L(this, SplashAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(jyb.m147494Y("smart save", new x20() { // from class: l.dxp0
            @Override // p153l.x20
            public final void call() {
                this.f91100a.lambda$debugItems$1();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Connect to developer's machine", new x20() { // from class: l.vwp0
            @Override // p153l.x20
            public final void call() {
                this.f186160a.m30240a3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Change location", new x20() { // from class: l.wwp0
            @Override // p153l.x20
            public final void call() {
                this.f191323a.m30242b3();
            }
        }));
        if (NullChecker.m82486a(AccountModule.m29131H())) {
            arrayListDebugItems.add(jyb.m147494Y("Pick city", new x20() { // from class: l.xwp0
                @Override // p153l.x20
                public final void call() {
                    this.f196519a.m30244c3();
                }
            }));
        }
        arrayListDebugItems.add(jyb.m147494Y("Toggle facebookAppId", new x20() { // from class: l.ywp0
            @Override // p153l.x20
            public final void call() {
                C1600c.m8088N("407465776312149");
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("设置虚拟ip", new x20() { // from class: l.zwp0
            @Override // p153l.x20
            public final void call() {
                this.f206367a.m30225H2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Start SignUpProfileImageAct", new x20() { // from class: l.axp0
            @Override // p153l.x20
            public final void call() {
                this.f73877a.m30226I2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show android id", new x20() { // from class: l.bxp0
            @Override // p153l.x20
            public final void call() {
                this.f78901a.m30227K2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show device id", new x20() { // from class: l.cxp0
            @Override // p153l.x20
            public final void call() {
                this.f84264a.m30228M2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("shortcut badger show", new x20() { // from class: l.exp0
            @Override // p153l.x20
            public final void call() {
                this.f96320a.m30229N2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("pull alive test ", new oxp0()));
        arrayListDebugItems.add(jyb.m147494Y("Change ip for httpdns", new x20() { // from class: l.pxp0
            @Override // p153l.x20
            public final void call() {
                this.f154585a.m30230Q2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("pull httpdns data", new x20() { // from class: l.qxp0
            @Override // p153l.x20
            public final void call() {
                tg50.m191018g().m191020e();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Facebook profile image page", new x20() { // from class: l.rxp0
            @Override // p153l.x20
            public final void call() {
                this.f165363a.lambda$debugItems$19();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Change Account Sdk Client Id", new x20() { // from class: l.sxp0
            @Override // p153l.x20
            public final void call() {
                this.f171155a.lambda$debugItems$21();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Intl change MCC", new x20() { // from class: l.txp0
            @Override // p153l.x20
            public final void call() {
                this.f176588a.m30231S2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show RemoteConfig", new x20() { // from class: l.uxp0
            @Override // p153l.x20
            public final void call() {
                this.f181490a.m30232T2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("图形滑块", new x20() { // from class: l.vxp0
            @Override // p153l.x20
            public final void call() {
                this.f186289a.m30233U2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show one id", new x20() { // from class: l.twp0
            @Override // p153l.x20
            public final void call() {
                this.f176417a.m30234W2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show clevertap id", new x20() { // from class: l.uwp0
            @Override // p153l.x20
            public final void call() {
                this.f181315a.m30236X2();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17781e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17780d = new v3q0(this);
        f5q0 f5q0Var = new f5q0(this);
        this.f17781e = f5q0Var;
        this.f17780d.mo52715C(f5q0Var);
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
        this.f17780d.mo40473a0();
        creates(new y20() { // from class: l.swp0
            @Override // p153l.y20
            public final void call(Object obj) {
                g9r.m129599b();
            }
        });
    }

    public final /* synthetic */ void lambda$debugItems$1() {
        qsf0.m177799d().m177804h(this, "phone", SignInGrantType.password);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f17780d.m199473A5(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        this.f17780d.m199544c6();
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f17780d.m199477C5(list);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.f17780d.m199485F5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f17780d.m199487G5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return WXEntryActivity.PID;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(1024);
        this.f17780d.f182240a = getIntent().getBooleanExtra("show_update_dialog", false);
        this.f17779c = getIntent().getBooleanExtra("is_clear_task", false);
        this.f17780d.f182247h = getIntent().getBooleanExtra("from_splash", false);
        this.f17780d.f182241b = (AccountTempApi.InactiveType) getIntent().getSerializableExtra("inactive_type");
        this.f17780d.f182242c = getIntent().getStringExtra("inactive_category");
        this.f17780d.f182248i = getIntent().getBooleanExtra("hasContract", false);
        this.f17780d.f182249j = getIntent().getBooleanExtra("first_welcome", false);
        setSwipeBackEnable(getIntent().getBooleanExtra("enable_back", false));
        if (this.f17779c) {
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
