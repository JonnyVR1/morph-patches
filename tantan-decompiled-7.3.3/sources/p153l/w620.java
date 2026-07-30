package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;

/* JADX INFO: loaded from: classes11.dex */
public class w620 implements v1b0<v620> {

    /* JADX INFO: renamed from: a */
    public ViewGroup f187588a;

    /* JADX INFO: renamed from: b */
    public View f187589b;

    /* JADX INFO: renamed from: c */
    public x20 f187590c;

    /* JADX INFO: renamed from: d */
    public final Frag f187591d;

    /* JADX INFO: renamed from: e */
    public Fragment f187592e;

    /* JADX INFO: renamed from: f */
    public v620 f187593f;

    public w620(Frag frag) {
        this.f187591d = frag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f187591d.getContext();
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: D1 */
    public void mo44371D1() {
        Fragment fragment = this.f187592e;
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        this.f187592e.onHiddenChanged(true);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v620 v620Var) {
        this.f187593f = v620Var;
    }

    /* JADX INFO: renamed from: b */
    public void m205078b(View view, x20 x20Var) {
        this.f187589b = view;
        this.f187590c = x20Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m205079c() {
        if (this.f187588a.getChildCount() > 0) {
            this.f187588a.removeAllViews();
        }
        this.f187590c.call();
        fog fogVarMo61449C6 = CoreModule.m30932N().mo61449C6(FeedMomentListType.PERSONAL_PAGE_IN_MINE_TAB);
        Bundle bundle = new Bundle();
        bundle.putString("user_id", CoreModule.m30930K().me_().f56859id);
        if (this.f187591d.getContext() != null) {
            this.f187592e = fogVarMo61449C6.mo121747a(this.f187591d.getChildFragmentManager(), this.f187588a.getId(), bundle);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f187588a = viewGroup;
        m205079c();
        return viewGroup;
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: o */
    public boolean mo44445o() {
        return false;
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: x1 */
    public void mo124624x1() {
        Fragment fragment = this.f187592e;
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        this.f187592e.onHiddenChanged(false);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: r */
    public void mo44452r() {
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: x2 */
    public void mo44466x2() {
    }
}
