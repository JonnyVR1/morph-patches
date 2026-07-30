package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.honorgift.LiveVoiceHonorCardView;

/* JADX INFO: loaded from: classes13.dex */
public class r6v extends uxr<LiveVoiceHonorCardView> {
    private xys cardData;

    public r6v(hk4 hk4Var, xys xysVar) {
        super(hk4Var);
        this.cardData = xysVar;
    }

    /* JADX INFO: renamed from: O */
    public static uxr<?> m180049O(hk4 hk4Var, xys xysVar) {
        return new r6v(hk4Var, xysVar);
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

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveVoiceHonorCardView liveVoiceHonorCardView) {
        super.mo71749u(liveVoiceHonorCardView);
        liveVoiceHonorCardView.m68689f(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183757y;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
