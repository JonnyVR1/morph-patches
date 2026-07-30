package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;

/* JADX INFO: renamed from: l.s */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC19944s extends AbstractC19706r {
    public AbstractC19944s(b13 b13Var) {
        super(b13Var);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo147749h(StringBuilder sb, int i);

    /* JADX INFO: renamed from: i */
    public abstract int mo147750i(int i);

    /* JADX INFO: renamed from: j */
    public final void m183865j(StringBuilder sb, int i, int i2) {
        int iM186581f = m114573b().m186581f(i, i2);
        mo147749h(sb, iM186581f);
        int iMo147750i = mo147750i(iM186581f);
        int i3 = LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
        for (int i4 = 0; i4 < 5; i4++) {
            if (iMo147750i / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(iMo147750i);
    }
}
