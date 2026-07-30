package p009l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.tantanapp.common.data.DbObject;
import l.d30;
import l.qmg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oy10 implements rta0<ny10> {

    /* JADX INFO: renamed from: a */
    public ViewGroup f18288a;

    /* JADX INFO: renamed from: b */
    public View f18289b;

    /* JADX INFO: renamed from: c */
    public d30 f18290c;

    /* JADX INFO: renamed from: d */
    public final Frag f18291d;

    /* JADX INFO: renamed from: e */
    public Fragment f18292e;

    /* JADX INFO: renamed from: f */
    public ny10 f18293f;

    public oy10(Frag frag) {
        this.f18291d = frag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20042C0() {
        return this.f18291d.getContext();
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: D1 */
    public void mo16014D1() {
        Fragment fragment = this.f18292e;
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        this.f18292e.onHiddenChanged(true);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m20046i1(ny10 ny10Var) {
        this.f18293f = ny10Var;
    }

    /* JADX INFO: renamed from: b */
    public void m20044b(View view, d30 d30Var) {
        this.f18289b = view;
        this.f18290c = d30Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m20045c() {
        if (this.f18288a.getChildCount() > 0) {
            this.f18288a.removeAllViews();
        }
        this.f18290c.call();
        qmg qmgVarC6 = CoreModule.N().C6(FeedMomentListType.PERSONAL_PAGE_IN_MINE_TAB);
        Bundle bundle = new Bundle();
        bundle.putString("user_id", ((DbObject) CoreModule.K().me_()).id);
        if (this.f18291d.getContext() != null) {
            this.f18292e = qmgVarC6.a(this.f18291d.getChildFragmentManager(), this.f18288a.getId(), bundle);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f18288a = viewGroup;
        m20045c();
        return viewGroup;
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: o */
    public boolean mo16026o() {
        return false;
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: x1 */
    public void mo20047x1() {
        Fragment fragment = this.f18292e;
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        this.f18292e.onHiddenChanged(false);
    }

    public void destroy() {
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: r */
    public void mo16029r() {
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: x2 */
    public void mo16031x2() {
    }
}
