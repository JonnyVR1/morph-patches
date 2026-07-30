package p149l;

import com.google.zxing.NotFoundException;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;

/* JADX INFO: renamed from: l.o */
/* JADX INFO: loaded from: classes7.dex */
public final class C18807o extends AbstractC19819s {

    /* JADX INFO: renamed from: c */
    public final String f141271c;

    /* JADX INFO: renamed from: d */
    public final String f141272d;

    public C18807o(m03 m03Var, String str, String str2) {
        super(m03Var);
        this.f141271c = str2;
        this.f141272d = str;
    }

    @Override // p149l.AbstractC17501i7
    /* JADX INFO: renamed from: d */
    public String mo117968d() throws NotFoundException {
        if (m134718c().m152494m() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        m177313f(sb, 8);
        m181805j(sb, 48, 20);
        m162101k(sb, 68);
        return sb.toString();
    }

    @Override // p149l.AbstractC19819s
    /* JADX INFO: renamed from: h */
    public void mo143970h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f141272d);
        sb.append(i / LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
        sb.append(')');
    }

    @Override // p149l.AbstractC19819s
    /* JADX INFO: renamed from: i */
    public int mo143971i(int i) {
        return i % LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
    }

    /* JADX INFO: renamed from: k */
    public final void m162101k(StringBuilder sb, int i) {
        int iM219035f = m134717b().m219035f(i, 16);
        if (iM219035f == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.f141271c);
        sb.append(')');
        int i2 = iM219035f % 32;
        int i3 = iM219035f / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i5);
        if (i4 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i4);
        if (i2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i2);
    }
}
