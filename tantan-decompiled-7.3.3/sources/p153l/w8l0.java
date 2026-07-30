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
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.VerifyCodeView;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.VerifyCodeAct;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class w8l0 extends jbf0<g8l0, VerifyCodeAct> {

    /* JADX INFO: renamed from: c */
    public VScroll f187866c;

    /* JADX INFO: renamed from: d */
    public VText f187867d;

    /* JADX INFO: renamed from: e */
    public VText f187868e;

    /* JADX INFO: renamed from: f */
    public VText f187869f;

    /* JADX INFO: renamed from: g */
    public VerifyCodeView f187870g;

    /* JADX INFO: renamed from: h */
    public VText f187871h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f187872i;

    /* JADX INFO: renamed from: j */
    public VText f187873j;

    /* JADX INFO: renamed from: k */
    public VText f187874k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f187875l;

    /* JADX INFO: renamed from: m */
    public VImage f187876m;

    /* JADX INFO: renamed from: n */
    public VImage f187877n;

    /* JADX INFO: renamed from: o */
    public VText f187878o;

    /* JADX INFO: renamed from: p */
    public VText f187879p;

    /* JADX INFO: renamed from: q */
    public View f187880q;

    /* JADX INFO: renamed from: r */
    public boolean f187881r;

    /* JADX INFO: renamed from: s */
    public int f187882s;

    /* JADX INFO: renamed from: l.w8l0$a */
    public class C21046a extends SVGAAnimListenerAdapter {
        public C21046a() {
        }
    }

    public w8l0(@NonNull VerifyCodeAct verifyCodeAct) {
        super(verifyCodeAct);
        this.f187881r = false;
        this.f187882s = 60;
    }

    /* JADX INFO: renamed from: A */
    private void m205421A() {
        boolean z = !TextUtils.isEmpty(this.f187870g.getText()) && this.f187870g.getText().length() >= 4;
        this.f187874k.setEnabled(z);
        VText vText = this.f187874k;
        if (z) {
            vText.setBackgroundResource(bbc0.f75815K1);
        } else {
            vText.setBackgroundResource(bbc0.f75917t1);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m205422B() {
        ((VerifyCodeAct) this.f119872a).postDelayed(new Runnable() { // from class: l.m8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135263a.m205450I();
            }
        }, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m205423K() {
        this.f187870g.requestFocus();
        act().showInput(this.f187870g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m205424L(Boolean bool) {
        if (bool.booleanValue()) {
            m205422B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m205425M(View view) {
        ((VerifyCodeAct) this.f119872a).onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m205426N(View view) {
        i4g0.m138520r("e_login_verification_code_resend", ((VerifyCodeAct) this.f119872a).pageId());
        ((g8l0) this.f119873b).m129443N1(null);
        bnl0.m105525M0(this.f187871h, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m205427O(String str) {
        if (str.length() > 0) {
            bnl0.m105525M0(this.f187871h, false);
        }
        m205421A();
        if (this.f187874k.isEnabled()) {
            m205431V();
        }
        i4g0.m138524v("e_login_verification_code_input", ((VerifyCodeAct) this.f119872a).pageId(), new pf60[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ boolean m205428P(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        i4g0.m138520r("e_login_verification_code_input", ((VerifyCodeAct) this.f119872a).pageId());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m205429Q(View view) {
        i4g0.m138520r("e_login_verification_code_change_number", ((VerifyCodeAct) this.f119872a).pageId());
        ((g8l0) this.f119873b).m129447m1("change_number");
    }

    /* JADX INFO: renamed from: U */
    private void m205430U() {
        this.f187873j.setEnabled(false);
        this.f187873j.setTextColor(((VerifyCodeAct) this.f119872a).getResources().getColor(a9c0.f69023h));
        ((VerifyCodeAct) this.f119872a).duringCreated(l51.m152894N(m205447F(), this.f187882s)).subscribe(psd0.m173598I(new y20() { // from class: l.v8l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182881a.m205454T((Long) obj);
            }
        }, new y20() { // from class: l.k8l0
            @Override // p153l.y20
            public final void call(Object obj) {
                w8l0.m205437p((Throwable) obj);
            }
        }, new x20() { // from class: l.l8l0
            @Override // p153l.x20
            public final void call() {
                this.f130498a.m205453S();
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    private void m205431V() {
        if (((g8l0) this.f119873b).m129448n1()) {
            return;
        }
        if (((g8l0) this.f119873b).m129449o1()) {
            i4g0.m138520r("e_login_verification_code_continue", ((VerifyCodeAct) this.f119872a).pageId());
            ((g8l0) this.f119873b).m129444O1();
        } else if (((g8l0) this.f119873b).m129450p1()) {
            ((g8l0) this.f119873b).m129445P1();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m205437p(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public void m205445C() {
        this.f187870g.setText("");
    }

    /* JADX INFO: renamed from: E */
    public int m205446E() {
        return Integer.parseInt(this.f187870g.getText());
    }

    /* JADX INFO: renamed from: F */
    public String m205447F() {
        return "account_sign_" + ((g8l0) this.f119873b).f102695f + ((g8l0) this.f119873b).f102696g;
    }

    /* JADX INFO: renamed from: G */
    public void m205448G() {
        bnl0.m105509E0(this.f187874k, new View.OnClickListener() { // from class: l.u8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178057a.m205451J(view);
            }
        });
        m205421A();
    }

    /* JADX INFO: renamed from: H */
    public boolean m205449H() {
        return this.f187881r;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m205450I() {
        int measuredHeight = (((VerifyCodeAct) this.f119872a).getWindow().getDecorView().getMeasuredHeight() - this.f187875l.getMeasuredHeight()) - this.f187866c.getHeight();
        if (measuredHeight > 0) {
            this.f187866c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m205451J(View view) {
        m205431V();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m205452R(View view) {
        ((g8l0) this.f119873b).m129447m1("password_login");
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m205453S() {
        this.f187873j.setTextColor(((VerifyCodeAct) this.f119872a).getResources().getColor(a9c0.f69025j));
        this.f187873j.setEnabled(true);
        this.f187873j.setText(act().getString(R$string.f16865U3));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m205454T(Long l2) {
        this.f187873j.setText(act().getString(R$string.f16865U3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((((long) this.f187882s) - l2.longValue()) - 1) + BLiveStormDanmakuGiftResourceType.f45294s);
    }

    /* JADX INFO: renamed from: W */
    public void m205455W() {
        m205458Z();
        m205430U();
    }

    /* JADX INFO: renamed from: X */
    public boolean m205456X(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            bnl0.m105525M0(this.f187871h, true);
            this.f187870g.setText("");
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f187871h.setText(R$string.f16886Z);
                return true;
            }
            if (i == 400114) {
                ((g8l0) this.f119873b).m129447m1("show_captcha");
                return true;
            }
            switch (i) {
                case 40013:
                    this.f187871h.setText(R$string.f16881Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f187871h.setText(R$string.f16892a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f187871h.setText(R$string.f16876X);
                    return true;
                default:
                    bnl0.m105525M0(this.f187871h, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public void m205457Y() {
        this.f187881r = true;
        this.f187872i.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C21046a());
    }

    /* JADX INFO: renamed from: Z */
    public void m205458Z() {
        this.f187881r = false;
        this.f187872i.stopAnimCompletely();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f187880q = m205460z(layoutInflater, viewGroup);
        this.f187870g.setPresenter((g8l0) this.f119873b);
        return this.f187880q;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: r */
    public void m205459r() {
        ((VerifyCodeAct) this.f119872a).lmdStart(30000);
        VLinear.f210051b.m224310c();
        bnl0.m105524M(this.f187878o, AccountModule.f16756c.f17052n);
        bnl0.m105524M(this.f187879p, false);
        bnl0.m105524M(this.f187869f, false);
        l51.m152888H(act(), new Runnable() { // from class: l.j8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f118788a.m205423K();
            }
        }, 100L);
        ((g8l0) this.f119873b).duringCreated(Act.keyboardListenerObservable(this.f187880q)).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.n8l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140695a.m205424L((Boolean) obj);
            }
        }));
        m205448G();
        bnl0.m105509E0(this.f187876m, new View.OnClickListener() { // from class: l.o8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145426a.m205425M(view);
            }
        });
        if (l51.m152882B(m205447F())) {
            m205430U();
        } else {
            this.f187873j.setTextColor(((VerifyCodeAct) this.f119872a).getResources().getColor(a9c0.f69025j));
            this.f187873j.setEnabled(true);
            this.f187873j.setText(act().getString(R$string.f16865U3));
        }
        if (((g8l0) this.f119873b).m129450p1()) {
            this.f187867d.setText(R$string.f17015v3);
            bnl0.m105524M(this.f187869f, false);
        }
        bnl0.m105509E0(this.f187873j, new View.OnClickListener() { // from class: l.p8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151043a.m205426N(view);
            }
        });
        this.f187868e.setText(((VerifyCodeAct) this.f119872a).getString(R$string.f16954k2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((g8l0) this.f119873b).f102696g + "");
        VText vText = this.f187869f;
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(((VerifyCodeAct) this.f119872a).getString(R$string.f16960l2));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        vText.setText(sb.toString());
        this.f187870g.setText("");
        this.f187870g.setTextChangeListener(new VerifyCodeView.InterfaceC4790a() { // from class: l.q8l0
            @Override // com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.VerifyCodeView.InterfaceC4790a
            /* JADX INFO: renamed from: a */
            public final void mo29647a(String str) {
                this.f156142a.m205427O(str);
            }
        });
        this.f187870g.setOnTouchListener(new View.OnTouchListener() { // from class: l.r8l0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f161717a.m205428P(view, motionEvent);
            }
        });
        bnl0.m105509E0(this.f187869f, new View.OnClickListener() { // from class: l.s8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166832a.m205429Q(view);
            }
        });
        bnl0.m105509E0(this.f187878o, new View.OnClickListener() { // from class: l.t8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172552a.m205452R(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public View m205460z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x8l0.m209739b(this, layoutInflater, viewGroup);
    }
}
