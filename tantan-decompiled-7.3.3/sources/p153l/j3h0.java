package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.data.ActionPageFormat;
import com.p051p1.mobile.putong.core.data.CardPattern;
import com.p051p1.mobile.putong.core.newui.suggest.SuggestersAct;
import p151v.VPullUpRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class j3h0 implements iam<i3h0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f118180a;

    /* JADX INFO: renamed from: b */
    public VPullUpRecyclerView f118181b;

    /* JADX INFO: renamed from: c */
    public i3h0 f118182c;

    /* JADX INFO: renamed from: d */
    public SuggestersAct f118183d;

    /* JADX INFO: renamed from: e */
    public u2h0 f118184e;

    /* JADX INFO: renamed from: l.j3h0$a */
    public class C17866a extends GridLayoutManager.AbstractC0554c {
        public C17866a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return i == 0 ? 2 : 1;
        }
    }

    public j3h0(SuggestersAct suggestersAct) {
        this.f118183d = suggestersAct;
    }

    /* JADX INFO: renamed from: r */
    private void m143352r() {
        this.f118180a.setLeftIconAsBack(this.f118183d);
        this.f118180a.setLeftIconResource(dbc0.f86456P);
        this.f118180a.setRightIconClip(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f118183d, 2);
        gridLayoutManager.m3327v(new C17866a());
        this.f118181b.setLayoutManager(gridLayoutManager);
        this.f118181b.setPullUpInterval(300L);
        new C0607k(this.f118182c.m138293j0()).m3751g(this.f118181b);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f118183d;
    }

    /* JADX INFO: renamed from: a */
    public View m143353a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k3h0.m148115b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i3h0 i3h0Var) {
        this.f118182c = i3h0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m143355c(CardPattern cardPattern) {
        int iM194270M = this.f118184e.m194270M(cardPattern);
        if (iM194270M >= 1) {
            this.f118184e.notifyItemChanged(iM194270M);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m143356d(CardPattern cardPattern) {
        int iM194271N = this.f118184e.m194271N(cardPattern);
        if (iM194271N >= 1) {
            this.f118184e.notifyItemRemoved(iM194271N);
            u2h0 u2h0Var = this.f118184e;
            u2h0Var.notifyItemRangeChanged(iM194271N, u2h0Var.mo29823C());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m143357e(ActionPageFormat actionPageFormat) {
        this.f118180a.setTitle(actionPageFormat.pageTitle);
        if (this.f118184e == null) {
            u2h0 u2h0Var = new u2h0(this.f118182c);
            this.f118184e = u2h0Var;
            this.f118181b.setAdapter(u2h0Var);
        }
        this.f118184e.m194272O(actionPageFormat.cardPatterns);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM143353a = m143353a(layoutInflater, viewGroup);
        m143352r();
        return viewM143353a;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
