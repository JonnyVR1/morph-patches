package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.GPBindVerifyCodeInputAct;
import com.p046p1.mobile.putong.core.p053ui.account.view.VerifyCodeView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VButton_FakeShadow;
import p147v.VText;
import p149l.c1c0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.i0g0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.odj;
import p149l.roj0;
import p149l.vwb;
import p149l.xdl0;
import p149l.yij0;
import p149l.ys60;
import p149l.zvf0;

/* JADX INFO: loaded from: classes8.dex */
public class GPBindVerifyCodeInputAct extends PutongAct {

    /* JADX INFO: renamed from: p */
    public static String f28227p;

    /* JADX INFO: renamed from: q */
    public static int f28228q;

    /* JADX INFO: renamed from: c */
    public VText f28229c;

    /* JADX INFO: renamed from: d */
    public VText f28230d;

    /* JADX INFO: renamed from: e */
    public VerifyCodeView f28231e;

    /* JADX INFO: renamed from: f */
    public VText f28232f;

    /* JADX INFO: renamed from: g */
    public VText f28233g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f28234h;

    /* JADX INFO: renamed from: i */
    public int f28235i;

    /* JADX INFO: renamed from: j */
    public String f28236j;

    /* JADX INFO: renamed from: l */
    public boolean f28238l;

    /* JADX INFO: renamed from: k */
    public VerifyData f28237k = new VerifyData();

    /* JADX INFO: renamed from: m */
    public Runnable f28239m = new Runnable() { // from class: l.gdj
        @Override // java.lang.Runnable
        public final void run() {
            this.f102120a.m44139F2();
        }
    };

    /* JADX INFO: renamed from: n */
    public d30 f28240n = new d30() { // from class: l.hdj
        @Override // p149l.d30
        public final void call() {
            this.f107250a.m44140H2();
        }
    };

    /* JADX INFO: renamed from: o */
    public boolean f28241o = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.GPBindVerifyCodeInputAct$a */
    public class C8277a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f28242a;

        public C8277a(d30 d30Var) {
            this.f28242a = d30Var;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f28242a.call();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m44136A2() {
        this.f28231e.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m44137B2(String str) {
        xdl0.m208411y(this.f28234h, str.length() == 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m44139F2() {
        this.f28231e.setText("");
        this.f28241o = false;
        duringCreated(CoreModule.m29931H().send(this.f28237k)).subscribe(mkd0.m154959K(new e30() { // from class: l.jdj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117389a.m44165D2((roj0) obj);
            }
        }, new e30() { // from class: l.kdj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122566a.m44138E2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m44140H2() {
        zvf0.m220399u("e_intl_bind_phone_enter_verification_code_next_butto", pageId(), vwb.m200311Y("bindType", this.f28238l ? "afterSignup" : "accountSecurityPage"));
        int i = f28228q;
        f28228q = i + 1;
        if (i < 5) {
            this.f28237k.code = m44163u2();
            m44142Q2();
        } else {
            this.f28231e.setText("");
            lsi0.m151578h(R$string.f27724H3);
        }
    }

    /* JADX INFO: renamed from: N2 */
    private void m44141N2() {
        progressDismiss();
        f28228q = 0;
        m44162s2();
        xdl0.m208345M0(this.f28233g, true);
        xdl0.m208345M0(this.f28232f, false);
    }

    /* JADX INFO: renamed from: Q2 */
    private void m44142Q2() {
        progress(R$string.f27771R0);
        duringCreated(CoreModule.m29931H().verify(this.f28237k)).subscribe(mkd0.m154959K(new e30() { // from class: l.ldj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127555a.m44167K2((roj0) obj);
            }
        }, new e30() { // from class: l.mdj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133242a.m44168L2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m44143V1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        e51.m114742G(new Runnable() { // from class: l.ndj
            @Override // java.lang.Runnable
            public final void run() {
                this.f138287a.m44136A2();
            }
        });
        this.f28230d.setText(ys60.m215881a(this.f28235i, this.f28236j));
        f28228q = 0;
        if (bundle == null) {
            String str = this.f28238l ? "afterSignup" : "accountSecurityPage";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bindType", str);
                this.pageHelper.m109039o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        } else {
            this.f28241o = bundle.getBoolean("count_down_complete");
        }
        if (e51.m114737B(m44171r2()) || !TextUtils.equals(f28227p, this.f28236j)) {
            m44162s2();
        } else {
            this.act.progress(R$string.f27771R0);
            this.f28239m.run();
        }
        f28227p = this.f28236j;
    }

    /* JADX INFO: renamed from: p2 */
    public static void m44159p2(TextView textView, String str, d30 d30Var) {
        if (!NullChecker.m81304b(textView) || TextUtils.isEmpty(textView.getText())) {
            return;
        }
        String string = textView.getText().toString();
        int iIndexOf = string.indexOf(str);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C8277a(d30Var), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(CoreModule.f17544b.getResources().getColor(c1c0.f78257n));
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m44160q2(Act act, int i, String str, boolean z) {
        Intent intent = new Intent(act, (Class<?>) GPBindVerifyCodeInputAct.class);
        intent.putExtra("ccode", i);
        intent.putExtra("phone_number", str);
        intent.putExtra("is_from_sign_up", z);
        return intent;
    }

    /* JADX INFO: renamed from: r */
    private void m44161r() {
        this.f28229c.setText(R$string.f27910p4);
        this.f28231e.setOnCompleteAction(this.f28240n);
        this.f28231e.setListener(new VerifyCodeView.InterfaceC8278a() { // from class: l.ycj
            @Override // com.p046p1.mobile.putong.core.p053ui.account.view.VerifyCodeView.InterfaceC8278a
            /* JADX INFO: renamed from: a */
            public final void mo44213a(String str) {
                this.f197455a.m44137B2(str);
            }
        });
        xdl0.m208411y(this.f28234h, this.f28231e.getText().length() == 4);
        this.f28234h.setOnClickListener(new View.OnClickListener() { // from class: l.fdj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97050a.m44164C2(view);
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    private void m44162s2() {
        if (!this.f28241o) {
            duringCreated(e51.m114749N(m44171r2(), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.adj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68943a.m44172v2((Long) obj);
                }
            }, new e30() { // from class: l.bdj
                @Override // p149l.e30
                public final void call(Object obj) {
                    GPBindVerifyCodeInputAct.m44143V1((Throwable) obj);
                }
            }, new d30() { // from class: l.cdj
                @Override // p149l.d30
                public final void call() {
                    this.f80372a.m44174y2();
                }
            }));
            return;
        }
        this.f28233g.setText(getString(R$string.f27837d3, 60));
        xdl0.m208345M0(this.f28232f, true);
        xdl0.m208345M0(this.f28233g, false);
        this.f28232f.setText(R$string.f27729I3);
        m44159p2(this.f28232f, string(R$string.f27734J3), new d30() { // from class: l.zcj
            @Override // p149l.d30
            public final void call() {
                this.f202542a.m44175z2();
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    private int m44163u2() {
        try {
            return Integer.parseInt(vwb.m200345q(this.f28231e.getText()));
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m44164C2(View view) {
        this.f28240n.call();
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m44165D2(roj0 roj0Var) {
        m44141N2();
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m44166I2() {
        this.f28239m.run();
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m44167K2(roj0 roj0Var) {
        hideInput();
        progressDismiss();
        String str = this.f28238l ? "afterSignup" : "accountSecurityPage";
        o6j0.m162870n("e_intl_bind_phone_success", pageId(), o6j0.C18854a.m162878h("bindType", str), o6j0.C18854a.m162878h(Oauth2AccessToken.KEY_PHONE_NUM, this.f28235i + f28227p));
        lsi0.m151580j(string(R$string.f27786U0));
        CoreModule.m29932K().dismissGpBindPhoneRedDot();
        setResult(-1);
        m44477e2();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m44168L2(Throwable th) {
        progressDismiss();
        this.f28231e.setText("");
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: M2, reason: merged with bridge method [inline-methods] */
    public final void m44138E2(Throwable th) {
        progressDismiss();
        xdl0.m208345M0(this.f28232f, !e51.m114737B(m44171r2()));
        this.f28232f.setText(R$string.f27729I3);
        m44159p2(this.f28232f, string(R$string.f27734J3), new d30() { // from class: l.ddj
            @Override // p149l.d30
            public final void call() {
                this.f85602a.m44166I2();
            }
        });
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40060) {
            lsi0.m151580j(string(R$string.f27776S0));
        } else {
            yij0.m214926D(th);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM44170o2 = m44170o2(layoutInflater, viewGroup);
        m44161r();
        return viewM44170o2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28235i = getIntent().getIntExtra("ccode", 0);
        this.f28236j = getIntent().getStringExtra("phone_number");
        this.f28238l = getIntent().getBooleanExtra("is_from_sign_up", false);
        this.f28237k.language = i0g0.m133885y();
        this.f28237k.action = VerifyReason.get(VerifyReason.bind_mobile);
        VerifyData verifyData = this.f28237k;
        verifyData.countryCode = this.f28235i;
        String str = this.f28236j;
        verifyData.mobileNumber = str;
        verifyData.codeLength = 4;
        if (str.equals(f28227p)) {
            return;
        }
        e51.m114746K(m44171r2());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.idj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112562a.lambda$initSubscription$6((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o2 */
    public View m44170o2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return odj.m163667b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("count_down_complete", this.f28241o);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_bind_phone_enter_verification_code_view";
    }

    /* JADX INFO: renamed from: r2 */
    public final String m44171r2() {
        return getLocalClassName() + VerifyReason.bind_mobile;
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m44172v2(Long l2) {
        this.f28233g.setText(getString(R$string.f27837d3, Long.valueOf(59 - l2.longValue())));
        xdl0.m208345M0(this.f28232f, false);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m44173w2() {
        this.f28239m.run();
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m44174y2() {
        this.f28241o = true;
        this.f28233g.setText(getString(R$string.f27837d3, 60));
        xdl0.m208345M0(this.f28232f, true);
        xdl0.m208345M0(this.f28233g, false);
        this.f28232f.setText(R$string.f27729I3);
        m44159p2(this.f28232f, string(R$string.f27734J3), new d30() { // from class: l.edj
            @Override // p149l.d30
            public final void call() {
                this.f90609a.m44173w2();
            }
        });
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m44175z2() {
        this.f28239m.run();
    }
}
