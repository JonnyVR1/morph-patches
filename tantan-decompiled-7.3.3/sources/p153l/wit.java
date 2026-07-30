package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.modeCard.LiveRoomModeCardView;

/* JADX INFO: loaded from: classes13.dex */
public class wit extends uxr<LiveRoomModeCardView> {
    private final ggs cardData;

    public wit(hk4 hk4Var, ggs ggsVar) {
        super(hk4Var);
        this.cardData = ggsVar;
    }

    /* JADX INFO: renamed from: O */
    public static wit m206598O(hk4 hk4Var, a4s a4sVar) {
        if (a4sVar instanceof ggs) {
            return new wit(hk4Var, (ggs) a4sVar);
        }
        return null;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveRoomModeCardView liveRoomModeCardView) {
        super.mo71749u(liveRoomModeCardView);
        liveRoomModeCardView.m68693d(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183748p;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
