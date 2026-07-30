package p009l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveKtvPlayInfoStatus;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveRole;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.hfw;
import l.i54;
import l.mqv;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w3o0 {

    /* JADX INFO: renamed from: j */
    public static String f21873j = "VoiceNewMemberInfo";

    /* JADX INFO: renamed from: a */
    public HashMap<String, BLiveVoiceCall> f21874a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, mqv<i54>> f21875b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, BLiveMember> f21876c;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, Integer> f21877d;

    /* JADX INFO: renamed from: e */
    public final List<BLiveMember> f21878e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveMember> f21879f;

    /* JADX INFO: renamed from: g */
    public boolean f21880g;

    /* JADX INFO: renamed from: h */
    public long f21881h;

    /* JADX INFO: renamed from: i */
    public int f21882i;

    public w3o0(BLiveData bLiveData, boolean z, int i, boolean z2, int i2) {
        this.f21874a = new HashMap<>();
        this.f21875b = new HashMap<>();
        this.f21876c = new HashMap<>();
        this.f21877d = new HashMap<>();
        this.f21878e = new ArrayList();
        this.f21879f = new ArrayList();
        this.f21882i = i2;
        this.f21880g = z2;
        this.f21881h = i;
        this.f21874a = vwb.d(bLiveData.voiceCalls, new w9j() { // from class: l.z2o0
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).id;
            }
        }, new w9j() { // from class: l.k3o0
            public final Object call(Object obj) {
                return w3o0.m23826r((BLiveVoiceCall) obj);
            }
        });
        HashMap mapD = vwb.d(bLiveData.masks, new w9j() { // from class: l.o3o0
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.p3o0
            public final Object call(Object obj) {
                return w3o0.m23809a((BLiveUserMask) obj);
            }
        });
        if (bLiveData.members != null) {
            for (int i3 = 0; i3 < bLiveData.members.size(); i3++) {
                m23844M((BLiveMember) bLiveData.members.get(i3), mapD, z);
            }
        }
        m23859z();
        m23849R();
        vwb.z(this.f21874a.values(), new e30() { // from class: l.q3o0
            public final void call(Object obj) {
                this.f19008a.m23847P((BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveUserMask m23809a(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m23818j(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        int i = bLiveVoiceCall.position;
        int i2 = bLiveVoiceCall2.position;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m23820l(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, BLiveVoiceCall bLiveVoiceCall) {
        boolean z;
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.nextPlayInfo;
        boolean z2 = true;
        if (bLiveVoiceKtvPlayInfo == null || !bLiveVoiceKtvPlayInfo.userId.equals(bLiveVoiceCall.user)) {
            z = false;
        } else {
            bLiveVoiceCall.playInfoStatus = bLiveVoiceKtvGameInfo.nextPlayInfo.status;
            z = true;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2 = bLiveVoiceKtvGameInfo.playInfo;
        if (bLiveVoiceKtvPlayInfo2 == null || !bLiveVoiceKtvPlayInfo2.userId.equals(bLiveVoiceCall.user)) {
            z2 = z;
        } else {
            bLiveVoiceCall.playInfoStatus = bLiveVoiceKtvGameInfo.playInfo.status;
        }
        if (z2 || TEnum.equals(bLiveVoiceCall.playInfoStatus, "unknown_")) {
            return;
        }
        bLiveVoiceCall.playInfoStatus = BLiveKtvPlayInfoStatus.get("unknown_");
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ BLiveVoiceCall m23826r(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall;
    }

    /* JADX INFO: renamed from: A */
    public final BLiveMember m23832A(String str, BLiveRole bLiveRole) {
        BLiveMember bLiveMemberNew_ = BLiveMember.new_();
        bLiveMemberNew_.role = bLiveRole;
        bLiveMemberNew_.id = str;
        bLiveMemberNew_.reference = str;
        return bLiveMemberNew_;
    }

    /* JADX INFO: renamed from: B */
    public BLiveVoiceCall m23833B(String str) {
        return this.f21874a.get(str);
    }

    /* JADX INFO: renamed from: C */
    public BLiveVoiceCall m23834C(final String str) {
        return (BLiveVoiceCall) vwb.r(this.f21874a.values(), new w9j() { // from class: l.t3o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCall) obj).user, str));
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public mqv<i54> m23835D(String str) {
        mqv<i54> mqvVar = this.f21875b.get(str);
        if (NullChecker.a(mqvVar) && TextUtils.isEmpty(((i54) mqvVar.a).a)) {
            ((i54) mqvVar.a).a = str;
        }
        return mqvVar;
    }

    /* JADX INFO: renamed from: E */
    public List<BLiveVoiceCall> m23836E() {
        return new ArrayList(this.f21874a.values());
    }

    /* JADX INFO: renamed from: F */
    public List<BLiveMember> m23837F() {
        ArrayList arrayList = new ArrayList(this.f21878e);
        if (!arrayList.isEmpty() && !TEnum.equals(((BLiveMember) arrayList.get(0)).role, "anchor")) {
            int iG = vwb.G(arrayList, new w9j() { // from class: l.m3o0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((BLiveMember) obj).role, "anchor"));
                }
            });
            if (iG > -1) {
                arrayList.add(0, (BLiveMember) arrayList.remove(iG));
                return arrayList;
            }
            BLiveMember bLiveMember = (BLiveMember) vwb.r(vwb.e(this.f21878e, new List[]{this.f21879f}), new w9j() { // from class: l.n3o0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((BLiveMember) obj).role, "anchor"));
                }
            });
            if (bLiveMember != null) {
                arrayList.add(0, bLiveMember);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public BLiveMember m23838G(String str) {
        return this.f21876c.get(str);
    }

    /* JADX INFO: renamed from: H */
    public List<BLiveMember> m23839H() {
        int iG;
        List<BLiveMember> listE = vwb.e(this.f21878e, new List[]{this.f21879f});
        if (!listE.isEmpty() && !TEnum.equals(listE.get(0).role, "anchor") && (iG = vwb.G(listE, new w9j() { // from class: l.r3o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((BLiveMember) obj).role, "anchor"));
            }
        })) > -1) {
            listE.add(0, listE.remove(iG));
        }
        return listE;
    }

    /* JADX INFO: renamed from: I */
    public List<BLiveVoiceCall> m23840I() {
        List<BLiveVoiceCall> listM23836E = m23836E();
        final HashMap map = new HashMap();
        vwb.z(listM23836E, new e30() { // from class: l.h3o0
            public final void call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                map.put(bLiveVoiceCall.user, bLiveVoiceCall);
            }
        });
        ArrayList arrayList = new ArrayList(map.values());
        if (this.f21880g) {
            vwb.z(arrayList, new e30() { // from class: l.i3o0
                public final void call(Object obj) {
                    this.f14389a.m23846O((BLiveVoiceCall) obj);
                }
            });
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.j3o0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return w3o0.m23818j((BLiveVoiceCall) obj, (BLiveVoiceCall) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public long m23841J() {
        return this.f21881h;
    }

    /* JADX INFO: renamed from: K */
    public int m23842K(String str) {
        if (this.f21877d.get(str) == null) {
            return -2;
        }
        return this.f21877d.get(str).intValue();
    }

    /* JADX INFO: renamed from: L */
    public mqv<i54> m23843L(String str) {
        return this.f21875b.get(str);
    }

    /* JADX INFO: renamed from: M */
    public final void m23844M(BLiveMember bLiveMember, Map<String, BLiveUserMask> map, boolean z) {
        this.f21876c.put(bLiveMember.getId(), bLiveMember);
        if (m23834C(bLiveMember.getId()) != null || TEnum.equals(bLiveMember.role, "anchor")) {
            this.f21878e.add(bLiveMember);
        } else {
            this.f21879f.add(bLiveMember);
        }
        String id = bLiveMember.getId();
        this.f21875b.put(id, mqv.f(new i54(id, map.get(id).name, map.get(id).avatar)).c(id, map.get(id), z));
    }

    /* JADX INFO: renamed from: N */
    public final boolean m23845N(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall != null && TextUtils.equals(bLiveVoiceCall.user, bLiveVoiceCall.anchor);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m23846O(BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.position = this.f21877d.get(bLiveVoiceCall.user).intValue() - 1;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m23847P(BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.userName = ((i54) this.f21875b.get(bLiveVoiceCall.user).a).b;
        bLiveVoiceCall.userPicture = ((i54) this.f21875b.get(bLiveVoiceCall.user).a).c;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m23848Q(BLiveVoiceCall bLiveVoiceCall) {
        Integer num = this.f21877d.get(bLiveVoiceCall.user);
        if (num != null) {
            bLiveVoiceCall.position = num.intValue() - 1;
            return;
        }
        hfw.a(f21873j, "member data exception ,userId=" + bLiveVoiceCall.user);
    }

    /* JADX INFO: renamed from: R */
    public final void m23849R() {
        List<BLiveMember> listM23839H = m23839H();
        boolean z = false;
        for (int i = 0; i < listM23839H.size(); i++) {
            String id = listM23839H.get(i).getId();
            if ("guideGoCallUser".equals(id)) {
                this.f21877d.put(id, -1);
                z = true;
            } else {
                HashMap<String, Integer> map = this.f21877d;
                if (z) {
                    map.put(id, Integer.valueOf(i));
                } else {
                    map.put(id, Integer.valueOf(i + 1));
                }
            }
        }
        if (this.f21880g) {
            vwb.z(m23836E(), new e30() { // from class: l.u3o0
                public final void call(Object obj) {
                    this.f20976a.m23848Q((BLiveVoiceCall) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public void m23850S(final BLiveVoiceCall bLiveVoiceCall) {
        if (this.f21874a.get(bLiveVoiceCall.id) == null) {
            return;
        }
        this.f21874a.remove(bLiveVoiceCall.id);
        vwb.d0(this.f21878e, new w9j() { // from class: l.l3o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        BLiveMember bLiveMember = this.f21876c.get(bLiveVoiceCall.user);
        if (bLiveMember != null) {
            bLiveMember.role = BLiveRole.get(m23845N(bLiveVoiceCall) ? "anchor" : "audience");
            this.f21879f.add(bLiveMember);
        }
        m23859z();
        m23849R();
    }

    /* JADX INFO: renamed from: T */
    public void m23851T(final String str) {
        this.f21875b.remove(str);
        this.f21876c.remove(str);
        int iD0 = vwb.d0(this.f21879f, new w9j() { // from class: l.a3o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), str));
            }
        });
        int iD1 = vwb.d0(this.f21878e, new w9j() { // from class: l.b3o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), str));
            }
        });
        if (iD0 > 0 || iD1 > 0) {
            this.f21881h--;
        }
        m23849R();
    }

    /* JADX INFO: renamed from: U */
    public void m23852U(long j) {
        this.f21881h = j;
    }

    /* JADX INFO: renamed from: V */
    public void m23853V(BLiveVoiceCall bLiveVoiceCall) {
        this.f21874a.put(bLiveVoiceCall.id, bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: W */
    public void m23854W(final BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        vwb.z(this.f21874a.values(), new e30() { // from class: l.e3o0
            public final void call(Object obj) {
                w3o0.m23820l(bLiveVoiceKtvGameInfo, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m23855X(VoiceSweet.VoiceSweetCpEffect voiceSweetCpEffect) {
        List userIdsList = voiceSweetCpEffect.getUserIdsList();
        if (vwb.J(userIdsList) || userIdsList.size() != 2) {
            return;
        }
        final String str = (String) userIdsList.get(0);
        final String str2 = (String) userIdsList.get(1);
        BLiveMember bLiveMember = this.f21876c.get(str);
        BLiveMember bLiveMember2 = this.f21876c.get(str2);
        if (NullChecker.a(bLiveMember)) {
            vwb.d0(bLiveMember.callConnections, new w9j() { // from class: l.c3o0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveCallConnection) obj).userId, str2));
                }
            });
        }
        if (NullChecker.a(bLiveMember2)) {
            vwb.d0(bLiveMember2.callConnections, new w9j() { // from class: l.d3o0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveCallConnection) obj).userId, str));
                }
            });
        }
        if (voiceSweetCpEffect.getOn()) {
            if (NullChecker.a(bLiveMember)) {
                BLiveCallConnection bLiveCallConnectionNew_ = BLiveCallConnection.new_();
                bLiveCallConnectionNew_.horizontalEffectSvga = voiceSweetCpEffect.getHorizontalCallConnectionEffectSvga();
                bLiveCallConnectionNew_.verticalEffectSvga = voiceSweetCpEffect.getVerticalCallConnectionEffectSvga();
                bLiveCallConnectionNew_.userId = str2;
                bLiveMember.callConnections.add(bLiveCallConnectionNew_);
            }
            if (NullChecker.a(bLiveMember2)) {
                BLiveCallConnection bLiveCallConnectionNew_2 = BLiveCallConnection.new_();
                bLiveCallConnectionNew_2.horizontalEffectSvga = voiceSweetCpEffect.getHorizontalCallConnectionEffectSvga();
                bLiveCallConnectionNew_2.verticalEffectSvga = voiceSweetCpEffect.getVerticalCallConnectionEffectSvga();
                bLiveCallConnectionNew_2.userId = str;
                bLiveMember2.callConnections.add(bLiveCallConnectionNew_2);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m23856Y(boolean z) {
        this.f21880g = z;
    }

    /* JADX INFO: renamed from: x */
    public void m23857x(final BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        this.f21875b.put(bLiveVoiceCall.user, mqvVar);
        this.f21874a.put(bLiveVoiceCall.id, bLiveVoiceCall);
        vwb.d0(this.f21879f, new w9j() { // from class: l.f3o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        vwb.d0(this.f21878e, new w9j() { // from class: l.g3o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        BLiveMember bLiveMemberM23832A = this.f21876c.get(bLiveVoiceCall.user);
        if (bLiveMemberM23832A == null) {
            bLiveMemberM23832A = m23832A(bLiveVoiceCall.user, BLiveRole.get("caller"));
        }
        bLiveMemberM23832A.role = BLiveRole.get(m23845N(bLiveVoiceCall) ? "anchor" : "caller");
        this.f21876c.put(bLiveMemberM23832A.getId(), bLiveMemberM23832A);
        this.f21878e.add(bLiveMemberM23832A);
        m23859z();
        m23849R();
    }

    /* JADX INFO: renamed from: y */
    public void m23858y(final mqv<i54> mqvVar, String str) {
        if (vwb.d0(this.f21879f, new w9j() { // from class: l.v3o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((i54) mqvVar.a).a, ((BLiveMember) obj).getId()));
            }
        }) == 0) {
            this.f21881h++;
        }
        this.f21875b.put(((i54) mqvVar.a).a, mqvVar);
        BLiveMember bLiveMemberM23832A = m23832A(((i54) mqvVar.a).a, BLiveRole.get("audience"));
        if ("anchor".equals(str)) {
            bLiveMemberM23832A.role = BLiveRole.get("anchor");
        } else if ("manager".equals(str)) {
            bLiveMemberM23832A.isManager = true;
        }
        this.f21876c.put(((i54) mqvVar.a).a, bLiveMemberM23832A);
        this.f21879f.add(bLiveMemberM23832A);
        m23859z();
        m23849R();
        String str2 = ((i54) mqvVar.a).a;
    }

    /* JADX INFO: renamed from: z */
    public final void m23859z() {
        BLiveMember bLiveMember = this.f21876c.get(ypv.f23196a.m23619D0());
        if (!NullChecker.a(bLiveMember) || this.f21878e.size() >= this.f21882i || (!bLiveMember.isManager && !"audience".equals(bLiveMember.role.name()) && !"admin".equals(bLiveMember.role.name()) && !"anchor".equals(bLiveMember.role.name()))) {
            if (this.f21876c.containsKey("guideGoCallUser")) {
                this.f21876c.remove("guideGoCallUser");
                vwb.d0(this.f21879f, new w9j() { // from class: l.s3o0
                    public final Object call(Object obj) {
                        return Boolean.valueOf("guideGoCallUser".equals(((BLiveMember) obj).reference));
                    }
                });
                return;
            }
            return;
        }
        if (this.f21876c.containsKey("guideGoCallUser")) {
            return;
        }
        BLiveMember bLiveMemberM23832A = m23832A("guideGoCallUser", BLiveRole.get("unknown_"));
        this.f21879f.add(0, bLiveMemberM23832A);
        this.f21876c.put(bLiveMemberM23832A.getId(), bLiveMemberM23832A);
        this.f21875b.put("guideGoCallUser", mqv.f(new i54("guideGoCallUser", "", "")).c("guideGoCallUser", BLiveUserMask.new_(), false));
    }

    public w3o0() {
        this.f21874a = new HashMap<>();
        this.f21875b = new HashMap<>();
        this.f21876c = new HashMap<>();
        this.f21877d = new HashMap<>();
        this.f21878e = new ArrayList();
        this.f21879f = new ArrayList();
    }
}
