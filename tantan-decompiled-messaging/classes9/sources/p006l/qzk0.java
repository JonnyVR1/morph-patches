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
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.VerifyCodeView;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.VerifyCodeAct;
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
public class qzk0 extends c3f0<azk0, VerifyCodeAct> {

    /* JADX INFO: renamed from: c */
    public VScroll f20190c;

    /* JADX INFO: renamed from: d */
    public VText f20191d;

    /* JADX INFO: renamed from: e */
    public VText f20192e;

    /* JADX INFO: renamed from: f */
    public VText f20193f;

    /* JADX INFO: renamed from: g */
    public VerifyCodeView f20194g;

    /* JADX INFO: renamed from: h */
    public VText f20195h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f20196i;

    /* JADX INFO: renamed from: j */
    public VText f20197j;

    /* JADX INFO: renamed from: k */
    public VText f20198k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f20199l;

    /* JADX INFO: renamed from: m */
    public VImage f20200m;

    /* JADX INFO: renamed from: n */
    public VImage f20201n;

    /* JADX INFO: renamed from: o */
    public VText f20202o;

    /* JADX INFO: renamed from: p */
    public VText f20203p;

    /* JADX INFO: renamed from: q */
    public View f20204q;

    /* JADX INFO: renamed from: r */
    public boolean f20205r;

    /* JADX INFO: renamed from: s */
    public int f20206s;

    /* JADX INFO: renamed from: l.qzk0$a */
    public class C1198a extends SVGAAnimListenerAdapter {
        public C1198a() {
        }
    }

    public qzk0(@NonNull VerifyCodeAct verifyCodeAct) {
        super(verifyCodeAct);
        this.f20205r = false;
        this.f20206s = 60;
    }

    /* JADX INFO: renamed from: A */
    private void m22523A() {
        boolean z = !TextUtils.isEmpty(this.f20194g.getText()) && this.f20194g.getText().length() >= 4;
        this.f20198k.setEnabled(z);
        VText vText = this.f20198k;
        if (z) {
            vText.setBackgroundResource(v2c0.f23973K1);
        } else {
            vText.setBackgroundResource(v2c0.f24075t1);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m22524B() {
        ((VerifyCodeAct) this.f9323a).postDelayed(new Runnable() { // from class: l.gzk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13613a.m22552I();
            }
        }, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m22525K() {
        this.f20194g.requestFocus();
        act().showInput(this.f20194g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m22526L(Boolean bool) {
        if (bool.booleanValue()) {
            m22524B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m22527M(View view) {
        ((VerifyCodeAct) this.f9323a).onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m22528N(View view) {
        zvf0.r("e_login_verification_code_resend", ((VerifyCodeAct) this.f9323a).pageId());
        ((azk0) this.f9324b).m12397N1(null);
        xdl0.M0(this.f20195h, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m22529O(String str) {
        if (str.length() > 0) {
            xdl0.M0(this.f20195h, false);
        }
        m22523A();
        if (this.f20198k.isEnabled()) {
            m22533V();
        }
        zvf0.v("e_login_verification_code_input", ((VerifyCodeAct) this.f9323a).pageId(), new j760[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ boolean m22530P(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        zvf0.r("e_login_verification_code_input", ((VerifyCodeAct) this.f9323a).pageId());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m22531Q(View view) {
        zvf0.r("e_login_verification_code_change_number", ((VerifyCodeAct) this.f9323a).pageId());
        ((azk0) this.f9324b).m12402m1("change_number");
    }

    /* JADX INFO: renamed from: U */
    private void m22532U() {
        this.f20197j.setEnabled(false);
        this.f20197j.setTextColor(((VerifyCodeAct) this.f9323a).getResources().getColor(u0c0.f22401h));
        ((VerifyCodeAct) this.f9323a).duringCreated(e51.N(m22549F(), this.f20206s)).subscribe(mkd0.I(new e30() { // from class: l.pzk0
            public final void call(Object obj) {
                this.f19470a.m22556T((Long) obj);
            }
        }, new e30() { // from class: l.ezk0
            public final void call(Object obj) {
                qzk0.m22539p((Throwable) obj);
            }
        }, new d30() { // from class: l.fzk0
            public final void call() {
                this.f13006a.m22555S();
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    private void m22533V() {
        if (((azk0) this.f9324b).m12403n1()) {
            return;
        }
        if (((azk0) this.f9324b).m12404o1()) {
            zvf0.r("e_login_verification_code_continue", ((VerifyCodeAct) this.f9323a).pageId());
            ((azk0) this.f9324b).m12398O1();
        } else if (((azk0) this.f9324b).m12405p1()) {
            ((azk0) this.f9324b).m12399P1();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m22539p(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public void m22547C() {
        this.f20194g.setText("");
    }

    /* JADX INFO: renamed from: E */
    public int m22548E() {
        return Integer.parseInt(this.f20194g.getText());
    }

    /* JADX INFO: renamed from: F */
    public String m22549F() {
        return "account_sign_" + ((azk0) this.f9324b).f8629f + ((azk0) this.f9324b).f8630g;
    }

    /* JADX INFO: renamed from: G */
    public void m22550G() {
        xdl0.E0(this.f20198k, new View.OnClickListener() { // from class: l.ozk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18524a.m22553J(view);
            }
        });
        m22523A();
    }

    /* JADX INFO: renamed from: H */
    public boolean m22551H() {
        return this.f20205r;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m22552I() {
        int measuredHeight = (((VerifyCodeAct) this.f9323a).getWindow().getDecorView().getMeasuredHeight() - this.f20199l.getMeasuredHeight()) - this.f20190c.getHeight();
        if (measuredHeight > 0) {
            this.f20190c.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22553J(View view) {
        m22533V();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m22554R(View view) {
        ((azk0) this.f9324b).m12402m1("password_login");
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m22555S() {
        this.f20197j.setTextColor(((VerifyCodeAct) this.f9323a).getResources().getColor(u0c0.f22403j));
        this.f20197j.setEnabled(true);
        this.f20197j.setText(act().getString(R$string.f135U3));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m22556T(Long l2) {
        this.f20197j.setText(act().getString(R$string.f135U3) + " " + ((((long) this.f20206s) - l2.longValue()) - 1) + "s");
    }

    /* JADX INFO: renamed from: W */
    public void m22557W() {
        m22560Z();
        m22532U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public boolean m22558X(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            xdl0.M0(this.f20195h, true);
            this.f20194g.setText("");
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40010) {
                this.f20195h.setText(R$string.f156Z);
                return true;
            }
            if (i == 400114) {
                ((azk0) this.f9324b).m12402m1("show_captcha");
                return true;
            }
            switch (i) {
                case 40013:
                    this.f20195h.setText(R$string.f151Y);
                    return true;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    this.f20195h.setText(R$string.f162a0);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    this.f20195h.setText(R$string.f146X);
                    return true;
                default:
                    xdl0.M0(this.f20195h, false);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public void m22559Y() {
        this.f20205r = true;
        this.f20196i.startSVGAAnimWithListener("account_loading_progress.svga", -1, new C1198a());
    }

    /* JADX INFO: renamed from: Z */
    public void m22560Z() {
        this.f20205r = false;
        this.f20196i.stopAnimCompletely();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f20204q = m22562z(layoutInflater, viewGroup);
        this.f20194g.setPresenter((azk0) this.f9324b);
        return this.f20204q;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: r */
    public void m22561r() {
        ((VerifyCodeAct) this.f9323a).lmdStart(30000);
        VLinear.b.c();
        xdl0.M(this.f20202o, AccountModule.f26c.f322n);
        xdl0.M(this.f20203p, false);
        xdl0.M(this.f20193f, false);
        e51.H(act(), new Runnable() { // from class: l.dzk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10671a.m22525K();
            }
        }, 100L);
        ((azk0) this.f9324b).duringCreated(Act.keyboardListenerObservable(this.f20204q)).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.hzk0
            public final void call(Object obj) {
                this.f14151a.m22526L((Boolean) obj);
            }
        }));
        m22550G();
        xdl0.E0(this.f20200m, new View.OnClickListener() { // from class: l.izk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14907a.m22527M(view);
            }
        });
        if (e51.B(m22549F())) {
            m22532U();
        } else {
            this.f20197j.setTextColor(((VerifyCodeAct) this.f9323a).getResources().getColor(u0c0.f22403j));
            this.f20197j.setEnabled(true);
            this.f20197j.setText(act().getString(R$string.f135U3));
        }
        if (((azk0) this.f9324b).m12405p1()) {
            this.f20191d.setText(R$string.f285v3);
            xdl0.M(this.f20193f, false);
        }
        xdl0.E0(this.f20197j, new View.OnClickListener() { // from class: l.jzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15513a.m22528N(view);
            }
        });
        this.f20192e.setText(((VerifyCodeAct) this.f9323a).getString(R$string.f224k2) + " " + ((azk0) this.f9324b).f8630g + "");
        VText vText = this.f20193f;
        StringBuilder sb = new StringBuilder(" ");
        sb.append(((VerifyCodeAct) this.f9323a).getString(R$string.f230l2));
        sb.append(" ");
        vText.setText(sb.toString());
        this.f20194g.setText("");
        this.f20194g.setTextChangeListener(new VerifyCodeView.InterfaceC0065a() { // from class: l.kzk0
            @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.VerifyCodeView.InterfaceC0065a
            /* JADX INFO: renamed from: a */
            public final void mo547a(String str) {
                this.f16115a.m22529O(str);
            }
        });
        this.f20194g.setOnTouchListener(new View.OnTouchListener() { // from class: l.lzk0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f16728a.m22530P(view, motionEvent);
            }
        });
        xdl0.E0(this.f20193f, new View.OnClickListener() { // from class: l.mzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17420a.m22531Q(view);
            }
        });
        xdl0.E0(this.f20202o, new View.OnClickListener() { // from class: l.nzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17952a.m22554R(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public View m22562z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rzk0.m23460b(this, layoutInflater, viewGroup);
    }
}
