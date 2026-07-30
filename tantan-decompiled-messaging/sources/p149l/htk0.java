package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterExplainAct;
import p147v.VDraweeView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class htk0 implements s7m<gtk0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f109394a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f109395b;

    /* JADX INFO: renamed from: c */
    public VerificationCenterExplainAct f109396c;

    public htk0(VerificationCenterExplainAct verificationCenterExplainAct) {
        this.f109396c = verificationCenterExplainAct;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f109396c;
    }

    /* JADX INFO: renamed from: a */
    public View m132869a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return itk0.m138215b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m132869a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m132871r() {
        this.f109394a.setTitle(this.f109396c.string(R$string.f18896rr));
        this.f109394a.setLeftIconAsBack(act());
        xdl0.m208325C0(this.f109395b, (int) (((double) (xdl0.m208412y0() - t100.m186890d(40.0f))) / 0.3284d));
        qib0.f154691G.m102331L0(this.f109395b, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVIVFI2SElOVkZCMk5MN0ZNNUVTR1U2Wk1ZS0pSVDEyIiwidyI6MTAwNSwiaCI6MzA2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNDg3MDE5MTg5NTY4MDAzMjl9.png");
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gtk0 gtk0Var) {
    }
}
