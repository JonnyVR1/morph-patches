package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.VerificationCenterExplainAct;
import l.itk0;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VDraweeView;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class htk0 implements s7m<gtk0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f14052a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f14053b;

    /* JADX INFO: renamed from: c */
    public VerificationCenterExplainAct f14054c;

    public htk0(VerificationCenterExplainAct verificationCenterExplainAct) {
        this.f14054c = verificationCenterExplainAct;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16314C0() {
        return this.f14054c;
    }

    /* JADX INFO: renamed from: a */
    public View m16315a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return itk0.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m16315a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m16318r() {
        this.f14052a.setTitle(this.f14054c.string(R$string.f2885rr));
        this.f14052a.setLeftIconAsBack(act());
        xdl0.C0(this.f14053b, (int) (((double) (xdl0.y0() - t100.d(40.0f))) / 0.3284d));
        qib0.f19782G.m12744L0(this.f14053b, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVIVFI2SElOVkZCMk5MN0ZNNUVTR1U2Wk1ZS0pSVDEyIiwidyI6MTAwNSwiaCI6MzA2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNDg3MDE5MTg5NTY4MDAzMjl9.png");
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m16317i1(gtk0 gtk0Var) {
    }
}
