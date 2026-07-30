package p153l;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: l.q */
/* JADX INFO: loaded from: classes7.dex */
public final class C19480q extends AbstractC19706r {
    public C19480q(b13 b13Var) {
        super(b13Var);
    }

    @Override // p153l.AbstractC16467d7
    /* JADX INFO: renamed from: d */
    public String mo114575d() throws NotFoundException, FormatException {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(m114573b().m186581f(4, 4));
        m178992g(sb, 8, length);
        return m114573b().m186576a(sb, 48);
    }
}
