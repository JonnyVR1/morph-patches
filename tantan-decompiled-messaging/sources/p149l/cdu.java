package p149l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.tvline.LiveTvLineCardView;

/* JADX INFO: loaded from: classes13.dex */
public class cdu extends tvr<LiveTvLineCardView> implements m3m {
    private final ddu cardData;
    private final bs5 compositeSubscription;

    public cdu(ij4 ij4Var, ddu dduVar) {
        super(ij4Var);
        this.compositeSubscription = new bs5();
        this.cardData = dduVar;
    }

    /* JADX INFO: renamed from: O */
    public static cdu m106290O(ij4 ij4Var, ddu dduVar) {
        if (dduVar == null) {
            return null;
        }
        return new cdu(ij4Var, dduVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        return true;
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveTvLineCardView liveTvLineCardView) {
        super.mo70566u(liveTvLineCardView);
        liveTvLineCardView.m67535a(this.cardData, this.cardContext.f113496lp, this.compositeSubscription);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveTvLineCardView liveTvLineCardView) {
        super.mo71000w(liveTvLineCardView);
        this.compositeSubscription.m103657c();
    }

    @Override // p149l.m3m
    /* JADX INFO: renamed from: b */
    public void mo70351b(RecyclerView.AbstractC0566d0 abstractC0566d0, StaggeredGridLayoutManager.C0593c c0593c) {
        c0593c.m3576i(true);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152895t;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
