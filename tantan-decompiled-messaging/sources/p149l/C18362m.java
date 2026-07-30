package p149l;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: l.m */
/* JADX INFO: loaded from: classes7.dex */
public final class C18362m extends AbstractC19616r {
    public C18362m(m03 m03Var) {
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
        sb.append("(392");
        sb.append(iM219035f);
        sb.append(')');
        sb.append(m134717b().m219032c(50, null).m188805b());
        return sb.toString();
    }
}
