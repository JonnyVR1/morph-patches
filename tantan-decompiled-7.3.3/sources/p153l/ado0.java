package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveKtvPlayInfoStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ado0 {

    /* JADX INFO: renamed from: j */
    public static String f70706j = "VoiceNewMemberInfo";

    /* JADX INFO: renamed from: a */
    public HashMap<String, BLiveVoiceCall> f70707a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, nsv<h64>> f70708b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, BLiveMember> f70709c;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, Integer> f70710d;

    /* JADX INFO: renamed from: e */
    public final List<BLiveMember> f70711e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveMember> f70712f;

    /* JADX INFO: renamed from: g */
    public boolean f70713g;

    /* JADX INFO: renamed from: h */
    public long f70714h;

    /* JADX INFO: renamed from: i */
    public int f70715i;

    public ado0(BLiveData bLiveData, boolean z, int i, boolean z2, int i2) {
        this.f70707a = new HashMap<>();
        this.f70708b = new HashMap<>();
        this.f70709c = new HashMap<>();
        this.f70710d = new HashMap<>();
        this.f70711e = new ArrayList();
        this.f70712f = new ArrayList();
        this.f70715i = i2;
        this.f70713g = z2;
        this.f70714h = i;
        this.f70707a = jyb.m147502d(bLiveData.voiceCalls, new qcj() { // from class: l.dco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).f45333id;
            }
        }, new qcj() { // from class: l.oco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ado0.m97099r((BLiveVoiceCall) obj);
            }
        });
        HashMap mapM147502d = jyb.m147502d(bLiveData.masks, new qcj() { // from class: l.sco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new qcj() { // from class: l.tco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ado0.m97082a((BLiveUserMask) obj);
            }
        });
        if (bLiveData.members != null) {
            for (int i3 = 0; i3 < bLiveData.members.size(); i3++) {
                m97117M(bLiveData.members.get(i3), mapM147502d, z);
            }
        }
        m97132z();
        m97122R();
        jyb.m147537z(this.f70707a.values(), new y20() { // from class: l.uco0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178455a.m97120P((BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveUserMask m97082a(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m97091j(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        int i = bLiveVoiceCall.position;
        int i2 = bLiveVoiceCall2.position;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m97093l(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, BLiveVoiceCall bLiveVoiceCall) {
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
    public static /* synthetic */ BLiveVoiceCall m97099r(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall;
    }

    /* JADX INFO: renamed from: A */
    public final BLiveMember m97105A(String str, BLiveRole bLiveRole) {
        BLiveMember bLiveMemberNew_ = BLiveMember.new_();
        bLiveMemberNew_.role = bLiveRole;
        bLiveMemberNew_.f45246id = str;
        bLiveMemberNew_.reference = str;
        return bLiveMemberNew_;
    }

    /* JADX INFO: renamed from: B */
    public BLiveVoiceCall m97106B(String str) {
        return this.f70707a.get(str);
    }

    /* JADX INFO: renamed from: C */
    public BLiveVoiceCall m97107C(final String str) {
        return (BLiveVoiceCall) jyb.m147529r(this.f70707a.values(), new qcj() { // from class: l.xco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCall) obj).user, str));
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public nsv<h64> m97108D(String str) {
        nsv<h64> nsvVar = this.f70708b.get(str);
        if (NullChecker.m82486a(nsvVar) && TextUtils.isEmpty(nsvVar.f143542a.f107997a)) {
            nsvVar.f143542a.f107997a = str;
        }
        return nsvVar;
    }

    /* JADX INFO: renamed from: E */
    public List<BLiveVoiceCall> m97109E() {
        return new ArrayList(this.f70707a.values());
    }

    /* JADX INFO: renamed from: F */
    public List<BLiveMember> m97110F() {
        ArrayList arrayList = new ArrayList(this.f70711e);
        if (!arrayList.isEmpty() && !TEnum.equals(((BLiveMember) arrayList.get(0)).role, "anchor")) {
            int iM147476G = jyb.m147476G(arrayList, new qcj() { // from class: l.qco0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((BLiveMember) obj).role, "anchor"));
                }
            });
            if (iM147476G > -1) {
                arrayList.add(0, (BLiveMember) arrayList.remove(iM147476G));
                return arrayList;
            }
            BLiveMember bLiveMember = (BLiveMember) jyb.m147529r(jyb.m147504e(this.f70711e, this.f70712f), new qcj() { // from class: l.rco0
                @Override // p153l.qcj
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
    public BLiveMember m97111G(String str) {
        return this.f70709c.get(str);
    }

    /* JADX INFO: renamed from: H */
    public List<BLiveMember> m97112H() {
        int iM147476G;
        List<BLiveMember> listM147504e = jyb.m147504e(this.f70711e, this.f70712f);
        if (!listM147504e.isEmpty() && !TEnum.equals(listM147504e.get(0).role, "anchor") && (iM147476G = jyb.m147476G(listM147504e, new qcj() { // from class: l.vco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((BLiveMember) obj).role, "anchor"));
            }
        })) > -1) {
            listM147504e.add(0, listM147504e.remove(iM147476G));
        }
        return listM147504e;
    }

    /* JADX INFO: renamed from: I */
    public List<BLiveVoiceCall> m97113I() {
        List<BLiveVoiceCall> listM97109E = m97109E();
        final HashMap map = new HashMap();
        jyb.m147537z(listM97109E, new y20() { // from class: l.lco0
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                map.put(bLiveVoiceCall.user, bLiveVoiceCall);
            }
        });
        ArrayList arrayList = new ArrayList(map.values());
        if (this.f70713g) {
            jyb.m147537z(arrayList, new y20() { // from class: l.mco0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f135836a.m97119O((BLiveVoiceCall) obj);
                }
            });
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.nco0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ado0.m97091j((BLiveVoiceCall) obj, (BLiveVoiceCall) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public long m97114J() {
        return this.f70714h;
    }

    /* JADX INFO: renamed from: K */
    public int m97115K(String str) {
        if (this.f70710d.get(str) == null) {
            return -2;
        }
        return this.f70710d.get(str).intValue();
    }

    /* JADX INFO: renamed from: L */
    public nsv<h64> m97116L(String str) {
        return this.f70708b.get(str);
    }

    /* JADX INFO: renamed from: M */
    public final void m97117M(BLiveMember bLiveMember, Map<String, BLiveUserMask> map, boolean z) {
        this.f70709c.put(bLiveMember.getId(), bLiveMember);
        if (m97107C(bLiveMember.getId()) != null || TEnum.equals(bLiveMember.role, "anchor")) {
            this.f70711e.add(bLiveMember);
        } else {
            this.f70712f.add(bLiveMember);
        }
        String id = bLiveMember.getId();
        this.f70708b.put(id, nsv.m164636f(new h64(id, map.get(id).name, map.get(id).avatar)).m164639c(id, map.get(id), z));
    }

    /* JADX INFO: renamed from: N */
    public final boolean m97118N(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall != null && TextUtils.equals(bLiveVoiceCall.user, bLiveVoiceCall.anchor);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m97119O(BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.position = this.f70710d.get(bLiveVoiceCall.user).intValue() - 1;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m97120P(BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.userName = this.f70708b.get(bLiveVoiceCall.user).f143542a.f107998b;
        bLiveVoiceCall.userPicture = this.f70708b.get(bLiveVoiceCall.user).f143542a.f107999c;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m97121Q(BLiveVoiceCall bLiveVoiceCall) {
        Integer num = this.f70710d.get(bLiveVoiceCall.user);
        if (num != null) {
            bLiveVoiceCall.position = num.intValue() - 1;
            return;
        }
        fhw.m125605a(f70706j, "member data exception ,userId=" + bLiveVoiceCall.user);
    }

    /* JADX INFO: renamed from: R */
    public final void m97122R() {
        List<BLiveMember> listM97112H = m97112H();
        boolean z = false;
        for (int i = 0; i < listM97112H.size(); i++) {
            String id = listM97112H.get(i).getId();
            if ("guideGoCallUser".equals(id)) {
                this.f70710d.put(id, -1);
                z = true;
            } else {
                HashMap<String, Integer> map = this.f70710d;
                if (z) {
                    map.put(id, Integer.valueOf(i));
                } else {
                    map.put(id, Integer.valueOf(i + 1));
                }
            }
        }
        if (this.f70713g) {
            jyb.m147537z(m97109E(), new y20() { // from class: l.yco0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f198532a.m97121Q((BLiveVoiceCall) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public void m97123S(final BLiveVoiceCall bLiveVoiceCall) {
        if (this.f70707a.get(bLiveVoiceCall.f45333id) == null) {
            return;
        }
        this.f70707a.remove(bLiveVoiceCall.f45333id);
        jyb.m147503d0(this.f70711e, new qcj() { // from class: l.pco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        BLiveMember bLiveMember = this.f70709c.get(bLiveVoiceCall.user);
        if (bLiveMember != null) {
            bLiveMember.role = BLiveRole.get(m97118N(bLiveVoiceCall) ? "anchor" : "audience");
            this.f70712f.add(bLiveMember);
        }
        m97132z();
        m97122R();
    }

    /* JADX INFO: renamed from: T */
    public void m97124T(final String str) {
        this.f70708b.remove(str);
        this.f70709c.remove(str);
        int iM147503d0 = jyb.m147503d0(this.f70712f, new qcj() { // from class: l.eco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), str));
            }
        });
        int iM147503d1 = jyb.m147503d0(this.f70711e, new qcj() { // from class: l.fco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), str));
            }
        });
        if (iM147503d0 > 0 || iM147503d1 > 0) {
            this.f70714h--;
        }
        m97122R();
    }

    /* JADX INFO: renamed from: U */
    public void m97125U(long j) {
        this.f70714h = j;
    }

    /* JADX INFO: renamed from: V */
    public void m97126V(BLiveVoiceCall bLiveVoiceCall) {
        this.f70707a.put(bLiveVoiceCall.f45333id, bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: W */
    public void m97127W(final BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        jyb.m147537z(this.f70707a.values(), new y20() { // from class: l.ico0
            @Override // p153l.y20
            public final void call(Object obj) {
                ado0.m97093l(bLiveVoiceKtvGameInfo, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m97128X(VoiceSweet.VoiceSweetCpEffect voiceSweetCpEffect) {
        List<String> userIdsList = voiceSweetCpEffect.getUserIdsList();
        if (jyb.m147479J(userIdsList) || userIdsList.size() != 2) {
            return;
        }
        final String str = userIdsList.get(0);
        final String str2 = userIdsList.get(1);
        BLiveMember bLiveMember = this.f70709c.get(str);
        BLiveMember bLiveMember2 = this.f70709c.get(str2);
        if (NullChecker.m82486a(bLiveMember)) {
            jyb.m147503d0(bLiveMember.callConnections, new qcj() { // from class: l.gco0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveCallConnection) obj).userId, str2));
                }
            });
        }
        if (NullChecker.m82486a(bLiveMember2)) {
            jyb.m147503d0(bLiveMember2.callConnections, new qcj() { // from class: l.hco0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveCallConnection) obj).userId, str));
                }
            });
        }
        if (voiceSweetCpEffect.getOn()) {
            if (NullChecker.m82486a(bLiveMember)) {
                BLiveCallConnection bLiveCallConnectionNew_ = BLiveCallConnection.new_();
                bLiveCallConnectionNew_.horizontalEffectSvga = voiceSweetCpEffect.getHorizontalCallConnectionEffectSvga();
                bLiveCallConnectionNew_.verticalEffectSvga = voiceSweetCpEffect.getVerticalCallConnectionEffectSvga();
                bLiveCallConnectionNew_.userId = str2;
                bLiveMember.callConnections.add(bLiveCallConnectionNew_);
            }
            if (NullChecker.m82486a(bLiveMember2)) {
                BLiveCallConnection bLiveCallConnectionNew_2 = BLiveCallConnection.new_();
                bLiveCallConnectionNew_2.horizontalEffectSvga = voiceSweetCpEffect.getHorizontalCallConnectionEffectSvga();
                bLiveCallConnectionNew_2.verticalEffectSvga = voiceSweetCpEffect.getVerticalCallConnectionEffectSvga();
                bLiveCallConnectionNew_2.userId = str;
                bLiveMember2.callConnections.add(bLiveCallConnectionNew_2);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m97129Y(boolean z) {
        this.f70713g = z;
    }

    /* JADX INFO: renamed from: x */
    public void m97130x(final BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        this.f70708b.put(bLiveVoiceCall.user, nsvVar);
        this.f70707a.put(bLiveVoiceCall.f45333id, bLiveVoiceCall);
        jyb.m147503d0(this.f70712f, new qcj() { // from class: l.jco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        jyb.m147503d0(this.f70711e, new qcj() { // from class: l.kco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        BLiveMember bLiveMemberM97105A = this.f70709c.get(bLiveVoiceCall.user);
        String str = BLiveRole.caller;
        if (bLiveMemberM97105A == null) {
            bLiveMemberM97105A = m97105A(bLiveVoiceCall.user, BLiveRole.get(BLiveRole.caller));
        }
        if (m97118N(bLiveVoiceCall)) {
            str = "anchor";
        }
        bLiveMemberM97105A.role = BLiveRole.get(str);
        this.f70709c.put(bLiveMemberM97105A.getId(), bLiveMemberM97105A);
        this.f70711e.add(bLiveMemberM97105A);
        m97132z();
        m97122R();
    }

    /* JADX INFO: renamed from: y */
    public void m97131y(final nsv<h64> nsvVar, String str) {
        if (jyb.m147503d0(this.f70712f, new qcj() { // from class: l.zco0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((h64) nsvVar.f143542a).f107997a, ((BLiveMember) obj).getId()));
            }
        }) == 0) {
            this.f70714h++;
        }
        this.f70708b.put(nsvVar.f143542a.f107997a, nsvVar);
        BLiveMember bLiveMemberM97105A = m97105A(nsvVar.f143542a.f107997a, BLiveRole.get("audience"));
        if ("anchor".equals(str)) {
            bLiveMemberM97105A.role = BLiveRole.get("anchor");
        } else if ("manager".equals(str)) {
            bLiveMemberM97105A.isManager = true;
        }
        this.f70709c.put(nsvVar.f143542a.f107997a, bLiveMemberM97105A);
        this.f70712f.add(bLiveMemberM97105A);
        m97132z();
        m97122R();
        String str2 = nsvVar.f143542a.f107997a;
    }

    /* JADX INFO: renamed from: z */
    public final void m97132z() {
        BLiveMember bLiveMember = this.f70709c.get(zrv.f205799a.m207631D0());
        if (!NullChecker.m82486a(bLiveMember) || this.f70711e.size() >= this.f70715i || (!bLiveMember.isManager && !"audience".equals(bLiveMember.role.name()) && !"admin".equals(bLiveMember.role.name()) && !"anchor".equals(bLiveMember.role.name()))) {
            if (this.f70709c.containsKey("guideGoCallUser")) {
                this.f70709c.remove("guideGoCallUser");
                jyb.m147503d0(this.f70712f, new qcj() { // from class: l.wco0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf("guideGoCallUser".equals(((BLiveMember) obj).reference));
                    }
                });
                return;
            }
            return;
        }
        if (this.f70709c.containsKey("guideGoCallUser")) {
            return;
        }
        BLiveMember bLiveMemberM97105A = m97105A("guideGoCallUser", BLiveRole.get("unknown_"));
        this.f70712f.add(0, bLiveMemberM97105A);
        this.f70709c.put(bLiveMemberM97105A.getId(), bLiveMemberM97105A);
        this.f70708b.put("guideGoCallUser", nsv.m164636f(new h64("guideGoCallUser", "", "")).m164639c("guideGoCallUser", BLiveUserMask.new_(), false));
    }

    public ado0() {
        this.f70707a = new HashMap<>();
        this.f70708b = new HashMap<>();
        this.f70709c = new HashMap<>();
        this.f70710d = new HashMap<>();
        this.f70711e = new ArrayList();
        this.f70712f = new ArrayList();
    }
}
