package com.p046p1.mobile.putong.account.p050ui.welcome;

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
import com.facebook.C1577c;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpProfileImageAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.facebook.FacebookSignUpProfileImageAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
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
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p149l.AbstractC19646r6;
import p149l.bwp0;
import p149l.c6c0;
import p149l.d30;
import p149l.dyd;
import p149l.e30;
import p149l.e51;
import p149l.hkf0;
import p149l.i0e;
import p149l.j760;
import p149l.kop0;
import p149l.lsi0;
import p149l.mu5;
import p149l.q4c0;
import p149l.qib0;
import p149l.rb20;
import p149l.rup0;
import p149l.sh50;
import p149l.t100;
import p149l.uel;
import p149l.uqd0;
import p149l.uye0;
import p149l.vij;
import p149l.vwb;
import p149l.w85;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: loaded from: classes9.dex */
public class WelcomeAct extends WelcomeBaseAct {

    /* JADX INFO: renamed from: f */
    public static String f17057f;

    /* JADX INFO: renamed from: g */
    public static String f17058g;

    /* JADX INFO: renamed from: h */
    public static String f17059h;

    /* JADX INFO: renamed from: c */
    public boolean f17060c = false;

    /* JADX INFO: renamed from: d */
    public rup0 f17061d;

    /* JADX INFO: renamed from: e */
    public AbstractC19646r6 f17062e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.welcome.WelcomeAct$a */
    public class C4674a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f17063a;

        public C4674a(TextView textView) {
            this.f17063a = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit invoke(final String str) {
            this.f17063a.setText(str);
            this.f17063a.setOnClickListener(new View.OnClickListener() { // from class: l.sop0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165715a.m29272c(str, view);
                }
            });
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m29272c(String str, View view) {
            ((ClipboardManager) WelcomeAct.this.getSystemService(DataType.CLIPBOARD)).setText(str);
            lsi0.m151595y("已复制");
        }
    }

    /* JADX INFO: renamed from: D2 */
    public static Intent m29224D2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WelcomeAct.class);
        intent.putExtra("enable_back", z);
        return intent;
    }

    /* JADX INFO: renamed from: E2 */
    public static Intent m29225E2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WelcomeAct.class);
        intent.addFlags(268468224);
        intent.putExtra("show_update_dialog", z);
        intent.putExtra("is_clear_task", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m29226F2() {
        i0e.C17451b c17451bM133825r = i0e.m133795d(this.f17062e.getAct()).m133825r("输入虚拟ip");
        final uqd0 uqd0Var = rb20.f158575a;
        Objects.requireNonNull(uqd0Var);
        c17451bM133825r.m133816F(new e30() { // from class: l.fop0
            @Override // p149l.e30
            public final void call(Object obj) {
                uqd0Var.put((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m29227H2() {
        SignUpData signUpData = new SignUpData();
        signUpData.name = "Wencharm";
        signUpData.birthdate = Double.valueOf(SystemClock.currentThreadTimeMillis() - 628992000000L);
        signUpData.gender = Gender.get("male");
        signUpData.password = "000000";
        signUpData.countryCode = 86;
        signUpData.phoneNumber = "123456";
        startActivity(SignUpProfileImageAct.m28503X1(this, signUpData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m29228I2() {
        dialog().m20507G0("android id").m20504F(dyd.m114056b()).m20567z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public /* synthetic */ void m29229L2() {
        Dialog dialogM20567z = dialog().m20507G0("device id 点击可复制").m20517M(c6c0.f79517p).m20567z();
        TextView textView = (TextView) dialogM20567z.m20458P().findViewById(q4c0.f152610p);
        textView.setText(dyd.m114055a());
        dyd.m114055a();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.eop0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92488a.m29266K2(view);
            }
        });
        dialogM20567z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m29230M2() {
        uye0.m196286a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m29231N2() {
        i0e.m133795d(act()).m133819I("Change ip").m133814D(100).m133815E(1).m133818H("").m133816F(new e30() { // from class: l.jop0
            @Override // p149l.e30
            public final void call(Object obj) {
                m850.f132521e = (String) obj;
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m29232R2() {
        i0e.m133795d(act()).m133819I("Change MCC").m133814D(3).m133815E(1).m133824q(2).m133818H("" + qib0.f154717f0).m133816F(new e30() { // from class: l.dop0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.f154717f0 = Integer.parseInt((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m29233S2() {
        C13099b.m79348a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m29234T2() {
        vij.INSTANCE.m198583c(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m29236V2() {
        Dialog dialogM20567z = dialog().m20507G0("one id 点击可复制").m20517M(c6c0.f79517p).m20567z();
        TextView textView = (TextView) dialogM20567z.m20458P().findViewById(q4c0.f152610p);
        textView.setText(sh50.m184159d());
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.cop0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81856a.m29268U2(view);
            }
        });
        dialogM20567z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m29237W2() {
        Dialog dialogM20567z = dialog().m20507G0("one id 点击可复制").m20517M(c6c0.f79517p).m20567z();
        w85.INSTANCE.m202140g(new C4674a((TextView) dialogM20567z.m20458P().findViewById(q4c0.f152610p)));
        dialogM20567z.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m29240Y2() {
        String str = mu5.f135733a.get();
        if (TextUtils.equals(str, "tantanapp") && uel.INSTANCE.m193266b()) {
            str = "tantantribe";
        }
        final EditText editText = new EditText(this);
        editText.setBackground(null);
        editText.setText(str);
        editText.setHint("name.dev.p1staff");
        editText.setSelection(editText.getText().length());
        xdl0.m208370d0(editText, t100.m186890d(23.0f));
        dialog().m20507G0("Connect to developer's machine").m20536f0(new String[]{"tantanapp", "tantantribe", "staging.tantantribe", "staging1.p1staff", "staging2.p1staff", "growth.dev.p1staff"}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.hop0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f108837a.m29267Q2(dialog, view, i, charSequence);
            }
        }).m20520P(editText, true).m20556t0(R$string.f16307y, new Runnable() { // from class: l.iop0
            @Override // java.lang.Runnable
            public final void run() {
                this.f114193a.m29269X2(editText);
            }
        }).m20567z().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m29242Z2() {
        String str;
        Location locationM78865q = qib0.f154687E.m78865q();
        if (locationM78865q != null) {
            str = locationM78865q.m78831u() + Constants.SEPARATOR_COMMA + locationM78865q.m78833x();
        } else {
            str = "";
        }
        i0e.m133795d(act()).m133819I("Change location").m133814D(100).m133815E(1).m133825r("39.9385466,116.1172739").m133818H(str).m133816F(new e30() { // from class: l.bop0
            @Override // p149l.e30
            public final void call(Object obj) {
                WelcomeAct.m29250h2((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m29244a3() {
        startActivityForResult(AccountModule.m28132H().toIntlMaps(this, 1, true), 1092);
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m29250h2(String str) {
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
    public /* synthetic */ void lambda$debugItems$19() {
        SignUpData signUpData = new SignUpData();
        signUpData.gender = Gender.get("female");
        startActivity(FacebookSignUpProfileImageAct.m28583V1(this.act, signUpData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$21() {
        final uqd0 uqd0Var = AccountModule.f16036b.f71983a;
        i0e.m133795d(act()).m133819I("Change Account Sdk Client Id").m133814D(100).m133815E(1).m133825r("100003").m133818H(uqd0Var.get()).m133816F(new e30() { // from class: l.gop0
            @Override // p149l.e30
            public final void call(Object obj) {
                uqd0Var.put((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m29266K2(View view) {
        ((ClipboardManager) getSystemService(DataType.CLIPBOARD)).setText(dyd.m114055a());
        lsi0.m151595y("已复制");
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m29267Q2(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("tantantribe")) {
            uel.INSTANCE.m193271g(true);
            charSequence = "tantanapp";
        } else {
            uel.INSTANCE.m193271g(false);
        }
        mu5.m156380e(charSequence.equals("tantanapp"));
        mu5.f135733a.put(charSequence.toString());
        RemoteConfig.m79298x().m79321b0();
        e51.m114747L(this, SplashAct.class);
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m29268U2(View view) {
        ((ClipboardManager) getSystemService(DataType.CLIPBOARD)).setText(sh50.m184159d());
        lsi0.m151595y("已复制");
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m29269X2(EditText editText) {
        mu5.m156380e(editText.getText().toString().equals("tantanapp"));
        mu5.f135733a.put(editText.getText().toString());
        RemoteConfig.m79298x().m79321b0();
        e51.m114747L(this, SplashAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.m200311Y("smart save", new d30() { // from class: l.znp0
            @Override // p149l.d30
            public final void call() {
                this.f203988a.lambda$debugItems$1();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Connect to developer's machine", new d30() { // from class: l.rnp0
            @Override // p149l.d30
            public final void call() {
                this.f160288a.m29240Y2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Change location", new d30() { // from class: l.snp0
            @Override // p149l.d30
            public final void call() {
                this.f165497a.m29242Z2();
            }
        }));
        if (NullChecker.m81303a(AccountModule.m28132H())) {
            arrayListDebugItems.add(vwb.m200311Y("Pick city", new d30() { // from class: l.tnp0
                @Override // p149l.d30
                public final void call() {
                    this.f171261a.m29244a3();
                }
            }));
        }
        arrayListDebugItems.add(vwb.m200311Y("Toggle facebookAppId", new d30() { // from class: l.unp0
            @Override // p149l.d30
            public final void call() {
                C1577c.m8034N("407465776312149");
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("设置虚拟ip", new d30() { // from class: l.vnp0
            @Override // p149l.d30
            public final void call() {
                this.f182264a.m29226F2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Start SignUpProfileImageAct", new d30() { // from class: l.wnp0
            @Override // p149l.d30
            public final void call() {
                this.f187325a.m29227H2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show android id", new d30() { // from class: l.xnp0
            @Override // p149l.d30
            public final void call() {
                this.f193723a.m29228I2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show device id", new d30() { // from class: l.ynp0
            @Override // p149l.d30
            public final void call() {
                this.f199195a.m29229L2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("shortcut badger show", new d30() { // from class: l.aop0
            @Override // p149l.d30
            public final void call() {
                this.f70882a.m29230M2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("pull alive test ", new kop0()));
        arrayListDebugItems.add(vwb.m200311Y("Change ip for httpdns", new d30() { // from class: l.lop0
            @Override // p149l.d30
            public final void call() {
                this.f129127a.m29231N2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("pull httpdns data", new d30() { // from class: l.mop0
            @Override // p149l.d30
            public final void call() {
                m850.m153455i().m153457e();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Facebook profile image page", new d30() { // from class: l.nop0
            @Override // p149l.d30
            public final void call() {
                this.f139859a.lambda$debugItems$19();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Change Account Sdk Client Id", new d30() { // from class: l.oop0
            @Override // p149l.d30
            public final void call() {
                this.f144903a.lambda$debugItems$21();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Intl change MCC", new d30() { // from class: l.pop0
            @Override // p149l.d30
            public final void call() {
                this.f150553a.m29232R2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show RemoteConfig", new d30() { // from class: l.qop0
            @Override // p149l.d30
            public final void call() {
                this.f155614a.m29233S2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("图形滑块", new d30() { // from class: l.rop0
            @Override // p149l.d30
            public final void call() {
                this.f160408a.m29234T2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show one id", new d30() { // from class: l.pnp0
            @Override // p149l.d30
            public final void call() {
                this.f150409a.m29236V2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show clevertap id", new d30() { // from class: l.qnp0
            @Override // p149l.d30
            public final void call() {
                this.f155487a.m29237W2();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17062e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17061d = new rup0(this);
        bwp0 bwp0Var = new bwp0(this);
        this.f17062e = bwp0Var;
        this.f17061d.mo51532C(bwp0Var);
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
        this.f17061d.mo39470a0();
        creates(new e30() { // from class: l.onp0
            @Override // p149l.e30
            public final void call(Object obj) {
                f7r.m119818b();
            }
        });
    }

    public final /* synthetic */ void lambda$debugItems$1() {
        hkf0.m131486d().m131491h(this, "phone", SignInGrantType.password);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f17061d.m181063A5(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        this.f17061d.m181134c6();
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f17061d.m181067C5(list);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.f17061d.m181075F5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f17061d.m181077G5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return WXEntryActivity.PID;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(1024);
        this.f17061d.f161095a = getIntent().getBooleanExtra("show_update_dialog", false);
        this.f17060c = getIntent().getBooleanExtra("is_clear_task", false);
        this.f17061d.f161102h = getIntent().getBooleanExtra("from_splash", false);
        this.f17061d.f161096b = (AccountTempApi.InactiveType) getIntent().getSerializableExtra("inactive_type");
        this.f17061d.f161097c = getIntent().getStringExtra("inactive_category");
        this.f17061d.f161103i = getIntent().getBooleanExtra("hasContract", false);
        this.f17061d.f161104j = getIntent().getBooleanExtra("first_welcome", false);
        setSwipeBackEnable(getIntent().getBooleanExtra("enable_back", false));
        if (this.f17060c) {
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
