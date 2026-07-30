package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.triplecard.LiveTriplePanelCardView;

/* JADX INFO: loaded from: classes13.dex */
public class cfu extends uxr<LiveTriplePanelCardView> {
    private final rbt cardData;

    public cfu(hk4 hk4Var, rbt rbtVar) {
        super(hk4Var);
        this.cardData = rbtVar;
    }

    /* JADX INFO: renamed from: O */
    public static cfu m109603O(hk4 hk4Var, a4s a4sVar) {
        if (a4sVar instanceof rbt) {
            return new cfu(hk4Var, (rbt) a4sVar);
        }
        return null;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        LiveCardTracker.trackMv(this.cardData.m180763c());
        return true;
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.cardData.m180761a());
        LiveCardTracker.trackMc(this.cardData.m180763c());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveTriplePanelCardView liveTriplePanelCardView) {
        super.mo71749u(liveTriplePanelCardView);
        liveTriplePanelCardView.m68699b(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183751s;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 2;
    }
}
