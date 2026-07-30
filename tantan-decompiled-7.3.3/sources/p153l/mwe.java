package p153l;

import android.annotation.SuppressLint;
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
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.CaptchaData;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class mwe extends jbf0<sve, EmailLoginOptAct> {

    /* JADX INFO: renamed from: A */
    public boolean f139055A;

    /* JADX INFO: renamed from: B */
    public boolean f139056B;

    /* JADX INFO: renamed from: C */
    public boolean f139057C;

    /* JADX INFO: renamed from: D */
    public boolean f139058D;

    /* JADX INFO: renamed from: E */
    public SpannableString f139059E;

    /* JADX INFO: renamed from: F */
    public ClickableSpan f139060F;

    /* JADX INFO: renamed from: G */
    public boolean f139061G;

    /* JADX INFO: renamed from: H */
    public boolean f139062H;

    /* JADX INFO: renamed from: I */
    public l4g0 f139063I;

    /* JADX INFO: renamed from: J */
    public l4g0 f139064J;

    /* JADX INFO: renamed from: c */
    public VScroll f139065c;

    /* JADX INFO: renamed from: d */
    public VText f139066d;

    /* JADX INFO: renamed from: e */
    public VText f139067e;

    /* JADX INFO: renamed from: f */
    public VLinear f139068f;

    /* JADX INFO: renamed from: g */
    public VEditText f139069g;

    /* JADX INFO: renamed from: h */
    public VImage f139070h;

    /* JADX INFO: renamed from: i */
    public VLinear f139071i;

    /* JADX INFO: renamed from: j */
    public VEditText f139072j;

    /* JADX INFO: renamed from: k */
    public VImage f139073k;

    /* JADX INFO: renamed from: l */
    public VImage f139074l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f139075m;

    /* JADX INFO: renamed from: n */
    public VEditText f139076n;

    /* JADX INFO: renamed from: o */
    public VImage f139077o;

    /* JADX INFO: renamed from: p */
    public VText f139078p;

    /* JADX INFO: renamed from: q */
    public AnimEffectPlayer f139079q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f139080r;

    /* JADX INFO: renamed from: s */
    public VText f139081s;

    /* JADX INFO: renamed from: t */
    public ConstraintLayout f139082t;

    /* JADX INFO: renamed from: u */
    public VImage f139083u;

    /* JADX INFO: renamed from: v */
    public VText f139084v;

    /* JADX INFO: renamed from: w */
    public VText f139085w;

    /* JADX INFO: renamed from: x */
    public VText f139086x;

    /* JADX INFO: renamed from: y */
    public boolean f139087y;

    /* JADX INFO: renamed from: z */
    public View f139088z;

    /* JADX INFO: renamed from: l.mwe$a */
    public class C18721a extends SVGAAnimListenerAdapter {
        public C18721a() {
        }
    }

    public mwe(@NonNull EmailLoginOptAct emailLoginOptAct) {
        super(emailLoginOptAct);
        this.f139087y = false;
        this.f139055A = false;
        this.f139056B = true;
        this.f139057C = false;
        this.f139058D = false;
        this.f139063I = new l4g0("p_intl_sign_in_email_verification_address_view", EmailLoginOptAct.class.getName());
        this.f139064J = new l4g0("p_intl_sign_in_email_password_view", EmailLoginOptAct.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m160490m0(View view) {
        i4g0.m138520r("e_intl_email_log_in_with_verification_button", m160545u0());
        if (this.f139087y) {
            ((sve) this.f119873b).m188194y2();
        } else {
            m160544t0(view);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m160494r0() {
        if (((sve) this.f119873b).m188160P1() || ((sve) this.f119873b).m188162R1()) {
            i4g0.m138520r("e_intl_add_email_verfify_btn", ((EmailLoginOptAct) this.f119872a).pageId());
        } else if (((sve) this.f119873b).m188161Q1()) {
            i4g0.m138520r("e_intl_replace_email_verfify_btn", ((EmailLoginOptAct) this.f119872a).pageId());
        }
        boolean z = !TextUtils.isEmpty(this.f139069g.getText()) && ((sve) this.f119873b).m188155I1(this.f139069g.getText().toString());
        if (this.f139087y) {
            i4g0.m138520r("e_intl_email_password_signin_button", m160545u0());
            boolean z2 = !TextUtils.isEmpty(this.f139072j.getText()) && this.f139072j.getText().length() >= 6;
            if (!z) {
                o1j0.m165634h(R$string.f16948j2);
                return;
            } else if (z2) {
                ((sve) this.f119873b).m188152A2();
                return;
            } else {
                o1j0.m165634h(R$string.f16942i2);
                return;
            }
        }
        i4g0.m138520r("e_intl_email_address_continue_button", m160545u0());
        if (l51.m152882B(m160514O()) && (!m160521V() || this.f139076n.getText().length() < 4)) {
            m160508I();
            bnl0.m105524M(this.f139075m, false);
            ((sve) this.f119873b).m188194y2();
        } else {
            if (!((sve) this.f119873b).m188155I1(m160512M())) {
                o1j0.m165634h(R$string.f16948j2);
                return;
            }
            if (m160521V() && this.f139076n.getText().length() >= 4) {
                l51.m152891K(m160514O());
            }
            m160548x0();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m160502A0() {
        this.f139087y = true;
        m160544t0(null);
    }

    /* JADX INFO: renamed from: B0 */
    public void m160503B0() {
        this.f139058D = true;
        this.f139079q.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C18721a());
    }

    /* JADX INFO: renamed from: D0 */
    public void m160504D0() {
        this.f139058D = false;
        this.f139079q.stopAnimCompletely();
    }

    /* JADX INFO: renamed from: E0 */
    public void m160505E0() {
        ((EmailLoginOptAct) this.f119872a).runOnUiThread(new Runnable() { // from class: l.tve
            @Override // java.lang.Runnable
            public final void run() {
                this.f176260a.m160541q0();
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public void m160506G0() {
        m160504D0();
    }

    /* JADX INFO: renamed from: H */
    public View m160507H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nwe.m164988b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m160508I() {
        boolean z = false;
        if (this.f139087y) {
            if (!TextUtils.isEmpty(this.f139072j.getText()) && this.f139072j.getText().length() >= 6 && !TextUtils.isEmpty(this.f139069g.getText()) && ((sve) this.f119873b).m188155I1(this.f139069g.getText().toString())) {
                z = true;
            }
            this.f139081s.setText(R$string.f16978o2);
        } else {
            if ((!this.f139057C || this.f139076n.getText().length() >= 4) && !TextUtils.isEmpty(this.f139069g.getText()) && ((sve) this.f119873b).m188155I1(this.f139069g.getText().toString())) {
                z = true;
            }
            this.f139081s.setText(R$string.f16936h2);
        }
        this.f139081s.setEnabled(z);
        VText vText = this.f139081s;
        if (z) {
            vText.setBackgroundResource(bbc0.f75809I1);
        } else {
            vText.setBackgroundResource(bbc0.f75806H1);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m160509J() {
        ((EmailLoginOptAct) this.f119872a).postDelayed(new Runnable() { // from class: l.wve
            @Override // java.lang.Runnable
            public final void run() {
                this.f190959a.m160525Z();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: K */
    public final void m160510K(CharSequence charSequence) {
        i4g0.m138524v("e_email_input", m160545u0(), new pf60[0]);
        bnl0.m105525M0(this.f139078p, false);
        m160508I();
        boolean z = charSequence.length() > 0;
        bnl0.m105524M(this.f139070h, z);
        if (z) {
            this.f139070h.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: L */
    public String m160511L() {
        return this.f139076n.getText().toString();
    }

    /* JADX INFO: renamed from: M */
    public String m160512M() {
        return this.f139069g.getText().toString();
    }

    /* JADX INFO: renamed from: N */
    public String m160513N() {
        return this.f139072j.getText().toString();
    }

    /* JADX INFO: renamed from: O */
    public String m160514O() {
        return "account_sign_" + m160512M();
    }

    /* JADX INFO: renamed from: P */
    public void m160515P(boolean z) {
        this.f139085w.setEnabled(!z);
        VText vText = this.f139085w;
        if (z) {
            vText.setAlpha(0.5f);
        } else {
            vText.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m160516Q() {
        this.f139057C = false;
        bnl0.m105524M(this.f139075m, false);
    }

    /* JADX INFO: renamed from: R */
    public void m160517R() {
        this.f139076n.addTextChangedListener(new C18722b());
        bnl0.m105509E0(this.f139077o, new View.OnClickListener() { // from class: l.cwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84117a.m160526a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m160518S() {
        bnl0.m105509E0(this.f139081s, new View.OnClickListener() { // from class: l.vve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185923a.m160527b0(view);
            }
        });
        m160508I();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: T */
    public void m160519T() {
        this.f139069g.mo29617i(false).subscribe(psd0.m173596G(new y20() { // from class: l.hwe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111892a.m160510K((CharSequence) obj);
            }
        }));
        this.f139069g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.iwe
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f117266a.m160528c0(view, z);
            }
        });
        this.f139069g.setOnClickListener(new View.OnClickListener() { // from class: l.jwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122914a.m160529d0(view);
            }
        });
        l51.m152887G(new Runnable() { // from class: l.kwe
            @Override // java.lang.Runnable
            public final void run() {
                this.f129062a.m160530e0();
            }
        });
        if (!TextUtils.isEmpty(((EmailLoginOptAct) this.f119872a).m29665d2())) {
            this.f139069g.setText(((EmailLoginOptAct) this.f119872a).m29665d2());
        } else if (NullChecker.m82486a(WelcomeAct.f17776f)) {
            this.f139069g.setText(WelcomeAct.f17776f);
        }
        bnl0.m105524M(this.f139070h, false);
        bnl0.m105509E0(this.f139070h, new View.OnClickListener() { // from class: l.lwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133809a.m160531f0(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m160520U() {
        this.f139072j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.f139072j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.xve
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f196384a.m160532g0(view, z);
            }
        });
        this.f139072j.setOnClickListener(new View.OnClickListener() { // from class: l.yve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201703a.m160533h0(view);
            }
        });
        bnl0.m105524M(this.f139073k, false);
        this.f139072j.mo29617i(false).subscribe(psd0.m173596G(new y20() { // from class: l.zve
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206211a.m160534i0((CharSequence) obj);
            }
        }));
        bnl0.m105509E0(this.f139073k, new View.OnClickListener() { // from class: l.awe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73725a.m160535j0(view);
            }
        });
        bnl0.m105509E0(this.f139074l, new View.OnClickListener() { // from class: l.bwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78722a.m160536k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public boolean m160521V() {
        return bnl0.m105529O0(this.f139075m);
    }

    /* JADX INFO: renamed from: W */
    public boolean m160522W() {
        return this.f139087y;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m160523X() {
        return ((sve) this.f119873b).f170830i;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m160524Y() {
        return this.f139058D;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m160525Z() {
        int measuredHeight = (((EmailLoginOptAct) this.f119872a).getWindow().getDecorView().getMeasuredHeight() - this.f139082t.getMeasuredHeight()) - this.f139065c.getHeight();
        if (measuredHeight > 0) {
            this.f139065c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m160526a0(View view) {
        this.f139077o.setImageBitmap(null);
        ((sve) this.f119873b).m188191v2();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m160527b0(View view) {
        m160494r0();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m160528c0(View view, boolean z) {
        if (z) {
            i4g0.m138520r("e_email_input", m160545u0());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m160529d0(View view) {
        i4g0.m138520r("e_email_input", m160545u0());
    }

    @Override // p153l.jbf0, p153l.iam
    public void destroy() {
        super.destroy();
        this.f139064J.m152770e();
        this.f139063I.m152770e();
        if (NullChecker.m82486a(this.f139059E) && NullChecker.m82486a(this.f139060F)) {
            this.f139059E.removeSpan(this.f139060F);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m160530e0() {
        this.f139069g.requestFocus();
        VEditText vEditText = this.f139069g;
        vEditText.setSelection(vEditText.getText().length());
        ((EmailLoginOptAct) this.f119872a).showInput(this.f139069g, 0);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m160531f0(View view) {
        this.f139069g.setText("");
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m160532g0(View view, boolean z) {
        if (z) {
            i4g0.m138520r("e_password_input", m160545u0());
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m160533h0(View view) {
        i4g0.m138520r("e_password_input", m160545u0());
    }

    @Override // p153l.jbf0
    /* JADX INFO: renamed from: i */
    public void mo107593i(String str) {
        this.f139078p.setText(str);
        bnl0.m105525M0(this.f139078p, !TextUtils.isEmpty(str));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m160534i0(CharSequence charSequence) {
        bnl0.m105524M(this.f139073k, charSequence.length() > 0);
        i4g0.m138524v("e_password_input", m160545u0(), new pf60[0]);
        m160508I();
        if (charSequence.length() > 0) {
            mo107593i(null);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM160507H = m160507H(layoutInflater, viewGroup);
        this.f139088z = viewM160507H;
        return viewM160507H;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m160535j0(View view) {
        this.f139072j.setText("");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m160536k0(View view) {
        boolean z = this.f139056B;
        this.f139056B = !z;
        this.f139074l.setImageResource(!z ? bbc0.f75890k1 : bbc0.f75893l1);
        this.f139072j.setTransformationMethod(this.f139056B ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
        VEditText vEditText = this.f139072j;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m160537l0(Boolean bool) {
        if (bool.booleanValue()) {
            m160509J();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m160538n0(View view) {
        ((EmailLoginOptAct) this.f119872a).onBackPressed();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m160539o0() {
        this.f139072j.requestFocus();
        ((EmailLoginOptAct) this.f119872a).showInput(this.f139072j, 0);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m160540p0() {
        this.f139076n.requestFocus();
        ((EmailLoginOptAct) this.f119872a).showInput(this.f139076n, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m160541q0() {
        bnl0.m105524M(this.f139085w, m160523X());
    }

    /* JADX INFO: renamed from: r */
    public void m160542r() {
        ((EmailLoginOptAct) this.f119872a).lmdStart(30000);
        VLinear.f210051b.m224310c();
        bnl0.m105524M(this.f139078p, false);
        this.f139071i.setVisibility(8);
        ((sve) this.f119873b).duringCreated(Act.keyboardListenerObservable(this.f139088z)).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.dwe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91014a.m160537l0((Boolean) obj);
            }
        }));
        m160519T();
        m160517R();
        m160520U();
        m160518S();
        m160546v0();
        bnl0.m105509E0(this.f139084v, new View.OnClickListener() { // from class: l.ewe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96151a.m160490m0(view);
            }
        });
        bnl0.m105509E0(this.f139083u, new View.OnClickListener() { // from class: l.fwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101155a.m160538n0(view);
            }
        });
        bnl0.m105509E0(this.f139085w, ((sve) this.f119873b).m188195z2());
        bnl0.m105509E0(this.f139086x, ((sve) this.f119873b).m188193x2());
        if (((sve) this.f119873b).m188162R1()) {
            bnl0.m105524M(this.f139086x, awi0.f73759c.get().booleanValue());
            this.f139066d.setText(R$string.f16900b2);
        } else if (((sve) this.f119873b).m188160P1() || ((sve) this.f119873b).m188161Q1()) {
            this.f139066d.setText(R$string.f16867V0);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m160543s0() {
        this.f139057C = false;
        m160508I();
        bnl0.m105524M(this.f139075m, false);
        l51.m152894N(m160514O(), 20).subscribe();
        ((sve) this.f119873b).m188194y2();
    }

    /* JADX INFO: renamed from: t0 */
    public void m160544t0(View view) {
        bnl0.m105525M0(this.f139078p, false);
        m160546v0();
        m160508I();
        if (this.f139087y) {
            bnl0.m105524M(this.f139075m, false);
            bnl0.m105524M(this.f139084v, true);
            bnl0.m105524M(this.f139085w, false);
            this.f139084v.setText(R$string.f16925f3);
            this.f139066d.setText(R$string.f16924f2);
            if (((sve) this.f119873b).m188155I1(m160512M())) {
                l51.m152888H(act(), new Runnable() { // from class: l.gwe
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f106834a.m160539o0();
                    }
                }, 100L);
                return;
            } else {
                this.f139069g.requestFocus();
                ((EmailLoginOptAct) this.f119872a).showInput(this.f139069g, 0);
                return;
            }
        }
        if (this.f139057C) {
            bnl0.m105525M0(this.f139075m, true);
            this.f139076n.requestFocus();
        }
        bnl0.m105524M(this.f139084v, false);
        m160505E0();
        this.f139066d.setText(R$string.f16912d2);
        if (bnl0.m105529O0(this.f139075m)) {
            return;
        }
        this.f139069g.requestFocus();
        ((EmailLoginOptAct) this.f119872a).showInput(this.f139069g, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public String m160545u0() {
        VerifyReason verifyReason = (VerifyReason) ((EmailLoginOptAct) this.f119872a).getIntent().getSerializableExtra(Reason.TYPE);
        if (VerifyReason.get(VerifyReason.bind_email).equals(verifyReason)) {
            return "p_account_add_email";
        }
        if (VerifyReason.get(VerifyReason.change_email).equals(verifyReason)) {
            return "p_account_replace_email";
        }
        return m160522W() ? "p_intl_sign_in_email_password_view" : "p_intl_sign_in_email_verification_address_view";
    }

    /* JADX INFO: renamed from: v0 */
    public final void m160546v0() {
        this.f139063I.m152782q(m160545u0());
        boolean z = this.f139087y;
        VLinear vLinear = this.f139068f;
        if (z) {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f139085w, false);
            bnl0.m105524M(this.f139080r, false);
            bnl0.m105524M(this.f139071i, true);
            this.f139067e.setText(R$string.f16918e2);
            if (this.f139061G) {
                this.f139063I.m152772g();
            }
            if (!this.f139062H) {
                this.f139062H = true;
                this.f139064J.m152768c();
            }
            this.f139064J.m152783r();
            return;
        }
        bnl0.m105525M0(vLinear, true);
        m160505E0();
        bnl0.m105524M(this.f139071i, false);
        bnl0.m105524M(this.f139080r, true);
        this.f139067e.setText(R$string.f16906c2);
        if (this.f139062H) {
            this.f139064J.m152772g();
        }
        if (!this.f139061G) {
            this.f139061G = true;
            this.f139063I.m152768c();
        }
        this.f139063I.m152783r();
    }

    /* JADX INFO: renamed from: w0 */
    public void m160547w0() {
        WelcomeAct.f17776f = m160512M();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m160548x0() {
        ((EmailLoginOptAct) this.f119872a).hideInput();
        ((sve) this.f119873b).m188154H1();
        bnl0.m105525M0(this.f139078p, false);
    }

    /* JADX INFO: renamed from: y0 */
    public void m160549y0(CaptchaData captchaData) {
        bnl0.m105525M0(this.f139075m, true);
        this.f139055A = true;
        this.f139076n.setText("");
        this.f139057C = true;
        m160508I();
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(Constants.SEPARATOR_COMMA)[1], 0);
            this.f139077o.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            this.f139077o.setImageBitmap(null);
        }
        l51.m152887G(new Runnable() { // from class: l.uve
            @Override // java.lang.Runnable
            public final void run() {
                this.f181138a.m160540p0();
            }
        });
        this.f139087y = false;
        m160544t0(null);
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m160550z0(Throwable th, String str) {
        if (th instanceof TantanException.Client.AccountService) {
            bnl0.m105525M0(this.f139078p, true);
            i4g0.m138492A("e_intl_email_password_signin_wrong_tips", "p_intl_sign_in_email_password_view", jyb.m147494Y("wrong_type", th.getMessage()));
            switch (((TantanException.Client.AccountService) th).code) {
                case 40003:
                case 40010:
                case 400150:
                    this.f139078p.setText(R$string.f16948j2);
                    return true;
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    this.f139078p.setText(R$string.f16942i2);
                    return true;
                case 40013:
                    this.f139078p.setText(R$string.f16881Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f139078p.setText(R$string.f16892a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f139078p.setText(R$string.f16876X);
                    return true;
                case 400114:
                    this.f139078p.setText(R$string.f16892a0);
                    this.f139077o.setImageBitmap(null);
                    ((sve) this.f119873b).m188191v2();
                    return true;
                case 403000:
                    bnl0.m105525M0(this.f139078p, false);
                    C20299tf.m190906b(th);
                    return true;
                default:
                    bnl0.m105525M0(this.f139078p, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l.mwe$b */
    public class C18722b implements TextWatcher {
        public C18722b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            mwe mweVar = mwe.this;
            if (mweVar.f139057C) {
                mweVar.m160508I();
                mwe mweVar2 = mwe.this;
                if (mweVar2.f139055A) {
                    mweVar2.f139055A = false;
                } else {
                    bnl0.m105525M0(mweVar2.f139078p, false);
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
