package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStarlightHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class kmn0 {

    /* JADX INFO: renamed from: a */
    public List<BLiveVoiceCall> f123813a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, BLiveVoiceCall> f123814b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public HashMap<String, mqv<User>> f123815c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, String> f123816d;

    public kmn0(List<BLiveVoiceCall> list, List<User> list2, List<BLiveUserMask> list3, final boolean z, List<BLiveStarlightHierarchy> list4) {
        this.f123816d = new HashMap<>();
        this.f123813a = list == null ? new ArrayList<>() : list;
        final HashMap mapM200319d = vwb.m200319d(list3, new w9j() { // from class: l.dmn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.emn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return kmn0.m146538c((BLiveUserMask) obj);
            }
        });
        vwb.m200354z(list2, new e30() { // from class: l.fmn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98315a.m146546k(mapM200319d, z, (User) obj);
            }
        });
        m146549n();
        vwb.m200354z(this.f123813a, new e30() { // from class: l.gmn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103494a.m146547l((BLiveVoiceCall) obj);
            }
        });
        this.f123816d = vwb.m200319d(list4, new w9j() { // from class: l.hmn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).userId;
            }
        }, new w9j() { // from class: l.imn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveStarlightHierarchy) obj).imageUrl;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveUserMask m146538c(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: h */
    public mqv<User> m146543h(String str) {
        return this.f123815c.get(str);
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveVoiceCall> m146544i() {
        if (this.f123813a == null) {
            this.f123813a = new ArrayList();
        }
        return this.f123813a;
    }

    /* JADX INFO: renamed from: j */
    public String m146545j(String str) {
        HashMap<String, String> map = this.f123816d;
        return map == null ? "" : map.get(str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m146546k(Map map, boolean z, User user) {
        HashMap<String, mqv<User>> map2 = this.f123815c;
        String str = user.f56011id;
        mqv mqvVarM155998f = mqv.m155998f(user);
        String str2 = user.f56011id;
        map2.put(str, mqvVarM155998f.m156001c(str2, (BLiveUserMask) map.get(str2), z));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m146547l(BLiveVoiceCall bLiveVoiceCall) {
        this.f123814b.put(bLiveVoiceCall.f44485id, bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m146548m(BLiveVoiceCall bLiveVoiceCall) {
        mqv<User> mqvVar = this.f123815c.get(bLiveVoiceCall.user);
        if (mqvVar != null) {
            User user = mqvVar.f135304a;
            bLiveVoiceCall.userName = user.name;
            bLiveVoiceCall.userPicture = user.m60124fp().profileSmall().formatted();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m146549n() {
        vwb.m200354z(this.f123813a, new e30() { // from class: l.jmn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118695a.m146548m((BLiveVoiceCall) obj);
            }
        });
    }
}
