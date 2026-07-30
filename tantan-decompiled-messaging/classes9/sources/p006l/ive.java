package p006l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
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
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.CaptchaData;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import l.cwf0;
import l.e30;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VEditText;
import v.VImage;
import v.VLinear;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ive extends c3f0<oue, EmailLoginOptAct> {

    /* JADX INFO: renamed from: A */
    public boolean f14805A;

    /* JADX INFO: renamed from: B */
    public boolean f14806B;

    /* JADX INFO: renamed from: C */
    public boolean f14807C;

    /* JADX INFO: renamed from: D */
    public boolean f14808D;

    /* JADX INFO: renamed from: E */
    public SpannableString f14809E;

    /* JADX INFO: renamed from: F */
    public ClickableSpan f14810F;

    /* JADX INFO: renamed from: G */
    public boolean f14811G;

    /* JADX INFO: renamed from: H */
    public boolean f14812H;

    /* JADX INFO: renamed from: I */
    public cwf0 f14813I;

    /* JADX INFO: renamed from: J */
    public cwf0 f14814J;

    /* JADX INFO: renamed from: c */
    public VScroll f14815c;

    /* JADX INFO: renamed from: d */
    public VText f14816d;

    /* JADX INFO: renamed from: e */
    public VText f14817e;

    /* JADX INFO: renamed from: f */
    public VLinear f14818f;

    /* JADX INFO: renamed from: g */
    public VEditText f14819g;

    /* JADX INFO: renamed from: h */
    public VImage f14820h;

    /* JADX INFO: renamed from: i */
    public VLinear f14821i;

    /* JADX INFO: renamed from: j */
    public VEditText f14822j;

    /* JADX INFO: renamed from: k */
    public VImage f14823k;

    /* JADX INFO: renamed from: l */
    public VImage f14824l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f14825m;

    /* JADX INFO: renamed from: n */
    public VEditText f14826n;

    /* JADX INFO: renamed from: o */
    public VImage f14827o;

    /* JADX INFO: renamed from: p */
    public VText f14828p;

    /* JADX INFO: renamed from: q */
    public AnimEffectPlayer f14829q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f14830r;

    /* JADX INFO: renamed from: s */
    public VText f14831s;

    /* JADX INFO: renamed from: t */
    public ConstraintLayout f14832t;

    /* JADX INFO: renamed from: u */
    public VImage f14833u;

    /* JADX INFO: renamed from: v */
    public VText f14834v;

    /* JADX INFO: renamed from: w */
    public VText f14835w;

    /* JADX INFO: renamed from: x */
    public VText f14836x;

    /* JADX INFO: renamed from: y */
    public boolean f14837y;

    /* JADX INFO: renamed from: z */
    public View f14838z;

    /* JADX INFO: renamed from: l.ive$a */
    public class C0858a extends SVGAAnimListenerAdapter {
        public C0858a() {
        }
    }

    public ive(@NonNull EmailLoginOptAct emailLoginOptAct) {
        super(emailLoginOptAct);
        this.f14837y = false;
        this.f14805A = false;
        this.f14806B = true;
        this.f14807C = false;
        this.f14808D = false;
        this.f14813I = new cwf0("p_intl_sign_in_email_verification_address_view", EmailLoginOptAct.class.getName());
        this.f14814J = new cwf0("p_intl_sign_in_email_password_view", EmailLoginOptAct.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m17071m0(View view) {
        zvf0.r("e_intl_email_log_in_with_verification_button", m17126u0());
        if (this.f14837y) {
            ((oue) this.f9324b).m20824y2();
        } else {
            m17125t0(view);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m17075r0() {
        if (((oue) this.f9324b).m20790P1() || ((oue) this.f9324b).m20792R1()) {
            zvf0.r("e_intl_add_email_verfify_btn", ((EmailLoginOptAct) this.f9323a).pageId());
        } else if (((oue) this.f9324b).m20791Q1()) {
            zvf0.r("e_intl_replace_email_verfify_btn", ((EmailLoginOptAct) this.f9323a).pageId());
        }
        boolean z = !TextUtils.isEmpty(this.f14819g.getText()) && ((oue) this.f9324b).m20785I1(this.f14819g.getText().toString());
        if (this.f14837y) {
            zvf0.r("e_intl_email_password_signin_button", m17126u0());
            boolean z2 = !TextUtils.isEmpty(this.f14822j.getText()) && this.f14822j.getText().length() >= 6;
            if (!z) {
                lsi0.h(R$string.f218j2);
                return;
            } else if (z2) {
                ((oue) this.f9324b).m20782A2();
                return;
            } else {
                lsi0.h(R$string.f212i2);
                return;
            }
        }
        zvf0.r("e_intl_email_address_continue_button", m17126u0());
        if (e51.B(m17095O()) && (!m17102V() || this.f14826n.getText().length() < 4)) {
            m17089I();
            xdl0.M(this.f14825m, false);
            ((oue) this.f9324b).m20824y2();
        } else {
            if (!((oue) this.f9324b).m20785I1(m17093M())) {
                lsi0.h(R$string.f218j2);
                return;
            }
            if (m17102V() && this.f14826n.getText().length() >= 4) {
                e51.K(m17095O());
            }
            m17129x0();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m17083A0() {
        this.f14837y = true;
        m17125t0(null);
    }

    /* JADX INFO: renamed from: B0 */
    public void m17084B0() {
        this.f14808D = true;
        this.f14829q.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C0858a());
    }

    /* JADX INFO: renamed from: D0 */
    public void m17085D0() {
        this.f14808D = false;
        this.f14829q.stopAnimCompletely();
    }

    /* JADX INFO: renamed from: E0 */
    public void m17086E0() {
        ((EmailLoginOptAct) this.f9323a).runOnUiThread(new Runnable() { // from class: l.pue
            @Override // java.lang.Runnable
            public final void run() {
                this.f19345a.m17122q0();
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public void m17087G0() {
        m17085D0();
    }

    /* JADX INFO: renamed from: H */
    public View m17088H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jve.m17843b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m17089I() {
        boolean z = false;
        if (this.f14837y) {
            if (!TextUtils.isEmpty(this.f14822j.getText()) && this.f14822j.getText().length() >= 6 && !TextUtils.isEmpty(this.f14819g.getText()) && ((oue) this.f9324b).m20785I1(this.f14819g.getText().toString())) {
                z = true;
            }
            this.f14831s.setText(R$string.f248o2);
        } else {
            if ((!this.f14807C || this.f14826n.getText().length() >= 4) && !TextUtils.isEmpty(this.f14819g.getText()) && ((oue) this.f9324b).m20785I1(this.f14819g.getText().toString())) {
                z = true;
            }
            this.f14831s.setText(R$string.f206h2);
        }
        this.f14831s.setEnabled(z);
        VText vText = this.f14831s;
        if (z) {
            vText.setBackgroundResource(v2c0.f23967I1);
        } else {
            vText.setBackgroundResource(v2c0.f23964H1);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m17090J() {
        ((EmailLoginOptAct) this.f9323a).postDelayed(new Runnable() { // from class: l.sue
            @Override // java.lang.Runnable
            public final void run() {
                this.f21664a.m17106Z();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: K */
    public final void m17091K(CharSequence charSequence) {
        zvf0.v("e_email_input", m17126u0(), new j760[0]);
        xdl0.M0(this.f14828p, false);
        m17089I();
        boolean z = charSequence.length() > 0;
        xdl0.M(this.f14820h, z);
        if (z) {
            this.f14820h.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: L */
    public String m17092L() {
        return this.f14826n.getText().toString();
    }

    /* JADX INFO: renamed from: M */
    public String m17093M() {
        return this.f14819g.getText().toString();
    }

    /* JADX INFO: renamed from: N */
    public String m17094N() {
        return this.f14822j.getText().toString();
    }

    /* JADX INFO: renamed from: O */
    public String m17095O() {
        return "account_sign_" + m17093M();
    }

    /* JADX INFO: renamed from: P */
    public void m17096P(boolean z) {
        this.f14835w.setEnabled(!z);
        VText vText = this.f14835w;
        if (z) {
            vText.setAlpha(0.5f);
        } else {
            vText.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m17097Q() {
        this.f14807C = false;
        xdl0.M(this.f14825m, false);
    }

    /* JADX INFO: renamed from: R */
    public void m17098R() {
        this.f14826n.addTextChangedListener(new C0859b());
        xdl0.E0(this.f14827o, new View.OnClickListener() { // from class: l.yue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28394a.m17107a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m17099S() {
        xdl0.E0(this.f14831s, new View.OnClickListener() { // from class: l.rue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20742a.m17108b0(view);
            }
        });
        m17089I();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: T */
    public void m17100T() {
        this.f14819g.i(false).subscribe(mkd0.G(new e30() { // from class: l.dve
            public final void call(Object obj) {
                this.f10613a.m17091K((CharSequence) obj);
            }
        }));
        this.f14819g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.eve
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f11460a.m17109c0(view, z);
            }
        });
        this.f14819g.setOnClickListener(new View.OnClickListener() { // from class: l.fve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12935a.m17110d0(view);
            }
        });
        e51.G(new Runnable() { // from class: l.gve
            @Override // java.lang.Runnable
            public final void run() {
                this.f13531a.m17111e0();
            }
        });
        if (!TextUtils.isEmpty(((EmailLoginOptAct) this.f9323a).m565c2())) {
            this.f14819g.setText(((EmailLoginOptAct) this.f9323a).m565c2());
        } else if (NullChecker.a(WelcomeAct.f1046f)) {
            this.f14819g.setText(WelcomeAct.f1046f);
        }
        xdl0.M(this.f14820h, false);
        xdl0.E0(this.f14820h, new View.OnClickListener() { // from class: l.hve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14099a.m17112f0(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m17101U() {
        this.f14822j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.f14822j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.tue
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f22282a.m17113g0(view, z);
            }
        });
        this.f14822j.setOnClickListener(new View.OnClickListener() { // from class: l.uue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23757a.m17114h0(view);
            }
        });
        xdl0.M(this.f14823k, false);
        this.f14822j.i(false).subscribe(mkd0.G(new e30() { // from class: l.vue
            public final void call(Object obj) {
                this.f24473a.m17115i0((CharSequence) obj);
            }
        }));
        xdl0.E0(this.f14823k, new View.OnClickListener() { // from class: l.wue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25415a.m17116j0(view);
            }
        });
        xdl0.E0(this.f14824l, new View.OnClickListener() { // from class: l.xue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27728a.m17117k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public boolean m17102V() {
        return xdl0.O0(this.f14825m);
    }

    /* JADX INFO: renamed from: W */
    public boolean m17103W() {
        return this.f14837y;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m17104X() {
        return ((oue) this.f9324b).f18385i;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m17105Y() {
        return this.f14808D;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m17106Z() {
        int measuredHeight = (((EmailLoginOptAct) this.f9323a).getWindow().getDecorView().getMeasuredHeight() - this.f14832t.getMeasuredHeight()) - this.f14815c.getHeight();
        if (measuredHeight > 0) {
            this.f14815c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m17107a0(View view) {
        this.f14827o.setImageBitmap((Bitmap) null);
        ((oue) this.f9324b).m20821v2();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m17108b0(View view) {
        m17075r0();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m17109c0(View view, boolean z) {
        if (z) {
            zvf0.r("e_email_input", m17126u0());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m17110d0(View view) {
        zvf0.r("e_email_input", m17126u0());
    }

    @Override // p006l.c3f0
    public void destroy() {
        super.destroy();
        this.f14814J.e();
        this.f14813I.e();
        if (NullChecker.a(this.f14809E) && NullChecker.a(this.f14810F)) {
            this.f14809E.removeSpan(this.f14810F);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m17111e0() {
        this.f14819g.requestFocus();
        VEditText vEditText = this.f14819g;
        vEditText.setSelection(vEditText.getText().length());
        ((EmailLoginOptAct) this.f9323a).showInput(this.f14819g, 0);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m17112f0(View view) {
        this.f14819g.setText("");
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m17113g0(View view, boolean z) {
        if (z) {
            zvf0.r("e_password_input", m17126u0());
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m17114h0(View view) {
        zvf0.r("e_password_input", m17126u0());
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo12892i(String str) {
        this.f14828p.setText(str);
        xdl0.M0(this.f14828p, !TextUtils.isEmpty(str));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m17115i0(CharSequence charSequence) {
        xdl0.M(this.f14823k, charSequence.length() > 0);
        zvf0.v("e_password_input", m17126u0(), new j760[0]);
        m17089I();
        if (charSequence.length() > 0) {
            mo12892i(null);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM17088H = m17088H(layoutInflater, viewGroup);
        this.f14838z = viewM17088H;
        return viewM17088H;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m17116j0(View view) {
        this.f14822j.setText("");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m17117k0(View view) {
        boolean z = this.f14806B;
        this.f14806B = !z;
        this.f14824l.setImageResource(!z ? v2c0.f24048k1 : v2c0.f24051l1);
        this.f14822j.setTransformationMethod(this.f14806B ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
        VEditText vEditText = this.f14822j;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m17118l0(Boolean bool) {
        if (bool.booleanValue()) {
            m17090J();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m17119n0(View view) {
        ((EmailLoginOptAct) this.f9323a).onBackPressed();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m17120o0() {
        this.f14822j.requestFocus();
        ((EmailLoginOptAct) this.f9323a).showInput(this.f14822j, 0);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m17121p0() {
        this.f14826n.requestFocus();
        ((EmailLoginOptAct) this.f9323a).showInput(this.f14826n, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m17122q0() {
        xdl0.M(this.f14835w, m17104X());
    }

    /* JADX INFO: renamed from: r */
    public void m17123r() {
        ((EmailLoginOptAct) this.f9323a).lmdStart(30000);
        VLinear.b.c();
        xdl0.M(this.f14828p, false);
        this.f14821i.setVisibility(8);
        ((oue) this.f9324b).duringCreated(Act.keyboardListenerObservable(this.f14838z)).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.zue
            public final void call(Object obj) {
                this.f28987a.m17118l0((Boolean) obj);
            }
        }));
        m17100T();
        m17098R();
        m17101U();
        m17099S();
        m17127v0();
        xdl0.E0(this.f14834v, new View.OnClickListener() { // from class: l.ave
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8556a.m17071m0(view);
            }
        });
        xdl0.E0(this.f14833u, new View.OnClickListener() { // from class: l.bve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9106a.m17119n0(view);
            }
        });
        xdl0.E0(this.f14835w, ((oue) this.f9324b).m20825z2());
        xdl0.E0(this.f14836x, ((oue) this.f9324b).m20823x2());
        if (((oue) this.f9324b).m20792R1()) {
            xdl0.M(this.f14836x, ((Boolean) zmi0.f28827c.get()).booleanValue());
            this.f14816d.setText(R$string.f170b2);
        } else if (((oue) this.f9324b).m20790P1() || ((oue) this.f9324b).m20791Q1()) {
            this.f14816d.setText(R$string.f137V0);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m17124s0() {
        this.f14807C = false;
        m17089I();
        xdl0.M(this.f14825m, false);
        e51.N(m17095O(), 20).subscribe();
        ((oue) this.f9324b).m20824y2();
    }

    /* JADX INFO: renamed from: t0 */
    public void m17125t0(View view) {
        xdl0.M0(this.f14828p, false);
        m17127v0();
        m17089I();
        if (this.f14837y) {
            xdl0.M(this.f14825m, false);
            xdl0.M(this.f14834v, true);
            xdl0.M(this.f14835w, false);
            this.f14834v.setText(R$string.f195f3);
            this.f14816d.setText(R$string.f194f2);
            if (((oue) this.f9324b).m20785I1(m17093M())) {
                e51.H(act(), new Runnable() { // from class: l.cve
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9875a.m17120o0();
                    }
                }, 100L);
                return;
            } else {
                this.f14819g.requestFocus();
                ((EmailLoginOptAct) this.f9323a).showInput(this.f14819g, 0);
                return;
            }
        }
        if (this.f14807C) {
            xdl0.M0(this.f14825m, true);
            this.f14826n.requestFocus();
        }
        xdl0.M(this.f14834v, false);
        m17086E0();
        this.f14816d.setText(R$string.f182d2);
        if (xdl0.O0(this.f14825m)) {
            return;
        }
        this.f14819g.requestFocus();
        ((EmailLoginOptAct) this.f9323a).showInput(this.f14819g, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public String m17126u0() {
        VerifyReason serializableExtra = ((EmailLoginOptAct) this.f9323a).getIntent().getSerializableExtra("reason");
        if (VerifyReason.get("bind-email").equals(serializableExtra)) {
            return "p_account_add_email";
        }
        if (VerifyReason.get("change-email").equals(serializableExtra)) {
            return "p_account_replace_email";
        }
        return m17103W() ? "p_intl_sign_in_email_password_view" : "p_intl_sign_in_email_verification_address_view";
    }

    /* JADX INFO: renamed from: v0 */
    public final void m17127v0() {
        this.f14813I.q(m17126u0());
        boolean z = this.f14837y;
        VLinear vLinear = this.f14818f;
        if (z) {
            xdl0.M(vLinear, false);
            xdl0.M(this.f14835w, false);
            xdl0.M(this.f14830r, false);
            xdl0.M(this.f14821i, true);
            this.f14817e.setText(R$string.f188e2);
            if (this.f14811G) {
                this.f14813I.g();
            }
            if (!this.f14812H) {
                this.f14812H = true;
                this.f14814J.c();
            }
            this.f14814J.r();
            return;
        }
        xdl0.M0(vLinear, true);
        m17086E0();
        xdl0.M(this.f14821i, false);
        xdl0.M(this.f14830r, true);
        this.f14817e.setText(R$string.f176c2);
        if (this.f14812H) {
            this.f14814J.g();
        }
        if (!this.f14811G) {
            this.f14811G = true;
            this.f14813I.c();
        }
        this.f14813I.r();
    }

    /* JADX INFO: renamed from: w0 */
    public void m17128w0() {
        WelcomeAct.f1046f = m17093M();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m17129x0() {
        ((EmailLoginOptAct) this.f9323a).hideInput();
        ((oue) this.f9324b).m20784H1();
        xdl0.M0(this.f14828p, false);
    }

    /* JADX INFO: renamed from: y0 */
    public void m17130y0(CaptchaData captchaData) {
        xdl0.M0(this.f14825m, true);
        this.f14805A = true;
        this.f14826n.setText("");
        this.f14807C = true;
        m17089I();
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(",")[1], 0);
            this.f14827o.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.c(e);
            this.f14827o.setImageBitmap((Bitmap) null);
        }
        e51.G(new Runnable() { // from class: l.que
            @Override // java.lang.Runnable
            public final void run() {
                this.f20082a.m17121p0();
            }
        });
        this.f14837y = false;
        m17125t0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public boolean m17131z0(Throwable th, String str) {
        if (th instanceof TantanException.Client.AccountService) {
            xdl0.M0(this.f14828p, true);
            zvf0.A("e_intl_email_password_signin_wrong_tips", "p_intl_sign_in_email_password_view", new j760[]{vwb.Y("wrong_type", th.getMessage())});
            switch (((TantanException.Client.AccountService) th).code) {
                case 40003:
                case 40010:
                case 400150:
                    this.f14828p.setText(R$string.f218j2);
                    return true;
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    this.f14828p.setText(R$string.f212i2);
                    return true;
                case 40013:
                    this.f14828p.setText(R$string.f151Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f14828p.setText(R$string.f162a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f14828p.setText(R$string.f146X);
                    return true;
                case 400114:
                    this.f14828p.setText(R$string.f162a0);
                    this.f14827o.setImageBitmap((Bitmap) null);
                    ((oue) this.f9324b).m20821v2();
                    return true;
                case 403000:
                    xdl0.M0(this.f14828p, false);
                    C1478yf.m28232b(th);
                    return true;
                default:
                    xdl0.M0(this.f14828p, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l.ive$b */
    public class C0859b implements TextWatcher {
        public C0859b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ive iveVar = ive.this;
            if (iveVar.f14807C) {
                iveVar.m17089I();
                ive iveVar2 = ive.this;
                if (iveVar2.f14805A) {
                    iveVar2.f14805A = false;
                } else {
                    xdl0.M0(iveVar2.f14828p, false);
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
