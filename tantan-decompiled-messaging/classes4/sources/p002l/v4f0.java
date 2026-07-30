package p002l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame;
import com.p000p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeListView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.rule.SignInRuleFrame;
import com.p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p1.mobile.putong.live.base.data.BLiveSignPrizes;
import java.util.List;
import l.d30;
import l.hxs;
import l.s7m;
import l.ydt;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v4f0 implements s7m<C0358a> {

    /* JADX INFO: renamed from: a */
    public View f20947a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f20948b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f20949c;

    /* JADX INFO: renamed from: d */
    public SignInAnimFrame f20950d;

    /* JADX INFO: renamed from: e */
    public C0358a f20951e;

    /* JADX INFO: renamed from: f */
    public SignInMainFrame f20952f;

    /* JADX INFO: renamed from: g */
    public SignInRuleFrame f20953g;

    /* JADX INFO: renamed from: h */
    public LiveSignPrizeListView f20954h;

    /* JADX INFO: renamed from: i */
    public SignInMedalFrame f20955i;

    /* JADX INFO: renamed from: j */
    public C0200a f20956j;

    /* JADX INFO: renamed from: d */
    public static void m23719d(v4f0 v4f0Var) {
        v4f0Var.f20947a = null;
        v4f0Var.f20948b = null;
        v4f0Var.f20949c = null;
        v4f0Var.f20950d = null;
    }

    /* JADX INFO: renamed from: n */
    private void m23720n() {
        this.f20949c.removeAllViews();
        m23719d(this);
        this.f20956j = null;
        this.f20952f = null;
        this.f20954h = null;
        SignInRuleFrame signInRuleFrame = this.f20953g;
        if (signInRuleFrame != null) {
            signInRuleFrame.m6819e();
            this.f20953g = null;
        }
        this.f20955i = null;
    }

    /* JADX INFO: renamed from: A */
    public void m23721A() {
        this.f20949c.removeAllViews();
        if (this.f20953g == null) {
            this.f20953g = (SignInRuleFrame) act().inflater().inflate(t6c0.f19569J5, (ViewGroup) null);
        }
        this.f20949c.addView(this.f20953g);
        this.f20953g.m6817c(this.f20951e);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23722C0() {
        return this.f20951e.act();
    }

    /* JADX INFO: renamed from: c */
    public View m23723c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e5f0.m12191b(this, layoutInflater, viewGroup);
    }

    public void destroy() {
        m23726i();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m23727i1(C0358a c0358a) {
        this.f20951e = c0358a;
    }

    /* JADX INFO: renamed from: f */
    public final void m23725f() {
        byr byrVar = new byr(this.f20951e, m23723c(act().inflater(), null));
        this.f20956j = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.t4f0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f19416a.m23730l(dialogInterface);
            }
        });
        this.f20956j.m5146j0(LiveDialogEnum.SIGN_IN);
        this.f20947a.setOnClickListener(new View.OnClickListener() { // from class: l.u4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20485a.m23731m(view);
            }
        });
        hxs.s("context_livingAct", this.f20956j.m5128R().findViewById(g5c0.f10860I), ydt.q);
        this.f20950d.m6720i(this.f20951e);
    }

    /* JADX INFO: renamed from: i */
    public void m23726i() {
        a aVar = this.f20956j;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f20956j.dismiss();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m23728j() {
        a aVar = this.f20956j;
        return aVar != null && aVar.isShowing();
    }

    /* JADX INFO: renamed from: k */
    public boolean m23729k() {
        return this.f20952f != null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m23730l(DialogInterface dialogInterface) {
        m23720n();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m23731m(View view) {
        m23726i();
    }

    /* JADX INFO: renamed from: p */
    public void m23732p(BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        SignInMedalFrame signInMedalFrame = this.f20955i;
        if (signInMedalFrame != null) {
            signInMedalFrame.m6788n(bLiveSignInAchievementMedals);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m23733q(BLiveSignInDetail bLiveSignInDetail) {
        SignInMainFrame signInMainFrame = this.f20952f;
        if (signInMainFrame != null) {
            signInMainFrame.m6751g(bLiveSignInDetail);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m23734s(d30 d30Var) {
        SignInMainFrame signInMainFrame = this.f20952f;
        if (signInMainFrame != null) {
            signInMainFrame.m6752h(d30Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m23735u(List<BLiveSignInReward> list) {
        if (m23728j()) {
            this.f20950d.m6727p(list);
        }
    }

    /* JADX INFO: renamed from: v */
    public String m23736v() {
        SignInMainFrame signInMainFrame = this.f20952f;
        if (signInMainFrame == null) {
            return null;
        }
        return signInMainFrame.m6753i();
    }

    /* JADX INFO: renamed from: w */
    public void m23737w() {
        if (this.f20956j == null) {
            m23725f();
        }
        this.f20956j.show();
    }

    /* JADX INFO: renamed from: x */
    public void m23738x() {
        this.f20949c.removeAllViews();
        if (this.f20952f == null) {
            this.f20952f = (SignInMainFrame) act().inflater().inflate(t6c0.f19509E5, (ViewGroup) null);
        }
        this.f20949c.addView(this.f20952f);
        this.f20952f.m6748d(this.f20951e);
    }

    /* JADX INFO: renamed from: y */
    public void m23739y() {
        this.f20949c.removeAllViews();
        if (this.f20955i == null) {
            this.f20955i = (SignInMedalFrame) act().inflater().inflate(t6c0.f19533G5, (ViewGroup) null);
        }
        this.f20949c.addView(this.f20955i);
        this.f20955i.m6783i(this.f20951e);
    }

    /* JADX INFO: renamed from: z */
    public void m23740z(List<BLiveSignPrizes> list) {
        this.f20949c.removeAllViews();
        if (this.f20954h == null) {
            this.f20954h = (LiveSignPrizeListView) act().inflater().inflate(t6c0.f19557I5, (ViewGroup) null);
        }
        this.f20954h.m6805c(this.f20951e);
        this.f20954h.setData(list);
        this.f20949c.addView(this.f20954h);
    }
}
