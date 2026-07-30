package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.avatarline.LiveAvatarLineCardView;

/* JADX INFO: loaded from: classes13.dex */
public class owr extends uxr<LiveAvatarLineCardView> {
    private final pwr cardData;

    public owr(hk4 hk4Var, pwr pwrVar) {
        super(hk4Var);
        this.cardData = pwrVar;
    }

    /* JADX INFO: renamed from: O */
    public static owr m169616O(hk4 hk4Var, a4s a4sVar) {
        if (a4sVar instanceof pwr) {
            return new owr(hk4Var, (pwr) a4sVar);
        }
        return null;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveAvatarLineCardView liveAvatarLineCardView) {
        super.mo71749u(liveAvatarLineCardView);
        liveAvatarLineCardView.m68572e(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183734b;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
