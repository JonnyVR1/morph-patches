package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.data.CaptchaData;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ive extends c3f0<oue, EmailLoginOptAct> {

    /* JADX INFO: renamed from: A */
    public boolean f115124A;

    /* JADX INFO: renamed from: B */
    public boolean f115125B;

    /* JADX INFO: renamed from: C */
    public boolean f115126C;

    /* JADX INFO: renamed from: D */
    public boolean f115127D;

    /* JADX INFO: renamed from: E */
    public SpannableString f115128E;

    /* JADX INFO: renamed from: F */
    public ClickableSpan f115129F;

    /* JADX INFO: renamed from: G */
    public boolean f115130G;

    /* JADX INFO: renamed from: H */
    public boolean f115131H;

    /* JADX INFO: renamed from: I */
    public cwf0 f115132I;

    /* JADX INFO: renamed from: J */
    public cwf0 f115133J;

    /* JADX INFO: renamed from: c */
    public VScroll f115134c;

    /* JADX INFO: renamed from: d */
    public VText f115135d;

    /* JADX INFO: renamed from: e */
    public VText f115136e;

    /* JADX INFO: renamed from: f */
    public VLinear f115137f;

    /* JADX INFO: renamed from: g */
    public VEditText f115138g;

    /* JADX INFO: renamed from: h */
    public VImage f115139h;

    /* JADX INFO: renamed from: i */
    public VLinear f115140i;

    /* JADX INFO: renamed from: j */
    public VEditText f115141j;

    /* JADX INFO: renamed from: k */
    public VImage f115142k;

    /* JADX INFO: renamed from: l */
    public VImage f115143l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f115144m;

    /* JADX INFO: renamed from: n */
    public VEditText f115145n;

    /* JADX INFO: renamed from: o */
    public VImage f115146o;

    /* JADX INFO: renamed from: p */
    public VText f115147p;

    /* JADX INFO: renamed from: q */
    public AnimEffectPlayer f115148q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f115149r;

    /* JADX INFO: renamed from: s */
    public VText f115150s;

    /* JADX INFO: renamed from: t */
    public ConstraintLayout f115151t;

    /* JADX INFO: renamed from: u */
    public VImage f115152u;

    /* JADX INFO: renamed from: v */
    public VText f115153v;

    /* JADX INFO: renamed from: w */
    public VText f115154w;

    /* JADX INFO: renamed from: x */
    public VText f115155x;

    /* JADX INFO: renamed from: y */
    public boolean f115156y;

    /* JADX INFO: renamed from: z */
    public View f115157z;

    /* JADX INFO: renamed from: l.ive$a */
    public class C17625a extends SVGAAnimListenerAdapter {
        public C17625a() {
        }
    }

    public ive(@NonNull EmailLoginOptAct emailLoginOptAct) {
        super(emailLoginOptAct);
        this.f115156y = false;
        this.f115124A = false;
        this.f115125B = true;
        this.f115126C = false;
        this.f115127D = false;
        this.f115132I = new cwf0("p_intl_sign_in_email_verification_address_view", EmailLoginOptAct.class.getName());
        this.f115133J = new cwf0("p_intl_sign_in_email_password_view", EmailLoginOptAct.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m138555m0(View view) {
        zvf0.m220396r("e_intl_email_log_in_with_verification_button", m138610u0());
        if (this.f115156y) {
            ((oue) this.f78942b).m166065y2();
        } else {
            m138609t0(view);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m138559r0() {
        if (((oue) this.f78942b).m166031P1() || ((oue) this.f78942b).m166033R1()) {
            zvf0.m220396r("e_intl_add_email_verfify_btn", ((EmailLoginOptAct) this.f78941a).pageId());
        } else if (((oue) this.f78942b).m166032Q1()) {
            zvf0.m220396r("e_intl_replace_email_verfify_btn", ((EmailLoginOptAct) this.f78941a).pageId());
        }
        boolean z = !TextUtils.isEmpty(this.f115138g.getText()) && ((oue) this.f78942b).m166026I1(this.f115138g.getText().toString());
        if (this.f115156y) {
            zvf0.m220396r("e_intl_email_password_signin_button", m138610u0());
            boolean z2 = !TextUtils.isEmpty(this.f115141j.getText()) && this.f115141j.getText().length() >= 6;
            if (!z) {
                lsi0.m151578h(R$string.f16229j2);
                return;
            } else if (z2) {
                ((oue) this.f78942b).m166023A2();
                return;
            } else {
                lsi0.m151578h(R$string.f16223i2);
                return;
            }
        }
        zvf0.m220396r("e_intl_email_address_continue_button", m138610u0());
        if (e51.m114737B(m138579O()) && (!m138586V() || this.f115145n.getText().length() < 4)) {
            m138573I();
            xdl0.m208344M(this.f115144m, false);
            ((oue) this.f78942b).m166065y2();
        } else {
            if (!((oue) this.f78942b).m166026I1(m138577M())) {
                lsi0.m151578h(R$string.f16229j2);
                return;
            }
            if (m138586V() && this.f115145n.getText().length() >= 4) {
                e51.m114746K(m138579O());
            }
            m138613x0();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m138567A0() {
        this.f115156y = true;
        m138609t0(null);
    }

    /* JADX INFO: renamed from: B0 */
    public void m138568B0() {
        this.f115127D = true;
        this.f115148q.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C17625a());
    }

    /* JADX INFO: renamed from: D0 */
    public void m138569D0() {
        this.f115127D = false;
        this.f115148q.stopAnimCompletely();
    }

    /* JADX INFO: renamed from: E0 */
    public void m138570E0() {
        ((EmailLoginOptAct) this.f78941a).runOnUiThread(new Runnable() { // from class: l.pue
            @Override // java.lang.Runnable
            public final void run() {
                this.f151270a.m138606q0();
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public void m138571G0() {
        m138569D0();
    }

    /* JADX INFO: renamed from: H */
    public View m138572H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jve.m143486b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m138573I() {
        boolean z = false;
        if (this.f115156y) {
            if (!TextUtils.isEmpty(this.f115141j.getText()) && this.f115141j.getText().length() >= 6 && !TextUtils.isEmpty(this.f115138g.getText()) && ((oue) this.f78942b).m166026I1(this.f115138g.getText().toString())) {
                z = true;
            }
            this.f115150s.setText(R$string.f16259o2);
        } else {
            if ((!this.f115126C || this.f115145n.getText().length() >= 4) && !TextUtils.isEmpty(this.f115138g.getText()) && ((oue) this.f78942b).m166026I1(this.f115138g.getText().toString())) {
                z = true;
            }
            this.f115150s.setText(R$string.f16217h2);
        }
        this.f115150s.setEnabled(z);
        VText vText = this.f115150s;
        if (z) {
            vText.setBackgroundResource(v2c0.f179403I1);
        } else {
            vText.setBackgroundResource(v2c0.f179400H1);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m138574J() {
        ((EmailLoginOptAct) this.f78941a).postDelayed(new Runnable() { // from class: l.sue
            @Override // java.lang.Runnable
            public final void run() {
                this.f166463a.m138590Z();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: K */
    public final void m138575K(CharSequence charSequence) {
        zvf0.m220400v("e_email_input", m138610u0(), new j760[0]);
        xdl0.m208345M0(this.f115147p, false);
        m138573I();
        boolean z = charSequence.length() > 0;
        xdl0.m208344M(this.f115139h, z);
        if (z) {
            this.f115139h.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: L */
    public String m138576L() {
        return this.f115145n.getText().toString();
    }

    /* JADX INFO: renamed from: M */
    public String m138577M() {
        return this.f115138g.getText().toString();
    }

    /* JADX INFO: renamed from: N */
    public String m138578N() {
        return this.f115141j.getText().toString();
    }

    /* JADX INFO: renamed from: O */
    public String m138579O() {
        return "account_sign_" + m138577M();
    }

    /* JADX INFO: renamed from: P */
    public void m138580P(boolean z) {
        this.f115154w.setEnabled(!z);
        VText vText = this.f115154w;
        if (z) {
            vText.setAlpha(0.5f);
        } else {
            vText.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m138581Q() {
        this.f115126C = false;
        xdl0.m208344M(this.f115144m, false);
    }

    /* JADX INFO: renamed from: R */
    public void m138582R() {
        this.f115145n.addTextChangedListener(new C17626b());
        xdl0.m208329E0(this.f115146o, new View.OnClickListener() { // from class: l.yue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200073a.m138591a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m138583S() {
        xdl0.m208329E0(this.f115150s, new View.OnClickListener() { // from class: l.rue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161052a.m138592b0(view);
            }
        });
        m138573I();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: T */
    public void m138584T() {
        this.f115138g.mo28618i(false).subscribe(mkd0.m154955G(new e30() { // from class: l.dve
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88053a.m138575K((CharSequence) obj);
            }
        }));
        this.f115138g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.eve
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f93330a.m138593c0(view, z);
            }
        });
        this.f115138g.setOnClickListener(new View.OnClickListener() { // from class: l.fve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99418a.m138594d0(view);
            }
        });
        e51.m114742G(new Runnable() { // from class: l.gve
            @Override // java.lang.Runnable
            public final void run() {
                this.f104553a.m138595e0();
            }
        });
        if (!TextUtils.isEmpty(((EmailLoginOptAct) this.f78941a).m28666c2())) {
            this.f115138g.setText(((EmailLoginOptAct) this.f78941a).m28666c2());
        } else if (NullChecker.m81303a(WelcomeAct.f17057f)) {
            this.f115138g.setText(WelcomeAct.f17057f);
        }
        xdl0.m208344M(this.f115139h, false);
        xdl0.m208329E0(this.f115139h, new View.OnClickListener() { // from class: l.hve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109639a.m138596f0(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m138585U() {
        this.f115141j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.f115141j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.tue
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f172164a.m138597g0(view, z);
            }
        });
        this.f115141j.setOnClickListener(new View.OnClickListener() { // from class: l.uue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178343a.m138598h0(view);
            }
        });
        xdl0.m208344M(this.f115142k, false);
        this.f115141j.mo28618i(false).subscribe(mkd0.m154955G(new e30() { // from class: l.vue
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183059a.m138599i0((CharSequence) obj);
            }
        }));
        xdl0.m208329E0(this.f115142k, new View.OnClickListener() { // from class: l.wue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188110a.m138600j0(view);
            }
        });
        xdl0.m208329E0(this.f115143l, new View.OnClickListener() { // from class: l.xue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194494a.m138601k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public boolean m138586V() {
        return xdl0.m208349O0(this.f115144m);
    }

    /* JADX INFO: renamed from: W */
    public boolean m138587W() {
        return this.f115156y;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m138588X() {
        return ((oue) this.f78942b).f145690i;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m138589Y() {
        return this.f115127D;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m138590Z() {
        int measuredHeight = (((EmailLoginOptAct) this.f78941a).getWindow().getDecorView().getMeasuredHeight() - this.f115151t.getMeasuredHeight()) - this.f115134c.getHeight();
        if (measuredHeight > 0) {
            this.f115134c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m138591a0(View view) {
        this.f115146o.setImageBitmap(null);
        ((oue) this.f78942b).m166062v2();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m138592b0(View view) {
        m138559r0();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m138593c0(View view, boolean z) {
        if (z) {
            zvf0.m220396r("e_email_input", m138610u0());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m138594d0(View view) {
        zvf0.m220396r("e_email_input", m138610u0());
    }

    @Override // p149l.c3f0, p149l.s7m
    public void destroy() {
        super.destroy();
        this.f115133J.m109029e();
        this.f115132I.m109029e();
        if (NullChecker.m81303a(this.f115128E) && NullChecker.m81303a(this.f115129F)) {
            this.f115128E.removeSpan(this.f115129F);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m138595e0() {
        this.f115138g.requestFocus();
        VEditText vEditText = this.f115138g;
        vEditText.setSelection(vEditText.getText().length());
        ((EmailLoginOptAct) this.f78941a).showInput(this.f115138g, 0);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m138596f0(View view) {
        this.f115138g.setText("");
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m138597g0(View view, boolean z) {
        if (z) {
            zvf0.m220396r("e_password_input", m138610u0());
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m138598h0(View view) {
        zvf0.m220396r("e_password_input", m138610u0());
    }

    @Override // p149l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo103522i(String str) {
        this.f115147p.setText(str);
        xdl0.m208345M0(this.f115147p, !TextUtils.isEmpty(str));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m138599i0(CharSequence charSequence) {
        xdl0.m208344M(this.f115142k, charSequence.length() > 0);
        zvf0.m220400v("e_password_input", m138610u0(), new j760[0]);
        m138573I();
        if (charSequence.length() > 0) {
            mo103522i(null);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM138572H = m138572H(layoutInflater, viewGroup);
        this.f115157z = viewM138572H;
        return viewM138572H;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m138600j0(View view) {
        this.f115141j.setText("");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m138601k0(View view) {
        boolean z = this.f115125B;
        this.f115125B = !z;
        this.f115143l.setImageResource(!z ? v2c0.f179484k1 : v2c0.f179487l1);
        this.f115141j.setTransformationMethod(this.f115125B ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
        VEditText vEditText = this.f115141j;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m138602l0(Boolean bool) {
        if (bool.booleanValue()) {
            m138574J();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m138603n0(View view) {
        ((EmailLoginOptAct) this.f78941a).onBackPressed();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m138604o0() {
        this.f115141j.requestFocus();
        ((EmailLoginOptAct) this.f78941a).showInput(this.f115141j, 0);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m138605p0() {
        this.f115145n.requestFocus();
        ((EmailLoginOptAct) this.f78941a).showInput(this.f115145n, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m138606q0() {
        xdl0.m208344M(this.f115154w, m138588X());
    }

    /* JADX INFO: renamed from: r */
    public void m138607r() {
        ((EmailLoginOptAct) this.f78941a).lmdStart(30000);
        VLinear.f209129b.m223064c();
        xdl0.m208344M(this.f115147p, false);
        this.f115140i.setVisibility(8);
        ((oue) this.f78942b).duringCreated(Act.keyboardListenerObservable(this.f115157z)).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.zue
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204851a.m138602l0((Boolean) obj);
            }
        }));
        m138584T();
        m138582R();
        m138585U();
        m138583S();
        m138611v0();
        xdl0.m208329E0(this.f115153v, new View.OnClickListener() { // from class: l.ave
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71932a.m138555m0(view);
            }
        });
        xdl0.m208329E0(this.f115152u, new View.OnClickListener() { // from class: l.bve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77428a.m138603n0(view);
            }
        });
        xdl0.m208329E0(this.f115154w, ((oue) this.f78942b).m166066z2());
        xdl0.m208329E0(this.f115155x, ((oue) this.f78942b).m166064x2());
        if (((oue) this.f78942b).m166033R1()) {
            xdl0.m208344M(this.f115155x, zmi0.f203724c.get().booleanValue());
            this.f115135d.setText(R$string.f16181b2);
        } else if (((oue) this.f78942b).m166031P1() || ((oue) this.f78942b).m166032Q1()) {
            this.f115135d.setText(R$string.f16148V0);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m138608s0() {
        this.f115126C = false;
        m138573I();
        xdl0.m208344M(this.f115144m, false);
        e51.m114749N(m138579O(), 20).subscribe();
        ((oue) this.f78942b).m166065y2();
    }

    /* JADX INFO: renamed from: t0 */
    public void m138609t0(View view) {
        xdl0.m208345M0(this.f115147p, false);
        m138611v0();
        m138573I();
        if (this.f115156y) {
            xdl0.m208344M(this.f115144m, false);
            xdl0.m208344M(this.f115153v, true);
            xdl0.m208344M(this.f115154w, false);
            this.f115153v.setText(R$string.f16206f3);
            this.f115135d.setText(R$string.f16205f2);
            if (((oue) this.f78942b).m166026I1(m138577M())) {
                e51.m114743H(act(), new Runnable() { // from class: l.cve
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f82658a.m138604o0();
                    }
                }, 100L);
                return;
            } else {
                this.f115138g.requestFocus();
                ((EmailLoginOptAct) this.f78941a).showInput(this.f115138g, 0);
                return;
            }
        }
        if (this.f115126C) {
            xdl0.m208345M0(this.f115144m, true);
            this.f115145n.requestFocus();
        }
        xdl0.m208344M(this.f115153v, false);
        m138570E0();
        this.f115135d.setText(R$string.f16193d2);
        if (xdl0.m208349O0(this.f115144m)) {
            return;
        }
        this.f115138g.requestFocus();
        ((EmailLoginOptAct) this.f78941a).showInput(this.f115138g, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public String m138610u0() {
        VerifyReason verifyReason = (VerifyReason) ((EmailLoginOptAct) this.f78941a).getIntent().getSerializableExtra(Reason.TYPE);
        if (VerifyReason.get(VerifyReason.bind_email).equals(verifyReason)) {
            return "p_account_add_email";
        }
        if (VerifyReason.get(VerifyReason.change_email).equals(verifyReason)) {
            return "p_account_replace_email";
        }
        return m138587W() ? "p_intl_sign_in_email_password_view" : "p_intl_sign_in_email_verification_address_view";
    }

    /* JADX INFO: renamed from: v0 */
    public final void m138611v0() {
        this.f115132I.m109041q(m138610u0());
        boolean z = this.f115156y;
        VLinear vLinear = this.f115137f;
        if (z) {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f115154w, false);
            xdl0.m208344M(this.f115149r, false);
            xdl0.m208344M(this.f115140i, true);
            this.f115136e.setText(R$string.f16199e2);
            if (this.f115130G) {
                this.f115132I.m109031g();
            }
            if (!this.f115131H) {
                this.f115131H = true;
                this.f115133J.m109027c();
            }
            this.f115133J.m109042r();
            return;
        }
        xdl0.m208345M0(vLinear, true);
        m138570E0();
        xdl0.m208344M(this.f115140i, false);
        xdl0.m208344M(this.f115149r, true);
        this.f115136e.setText(R$string.f16187c2);
        if (this.f115131H) {
            this.f115133J.m109031g();
        }
        if (!this.f115130G) {
            this.f115130G = true;
            this.f115132I.m109027c();
        }
        this.f115132I.m109042r();
    }

    /* JADX INFO: renamed from: w0 */
    public void m138612w0() {
        WelcomeAct.f17057f = m138577M();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m138613x0() {
        ((EmailLoginOptAct) this.f78941a).hideInput();
        ((oue) this.f78942b).m166025H1();
        xdl0.m208345M0(this.f115147p, false);
    }

    /* JADX INFO: renamed from: y0 */
    public void m138614y0(CaptchaData captchaData) {
        xdl0.m208345M0(this.f115144m, true);
        this.f115124A = true;
        this.f115145n.setText("");
        this.f115126C = true;
        m138573I();
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(Constants.SEPARATOR_COMMA)[1], 0);
            this.f115146o.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            this.f115146o.setImageBitmap(null);
        }
        e51.m114742G(new Runnable() { // from class: l.que
            @Override // java.lang.Runnable
            public final void run() {
                this.f156478a.m138605p0();
            }
        });
        this.f115156y = false;
        m138609t0(null);
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m138615z0(Throwable th, String str) {
        if (th instanceof TantanException.Client.AccountService) {
            xdl0.m208345M0(this.f115147p, true);
            zvf0.m220368A("e_intl_email_password_signin_wrong_tips", "p_intl_sign_in_email_password_view", vwb.m200311Y("wrong_type", th.getMessage()));
            switch (((TantanException.Client.AccountService) th).code) {
                case 40003:
                case 40010:
                case 400150:
                    this.f115147p.setText(R$string.f16229j2);
                    return true;
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    this.f115147p.setText(R$string.f16223i2);
                    return true;
                case 40013:
                    this.f115147p.setText(R$string.f16162Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f115147p.setText(R$string.f16173a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f115147p.setText(R$string.f16157X);
                    return true;
                case 400114:
                    this.f115147p.setText(R$string.f16173a0);
                    this.f115146o.setImageBitmap(null);
                    ((oue) this.f78942b).m166062v2();
                    return true;
                case 403000:
                    xdl0.m208345M0(this.f115147p, false);
                    C21383yf.m214461b(th);
                    return true;
                default:
                    xdl0.m208345M0(this.f115147p, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l.ive$b */
    public class C17626b implements TextWatcher {
        public C17626b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ive iveVar = ive.this;
            if (iveVar.f115126C) {
                iveVar.m138573I();
                ive iveVar2 = ive.this;
                if (iveVar2.f115124A) {
                    iveVar2.f115124A = false;
                } else {
                    xdl0.m208345M0(iveVar2.f115147p, false);
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
