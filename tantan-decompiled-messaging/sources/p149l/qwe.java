package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.EmailVerifyCodeView;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class qwe extends c3f0<cwe, EmailVerifyCodeAct> {

    /* JADX INFO: renamed from: c */
    public VScroll f156681c;

    /* JADX INFO: renamed from: d */
    public VText f156682d;

    /* JADX INFO: renamed from: e */
    public VText f156683e;

    /* JADX INFO: renamed from: f */
    public EmailVerifyCodeView f156684f;

    /* JADX INFO: renamed from: g */
    public VText f156685g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f156686h;

    /* JADX INFO: renamed from: i */
    public VText f156687i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f156688j;

    /* JADX INFO: renamed from: k */
    public VImage f156689k;

    /* JADX INFO: renamed from: l */
    public VText f156690l;

    /* JADX INFO: renamed from: m */
    public View f156691m;

    /* JADX INFO: renamed from: n */
    public boolean f156692n;

    /* JADX INFO: renamed from: o */
    public int f156693o;

    /* JADX INFO: renamed from: l.qwe$a */
    public class C19598a extends SVGAAnimListenerAdapter {
        public C19598a() {
        }
    }

    public qwe(@NonNull EmailVerifyCodeAct emailVerifyCodeAct) {
        super(emailVerifyCodeAct);
        this.f156692n = false;
        this.f156693o = 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m176790G(Boolean bool) {
        if (bool.booleanValue()) {
            m176805y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m176791H(View view) {
        ((EmailVerifyCodeAct) this.f78941a).onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m176792I(View view) {
        zvf0.m220396r("e_intl_email_verification_code_resend_button", ((EmailVerifyCodeAct) this.f78941a).pageId());
        m176823z();
        ((cwe) this.f78942b).m109022x1(null);
        xdl0.m208345M0(this.f156685g, false);
    }

    /* JADX INFO: renamed from: P */
    private void m176793P() {
        if (((cwe) this.f78942b).m109010h1()) {
            return;
        }
        zvf0.m220396r("e_intl_email_verification_code_resend_button", ((EmailVerifyCodeAct) this.f78941a).pageId());
        ((cwe) this.f78942b).m109023z1();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m176799p(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    private void m176805y() {
        ((EmailVerifyCodeAct) this.f78941a).postDelayed(new Runnable() { // from class: l.gwe
            @Override // java.lang.Runnable
            public final void run() {
                this.f104700a.m176809E();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: A */
    public int m176806A() {
        return Integer.parseInt(this.f156684f.getText());
    }

    /* JADX INFO: renamed from: B */
    public String m176807B() {
        return "account_sign_" + ((cwe) this.f78942b).f82778f;
    }

    /* JADX INFO: renamed from: C */
    public boolean m176808C() {
        return this.f156692n;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m176809E() {
        int measuredHeight = (((EmailVerifyCodeAct) this.f78941a).getWindow().getDecorView().getMeasuredHeight() - this.f156688j.getMeasuredHeight()) - this.f156681c.getHeight();
        if (measuredHeight > 0) {
            this.f156681c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m176810F() {
        this.f156684f.requestFocus();
        act().showInput(this.f156684f, 0);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m176811J(String str) {
        if (str.length() > 0) {
            xdl0.m208345M0(this.f156685g, false);
        }
        if (!TextUtils.isEmpty(this.f156684f.getText()) && this.f156684f.getText().length() >= 4) {
            m176793P();
        }
        zvf0.m220400v("e_login_verification_code_input", ((EmailVerifyCodeAct) this.f78941a).pageId(), new j760[0]);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean m176812K(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        zvf0.m220396r("e_login_verification_code_input", ((EmailVerifyCodeAct) this.f78941a).pageId());
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m176813L(View view) {
        zvf0.m220396r("e_intl_email_log_in_with_password_button", ((EmailVerifyCodeAct) this.f78941a).pageId());
        ((cwe) this.f78942b).m109008f1("password_login");
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m176814M() {
        this.f156687i.setTextColor(((EmailVerifyCodeAct) this.f78941a).getResources().getColor(u0c0.f172889j));
        this.f156687i.setEnabled(true);
        this.f156687i.setText(act().getString(R$string.f16146U3));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m176815N(Long l2) {
        this.f156687i.setText(act().getString(R$string.f16146U3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((((long) this.f156693o) - l2.longValue()) - 1) + BLiveStormDanmakuGiftResourceType.f44446s);
    }

    /* JADX INFO: renamed from: O */
    public final void m176816O() {
        this.f156687i.setEnabled(false);
        this.f156687i.setTextColor(((EmailVerifyCodeAct) this.f78941a).getResources().getColor(u0c0.f172887h));
        ((EmailVerifyCodeAct) this.f78941a).duringCreated(e51.m114749N(m176807B(), this.f156693o)).subscribe(mkd0.m154957I(new e30() { // from class: l.fwe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99645a.m176815N((Long) obj);
            }
        }, new e30() { // from class: l.hwe
            @Override // p149l.e30
            public final void call(Object obj) {
                qwe.m176799p((Throwable) obj);
            }
        }, new d30() { // from class: l.iwe
            @Override // p149l.d30
            public final void call() {
                this.f115265a.m176814M();
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m176817Q() {
        m176820T();
        m176816O();
    }

    /* JADX INFO: renamed from: R */
    public boolean m176818R(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            xdl0.m208345M0(this.f156685g, true);
            this.f156684f.setText("");
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f156685g.setText(R$string.f16229j2);
                return true;
            }
            if (i == 400114) {
                ((cwe) this.f78942b).m109008f1("show_captcha");
                return true;
            }
            switch (i) {
                case 40013:
                    this.f156685g.setText(R$string.f16162Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f156685g.setText(R$string.f16169Z1);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f156685g.setText(R$string.f16157X);
                    return true;
                default:
                    xdl0.m208345M0(this.f156685g, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public void m176819S() {
        this.f156692n = true;
        this.f156686h.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C19598a());
    }

    /* JADX INFO: renamed from: T */
    public void m176820T() {
        this.f156692n = false;
        this.f156686h.stopAnimCompletely();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f156691m = m176822x(layoutInflater, viewGroup);
        this.f156684f.setPresenter((cwe) this.f78942b);
        return this.f156691m;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: r */
    public void m176821r() {
        ((EmailVerifyCodeAct) this.f78941a).lmdStart(30000);
        VLinear.f209129b.m223064c();
        e51.m114743H(act(), new Runnable() { // from class: l.jwe
            @Override // java.lang.Runnable
            public final void run() {
                this.f120077a.m176810F();
            }
        }, 100L);
        ((cwe) this.f78942b).duringCreated(Act.keyboardListenerObservable(this.f156691m)).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.kwe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124973a.m176790G((Boolean) obj);
            }
        }));
        xdl0.m208329E0(this.f156689k, new View.OnClickListener() { // from class: l.lwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130263a.m176791H(view);
            }
        });
        if (!e51.m114737B(m176807B()) || ((cwe) this.f78942b).m109013k1()) {
            if (e51.m114737B(m176807B())) {
                e51.m114746K(m176807B());
            }
            this.f156687i.setTextColor(((EmailVerifyCodeAct) this.f78941a).getResources().getColor(u0c0.f172889j));
            this.f156687i.setEnabled(true);
            this.f156687i.setText(act().getString(R$string.f16146U3));
        } else {
            m176816O();
        }
        if (((cwe) this.f78942b).m109013k1()) {
            this.f156682d.setText(R$string.f16296v3);
        }
        xdl0.m208329E0(this.f156687i, new View.OnClickListener() { // from class: l.mwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136046a.m176792I(view);
            }
        });
        this.f156683e.setText(((EmailVerifyCodeAct) this.f78941a).getString(R$string.f16175a2, ((cwe) this.f78942b).f82778f));
        this.f156684f.setText("");
        this.f156684f.setTextChangeListener(new EmailVerifyCodeView.InterfaceC4636a() { // from class: l.nwe
            @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.EmailVerifyCodeView.InterfaceC4636a
            /* JADX INFO: renamed from: a */
            public final void mo28630a(String str) {
                this.f140942a.m176811J(str);
            }
        });
        this.f156684f.setOnTouchListener(new View.OnTouchListener() { // from class: l.owe
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f146045a.m176812K(view, motionEvent);
            }
        });
        xdl0.m208344M(this.f156690l, ((cwe) this.f78942b).m109011i1());
        xdl0.m208329E0(this.f156690l, new View.OnClickListener() { // from class: l.pwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151559a.m176813L(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public View m176822x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rwe.m181391b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public void m176823z() {
        this.f156684f.setText("");
    }
}
