package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.EmailVerifyCodeView;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class uxe extends jbf0<gxe, EmailVerifyCodeAct> {

    /* JADX INFO: renamed from: c */
    public VScroll f181432c;

    /* JADX INFO: renamed from: d */
    public VText f181433d;

    /* JADX INFO: renamed from: e */
    public VText f181434e;

    /* JADX INFO: renamed from: f */
    public EmailVerifyCodeView f181435f;

    /* JADX INFO: renamed from: g */
    public VText f181436g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f181437h;

    /* JADX INFO: renamed from: i */
    public VText f181438i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f181439j;

    /* JADX INFO: renamed from: k */
    public VImage f181440k;

    /* JADX INFO: renamed from: l */
    public VText f181441l;

    /* JADX INFO: renamed from: m */
    public View f181442m;

    /* JADX INFO: renamed from: n */
    public boolean f181443n;

    /* JADX INFO: renamed from: o */
    public int f181444o;

    /* JADX INFO: renamed from: l.uxe$a */
    public class C20691a extends SVGAAnimListenerAdapter {
        public C20691a() {
        }
    }

    public uxe(@NonNull EmailVerifyCodeAct emailVerifyCodeAct) {
        super(emailVerifyCodeAct);
        this.f181443n = false;
        this.f181444o = 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m198423G(Boolean bool) {
        if (bool.booleanValue()) {
            m198438y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m198424H(View view) {
        ((EmailVerifyCodeAct) this.f119872a).onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m198425I(View view) {
        i4g0.m138520r("e_intl_email_verification_code_resend_button", ((EmailVerifyCodeAct) this.f119872a).pageId());
        m198456z();
        ((gxe) this.f119873b).m132860x1(null);
        bnl0.m105525M0(this.f181436g, false);
    }

    /* JADX INFO: renamed from: P */
    private void m198426P() {
        if (((gxe) this.f119873b).m132848h1()) {
            return;
        }
        i4g0.m138520r("e_intl_email_verification_code_resend_button", ((EmailVerifyCodeAct) this.f119872a).pageId());
        ((gxe) this.f119873b).m132861z1();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m198432p(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    private void m198438y() {
        ((EmailVerifyCodeAct) this.f119872a).postDelayed(new Runnable() { // from class: l.kxe
            @Override // java.lang.Runnable
            public final void run() {
                this.f129186a.m198442E();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: A */
    public int m198439A() {
        return Integer.parseInt(this.f181435f.getText());
    }

    /* JADX INFO: renamed from: B */
    public String m198440B() {
        return "account_sign_" + ((gxe) this.f119873b).f106934f;
    }

    /* JADX INFO: renamed from: C */
    public boolean m198441C() {
        return this.f181443n;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m198442E() {
        int measuredHeight = (((EmailVerifyCodeAct) this.f119872a).getWindow().getDecorView().getMeasuredHeight() - this.f181439j.getMeasuredHeight()) - this.f181432c.getHeight();
        if (measuredHeight > 0) {
            this.f181432c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m198443F() {
        this.f181435f.requestFocus();
        act().showInput(this.f181435f, 0);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m198444J(String str) {
        if (str.length() > 0) {
            bnl0.m105525M0(this.f181436g, false);
        }
        if (!TextUtils.isEmpty(this.f181435f.getText()) && this.f181435f.getText().length() >= 4) {
            m198426P();
        }
        i4g0.m138524v("e_login_verification_code_input", ((EmailVerifyCodeAct) this.f119872a).pageId(), new pf60[0]);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean m198445K(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        i4g0.m138520r("e_login_verification_code_input", ((EmailVerifyCodeAct) this.f119872a).pageId());
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m198446L(View view) {
        i4g0.m138520r("e_intl_email_log_in_with_password_button", ((EmailVerifyCodeAct) this.f119872a).pageId());
        ((gxe) this.f119873b).m132846f1("password_login");
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m198447M() {
        this.f181438i.setTextColor(((EmailVerifyCodeAct) this.f119872a).getResources().getColor(a9c0.f69025j));
        this.f181438i.setEnabled(true);
        this.f181438i.setText(act().getString(R$string.f16865U3));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m198448N(Long l2) {
        this.f181438i.setText(act().getString(R$string.f16865U3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((((long) this.f181444o) - l2.longValue()) - 1) + BLiveStormDanmakuGiftResourceType.f45294s);
    }

    /* JADX INFO: renamed from: O */
    public final void m198449O() {
        this.f181438i.setEnabled(false);
        this.f181438i.setTextColor(((EmailVerifyCodeAct) this.f119872a).getResources().getColor(a9c0.f69023h));
        ((EmailVerifyCodeAct) this.f119872a).duringCreated(l51.m152894N(m198440B(), this.f181444o)).subscribe(psd0.m173598I(new y20() { // from class: l.jxe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123021a.m198448N((Long) obj);
            }
        }, new y20() { // from class: l.lxe
            @Override // p153l.y20
            public final void call(Object obj) {
                uxe.m198432p((Throwable) obj);
            }
        }, new x20() { // from class: l.mxe
            @Override // p153l.x20
            public final void call() {
                this.f139226a.m198447M();
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m198450Q() {
        m198453T();
        m198449O();
    }

    /* JADX INFO: renamed from: R */
    public boolean m198451R(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            bnl0.m105525M0(this.f181436g, true);
            this.f181435f.setText("");
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f181436g.setText(R$string.f16948j2);
                return true;
            }
            if (i == 400114) {
                ((gxe) this.f119873b).m132846f1("show_captcha");
                return true;
            }
            switch (i) {
                case 40013:
                    this.f181436g.setText(R$string.f16881Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f181436g.setText(R$string.f16888Z1);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f181436g.setText(R$string.f16876X);
                    return true;
                default:
                    bnl0.m105525M0(this.f181436g, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public void m198452S() {
        this.f181443n = true;
        this.f181437h.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C20691a());
    }

    /* JADX INFO: renamed from: T */
    public void m198453T() {
        this.f181443n = false;
        this.f181437h.stopAnimCompletely();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f181442m = m198455x(layoutInflater, viewGroup);
        this.f181435f.setPresenter((gxe) this.f119873b);
        return this.f181442m;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: r */
    public void m198454r() {
        ((EmailVerifyCodeAct) this.f119872a).lmdStart(30000);
        VLinear.f210051b.m224310c();
        l51.m152888H(act(), new Runnable() { // from class: l.nxe
            @Override // java.lang.Runnable
            public final void run() {
                this.f144115a.m198443F();
            }
        }, 100L);
        ((gxe) this.f119873b).duringCreated(Act.keyboardListenerObservable(this.f181442m)).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.oxe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149645a.m198423G((Boolean) obj);
            }
        }));
        bnl0.m105509E0(this.f181440k, new View.OnClickListener() { // from class: l.pxe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154565a.m198424H(view);
            }
        });
        if (!l51.m152882B(m198440B()) || ((gxe) this.f119873b).m132851k1()) {
            if (l51.m152882B(m198440B())) {
                l51.m152891K(m198440B());
            }
            this.f181438i.setTextColor(((EmailVerifyCodeAct) this.f119872a).getResources().getColor(a9c0.f69025j));
            this.f181438i.setEnabled(true);
            this.f181438i.setText(act().getString(R$string.f16865U3));
        } else {
            m198449O();
        }
        if (((gxe) this.f119873b).m132851k1()) {
            this.f181433d.setText(R$string.f17015v3);
        }
        bnl0.m105509E0(this.f181438i, new View.OnClickListener() { // from class: l.qxe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160035a.m198425I(view);
            }
        });
        this.f181434e.setText(((EmailVerifyCodeAct) this.f119872a).getString(R$string.f16894a2, ((gxe) this.f119873b).f106934f));
        this.f181435f.setText("");
        this.f181435f.setTextChangeListener(new EmailVerifyCodeView.InterfaceC4787a() { // from class: l.rxe
            @Override // com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.EmailVerifyCodeView.InterfaceC4787a
            /* JADX INFO: renamed from: a */
            public final void mo29629a(String str) {
                this.f165332a.m198444J(str);
            }
        });
        this.f181435f.setOnTouchListener(new View.OnTouchListener() { // from class: l.sxe
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f171129a.m198445K(view, motionEvent);
            }
        });
        bnl0.m105524M(this.f181441l, ((gxe) this.f119873b).m132849i1());
        bnl0.m105509E0(this.f181441l, new View.OnClickListener() { // from class: l.txe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176544a.m198446L(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public View m198455x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vxe.m203843b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public void m198456z() {
        this.f181435f.setText("");
    }
}
