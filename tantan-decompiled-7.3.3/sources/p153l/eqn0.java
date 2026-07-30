package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class eqn0 {

    /* JADX INFO: renamed from: a */
    public List<BLiveVoiceCallInvite> f95354a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, nsv<User>> f95355b = new HashMap<>();

    public eqn0(List<BLiveVoiceCallInvite> list, List<User> list2, List<BLiveUserMask> list3, final boolean z) {
        this.f95354a = list;
        final HashMap mapM147502d = jyb.m147502d(list3, new qcj() { // from class: l.bqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new qcj() { // from class: l.cqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return eqn0.m121949a((BLiveUserMask) obj);
            }
        });
        jyb.m147537z(list2, new y20() { // from class: l.dqn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90268a.m121952d(mapM147502d, z, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveUserMask m121949a(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m121952d(HashMap map, boolean z, User user) {
        HashMap<String, nsv<User>> map2 = this.f95355b;
        String str = user.f56859id;
        nsv nsvVarM164636f = nsv.m164636f(user);
        String str2 = user.f56859id;
        map2.put(str, nsvVarM164636f.m164639c(str2, (BLiveUserMask) map.get(str2), z));
    }
}
