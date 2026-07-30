package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.AppsFlyerLib;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.OtherSettingsOthers;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SubGender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rkf0 extends jbf0<ujf0, SignUpDetailsNewAct> {

    /* JADX INFO: renamed from: A */
    public VText f163568A;

    /* JADX INFO: renamed from: B */
    public VText f163569B;

    /* JADX INFO: renamed from: C */
    public VIcon f163570C;

    /* JADX INFO: renamed from: D */
    public VLinear f163571D;

    /* JADX INFO: renamed from: E */
    public VText f163572E;

    /* JADX INFO: renamed from: F */
    public VLinear f163573F;

    /* JADX INFO: renamed from: G */
    public VText f163574G;

    /* JADX INFO: renamed from: H */
    public VLinear f163575H;

    /* JADX INFO: renamed from: I */
    public VEditText f163576I;

    /* JADX INFO: renamed from: J */
    public VLinear f163577J;

    /* JADX INFO: renamed from: K */
    public VEditText f163578K;

    /* JADX INFO: renamed from: L */
    public VText f163579L;

    /* JADX INFO: renamed from: M */
    public VLinear f163580M;

    /* JADX INFO: renamed from: N */
    public VCheckBox f163581N;

    /* JADX INFO: renamed from: O */
    public VText f163582O;

    /* JADX INFO: renamed from: P */
    public VButton f163583P;

    /* JADX INFO: renamed from: Q */
    public ConstraintLayout f163584Q;

    /* JADX INFO: renamed from: R */
    public VImage f163585R;

    /* JADX INFO: renamed from: S */
    public VImage f163586S;

    /* JADX INFO: renamed from: T */
    public VText f163587T;

    /* JADX INFO: renamed from: U */
    public VText f163588U;

    /* JADX INFO: renamed from: V */
    public ujf0 f163589V;

    /* JADX INFO: renamed from: W */
    public OtherSettingsOthers f163590W;

    /* JADX INFO: renamed from: X */
    public View f163591X;

    /* JADX INFO: renamed from: Y */
    public View.OnClickListener f163592Y;

    /* JADX INFO: renamed from: c */
    public VText f163593c;

    /* JADX INFO: renamed from: d */
    public VEditText f163594d;

    /* JADX INFO: renamed from: e */
    public VText f163595e;

    /* JADX INFO: renamed from: f */
    public VText f163596f;

    /* JADX INFO: renamed from: g */
    public VText f163597g;

    /* JADX INFO: renamed from: h */
    public VText f163598h;

    /* JADX INFO: renamed from: i */
    public VLinear f163599i;

    /* JADX INFO: renamed from: j */
    public VFrame f163600j;

    /* JADX INFO: renamed from: k */
    public VLinear f163601k;

    /* JADX INFO: renamed from: l */
    public VIcon f163602l;

    /* JADX INFO: renamed from: m */
    public VText f163603m;

    /* JADX INFO: renamed from: n */
    public VImage f163604n;

    /* JADX INFO: renamed from: o */
    public VFrame f163605o;

    /* JADX INFO: renamed from: p */
    public VLinear f163606p;

    /* JADX INFO: renamed from: q */
    public VIcon f163607q;

    /* JADX INFO: renamed from: r */
    public VText f163608r;

    /* JADX INFO: renamed from: s */
    public VImage f163609s;

    /* JADX INFO: renamed from: t */
    public VFrame f163610t;

    /* JADX INFO: renamed from: u */
    public VLinear f163611u;

    /* JADX INFO: renamed from: v */
    public VIcon f163612v;

    /* JADX INFO: renamed from: w */
    public VText f163613w;

    /* JADX INFO: renamed from: x */
    public VImage f163614x;

    /* JADX INFO: renamed from: y */
    public VText f163615y;

    /* JADX INFO: renamed from: z */
    public ConstraintLayout f163616z;

    public rkf0(@NonNull SignUpDetailsNewAct signUpDetailsNewAct) {
        super(signUpDetailsNewAct);
        this.f163592Y = new View.OnClickListener() { // from class: l.gkf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104733a.m181796h0(view);
            }
        };
    }

    /* JADX INFO: renamed from: N */
    private void m181795N() {
        boolean z = false;
        bnl0.m105524M(this.f163616z, this.f163589V.m196357k1().newGender != null);
        if (this.f163589V.m196357k1().newGender != null) {
            i4g0.m138526x("e_clone_signup_add_more_detail", ((SignUpDetailsNewAct) this.f119872a).pageId());
        }
        if (this.f163589V.m196357k1().subGenderOption != null && this.f163589V.m196357k1().newGender != null) {
            z = true;
        }
        this.f163568A.setTextColor(((SignUpDetailsNewAct) this.f119872a).getColor(z ? a9c0.f69017b : a9c0.f69020e));
        bnl0.m105524M(this.f163569B, !z);
        this.f163568A.setText(z ? ino.INSTANCE.m141158d(this.f163589V.m196357k1().newGender, this.f163589V.m196357k1().subGenderOption) : ((SignUpDetailsNewAct) this.f119872a).getText(R$string.f16878X1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m181796h0(View view) {
        this.f163589V.m196346C1();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m181803q(Runnable runnable, View view, boolean z) {
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m181811A3(final String str) {
        bnl0.m105524M(this.f163584Q, false);
        bnl0.m105524M(this.f163585R, false);
        bnl0.m105524M(this.f163587T, false);
        bnl0.m105524M(this.f163610t, ino.INSTANCE.m141164j());
        l51.m152887G(new Runnable() { // from class: l.nkf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142456a.m181829b0();
            }
        });
        this.f163596f.setText(((SignUpDetailsNewAct) this.f119872a).string(R$string.f16774C2) + ((SignUpDetailsNewAct) this.f119872a).string(R$string.f16850R3));
        this.f163583P.setText(R$string.f16952k0);
        m181817P(this.f163600j, "e_profilepage_male_button", str, "male");
        m181817P(this.f163605o, "e_profilepage_female_button", str, "female");
        m181817P(this.f163610t, "e_profilepage_nonbinary_button", str, "nonbinary");
        bnl0.m105509E0(this.f163616z, new View.OnClickListener() { // from class: l.qkf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158133a.m181831d0(str, view);
            }
        });
        this.f163594d.setOnClickListener(new View.OnClickListener() { // from class: l.wjf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189445a.m181832e0(str, view);
            }
        });
        this.f163594d.mo29617i(false).subscribe(psd0.m173596G(new y20() { // from class: l.xjf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194572a.m181833f0(str, (CharSequence) obj);
            }
        }));
        final Runnable runnable = new Runnable() { // from class: l.yjf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f200296a.m181834g0(str);
            }
        };
        this.f163597g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.zjf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                rkf0.m181803q(runnable, view, z);
            }
        });
        this.f163597g.setOnClickListener(new View.OnClickListener() { // from class: l.akf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        this.f163574G.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.bkf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f77066a.m181824W(view, z);
            }
        });
        this.f163574G.setOnClickListener(new View.OnClickListener() { // from class: l.ckf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82281a.m181825X(view);
            }
        });
        this.f163572E.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.dkf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f89403a.m181826Y(view, z);
            }
        });
        this.f163572E.setOnClickListener(new View.OnClickListener() { // from class: l.okf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147753a.m181827Z(view);
            }
        });
        this.f163576I.mo29617i(false).subscribe(psd0.m173596G(new y20() { // from class: l.pkf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152837a.m181828a0((CharSequence) obj);
            }
        }));
        m181851y0(str);
    }

    /* JADX INFO: renamed from: J */
    public View m181812J(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return skf0.m186447b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public void m181813K() {
        skf0.m186448c(this);
    }

    @Override // p153l.jbf0, p153l.iam
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ujf0 ujf0Var) {
        this.f163589V = ujf0Var;
    }

    /* JADX INFO: renamed from: M */
    public final void m181815M(ViewGroup viewGroup, View view, boolean z) {
        viewGroup.setSelected(z);
        bnl0.m105524M(view, z);
    }

    /* JADX INFO: renamed from: O */
    public final void m181816O(SignUpData signUpData) {
        if (signUpData.signUpType == AccountTempApi.SignUpType.facebook) {
            this.f163577J.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m181817P(VFrame vFrame, final String str, final String str2, final String str3) {
        vFrame.setOnClickListener(new View.OnClickListener() { // from class: l.ekf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94371a.m181822U(str, str2, str3, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public String m181818Q(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return act().getResources().getString(R$string.f16839P2);
            case "BACHELOR":
                return act().getResources().getString(R$string.f16819L2);
            case "LOWER_PRIMARY":
                return act().getResources().getString(R$string.f16834O2);
            case "HIGH_SCHOOL":
                return act().getResources().getString(R$string.f16829N2);
            case "VOCATIONAL_SCHOOL":
                return act().getResources().getString(R$string.f16849R2);
            case "UPPER_PRIMARY":
                return act().getResources().getString(R$string.f16844Q2);
            case "DOCTOR":
                return act().getResources().getString(R$string.f16824M2);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m181819R(SignUpData signUpData) {
        if (signUpData.signUpType == AccountTempApi.SignUpType.google) {
            this.f163577J.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m181821T(String str) {
        if (this.f163589V.m196357k1().newGender != IntlGender.get(str)) {
            this.f163589V.m196357k1().subGenderOption = null;
            m181847u0();
        }
        boolean zM141164j = ino.INSTANCE.m141164j();
        ujf0 ujf0Var = this.f163589V;
        if (zM141164j) {
            ujf0Var.m196357k1().newGender = IntlGender.get(str);
            m181846t0(AccountModule.f16756c.m29302P0(), this.f163589V.m196357k1().newGender.toString());
        } else {
            ujf0Var.m196357k1().gender = Gender.get(str);
            m181846t0(AccountModule.f16756c.m29302P0(), this.f163589V.m196357k1().gender.toString());
        }
        this.f163599i.requestFocus();
        this.f163615y.setVisibility(8);
        ((SignUpDetailsNewAct) this.f119872a).hideInput(this.f163594d);
        m181844r0();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m181822U(String str, String str2, final String str3, View view) {
        i4g0.m138523u(str, ((SignUpDetailsNewAct) this.f119872a).pageId(), jyb.m147494Y("signup_source", str2), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f163589V.m196349F1()));
        if (ino.INSTANCE.m141164j()) {
            m181821T(str3);
        } else {
            this.f163589V.m196356j1(new Runnable() { // from class: l.ikf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115359a.m181821T(str3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m181823V(TextView textView, int i, KeyEvent keyEvent) {
        if (5 != i) {
            return false;
        }
        ((SignUpDetailsNewAct) this.f119872a).hideInput(this.f163594d);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m181824W(View view, boolean z) {
        if (z) {
            this.f163589V.m196351I1();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m181825X(View view) {
        this.f163589V.m196351I1();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m181826Y(View view, boolean z) {
        if (z) {
            this.f163589V.m196350H1();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m181827Z(View view) {
        this.f163589V.m196350H1();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m181828a0(CharSequence charSequence) {
        this.f163589V.m196357k1().school = charSequence.toString().trim();
        m181850x0(this.f163589V.m196357k1());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m181829b0() {
        this.f163594d.requestFocus();
        act().showInput(this.f163594d, 0);
        this.f163594d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.fkf0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f99504a.m181823V(textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m181830c0(SubGender subGender, boolean z) {
        this.f163589V.m196357k1().subGenderOption = subGender == null ? null : subGender.toString();
        this.f163589V.m196357k1().profileShowGender = z;
        m181844r0();
        m181847u0();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m181831d0(String str, View view) {
        i4g0.m138523u("e_clone_signup_add_more_detail", ((SignUpDetailsNewAct) this.f119872a).pageId(), jyb.m147494Y("signup_source", str));
        String str2 = this.f163589V.m196357k1().subGenderOption;
        ino.INSTANCE.m141166l(this.f119872a, TextUtils.isEmpty(str2) ? null : SubGender.get(str2), this.f163589V.m196357k1().newGender, this.f163589V.m196357k1().profileShowGender, new gno.InterfaceC17259b() { // from class: l.hkf0
            @Override // p153l.gno.InterfaceC17259b
            /* JADX INFO: renamed from: a */
            public final void mo130926a(SubGender subGender, boolean z) {
                this.f110411a.m181830c0(subGender, z);
            }
        });
    }

    @Override // p153l.jbf0, p153l.iam
    public void destroy() {
        m181813K();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m181832e0(String str, View view) {
        i4g0.m138523u("e_profilepage_name_input", ((SignUpDetailsNewAct) this.f119872a).pageId(), jyb.m147494Y("signup_source", str), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f163589V.m196349F1()));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m181833f0(String str, CharSequence charSequence) {
        g4g0.m128878a("e_profilepage_name_input", ((SignUpDetailsNewAct) this.f119872a).pageId(), ((SignUpDetailsNewAct) this.f119872a).getClass().getName(), "signup_source", str, Oauth2AccessToken.KEY_PHONE_NUM, this.f163589V.m196349F1());
        this.f163589V.m196357k1().name = charSequence.toString();
        m181846t0(AccountModule.f16756c.m29304Q0(), this.f163589V.m196357k1().name);
        m181843q0(this.f163595e, bsj0.m106254L(this.f163589V.m196357k1().name));
        m181850x0(this.f163589V.m196357k1());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m181834g0(String str) {
        i4g0.m138523u("e_profilepage_birthday_button", ((SignUpDetailsNewAct) this.f119872a).pageId(), jyb.m147494Y("signup_source", str), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f163589V.m196349F1()));
        this.f163589V.m196354h1();
    }

    @Override // p153l.jbf0
    /* JADX INFO: renamed from: i */
    public void mo107593i(String str) {
        m181843q0(this.f163579L, str);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ boolean m181835i0(MenuItem menuItem) {
        i4g0.m138520r("e_prelogin_profile_info_page_feedback", ((SignUpDetailsNewAct) this.f119872a).pageId());
        act().startActivity(WebViewAct.m81348b2(act(), "帮助与反馈", ebe0.m120159a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
        return true;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM181812J = m181812J(layoutInflater, viewGroup);
        this.f163591X = viewM181812J;
        return viewM181812J;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m181836j0(String str, CharSequence charSequence) {
        g4g0.m128878a("e_profilepage_password_input", ((SignUpDetailsNewAct) this.f119872a).pageId(), ((SignUpDetailsNewAct) this.f119872a).getClass().getName(), "signup_source", str, Oauth2AccessToken.KEY_PHONE_NUM, this.f163589V.m196349F1());
        this.f163589V.m196357k1().password = charSequence.toString();
        if (this.f163589V.m196357k1().password.length() >= (IntlCountryCodeController.m29119p() ? 8 : 6)) {
            mo107593i(null);
        }
        m181850x0(this.f163589V.m196357k1());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m181837k0(String str, View view) {
        i4g0.m138523u("e_profilepage_password_input", ((SignUpDetailsNewAct) this.f119872a).pageId(), jyb.m147494Y("signup_source", str), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f163589V.m196349F1()));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ boolean m181838l0(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.m82486a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f163592Y.onClick(this.f163583P);
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m181839m0(CompoundButton compoundButton, boolean z) {
        this.f163590W.refuseSMS = !z;
    }

    /* JADX INFO: renamed from: n0 */
    public void m181840n0(SignUpData signUpData, boolean z, boolean z2, String str) {
        if (!this.f163583P.isActivated()) {
            ((SignUpDetailsNewAct) this.f119872a).progress(R$string.f16946j0);
            signUpData.f39664b1 = z;
            signUpData.f39665b2 = z2;
            signUpData.f39666b3 = false;
            signUpData.f39667b4 = this.f163578K.getVisibility() != 0;
            signUpData.f39668bb = Act.lmdEnd();
            pf60<Boolean, Boolean> pf60VarM224309b = VLinear.f210051b.m224309b();
            signUpData.tsd1 = pf60VarM224309b.f152156a.booleanValue();
            signUpData.tsd2 = pf60VarM224309b.f152157b.booleanValue();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(this.f119872a);
            signUpData.others = this.f163590W;
            i4g0.m138523u("e_profilepage_signup_continue_button", ((SignUpDetailsNewAct) this.f119872a).pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f163589V.m196349F1()));
            this.f163589V.m196355i1(signUpData);
            return;
        }
        if (this.f163577J.getVisibility() == 0) {
            ((SignUpDetailsNewAct) this.f119872a).hideInput(this.f163578K);
        }
        if (signUpData.gender == null && signUpData.newGender == null) {
            this.f163615y.setVisibility(0);
        }
        if (signUpData.birthdate == null) {
            i4g0.m138492A("e_profilepage_birthday_empty_alert", ((SignUpDetailsNewAct) this.f119872a).pageId(), jyb.m147494Y("signup_source", str), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f163589V.m196349F1()));
            m181843q0(this.f163598h, ((SignUpDetailsNewAct) this.f119872a).string(R$string.f16961l3));
        }
        if (TextUtils.isEmpty(signUpData.name)) {
            m181843q0(this.f163595e, ((SignUpDetailsNewAct) this.f119872a).string(R$string.f16967m3));
        }
        if (this.f163577J.getVisibility() == 0 && TextUtils.isEmpty(signUpData.password)) {
            mo107593i(((SignUpDetailsNewAct) this.f119872a).string(R$string.f16973n3));
        } else if (this.f163577J.getVisibility() == 0) {
            if (signUpData.password.length() < (IntlCountryCodeController.m29119p() ? 8 : 6)) {
                boolean zM29119p = IntlCountryCodeController.m29119p();
                HoldAct holdact = this.f119872a;
                mo107593i(lu6.m155847c(zM29119p ? ((SignUpDetailsNewAct) holdact).string(R$string.f16882Y0) : ((SignUpDetailsNewAct) holdact).string(R$string.f16866V)));
            }
        }
        o1j0.m165634h(R$string.f16990q3);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m181841o0(Menu menu) {
        if (!C16074bp.m105756k()) {
            return false;
        }
        MenuItem menuItemAdd = menu.add(0, wcc0.f188414J, 0, "遇到问题？");
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.vjf0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f184384a.m181835i0(menuItem);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public void m181842p0() {
        this.f163597g.setText("");
    }

    /* JADX INFO: renamed from: q0 */
    public void m181843q0(VText vText, String str) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            vText.setText(str);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m181844r0() {
        VFrame vFrame = this.f163600j;
        VImage vImage = this.f163604n;
        ino inoVar = ino.INSTANCE;
        m181815M(vFrame, vImage, inoVar.m141162h("male", this.f163589V.m196357k1()));
        m181815M(this.f163605o, this.f163609s, inoVar.m141162h("female", this.f163589V.m196357k1()));
        if (inoVar.m141164j()) {
            m181815M(this.f163610t, this.f163614x, inoVar.m141162h("nonbinary", this.f163589V.m196357k1()));
            m181795N();
        }
        if (NullChecker.m82486a(this.f163589V.m196357k1().birthdate)) {
            this.f163597g.setText(pzi0.f154856c.format(this.f163589V.m196357k1().birthdate));
        }
        if (IntlCountryCodeController.m29115l()) {
            boolean zM141162h = inoVar.m141162h("male", this.f163589V.m196357k1());
            VLinear vLinear = this.f163573F;
            if (zM141162h) {
                vLinear.setVisibility(0);
                if (NullChecker.m82486a(this.f163589V.m196357k1().qualificationType)) {
                    this.f163574G.setText(m181818Q(this.f163589V.m196357k1().qualificationType));
                    boolean zM106252J = bsj0.m106252J(this.f163589V.m196357k1().qualificationType);
                    VLinear vLinear2 = this.f163575H;
                    if (zM106252J) {
                        vLinear2.setVisibility(0);
                    } else {
                        vLinear2.setVisibility(8);
                    }
                }
            } else {
                vLinear.setVisibility(8);
                this.f163575H.setVisibility(8);
            }
        }
        bnl0.m105525M0(this.f163571D, s43.m184433b());
        if (this.f163589V.m196357k1().bloodType != null) {
            this.f163572E.setText(s43.m184432a(this.f163589V.m196357k1().bloodType));
        }
        m181850x0(this.f163589V.m196357k1());
    }

    /* JADX INFO: renamed from: s0 */
    public void m181845s0(SignUpData signUpData) {
        if (NullChecker.m82486a(signUpData.name)) {
            this.f163594d.setText(signUpData.name);
            this.f163594d.setSelection(signUpData.name.length());
        }
        if (NullChecker.m82486a(signUpData.password) && this.f163578K.getVisibility() == 0) {
            this.f163578K.setText(signUpData.password);
        }
        m181844r0();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m181846t0(wyd0 wyd0Var, String str) {
        wyd0Var.put(str);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m181847u0() {
        String str = this.f163589V.m196357k1().subGenderOption;
        wyd0 wyd0VarM29299N1 = AccountModule.f16756c.m29299N1();
        if (str == null) {
            str = "";
        }
        wyd0VarM29299N1.put(str);
        AccountModule.f16756c.m29301O1().put(Boolean.valueOf(this.f163589V.m196357k1().profileShowGender));
    }

    /* JADX INFO: renamed from: v0 */
    public void m181848v0() {
        m181843q0(this.f163598h, null);
    }

    /* JADX INFO: renamed from: w0 */
    public void m181849w0() {
        Intent intentNewMainActClearStack = AccountModule.m29131H().newMainActClearStack(act(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        act().startActivity(intentNewMainActClearStack);
        act().lambda$debugItems$19();
        bsj0.m106261S(act());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX INFO: renamed from: x0 */
    public final void m181850x0(SignUpData signUpData) {
        boolean z;
        QualificationType qualificationType;
        if (TextUtils.isEmpty(signUpData.name) || this.f163594d.getError() != null || signUpData.birthdate == null || bsj0.m106264V().getTime() < signUpData.birthdate.doubleValue() || bsj0.m106256N().getTime() >= signUpData.birthdate.doubleValue() || (this.f163577J.getVisibility() == 0 && signUpData.password == null)) {
            z = false;
        } else if (this.f163577J.getVisibility() == 0) {
            if (signUpData.password.length() < (IntlCountryCodeController.m29119p() ? 8 : 6)) {
                z = false;
            } else if ((signUpData.gender != null && signUpData.newGender == null) || ((this.f163573F.getVisibility() == 0 && ((qualificationType = signUpData.qualificationType) == null || TEnum.equals(qualificationType, "unknown_"))) || ((this.f163575H.getVisibility() == 0 && TextUtils.isEmpty(signUpData.school)) || (this.f163571D.getVisibility() == 0 && signUpData.bloodType == null)))) {
                z = false;
            }
        } else {
            z = signUpData.gender != null ? true : true;
        }
        this.f163583P.setActivated(!z);
    }

    /* JADX INFO: renamed from: y0 */
    public void m181851y0(final String str) {
        if (this.f163589V.m196357k1().signUpType == AccountTempApi.SignUpType.nopassword) {
            bnl0.m105524M(this.f163578K, false);
        }
        if (this.f163578K.getVisibility() == 0) {
            this.f163578K.mo29617i(false).subscribe(psd0.m173596G(new y20() { // from class: l.jkf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f121404a.m181836j0(str, (CharSequence) obj);
                }
            }));
            this.f163578K.setOnClickListener(new View.OnClickListener() { // from class: l.kkf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127187a.m181837k0(str, view);
                }
            });
            this.f163578K.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.lkf0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return this.f132464a.m181838l0(textView, i, keyEvent);
                }
            });
        }
        if (IntlCountryCodeController.m29112i() || IntlCountryCodeController.m29111h(this.f163589V.m196357k1().countryCode)) {
            if (this.f163590W == null) {
                this.f163590W = OtherSettingsOthers.new_();
            }
            this.f163590W.refuseSMS = true;
            bnl0.m105524M(this.f163580M, true);
            this.f163581N.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.mkf0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f137296a.m181839m0(compoundButton, z);
                }
            });
        }
        this.f163583P.setOnClickListener(this.f163592Y);
        m181816O(this.f163589V.m196357k1());
        m181819R(this.f163589V.m196357k1());
        m181845s0(this.f163589V.m196357k1());
        m181850x0(this.f163589V.m196357k1());
    }
}
