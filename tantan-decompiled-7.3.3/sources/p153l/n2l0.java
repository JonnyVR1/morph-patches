package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterExplainAct;
import p151v.VDraweeView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class n2l0 implements iam<m2l0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f139873a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f139874b;

    /* JADX INFO: renamed from: c */
    public VerificationCenterExplainAct f139875c;

    public n2l0(VerificationCenterExplainAct verificationCenterExplainAct) {
        this.f139875c = verificationCenterExplainAct;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f139875c;
    }

    /* JADX INFO: renamed from: a */
    public View m161239a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o2l0.m165733b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m161239a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m161241r() {
        this.f139873a.setTitle(this.f139875c.string(R$string.f18714Nr));
        this.f139873a.setLeftIconAsBack(act());
        bnl0.m105505C0(this.f139874b, (int) (((double) (bnl0.m105592y0() - qa00.m175859d(40.0f))) / 0.3284d));
        uqb0.f180374G.m127115L0(this.f139874b, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVIVFI2SElOVkZCMk5MN0ZNNUVTR1U2Wk1ZS0pSVDEyIiwidyI6MTAwNSwiaCI6MzA2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNDg3MDE5MTg5NTY4MDAzMjl9.png");
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(m2l0 m2l0Var) {
    }
}
