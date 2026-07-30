package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStarlightHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ovn0 {

    /* JADX INFO: renamed from: a */
    public List<BLiveVoiceCall> f149283a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, BLiveVoiceCall> f149284b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public HashMap<String, nsv<User>> f149285c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, String> f149286d;

    public ovn0(List<BLiveVoiceCall> list, List<User> list2, List<BLiveUserMask> list3, final boolean z, List<BLiveStarlightHierarchy> list4) {
        this.f149286d = new HashMap<>();
        this.f149283a = list == null ? new ArrayList<>() : list;
        final HashMap mapM147502d = jyb.m147502d(list3, new qcj() { // from class: l.hvn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new qcj() { // from class: l.ivn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ovn0.m169458c((BLiveUserMask) obj);
            }
        });
        jyb.m147537z(list2, new y20() { // from class: l.jvn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122821a.m169466k(mapM147502d, z, (User) obj);
            }
        });
        m169469n();
        jyb.m147537z(this.f149283a, new y20() { // from class: l.kvn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128978a.m169467l((BLiveVoiceCall) obj);
            }
        });
        this.f149286d = jyb.m147502d(list4, new qcj() { // from class: l.lvn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).userId;
            }
        }, new qcj() { // from class: l.mvn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).imageUrl;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveUserMask m169458c(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: h */
    public nsv<User> m169463h(String str) {
        return this.f149285c.get(str);
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveVoiceCall> m169464i() {
        if (this.f149283a == null) {
            this.f149283a = new ArrayList();
        }
        return this.f149283a;
    }

    /* JADX INFO: renamed from: j */
    public String m169465j(String str) {
        HashMap<String, String> map = this.f149286d;
        return map == null ? "" : map.get(str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m169466k(Map map, boolean z, User user) {
        HashMap<String, nsv<User>> map2 = this.f149285c;
        String str = user.f56859id;
        nsv nsvVarM164636f = nsv.m164636f(user);
        String str2 = user.f56859id;
        map2.put(str, nsvVarM164636f.m164639c(str2, (BLiveUserMask) map.get(str2), z));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m169467l(BLiveVoiceCall bLiveVoiceCall) {
        this.f149284b.put(bLiveVoiceCall.f45333id, bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m169468m(BLiveVoiceCall bLiveVoiceCall) {
        nsv<User> nsvVar = this.f149285c.get(bLiveVoiceCall.user);
        if (nsvVar != null) {
            User user = nsvVar.f143542a;
            bLiveVoiceCall.userName = user.name;
            bLiveVoiceCall.userPicture = user.m61308fp().profileSmall().formatted();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m169469n() {
        jyb.m147537z(this.f149283a, new y20() { // from class: l.nvn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143826a.m169468m((BLiveVoiceCall) obj);
            }
        });
    }
}
