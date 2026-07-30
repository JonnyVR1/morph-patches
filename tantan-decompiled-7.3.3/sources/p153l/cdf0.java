package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p051p1.mobile.putong.live.base.data.BLiveSignPrizes;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame;
import com.p051p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeListView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.rule.SignInRuleFrame;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class cdf0 implements iam<C12932a> {

    /* JADX INFO: renamed from: a */
    public View f81183a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f81184b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f81185c;

    /* JADX INFO: renamed from: d */
    public SignInAnimFrame f81186d;

    /* JADX INFO: renamed from: e */
    public C12932a f81187e;

    /* JADX INFO: renamed from: f */
    public SignInMainFrame f81188f;

    /* JADX INFO: renamed from: g */
    public SignInRuleFrame f81189g;

    /* JADX INFO: renamed from: h */
    public LiveSignPrizeListView f81190h;

    /* JADX INFO: renamed from: i */
    public SignInMedalFrame f81191i;

    /* JADX INFO: renamed from: j */
    public DialogC12774a f81192j;

    /* JADX INFO: renamed from: d */
    public static void m109172d(cdf0 cdf0Var) {
        cdf0Var.f81183a = null;
        cdf0Var.f81184b = null;
        cdf0Var.f81185c = null;
        cdf0Var.f81186d = null;
    }

    /* JADX INFO: renamed from: n */
    private void m109173n() {
        this.f81185c.removeAllViews();
        m109172d(this);
        this.f81192j = null;
        this.f81188f = null;
        this.f81190h = null;
        SignInRuleFrame signInRuleFrame = this.f81189g;
        if (signInRuleFrame != null) {
            signInRuleFrame.m74467e();
            this.f81189g = null;
        }
        this.f81191i = null;
    }

    /* JADX INFO: renamed from: A */
    public void m109174A() {
        this.f81185c.removeAllViews();
        if (this.f81189g == null) {
            this.f81189g = (SignInRuleFrame) act().inflater().inflate(yec0.f198805J5, (ViewGroup) null);
        }
        this.f81185c.addView(this.f81189g);
        this.f81189g.m74465c(this.f81187e);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f81187e.act();
    }

    /* JADX INFO: renamed from: c */
    public View m109175c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ldf0.m153746b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
        m109178i();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C12932a c12932a) {
        this.f81187e = c12932a;
    }

    /* JADX INFO: renamed from: f */
    public final void m109177f() {
        c0s c0sVar = new c0s(this.f81187e, m109175c(act().inflater(), null));
        this.f81192j = c0sVar;
        c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.adf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f70685a.m109181l(dialogInterface);
            }
        });
        this.f81192j.m72961j0(LiveDialogEnum.SIGN_IN);
        this.f81183a.setOnClickListener(new View.OnClickListener() { // from class: l.bdf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76263a.m109182m(view);
            }
        });
        izs.m142868s("context_livingAct", (VDraweeView) this.f81192j.m72943R().findViewById(mdc0.f135955I), zft.f204222q);
        this.f81186d.m74374i(this.f81187e);
    }

    /* JADX INFO: renamed from: i */
    public void m109178i() {
        DialogC12774a dialogC12774a = this.f81192j;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f81192j.dismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m109179j() {
        DialogC12774a dialogC12774a = this.f81192j;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: k */
    public boolean m109180k() {
        return this.f81188f != null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m109181l(DialogInterface dialogInterface) {
        m109173n();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m109182m(View view) {
        m109178i();
    }

    /* JADX INFO: renamed from: p */
    public void m109183p(BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        SignInMedalFrame signInMedalFrame = this.f81191i;
        if (signInMedalFrame != null) {
            signInMedalFrame.m74441n(bLiveSignInAchievementMedals);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m109184q(BLiveSignInDetail bLiveSignInDetail) {
        SignInMainFrame signInMainFrame = this.f81188f;
        if (signInMainFrame != null) {
            signInMainFrame.m74405g(bLiveSignInDetail);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m109185s(x20 x20Var) {
        SignInMainFrame signInMainFrame = this.f81188f;
        if (signInMainFrame != null) {
            signInMainFrame.m74406h(x20Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m109186u(List<BLiveSignInReward> list) {
        if (m109179j()) {
            this.f81186d.m74381p(list);
        }
    }

    /* JADX INFO: renamed from: v */
    public String m109187v() {
        SignInMainFrame signInMainFrame = this.f81188f;
        if (signInMainFrame == null) {
            return null;
        }
        return signInMainFrame.m74407i();
    }

    /* JADX INFO: renamed from: w */
    public void m109188w() {
        if (this.f81192j == null) {
            m109177f();
        }
        this.f81192j.show();
    }

    /* JADX INFO: renamed from: x */
    public void m109189x() {
        this.f81185c.removeAllViews();
        if (this.f81188f == null) {
            this.f81188f = (SignInMainFrame) act().inflater().inflate(yec0.f198745E5, (ViewGroup) null);
        }
        this.f81185c.addView(this.f81188f);
        this.f81188f.m74402d(this.f81187e);
    }

    /* JADX INFO: renamed from: y */
    public void m109190y() {
        this.f81185c.removeAllViews();
        if (this.f81191i == null) {
            this.f81191i = (SignInMedalFrame) act().inflater().inflate(yec0.f198769G5, (ViewGroup) null);
        }
        this.f81185c.addView(this.f81191i);
        this.f81191i.m74436i(this.f81187e);
    }

    /* JADX INFO: renamed from: z */
    public void m109191z(List<BLiveSignPrizes> list) {
        this.f81185c.removeAllViews();
        if (this.f81190h == null) {
            this.f81190h = (LiveSignPrizeListView) act().inflater().inflate(yec0.f198793I5, (ViewGroup) null);
        }
        this.f81190h.m74453c(this.f81187e);
        this.f81190h.setData(list);
        this.f81185c.addView(this.f81190h);
    }
}
