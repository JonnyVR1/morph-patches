package p149l;

import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface yzl {
    /* JADX INFO: renamed from: F2 */
    default boolean m216684F2(j760<Links, List<Moment>> j760Var) {
        return false;
    }

    /* JADX INFO: renamed from: L0 */
    hx60 mo62028L0();

    /* JADX INFO: renamed from: X0 */
    d7h mo62032X0();

    /* JADX INFO: renamed from: a1 */
    default boolean mo100593a1(j760<Links, List<Moment>> j760Var) {
        return false;
    }

    /* JADX INFO: renamed from: n1 */
    boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i);

    /* JADX INFO: renamed from: q */
    void mo62035q();

    /* JADX INFO: renamed from: s0 */
    C11280a mo62036s0();
}
