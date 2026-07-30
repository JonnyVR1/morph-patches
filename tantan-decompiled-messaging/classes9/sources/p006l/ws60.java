package p006l;

import android.annotation.SuppressLint;
import android.content.Intent;
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
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.CaptchaData;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zqb;
import l.zvf0;
import v.VEditText;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ws60 extends c3f0<yr60, PhoneNumberLoginOptAct> {

    /* JADX INFO: renamed from: A */
    public VText f25342A;

    /* JADX INFO: renamed from: B */
    public boolean f25343B;

    /* JADX INFO: renamed from: C */
    public View f25344C;

    /* JADX INFO: renamed from: D */
    public boolean f25345D;

    /* JADX INFO: renamed from: E */
    public boolean f25346E;

    /* JADX INFO: renamed from: F */
    public boolean f25347F;

    /* JADX INFO: renamed from: G */
    public boolean f25348G;

    /* JADX INFO: renamed from: H */
    public SpannableString f25349H;

    /* JADX INFO: renamed from: I */
    public ClickableSpan f25350I;

    /* JADX INFO: renamed from: J */
    public d30 f25351J;

    /* JADX INFO: renamed from: c */
    public VScroll f25352c;

    /* JADX INFO: renamed from: d */
    public VText f25353d;

    /* JADX INFO: renamed from: e */
    public VText f25354e;

    /* JADX INFO: renamed from: f */
    public VLinear f25355f;

    /* JADX INFO: renamed from: g */
    public VText f25356g;

    /* JADX INFO: renamed from: h */
    public VEditText f25357h;

    /* JADX INFO: renamed from: i */
    public VImage f25358i;

    /* JADX INFO: renamed from: j */
    public VLinear f25359j;

    /* JADX INFO: renamed from: k */
    public VEditText f25360k;

    /* JADX INFO: renamed from: l */
    public VImage f25361l;

    /* JADX INFO: renamed from: m */
    public VImage f25362m;

    /* JADX INFO: renamed from: n */
    public VText f25363n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f25364o;

    /* JADX INFO: renamed from: p */
    public VEditText f25365p;

    /* JADX INFO: renamed from: q */
    public VImage f25366q;

    /* JADX INFO: renamed from: r */
    public VFrame f25367r;

    /* JADX INFO: renamed from: s */
    public VText f25368s;

    /* JADX INFO: renamed from: t */
    public VText f25369t;

    /* JADX INFO: renamed from: u */
    public AnimEffectPlayer f25370u;

    /* JADX INFO: renamed from: v */
    public VText f25371v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f25372w;

    /* JADX INFO: renamed from: x */
    public VImage f25373x;

    /* JADX INFO: renamed from: y */
    public VImage f25374y;

    /* JADX INFO: renamed from: z */
    public VText f25375z;

    /* JADX INFO: renamed from: l.ws60$a */
    public class C1421a extends SVGAAnimListenerAdapter {
        public C1421a() {
        }
    }

    public ws60(@NonNull PhoneNumberLoginOptAct phoneNumberLoginOptAct) {
        super(phoneNumberLoginOptAct);
        this.f25343B = false;
        this.f25345D = false;
        this.f25346E = true;
        this.f25347F = false;
        this.f25348G = false;
    }

    /* JADX INFO: renamed from: A0 */
    private void m26688A0() {
        if (this.f25343B) {
            xdl0.M(this.f25355f, false);
            xdl0.M(this.f25359j, true);
            this.f25363n.setVisibility(0);
            this.f25354e.setText(R$string.f145W3);
            return;
        }
        this.f25363n.setVisibility(8);
        xdl0.M0(this.f25355f, true);
        xdl0.M(this.f25359j, false);
        this.f25354e.setText(R$string.f140V3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void m26756r0() {
        ((PhoneNumberLoginOptAct) this.f9323a).hideInput();
        ((yr60) this.f9324b).m28356J1(null);
        xdl0.M0(this.f25369t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m26699M() {
        boolean z = false;
        if (this.f25343B) {
            if (!TextUtils.isEmpty(this.f25360k.getText()) && this.f25360k.getText().length() >= 6 && !TextUtils.isEmpty(this.f25357h.getText())) {
                if (yr60.m28347n1(this.f25357h.getText().toString(), m26738P() == 86)) {
                    z = true;
                }
            }
            this.f25371v.setText(R$string.f248o2);
        } else {
            if ((!this.f25347F || this.f25365p.getText().length() >= 4) && !TextUtils.isEmpty(this.f25357h.getText())) {
                if (yr60.m28347n1(this.f25357h.getText().toString(), m26738P() == 86)) {
                    z = true;
                }
            }
            this.f25371v.setText(R$string.f173c);
        }
        this.f25371v.setEnabled(z);
        VText vText = this.f25371v;
        if (z) {
            vText.setBackgroundResource(v2c0.f23973K1);
        } else {
            vText.setBackgroundResource(v2c0.f24075t1);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m26700N() {
        ((PhoneNumberLoginOptAct) this.f9323a).postDelayed(new Runnable() { // from class: l.rs60
            @Override // java.lang.Runnable
            public final void run() {
                this.f20702a.m26702a0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: W */
    private void m26701W() {
        String string;
        int iIndexOf;
        this.f25360k.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.f25360k.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.vs60
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f24440a.m26704e0(view, z);
            }
        });
        this.f25360k.setOnClickListener(new View.OnClickListener() { // from class: l.as60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8465a.m26705f0(view);
            }
        });
        xdl0.M(this.f25361l, false);
        this.f25360k.i(false).subscribe(mkd0.G(new e30() { // from class: l.bs60
            public final void call(Object obj) {
                this.f9062a.m26706g0((CharSequence) obj);
            }
        }));
        xdl0.E0(this.f25361l, new View.OnClickListener() { // from class: l.cs60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9806a.m26707h0(view);
            }
        });
        xdl0.E0(this.f25362m, new View.OnClickListener() { // from class: l.ds60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10546a.m26708i0(view);
            }
        });
        this.f25363n.setText(R$string.f290w3);
        if (!NullChecker.c(this.f25363n, "account", CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(this.f25363n.getText()) || (iIndexOf = (string = this.f25363n.getText().toString()).indexOf(((PhoneNumberLoginOptAct) this.f9323a).string(R$string.f295x3))) < 0) {
            return;
        }
        this.f25349H = new SpannableString(string);
        this.f25351J = new d30() { // from class: l.es60
            public final void call() {
                this.f11418a.m26749d0();
            }
        };
        this.f25350I = djj0.m14044b(this.f25363n, ((PhoneNumberLoginOptAct) this.f9323a).string(R$string.f295x3), this.f25349H, iIndexOf, this.f25351J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m26702a0() {
        int measuredHeight = (((PhoneNumberLoginOptAct) this.f9323a).getWindow().getDecorView().getMeasuredHeight() - this.f25372w.getMeasuredHeight()) - this.f25352c.getHeight();
        if (measuredHeight > 0) {
            this.f25352c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m26703c0(View view) {
        m26723w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m26704e0(View view, boolean z) {
        if (z) {
            zvf0.r("e_password_input", ((PhoneNumberLoginOptAct) this.f9323a).pageId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m26705f0(View view) {
        zvf0.r("e_password_input", ((PhoneNumberLoginOptAct) this.f9323a).pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m26706g0(CharSequence charSequence) {
        xdl0.M(this.f25361l, charSequence.length() > 0);
        zvf0.v("e_password_input", ((PhoneNumberLoginOptAct) this.f9323a).pageId(), new j760[0]);
        m26699M();
        if (charSequence.length() > 0) {
            mo12892i(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m26707h0(View view) {
        this.f25360k.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m26708i0(View view) {
        boolean z = this.f25346E;
        this.f25346E = !z;
        this.f25362m.setImageResource(!z ? v2c0.f24042i1 : v2c0.f24045j1);
        this.f25360k.setTransformationMethod(this.f25346E ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
        VEditText vEditText = this.f25360k;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m26714n0(Boolean bool) {
        if (bool.booleanValue()) {
            m26700N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m26715o0(View view) {
        if (!this.f25343B) {
            m26762y0(view);
        } else {
            ((yr60) this.f9324b).m28359O1();
            this.f25343B = !this.f25343B;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m26717p0(View view) {
        ((PhoneNumberLoginOptAct) this.f9323a).onBackPressed();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX INFO: renamed from: w0 */
    private void m26723w0() {
        boolean z;
        if (TextUtils.isEmpty(this.f25357h.getText())) {
            z = false;
        } else {
            if (yr60.m28347n1(this.f25357h.getText().toString(), m26738P() == 86)) {
                z = true;
            } else {
                z = false;
            }
        }
        zvf0.u("e_password_verifypage_signin_button", ((PhoneNumberLoginOptAct) this.f9323a).pageId(), new j760[]{vwb.Y("phone_num", m26740R()), vwb.Y("code_password_type", this.f25343B ? "password" : "code")});
        if (this.f25343B) {
            boolean z2 = !TextUtils.isEmpty(this.f25360k.getText()) && this.f25360k.getText().length() >= 6;
            if (!z) {
                lsi0.h(R$string.f156Z);
                return;
            } else if (z2) {
                ((yr60) this.f9324b).m28360P1();
                return;
            } else {
                lsi0.h(R$string.f124S2);
                return;
            }
        }
        if (e51.B(m26741S())) {
            m26699M();
            xdl0.M(this.f25364o, false);
            ((yr60) this.f9324b).m28359O1();
            return;
        }
        if (!yr60.m28347n1(m26740R(), m26738P() == 86)) {
            lsi0.h(R$string.f156Z);
        } else if (m26746Y() || ((yr60) this.f9324b).m28362o1()) {
            m26756r0();
        } else {
            ((yr60) this.f9324b).m28361Q1(m26738P(), m26740R(), new d30() { // from class: l.ls60
                public final void call() {
                    this.f16613a.m26754q0();
                }
            }, new d30() { // from class: l.ms60
                public final void call() {
                    this.f17219a.m26756r0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m26727B0() {
        m13095d(this.f25356g, this.f25357h);
    }

    /* JADX INFO: renamed from: E0 */
    public void m26728E0(CaptchaData captchaData) {
        xdl0.M0(this.f25364o, true);
        this.f25345D = true;
        this.f25365p.setText("");
        this.f25347F = true;
        m26699M();
        try {
            byte[] bArrDecode = Base64.decode(captchaData.images.chars.content.split(",")[1], 0);
            this.f25366q.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            CrashHelper.c(e);
            this.f25366q.setImageBitmap((Bitmap) null);
        }
        e51.G(new Runnable() { // from class: l.ps60
            @Override // java.lang.Runnable
            public final void run() {
                this.f19279a.m26758t0();
            }
        });
        boolean z = this.f25343B;
        if (z) {
            m26762y0(null);
        } else {
            this.f25343B = !z;
            m26762y0(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public boolean m26729G0(Throwable th, String str) {
        if (th instanceof TantanException.Client.AccountService) {
            xdl0.M0(this.f25369t, true);
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f25369t.setText(R$string.f156Z);
                return true;
            }
            if (i == 400114) {
                this.f25369t.setText(R$string.f162a0);
                this.f25366q.setImageBitmap((Bitmap) null);
                ((yr60) this.f9324b).m28357L1();
                return true;
            }
            if (i == 403000) {
                xdl0.M0(this.f25369t, false);
                C1478yf.m28232b(th);
                return true;
            }
            switch (i) {
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    this.f25369t.setText(R$string.f124S2);
                    return true;
                case 40013:
                    this.f25369t.setText(R$string.f151Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f25369t.setText(R$string.f162a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f25369t.setText(R$string.f146X);
                    return true;
                default:
                    xdl0.M0(this.f25369t, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public void m26730H0() {
        m26762y0(null);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m26731I0() {
        this.f25356g.setOnClickListener(new View.OnClickListener() { // from class: l.ss60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21631a.m26760v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public void m26732J0() {
        this.f25348G = true;
        this.f25370u.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C1421a());
    }

    /* JADX INFO: renamed from: K0 */
    public void m26733K0() {
        this.f25348G = false;
        this.f25370u.stopAnimCompletely();
    }

    /* JADX INFO: renamed from: L */
    public View m26734L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xs60.m27603b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L0 */
    public void m26735L0() {
        boolean zEquals = "+86".equals(this.f25356g.getText().toString());
        VEditText vEditText = this.f25357h;
        if (!zEquals) {
            vEditText.setFilters(new InputFilter[0]);
            return;
        }
        vEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
        String string = this.f25357h.getText().toString();
        if (string.length() > 11) {
            this.f25357h.setText(string.substring(0, 11));
            this.f25357h.setSelection(11);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m26736M0() {
        m26733K0();
    }

    /* JADX INFO: renamed from: O */
    public String m26737O() {
        return this.f25365p.getText().toString();
    }

    /* JADX INFO: renamed from: P */
    public int m26738P() {
        return (!NullChecker.c(this.f25356g, "account", CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(this.f25356g.getText())) ? ((zqb) zqb.d.get(0)).b : Integer.parseInt(this.f25356g.getText().toString().substring(1));
    }

    /* JADX INFO: renamed from: Q */
    public String m26739Q() {
        return this.f25360k.getText().toString();
    }

    /* JADX INFO: renamed from: R */
    public String m26740R() {
        return yij0.M(this.f25357h);
    }

    /* JADX INFO: renamed from: S */
    public String m26741S() {
        return "account_sign_" + m26738P() + m26740R();
    }

    /* JADX INFO: renamed from: T */
    public void m26742T() {
        this.f25365p.addTextChangedListener(new C1422b());
        xdl0.E0(this.f25366q, new View.OnClickListener() { // from class: l.us60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23725a.m26748b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void m26743U() {
        xdl0.E0(this.f25371v, new View.OnClickListener() { // from class: l.qs60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20004a.m26703c0(view);
            }
        });
        m26699M();
    }

    /* JADX INFO: renamed from: V */
    public void m26744V() {
        boolean zA = NullChecker.a(WelcomeAct.f1048h);
        VText vText = this.f25356g;
        if (zA) {
            vText.setText(WelcomeAct.f1048h);
        } else {
            vText.setText("+" + ((zqb) zqb.d.get(0)).b);
        }
        m26735L0();
        m26731I0();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: X */
    public void m26745X() {
        this.f25357h.i(false).subscribe(mkd0.G(new e30() { // from class: l.fs60
            public final void call(Object obj) {
                this.f12878a.m26763z0((CharSequence) obj);
            }
        }));
        this.f25357h.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.gs60
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f13468a.m26750j0(view, z);
            }
        });
        this.f25357h.setOnClickListener(new View.OnClickListener() { // from class: l.hs60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14032a.m26751k0(view);
            }
        });
        if (NullChecker.a(WelcomeAct.f1047g)) {
            this.f25357h.setText(WelcomeAct.f1047g);
        }
        e51.G(new Runnable() { // from class: l.is60
            @Override // java.lang.Runnable
            public final void run() {
                this.f14728a.m26752l0();
            }
        });
        xdl0.M(this.f25358i, false);
        xdl0.E0(this.f25358i, new View.OnClickListener() { // from class: l.js60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15369a.m26753m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public boolean m26746Y() {
        return xdl0.O0(this.f25364o);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m26747Z() {
        return this.f25348G;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m26748b0(View view) {
        this.f25366q.setImageBitmap((Bitmap) null);
        ((yr60) this.f9324b).m28357L1();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m26749d0() {
        zvf0.r("e_password_verifypage_reset_button", ((PhoneNumberLoginOptAct) this.f9323a).pageId());
        ((yr60) this.f9324b).m28358N1();
    }

    @Override // p006l.c3f0
    public void destroy() {
        super.destroy();
        if (NullChecker.a(this.f25349H) && NullChecker.a(this.f25350I)) {
            this.f25349H.removeSpan(this.f25350I);
        }
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo12892i(String str) {
        this.f25369t.setText(str);
        xdl0.M0(this.f25369t, !TextUtils.isEmpty(str));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM26734L = m26734L(layoutInflater, viewGroup);
        this.f25344C = viewM26734L;
        return viewM26734L;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m26750j0(View view, boolean z) {
        if (z) {
            zvf0.r("e_phone_input", ((PhoneNumberLoginOptAct) this.f9323a).pageId());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m26751k0(View view) {
        zvf0.r("e_phone_input", ((PhoneNumberLoginOptAct) this.f9323a).pageId());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m26752l0() {
        this.f25357h.requestFocus();
        VEditText vEditText = this.f25357h;
        vEditText.setSelection(vEditText.getText().length());
        ((PhoneNumberLoginOptAct) this.f9323a).showInput(this.f25357h, 0);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m26753m0(View view) {
        this.f25357h.setText("");
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m26754q0() {
        m26762y0(null);
    }

    /* JADX INFO: renamed from: r */
    public void m26755r() {
        ((PhoneNumberLoginOptAct) this.f9323a).lmdStart(30000);
        VLinear.b.c();
        xdl0.M(this.f25342A, false);
        xdl0.M(this.f25354e, false);
        xdl0.M(this.f25369t, false);
        this.f25359j.setVisibility(8);
        xdl0.M(this.f25375z, false);
        ((yr60) this.f9324b).duringCreated(Act.keyboardListenerObservable(this.f25344C)).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.zr60
            public final void call(Object obj) {
                this.f28917a.m26714n0((Boolean) obj);
            }
        }));
        m26744V();
        m26745X();
        m26742T();
        m26701W();
        m26743U();
        m26688A0();
        xdl0.E0(this.f25375z, new View.OnClickListener() { // from class: l.ks60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15977a.m26715o0(view);
            }
        });
        xdl0.E0(this.f25373x, new View.OnClickListener() { // from class: l.os60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18355a.m26717p0(view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m26757s0() {
        this.f25360k.requestFocus();
        ((PhoneNumberLoginOptAct) this.f9323a).showInput(this.f25360k, 0);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m26758t0() {
        this.f25365p.requestFocus();
        ((PhoneNumberLoginOptAct) this.f9323a).showInput(this.f25365p, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean m26759u0(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        int intExtra = intent.getIntExtra("ccode", 65);
        this.f25356g.setText("+" + intExtra);
        m26699M();
        return true;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m26760v0(View view) {
        HoldAct holdact = this.f9323a;
        ((PhoneNumberLoginOptAct) holdact).startActivityForResult(CCodeChooseAct.m557Y1(holdact), new a.a() { // from class: l.ns60
            /* JADX INFO: renamed from: a */
            public final boolean m20199a(int i, int i2, Intent intent) {
                return this.f17830a.m26759u0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public void m26761x0() {
        this.f25347F = false;
        m26699M();
        e51.N(m26741S(), 20).subscribe();
        xdl0.M(this.f25364o, false);
        ((yr60) this.f9324b).m28359O1();
    }

    /* JADX INFO: renamed from: y0 */
    public void m26762y0(View view) {
        this.f25343B = !this.f25343B;
        xdl0.M0(this.f25369t, false);
        m26688A0();
        m26699M();
        if (!this.f25343B) {
            if (this.f25347F) {
                xdl0.M0(this.f25364o, true);
                this.f25365p.requestFocus();
            }
            if (NullChecker.a(view)) {
                ((yr60) this.f9324b).f28349e = "verify_code_login";
                zvf0.r("e_password_verifypage_switch_button", ((PhoneNumberLoginOptAct) this.f9323a).pageId());
            }
            xdl0.M(this.f25375z, false);
            this.f25375z.setText(R$string.f183d3);
            this.f25353d.setText(R$string.f189e3);
            if (xdl0.O0(this.f25364o)) {
                return;
            }
            this.f25357h.requestFocus();
            ((PhoneNumberLoginOptAct) this.f9323a).showInput(this.f25357h, 0);
            return;
        }
        xdl0.M(this.f25364o, false);
        boolean zM12622m = AccountModule.f29f.m12622m(String.valueOf(m26738P()));
        VText vText = this.f25375z;
        if (zM12622m) {
            xdl0.M0(vText, true);
            this.f25375z.setText(R$string.f195f3);
        } else {
            xdl0.M(vText, false);
        }
        this.f25353d.setText(R$string.f183d3);
        if (yr60.m28347n1(m26740R(), m26738P() == 86)) {
            e51.H(act(), new Runnable() { // from class: l.ts60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22256a.m26757s0();
                }
            }, 100L);
        } else {
            this.f25357h.requestFocus();
            ((PhoneNumberLoginOptAct) this.f9323a).showInput(this.f25357h, 0);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m26763z0(CharSequence charSequence) {
        zvf0.v("e_phone_input", ((PhoneNumberLoginOptAct) this.f9323a).pageId(), new j760[0]);
        xdl0.M0(this.f25369t, false);
        m26699M();
        boolean z = charSequence.length() > 0;
        xdl0.M(this.f25358i, z);
        if (z) {
            this.f25358i.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: l.ws60$b */
    public class C1422b implements TextWatcher {
        public C1422b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ws60 ws60Var = ws60.this;
            if (ws60Var.f25347F) {
                ws60Var.m26699M();
                ws60 ws60Var2 = ws60.this;
                if (ws60Var2.f25345D) {
                    ws60Var2.f25345D = false;
                } else {
                    xdl0.M0(ws60Var2.f25369t, false);
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
