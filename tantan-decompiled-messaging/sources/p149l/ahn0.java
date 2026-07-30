package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ahn0 {

    /* JADX INFO: renamed from: a */
    public List<BLiveVoiceCallInvite> f69672a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, mqv<User>> f69673b = new HashMap<>();

    public ahn0(List<BLiveVoiceCallInvite> list, List<User> list2, List<BLiveUserMask> list3, final boolean z) {
        this.f69672a = list;
        final HashMap mapM200319d = vwb.m200319d(list3, new w9j() { // from class: l.xgn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.ygn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ahn0.m96545a((BLiveUserMask) obj);
            }
        });
        vwb.m200354z(list2, new e30() { // from class: l.zgn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203065a.m96548d(mapM200319d, z, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveUserMask m96545a(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m96548d(HashMap map, boolean z, User user) {
        HashMap<String, mqv<User>> map2 = this.f69673b;
        String str = user.f56011id;
        mqv mqvVarM155998f = mqv.m155998f(user);
        String str2 = user.f56011id;
        map2.put(str, mqvVarM155998f.m156001c(str2, (BLiveUserMask) map.get(str2), z));
    }
}
