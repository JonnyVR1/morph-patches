package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p046p1.mobile.putong.live.base.data.BLiveSignPrizes;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame;
import com.p046p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeListView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.rule.SignInRuleFrame;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class v4f0 implements s7m<C12769a> {

    /* JADX INFO: renamed from: a */
    public View f179919a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f179920b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f179921c;

    /* JADX INFO: renamed from: d */
    public SignInAnimFrame f179922d;

    /* JADX INFO: renamed from: e */
    public C12769a f179923e;

    /* JADX INFO: renamed from: f */
    public SignInMainFrame f179924f;

    /* JADX INFO: renamed from: g */
    public SignInRuleFrame f179925g;

    /* JADX INFO: renamed from: h */
    public LiveSignPrizeListView f179926h;

    /* JADX INFO: renamed from: i */
    public SignInMedalFrame f179927i;

    /* JADX INFO: renamed from: j */
    public DialogC12611a f179928j;

    /* JADX INFO: renamed from: d */
    public static void m196967d(v4f0 v4f0Var) {
        v4f0Var.f179919a = null;
        v4f0Var.f179920b = null;
        v4f0Var.f179921c = null;
        v4f0Var.f179922d = null;
    }

    /* JADX INFO: renamed from: n */
    private void m196968n() {
        this.f179921c.removeAllViews();
        m196967d(this);
        this.f179928j = null;
        this.f179924f = null;
        this.f179926h = null;
        SignInRuleFrame signInRuleFrame = this.f179925g;
        if (signInRuleFrame != null) {
            signInRuleFrame.m73284e();
            this.f179925g = null;
        }
        this.f179927i = null;
    }

    /* JADX INFO: renamed from: A */
    public void m196969A() {
        this.f179921c.removeAllViews();
        if (this.f179925g == null) {
            this.f179925g = (SignInRuleFrame) act().inflater().inflate(t6c0.f168073J5, (ViewGroup) null);
        }
        this.f179921c.addView(this.f179925g);
        this.f179925g.m73282c(this.f179923e);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f179923e.act();
    }

    /* JADX INFO: renamed from: c */
    public View m196970c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e5f0.m114790b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
        m196973i();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C12769a c12769a) {
        this.f179923e = c12769a;
    }

    /* JADX INFO: renamed from: f */
    public final void m196972f() {
        byr byrVar = new byr(this.f179923e, m196970c(act().inflater(), null));
        this.f179928j = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.t4f0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f167722a.m196976l(dialogInterface);
            }
        });
        this.f179928j.m71778j0(LiveDialogEnum.SIGN_IN);
        this.f179919a.setOnClickListener(new View.OnClickListener() { // from class: l.u4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174595a.m196977m(view);
            }
        });
        hxs.m133406s("context_livingAct", (VDraweeView) this.f179928j.m71760R().findViewById(g5c0.f100710I), ydt.f197627q);
        this.f179922d.m73191i(this.f179923e);
    }

    /* JADX INFO: renamed from: i */
    public void m196973i() {
        DialogC12611a dialogC12611a = this.f179928j;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f179928j.dismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m196974j() {
        DialogC12611a dialogC12611a = this.f179928j;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: k */
    public boolean m196975k() {
        return this.f179924f != null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m196976l(DialogInterface dialogInterface) {
        m196968n();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m196977m(View view) {
        m196973i();
    }

    /* JADX INFO: renamed from: p */
    public void m196978p(BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        SignInMedalFrame signInMedalFrame = this.f179927i;
        if (signInMedalFrame != null) {
            signInMedalFrame.m73258n(bLiveSignInAchievementMedals);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m196979q(BLiveSignInDetail bLiveSignInDetail) {
        SignInMainFrame signInMainFrame = this.f179924f;
        if (signInMainFrame != null) {
            signInMainFrame.m73222g(bLiveSignInDetail);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m196980s(d30 d30Var) {
        SignInMainFrame signInMainFrame = this.f179924f;
        if (signInMainFrame != null) {
            signInMainFrame.m73223h(d30Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m196981u(List<BLiveSignInReward> list) {
        if (m196974j()) {
            this.f179922d.m73198p(list);
        }
    }

    /* JADX INFO: renamed from: v */
    public String m196982v() {
        SignInMainFrame signInMainFrame = this.f179924f;
        if (signInMainFrame == null) {
            return null;
        }
        return signInMainFrame.m73224i();
    }

    /* JADX INFO: renamed from: w */
    public void m196983w() {
        if (this.f179928j == null) {
            m196972f();
        }
        this.f179928j.show();
    }

    /* JADX INFO: renamed from: x */
    public void m196984x() {
        this.f179921c.removeAllViews();
        if (this.f179924f == null) {
            this.f179924f = (SignInMainFrame) act().inflater().inflate(t6c0.f168013E5, (ViewGroup) null);
        }
        this.f179921c.addView(this.f179924f);
        this.f179924f.m73219d(this.f179923e);
    }

    /* JADX INFO: renamed from: y */
    public void m196985y() {
        this.f179921c.removeAllViews();
        if (this.f179927i == null) {
            this.f179927i = (SignInMedalFrame) act().inflater().inflate(t6c0.f168037G5, (ViewGroup) null);
        }
        this.f179921c.addView(this.f179927i);
        this.f179927i.m73253i(this.f179923e);
    }

    /* JADX INFO: renamed from: z */
    public void m196986z(List<BLiveSignPrizes> list) {
        this.f179921c.removeAllViews();
        if (this.f179926h == null) {
            this.f179926h = (LiveSignPrizeListView) act().inflater().inflate(t6c0.f168061I5, (ViewGroup) null);
        }
        this.f179926h.m73270c(this.f179923e);
        this.f179926h.setData(list);
        this.f179921c.addView(this.f179926h);
    }
}
