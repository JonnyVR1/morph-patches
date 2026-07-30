package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.titleline.LiveTitleLineCardView;

/* JADX INFO: loaded from: classes13.dex */
public class acu extends tvr<LiveTitleLineCardView> {
    private final bcu cardData;

    public acu(ij4 ij4Var, bcu bcuVar) {
        super(ij4Var);
        this.cardData = bcuVar;
    }

    /* JADX INFO: renamed from: O */
    public static acu m95842O(ij4 ij4Var, z1s z1sVar) {
        if (z1sVar instanceof bcu) {
            return new acu(ij4Var, (bcu) z1sVar);
        }
        return null;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveTitleLineCardView liveTitleLineCardView) {
        super.mo70566u(liveTitleLineCardView);
        liveTitleLineCardView.m67514c(this.cardContext, this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152893r;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
