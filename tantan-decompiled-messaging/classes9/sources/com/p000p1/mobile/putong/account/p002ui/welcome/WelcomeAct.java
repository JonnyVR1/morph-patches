package com.p000p1.mobile.putong.account.p002ui.welcome;

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
import com.facebook.c;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpProfileImageAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.location.Location;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.remote_config.b;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.d30;
import l.dyd;
import l.e30;
import l.e51;
import l.f7r;
import l.i0e;
import l.j760;
import l.lsi0;
import l.t100;
import l.uqd0;
import l.uye0;
import l.vwb;
import l.w85;
import l.xdl0;
import l.yij0;
import p006l.AbstractC1211r6;
import p006l.bwp0;
import p006l.c6c0;
import p006l.hkf0;
import p006l.kop0;
import p006l.mu5;
import p006l.q4c0;
import p006l.qib0;
import p006l.rb20;
import p006l.rup0;
import p006l.sh50;
import p006l.uel;
import p006l.vij;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WelcomeAct extends WelcomeBaseAct {

    /* JADX INFO: renamed from: f */
    public static String f1046f;

    /* JADX INFO: renamed from: g */
    public static String f1047g;

    /* JADX INFO: renamed from: h */
    public static String f1048h;

    /* JADX INFO: renamed from: c */
    public boolean f1049c = false;

    /* JADX INFO: renamed from: d */
    public rup0 f1050d;

    /* JADX INFO: renamed from: e */
    public AbstractC1211r6 f1051e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.welcome.WelcomeAct$a */
    public class C0100a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f1052a;

        public C0100a(TextView textView) {
            this.f1052a = textView;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit invoke(final String str) {
            this.f1052a.setText(str);
            this.f1052a.setOnClickListener(new View.OnClickListener() { // from class: l.sop0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21554a.m1178c(str, view);
                }
            });
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m1178c(String str, View view) {
            ((ClipboardManager) WelcomeAct.this.getSystemService("clipboard")).setText(str);
            lsi0.y("已复制");
        }
    }

    /* JADX INFO: renamed from: D2 */
    public static Intent m1130D2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WelcomeAct.class);
        intent.putExtra("enable_back", z);
        return intent;
    }

    /* JADX INFO: renamed from: E2 */
    public static Intent m1131E2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WelcomeAct.class);
        intent.addFlags(268468224);
        intent.putExtra("show_update_dialog", z);
        intent.putExtra("is_clear_task", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m1132F2() {
        i0e.b bVarR = i0e.d(this.f1051e.act()).r("输入虚拟ip");
        final uqd0 uqd0Var = rb20.f20469a;
        Objects.requireNonNull(uqd0Var);
        bVarR.F(new e30() { // from class: l.fop0
            public final void call(Object obj) {
                uqd0Var.put((String) obj);
            }
        }).n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m1133H2() {
        SignUpData signUpData = new SignUpData();
        signUpData.name = "Wencharm";
        signUpData.birthdate = Double.valueOf(SystemClock.currentThreadTimeMillis() - 628992000000L);
        signUpData.gender = Gender.get("male");
        signUpData.password = "000000";
        signUpData.countryCode = 86;
        signUpData.phoneNumber = "123456";
        startActivity(SignUpProfileImageAct.m399X1(this, signUpData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m1134I2() {
        dialog().G0("android id").F(dyd.b()).z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public /* synthetic */ void m1135L2() {
        Dialog dialogZ = dialog().G0("device id 点击可复制").M(c6c0.f9447p).z();
        TextView textView = (TextView) dialogZ.P().findViewById(q4c0.f19620p);
        textView.setText(dyd.a());
        dyd.a();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.eop0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11312a.m1172K2(view);
            }
        });
        dialogZ.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m1136M2() {
        uye0.a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m1137N2() {
        i0e.d(act()).I("Change ip").D(100).E(1).H("").F(new e30() { // from class: l.jop0
            public final void call(Object obj) {
                m850.f16843e = (String) obj;
            }
        }).n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m1138R2() {
        i0e.d(act()).I("Change MCC").D(3).E(1).q(2).H("" + qib0.f19808f0).F(new e30() { // from class: l.dop0
            public final void call(Object obj) {
                qib0.f19808f0 = Integer.parseInt((String) obj);
            }
        }).n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m1139S2() {
        b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m1140T2() {
        vij.INSTANCE.m25823c(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m1142V2() {
        Dialog dialogZ = dialog().G0("one id 点击可复制").M(c6c0.f9447p).z();
        TextView textView = (TextView) dialogZ.P().findViewById(q4c0.f19620p);
        textView.setText(sh50.m23745d());
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.cop0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9771a.m1174U2(view);
            }
        });
        dialogZ.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m1143W2() {
        Dialog dialogZ = dialog().G0("one id 点击可复制").M(c6c0.f9447p).z();
        w85.INSTANCE.g(new C0100a((TextView) dialogZ.P().findViewById(q4c0.f19620p)));
        dialogZ.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m1146Y2() {
        String str = (String) mu5.f17252a.get();
        if (TextUtils.equals(str, "tantanapp") && uel.INSTANCE.m25199b()) {
            str = "tantantribe";
        }
        final EditText editText = new EditText(this);
        editText.setBackground(null);
        editText.setText(str);
        editText.setHint("name.dev.p1staff");
        editText.setSelection(editText.getText().length());
        xdl0.d0(editText, t100.d(23.0f));
        dialog().G0("Connect to developer's machine").f0(new String[]{"tantanapp", "tantantribe", "staging.tantantribe", "staging1.p1staff", "staging2.p1staff", "growth.dev.p1staff"}).g0(new Dialog.g() { // from class: l.hop0
            /* JADX INFO: renamed from: a */
            public final void m16300a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f13991a.m1173Q2(dialog, view, i, charSequence);
            }
        }).P(editText, true).t0(R$string.f296y, new Runnable() { // from class: l.iop0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14607a.m1175X2(editText);
            }
        }).z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m1148Z2() {
        String str;
        Location locationQ = qib0.f19778E.q();
        if (locationQ != null) {
            str = locationQ.u() + "," + locationQ.x();
        } else {
            str = "";
        }
        i0e.d(act()).I("Change location").D(100).E(1).r("39.9385466,116.1172739").H(str).F(new e30() { // from class: l.bop0
            public final void call(Object obj) {
                WelcomeAct.m1156h2((String) obj);
            }
        }).n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m1150a3() {
        startActivityForResult(AccountModule.m27H().toIntlMaps(this, 1, true), 1092);
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m1156h2(String str) {
        if (TextUtils.isEmpty(str)) {
            qib0.f19778E.a.put(Boolean.FALSE);
            qib0.f19778E.t();
            return;
        }
        String[] strArrSplit = str.split(",");
        double d = Double.parseDouble(strArrSplit[0]);
        double d2 = Double.parseDouble(strArrSplit[1]);
        qib0.f19778E.b.put(Double.valueOf(d));
        qib0.f19778E.c.put(Double.valueOf(d2));
        qib0.f19778E.a.put(Boolean.TRUE);
        qib0.f19778E.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$debugItems$19() {
        SignUpData signUpData = new SignUpData();
        signUpData.gender = Gender.get("female");
        startActivity(FacebookSignUpProfileImageAct.m480V1(((Act) this).act, signUpData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$21() {
        final uqd0 uqd0Var = AccountModule.f25b.f8561a;
        i0e.d(act()).I("Change Account Sdk Client Id").D(100).E(1).r("100003").H((String) uqd0Var.get()).F(new e30() { // from class: l.gop0
            public final void call(Object obj) {
                uqd0Var.put((String) obj);
            }
        }).n().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m1172K2(View view) {
        ((ClipboardManager) getSystemService("clipboard")).setText(dyd.a());
        lsi0.y("已复制");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m1173Q2(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("tantantribe")) {
            uel.INSTANCE.m25204g(true);
            charSequence = "tantanapp";
        } else {
            uel.INSTANCE.m25204g(false);
        }
        mu5.m19512e(charSequence.equals("tantanapp"));
        mu5.f17252a.put(charSequence.toString());
        RemoteConfig.x().b0();
        e51.L(this, SplashAct.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m1174U2(View view) {
        ((ClipboardManager) getSystemService("clipboard")).setText(sh50.m23745d());
        lsi0.y("已复制");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m1175X2(EditText editText) {
        mu5.m19512e(editText.getText().toString().equals("tantanapp"));
        mu5.f17252a.put(editText.getText().toString());
        RemoteConfig.x().b0();
        e51.L(this, SplashAct.class);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.Y("smart save", new d30() { // from class: l.znp0
            public final void call() {
                this.f28857a.lambda$debugItems$1();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Connect to developer's machine", new d30() { // from class: l.rnp0
            public final void call() {
                this.f20652a.m1146Y2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Change location", new d30() { // from class: l.snp0
            public final void call() {
                this.f21447a.m1148Z2();
            }
        }));
        if (NullChecker.a(AccountModule.m27H())) {
            arrayListDebugItems.add(vwb.Y("Pick city", new d30() { // from class: l.tnp0
                public final void call() {
                    this.f22204a.m1150a3();
                }
            }));
        }
        arrayListDebugItems.add(vwb.Y("Toggle facebookAppId", new d30() { // from class: l.unp0
            public final void call() {
                c.N("407465776312149");
            }
        }));
        arrayListDebugItems.add(vwb.Y("设置虚拟ip", new d30() { // from class: l.vnp0
            public final void call() {
                this.f24394a.m1132F2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Start SignUpProfileImageAct", new d30() { // from class: l.wnp0
            public final void call() {
                this.f25259a.m1133H2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("show android id", new d30() { // from class: l.xnp0
            public final void call() {
                this.f27628a.m1134I2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("show device id", new d30() { // from class: l.ynp0
            public final void call() {
                this.f28312a.m1135L2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("shortcut badger show", new d30() { // from class: l.aop0
            public final void call() {
                this.f8424a.m1136M2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("pull alive test ", new kop0()));
        arrayListDebugItems.add(vwb.Y("Change ip for httpdns", new d30() { // from class: l.lop0
            public final void call() {
                this.f16543a.m1137N2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("pull httpdns data", new d30() { // from class: l.mop0
            public final void call() {
                m850.m19158i().m19160e();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Facebook profile image page", new d30() { // from class: l.nop0
            public final void call() {
                this.f17766a.lambda$debugItems$19();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Change Account Sdk Client Id", new d30() { // from class: l.oop0
            public final void call() {
                this.f18309a.lambda$debugItems$21();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Intl change MCC", new d30() { // from class: l.pop0
            public final void call() {
                this.f19239a.m1138R2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("show RemoteConfig", new d30() { // from class: l.qop0
            public final void call() {
                this.f19955a.m1139S2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("图形滑块", new d30() { // from class: l.rop0
            public final void call() {
                this.f20665a.m1140T2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("show one id", new d30() { // from class: l.pnp0
            public final void call() {
                this.f19230a.m1142V2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("show clevertap id", new d30() { // from class: l.qnp0
            public final void call() {
                this.f19947a.m1143W2();
            }
        }));
        return arrayListDebugItems;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1051e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1050d = new rup0(this);
        bwp0 bwp0Var = new bwp0(this);
        this.f1051e = bwp0Var;
        this.f1050d.C(bwp0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        super.initPageHelper();
        if (!NullChecker.a(getIntent())) {
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
        this.pageHelper.p(new j760[]{vwb.Y("show_status", AccountModule.m26F().signedIn_() ? "after_sign" : "before_sign"), vwb.Y("landingpage_source", str)});
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f1050d.m23203a0();
        creates(new e30() { // from class: l.onp0
            public final void call(Object obj) {
                f7r.b();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void lambda$debugItems$1() {
        hkf0.m16233d().m16238h(this, "phone", "password");
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f1050d.m23139A5(i, i2, intent);
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onDestroyLifecycle() {
        this.f1050d.m23211c6();
        super.onDestroyLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f1050d.m23143C5(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestart() {
        super/*android.app.Activity*/.onRestart();
        this.f1050d.m23151F5();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f1050d.m23153G5();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_sign_in_type_selection_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(1024);
        this.f1050d.f20766a = getIntent().getBooleanExtra("show_update_dialog", false);
        this.f1049c = getIntent().getBooleanExtra("is_clear_task", false);
        this.f1050d.f20773h = getIntent().getBooleanExtra("from_splash", false);
        this.f1050d.f20767b = (AccountTempApi.InactiveType) getIntent().getSerializableExtra("inactive_type");
        this.f1050d.f20768c = getIntent().getStringExtra("inactive_category");
        this.f1050d.f20774i = getIntent().getBooleanExtra("hasContract", false);
        this.f1050d.f20775j = getIntent().getBooleanExtra("first_welcome", false);
        setSwipeBackEnable(getIntent().getBooleanExtra("enable_back", false));
        if (this.f1049c) {
            yij0.S(this);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void setTheme() {
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldRemarginContent() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return vwb.f0(new Object[]{"app session", App.i.get(), qib0.f19781F0});
    }
}
