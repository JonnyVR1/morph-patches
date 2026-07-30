package p149l;

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
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.ShortCutLoginOptActivity;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.wxapi.WXEntryActivity;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class sye0 extends c3f0<nye0, ShortCutLoginOptActivity> {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f166944c;

    /* JADX INFO: renamed from: d */
    public VButton f166945d;

    /* JADX INFO: renamed from: e */
    public TextView f166946e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f166947f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f166948g;

    /* JADX INFO: renamed from: h */
    public VText f166949h;

    /* JADX INFO: renamed from: i */
    public final ShortCutLoginOptActivity f166950i;

    /* JADX INFO: renamed from: j */
    public nye0 f166951j;

    /* JADX INFO: renamed from: k */
    public Runnable f166952k;

    /* JADX INFO: renamed from: l */
    public boolean f166953l;

    /* JADX INFO: renamed from: m */
    public Handler f166954m;

    /* JADX INFO: renamed from: n */
    public d30 f166955n;

    /* JADX INFO: renamed from: l.sye0$a */
    public class HandlerC20080a extends Handler {
        public HandlerC20080a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 10001) {
                if (i != 10002) {
                    return;
                }
                C4348d.m20896l().m20900k("privacy_check_tip");
            } else if (hasMessages(10002)) {
                removeMessages(10002);
                sendEmptyMessageDelayed(10002, 2000L);
            } else {
                zvf0.m220368A("e_agree_privacy_policy", WXEntryActivity.PID, vwb.m200311Y("agreement_entrance", "one_click_login"));
                C4348d.m20896l().m20909u(new C4345a(sye0.this.act()).m20849D(sye0.this.act().getResources().getString(R$string.f16080H2)).m20855J(13.0f).m20882x(-t100.f167258g).m20875q(C4345a.f15681O | C4345a.f15683Q), sye0.this.f166948g, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.sye0$b */
    public class C20081b implements d30 {
        public C20081b() {
        }

        @Override // p149l.d30
        public void call() {
            sye0.this.f166948g.setChecked(true);
            sye0.this.m186671z();
            sye0.this.f166951j.m161995B1();
        }
    }

    public sye0(ShortCutLoginOptActivity shortCutLoginOptActivity) {
        super(shortCutLoginOptActivity);
        this.f166953l = false;
        this.f166954m = new HandlerC20080a();
        this.f166955n = new C20081b();
        this.f166950i = shortCutLoginOptActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m186662u(View view) {
        this.f166951j.m161995B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m186663w(View view) {
        this.f166951j.m161996C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m186664x(View view) {
        VCheckBox vCheckBox = this.f166948g;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        m186671z();
    }

    /* JADX INFO: renamed from: A3 */
    public void m186665A3(String str) {
        this.f166944c.setLeftIconAsBack(this.f166950i);
        this.f166950i.alwaysHideInput();
        this.f166950i.getSupportActionBar().mo134136w(true);
        act().setSwipeBackEnable(true);
        xdl0.m208329E0(this.f166945d, new View.OnClickListener() { // from class: l.oye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146317a.m186662u(view);
            }
        });
        zvf0.m220368A("e_sign_in_agreement", act().pageId(), vwb.m200311Y("agreement_entrance", "one_click_login"));
        this.f166948g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.pye0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f151843a.m186669v(compoundButton, z);
            }
        });
        xdl0.m208329E0(this.f166946e, new View.OnClickListener() { // from class: l.qye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156921a.m186663w(view);
            }
        });
        j760<String, String> j760VarM29595d = ChinaMobileController.m29595d();
        xdl0.m208329E0(this.f166949h, new View.OnClickListener() { // from class: l.rye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161554a.m186664x(view);
            }
        });
        this.f166949h.setText(i0g0.m133835B(this.f166950i, "我已阅读并同意 " + j760VarM29595d.f116564a + " 并授权探探获取本机号码", j760VarM29595d.f116564a, j760VarM29595d.f116565b));
        this.f166949h.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p149l.c3f0, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f166950i;
    }

    @Override // p149l.c3f0, p149l.s7m
    /* JADX INFO: renamed from: a */
    public PutongAct act() {
        return this.f166950i;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m186666p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m186666p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tye0.m191020b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.c3f0, p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nye0 nye0Var) {
        this.f166951j = nye0Var;
    }

    /* JADX INFO: renamed from: s */
    public void m186668s(boolean z) {
        this.f166945d.setClickable(z);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m186669v(CompoundButton compoundButton, boolean z) {
        if (z) {
            m186671z();
        }
        zvf0.m220399u("e_sign_in_agreement", act().pageId(), vwb.m200311Y("agreement_entrance", "one_click_login"));
    }

    /* JADX INFO: renamed from: y */
    public void m186670y(String str) {
        this.f166945d.setText(C17890jy.m143838p0(str) + " 一键登录");
        VButton vButton = this.f166945d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vButton.setTypeface(typeface);
        this.f166946e.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: z */
    public void m186671z() {
        this.f166953l = true;
        e51.m114745J(this.f166952k);
    }

    @Override // p149l.c3f0, p149l.s7m
    public void destroy() {
    }
}
