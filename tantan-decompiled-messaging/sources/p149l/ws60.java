package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.data.CaptchaData;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import org.slf4j.Marker;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ws60 extends c3f0<yr60, PhoneNumberLoginOptAct> {

    /* JADX INFO: renamed from: A */
    public VText f187869A;

    /* JADX INFO: renamed from: B */
    public boolean f187870B;

    /* JADX INFO: renamed from: C */
    public View f187871C;

    /* JADX INFO: renamed from: D */
    public boolean f187872D;

    /* JADX INFO: renamed from: E */
    public boolean f187873E;

    /* JADX INFO: renamed from: F */
    public boolean f187874F;

    /* JADX INFO: renamed from: G */
    public boolean f187875G;

    /* JADX INFO: renamed from: H */
    public SpannableString f187876H;

    /* JADX INFO: renamed from: I */
    public ClickableSpan f187877I;

    /* JADX INFO: renamed from: J */
    public d30 f187878J;

    /* JADX INFO: renamed from: c */
    public VScroll f187879c;

    /* JADX INFO: renamed from: d */
    public VText f187880d;

    /* JADX INFO: renamed from: e */
    public VText f187881e;

    /* JADX INFO: renamed from: f */
    public VLinear f187882f;

    /* JADX INFO: renamed from: g */
    public VText f187883g;

    /* JADX INFO: renamed from: h */
    public VEditText f187884h;

    /* JADX INFO: renamed from: i */
    public VImage f187885i;

    /* JADX INFO: renamed from: j */
    public VLinear f187886j;

    /* JADX INFO: renamed from: k */
    public VEditText f187887k;

    /* JADX INFO: renamed from: l */
    public VImage f187888l;

    /* JADX INFO: renamed from: m */
    public VImage f187889m;

    /* JADX INFO: renamed from: n */
    public VText f187890n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f187891o;

    /* JADX INFO: renamed from: p */
    public VEditText f187892p;

    /* JADX INFO: renamed from: q */
    public VImage f187893q;

    /* JADX INFO: renamed from: r */
    public VFrame f187894r;

    /* JADX INFO: renamed from: s */
    public VText f187895s;

    /* JADX INFO: renamed from: t */
    public VText f187896t;

    /* JADX INFO: renamed from: u */
    public AnimEffectPlayer f187897u;

    /* JADX INFO: renamed from: v */
    public VText f187898v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f187899w;

    /* JADX INFO: renamed from: x */
    public VImage f187900x;

    /* JADX INFO: renamed from: y */
    public VImage f187901y;

    /* JADX INFO: renamed from: z */
    public VText f187902z;

    /* JADX INFO: renamed from: l.ws60$a */
    public class C20948a extends SVGAAnimListenerAdapter {
        public C20948a() {
        }
    }

    public ws60(@NonNull PhoneNumberLoginOptAct phoneNumberLoginOptAct) {
        super(phoneNumberLoginOptAct);
        this.f187870B = false;
        this.f187872D = false;
        this.f187873E = true;
        this.f187874F = false;
        this.f187875G = false;
    }

    /* JADX INFO: renamed from: A0 */
    private void m205396A0() {
        if (this.f187870B) {
            xdl0.m208344M(this.f187882f, false);
            xdl0.m208344M(this.f187886j, true);
            this.f187890n.setVisibility(0);
            this.f187881e.setText(R$string.f16156W3);
            return;
        }
        this.f187890n.setVisibility(8);
        xdl0.m208345M0(this.f187882f, true);
        xdl0.m208344M(this.f187886j, false);
        this.f187881e.setText(R$string.f16151V3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void m205464r0() {
        ((PhoneNumberLoginOptAct) this.f78941a).hideInput();
        ((yr60) this.f78942b).m215815J1(null);
        xdl0.m208345M0(this.f187896t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m205407M() {
        boolean z = false;
        if (this.f187870B) {
            if (!TextUtils.isEmpty(this.f187887k.getText()) && this.f187887k.getText().length() >= 6 && !TextUtils.isEmpty(this.f187884h.getText())) {
                if (yr60.m215806n1(this.f187884h.getText().toString(), m205446P() == 86)) {
                    z = true;
                }
            }
            this.f187898v.setText(R$string.f16259o2);
        } else {
            if ((!this.f187874F || this.f187892p.getText().length() >= 4) && !TextUtils.isEmpty(this.f187884h.getText())) {
                if (yr60.m215806n1(this.f187884h.getText().toString(), m205446P() == 86)) {
                    z = true;
                }
            }
            this.f187898v.setText(R$string.f16184c);
        }
        this.f187898v.setEnabled(z);
        VText vText = this.f187898v;
        if (z) {
            vText.setBackgroundResource(v2c0.f179409K1);
        } else {
            vText.setBackgroundResource(v2c0.f179511t1);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m205408N() {
        ((PhoneNumberLoginOptAct) this.f78941a).postDelayed(new Runnable() { // from class: l.rs60
            @Override // java.lang.Runnable
            public final void run() {
                this.f160812a.m205410a0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: W */
    private void m205409W() {
        String string;
        int iIndexOf;
        this.f187887k.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.f187887k.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.vs60
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f182802a.m205412e0(view, z);
            }
        });
        this.f187887k.setOnClickListener(new View.OnClickListener() { // from class: l.as60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71390a.m205413f0(view);
            }
        });
        xdl0.m208344M(this.f187888l, false);
        this.f187887k.mo28618i(false).subscribe(mkd0.m154955G(new e30() { // from class: l.bs60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77008a.m205414g0((CharSequence) obj);
            }
        }));
        xdl0.m208329E0(this.f187888l, new View.OnClickListener() { // from class: l.cs60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82327a.m205415h0(view);
            }
        });
        xdl0.m208329E0(this.f187889m, new View.OnClickListener() { // from class: l.ds60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87723a.m205416i0(view);
            }
        });
        this.f187890n.setText(R$string.f16301w3);
        if (!NullChecker.m81305c(this.f187890n, SchemeKey.account, CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(this.f187890n.getText()) || (iIndexOf = (string = this.f187890n.getText().toString()).indexOf(((PhoneNumberLoginOptAct) this.f78941a).string(R$string.f16306x3))) < 0) {
            return;
        }
        this.f187876H = new SpannableString(string);
        this.f187878J = new d30() { // from class: l.es60
            @Override // p149l.d30
            public final void call() {
                this.f92994a.m205457d0();
            }
        };
        this.f187877I = djj0.m112081b(this.f187890n, ((PhoneNumberLoginOptAct) this.f78941a).string(R$string.f16306x3), this.f187876H, iIndexOf, this.f187878J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m205410a0() {
        int measuredHeight = (((PhoneNumberLoginOptAct) this.f78941a).getWindow().getDecorView().getMeasuredHeight() - this.f187899w.getMeasuredHeight()) - this.f187879c.getHeight();
        if (measuredHeight > 0) {
            this.f187879c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m205411c0(View view) {
        m205431w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m205412e0(View view, boolean z) {
        if (z) {
            zvf0.m220396r("e_password_input", ((PhoneNumberLoginOptAct) this.f78941a).pageId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m205413f0(View view) {
        zvf0.m220396r("e_password_input", ((PhoneNumberLoginOptAct) this.f78941a).pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m205414g0(CharSequence charSequence) {
        xdl0.m208344M(this.f187888l, charSequence.length() > 0);
        zvf0.m220400v("e_password_input", ((PhoneNumberLoginOptAct) this.f78941a).pageId(), new j760[0]);
        m205407M();
        if (charSequence.length() > 0) {
            mo103522i(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m205415h0(View view) {
        this.f187887k.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m205416i0(View view) {
        boolean z = this.f187873E;
        this.f187873E = !z;
        this.f187889m.setImageResource(!z ? v2c0.f179478i1 : v2c0.f179481j1);
        this.f187887k.setTransformationMethod(this.f187873E ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
        VEditText vEditText = this.f187887k;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m205422n0(Boolean bool) {
        if (bool.booleanValue()) {
            m205408N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m205423o0(View view) {
        if (!this.f187870B) {
            m205470y0(view);
        } else {
            ((yr60) this.f78942b).m215818O1();
            this.f187870B = !this.f187870B;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m205425p0(View view) {
        ((PhoneNumberLoginOptAct) this.f78941a).onBackPressed();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX INFO: renamed from: w0 */
    private void m205431w0() {
        boolean z;
        if (TextUtils.isEmpty(this.f187884h.getText())) {
            z = false;
        } else {
            if (yr60.m215806n1(this.f187884h.getText().toString(), m205446P() == 86)) {
                z = true;
            } else {
                z = false;
            }
        }
        zvf0.m220399u("e_password_verifypage_signin_button", ((PhoneNumberLoginOptAct) this.f78941a).pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, m205448R()), vwb.m200311Y("code_password_type", this.f187870B ? SignInGrantType.password : "code"));
        if (this.f187870B) {
            boolean z2 = !TextUtils.isEmpty(this.f187887k.getText()) && this.f187887k.getText().length() >= 6;
            if (!z) {
                lsi0.m151578h(R$string.f16167Z);
                return;
            } else if (z2) {
                ((yr60) this.f78942b).m215819P1();
                return;
            } else {
                lsi0.m151578h(R$string.f16135S2);
                return;
            }
        }
        if (e51.m114737B(m205449S())) {
            m205407M();
            xdl0.m208344M(this.f187891o, false);
            ((yr60) this.f78942b).m215818O1();
            return;
        }
        if (!yr60.m215806n1(m205448R(), m205446P() == 86)) {
            lsi0.m151578h(R$string.f16167Z);
        } else if (m205454Y() || ((yr60) this.f78942b).m215821o1()) {
            m205464r0();
        } else {
            ((yr60) this.f78942b).m215820Q1(m205446P(), m205448R(), new d30() { // from class: l.ls60
                @Override // p149l.d30
                public final void call() {
                    this.f129808a.m205462q0();
                }
            }, new d30() { // from class: l.ms60
                @Override // p149l.d30
                public final void call() {
                    this.f135446a.m205464r0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m205435B0() {
        m105017d(this.f187883g, this.f187884h);
    }

    /* JADX INFO: renamed from: E0 */
    public void m205436E0(CaptchaData captchaData) {
        xdl0.m208345M0(this.f187891o, true);
        this.f187872D = true;
        this.f187892p.setText("");
        this.f187874F = true;
        m205407M();
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(Constants.SEPARATOR_COMMA)[1], 0);
            this.f187893q.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            this.f187893q.setImageBitmap(null);
        }
        e51.m114742G(new Runnable() { // from class: l.ps60
            @Override // java.lang.Runnable
            public final void run() {
                this.f150975a.m205466t0();
            }
        });
        boolean z = this.f187870B;
        if (z) {
            m205470y0(null);
        } else {
            this.f187870B = !z;
            m205470y0(null);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m205437G0(Throwable th, String str) {
        if (th instanceof TantanException.Client.AccountService) {
            xdl0.m208345M0(this.f187896t, true);
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f187896t.setText(R$string.f16167Z);
                return true;
            }
            if (i == 400114) {
                this.f187896t.setText(R$string.f16173a0);
                this.f187893q.setImageBitmap(null);
                ((yr60) this.f78942b).m215816L1();
                return true;
            }
            if (i == 403000) {
                xdl0.m208345M0(this.f187896t, false);
                C21383yf.m214461b(th);
                return true;
            }
            switch (i) {
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    this.f187896t.setText(R$string.f16135S2);
                    return true;
                case 40013:
                    this.f187896t.setText(R$string.f16162Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f187896t.setText(R$string.f16173a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f187896t.setText(R$string.f16157X);
                    return true;
                default:
                    xdl0.m208345M0(this.f187896t, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public void m205438H0() {
        m205470y0(null);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m205439I0() {
        this.f187883g.setOnClickListener(new View.OnClickListener() { // from class: l.ss60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166164a.m205468v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public void m205440J0() {
        this.f187875G = true;
        this.f187897u.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C20948a());
    }

    /* JADX INFO: renamed from: K0 */
    public void m205441K0() {
        this.f187875G = false;
        this.f187897u.stopAnimCompletely();
    }

    /* JADX INFO: renamed from: L */
    public View m205442L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xs60.m210732b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L0 */
    public void m205443L0() {
        boolean zEquals = "+86".equals(this.f187883g.getText().toString());
        VEditText vEditText = this.f187884h;
        if (!zEquals) {
            vEditText.setFilters(new InputFilter[0]);
            return;
        }
        vEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
        String string = this.f187884h.getText().toString();
        if (string.length() > 11) {
            this.f187884h.setText(string.substring(0, 11));
            this.f187884h.setSelection(11);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m205444M0() {
        m205441K0();
    }

    /* JADX INFO: renamed from: O */
    public String m205445O() {
        return this.f187892p.getText().toString();
    }

    /* JADX INFO: renamed from: P */
    public int m205446P() {
        return (!NullChecker.m81305c(this.f187883g, SchemeKey.account, CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(this.f187883g.getText())) ? zqb.f204369d.get(0).f204372b : Integer.parseInt(this.f187883g.getText().toString().substring(1));
    }

    /* JADX INFO: renamed from: Q */
    public String m205447Q() {
        return this.f187887k.getText().toString();
    }

    /* JADX INFO: renamed from: R */
    public String m205448R() {
        return yij0.m214935M(this.f187884h);
    }

    /* JADX INFO: renamed from: S */
    public String m205449S() {
        return "account_sign_" + m205446P() + m205448R();
    }

    /* JADX INFO: renamed from: T */
    public void m205450T() {
        this.f187892p.addTextChangedListener(new C20949b());
        xdl0.m208329E0(this.f187893q, new View.OnClickListener() { // from class: l.us60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177943a.m205456b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void m205451U() {
        xdl0.m208329E0(this.f187898v, new View.OnClickListener() { // from class: l.qs60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156104a.m205411c0(view);
            }
        });
        m205407M();
    }

    /* JADX INFO: renamed from: V */
    public void m205452V() {
        boolean zM81303a = NullChecker.m81303a(WelcomeAct.f17059h);
        VText vText = this.f187883g;
        if (zM81303a) {
            vText.setText(WelcomeAct.f17059h);
        } else {
            vText.setText(Marker.ANY_NON_NULL_MARKER + zqb.f204369d.get(0).f204372b);
        }
        m205443L0();
        m205439I0();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: X */
    public void m205453X() {
        this.f187884h.mo28618i(false).subscribe(mkd0.m154955G(new e30() { // from class: l.fs60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99042a.m205471z0((CharSequence) obj);
            }
        }));
        this.f187884h.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.gs60
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f104149a.m205458j0(view, z);
            }
        });
        this.f187884h.setOnClickListener(new View.OnClickListener() { // from class: l.hs60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109304a.m205459k0(view);
            }
        });
        if (NullChecker.m81303a(WelcomeAct.f17058g)) {
            this.f187884h.setText(WelcomeAct.f17058g);
        }
        e51.m114742G(new Runnable() { // from class: l.is60
            @Override // java.lang.Runnable
            public final void run() {
                this.f114735a.m205460l0();
            }
        });
        xdl0.m208344M(this.f187885i, false);
        xdl0.m208329E0(this.f187885i, new View.OnClickListener() { // from class: l.js60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119477a.m205461m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public boolean m205454Y() {
        return xdl0.m208349O0(this.f187891o);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m205455Z() {
        return this.f187875G;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m205456b0(View view) {
        this.f187893q.setImageBitmap(null);
        ((yr60) this.f78942b).m215816L1();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m205457d0() {
        zvf0.m220396r("e_password_verifypage_reset_button", ((PhoneNumberLoginOptAct) this.f78941a).pageId());
        ((yr60) this.f78942b).m215817N1();
    }

    @Override // p149l.c3f0, p149l.s7m
    public void destroy() {
        super.destroy();
        if (NullChecker.m81303a(this.f187876H) && NullChecker.m81303a(this.f187877I)) {
            this.f187876H.removeSpan(this.f187877I);
        }
    }

    @Override // p149l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo103522i(String str) {
        this.f187896t.setText(str);
        xdl0.m208345M0(this.f187896t, !TextUtils.isEmpty(str));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM205442L = m205442L(layoutInflater, viewGroup);
        this.f187871C = viewM205442L;
        return viewM205442L;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m205458j0(View view, boolean z) {
        if (z) {
            zvf0.m220396r("e_phone_input", ((PhoneNumberLoginOptAct) this.f78941a).pageId());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m205459k0(View view) {
        zvf0.m220396r("e_phone_input", ((PhoneNumberLoginOptAct) this.f78941a).pageId());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m205460l0() {
        this.f187884h.requestFocus();
        VEditText vEditText = this.f187884h;
        vEditText.setSelection(vEditText.getText().length());
        ((PhoneNumberLoginOptAct) this.f78941a).showInput(this.f187884h, 0);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m205461m0(View view) {
        this.f187884h.setText("");
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m205462q0() {
        m205470y0(null);
    }

    /* JADX INFO: renamed from: r */
    public void m205463r() {
        ((PhoneNumberLoginOptAct) this.f78941a).lmdStart(30000);
        VLinear.f209129b.m223064c();
        xdl0.m208344M(this.f187869A, false);
        xdl0.m208344M(this.f187881e, false);
        xdl0.m208344M(this.f187896t, false);
        this.f187886j.setVisibility(8);
        xdl0.m208344M(this.f187902z, false);
        ((yr60) this.f78942b).duringCreated(Act.keyboardListenerObservable(this.f187871C)).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.zr60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204459a.m205422n0((Boolean) obj);
            }
        }));
        m205452V();
        m205453X();
        m205450T();
        m205409W();
        m205451U();
        m205396A0();
        xdl0.m208329E0(this.f187902z, new View.OnClickListener() { // from class: l.ks60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124420a.m205423o0(view);
            }
        });
        xdl0.m208329E0(this.f187900x, new View.OnClickListener() { // from class: l.os60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145376a.m205425p0(view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m205465s0() {
        this.f187887k.requestFocus();
        ((PhoneNumberLoginOptAct) this.f78941a).showInput(this.f187887k, 0);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m205466t0() {
        this.f187892p.requestFocus();
        ((PhoneNumberLoginOptAct) this.f78941a).showInput(this.f187892p, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean m205467u0(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        int intExtra = intent.getIntExtra("ccode", 65);
        this.f187883g.setText(Marker.ANY_NON_NULL_MARKER + intExtra);
        m205407M();
        return true;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m205468v0(View view) {
        HoldAct holdact = this.f78941a;
        ((PhoneNumberLoginOptAct) holdact).startActivityForResult(CCodeChooseAct.m28658Y1(holdact), new C4317a.a() { // from class: l.ns60
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f140242a.m205467u0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public void m205469x0() {
        this.f187874F = false;
        m205407M();
        e51.m114749N(m205449S(), 20).subscribe();
        xdl0.m208344M(this.f187891o, false);
        ((yr60) this.f78942b).m215818O1();
    }

    /* JADX INFO: renamed from: y0 */
    public void m205470y0(View view) {
        this.f187870B = !this.f187870B;
        xdl0.m208345M0(this.f187896t, false);
        m205396A0();
        m205407M();
        if (!this.f187870B) {
            if (this.f187874F) {
                xdl0.m208345M0(this.f187891o, true);
                this.f187892p.requestFocus();
            }
            if (NullChecker.m81303a(view)) {
                ((yr60) this.f78942b).f199639e = "verify_code_login";
                zvf0.m220396r("e_password_verifypage_switch_button", ((PhoneNumberLoginOptAct) this.f78941a).pageId());
            }
            xdl0.m208344M(this.f187902z, false);
            this.f187902z.setText(R$string.f16194d3);
            this.f187880d.setText(R$string.f16200e3);
            if (xdl0.m208349O0(this.f187891o)) {
                return;
            }
            this.f187884h.requestFocus();
            ((PhoneNumberLoginOptAct) this.f78941a).showInput(this.f187884h, 0);
            return;
        }
        xdl0.m208344M(this.f187891o, false);
        boolean zM101619m = AccountModule.f16040f.m101619m(String.valueOf(m205446P()));
        VText vText = this.f187902z;
        if (zM101619m) {
            xdl0.m208345M0(vText, true);
            this.f187902z.setText(R$string.f16206f3);
        } else {
            xdl0.m208344M(vText, false);
        }
        this.f187880d.setText(R$string.f16194d3);
        if (yr60.m215806n1(m205448R(), m205446P() == 86)) {
            e51.m114743H(act(), new Runnable() { // from class: l.ts60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171909a.m205465s0();
                }
            }, 100L);
        } else {
            this.f187884h.requestFocus();
            ((PhoneNumberLoginOptAct) this.f78941a).showInput(this.f187884h, 0);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m205471z0(CharSequence charSequence) {
        zvf0.m220400v("e_phone_input", ((PhoneNumberLoginOptAct) this.f78941a).pageId(), new j760[0]);
        xdl0.m208345M0(this.f187896t, false);
        m205407M();
        boolean z = charSequence.length() > 0;
        xdl0.m208344M(this.f187885i, z);
        if (z) {
            this.f187885i.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: l.ws60$b */
    public class C20949b implements TextWatcher {
        public C20949b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ws60 ws60Var = ws60.this;
            if (ws60Var.f187874F) {
                ws60Var.m205407M();
                ws60 ws60Var2 = ws60.this;
                if (ws60Var2.f187872D) {
                    ws60Var2.f187872D = false;
                } else {
                    xdl0.m208345M0(ws60Var2.f187896t, false);
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
