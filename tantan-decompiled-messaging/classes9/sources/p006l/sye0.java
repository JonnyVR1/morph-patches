package p006l;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.ShortCutLoginOptActivity;
import com.p000p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import l.d30;
import l.e51;
import l.i0g0;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VButton;
import v.VCheckBox;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sye0 extends c3f0<nye0, ShortCutLoginOptActivity> {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f21751c;

    /* JADX INFO: renamed from: d */
    public VButton f21752d;

    /* JADX INFO: renamed from: e */
    public TextView f21753e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f21754f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f21755g;

    /* JADX INFO: renamed from: h */
    public VText f21756h;

    /* JADX INFO: renamed from: i */
    public final ShortCutLoginOptActivity f21757i;

    /* JADX INFO: renamed from: j */
    public nye0 f21758j;

    /* JADX INFO: renamed from: k */
    public Runnable f21759k;

    /* JADX INFO: renamed from: l */
    public boolean f21760l;

    /* JADX INFO: renamed from: m */
    public Handler f21761m;

    /* JADX INFO: renamed from: n */
    public d30 f21762n;

    /* JADX INFO: renamed from: l.sye0$a */
    public class HandlerC1291a extends Handler {
        public HandlerC1291a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 10001) {
                if (i != 10002) {
                    return;
                }
                d.l().k("privacy_check_tip");
            } else if (hasMessages(10002)) {
                removeMessages(10002);
                sendEmptyMessageDelayed(10002, 2000L);
            } else {
                zvf0.A("e_agree_privacy_policy", "p_sign_in_type_selection_view", new j760[]{vwb.Y("agreement_entrance", "one_click_login")});
                d.l().u(new a(sye0.this.act()).D(sye0.this.act().getResources().getString(R$string.f69H2)).J(13.0f).x(-t100.g).q(a.O | a.Q), sye0.this.f21755g, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.sye0$b */
    public class C1292b implements d30 {
        public C1292b() {
        }

        public void call() {
            sye0.this.f21755g.setChecked(true);
            sye0.this.m24403z();
            sye0.this.f21758j.m20260B1();
        }
    }

    public sye0(ShortCutLoginOptActivity shortCutLoginOptActivity) {
        super(shortCutLoginOptActivity);
        this.f21760l = false;
        this.f21761m = new HandlerC1291a();
        this.f21762n = new C1292b();
        this.f21757i = shortCutLoginOptActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m24394u(View view) {
        this.f21758j.m20260B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m24395w(View view) {
        this.f21758j.m20261C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m24396x(View view) {
        VCheckBox vCheckBox = this.f21755g;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        m24403z();
    }

    /* JADX INFO: renamed from: A3 */
    public void m24397A3(String str) {
        this.f21751c.setLeftIconAsBack(this.f21757i);
        this.f21757i.alwaysHideInput();
        this.f21757i.getSupportActionBar().w(true);
        act().setSwipeBackEnable(true);
        xdl0.E0(this.f21752d, new View.OnClickListener() { // from class: l.oye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18492a.m24394u(view);
            }
        });
        zvf0.A("e_sign_in_agreement", act().pageId(), new j760[]{vwb.Y("agreement_entrance", "one_click_login")});
        this.f21755g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.pye0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f19443a.m24401v(compoundButton, z);
            }
        });
        xdl0.E0(this.f21753e, new View.OnClickListener() { // from class: l.qye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20159a.m24395w(view);
            }
        });
        j760<String, String> j760VarM1501d = ChinaMobileController.m1501d();
        xdl0.E0(this.f21756h, new View.OnClickListener() { // from class: l.rye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20915a.m24396x(view);
            }
        });
        this.f21756h.setText(i0g0.B(this.f21757i, "我已阅读并同意 " + ((String) j760VarM1501d.a) + " 并授权探探获取本机号码", new String[]{(String) j760VarM1501d.a, (String) j760VarM1501d.b}));
        this.f21756h.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: C0 */
    public Context mo13092C0() {
        return this.f21757i;
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: a */
    public PutongAct act() {
        return this.f21757i;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24398p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m24398p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tye0.m24844b(this, layoutInflater, viewGroup);
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo476i1(nye0 nye0Var) {
        this.f21758j = nye0Var;
    }

    /* JADX INFO: renamed from: s */
    public void m24400s(boolean z) {
        this.f21752d.setClickable(z);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m24401v(CompoundButton compoundButton, boolean z) {
        if (z) {
            m24403z();
        }
        zvf0.u("e_sign_in_agreement", act().pageId(), new j760[]{vwb.Y("agreement_entrance", "one_click_login")});
    }

    /* JADX INFO: renamed from: y */
    public void m24402y(String str) {
        this.f21752d.setText(C0907jy.m17846p0(str) + " 一键登录");
        VButton vButton = this.f21752d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vButton.setTypeface(typeface);
        this.f21753e.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: z */
    public void m24403z() {
        this.f21760l = true;
        e51.J(this.f21759k);
    }

    @Override // p006l.c3f0
    public void destroy() {
    }
}
