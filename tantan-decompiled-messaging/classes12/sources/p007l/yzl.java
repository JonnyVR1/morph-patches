package p007l;

import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import java.util.List;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface yzl {
    /* JADX INFO: renamed from: F2 */
    default boolean m17203F2(j760<Links, List<Moment>> j760Var) {
        return false;
    }

    /* JADX INFO: renamed from: L0 */
    hx60 mo3004L0();

    /* JADX INFO: renamed from: X0 */
    d7h mo3008X0();

    /* JADX INFO: renamed from: a1 */
    default boolean mo8712a1(j760<Links, List<Moment>> j760Var) {
        return false;
    }

    /* JADX INFO: renamed from: n1 */
    boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i);

    /* JADX INFO: renamed from: q */
    void mo3013q();

    /* JADX INFO: renamed from: s0 */
    C2124a mo3014s0();
}
