package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.data.ActionPageFormat;
import com.p046p1.mobile.putong.core.data.CardPattern;
import com.p046p1.mobile.putong.core.newui.suggest.SuggestersAct;
import p147v.VPullUpRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class bvg0 implements s7m<avg0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f77443a;

    /* JADX INFO: renamed from: b */
    public VPullUpRecyclerView f77444b;

    /* JADX INFO: renamed from: c */
    public avg0 f77445c;

    /* JADX INFO: renamed from: d */
    public SuggestersAct f77446d;

    /* JADX INFO: renamed from: e */
    public mug0 f77447e;

    /* JADX INFO: renamed from: l.bvg0$a */
    public class C15981a extends GridLayoutManager.AbstractC0553c {
        public C15981a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return i == 0 ? 2 : 1;
        }
    }

    public bvg0(SuggestersAct suggestersAct) {
        this.f77446d = suggestersAct;
    }

    /* JADX INFO: renamed from: r */
    private void m104034r() {
        this.f77443a.setLeftIconAsBack(this.f77446d);
        this.f77443a.setLeftIconResource(x2c0.f189593O);
        this.f77443a.setRightIconClip(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f77446d, 2);
        gridLayoutManager.m3326v(new C15981a());
        this.f77444b.setLayoutManager(gridLayoutManager);
        this.f77444b.setPullUpInterval(300L);
        new C0605k(this.f77445c.m99184j0()).m3750g(this.f77444b);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77446d;
    }

    /* JADX INFO: renamed from: a */
    public View m104035a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cvg0.m108862b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(avg0 avg0Var) {
        this.f77445c = avg0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m104037c(CardPattern cardPattern) {
        int iM156401M = this.f77447e.m156401M(cardPattern);
        if (iM156401M >= 1) {
            this.f77447e.notifyItemChanged(iM156401M);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m104038d(CardPattern cardPattern) {
        int iM156402N = this.f77447e.m156402N(cardPattern);
        if (iM156402N >= 1) {
            this.f77447e.notifyItemRemoved(iM156402N);
            mug0 mug0Var = this.f77447e;
            mug0Var.notifyItemRangeChanged(iM156402N, mug0Var.mo28824C());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m104039e(ActionPageFormat actionPageFormat) {
        this.f77443a.setTitle(actionPageFormat.pageTitle);
        if (this.f77447e == null) {
            mug0 mug0Var = new mug0(this.f77445c);
            this.f77447e = mug0Var;
            this.f77444b.setAdapter(mug0Var);
        }
        this.f77447e.m156403O(actionPageFormat.cardPatterns);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM104035a = m104035a(layoutInflater, viewGroup);
        m104034r();
        return viewM104035a;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
