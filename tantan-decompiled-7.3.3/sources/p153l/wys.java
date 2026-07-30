package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.honorgift.LiveHonorGiftCardView;

/* JADX INFO: loaded from: classes13.dex */
public class wys extends uxr<LiveHonorGiftCardView> {
    private xys cardData;

    public wys(hk4 hk4Var, xys xysVar) {
        super(hk4Var);
        this.cardData = xysVar;
    }

    /* JADX INFO: renamed from: O */
    public static uxr<?> m208624O(hk4 hk4Var, xys xysVar) {
        return new wys(hk4Var, xysVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        LiveCardTracker.trackMv(this.cardData.m213647j());
        return true;
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.cardData.m213640c());
        LiveCardTracker.trackMc(this.cardData.m213647j());
    }

    /* JADX INFO: renamed from: P */
    public long m208625P() {
        xys xysVar = this.cardData;
        if (xysVar == null) {
            return 0L;
        }
        return xysVar.m213645h();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveHonorGiftCardView liveHonorGiftCardView) {
        super.mo71749u(liveHonorGiftCardView);
        liveHonorGiftCardView.m68683m0(this.cardData);
    }

    /* JADX INFO: renamed from: R */
    public void m208627R(xys xysVar) {
        this.cardData = xysVar;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183744l;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
