package p153l;

import android.annotation.SuppressLint;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.PhoneNumberInputAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.slf4j.Marker;
import p151v.VButton_FakeShadow;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class hz60 extends jbf0<oy60, PhoneNumberInputAct> {

    /* JADX INFO: renamed from: c */
    public VLinear f112198c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f112199d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit_FakeSpinner f112200e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f112201f;

    /* JADX INFO: renamed from: g */
    public VText f112202g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f112203h;

    /* JADX INFO: renamed from: i */
    public VText f112204i;

    /* JADX INFO: renamed from: j */
    public VText f112205j;

    /* JADX INFO: renamed from: k */
    public VText f112206k;

    /* JADX INFO: renamed from: l */
    public VMaterialEdit f112207l;

    /* JADX INFO: renamed from: m */
    public VText f112208m;

    /* JADX INFO: renamed from: n */
    public VText f112209n;

    /* JADX INFO: renamed from: o */
    public VText f112210o;

    /* JADX INFO: renamed from: p */
    public VButton_FakeShadow f112211p;

    /* JADX INFO: renamed from: q */
    public oy60 f112212q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f112213r;

    public hz60(@NonNull PhoneNumberInputAct phoneNumberInputAct) {
        super(phoneNumberInputAct);
        this.f112213r = new View.OnClickListener() { // from class: l.py60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154620a.m137875d0(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m137837U(String str) {
        this.f112200e.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public View m137852F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iz60.m142795b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public void m137853G() {
        iz60.m142796c(this);
    }

    @Override // p153l.jbf0, p153l.iam
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(oy60 oy60Var) {
        this.f112212q = oy60Var;
    }

    /* JADX INFO: renamed from: I */
    public int m137855I() {
        return NullChecker.m82488c(this.f112200e, SchemeKey.account, CrashHelper.ReportLevel.p9) ? Integer.valueOf(this.f112200e.getText().toString().substring(1)).intValue() : nsb.f143476d.get(0).f143479b;
    }

    /* JADX INFO: renamed from: J */
    public String m137856J() {
        return Marker.ANY_NON_NULL_MARKER + jyb.m147528q(this.f112200e.getText().toString()) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + jyb.m147528q(this.f112201f.getText().toString());
    }

    /* JADX INFO: renamed from: K */
    public String m137857K() {
        return bsj0.m106255M(this.f112201f);
    }

    /* JADX INFO: renamed from: L */
    public void m137858L(VerifyReason verifyReason) {
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            this.f112200e.setText("+86");
            return;
        }
        int i = nsb.f143476d.get(0).f143479b;
        this.f112200e.setText(Marker.ANY_NON_NULL_MARKER + i);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: M */
    public void m137859M(final VerifyReason verifyReason) {
        this.f112200e.setOnClickListener(new View.OnClickListener() { // from class: l.zy60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206556a.m137868W(verifyReason, view);
            }
        });
        if (NullChecker.m82486a(WelcomeAct.f17778h) && !TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            this.f112200e.setText(WelcomeAct.f17778h);
        }
        this.f112201f.m224374I(false).subscribe(psd0.m173596G(new y20() { // from class: l.cz60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84428a.m137869X((CharSequence) obj);
            }
        }));
        bnl0.m105509E0(this.f112211p, this.f112213r);
        this.f112201f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.dz60
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f91326a.m137870Y(textView, i, keyEvent);
            }
        });
        if (NullChecker.m82486a(WelcomeAct.f17777g) && !TEnum.equals(verifyReason, VerifyReason.change_phone)) {
            this.f112201f.setText(WelcomeAct.f17777g);
            int visibility = this.f112207l.getVisibility();
            HoldAct holdact = this.f119872a;
            if (visibility == 0) {
                l51.m152886F(holdact, new Runnable() { // from class: l.ez60
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f96566a.m137871Z();
                    }
                });
            } else {
                l51.m152886F(holdact, new Runnable() { // from class: l.fz60
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f101446a.m137872a0();
                    }
                });
            }
        }
        if (this.f112207l.getVisibility() == 0) {
            this.f112207l.m224374I(false).subscribe(psd0.m173596G(new y20() { // from class: l.gz60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107168a.m137873b0((CharSequence) obj);
                }
            }));
            this.f112207l.setOnClickListener(new View.OnClickListener() { // from class: l.qy60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f160094a.m137860N(view);
                }
            });
            this.f112207l.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ry60
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return this.f165412a.m137861O(textView, i, keyEvent);
                }
            });
        }
        this.f112210o.setVisibility(8);
        if (TEnum.equals(verifyReason, VerifyReason.signin)) {
            this.f112209n.setVisibility(0);
            this.f112209n.setText(R$string.f17020w3);
            int iM137855I = m137855I();
            VText vText = this.f112209n;
            if (iM137855I == 86) {
                vText.setText(R$string.f16964m0);
                gsj0.m132059c(this.f112209n, act().getString(R$string.f16976o0), new x20() { // from class: l.sy60
                    @Override // p153l.x20
                    public final void call() {
                        this.f171212a.m137862P();
                    }
                });
            } else {
                vText.setText(R$string.f17020w3);
                gsj0.m132059c(this.f112209n, ((PhoneNumberInputAct) this.f119872a).string(R$string.f17025x3), new x20() { // from class: l.ty60
                    @Override // p153l.x20
                    public final void call() {
                        this.f176636a.m137863Q();
                    }
                });
            }
        } else if (TEnum.equals(verifyReason, VerifyReason.signup)) {
            this.f112200e.setOnClickListener(new View.OnClickListener() { // from class: l.az60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74097a.m137865S(verifyReason, view);
                }
            });
            this.f112209n.setVisibility(8);
        }
        m137881j0();
        act().setKeyboardListener(this.f112198c, new y20() { // from class: l.bz60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79096a.m137866T((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m137860N(View view) {
        i4g0.m138520r("e_password_input", ((PhoneNumberInputAct) this.f119872a).pageId());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m137861O(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.m82486a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f112213r.onClick(this.f112211p);
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m137862P() {
        i4g0.m138523u("e_password_verifypage_switch_button", ((PhoneNumberInputAct) this.f119872a).pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, jyb.m147528q(m137857K())));
        this.f112212q.m169814c2();
        act().m51642n2();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m137863Q() {
        i4g0.m138520r("e_password_verifypage_reset_button", ((PhoneNumberInputAct) this.f119872a).pageId());
        this.f112212q.m169811Z1();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m137864R(String str) {
        this.f112200e.setText(str);
        m137881j0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m137865S(VerifyReason verifyReason, View view) {
        if (!TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            i4g0.m138520r("e_area_code_button", ((PhoneNumberInputAct) this.f119872a).pageId());
        }
        Objects.toString(this.f112200e.getText());
        C20102sm.m186687c0(this.f119872a, new y20() { // from class: l.wy60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191573a.m137864R((String) obj);
            }
        }, w1e.m204399c("p_country_code_selection_view", Dialog.class.getName()));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m137866T(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f112210o.setVisibility(0);
            return;
        }
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(this.f112207l, this.f112198c);
        bnl0.C16067g c16067gM105562j1 = bnl0.m105562j0(this.f112210o, this.f112198c);
        bnl0.C16067g c16067gM105562j2 = bnl0.m105562j0(this.f112209n, this.f112198c);
        if (this.f112209n.getVisibility() == 0) {
            if (c16067gM105562j1.f77560b - (c16067gM105562j2.f77560b + c16067gM105562j2.f77562d) < qa00.m175859d(10.0f)) {
                this.f112210o.setVisibility(8);
            }
        } else if (c16067gM105562j1.f77560b - (c16067gM105562j0.f77560b + c16067gM105562j0.f77562d) < qa00.m175859d(10.0f)) {
            this.f112210o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m137867V() {
        if (this.f112212q.lifecycle_() == C4470c.f16267i) {
            C20102sm.m186686b0(this.f119872a, new y20() { // from class: l.xy60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196719a.m137837U((String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m137868W(VerifyReason verifyReason, View view) {
        if (!TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            i4g0.m138520r("e_area_code_button", ((PhoneNumberInputAct) this.f119872a).pageId());
        }
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.vy60
            @Override // java.lang.Runnable
            public final void run() {
                this.f186341a.m137867V();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m137869X(CharSequence charSequence) {
        this.f112212q.m169817f2(charSequence);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean m137870Y(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.m82486a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f112213r.onClick(this.f112211p);
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m137871Z() {
        this.f112207l.requestFocus();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m137872a0() {
        VMaterialEdit vMaterialEdit = this.f112201f;
        vMaterialEdit.setSelection(vMaterialEdit.getText().length());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m137873b0(CharSequence charSequence) {
        g4g0.m128878a("e_password_input", ((PhoneNumberInputAct) this.f119872a).pageId(), ((PhoneNumberInputAct) this.f119872a).getClass().getName(), new Object[0]);
        this.f112212q.m169810Y1(charSequence);
        m137881j0();
        if (charSequence.length() > 0) {
            mo107593i(null);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m137874c0(View view) {
        i4g0.m138520r("e_phone_input", ((PhoneNumberInputAct) this.f119872a).pageId());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m137875d0(View view) {
        boolean z = false;
        boolean z2 = true;
        if (this.f112199d.getVisibility() == 0) {
            if (TextUtils.isEmpty(this.f112201f.getText())) {
                this.f112201f.setError(((PhoneNumberInputAct) this.f119872a).string(R$string.f16985p3));
            } else {
                if (!this.f112212q.m169821n1(this.f112201f.getText().toString())) {
                    this.f112201f.setError(act().getString(R$string.f16815K3));
                }
                this.f112201f.setOnClickListener(new View.OnClickListener() { // from class: l.yy60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f202084a.m137874c0(view2);
                    }
                });
            }
            z2 = false;
            this.f112201f.setOnClickListener(new View.OnClickListener() { // from class: l.yy60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f202084a.m137874c0(view2);
                }
            });
        }
        if (this.f112207l.getVisibility() == 0) {
            this.f112212q.m169815d2();
            if (TextUtils.isEmpty(this.f112207l.getText())) {
                mo107593i(((PhoneNumberInputAct) this.f119872a).string(R$string.f16979o3));
            } else if (this.f112207l.getText().length() < 6) {
                mo107593i(lu6.m155847c(((PhoneNumberInputAct) this.f119872a).string(R$string.f16805I3)));
            } else {
                z = z2;
            }
        } else {
            z = z2;
        }
        if (bnl0.m105529O0(this.f112202g)) {
            rfj0.m181214b("e_p_appeal_verify_phonenumber_page_next", ((PhoneNumberInputAct) this.f119872a).pageId(), rfj0.C19825a.m181221f("is_binding_phonenumber", "0"));
        }
        this.f112212q.m169819h2(z);
    }

    @Override // p153l.jbf0, p153l.iam
    public void destroy() {
        m137853G();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m137876e0(View view) {
        i4g0.m138520r("e_prelogin_password_page_feedback", ((PhoneNumberInputAct) this.f119872a).pageId());
        act().startActivity(WebViewAct.m81348b2(act(), "帮助与反馈", ebe0.m120159a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m137877f0() {
        return m137855I() == 86;
    }

    /* JADX INFO: renamed from: g0 */
    public void m137878g0() {
        this.f112207l.requestFocus();
    }

    /* JADX INFO: renamed from: h0 */
    public void m137879h0() {
        m144219d(this.f112200e, this.f112201f);
    }

    @Override // p153l.jbf0
    /* JADX INFO: renamed from: i */
    public void mo107593i(String str) {
        this.f112207l.setError(str);
    }

    /* JADX INFO: renamed from: i0 */
    public void m137880i0(VerifyReason verifyReason, SignInData signInData) {
        String string = verifyReason.toString();
        string.getClass();
        switch (string) {
            case "signin":
                this.f112207l.setHint(R$string.f16989q2);
                this.f112199d.setVisibility(8);
                ((PhoneNumberInputAct) this.f119872a).setTitle(R$string.f16978o2);
                if (NullChecker.m82486a(signInData) && signInData.username.contains(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
                    String[] strArrSplit = signInData.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    String str = strArrSplit[0];
                    this.f112201f.setText(strArrSplit[1]);
                    this.f112200e.setText(Marker.ANY_NON_NULL_MARKER + str);
                }
                if (C16074bp.m105756k()) {
                    bnl0.m105524M(this.f112208m, true);
                    bnl0.m105509E0(this.f112208m, new View.OnClickListener() { // from class: l.uy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f181540a.m137876e0(view);
                        }
                    });
                }
                this.f112211p.setText(R$string.f16978o2);
                break;
            case "signup":
                this.f112207l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
                ((PhoneNumberInputAct) this.f119872a).setTitle(R$string.f16891a);
                this.f112211p.setText(R$string.f16903c);
                this.f112207l.setVisibility(8);
                ((PhoneNumberInputAct) this.f119872a).lmdStart(30000);
                VLinear.f210051b.m224310c();
                bnl0.m105524M(this.f112208m, false);
                break;
            case "ban-appeal":
                ((PhoneNumberInputAct) this.f119872a).setTitle(R$string.f16761A);
                this.f112211p.setText(R$string.f16909d);
                bnl0.m105525M0(this.f112202g, true);
                bnl0.m105524M(this.f112207l, false);
                bnl0.m105524M(this.f112209n, false);
                bnl0.m105524M(this.f112208m, false);
                break;
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m137852F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m137881j0() {
        this.f112211p.setActivated(((this.f112201f.getVisibility() != 0 || (!TextUtils.isEmpty(this.f112201f.getText()) && this.f112212q.m169821n1(this.f112201f.getText().toString()))) && (this.f112207l.getVisibility() != 0 || (!TextUtils.isEmpty(this.f112207l.getText()) && this.f112207l.getText().length() >= 6))) ? false : true);
    }

    /* JADX INFO: renamed from: k0 */
    public void m137882k0() {
        this.f112201f.requestFocus();
    }
}
