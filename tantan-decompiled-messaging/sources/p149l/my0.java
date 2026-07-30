package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import p147v.VButton_FakeShadow;

/* JADX INFO: loaded from: classes11.dex */
public class my0 implements s7m<ky0> {

    /* JADX INFO: renamed from: a */
    public VButton_FakeShadow f136239a;

    /* JADX INFO: renamed from: b */
    public AppealProgressAct f136240b;

    public my0(AppealProgressAct appealProgressAct) {
        this.f136240b = appealProgressAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m156946e(View view) {
        o6j0.m162859c("e_p_appeal_submit_succeed_confirm", this.f136240b.pageId(), new o6j0.C18854a[0]);
        this.f136240b.lambda$debugItems$19();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f136240b;
    }

    /* JADX INFO: renamed from: b */
    public View m156947b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ny0.m161961b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public void m156948c() {
        ny0.m161962c(this);
    }

    @Override // p149l.s7m
    public void destroy() {
        m156948c();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m156947b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m156950r() {
        this.f136240b.setTitle(R$string.f18563h0);
        xdl0.m208329E0(this.f136239a, new View.OnClickListener() { // from class: l.ly0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130483a.m156946e(view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ky0 ky0Var) {
    }
}
