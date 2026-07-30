package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.honorgift.LiveHonorGiftCardView;

/* JADX INFO: loaded from: classes13.dex */
public class vws extends tvr<LiveHonorGiftCardView> {
    private wws cardData;

    public vws(ij4 ij4Var, wws wwsVar) {
        super(ij4Var);
        this.cardData = wwsVar;
    }

    /* JADX INFO: renamed from: O */
    public static tvr<?> m200438O(ij4 ij4Var, wws wwsVar) {
        return new vws(ij4Var, wwsVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        LiveCardTracker.trackMv(this.cardData.m205884j());
        return true;
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.cardData.m205877c());
        LiveCardTracker.trackMc(this.cardData.m205884j());
    }

    /* JADX INFO: renamed from: P */
    public long m200439P() {
        wws wwsVar = this.cardData;
        if (wwsVar == null) {
            return 0L;
        }
        return wwsVar.m205882h();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveHonorGiftCardView liveHonorGiftCardView) {
        super.mo70566u(liveHonorGiftCardView);
        liveHonorGiftCardView.m67500m0(this.cardData);
    }

    /* JADX INFO: renamed from: R */
    public void m200441R(wws wwsVar) {
        this.cardData = wwsVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152887l;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 3;
    }
}
