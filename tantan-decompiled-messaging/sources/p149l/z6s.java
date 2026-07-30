package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.doublecard.LiveDoublePanelCardView;

/* JADX INFO: loaded from: classes13.dex */
public class z6s extends tvr<LiveDoublePanelCardView> {
    private final q9t cardData;

    public z6s(ij4 ij4Var, q9t q9tVar) {
        super(ij4Var);
        this.cardData = q9tVar;
    }

    /* JADX INFO: renamed from: O */
    public static z6s m217417O(ij4 ij4Var, z1s z1sVar) {
        if (z1sVar instanceof q9t) {
            return new z6s(ij4Var, (q9t) z1sVar);
        }
        return null;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        LiveCardTracker.trackMv(this.cardData.m173675c());
        return true;
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.cardData.m173673a());
        LiveCardTracker.trackMc(this.cardData.m173675c());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveDoublePanelCardView liveDoublePanelCardView) {
        super.mo70566u(liveDoublePanelCardView);
        liveDoublePanelCardView.m67438b(this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152883h;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 3;
    }
}
