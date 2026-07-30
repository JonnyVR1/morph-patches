package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.modeCard.LiveRoomModeCardView;

/* JADX INFO: loaded from: classes13.dex */
public class vgt extends tvr<LiveRoomModeCardView> {
    private final fes cardData;

    public vgt(ij4 ij4Var, fes fesVar) {
        super(ij4Var);
        this.cardData = fesVar;
    }

    /* JADX INFO: renamed from: O */
    public static vgt m198387O(ij4 ij4Var, z1s z1sVar) {
        if (z1sVar instanceof fes) {
            return new vgt(ij4Var, (fes) z1sVar);
        }
        return null;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveRoomModeCardView liveRoomModeCardView) {
        super.mo70566u(liveRoomModeCardView);
        liveRoomModeCardView.m67510d(this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152891p;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
