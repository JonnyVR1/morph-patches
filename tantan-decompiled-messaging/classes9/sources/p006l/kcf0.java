package p006l;

import android.content.Context;
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
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.OtherSettingsOthers;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SubGender;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import l.a3e0;
import l.e30;
import l.e51;
import l.it6;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.uqd0;
import l.vwb;
import l.xdl0;
import l.xvf0;
import l.yij0;
import l.zvf0;
import v.VButton;
import v.VCheckBox;
import v.VEditText;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kcf0 extends c3f0<nbf0, SignUpDetailsNewAct> {

    /* JADX INFO: renamed from: A */
    public VText f15695A;

    /* JADX INFO: renamed from: B */
    public VText f15696B;

    /* JADX INFO: renamed from: C */
    public VIcon f15697C;

    /* JADX INFO: renamed from: D */
    public VLinear f15698D;

    /* JADX INFO: renamed from: E */
    public VText f15699E;

    /* JADX INFO: renamed from: F */
    public VLinear f15700F;

    /* JADX INFO: renamed from: G */
    public VText f15701G;

    /* JADX INFO: renamed from: H */
    public VLinear f15702H;

    /* JADX INFO: renamed from: I */
    public VEditText f15703I;

    /* JADX INFO: renamed from: J */
    public VLinear f15704J;

    /* JADX INFO: renamed from: K */
    public VEditText f15705K;

    /* JADX INFO: renamed from: L */
    public VText f15706L;

    /* JADX INFO: renamed from: M */
    public VLinear f15707M;

    /* JADX INFO: renamed from: N */
    public VCheckBox f15708N;

    /* JADX INFO: renamed from: O */
    public VText f15709O;

    /* JADX INFO: renamed from: P */
    public VButton f15710P;

    /* JADX INFO: renamed from: Q */
    public ConstraintLayout f15711Q;

    /* JADX INFO: renamed from: R */
    public VImage f15712R;

    /* JADX INFO: renamed from: S */
    public VImage f15713S;

    /* JADX INFO: renamed from: T */
    public VText f15714T;

    /* JADX INFO: renamed from: U */
    public VText f15715U;

    /* JADX INFO: renamed from: V */
    public nbf0 f15716V;

    /* JADX INFO: renamed from: W */
    public OtherSettingsOthers f15717W;

    /* JADX INFO: renamed from: X */
    public View f15718X;

    /* JADX INFO: renamed from: Y */
    public View.OnClickListener f15719Y;

    /* JADX INFO: renamed from: c */
    public VText f15720c;

    /* JADX INFO: renamed from: d */
    public VEditText f15721d;

    /* JADX INFO: renamed from: e */
    public VText f15722e;

    /* JADX INFO: renamed from: f */
    public VText f15723f;

    /* JADX INFO: renamed from: g */
    public VText f15724g;

    /* JADX INFO: renamed from: h */
    public VText f15725h;

    /* JADX INFO: renamed from: i */
    public VLinear f15726i;

    /* JADX INFO: renamed from: j */
    public VFrame f15727j;

    /* JADX INFO: renamed from: k */
    public VLinear f15728k;

    /* JADX INFO: renamed from: l */
    public VIcon f15729l;

    /* JADX INFO: renamed from: m */
    public VText f15730m;

    /* JADX INFO: renamed from: n */
    public VImage f15731n;

    /* JADX INFO: renamed from: o */
    public VFrame f15732o;

    /* JADX INFO: renamed from: p */
    public VLinear f15733p;

    /* JADX INFO: renamed from: q */
    public VIcon f15734q;

    /* JADX INFO: renamed from: r */
    public VText f15735r;

    /* JADX INFO: renamed from: s */
    public VImage f15736s;

    /* JADX INFO: renamed from: t */
    public VFrame f15737t;

    /* JADX INFO: renamed from: u */
    public VLinear f15738u;

    /* JADX INFO: renamed from: v */
    public VIcon f15739v;

    /* JADX INFO: renamed from: w */
    public VText f15740w;

    /* JADX INFO: renamed from: x */
    public VImage f15741x;

    /* JADX INFO: renamed from: y */
    public VText f15742y;

    /* JADX INFO: renamed from: z */
    public ConstraintLayout f15743z;

    public kcf0(@NonNull SignUpDetailsNewAct signUpDetailsNewAct) {
        super(signUpDetailsNewAct);
        this.f15719Y = new View.OnClickListener() { // from class: l.zbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28698a.m18016h0(view);
            }
        };
    }

    /* JADX INFO: renamed from: N */
    private void m18015N() {
        boolean z = false;
        xdl0.M(this.f15743z, this.f15716V.m20034k1().newGender != null);
        if (this.f15716V.m20034k1().newGender != null) {
            zvf0.x("e_clone_signup_add_more_detail", ((SignUpDetailsNewAct) this.f9323a).pageId());
        }
        if (this.f15716V.m20034k1().subGenderOption != null && this.f15716V.m20034k1().newGender != null) {
            z = true;
        }
        this.f15695A.setTextColor(((SignUpDetailsNewAct) this.f9323a).getColor(z ? u0c0.f22395b : u0c0.f22398e));
        xdl0.M(this.f15696B, !z);
        this.f15695A.setText(z ? ilo.INSTANCE.m16733d(this.f15716V.m20034k1().newGender, this.f15716V.m20034k1().subGenderOption) : ((SignUpDetailsNewAct) this.f9323a).getText(R$string.f148X1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m18016h0(View view) {
        this.f15716V.m20023C1();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m18023q(Runnable runnable, View view, boolean z) {
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m18031A3(final String str) {
        xdl0.M(this.f15711Q, false);
        xdl0.M(this.f15712R, false);
        xdl0.M(this.f15714T, false);
        xdl0.M(this.f15737t, ilo.INSTANCE.m16739j());
        e51.G(new Runnable() { // from class: l.gcf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13213a.m18049b0();
            }
        });
        this.f15723f.setText(((SignUpDetailsNewAct) this.f9323a).string(R$string.f44C2) + ((SignUpDetailsNewAct) this.f9323a).string(R$string.f120R3));
        this.f15710P.setText(R$string.f222k0);
        m18037P(this.f15727j, "e_profilepage_male_button", str, "male");
        m18037P(this.f15732o, "e_profilepage_female_button", str, "female");
        m18037P(this.f15737t, "e_profilepage_nonbinary_button", str, "nonbinary");
        xdl0.E0(this.f15743z, new View.OnClickListener() { // from class: l.jcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15112a.m18051d0(str, view);
            }
        });
        this.f15721d.setOnClickListener(new View.OnClickListener() { // from class: l.pbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18667a.m18052e0(str, view);
            }
        });
        this.f15721d.i(false).subscribe(mkd0.G(new e30() { // from class: l.qbf0
            public final void call(Object obj) {
                this.f19702a.m18053f0(str, (CharSequence) obj);
            }
        }));
        final Runnable runnable = new Runnable() { // from class: l.rbf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20475a.m18054g0(str);
            }
        };
        this.f15724g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.sbf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                kcf0.m18023q(runnable, view, z);
            }
        });
        this.f15724g.setOnClickListener(new View.OnClickListener() { // from class: l.tbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        this.f15701G.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ubf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f23478a.m18044W(view, z);
            }
        });
        this.f15701G.setOnClickListener(new View.OnClickListener() { // from class: l.vbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24247a.m18045X(view);
            }
        });
        this.f15699E.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.wbf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f25079a.m18046Y(view, z);
            }
        });
        this.f15699E.setOnClickListener(new View.OnClickListener() { // from class: l.hcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13812a.m18047Z(view);
            }
        });
        this.f15703I.i(false).subscribe(mkd0.G(new e30() { // from class: l.icf0
            public final void call(Object obj) {
                this.f14358a.m18048a0((CharSequence) obj);
            }
        }));
        m18071y0(str);
    }

    /* JADX INFO: renamed from: J */
    public View m18032J(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lcf0.m18648b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public void m18033K() {
        lcf0.m18649c(this);
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo476i1(nbf0 nbf0Var) {
        this.f15716V = nbf0Var;
    }

    /* JADX INFO: renamed from: M */
    public final void m18035M(ViewGroup viewGroup, View view, boolean z) {
        viewGroup.setSelected(z);
        xdl0.M(view, z);
    }

    /* JADX INFO: renamed from: O */
    public final void m18036O(SignUpData signUpData) {
        if (signUpData.signUpType == AccountTempApi.SignUpType.facebook) {
            this.f15704J.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m18037P(VFrame vFrame, final String str, final String str2, final String str3) {
        vFrame.setOnClickListener(new View.OnClickListener() { // from class: l.xbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27440a.m18042U(str, str2, str3, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public String m18038Q(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return act().getResources().getString(R$string.f109P2);
            case "BACHELOR":
                return act().getResources().getString(R$string.f89L2);
            case "LOWER_PRIMARY":
                return act().getResources().getString(R$string.f104O2);
            case "HIGH_SCHOOL":
                return act().getResources().getString(R$string.f99N2);
            case "VOCATIONAL_SCHOOL":
                return act().getResources().getString(R$string.f119R2);
            case "UPPER_PRIMARY":
                return act().getResources().getString(R$string.f114Q2);
            case "DOCTOR":
                return act().getResources().getString(R$string.f94M2);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m18039R(SignUpData signUpData) {
        if (signUpData.signUpType == AccountTempApi.SignUpType.google) {
            this.f15704J.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m18041T(String str) {
        if (this.f15716V.m20034k1().newGender != IntlGender.get(str)) {
            this.f15716V.m20034k1().subGenderOption = null;
            m18067u0();
        }
        boolean zM16739j = ilo.INSTANCE.m16739j();
        nbf0 nbf0Var = this.f15716V;
        if (zM16739j) {
            nbf0Var.m20034k1().newGender = IntlGender.get(str);
            m18066t0(AccountModule.f26c.m198P0(), this.f15716V.m20034k1().newGender.toString());
        } else {
            nbf0Var.m20034k1().gender = Gender.get(str);
            m18066t0(AccountModule.f26c.m198P0(), this.f15716V.m20034k1().gender.toString());
        }
        this.f15726i.requestFocus();
        this.f15742y.setVisibility(8);
        ((SignUpDetailsNewAct) this.f9323a).hideInput(this.f15721d);
        m18064r0();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m18042U(String str, String str2, final String str3, View view) {
        zvf0.u(str, ((SignUpDetailsNewAct) this.f9323a).pageId(), new j760[]{vwb.Y("signup_source", str2), vwb.Y("phone_num", this.f15716V.m20026F1())});
        if (ilo.INSTANCE.m16739j()) {
            m18041T(str3);
        } else {
            this.f15716V.m20033j1(new Runnable() { // from class: l.bcf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8816a.m18041T(str3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m18043V(TextView textView, int i, KeyEvent keyEvent) {
        if (5 != i) {
            return false;
        }
        ((SignUpDetailsNewAct) this.f9323a).hideInput(this.f15721d);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m18044W(View view, boolean z) {
        if (z) {
            this.f15716V.m20028I1();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m18045X(View view) {
        this.f15716V.m20028I1();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m18046Y(View view, boolean z) {
        if (z) {
            this.f15716V.m20027H1();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m18047Z(View view) {
        this.f15716V.m20027H1();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m18048a0(CharSequence charSequence) {
        this.f15716V.m20034k1().school = charSequence.toString().trim();
        m18070x0(this.f15716V.m20034k1());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m18049b0() {
        this.f15721d.requestFocus();
        act().showInput(this.f15721d, 0);
        this.f15721d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ybf0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f28108a.m18043V(textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m18050c0(SubGender subGender, boolean z) {
        this.f15716V.m20034k1().subGenderOption = subGender == null ? null : subGender.toString();
        this.f15716V.m20034k1().profileShowGender = z;
        m18064r0();
        m18067u0();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m18051d0(String str, View view) {
        zvf0.u("e_clone_signup_add_more_detail", ((SignUpDetailsNewAct) this.f9323a).pageId(), new j760[]{vwb.Y("signup_source", str)});
        String str2 = this.f15716V.m20034k1().subGenderOption;
        ilo.INSTANCE.m16741l(this.f9323a, TextUtils.isEmpty(str2) ? null : SubGender.get(str2), this.f15716V.m20034k1().newGender, this.f15716V.m20034k1().profileShowGender, new glo.InterfaceC0767b() { // from class: l.acf0
            @Override // p006l.glo.InterfaceC0767b
            /* JADX INFO: renamed from: a */
            public final void mo11808a(SubGender subGender, boolean z) {
                this.f8211a.m18050c0(subGender, z);
            }
        });
    }

    @Override // p006l.c3f0
    public void destroy() {
        m18033K();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m18052e0(String str, View view) {
        zvf0.u("e_profilepage_name_input", ((SignUpDetailsNewAct) this.f9323a).pageId(), new j760[]{vwb.Y("signup_source", str), vwb.Y("phone_num", this.f15716V.m20026F1())});
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m18053f0(String str, CharSequence charSequence) {
        xvf0.a("e_profilepage_name_input", ((SignUpDetailsNewAct) this.f9323a).pageId(), ((SignUpDetailsNewAct) this.f9323a).getClass().getName(), new Object[]{"signup_source", str, "phone_num", this.f15716V.m20026F1()});
        this.f15716V.m20034k1().name = charSequence.toString();
        m18066t0(AccountModule.f26c.m200Q0(), this.f15716V.m20034k1().name);
        m18063q0(this.f15722e, yij0.L(this.f15716V.m20034k1().name));
        m18070x0(this.f15716V.m20034k1());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m18054g0(String str) {
        zvf0.u("e_profilepage_birthday_button", ((SignUpDetailsNewAct) this.f9323a).pageId(), new j760[]{vwb.Y("signup_source", str), vwb.Y("phone_num", this.f15716V.m20026F1())});
        this.f15716V.m20031h1();
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo12892i(String str) {
        m18063q0(this.f15706L, str);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ boolean m18055i0(MenuItem menuItem) {
        zvf0.r("e_prelogin_profile_info_page_feedback", ((SignUpDetailsNewAct) this.f9323a).pageId());
        act().startActivity(WebViewAct.a2(act(), "帮助与反馈", a3e0.a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM18032J = m18032J(layoutInflater, viewGroup);
        this.f15718X = viewM18032J;
        return viewM18032J;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m18056j0(String str, CharSequence charSequence) {
        xvf0.a("e_profilepage_password_input", ((SignUpDetailsNewAct) this.f9323a).pageId(), ((SignUpDetailsNewAct) this.f9323a).getClass().getName(), new Object[]{"signup_source", str, "phone_num", this.f15716V.m20026F1()});
        this.f15716V.m20034k1().password = charSequence.toString();
        if (this.f15716V.m20034k1().password.length() >= (IntlCountryCodeController.m15p() ? 8 : 6)) {
            mo12892i(null);
        }
        m18070x0(this.f15716V.m20034k1());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m18057k0(String str, View view) {
        zvf0.u("e_profilepage_password_input", ((SignUpDetailsNewAct) this.f9323a).pageId(), new j760[]{vwb.Y("signup_source", str), vwb.Y("phone_num", this.f15716V.m20026F1())});
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ boolean m18058l0(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f15719Y.onClick(this.f15710P);
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m18059m0(CompoundButton compoundButton, boolean z) {
        this.f15717W.refuseSMS = !z;
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: n0 */
    public void m18060n0(SignUpData signUpData, boolean z, boolean z2, String str) {
        if (!this.f15710P.isActivated()) {
            ((SignUpDetailsNewAct) this.f9323a).progress(R$string.f216j0);
            signUpData.b1 = z;
            signUpData.b2 = z2;
            signUpData.b3 = false;
            signUpData.b4 = this.f15705K.getVisibility() != 0;
            signUpData.bb = Act.lmdEnd();
            j760 j760VarB = VLinear.b.b();
            signUpData.tsd1 = ((Boolean) j760VarB.a).booleanValue();
            signUpData.tsd2 = ((Boolean) j760VarB.b).booleanValue();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID((Context) this.f9323a);
            signUpData.others = this.f15717W;
            zvf0.u("e_profilepage_signup_continue_button", ((SignUpDetailsNewAct) this.f9323a).pageId(), new j760[]{vwb.Y("phone_num", this.f15716V.m20026F1())});
            this.f15716V.m20032i1(signUpData);
            return;
        }
        if (this.f15704J.getVisibility() == 0) {
            ((SignUpDetailsNewAct) this.f9323a).hideInput(this.f15705K);
        }
        if (signUpData.gender == null && signUpData.newGender == null) {
            this.f15742y.setVisibility(0);
        }
        if (signUpData.birthdate == null) {
            zvf0.A("e_profilepage_birthday_empty_alert", ((SignUpDetailsNewAct) this.f9323a).pageId(), new j760[]{vwb.Y("signup_source", str), vwb.Y("phone_num", this.f15716V.m20026F1())});
            m18063q0(this.f15725h, ((SignUpDetailsNewAct) this.f9323a).string(R$string.f231l3));
        }
        if (TextUtils.isEmpty(signUpData.name)) {
            m18063q0(this.f15722e, ((SignUpDetailsNewAct) this.f9323a).string(R$string.f237m3));
        }
        if (this.f15704J.getVisibility() == 0 && TextUtils.isEmpty(signUpData.password)) {
            mo12892i(((SignUpDetailsNewAct) this.f9323a).string(R$string.f243n3));
        } else if (this.f15704J.getVisibility() == 0) {
            if (signUpData.password.length() < (IntlCountryCodeController.m15p() ? 8 : 6)) {
                boolean zM15p = IntlCountryCodeController.m15p();
                HoldAct holdact = this.f9323a;
                mo12892i(it6.c(zM15p ? ((SignUpDetailsNewAct) holdact).string(R$string.f152Y0) : ((SignUpDetailsNewAct) holdact).string(R$string.f136V)));
            }
        }
        lsi0.h(R$string.f260q3);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m18061o0(Menu menu) {
        if (!C0775gp.m15904k()) {
            return false;
        }
        MenuItem menuItemAdd = menu.add(0, q4c0.f19576J, 0, "遇到问题？");
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.obf0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f18135a.m18055i0(menuItem);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public void m18062p0() {
        this.f15724g.setText("");
    }

    /* JADX INFO: renamed from: q0 */
    public void m18063q0(VText vText, String str) {
        if (TextUtils.isEmpty(str)) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, true);
            vText.setText(str);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m18064r0() {
        VFrame vFrame = this.f15727j;
        VImage vImage = this.f15731n;
        ilo iloVar = ilo.INSTANCE;
        m18035M(vFrame, vImage, iloVar.m16737h("male", this.f15716V.m20034k1()));
        m18035M(this.f15732o, this.f15736s, iloVar.m16737h("female", this.f15716V.m20034k1()));
        if (iloVar.m16739j()) {
            m18035M(this.f15737t, this.f15741x, iloVar.m16737h("nonbinary", this.f15716V.m20034k1()));
            m18015N();
        }
        if (NullChecker.a(this.f15716V.m20034k1().birthdate)) {
            this.f15724g.setText(mqi0.c.format(this.f15716V.m20034k1().birthdate));
        }
        if (IntlCountryCodeController.m11l()) {
            boolean zM16737h = iloVar.m16737h("male", this.f15716V.m20034k1());
            VLinear vLinear = this.f15700F;
            if (zM16737h) {
                vLinear.setVisibility(0);
                if (NullChecker.a(this.f15716V.m20034k1().qualificationType)) {
                    this.f15701G.setText(m18038Q(this.f15716V.m20034k1().qualificationType));
                    boolean zJ = yij0.J(this.f15716V.m20034k1().qualificationType);
                    VLinear vLinear2 = this.f15702H;
                    if (zJ) {
                        vLinear2.setVisibility(0);
                    } else {
                        vLinear2.setVisibility(8);
                    }
                }
            } else {
                vLinear.setVisibility(8);
                this.f15702H.setVisibility(8);
            }
        }
        xdl0.M0(this.f15698D, c43.m13144b());
        if (this.f15716V.m20034k1().bloodType != null) {
            this.f15699E.setText(c43.m13143a(this.f15716V.m20034k1().bloodType));
        }
        m18070x0(this.f15716V.m20034k1());
    }

    /* JADX INFO: renamed from: s0 */
    public void m18065s0(SignUpData signUpData) {
        if (NullChecker.a(signUpData.name)) {
            this.f15721d.setText(signUpData.name);
            this.f15721d.setSelection(signUpData.name.length());
        }
        if (NullChecker.a(signUpData.password) && this.f15705K.getVisibility() == 0) {
            this.f15705K.setText(signUpData.password);
        }
        m18064r0();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m18066t0(uqd0 uqd0Var, String str) {
        uqd0Var.put(str);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m18067u0() {
        String str = this.f15716V.m20034k1().subGenderOption;
        uqd0 uqd0VarM195N1 = AccountModule.f26c.m195N1();
        if (str == null) {
            str = "";
        }
        uqd0VarM195N1.put(str);
        AccountModule.f26c.m197O1().put(Boolean.valueOf(this.f15716V.m20034k1().profileShowGender));
    }

    /* JADX INFO: renamed from: v0 */
    public void m18068v0() {
        m18063q0(this.f15725h, null);
    }

    /* JADX INFO: renamed from: w0 */
    public void m18069w0() {
        Intent intentNewMainActClearStack = AccountModule.m27H().newMainActClearStack(act(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        act().startActivity(intentNewMainActClearStack);
        act().finish();
        yij0.S(act());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX INFO: renamed from: x0 */
    public final void m18070x0(SignUpData signUpData) {
        boolean z;
        QualificationType qualificationType;
        if (TextUtils.isEmpty(signUpData.name) || this.f15721d.getError() != null || signUpData.birthdate == null || yij0.V().getTime() < signUpData.birthdate.doubleValue() || yij0.N().getTime() >= signUpData.birthdate.doubleValue() || (this.f15704J.getVisibility() == 0 && signUpData.password == null)) {
            z = false;
        } else if (this.f15704J.getVisibility() == 0) {
            if (signUpData.password.length() < (IntlCountryCodeController.m15p() ? 8 : 6)) {
                z = false;
            } else if ((signUpData.gender != null && signUpData.newGender == null) || ((this.f15700F.getVisibility() == 0 && ((qualificationType = signUpData.qualificationType) == null || TEnum.equals(qualificationType, "unknown_"))) || ((this.f15702H.getVisibility() == 0 && TextUtils.isEmpty(signUpData.school)) || (this.f15698D.getVisibility() == 0 && signUpData.bloodType == null)))) {
                z = false;
            }
        } else {
            z = signUpData.gender != null ? true : true;
        }
        this.f15710P.setActivated(!z);
    }

    /* JADX INFO: renamed from: y0 */
    public void m18071y0(final String str) {
        if (this.f15716V.m20034k1().signUpType == AccountTempApi.SignUpType.nopassword) {
            xdl0.M(this.f15705K, false);
        }
        if (this.f15705K.getVisibility() == 0) {
            this.f15705K.i(false).subscribe(mkd0.G(new e30() { // from class: l.ccf0
                public final void call(Object obj) {
                    this.f9589a.m18056j0(str, (CharSequence) obj);
                }
            }));
            this.f15705K.setOnClickListener(new View.OnClickListener() { // from class: l.dcf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10292a.m18057k0(str, view);
                }
            });
            this.f15705K.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ecf0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return this.f11077a.m18058l0(textView, i, keyEvent);
                }
            });
        }
        if (IntlCountryCodeController.m8i() || IntlCountryCodeController.m7h(this.f15716V.m20034k1().countryCode)) {
            if (this.f15717W == null) {
                this.f15717W = OtherSettingsOthers.new_();
            }
            this.f15717W.refuseSMS = true;
            xdl0.M(this.f15707M, true);
            this.f15708N.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.fcf0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f12649a.m18059m0(compoundButton, z);
                }
            });
        }
        this.f15710P.setOnClickListener(this.f15719Y);
        m18036O(this.f15716V.m20034k1());
        m18039R(this.f15716V.m20034k1());
        m18065s0(this.f15716V.m20034k1());
        m18070x0(this.f15716V.m20034k1());
    }
}
