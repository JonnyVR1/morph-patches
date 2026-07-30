package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.honorgift.LiveVoiceHonorCardView;

/* JADX INFO: loaded from: classes13.dex */
public class q4v extends tvr<LiveVoiceHonorCardView> {
    private wws cardData;

    public q4v(ij4 ij4Var, wws wwsVar) {
        super(ij4Var);
        this.cardData = wwsVar;
    }

    /* JADX INFO: renamed from: O */
    public static tvr<?> m172977O(ij4 ij4Var, wws wwsVar) {
        return new q4v(ij4Var, wwsVar);
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

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveVoiceHonorCardView liveVoiceHonorCardView) {
        super.mo70566u(liveVoiceHonorCardView);
        liveVoiceHonorCardView.m67506f(this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152900y;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
