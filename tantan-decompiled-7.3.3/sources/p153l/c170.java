package p153l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.CaptchaData;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import org.slf4j.Marker;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class c170 extends jbf0<e070, PhoneNumberLoginOptAct> {

    /* JADX INFO: renamed from: A */
    public VText f79339A;

    /* JADX INFO: renamed from: B */
    public boolean f79340B;

    /* JADX INFO: renamed from: C */
    public View f79341C;

    /* JADX INFO: renamed from: D */
    public boolean f79342D;

    /* JADX INFO: renamed from: E */
    public boolean f79343E;

    /* JADX INFO: renamed from: F */
    public boolean f79344F;

    /* JADX INFO: renamed from: G */
    public boolean f79345G;

    /* JADX INFO: renamed from: H */
    public SpannableString f79346H;

    /* JADX INFO: renamed from: I */
    public ClickableSpan f79347I;

    /* JADX INFO: renamed from: J */
    public x20 f79348J;

    /* JADX INFO: renamed from: c */
    public VScroll f79349c;

    /* JADX INFO: renamed from: d */
    public VText f79350d;

    /* JADX INFO: renamed from: e */
    public VText f79351e;

    /* JADX INFO: renamed from: f */
    public VLinear f79352f;

    /* JADX INFO: renamed from: g */
    public VText f79353g;

    /* JADX INFO: renamed from: h */
    public VEditText f79354h;

    /* JADX INFO: renamed from: i */
    public VImage f79355i;

    /* JADX INFO: renamed from: j */
    public VLinear f79356j;

    /* JADX INFO: renamed from: k */
    public VEditText f79357k;

    /* JADX INFO: renamed from: l */
    public VImage f79358l;

    /* JADX INFO: renamed from: m */
    public VImage f79359m;

    /* JADX INFO: renamed from: n */
    public VText f79360n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f79361o;

    /* JADX INFO: renamed from: p */
    public VEditText f79362p;

    /* JADX INFO: renamed from: q */
    public VImage f79363q;

    /* JADX INFO: renamed from: r */
    public VFrame f79364r;

    /* JADX INFO: renamed from: s */
    public VText f79365s;

    /* JADX INFO: renamed from: t */
    public VText f79366t;

    /* JADX INFO: renamed from: u */
    public AnimEffectPlayer f79367u;

    /* JADX INFO: renamed from: v */
    public VText f79368v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f79369w;

    /* JADX INFO: renamed from: x */
    public VImage f79370x;

    /* JADX INFO: renamed from: y */
    public VImage f79371y;

    /* JADX INFO: renamed from: z */
    public VText f79372z;

    /* JADX INFO: renamed from: l.c170$a */
    public class C16161a extends SVGAAnimListenerAdapter {
        public C16161a() {
        }
    }

    public c170(@NonNull PhoneNumberLoginOptAct phoneNumberLoginOptAct) {
        super(phoneNumberLoginOptAct);
        this.f79340B = false;
        this.f79342D = false;
        this.f79343E = true;
        this.f79344F = false;
        this.f79345G = false;
    }

    /* JADX INFO: renamed from: A0 */
    private void m107531A0() {
        if (this.f79340B) {
            bnl0.m105524M(this.f79352f, false);
            bnl0.m105524M(this.f79356j, true);
            this.f79360n.setVisibility(0);
            this.f79351e.setText(R$string.f16875W3);
            return;
        }
        this.f79360n.setVisibility(8);
        bnl0.m105525M0(this.f79352f, true);
        bnl0.m105524M(this.f79356j, false);
        this.f79351e.setText(R$string.f16870V3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void m107600r0() {
        ((PhoneNumberLoginOptAct) this.f119872a).hideInput();
        ((e070) this.f119873b).m118819J1(null);
        bnl0.m105525M0(this.f79366t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m107542M() {
        boolean z = false;
        if (this.f79340B) {
            if (!TextUtils.isEmpty(this.f79357k.getText()) && this.f79357k.getText().length() >= 6 && !TextUtils.isEmpty(this.f79354h.getText())) {
                if (e070.m118810n1(this.f79354h.getText().toString(), m107581P() == 86)) {
                    z = true;
                }
            }
            this.f79368v.setText(R$string.f16978o2);
        } else {
            if ((!this.f79344F || this.f79362p.getText().length() >= 4) && !TextUtils.isEmpty(this.f79354h.getText())) {
                if (e070.m118810n1(this.f79354h.getText().toString(), m107581P() == 86)) {
                    z = true;
                }
            }
            this.f79368v.setText(R$string.f16903c);
        }
        this.f79368v.setEnabled(z);
        VText vText = this.f79368v;
        if (z) {
            vText.setBackgroundResource(bbc0.f75815K1);
        } else {
            vText.setBackgroundResource(bbc0.f75917t1);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m107543N() {
        ((PhoneNumberLoginOptAct) this.f119872a).postDelayed(new Runnable() { // from class: l.x070
            @Override // java.lang.Runnable
            public final void run() {
                this.f191872a.m107545a0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: W */
    private void m107544W() {
        String string;
        int iIndexOf;
        this.f79357k.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.f79357k.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.b170
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f74326a.m107547e0(view, z);
            }
        });
        this.f79357k.setOnClickListener(new View.OnClickListener() { // from class: l.g070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101614a.m107548f0(view);
            }
        });
        bnl0.m105524M(this.f79358l, false);
        this.f79357k.mo29617i(false).subscribe(psd0.m173596G(new y20() { // from class: l.h070
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107274a.m107549g0((CharSequence) obj);
            }
        }));
        bnl0.m105509E0(this.f79358l, new View.OnClickListener() { // from class: l.i070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112338a.m107550h0(view);
            }
        });
        bnl0.m105509E0(this.f79359m, new View.OnClickListener() { // from class: l.j070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117790a.m107551i0(view);
            }
        });
        this.f79360n.setText(R$string.f17020w3);
        if (!NullChecker.m82488c(this.f79360n, SchemeKey.account, CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(this.f79360n.getText()) || (iIndexOf = (string = this.f79360n.getText().toString()).indexOf(((PhoneNumberLoginOptAct) this.f119872a).string(R$string.f17025x3))) < 0) {
            return;
        }
        this.f79346H = new SpannableString(string);
        this.f79348J = new x20() { // from class: l.k070
            @Override // p153l.x20
            public final void call() {
                this.f123370a.m107592d0();
            }
        };
        this.f79347I = gsj0.m132058b(this.f79360n, ((PhoneNumberLoginOptAct) this.f119872a).string(R$string.f17025x3), this.f79346H, iIndexOf, this.f79348J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m107545a0() {
        int measuredHeight = (((PhoneNumberLoginOptAct) this.f119872a).getWindow().getDecorView().getMeasuredHeight() - this.f79369w.getMeasuredHeight()) - this.f79349c.getHeight();
        if (measuredHeight > 0) {
            this.f79349c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m107546c0(View view) {
        m107566w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m107547e0(View view, boolean z) {
        if (z) {
            i4g0.m138520r("e_password_input", ((PhoneNumberLoginOptAct) this.f119872a).pageId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m107548f0(View view) {
        i4g0.m138520r("e_password_input", ((PhoneNumberLoginOptAct) this.f119872a).pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m107549g0(CharSequence charSequence) {
        bnl0.m105524M(this.f79358l, charSequence.length() > 0);
        i4g0.m138524v("e_password_input", ((PhoneNumberLoginOptAct) this.f119872a).pageId(), new pf60[0]);
        m107542M();
        if (charSequence.length() > 0) {
            mo107593i(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m107550h0(View view) {
        this.f79357k.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m107551i0(View view) {
        boolean z = this.f79343E;
        this.f79343E = !z;
        this.f79359m.setImageResource(!z ? bbc0.f75884i1 : bbc0.f75887j1);
        this.f79357k.setTransformationMethod(this.f79343E ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
        VEditText vEditText = this.f79357k;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m107557n0(Boolean bool) {
        if (bool.booleanValue()) {
            m107543N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m107558o0(View view) {
        if (!this.f79340B) {
            m107606y0(view);
        } else {
            ((e070) this.f119873b).m118822O1();
            this.f79340B = !this.f79340B;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m107560p0(View view) {
        ((PhoneNumberLoginOptAct) this.f119872a).onBackPressed();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX INFO: renamed from: w0 */
    private void m107566w0() {
        boolean z;
        if (TextUtils.isEmpty(this.f79354h.getText())) {
            z = false;
        } else {
            if (e070.m118810n1(this.f79354h.getText().toString(), m107581P() == 86)) {
                z = true;
            } else {
                z = false;
            }
        }
        i4g0.m138523u("e_password_verifypage_signin_button", ((PhoneNumberLoginOptAct) this.f119872a).pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, m107583R()), jyb.m147494Y("code_password_type", this.f79340B ? SignInGrantType.password : "code"));
        if (this.f79340B) {
            boolean z2 = !TextUtils.isEmpty(this.f79357k.getText()) && this.f79357k.getText().length() >= 6;
            if (!z) {
                o1j0.m165634h(R$string.f16886Z);
                return;
            } else if (z2) {
                ((e070) this.f119873b).m118823P1();
                return;
            } else {
                o1j0.m165634h(R$string.f16854S2);
                return;
            }
        }
        if (l51.m152882B(m107584S())) {
            m107542M();
            bnl0.m105524M(this.f79361o, false);
            ((e070) this.f119873b).m118822O1();
            return;
        }
        if (!e070.m118810n1(m107583R(), m107581P() == 86)) {
            o1j0.m165634h(R$string.f16886Z);
        } else if (m107589Y() || ((e070) this.f119873b).m118825o1()) {
            m107600r0();
        } else {
            ((e070) this.f119873b).m118824Q1(m107581P(), m107583R(), new x20() { // from class: l.r070
                @Override // p153l.x20
                public final void call() {
                    this.f160589a.m107598q0();
                }
            }, new x20() { // from class: l.s070
                @Override // p153l.x20
                public final void call() {
                    this.f165666a.m107600r0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m107570B0() {
        m144219d(this.f79353g, this.f79354h);
    }

    /* JADX INFO: renamed from: E0 */
    public void m107571E0(CaptchaData captchaData) {
        bnl0.m105525M0(this.f79361o, true);
        this.f79342D = true;
        this.f79362p.setText("");
        this.f79344F = true;
        m107542M();
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(Constants.SEPARATOR_COMMA)[1], 0);
            this.f79363q.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            this.f79363q.setImageBitmap(null);
        }
        l51.m152887G(new Runnable() { // from class: l.v070
            @Override // java.lang.Runnable
            public final void run() {
                this.f181839a.m107602t0();
            }
        });
        boolean z = this.f79340B;
        if (z) {
            m107606y0(null);
        } else {
            this.f79340B = !z;
            m107606y0(null);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m107572G0(Throwable th, String str) {
        if (th instanceof TantanException.Client.AccountService) {
            bnl0.m105525M0(this.f79366t, true);
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f79366t.setText(R$string.f16886Z);
                return true;
            }
            if (i == 400114) {
                this.f79366t.setText(R$string.f16892a0);
                this.f79363q.setImageBitmap(null);
                ((e070) this.f119873b).m118820L1();
                return true;
            }
            if (i == 403000) {
                bnl0.m105525M0(this.f79366t, false);
                C20299tf.m190906b(th);
                return true;
            }
            switch (i) {
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    this.f79366t.setText(R$string.f16854S2);
                    return true;
                case 40013:
                    this.f79366t.setText(R$string.f16881Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f79366t.setText(R$string.f16892a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f79366t.setText(R$string.f16876X);
                    return true;
                default:
                    bnl0.m105525M0(this.f79366t, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public void m107573H0() {
        m107606y0(null);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m107574I0() {
        this.f79353g.setOnClickListener(new View.OnClickListener() { // from class: l.y070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196950a.m107604v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public void m107575J0() {
        this.f79345G = true;
        this.f79367u.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C16161a());
    }

    /* JADX INFO: renamed from: K0 */
    public void m107576K0() {
        this.f79345G = false;
        this.f79367u.stopAnimCompletely();
    }

    /* JADX INFO: renamed from: L */
    public View m107577L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d170.m113507b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L0 */
    public void m107578L0() {
        boolean zEquals = "+86".equals(this.f79353g.getText().toString());
        VEditText vEditText = this.f79354h;
        if (!zEquals) {
            vEditText.setFilters(new InputFilter[0]);
            return;
        }
        vEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
        String string = this.f79354h.getText().toString();
        if (string.length() > 11) {
            this.f79354h.setText(string.substring(0, 11));
            this.f79354h.setSelection(11);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m107579M0() {
        m107576K0();
    }

    /* JADX INFO: renamed from: O */
    public String m107580O() {
        return this.f79362p.getText().toString();
    }

    /* JADX INFO: renamed from: P */
    public int m107581P() {
        return (!NullChecker.m82488c(this.f79353g, SchemeKey.account, CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(this.f79353g.getText())) ? nsb.f143476d.get(0).f143479b : Integer.parseInt(this.f79353g.getText().toString().substring(1));
    }

    /* JADX INFO: renamed from: Q */
    public String m107582Q() {
        return this.f79357k.getText().toString();
    }

    /* JADX INFO: renamed from: R */
    public String m107583R() {
        return bsj0.m106255M(this.f79354h);
    }

    /* JADX INFO: renamed from: S */
    public String m107584S() {
        return "account_sign_" + m107581P() + m107583R();
    }

    /* JADX INFO: renamed from: T */
    public void m107585T() {
        this.f79362p.addTextChangedListener(new C16162b());
        bnl0.m105509E0(this.f79363q, new View.OnClickListener() { // from class: l.a170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67799a.m107591b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void m107586U() {
        bnl0.m105509E0(this.f79368v, new View.OnClickListener() { // from class: l.w070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186545a.m107546c0(view);
            }
        });
        m107542M();
    }

    /* JADX INFO: renamed from: V */
    public void m107587V() {
        boolean zM82486a = NullChecker.m82486a(WelcomeAct.f17778h);
        VText vText = this.f79353g;
        if (zM82486a) {
            vText.setText(WelcomeAct.f17778h);
        } else {
            vText.setText(Marker.ANY_NON_NULL_MARKER + nsb.f143476d.get(0).f143479b);
        }
        m107578L0();
        m107574I0();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: X */
    public void m107588X() {
        this.f79354h.mo29617i(false).subscribe(psd0.m173596G(new y20() { // from class: l.l070
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129545a.m107607z0((CharSequence) obj);
            }
        }));
        this.f79354h.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.m070
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f134298a.m107594j0(view, z);
            }
        });
        this.f79354h.setOnClickListener(new View.OnClickListener() { // from class: l.n070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139592a.m107595k0(view);
            }
        });
        if (NullChecker.m82486a(WelcomeAct.f17777g)) {
            this.f79354h.setText(WelcomeAct.f17777g);
        }
        l51.m152887G(new Runnable() { // from class: l.o070
            @Override // java.lang.Runnable
            public final void run() {
                this.f144501a.m107596l0();
            }
        });
        bnl0.m105524M(this.f79355i, false);
        bnl0.m105509E0(this.f79355i, new View.OnClickListener() { // from class: l.p070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150013a.m107597m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public boolean m107589Y() {
        return bnl0.m105529O0(this.f79361o);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m107590Z() {
        return this.f79345G;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m107591b0(View view) {
        this.f79363q.setImageBitmap(null);
        ((e070) this.f119873b).m118820L1();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m107592d0() {
        i4g0.m138520r("e_password_verifypage_reset_button", ((PhoneNumberLoginOptAct) this.f119872a).pageId());
        ((e070) this.f119873b).m118821N1();
    }

    @Override // p153l.jbf0, p153l.iam
    public void destroy() {
        super.destroy();
        if (NullChecker.m82486a(this.f79346H) && NullChecker.m82486a(this.f79347I)) {
            this.f79346H.removeSpan(this.f79347I);
        }
    }

    @Override // p153l.jbf0
    /* JADX INFO: renamed from: i */
    public void mo107593i(String str) {
        this.f79366t.setText(str);
        bnl0.m105525M0(this.f79366t, !TextUtils.isEmpty(str));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM107577L = m107577L(layoutInflater, viewGroup);
        this.f79341C = viewM107577L;
        return viewM107577L;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m107594j0(View view, boolean z) {
        if (z) {
            i4g0.m138520r("e_phone_input", ((PhoneNumberLoginOptAct) this.f119872a).pageId());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m107595k0(View view) {
        i4g0.m138520r("e_phone_input", ((PhoneNumberLoginOptAct) this.f119872a).pageId());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m107596l0() {
        this.f79354h.requestFocus();
        VEditText vEditText = this.f79354h;
        vEditText.setSelection(vEditText.getText().length());
        ((PhoneNumberLoginOptAct) this.f119872a).showInput(this.f79354h, 0);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m107597m0(View view) {
        this.f79354h.setText("");
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m107598q0() {
        m107606y0(null);
    }

    /* JADX INFO: renamed from: r */
    public void m107599r() {
        ((PhoneNumberLoginOptAct) this.f119872a).lmdStart(30000);
        VLinear.f210051b.m224310c();
        bnl0.m105524M(this.f79339A, false);
        bnl0.m105524M(this.f79351e, false);
        bnl0.m105524M(this.f79366t, false);
        this.f79356j.setVisibility(8);
        bnl0.m105524M(this.f79372z, false);
        ((e070) this.f119873b).duringCreated(Act.keyboardListenerObservable(this.f79341C)).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.f070
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96661a.m107557n0((Boolean) obj);
            }
        }));
        m107587V();
        m107588X();
        m107585T();
        m107544W();
        m107586U();
        m107531A0();
        bnl0.m105509E0(this.f79372z, new View.OnClickListener() { // from class: l.q070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155031a.m107558o0(view);
            }
        });
        bnl0.m105509E0(this.f79370x, new View.OnClickListener() { // from class: l.u070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176853a.m107560p0(view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m107601s0() {
        this.f79357k.requestFocus();
        ((PhoneNumberLoginOptAct) this.f119872a).showInput(this.f79357k, 0);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m107602t0() {
        this.f79362p.requestFocus();
        ((PhoneNumberLoginOptAct) this.f119872a).showInput(this.f79362p, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean m107603u0(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        int intExtra = intent.getIntExtra("ccode", 65);
        this.f79353g.setText(Marker.ANY_NON_NULL_MARKER + intExtra);
        m107542M();
        return true;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m107604v0(View view) {
        HoldAct holdact = this.f119872a;
        ((PhoneNumberLoginOptAct) holdact).startActivityForResult(CCodeChooseAct.m29657Z1(holdact), new C4468a.a() { // from class: l.t070
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f171470a.m107603u0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public void m107605x0() {
        this.f79344F = false;
        m107542M();
        l51.m152894N(m107584S(), 20).subscribe();
        bnl0.m105524M(this.f79361o, false);
        ((e070) this.f119873b).m118822O1();
    }

    /* JADX INFO: renamed from: y0 */
    public void m107606y0(View view) {
        this.f79340B = !this.f79340B;
        bnl0.m105525M0(this.f79366t, false);
        m107531A0();
        m107542M();
        if (!this.f79340B) {
            if (this.f79344F) {
                bnl0.m105525M0(this.f79361o, true);
                this.f79362p.requestFocus();
            }
            if (NullChecker.m82486a(view)) {
                ((e070) this.f119873b).f91425e = "verify_code_login";
                i4g0.m138520r("e_password_verifypage_switch_button", ((PhoneNumberLoginOptAct) this.f119872a).pageId());
            }
            bnl0.m105524M(this.f79372z, false);
            this.f79372z.setText(R$string.f16913d3);
            this.f79350d.setText(R$string.f16919e3);
            if (bnl0.m105529O0(this.f79361o)) {
                return;
            }
            this.f79354h.requestFocus();
            ((PhoneNumberLoginOptAct) this.f119872a).showInput(this.f79354h, 0);
            return;
        }
        bnl0.m105524M(this.f79361o, false);
        boolean zM206042m = AccountModule.f16759f.m206042m(String.valueOf(m107581P()));
        VText vText = this.f79372z;
        if (zM206042m) {
            bnl0.m105525M0(vText, true);
            this.f79372z.setText(R$string.f16925f3);
        } else {
            bnl0.m105524M(vText, false);
        }
        this.f79350d.setText(R$string.f16913d3);
        if (e070.m118810n1(m107583R(), m107581P() == 86)) {
            l51.m152888H(act(), new Runnable() { // from class: l.z070
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202286a.m107601s0();
                }
            }, 100L);
        } else {
            this.f79354h.requestFocus();
            ((PhoneNumberLoginOptAct) this.f119872a).showInput(this.f79354h, 0);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m107607z0(CharSequence charSequence) {
        i4g0.m138524v("e_phone_input", ((PhoneNumberLoginOptAct) this.f119872a).pageId(), new pf60[0]);
        bnl0.m105525M0(this.f79366t, false);
        m107542M();
        boolean z = charSequence.length() > 0;
        bnl0.m105524M(this.f79355i, z);
        if (z) {
            this.f79355i.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: l.c170$b */
    public class C16162b implements TextWatcher {
        public C16162b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c170 c170Var = c170.this;
            if (c170Var.f79344F) {
                c170Var.m107542M();
                c170 c170Var2 = c170.this;
                if (c170Var2.f79342D) {
                    c170Var2.f79342D = false;
                } else {
                    bnl0.m105525M0(c170Var2.f79366t, false);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
