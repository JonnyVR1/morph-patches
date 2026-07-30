package p153l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.tvline.LiveTvLineCardView;

/* JADX INFO: loaded from: classes13.dex */
public class dfu extends uxr<LiveTvLineCardView> implements d6m {
    private final efu cardData;
    private final ft5 compositeSubscription;

    public dfu(hk4 hk4Var, efu efuVar) {
        super(hk4Var);
        this.compositeSubscription = new ft5();
        this.cardData = efuVar;
    }

    /* JADX INFO: renamed from: O */
    public static dfu m115544O(hk4 hk4Var, efu efuVar) {
        if (efuVar == null) {
            return null;
        }
        return new dfu(hk4Var, efuVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        return true;
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveTvLineCardView liveTvLineCardView) {
        super.mo71749u(liveTvLineCardView);
        liveTvLineCardView.m68718a(this.cardData, this.cardContext.f110375lp, this.compositeSubscription);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveTvLineCardView liveTvLineCardView) {
        super.mo72183w(liveTvLineCardView);
        this.compositeSubscription.m127299c();
    }

    @Override // p153l.d6m
    /* JADX INFO: renamed from: b */
    public void mo71534b(RecyclerView.AbstractC0569e0 abstractC0569e0, StaggeredGridLayoutManager.C0595c c0595c) {
        c0595c.m3577i(true);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183752t;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
