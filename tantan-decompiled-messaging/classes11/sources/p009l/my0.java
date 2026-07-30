package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p1.mobile.putong.core.R;
import l.ny0;
import l.o6j0;
import l.s7m;
import l.xdl0;
import v.VButton_FakeShadow;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class my0 implements s7m<ky0> {

    /* JADX INFO: renamed from: a */
    public VButton_FakeShadow f17146a;

    /* JADX INFO: renamed from: b */
    public AppealProgressAct f17147b;

    public my0(AppealProgressAct appealProgressAct) {
        this.f17147b = appealProgressAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m18672e(View view) {
        o6j0.c("e_p_appeal_submit_succeed_confirm", this.f17147b.pageId(), new o6j0.a[0]);
        this.f17147b.finish();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18673C0() {
        return this.f17147b;
    }

    /* JADX INFO: renamed from: b */
    public View m18674b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ny0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public void m18675c() {
        ny0.c(this);
    }

    public void destroy() {
        m18675c();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m18674b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m18678r() {
        this.f17147b.setTitle(R.string.h0);
        xdl0.E0(this.f17146a, new View.OnClickListener() { // from class: l.ly0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16441a.m18672e(view);
            }
        });
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m18677i1(ky0 ky0Var) {
    }
}
