package p153l;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: l.m */
/* JADX INFO: loaded from: classes7.dex */
public final class C18517m extends AbstractC19706r {
    public C18517m(b13 b13Var) {
        super(b13Var);
    }

    @Override // p153l.AbstractC16467d7
    /* JADX INFO: renamed from: d */
    public String mo114575d() throws NotFoundException, FormatException {
        if (m114574c().m101402m() < 48) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        m178991f(sb, 8);
        int iM186581f = m114573b().m186581f(48, 2);
        sb.append("(392");
        sb.append(iM186581f);
        sb.append(')');
        sb.append(m114573b().m186578c(50, null).m219685b());
        return sb.toString();
    }
}
