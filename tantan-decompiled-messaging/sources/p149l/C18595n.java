package p149l;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: l.n */
/* JADX INFO: loaded from: classes7.dex */
public final class C18595n extends AbstractC19616r {
    public C18595n(m03 m03Var) {
        super(m03Var);
    }

    @Override // p149l.AbstractC17501i7
    /* JADX INFO: renamed from: d */
    public String mo117968d() throws NotFoundException, FormatException {
        if (m134718c().m152494m() < 48) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        m177313f(sb, 8);
        int iM219035f = m134717b().m219035f(48, 2);
        sb.append("(393");
        sb.append(iM219035f);
        sb.append(')');
        int iM219035f2 = m134717b().m219035f(50, 10);
        if (iM219035f2 / 100 == 0) {
            sb.append('0');
        }
        if (iM219035f2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(iM219035f2);
        sb.append(m134717b().m219032c(60, null).m188805b());
        return sb.toString();
    }
}
