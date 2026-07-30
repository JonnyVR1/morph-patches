package p153l;

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
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.ShortCutLoginOptActivity;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.wxapi.WXEntryActivity;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class z6f0 extends jbf0<u6f0, ShortCutLoginOptActivity> {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f203146c;

    /* JADX INFO: renamed from: d */
    public VButton f203147d;

    /* JADX INFO: renamed from: e */
    public TextView f203148e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f203149f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f203150g;

    /* JADX INFO: renamed from: h */
    public VText f203151h;

    /* JADX INFO: renamed from: i */
    public final ShortCutLoginOptActivity f203152i;

    /* JADX INFO: renamed from: j */
    public u6f0 f203153j;

    /* JADX INFO: renamed from: k */
    public Runnable f203154k;

    /* JADX INFO: renamed from: l */
    public boolean f203155l;

    /* JADX INFO: renamed from: m */
    public Handler f203156m;

    /* JADX INFO: renamed from: n */
    public x20 f203157n;

    /* JADX INFO: renamed from: l.z6f0$a */
    public class HandlerC21770a extends Handler {
        public HandlerC21770a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 10001) {
                if (i != 10002) {
                    return;
                }
                C4499d.m21895l().m21899k("privacy_check_tip");
            } else if (hasMessages(10002)) {
                removeMessages(10002);
                sendEmptyMessageDelayed(10002, 2000L);
            } else {
                i4g0.m138492A("e_agree_privacy_policy", WXEntryActivity.PID, jyb.m147494Y("agreement_entrance", "one_click_login"));
                C4499d.m21895l().m21908u(new C4496a(z6f0.this.act()).m21848D(z6f0.this.act().getResources().getString(R$string.f16799H2)).m21854J(13.0f).m21881x(-qa00.f156320g).m21874q(C4496a.f16400O | C4496a.f16402Q), z6f0.this.f203150g, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.z6f0$b */
    public class C21771b implements x20 {
        public C21771b() {
        }

        @Override // p153l.x20
        public void call() {
            z6f0.this.f203150g.setChecked(true);
            z6f0.this.m218800z();
            z6f0.this.f203153j.m194688B1();
        }
    }

    public z6f0(ShortCutLoginOptActivity shortCutLoginOptActivity) {
        super(shortCutLoginOptActivity);
        this.f203155l = false;
        this.f203156m = new HandlerC21770a();
        this.f203157n = new C21771b();
        this.f203152i = shortCutLoginOptActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m218791u(View view) {
        this.f203153j.m194688B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m218792w(View view) {
        this.f203153j.m194689C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m218793x(View view) {
        VCheckBox vCheckBox = this.f203150g;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        m218800z();
    }

    /* JADX INFO: renamed from: A3 */
    public void m218794A3(String str) {
        this.f203146c.setLeftIconAsBack(this.f203152i);
        this.f203152i.alwaysHideInput();
        this.f203152i.getSupportActionBar().mo102196w(true);
        act().setSwipeBackEnable(true);
        bnl0.m105509E0(this.f203147d, new View.OnClickListener() { // from class: l.v6f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182638a.m218791u(view);
            }
        });
        i4g0.m138492A("e_sign_in_agreement", act().pageId(), jyb.m147494Y("agreement_entrance", "one_click_login"));
        this.f203150g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.w6f0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f187612a.m218798v(compoundButton, z);
            }
        });
        bnl0.m105509E0(this.f203148e, new View.OnClickListener() { // from class: l.x6f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192584a.m218792w(view);
            }
        });
        pf60<String, String> pf60VarM30593d = ChinaMobileController.m30593d();
        bnl0.m105509E0(this.f203151h, new View.OnClickListener() { // from class: l.y6f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197683a.m218793x(view);
            }
        });
        this.f203151h.setText(q8g0.m175770B(this.f203152i, "我已阅读并同意 " + pf60VarM30593d.f152156a + " 并授权探探获取本机号码", pf60VarM30593d.f152156a, pf60VarM30593d.f152157b));
        this.f203151h.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p153l.jbf0, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203152i;
    }

    @Override // p153l.jbf0, p153l.iam
    /* JADX INFO: renamed from: a */
    public PutongAct act() {
        return this.f203152i;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218795p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m218795p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a7f0.m96363b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.jbf0, p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u6f0 u6f0Var) {
        this.f203153j = u6f0Var;
    }

    /* JADX INFO: renamed from: s */
    public void m218797s(boolean z) {
        this.f203147d.setClickable(z);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m218798v(CompoundButton compoundButton, boolean z) {
        if (z) {
            m218800z();
        }
        i4g0.m138523u("e_sign_in_agreement", act().pageId(), jyb.m147494Y("agreement_entrance", "one_click_login"));
    }

    /* JADX INFO: renamed from: y */
    public void m218799y(String str) {
        this.f203147d.setText(C16649dy.m118581p0(str) + " 一键登录");
        VButton vButton = this.f203147d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vButton.setTypeface(typeface);
        this.f203148e.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: z */
    public void m218800z() {
        this.f203155l = true;
        l51.m152890J(this.f203154k);
    }

    @Override // p153l.jbf0, p153l.iam
    public void destroy() {
    }
}
