package p149l;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.User;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class sph extends pph {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(qph.C19553a c19553a) {
        User user = c19553a.f155759c;
        boolean z = c19553a.f155760d == SwipeDirection.UP;
        HashMap map = new HashMap();
        map.put("sourcepage", dcl.f85441J);
        map.put("actiontype", c19553a.f155761e ? dcl.f85442K : dcl.f85443L);
        c19553a.f155763g.mo43122M2(c19553a.f155758b, c19553a.f155760d);
        m170720f(m170721g(c19553a), z, user, map, c19553a.f155761e, c19553a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(qph.C19553a c19553a) {
        return true;
    }
}
