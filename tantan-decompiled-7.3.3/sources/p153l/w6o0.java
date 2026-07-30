package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class w6o0 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ User m205179d(User user) {
        return user;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ BLiveUserMask m205182g(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: i */
    public static nsv<User> m205184i(BLiveEnvelope bLiveEnvelope, boolean z, final String str) {
        ArrayList arrayListM147522n = jyb.m147522n(bLiveEnvelope.data.users, new qcj() { // from class: l.t6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((User) obj).f56859id));
            }
        });
        User user = (User) (jyb.m147479J(arrayListM147522n) ? bLiveEnvelope.data.users.get(0) : arrayListM147522n.get(0));
        return nsv.m164636f(user).m164639c(user.f56859id, m205186k(bLiveEnvelope).get(user.f56859id), z);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static nsv<User> m205185j(BLiveEnvelope bLiveEnvelope, boolean z, final String str) {
        ArrayList arrayListM147522n = jyb.m147522n(bLiveEnvelope.data.users, new qcj() { // from class: l.u6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((User) obj).f56859id));
            }
        });
        User user = jyb.m147479J(arrayListM147522n) ? null : (User) arrayListM147522n.get(0);
        if (user != null) {
            return nsv.m164636f(user).m164639c(user.f56859id, m205186k(bLiveEnvelope).get(user.f56859id), z);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static HashMap<String, BLiveUserMask> m205186k(BLiveEnvelope bLiveEnvelope) {
        final HashMap<String, BLiveUserMask> map = new HashMap<>();
        if (!jyb.m147479J(bLiveEnvelope.data.masks)) {
            jyb.m147537z(bLiveEnvelope.data.masks, new y20() { // from class: l.n6o0
                @Override // p153l.y20
                public final void call(Object obj) {
                    BLiveUserMask bLiveUserMask = (BLiveUserMask) obj;
                    map.put(bLiveUserMask.userId, bLiveUserMask);
                }
            });
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static HashMap<String, m6o0> m205187l(List<User> list, List<BLiveUserMask> list2, boolean z) {
        return m205188m(jyb.m147502d(list, new qcj() { // from class: l.o6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).f56859id;
            }
        }, new qcj() { // from class: l.p6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w6o0.m205179d((User) obj);
            }
        }), jyb.m147502d(list2, new qcj() { // from class: l.q6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new qcj() { // from class: l.r6o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w6o0.m205182g((BLiveUserMask) obj);
            }
        }), z);
    }

    /* JADX INFO: renamed from: m */
    public static HashMap<String, m6o0> m205188m(Map<String, User> map, final Map<String, BLiveUserMask> map2, final boolean z) {
        final HashMap<String, m6o0> map3 = new HashMap<>();
        jyb.m147537z(map.entrySet(), new y20() { // from class: l.s6o0
            @Override // p153l.y20
            public final void call(Object obj) {
                Map map4 = map2;
                Map.Entry entry = (Map.Entry) obj;
                map3.put((String) entry.getKey(), new m6o0((User) entry.getValue(), (BLiveUserMask) map4.get(entry.getKey()), z));
            }
        });
        return map3;
    }
}
