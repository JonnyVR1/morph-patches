package p153l;

/* JADX INFO: renamed from: l.r */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC19706r extends AbstractC16467d7 {
    public AbstractC19706r(b13 b13Var) {
        super(b13Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m178990e(StringBuilder sb, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int iCharAt = sb.charAt(i3 + i) - '0';
            if ((i3 & 1) == 0) {
                iCharAt *= 3;
            }
            i2 += iCharAt;
        }
        int i4 = 10 - (i2 % 10);
        sb.append(i4 != 10 ? i4 : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m178991f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        m178992g(sb, i, length);
    }

    /* JADX INFO: renamed from: g */
    public final void m178992g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int iM186581f = m114573b().m186581f((i3 * 10) + i, 10);
            if (iM186581f / 100 == 0) {
                sb.append('0');
            }
            if (iM186581f / 10 == 0) {
                sb.append('0');
            }
            sb.append(iM186581f);
        }
        m178990e(sb, i2);
    }
}
