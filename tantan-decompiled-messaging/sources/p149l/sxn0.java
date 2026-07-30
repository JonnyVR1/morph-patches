package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class sxn0 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ User m186517d(User user) {
        return user;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ BLiveUserMask m186520g(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: i */
    public static mqv<User> m186522i(BLiveEnvelope bLiveEnvelope, boolean z, final String str) {
        ArrayList arrayListM200339n = vwb.m200339n(bLiveEnvelope.data.users, new w9j() { // from class: l.pxn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((User) obj).f56011id));
            }
        });
        User user = (User) (vwb.m200296J(arrayListM200339n) ? bLiveEnvelope.data.users.get(0) : arrayListM200339n.get(0));
        return mqv.m155998f(user).m156001c(user.f56011id, m186524k(bLiveEnvelope).get(user.f56011id), z);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static mqv<User> m186523j(BLiveEnvelope bLiveEnvelope, boolean z, final String str) {
        ArrayList arrayListM200339n = vwb.m200339n(bLiveEnvelope.data.users, new w9j() { // from class: l.qxn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((User) obj).f56011id));
            }
        });
        User user = vwb.m200296J(arrayListM200339n) ? null : (User) arrayListM200339n.get(0);
        if (user != null) {
            return mqv.m155998f(user).m156001c(user.f56011id, m186524k(bLiveEnvelope).get(user.f56011id), z);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static HashMap<String, BLiveUserMask> m186524k(BLiveEnvelope bLiveEnvelope) {
        final HashMap<String, BLiveUserMask> map = new HashMap<>();
        if (!vwb.m200296J(bLiveEnvelope.data.masks)) {
            vwb.m200354z(bLiveEnvelope.data.masks, new e30() { // from class: l.jxn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    BLiveUserMask bLiveUserMask = (BLiveUserMask) obj;
                    map.put(bLiveUserMask.userId, bLiveUserMask);
                }
            });
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static HashMap<String, ixn0> m186525l(List<User> list, List<BLiveUserMask> list2, boolean z) {
        return m186526m(vwb.m200319d(list, new w9j() { // from class: l.kxn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).f56011id;
            }
        }, new w9j() { // from class: l.lxn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sxn0.m186517d((User) obj);
            }
        }), vwb.m200319d(list2, new w9j() { // from class: l.mxn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.nxn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sxn0.m186520g((BLiveUserMask) obj);
            }
        }), z);
    }

    /* JADX INFO: renamed from: m */
    public static HashMap<String, ixn0> m186526m(Map<String, User> map, final Map<String, BLiveUserMask> map2, final boolean z) {
        final HashMap<String, ixn0> map3 = new HashMap<>();
        vwb.m200354z(map.entrySet(), new e30() { // from class: l.oxn0
            @Override // p149l.e30
            public final void call(Object obj) {
                Map map4 = map2;
                Map.Entry entry = (Map.Entry) obj;
                map3.put((String) entry.getKey(), new ixn0((User) entry.getValue(), (BLiveUserMask) map4.get(entry.getKey()), z));
            }
        });
        return map3;
    }
}
