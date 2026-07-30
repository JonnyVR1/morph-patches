package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import p151v.VButton_FakeShadow;

/* JADX INFO: loaded from: classes11.dex */
public class ty0 implements iam<ry0> {

    /* JADX INFO: renamed from: a */
    public VButton_FakeShadow f176628a;

    /* JADX INFO: renamed from: b */
    public AppealProgressAct f176629b;

    public ty0(AppealProgressAct appealProgressAct) {
        this.f176629b = appealProgressAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m193553e(View view) {
        sfj0.m185596c("e_p_appeal_submit_succeed_confirm", this.f176629b.pageId(), new sfj0.C20032a[0]);
        this.f176629b.lambda$debugItems$19();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f176629b;
    }

    /* JADX INFO: renamed from: b */
    public View m193554b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uy0.m198578b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public void m193555c() {
        uy0.m198579c(this);
    }

    @Override // p153l.iam
    public void destroy() {
        m193555c();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m193554b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m193557r() {
        this.f176629b.setTitle(R$string.f19293h0);
        bnl0.m105509E0(this.f176628a, new View.OnClickListener() { // from class: l.sy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171205a.m193553e(view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ry0 ry0Var) {
    }
}
