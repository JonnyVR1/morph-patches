package p153l;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: l.p */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC19260p extends AbstractC19944s {
    public AbstractC19260p(b13 b13Var) {
        super(b13Var);
    }

    @Override // p153l.AbstractC16467d7
    /* JADX INFO: renamed from: d */
    public String mo114575d() throws NotFoundException {
        if (m114574c().m101402m() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        m178991f(sb, 5);
        m183865j(sb, 45, 15);
        return sb.toString();
    }
}
