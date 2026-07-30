package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.OtherSettingsOthers;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SubGender;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class kcf0 extends c3f0<nbf0, SignUpDetailsNewAct> {

    /* JADX INFO: renamed from: A */
    public VText f122328A;

    /* JADX INFO: renamed from: B */
    public VText f122329B;

    /* JADX INFO: renamed from: C */
    public VIcon f122330C;

    /* JADX INFO: renamed from: D */
    public VLinear f122331D;

    /* JADX INFO: renamed from: E */
    public VText f122332E;

    /* JADX INFO: renamed from: F */
    public VLinear f122333F;

    /* JADX INFO: renamed from: G */
    public VText f122334G;

    /* JADX INFO: renamed from: H */
    public VLinear f122335H;

    /* JADX INFO: renamed from: I */
    public VEditText f122336I;

    /* JADX INFO: renamed from: J */
    public VLinear f122337J;

    /* JADX INFO: renamed from: K */
    public VEditText f122338K;

    /* JADX INFO: renamed from: L */
    public VText f122339L;

    /* JADX INFO: renamed from: M */
    public VLinear f122340M;

    /* JADX INFO: renamed from: N */
    public VCheckBox f122341N;

    /* JADX INFO: renamed from: O */
    public VText f122342O;

    /* JADX INFO: renamed from: P */
    public VButton f122343P;

    /* JADX INFO: renamed from: Q */
    public ConstraintLayout f122344Q;

    /* JADX INFO: renamed from: R */
    public VImage f122345R;

    /* JADX INFO: renamed from: S */
    public VImage f122346S;

    /* JADX INFO: renamed from: T */
    public VText f122347T;

    /* JADX INFO: renamed from: U */
    public VText f122348U;

    /* JADX INFO: renamed from: V */
    public nbf0 f122349V;

    /* JADX INFO: renamed from: W */
    public OtherSettingsOthers f122350W;

    /* JADX INFO: renamed from: X */
    public View f122351X;

    /* JADX INFO: renamed from: Y */
    public View.OnClickListener f122352Y;

    /* JADX INFO: renamed from: c */
    public VText f122353c;

    /* JADX INFO: renamed from: d */
    public VEditText f122354d;

    /* JADX INFO: renamed from: e */
    public VText f122355e;

    /* JADX INFO: renamed from: f */
    public VText f122356f;

    /* JADX INFO: renamed from: g */
    public VText f122357g;

    /* JADX INFO: renamed from: h */
    public VText f122358h;

    /* JADX INFO: renamed from: i */
    public VLinear f122359i;

    /* JADX INFO: renamed from: j */
    public VFrame f122360j;

    /* JADX INFO: renamed from: k */
    public VLinear f122361k;

    /* JADX INFO: renamed from: l */
    public VIcon f122362l;

    /* JADX INFO: renamed from: m */
    public VText f122363m;

    /* JADX INFO: renamed from: n */
    public VImage f122364n;

    /* JADX INFO: renamed from: o */
    public VFrame f122365o;

    /* JADX INFO: renamed from: p */
    public VLinear f122366p;

    /* JADX INFO: renamed from: q */
    public VIcon f122367q;

    /* JADX INFO: renamed from: r */
    public VText f122368r;

    /* JADX INFO: renamed from: s */
    public VImage f122369s;

    /* JADX INFO: renamed from: t */
    public VFrame f122370t;

    /* JADX INFO: renamed from: u */
    public VLinear f122371u;

    /* JADX INFO: renamed from: v */
    public VIcon f122372v;

    /* JADX INFO: renamed from: w */
    public VText f122373w;

    /* JADX INFO: renamed from: x */
    public VImage f122374x;

    /* JADX INFO: renamed from: y */
    public VText f122375y;

    /* JADX INFO: renamed from: z */
    public ConstraintLayout f122376z;

    public kcf0(@NonNull SignUpDetailsNewAct signUpDetailsNewAct) {
        super(signUpDetailsNewAct);
        this.f122352Y = new View.OnClickListener() { // from class: l.zbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202438a.m145387h0(view);
            }
        };
    }

    /* JADX INFO: renamed from: N */
    private void m145386N() {
        boolean z = false;
        xdl0.m208344M(this.f122376z, this.f122349V.m158803k1().newGender != null);
        if (this.f122349V.m158803k1().newGender != null) {
            zvf0.m220402x("e_clone_signup_add_more_detail", ((SignUpDetailsNewAct) this.f78941a).pageId());
        }
        if (this.f122349V.m158803k1().subGenderOption != null && this.f122349V.m158803k1().newGender != null) {
            z = true;
        }
        this.f122328A.setTextColor(((SignUpDetailsNewAct) this.f78941a).getColor(z ? u0c0.f172881b : u0c0.f172884e));
        xdl0.m208344M(this.f122329B, !z);
        this.f122328A.setText(z ? ilo.INSTANCE.m137011d(this.f122349V.m158803k1().newGender, this.f122349V.m158803k1().subGenderOption) : ((SignUpDetailsNewAct) this.f78941a).getText(R$string.f16159X1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m145387h0(View view) {
        this.f122349V.m158792C1();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m145394q(Runnable runnable, View view, boolean z) {
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m145402A3(final String str) {
        xdl0.m208344M(this.f122344Q, false);
        xdl0.m208344M(this.f122345R, false);
        xdl0.m208344M(this.f122347T, false);
        xdl0.m208344M(this.f122370t, ilo.INSTANCE.m137017j());
        e51.m114742G(new Runnable() { // from class: l.gcf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f102008a.m145420b0();
            }
        });
        this.f122356f.setText(((SignUpDetailsNewAct) this.f78941a).string(R$string.f16055C2) + ((SignUpDetailsNewAct) this.f78941a).string(R$string.f16131R3));
        this.f122343P.setText(R$string.f16233k0);
        m145408P(this.f122360j, "e_profilepage_male_button", str, "male");
        m145408P(this.f122365o, "e_profilepage_female_button", str, "female");
        m145408P(this.f122370t, "e_profilepage_nonbinary_button", str, "nonbinary");
        xdl0.m208329E0(this.f122376z, new View.OnClickListener() { // from class: l.jcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117305a.m145422d0(str, view);
            }
        });
        this.f122354d.setOnClickListener(new View.OnClickListener() { // from class: l.pbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148078a.m145423e0(str, view);
            }
        });
        this.f122354d.mo28618i(false).subscribe(mkd0.m154955G(new e30() { // from class: l.qbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153644a.m145424f0(str, (CharSequence) obj);
            }
        }));
        final Runnable runnable = new Runnable() { // from class: l.rbf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158606a.m145425g0(str);
            }
        };
        this.f122357g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.sbf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                kcf0.m145394q(runnable, view, z);
            }
        });
        this.f122357g.setOnClickListener(new View.OnClickListener() { // from class: l.tbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        this.f122334G.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ubf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f175686a.m145415W(view, z);
            }
        });
        this.f122334G.setOnClickListener(new View.OnClickListener() { // from class: l.vbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180840a.m145416X(view);
            }
        });
        this.f122332E.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.wbf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f185573a.m145417Y(view, z);
            }
        });
        this.f122332E.setOnClickListener(new View.OnClickListener() { // from class: l.hcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107045a.m145418Z(view);
            }
        });
        this.f122336I.mo28618i(false).subscribe(mkd0.m154955G(new e30() { // from class: l.icf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112459a.m145419a0((CharSequence) obj);
            }
        }));
        m145442y0(str);
    }

    /* JADX INFO: renamed from: J */
    public View m145403J(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lcf0.m149297b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public void m145404K() {
        lcf0.m149298c(this);
    }

    @Override // p149l.c3f0, p149l.s7m
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nbf0 nbf0Var) {
        this.f122349V = nbf0Var;
    }

    /* JADX INFO: renamed from: M */
    public final void m145406M(ViewGroup viewGroup, View view, boolean z) {
        viewGroup.setSelected(z);
        xdl0.m208344M(view, z);
    }

    /* JADX INFO: renamed from: O */
    public final void m145407O(SignUpData signUpData) {
        if (signUpData.signUpType == AccountTempApi.SignUpType.facebook) {
            this.f122337J.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m145408P(VFrame vFrame, final String str, final String str2, final String str3) {
        vFrame.setOnClickListener(new View.OnClickListener() { // from class: l.xbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191944a.m145413U(str, str2, str3, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public String m145409Q(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return act().getResources().getString(R$string.f16120P2);
            case "BACHELOR":
                return act().getResources().getString(R$string.f16100L2);
            case "LOWER_PRIMARY":
                return act().getResources().getString(R$string.f16115O2);
            case "HIGH_SCHOOL":
                return act().getResources().getString(R$string.f16110N2);
            case "VOCATIONAL_SCHOOL":
                return act().getResources().getString(R$string.f16130R2);
            case "UPPER_PRIMARY":
                return act().getResources().getString(R$string.f16125Q2);
            case "DOCTOR":
                return act().getResources().getString(R$string.f16105M2);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m145410R(SignUpData signUpData) {
        if (signUpData.signUpType == AccountTempApi.SignUpType.google) {
            this.f122337J.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m145412T(String str) {
        if (this.f122349V.m158803k1().newGender != IntlGender.get(str)) {
            this.f122349V.m158803k1().subGenderOption = null;
            m145438u0();
        }
        boolean zM137017j = ilo.INSTANCE.m137017j();
        nbf0 nbf0Var = this.f122349V;
        if (zM137017j) {
            nbf0Var.m158803k1().newGender = IntlGender.get(str);
            m145437t0(AccountModule.f16037c.m28303P0(), this.f122349V.m158803k1().newGender.toString());
        } else {
            nbf0Var.m158803k1().gender = Gender.get(str);
            m145437t0(AccountModule.f16037c.m28303P0(), this.f122349V.m158803k1().gender.toString());
        }
        this.f122359i.requestFocus();
        this.f122375y.setVisibility(8);
        ((SignUpDetailsNewAct) this.f78941a).hideInput(this.f122354d);
        m145435r0();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m145413U(String str, String str2, final String str3, View view) {
        zvf0.m220399u(str, ((SignUpDetailsNewAct) this.f78941a).pageId(), vwb.m200311Y("signup_source", str2), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f122349V.m158795F1()));
        if (ilo.INSTANCE.m137017j()) {
            m145412T(str3);
        } else {
            this.f122349V.m158802j1(new Runnable() { // from class: l.bcf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74918a.m145412T(str3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m145414V(TextView textView, int i, KeyEvent keyEvent) {
        if (5 != i) {
            return false;
        }
        ((SignUpDetailsNewAct) this.f78941a).hideInput(this.f122354d);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m145415W(View view, boolean z) {
        if (z) {
            this.f122349V.m158797I1();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m145416X(View view) {
        this.f122349V.m158797I1();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m145417Y(View view, boolean z) {
        if (z) {
            this.f122349V.m158796H1();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m145418Z(View view) {
        this.f122349V.m158796H1();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m145419a0(CharSequence charSequence) {
        this.f122349V.m158803k1().school = charSequence.toString().trim();
        m145441x0(this.f122349V.m158803k1());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m145420b0() {
        this.f122354d.requestFocus();
        act().showInput(this.f122354d, 0);
        this.f122354d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ybf0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f197329a.m145414V(textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m145421c0(SubGender subGender, boolean z) {
        this.f122349V.m158803k1().subGenderOption = subGender == null ? null : subGender.toString();
        this.f122349V.m158803k1().profileShowGender = z;
        m145435r0();
        m145438u0();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m145422d0(String str, View view) {
        zvf0.m220399u("e_clone_signup_add_more_detail", ((SignUpDetailsNewAct) this.f78941a).pageId(), vwb.m200311Y("signup_source", str));
        String str2 = this.f122349V.m158803k1().subGenderOption;
        ilo.INSTANCE.m137019l(this.f78941a, TextUtils.isEmpty(str2) ? null : SubGender.get(str2), this.f122349V.m158803k1().newGender, this.f122349V.m158803k1().profileShowGender, new glo.InterfaceC17113b() { // from class: l.acf0
            @Override // p149l.glo.InterfaceC17113b
            /* JADX INFO: renamed from: a */
            public final void mo95721a(SubGender subGender, boolean z) {
                this.f68796a.m145421c0(subGender, z);
            }
        });
    }

    @Override // p149l.c3f0, p149l.s7m
    public void destroy() {
        m145404K();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m145423e0(String str, View view) {
        zvf0.m220399u("e_profilepage_name_input", ((SignUpDetailsNewAct) this.f78941a).pageId(), vwb.m200311Y("signup_source", str), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f122349V.m158795F1()));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m145424f0(String str, CharSequence charSequence) {
        xvf0.m211279a("e_profilepage_name_input", ((SignUpDetailsNewAct) this.f78941a).pageId(), ((SignUpDetailsNewAct) this.f78941a).getClass().getName(), "signup_source", str, Oauth2AccessToken.KEY_PHONE_NUM, this.f122349V.m158795F1());
        this.f122349V.m158803k1().name = charSequence.toString();
        m145437t0(AccountModule.f16037c.m28305Q0(), this.f122349V.m158803k1().name);
        m145434q0(this.f122355e, yij0.m214934L(this.f122349V.m158803k1().name));
        m145441x0(this.f122349V.m158803k1());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m145425g0(String str) {
        zvf0.m220399u("e_profilepage_birthday_button", ((SignUpDetailsNewAct) this.f78941a).pageId(), vwb.m200311Y("signup_source", str), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f122349V.m158795F1()));
        this.f122349V.m158800h1();
    }

    @Override // p149l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo103522i(String str) {
        m145434q0(this.f122339L, str);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ boolean m145426i0(MenuItem menuItem) {
        zvf0.m220396r("e_prelogin_profile_info_page_feedback", ((SignUpDetailsNewAct) this.f78941a).pageId());
        act().startActivity(WebViewAct.m80165a2(act(), "帮助与反馈", a3e0.m94685a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
        return true;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM145403J = m145403J(layoutInflater, viewGroup);
        this.f122351X = viewM145403J;
        return viewM145403J;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m145427j0(String str, CharSequence charSequence) {
        xvf0.m211279a("e_profilepage_password_input", ((SignUpDetailsNewAct) this.f78941a).pageId(), ((SignUpDetailsNewAct) this.f78941a).getClass().getName(), "signup_source", str, Oauth2AccessToken.KEY_PHONE_NUM, this.f122349V.m158795F1());
        this.f122349V.m158803k1().password = charSequence.toString();
        if (this.f122349V.m158803k1().password.length() >= (IntlCountryCodeController.m28120p() ? 8 : 6)) {
            mo103522i(null);
        }
        m145441x0(this.f122349V.m158803k1());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m145428k0(String str, View view) {
        zvf0.m220399u("e_profilepage_password_input", ((SignUpDetailsNewAct) this.f78941a).pageId(), vwb.m200311Y("signup_source", str), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f122349V.m158795F1()));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ boolean m145429l0(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.m81303a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f122352Y.onClick(this.f122343P);
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m145430m0(CompoundButton compoundButton, boolean z) {
        this.f122350W.refuseSMS = !z;
    }

    /* JADX INFO: renamed from: n0 */
    public void m145431n0(SignUpData signUpData, boolean z, boolean z2, String str) {
        if (!this.f122343P.isActivated()) {
            ((SignUpDetailsNewAct) this.f78941a).progress(R$string.f16227j0);
            signUpData.f38816b1 = z;
            signUpData.f38817b2 = z2;
            signUpData.f38818b3 = false;
            signUpData.f38819b4 = this.f122338K.getVisibility() != 0;
            signUpData.f38820bb = Act.lmdEnd();
            j760<Boolean, Boolean> j760VarM223063b = VLinear.f209129b.m223063b();
            signUpData.tsd1 = j760VarM223063b.f116564a.booleanValue();
            signUpData.tsd2 = j760VarM223063b.f116565b.booleanValue();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(this.f78941a);
            signUpData.others = this.f122350W;
            zvf0.m220399u("e_profilepage_signup_continue_button", ((SignUpDetailsNewAct) this.f78941a).pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f122349V.m158795F1()));
            this.f122349V.m158801i1(signUpData);
            return;
        }
        if (this.f122337J.getVisibility() == 0) {
            ((SignUpDetailsNewAct) this.f78941a).hideInput(this.f122338K);
        }
        if (signUpData.gender == null && signUpData.newGender == null) {
            this.f122375y.setVisibility(0);
        }
        if (signUpData.birthdate == null) {
            zvf0.m220368A("e_profilepage_birthday_empty_alert", ((SignUpDetailsNewAct) this.f78941a).pageId(), vwb.m200311Y("signup_source", str), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f122349V.m158795F1()));
            m145434q0(this.f122358h, ((SignUpDetailsNewAct) this.f78941a).string(R$string.f16242l3));
        }
        if (TextUtils.isEmpty(signUpData.name)) {
            m145434q0(this.f122355e, ((SignUpDetailsNewAct) this.f78941a).string(R$string.f16248m3));
        }
        if (this.f122337J.getVisibility() == 0 && TextUtils.isEmpty(signUpData.password)) {
            mo103522i(((SignUpDetailsNewAct) this.f78941a).string(R$string.f16254n3));
        } else if (this.f122337J.getVisibility() == 0) {
            if (signUpData.password.length() < (IntlCountryCodeController.m28120p() ? 8 : 6)) {
                boolean zM28120p = IntlCountryCodeController.m28120p();
                HoldAct holdact = this.f78941a;
                mo103522i(it6.m138182c(zM28120p ? ((SignUpDetailsNewAct) holdact).string(R$string.f16163Y0) : ((SignUpDetailsNewAct) holdact).string(R$string.f16147V)));
            }
        }
        lsi0.m151578h(R$string.f16271q3);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m145432o0(Menu menu) {
        if (!C17133gp.m127320k()) {
            return false;
        }
        MenuItem menuItemAdd = menu.add(0, q4c0.f152566J, 0, "遇到问题？");
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.obf0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f142909a.m145426i0(menuItem);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public void m145433p0() {
        this.f122357g.setText("");
    }

    /* JADX INFO: renamed from: q0 */
    public void m145434q0(VText vText, String str) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            vText.setText(str);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m145435r0() {
        VFrame vFrame = this.f122360j;
        VImage vImage = this.f122364n;
        ilo iloVar = ilo.INSTANCE;
        m145406M(vFrame, vImage, iloVar.m137015h("male", this.f122349V.m158803k1()));
        m145406M(this.f122365o, this.f122369s, iloVar.m137015h("female", this.f122349V.m158803k1()));
        if (iloVar.m137017j()) {
            m145406M(this.f122370t, this.f122374x, iloVar.m137015h("nonbinary", this.f122349V.m158803k1()));
            m145386N();
        }
        if (NullChecker.m81303a(this.f122349V.m158803k1().birthdate)) {
            this.f122357g.setText(mqi0.f135251c.format(this.f122349V.m158803k1().birthdate));
        }
        if (IntlCountryCodeController.m28116l()) {
            boolean zM137015h = iloVar.m137015h("male", this.f122349V.m158803k1());
            VLinear vLinear = this.f122333F;
            if (zM137015h) {
                vLinear.setVisibility(0);
                if (NullChecker.m81303a(this.f122349V.m158803k1().qualificationType)) {
                    this.f122334G.setText(m145409Q(this.f122349V.m158803k1().qualificationType));
                    boolean zM214932J = yij0.m214932J(this.f122349V.m158803k1().qualificationType);
                    VLinear vLinear2 = this.f122335H;
                    if (zM214932J) {
                        vLinear2.setVisibility(0);
                    } else {
                        vLinear2.setVisibility(8);
                    }
                }
            } else {
                vLinear.setVisibility(8);
                this.f122335H.setVisibility(8);
            }
        }
        xdl0.m208345M0(this.f122331D, c43.m105200b());
        if (this.f122349V.m158803k1().bloodType != null) {
            this.f122332E.setText(c43.m105199a(this.f122349V.m158803k1().bloodType));
        }
        m145441x0(this.f122349V.m158803k1());
    }

    /* JADX INFO: renamed from: s0 */
    public void m145436s0(SignUpData signUpData) {
        if (NullChecker.m81303a(signUpData.name)) {
            this.f122354d.setText(signUpData.name);
            this.f122354d.setSelection(signUpData.name.length());
        }
        if (NullChecker.m81303a(signUpData.password) && this.f122338K.getVisibility() == 0) {
            this.f122338K.setText(signUpData.password);
        }
        m145435r0();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m145437t0(uqd0 uqd0Var, String str) {
        uqd0Var.put(str);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m145438u0() {
        String str = this.f122349V.m158803k1().subGenderOption;
        uqd0 uqd0VarM28300N1 = AccountModule.f16037c.m28300N1();
        if (str == null) {
            str = "";
        }
        uqd0VarM28300N1.put(str);
        AccountModule.f16037c.m28302O1().put(Boolean.valueOf(this.f122349V.m158803k1().profileShowGender));
    }

    /* JADX INFO: renamed from: v0 */
    public void m145439v0() {
        m145434q0(this.f122358h, null);
    }

    /* JADX INFO: renamed from: w0 */
    public void m145440w0() {
        Intent intentNewMainActClearStack = AccountModule.m28132H().newMainActClearStack(act(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        act().startActivity(intentNewMainActClearStack);
        act().lambda$debugItems$19();
        yij0.m214941S(act());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX INFO: renamed from: x0 */
    public final void m145441x0(SignUpData signUpData) {
        boolean z;
        QualificationType qualificationType;
        if (TextUtils.isEmpty(signUpData.name) || this.f122354d.getError() != null || signUpData.birthdate == null || yij0.m214944V().getTime() < signUpData.birthdate.doubleValue() || yij0.m214936N().getTime() >= signUpData.birthdate.doubleValue() || (this.f122337J.getVisibility() == 0 && signUpData.password == null)) {
            z = false;
        } else if (this.f122337J.getVisibility() == 0) {
            if (signUpData.password.length() < (IntlCountryCodeController.m28120p() ? 8 : 6)) {
                z = false;
            } else if ((signUpData.gender != null && signUpData.newGender == null) || ((this.f122333F.getVisibility() == 0 && ((qualificationType = signUpData.qualificationType) == null || TEnum.equals(qualificationType, "unknown_"))) || ((this.f122335H.getVisibility() == 0 && TextUtils.isEmpty(signUpData.school)) || (this.f122331D.getVisibility() == 0 && signUpData.bloodType == null)))) {
                z = false;
            }
        } else {
            z = signUpData.gender != null ? true : true;
        }
        this.f122343P.setActivated(!z);
    }

    /* JADX INFO: renamed from: y0 */
    public void m145442y0(final String str) {
        if (this.f122349V.m158803k1().signUpType == AccountTempApi.SignUpType.nopassword) {
            xdl0.m208344M(this.f122338K, false);
        }
        if (this.f122338K.getVisibility() == 0) {
            this.f122338K.mo28618i(false).subscribe(mkd0.m154955G(new e30() { // from class: l.ccf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80233a.m145427j0(str, (CharSequence) obj);
                }
            }));
            this.f122338K.setOnClickListener(new View.OnClickListener() { // from class: l.dcf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85397a.m145428k0(str, view);
                }
            });
            this.f122338K.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ecf0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return this.f90497a.m145429l0(textView, i, keyEvent);
                }
            });
        }
        if (IntlCountryCodeController.m28113i() || IntlCountryCodeController.m28112h(this.f122349V.m158803k1().countryCode)) {
            if (this.f122350W == null) {
                this.f122350W = OtherSettingsOthers.new_();
            }
            this.f122350W.refuseSMS = true;
            xdl0.m208344M(this.f122340M, true);
            this.f122341N.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.fcf0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f96794a.m145430m0(compoundButton, z);
                }
            });
        }
        this.f122343P.setOnClickListener(this.f122352Y);
        m145407O(this.f122349V.m158803k1());
        m145410R(this.f122349V.m158803k1());
        m145436s0(this.f122349V.m158803k1());
        m145441x0(this.f122349V.m158803k1());
    }
}
