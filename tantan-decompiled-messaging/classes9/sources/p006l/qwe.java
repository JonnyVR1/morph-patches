package p006l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.EmailVerifyCodeView;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.Act;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qwe extends c3f0<cwe, EmailVerifyCodeAct> {

    /* JADX INFO: renamed from: c */
    public VScroll f20104c;

    /* JADX INFO: renamed from: d */
    public VText f20105d;

    /* JADX INFO: renamed from: e */
    public VText f20106e;

    /* JADX INFO: renamed from: f */
    public EmailVerifyCodeView f20107f;

    /* JADX INFO: renamed from: g */
    public VText f20108g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f20109h;

    /* JADX INFO: renamed from: i */
    public VText f20110i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f20111j;

    /* JADX INFO: renamed from: k */
    public VImage f20112k;

    /* JADX INFO: renamed from: l */
    public VText f20113l;

    /* JADX INFO: renamed from: m */
    public View f20114m;

    /* JADX INFO: renamed from: n */
    public boolean f20115n;

    /* JADX INFO: renamed from: o */
    public int f20116o;

    /* JADX INFO: renamed from: l.qwe$a */
    public class C1192a extends SVGAAnimListenerAdapter {
        public C1192a() {
        }
    }

    public qwe(@NonNull EmailVerifyCodeAct emailVerifyCodeAct) {
        super(emailVerifyCodeAct);
        this.f20115n = false;
        this.f20116o = 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m22430G(Boolean bool) {
        if (bool.booleanValue()) {
            m22445y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m22431H(View view) {
        ((EmailVerifyCodeAct) this.f9323a).onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m22432I(View view) {
        zvf0.r("e_intl_email_verification_code_resend_button", ((EmailVerifyCodeAct) this.f9323a).pageId());
        m22463z();
        ((cwe) this.f9324b).m13679x1(null);
        xdl0.M0(this.f20108g, false);
    }

    /* JADX INFO: renamed from: P */
    private void m22433P() {
        if (((cwe) this.f9324b).m13667h1()) {
            return;
        }
        zvf0.r("e_intl_email_verification_code_resend_button", ((EmailVerifyCodeAct) this.f9323a).pageId());
        ((cwe) this.f9324b).m13680z1();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m22439p(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    private void m22445y() {
        ((EmailVerifyCodeAct) this.f9323a).postDelayed(new Runnable() { // from class: l.gwe
            @Override // java.lang.Runnable
            public final void run() {
                this.f13548a.m22449E();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: A */
    public int m22446A() {
        return Integer.parseInt(this.f20107f.getText());
    }

    /* JADX INFO: renamed from: B */
    public String m22447B() {
        return "account_sign_" + ((cwe) this.f9324b).f9887f;
    }

    /* JADX INFO: renamed from: C */
    public boolean m22448C() {
        return this.f20115n;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m22449E() {
        int measuredHeight = (((EmailVerifyCodeAct) this.f9323a).getWindow().getDecorView().getMeasuredHeight() - this.f20111j.getMeasuredHeight()) - this.f20104c.getHeight();
        if (measuredHeight > 0) {
            this.f20104c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m22450F() {
        this.f20107f.requestFocus();
        act().showInput(this.f20107f, 0);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22451J(String str) {
        if (str.length() > 0) {
            xdl0.M0(this.f20108g, false);
        }
        if (!TextUtils.isEmpty(this.f20107f.getText()) && this.f20107f.getText().length() >= 4) {
            m22433P();
        }
        zvf0.v("e_login_verification_code_input", ((EmailVerifyCodeAct) this.f9323a).pageId(), new j760[0]);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean m22452K(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        zvf0.r("e_login_verification_code_input", ((EmailVerifyCodeAct) this.f9323a).pageId());
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m22453L(View view) {
        zvf0.r("e_intl_email_log_in_with_password_button", ((EmailVerifyCodeAct) this.f9323a).pageId());
        ((cwe) this.f9324b).m13665f1("password_login");
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m22454M() {
        this.f20110i.setTextColor(((EmailVerifyCodeAct) this.f9323a).getResources().getColor(u0c0.f22403j));
        this.f20110i.setEnabled(true);
        this.f20110i.setText(act().getString(R$string.f135U3));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m22455N(Long l2) {
        this.f20110i.setText(act().getString(R$string.f135U3) + " " + ((((long) this.f20116o) - l2.longValue()) - 1) + "s");
    }

    /* JADX INFO: renamed from: O */
    public final void m22456O() {
        this.f20110i.setEnabled(false);
        this.f20110i.setTextColor(((EmailVerifyCodeAct) this.f9323a).getResources().getColor(u0c0.f22401h));
        ((EmailVerifyCodeAct) this.f9323a).duringCreated(e51.N(m22447B(), this.f20116o)).subscribe(mkd0.I(new e30() { // from class: l.fwe
            public final void call(Object obj) {
                this.f12945a.m22455N((Long) obj);
            }
        }, new e30() { // from class: l.hwe
            public final void call(Object obj) {
                qwe.m22439p((Throwable) obj);
            }
        }, new d30() { // from class: l.iwe
            public final void call() {
                this.f14849a.m22454M();
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m22457Q() {
        m22460T();
        m22456O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public boolean m22458R(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            xdl0.M0(this.f20108g, true);
            this.f20107f.setText("");
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f20108g.setText(R$string.f218j2);
                return true;
            }
            if (i == 400114) {
                ((cwe) this.f9324b).m13665f1("show_captcha");
                return true;
            }
            switch (i) {
                case 40013:
                    this.f20108g.setText(R$string.f151Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f20108g.setText(R$string.f158Z1);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f20108g.setText(R$string.f146X);
                    return true;
                default:
                    xdl0.M0(this.f20108g, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public void m22459S() {
        this.f20115n = true;
        this.f20109h.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C1192a());
    }

    /* JADX INFO: renamed from: T */
    public void m22460T() {
        this.f20115n = false;
        this.f20109h.stopAnimCompletely();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f20114m = m22462x(layoutInflater, viewGroup);
        this.f20107f.setPresenter((cwe) this.f9324b);
        return this.f20114m;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: r */
    public void m22461r() {
        ((EmailVerifyCodeAct) this.f9323a).lmdStart(30000);
        VLinear.b.c();
        e51.H(act(), new Runnable() { // from class: l.jwe
            @Override // java.lang.Runnable
            public final void run() {
                this.f15466a.m22450F();
            }
        }, 100L);
        ((cwe) this.f9324b).duringCreated(Act.keyboardListenerObservable(this.f20114m)).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.kwe
            public final void call(Object obj) {
                this.f16023a.m22430G((Boolean) obj);
            }
        }));
        xdl0.E0(this.f20112k, new View.OnClickListener() { // from class: l.lwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16687a.m22431H(view);
            }
        });
        if (!e51.B(m22447B()) || ((cwe) this.f9324b).m13670k1()) {
            if (e51.B(m22447B())) {
                e51.K(m22447B());
            }
            this.f20110i.setTextColor(((EmailVerifyCodeAct) this.f9323a).getResources().getColor(u0c0.f22403j));
            this.f20110i.setEnabled(true);
            this.f20110i.setText(act().getString(R$string.f135U3));
        } else {
            m22456O();
        }
        if (((cwe) this.f9324b).m13670k1()) {
            this.f20105d.setText(R$string.f285v3);
        }
        xdl0.E0(this.f20110i, new View.OnClickListener() { // from class: l.mwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17321a.m22432I(view);
            }
        });
        this.f20106e.setText(((EmailVerifyCodeAct) this.f9323a).getString(R$string.f164a2, ((cwe) this.f9324b).f9887f));
        this.f20107f.setText("");
        this.f20107f.setTextChangeListener(new EmailVerifyCodeView.InterfaceC0062a() { // from class: l.nwe
            @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.EmailVerifyCodeView.InterfaceC0062a
            /* JADX INFO: renamed from: a */
            public final void mo527a(String str) {
                this.f17905a.m22451J(str);
            }
        });
        this.f20107f.setOnTouchListener(new View.OnTouchListener() { // from class: l.owe
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f18461a.m22452K(view, motionEvent);
            }
        });
        xdl0.M(this.f20113l, ((cwe) this.f9324b).m13668i1());
        xdl0.E0(this.f20113l, new View.OnClickListener() { // from class: l.pwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19394a.m22453L(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public View m22462x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rwe.m23341b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public void m22463z() {
        this.f20107f.setText("");
    }
}
