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
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.VerifyCodeView;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.VerifyCodeAct;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class qzk0 extends c3f0<azk0, VerifyCodeAct> {

    /* JADX INFO: renamed from: c */
    public VScroll f157063c;

    /* JADX INFO: renamed from: d */
    public VText f157064d;

    /* JADX INFO: renamed from: e */
    public VText f157065e;

    /* JADX INFO: renamed from: f */
    public VText f157066f;

    /* JADX INFO: renamed from: g */
    public VerifyCodeView f157067g;

    /* JADX INFO: renamed from: h */
    public VText f157068h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f157069i;

    /* JADX INFO: renamed from: j */
    public VText f157070j;

    /* JADX INFO: renamed from: k */
    public VText f157071k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f157072l;

    /* JADX INFO: renamed from: m */
    public VImage f157073m;

    /* JADX INFO: renamed from: n */
    public VImage f157074n;

    /* JADX INFO: renamed from: o */
    public VText f157075o;

    /* JADX INFO: renamed from: p */
    public VText f157076p;

    /* JADX INFO: renamed from: q */
    public View f157077q;

    /* JADX INFO: renamed from: r */
    public boolean f157078r;

    /* JADX INFO: renamed from: s */
    public int f157079s;

    /* JADX INFO: renamed from: l.qzk0$a */
    public class C19615a extends SVGAAnimListenerAdapter {
        public C19615a() {
        }
    }

    public qzk0(@NonNull VerifyCodeAct verifyCodeAct) {
        super(verifyCodeAct);
        this.f157078r = false;
        this.f157079s = 60;
    }

    /* JADX INFO: renamed from: A */
    private void m177234A() {
        boolean z = !TextUtils.isEmpty(this.f157067g.getText()) && this.f157067g.getText().length() >= 4;
        this.f157071k.setEnabled(z);
        VText vText = this.f157071k;
        if (z) {
            vText.setBackgroundResource(v2c0.f179409K1);
        } else {
            vText.setBackgroundResource(v2c0.f179511t1);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m177235B() {
        ((VerifyCodeAct) this.f78941a).postDelayed(new Runnable() { // from class: l.gzk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105153a.m177263I();
            }
        }, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m177236K() {
        this.f157067g.requestFocus();
        act().showInput(this.f157067g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m177237L(Boolean bool) {
        if (bool.booleanValue()) {
            m177235B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m177238M(View view) {
        ((VerifyCodeAct) this.f78941a).onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m177239N(View view) {
        zvf0.m220396r("e_login_verification_code_resend", ((VerifyCodeAct) this.f78941a).pageId());
        ((azk0) this.f78942b).m99704N1(null);
        xdl0.m208345M0(this.f157068h, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m177240O(String str) {
        if (str.length() > 0) {
            xdl0.m208345M0(this.f157068h, false);
        }
        m177234A();
        if (this.f157071k.isEnabled()) {
            m177244V();
        }
        zvf0.m220400v("e_login_verification_code_input", ((VerifyCodeAct) this.f78941a).pageId(), new j760[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ boolean m177241P(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        zvf0.m220396r("e_login_verification_code_input", ((VerifyCodeAct) this.f78941a).pageId());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m177242Q(View view) {
        zvf0.m220396r("e_login_verification_code_change_number", ((VerifyCodeAct) this.f78941a).pageId());
        ((azk0) this.f78942b).m99708m1("change_number");
    }

    /* JADX INFO: renamed from: U */
    private void m177243U() {
        this.f157070j.setEnabled(false);
        this.f157070j.setTextColor(((VerifyCodeAct) this.f78941a).getResources().getColor(u0c0.f172887h));
        ((VerifyCodeAct) this.f78941a).duringCreated(e51.m114749N(m177260F(), this.f157079s)).subscribe(mkd0.m154957I(new e30() { // from class: l.pzk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151959a.m177267T((Long) obj);
            }
        }, new e30() { // from class: l.ezk0
            @Override // p149l.e30
            public final void call(Object obj) {
                qzk0.m177250p((Throwable) obj);
            }
        }, new d30() { // from class: l.fzk0
            @Override // p149l.d30
            public final void call() {
                this.f99976a.m177266S();
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    private void m177244V() {
        if (((azk0) this.f78942b).m99709n1()) {
            return;
        }
        if (((azk0) this.f78942b).m99710o1()) {
            zvf0.m220396r("e_login_verification_code_continue", ((VerifyCodeAct) this.f78941a).pageId());
            ((azk0) this.f78942b).m99705O1();
        } else if (((azk0) this.f78942b).m99711p1()) {
            ((azk0) this.f78942b).m99706P1();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m177250p(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public void m177258C() {
        this.f157067g.setText("");
    }

    /* JADX INFO: renamed from: E */
    public int m177259E() {
        return Integer.parseInt(this.f157067g.getText());
    }

    /* JADX INFO: renamed from: F */
    public String m177260F() {
        return "account_sign_" + ((azk0) this.f78942b).f72361f + ((azk0) this.f78942b).f72362g;
    }

    /* JADX INFO: renamed from: G */
    public void m177261G() {
        xdl0.m208329E0(this.f157071k, new View.OnClickListener() { // from class: l.ozk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146483a.m177264J(view);
            }
        });
        m177234A();
    }

    /* JADX INFO: renamed from: H */
    public boolean m177262H() {
        return this.f157078r;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m177263I() {
        int measuredHeight = (((VerifyCodeAct) this.f78941a).getWindow().getDecorView().getMeasuredHeight() - this.f157072l.getMeasuredHeight()) - this.f157063c.getHeight();
        if (measuredHeight > 0) {
            this.f157063c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m177264J(View view) {
        m177244V();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m177265R(View view) {
        ((azk0) this.f78942b).m99708m1("password_login");
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m177266S() {
        this.f157070j.setTextColor(((VerifyCodeAct) this.f78941a).getResources().getColor(u0c0.f172889j));
        this.f157070j.setEnabled(true);
        this.f157070j.setText(act().getString(R$string.f16146U3));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m177267T(Long l2) {
        this.f157070j.setText(act().getString(R$string.f16146U3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((((long) this.f157079s) - l2.longValue()) - 1) + BLiveStormDanmakuGiftResourceType.f44446s);
    }

    /* JADX INFO: renamed from: W */
    public void m177268W() {
        m177271Z();
        m177243U();
    }

    /* JADX INFO: renamed from: X */
    public boolean m177269X(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            xdl0.m208345M0(this.f157068h, true);
            this.f157067g.setText("");
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f157068h.setText(R$string.f16167Z);
                return true;
            }
            if (i == 400114) {
                ((azk0) this.f78942b).m99708m1("show_captcha");
                return true;
            }
            switch (i) {
                case 40013:
                    this.f157068h.setText(R$string.f16162Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f157068h.setText(R$string.f16173a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f157068h.setText(R$string.f16157X);
                    return true;
                default:
                    xdl0.m208345M0(this.f157068h, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public void m177270Y() {
        this.f157078r = true;
        this.f157069i.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C19615a());
    }

    /* JADX INFO: renamed from: Z */
    public void m177271Z() {
        this.f157078r = false;
        this.f157069i.stopAnimCompletely();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f157077q = m177273z(layoutInflater, viewGroup);
        this.f157067g.setPresenter((azk0) this.f78942b);
        return this.f157077q;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: r */
    public void m177272r() {
        ((VerifyCodeAct) this.f78941a).lmdStart(30000);
        VLinear.f209129b.m223064c();
        xdl0.m208344M(this.f157075o, AccountModule.f16037c.f16333n);
        xdl0.m208344M(this.f157076p, false);
        xdl0.m208344M(this.f157066f, false);
        e51.m114743H(act(), new Runnable() { // from class: l.dzk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f88490a.m177236K();
            }
        }, 100L);
        ((azk0) this.f78942b).duringCreated(Act.keyboardListenerObservable(this.f157077q)).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.hzk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110207a.m177237L((Boolean) obj);
            }
        }));
        m177261G();
        xdl0.m208329E0(this.f157073m, new View.OnClickListener() { // from class: l.izk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115582a.m177238M(view);
            }
        });
        if (e51.m114737B(m177260F())) {
            m177243U();
        } else {
            this.f157070j.setTextColor(((VerifyCodeAct) this.f78941a).getResources().getColor(u0c0.f172889j));
            this.f157070j.setEnabled(true);
            this.f157070j.setText(act().getString(R$string.f16146U3));
        }
        if (((azk0) this.f78942b).m99711p1()) {
            this.f157064d.setText(R$string.f16296v3);
            xdl0.m208344M(this.f157066f, false);
        }
        xdl0.m208329E0(this.f157070j, new View.OnClickListener() { // from class: l.jzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120397a.m177239N(view);
            }
        });
        this.f157065e.setText(((VerifyCodeAct) this.f78941a).getString(R$string.f16235k2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((azk0) this.f78942b).f72362g + "");
        VText vText = this.f157066f;
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(((VerifyCodeAct) this.f78941a).getString(R$string.f16241l2));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        vText.setText(sb.toString());
        this.f157067g.setText("");
        this.f157067g.setTextChangeListener(new VerifyCodeView.InterfaceC4639a() { // from class: l.kzk0
            @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.VerifyCodeView.InterfaceC4639a
            /* JADX INFO: renamed from: a */
            public final void mo28648a(String str) {
                this.f125393a.m177240O(str);
            }
        });
        this.f157067g.setOnTouchListener(new View.OnTouchListener() { // from class: l.lzk0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f130657a.m177241P(view, motionEvent);
            }
        });
        xdl0.m208329E0(this.f157066f, new View.OnClickListener() { // from class: l.mzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136401a.m177242Q(view);
            }
        });
        xdl0.m208329E0(this.f157075o, new View.OnClickListener() { // from class: l.nzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141236a.m177265R(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public View m177273z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rzk0.m181758b(this, layoutInflater, viewGroup);
    }
}
