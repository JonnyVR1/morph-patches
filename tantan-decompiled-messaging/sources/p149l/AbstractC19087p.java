package p149l;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: l.p */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC19087p extends AbstractC19819s {
    public AbstractC19087p(m03 m03Var) {
        super(m03Var);
    }

    @Override // p149l.AbstractC17501i7
    /* JADX INFO: renamed from: d */
    public String mo117968d() throws NotFoundException {
        if (m134718c().m152494m() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        m177313f(sb, 5);
        m181805j(sb, 45, 15);
        return sb.toString();
    }
}
