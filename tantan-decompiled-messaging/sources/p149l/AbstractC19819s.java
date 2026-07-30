package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;

/* JADX INFO: renamed from: l.s */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC19819s extends AbstractC19616r {
    public AbstractC19819s(m03 m03Var) {
        super(m03Var);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo143970h(StringBuilder sb, int i);

    /* JADX INFO: renamed from: i */
    public abstract int mo143971i(int i);

    /* JADX INFO: renamed from: j */
    public final void m181805j(StringBuilder sb, int i, int i2) {
        int iM219035f = m134717b().m219035f(i, i2);
        mo143970h(sb, iM219035f);
        int iMo143971i = mo143971i(iM219035f);
        int i3 = LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
        for (int i4 = 0; i4 < 5; i4++) {
            if (iMo143971i / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(iMo143971i);
    }
}
