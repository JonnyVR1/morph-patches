package com.p051p1.mobile.putong.core.p058ui.account;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.GPBindVerifyCodeInputAct;
import com.p051p1.mobile.putong.core.p058ui.account.view.VerifyCodeView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VButton_FakeShadow;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.e170;
import p153l.i4g0;
import p153l.igj;
import p153l.j9c0;
import p153l.jyb;
import p153l.l51;
import p153l.o1j0;
import p153l.psd0;
import p153l.q8g0;
import p153l.sfj0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class GPBindVerifyCodeInputAct extends PutongAct {

    /* JADX INFO: renamed from: p */
    public static String f29075p;

    /* JADX INFO: renamed from: q */
    public static int f29076q;

    /* JADX INFO: renamed from: c */
    public VText f29077c;

    /* JADX INFO: renamed from: d */
    public VText f29078d;

    /* JADX INFO: renamed from: e */
    public VerifyCodeView f29079e;

    /* JADX INFO: renamed from: f */
    public VText f29080f;

    /* JADX INFO: renamed from: g */
    public VText f29081g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f29082h;

    /* JADX INFO: renamed from: i */
    public int f29083i;

    /* JADX INFO: renamed from: j */
    public String f29084j;

    /* JADX INFO: renamed from: l */
    public boolean f29086l;

    /* JADX INFO: renamed from: k */
    public VerifyData f29085k = new VerifyData();

    /* JADX INFO: renamed from: m */
    public Runnable f29087m = new Runnable() { // from class: l.agj
        @Override // java.lang.Runnable
        public final void run() {
            this.f71164a.m45322H2();
        }
    };

    /* JADX INFO: renamed from: n */
    public x20 f29088n = new x20() { // from class: l.bgj
        @Override // p153l.x20
        public final void call() {
            this.f76661a.m45323I2();
        }
    };

    /* JADX INFO: renamed from: o */
    public boolean f29089o = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.GPBindVerifyCodeInputAct$a */
    public class C8440a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f29090a;

        public C8440a(x20 x20Var) {
            this.f29090a = x20Var;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f29090a.call();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m45319B2() {
        this.f29079e.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public /* synthetic */ void m45320C2(String str) {
        bnl0.m105591y(this.f29082h, str.length() == 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m45322H2() {
        this.f29079e.setText("");
        this.f29089o = false;
        duringCreated(CoreModule.m30929H().send(this.f29085k)).subscribe(psd0.m173600K(new y20() { // from class: l.dgj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88309a.m45349E2((uxj0) obj);
            }
        }, new y20() { // from class: l.egj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93940a.m45321F2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m45323I2() {
        i4g0.m138523u("e_intl_bind_phone_enter_verification_code_next_butto", pageId(), jyb.m147494Y("bindType", this.f29086l ? "afterSignup" : "accountSecurityPage"));
        int i = f29076q;
        f29076q = i + 1;
        if (i < 5) {
            this.f29085k.code = m45346v2();
            m45325R2();
        } else {
            this.f29079e.setText("");
            o1j0.m165634h(R$string.f28572H3);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    private void m45324Q2() {
        progressDismiss();
        f29076q = 0;
        m45345u2();
        bnl0.m105525M0(this.f29081g, true);
        bnl0.m105525M0(this.f29080f, false);
    }

    /* JADX INFO: renamed from: R2 */
    private void m45325R2() {
        progress(R$string.f28619R0);
        duringCreated(CoreModule.m30929H().verify(this.f29085k)).subscribe(psd0.m173600K(new y20() { // from class: l.fgj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98944a.m45351L2((uxj0) obj);
            }
        }, new y20() { // from class: l.ggj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104023a.m45352M2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m45326X1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        l51.m152887G(new Runnable() { // from class: l.hgj
            @Override // java.lang.Runnable
            public final void run() {
                this.f109414a.m45319B2();
            }
        });
        this.f29078d.setText(e170.m118942a(this.f29083i, this.f29084j));
        f29076q = 0;
        if (bundle == null) {
            String str = this.f29086l ? "afterSignup" : "accountSecurityPage";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bindType", str);
                this.pageHelper.m152780o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        } else {
            this.f29089o = bundle.getBoolean("count_down_complete");
        }
        if (l51.m152882B(m45355s2()) || !TextUtils.equals(f29075p, this.f29084j)) {
            m45345u2();
        } else {
            this.act.progress(R$string.f28619R0);
            this.f29087m.run();
        }
        f29075p = this.f29084j;
    }

    /* JADX INFO: renamed from: q2 */
    public static void m45342q2(TextView textView, String str, x20 x20Var) {
        if (!NullChecker.m82487b(textView) || TextUtils.isEmpty(textView.getText())) {
            return;
        }
        String string = textView.getText().toString();
        int iIndexOf = string.indexOf(str);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C8440a(x20Var), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(CoreModule.f18263b.getResources().getColor(j9c0.f118877n));
    }

    /* JADX INFO: renamed from: r */
    private void m45343r() {
        this.f29077c.setText(R$string.f28758p4);
        this.f29079e.setOnCompleteAction(this.f29088n);
        this.f29079e.setListener(new VerifyCodeView.InterfaceC8441a() { // from class: l.sfj
            @Override // com.p051p1.mobile.putong.core.p058ui.account.view.VerifyCodeView.InterfaceC8441a
            /* JADX INFO: renamed from: a */
            public final void mo45396a(String str) {
                this.f167713a.m45320C2(str);
            }
        });
        bnl0.m105591y(this.f29082h, this.f29079e.getText().length() == 4);
        this.f29082h.setOnClickListener(new View.OnClickListener() { // from class: l.zfj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204148a.m45348D2(view);
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m45344r2(Act act, int i, String str, boolean z) {
        Intent intent = new Intent(act, (Class<?>) GPBindVerifyCodeInputAct.class);
        intent.putExtra("ccode", i);
        intent.putExtra("phone_number", str);
        intent.putExtra("is_from_sign_up", z);
        return intent;
    }

    /* JADX INFO: renamed from: u2 */
    private void m45345u2() {
        if (!this.f29089o) {
            duringCreated(l51.m152894N(m45355s2(), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.ufj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178772a.m45356w2((Long) obj);
                }
            }, new y20() { // from class: l.vfj
                @Override // p153l.y20
                public final void call(Object obj) {
                    GPBindVerifyCodeInputAct.m45326X1((Throwable) obj);
                }
            }, new x20() { // from class: l.wfj
                @Override // p153l.x20
                public final void call() {
                    this.f188855a.m45358z2();
                }
            }));
            return;
        }
        this.f29081g.setText(getString(R$string.f28685d3, 60));
        bnl0.m105525M0(this.f29080f, true);
        bnl0.m105525M0(this.f29081g, false);
        this.f29080f.setText(R$string.f28577I3);
        m45342q2(this.f29080f, string(R$string.f28582J3), new x20() { // from class: l.tfj
            @Override // p153l.x20
            public final void call() {
                this.f173968a.m45347A2();
            }
        });
    }

    /* JADX INFO: renamed from: v2 */
    private int m45346v2() {
        try {
            return Integer.parseInt(jyb.m147528q(this.f29079e.getText()));
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m45347A2() {
        this.f29087m.run();
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m45348D2(View view) {
        this.f29088n.call();
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m45349E2(uxj0 uxj0Var) {
        m45324Q2();
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m45350K2() {
        this.f29087m.run();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m45351L2(uxj0 uxj0Var) {
        hideInput();
        progressDismiss();
        String str = this.f29086l ? "afterSignup" : "accountSecurityPage";
        sfj0.m185607n("e_intl_bind_phone_success", pageId(), sfj0.C20032a.m185615h("bindType", str), sfj0.C20032a.m185615h(Oauth2AccessToken.KEY_PHONE_NUM, this.f29083i + f29075p));
        o1j0.m165636j(string(R$string.f28634U0));
        CoreModule.m30930K().dismissGpBindPhoneRedDot();
        setResult(-1);
        m45660g2();
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m45352M2(Throwable th) {
        progressDismiss();
        this.f29079e.setText("");
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: N2, reason: merged with bridge method [inline-methods] */
    public final void m45321F2(Throwable th) {
        progressDismiss();
        bnl0.m105525M0(this.f29080f, !l51.m152882B(m45355s2()));
        this.f29080f.setText(R$string.f28577I3);
        m45342q2(this.f29080f, string(R$string.f28582J3), new x20() { // from class: l.xfj
            @Override // p153l.x20
            public final void call() {
                this.f194043a.m45350K2();
            }
        });
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40060) {
            o1j0.m165636j(string(R$string.f28624S0));
        } else {
            bsj0.m106246D(th);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM45354p2 = m45354p2(layoutInflater, viewGroup);
        m45343r();
        return viewM45354p2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29083i = getIntent().getIntExtra("ccode", 0);
        this.f29084j = getIntent().getStringExtra("phone_number");
        this.f29086l = getIntent().getBooleanExtra("is_from_sign_up", false);
        this.f29085k.language = q8g0.m175820y();
        this.f29085k.action = VerifyReason.get(VerifyReason.bind_mobile);
        VerifyData verifyData = this.f29085k;
        verifyData.countryCode = this.f29083i;
        String str = this.f29084j;
        verifyData.mobileNumber = str;
        verifyData.codeLength = 4;
        if (str.equals(f29075p)) {
            return;
        }
        l51.m152891K(m45355s2());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.cgj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81680a.lambda$initSubscription$6((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("count_down_complete", this.f29089o);
    }

    /* JADX INFO: renamed from: p2 */
    public View m45354p2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return igj.m139928b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_bind_phone_enter_verification_code_view";
    }

    /* JADX INFO: renamed from: s2 */
    public final String m45355s2() {
        return getLocalClassName() + VerifyReason.bind_mobile;
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m45356w2(Long l2) {
        this.f29081g.setText(getString(R$string.f28685d3, Long.valueOf(59 - l2.longValue())));
        bnl0.m105525M0(this.f29080f, false);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m45357y2() {
        this.f29087m.run();
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m45358z2() {
        this.f29089o = true;
        this.f29081g.setText(getString(R$string.f28685d3, 60));
        bnl0.m105525M0(this.f29080f, true);
        bnl0.m105525M0(this.f29081g, false);
        this.f29080f.setText(R$string.f28577I3);
        m45342q2(this.f29080f, string(R$string.f28582J3), new x20() { // from class: l.yfj
            @Override // p153l.x20
            public final void call() {
                this.f199529a.m45357y2();
            }
        });
    }
}
