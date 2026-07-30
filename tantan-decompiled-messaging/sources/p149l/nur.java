package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.avatarline.LiveAvatarLineCardView;

/* JADX INFO: loaded from: classes13.dex */
public class nur extends tvr<LiveAvatarLineCardView> {
    private final our cardData;

    public nur(ij4 ij4Var, our ourVar) {
        super(ij4Var);
        this.cardData = ourVar;
    }

    /* JADX INFO: renamed from: O */
    public static nur m161516O(ij4 ij4Var, z1s z1sVar) {
        if (z1sVar instanceof our) {
            return new nur(ij4Var, (our) z1sVar);
        }
        return null;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveAvatarLineCardView liveAvatarLineCardView) {
        super.mo70566u(liveAvatarLineCardView);
        liveAvatarLineCardView.m67389e(this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152877b;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
