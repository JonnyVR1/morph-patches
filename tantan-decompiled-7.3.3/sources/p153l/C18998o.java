package p153l;

import com.google.zxing.NotFoundException;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;

/* JADX INFO: renamed from: l.o */
/* JADX INFO: loaded from: classes7.dex */
public final class C18998o extends AbstractC19944s {

    /* JADX INFO: renamed from: c */
    public final String f144485c;

    /* JADX INFO: renamed from: d */
    public final String f144486d;

    public C18998o(b13 b13Var, String str, String str2) {
        super(b13Var);
        this.f144485c = str2;
        this.f144486d = str;
    }

    @Override // p153l.AbstractC16467d7
    /* JADX INFO: renamed from: d */
    public String mo114575d() throws NotFoundException {
        if (m114574c().m101402m() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        m178991f(sb, 8);
        m183865j(sb, 48, 20);
        m165408k(sb, 68);
        return sb.toString();
    }

    @Override // p153l.AbstractC19944s
    /* JADX INFO: renamed from: h */
    public void mo147749h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f144486d);
        sb.append(i / LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
        sb.append(')');
    }

    @Override // p153l.AbstractC19944s
    /* JADX INFO: renamed from: i */
    public int mo147750i(int i) {
        return i % LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
    }

    /* JADX INFO: renamed from: k */
    public final void m165408k(StringBuilder sb, int i) {
        int iM186581f = m114573b().m186581f(i, 16);
        if (iM186581f == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.f144485c);
        sb.append(')');
        int i2 = iM186581f % 32;
        int i3 = iM186581f / 32;
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
