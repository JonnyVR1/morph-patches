package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;

/* JADX INFO: loaded from: classes11.dex */
public class oy10 implements rta0<ny10> {

    /* JADX INFO: renamed from: a */
    public ViewGroup f146268a;

    /* JADX INFO: renamed from: b */
    public View f146269b;

    /* JADX INFO: renamed from: c */
    public d30 f146270c;

    /* JADX INFO: renamed from: d */
    public final Frag f146271d;

    /* JADX INFO: renamed from: e */
    public Fragment f146272e;

    /* JADX INFO: renamed from: f */
    public ny10 f146273f;

    public oy10(Frag frag) {
        this.f146271d = frag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f146271d.getContext();
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: D1 */
    public void mo133487D1() {
        Fragment fragment = this.f146272e;
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        this.f146272e.onHiddenChanged(true);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ny10 ny10Var) {
        this.f146273f = ny10Var;
    }

    /* JADX INFO: renamed from: b */
    public void m166605b(View view, d30 d30Var) {
        this.f146269b = view;
        this.f146270c = d30Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m166606c() {
        if (this.f146268a.getChildCount() > 0) {
            this.f146268a.removeAllViews();
        }
        this.f146270c.call();
        qmg qmgVarMo60265C6 = CoreModule.m29934N().mo60265C6(FeedMomentListType.PERSONAL_PAGE_IN_MINE_TAB);
        Bundle bundle = new Bundle();
        bundle.putString("user_id", CoreModule.m29932K().me_().f56011id);
        if (this.f146271d.getContext() != null) {
            this.f146272e = qmgVarMo60265C6.mo170331a(this.f146271d.getChildFragmentManager(), this.f146268a.getId(), bundle);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f146268a = viewGroup;
        m166606c();
        return viewGroup;
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: o */
    public boolean mo133498o() {
        return false;
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: x1 */
    public void mo166607x1() {
        Fragment fragment = this.f146272e;
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        this.f146272e.onHiddenChanged(false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: r */
    public void mo133501r() {
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: x2 */
    public void mo133503x2() {
    }
}
