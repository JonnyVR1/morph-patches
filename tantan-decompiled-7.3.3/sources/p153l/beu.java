package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.titleline.LiveTitleLineCardView;

/* JADX INFO: loaded from: classes13.dex */
public class beu extends uxr<LiveTitleLineCardView> {
    private final ceu cardData;

    public beu(hk4 hk4Var, ceu ceuVar) {
        super(hk4Var);
        this.cardData = ceuVar;
    }

    /* JADX INFO: renamed from: O */
    public static beu m103783O(hk4 hk4Var, a4s a4sVar) {
        if (a4sVar instanceof ceu) {
            return new beu(hk4Var, (ceu) a4sVar);
        }
        return null;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveTitleLineCardView liveTitleLineCardView) {
        super.mo71749u(liveTitleLineCardView);
        liveTitleLineCardView.m68697c(this.cardContext, this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183750r;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
