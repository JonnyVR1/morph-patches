package p149l;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class nof extends kof {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(lof.C18270a c18270a) {
        User user = c18270a.f129093c;
        String str = c18270a.f129097g;
        c18270a.f129101k.mo36353D0(c18270a.f129092b, c18270a.f129099i);
        m146702f(m146703g(c18270a), str, user, c18270a.f129100j, c18270a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(lof.C18270a c18270a) {
        return true;
    }
}
