package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveKtvPlayInfoStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class w3o0 {

    /* JADX INFO: renamed from: j */
    public static String f184410j = "VoiceNewMemberInfo";

    /* JADX INFO: renamed from: a */
    public HashMap<String, BLiveVoiceCall> f184411a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, mqv<i54>> f184412b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, BLiveMember> f184413c;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, Integer> f184414d;

    /* JADX INFO: renamed from: e */
    public final List<BLiveMember> f184415e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveMember> f184416f;

    /* JADX INFO: renamed from: g */
    public boolean f184417g;

    /* JADX INFO: renamed from: h */
    public long f184418h;

    /* JADX INFO: renamed from: i */
    public int f184419i;

    public w3o0(BLiveData bLiveData, boolean z, int i, boolean z2, int i2) {
        this.f184411a = new HashMap<>();
        this.f184412b = new HashMap<>();
        this.f184413c = new HashMap<>();
        this.f184414d = new HashMap<>();
        this.f184415e = new ArrayList();
        this.f184416f = new ArrayList();
        this.f184419i = i2;
        this.f184417g = z2;
        this.f184418h = i;
        this.f184411a = vwb.m200319d(bLiveData.voiceCalls, new w9j() { // from class: l.z2o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).f44485id;
            }
        }, new w9j() { // from class: l.k3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w3o0.m201342r((BLiveVoiceCall) obj);
            }
        });
        HashMap mapM200319d = vwb.m200319d(bLiveData.masks, new w9j() { // from class: l.o3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.p3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w3o0.m201325a((BLiveUserMask) obj);
            }
        });
        if (bLiveData.members != null) {
            for (int i3 = 0; i3 < bLiveData.members.size(); i3++) {
                m201360M(bLiveData.members.get(i3), mapM200319d, z);
            }
        }
        m201375z();
        m201365R();
        vwb.m200354z(this.f184411a.values(), new e30() { // from class: l.q3o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152490a.m201363P((BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveUserMask m201325a(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m201334j(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2) {
        int i = bLiveVoiceCall.position;
        int i2 = bLiveVoiceCall2.position;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m201336l(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, BLiveVoiceCall bLiveVoiceCall) {
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
    public static /* synthetic */ BLiveVoiceCall m201342r(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall;
    }

    /* JADX INFO: renamed from: A */
    public final BLiveMember m201348A(String str, BLiveRole bLiveRole) {
        BLiveMember bLiveMemberNew_ = BLiveMember.new_();
        bLiveMemberNew_.role = bLiveRole;
        bLiveMemberNew_.f44398id = str;
        bLiveMemberNew_.reference = str;
        return bLiveMemberNew_;
    }

    /* JADX INFO: renamed from: B */
    public BLiveVoiceCall m201349B(String str) {
        return this.f184411a.get(str);
    }

    /* JADX INFO: renamed from: C */
    public BLiveVoiceCall m201350C(final String str) {
        return (BLiveVoiceCall) vwb.m200346r(this.f184411a.values(), new w9j() { // from class: l.t3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCall) obj).user, str));
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public mqv<i54> m201351D(String str) {
        mqv<i54> mqvVar = this.f184412b.get(str);
        if (NullChecker.m81303a(mqvVar) && TextUtils.isEmpty(mqvVar.f135304a.f111520a)) {
            mqvVar.f135304a.f111520a = str;
        }
        return mqvVar;
    }

    /* JADX INFO: renamed from: E */
    public List<BLiveVoiceCall> m201352E() {
        return new ArrayList(this.f184411a.values());
    }

    /* JADX INFO: renamed from: F */
    public List<BLiveMember> m201353F() {
        ArrayList arrayList = new ArrayList(this.f184415e);
        if (!arrayList.isEmpty() && !TEnum.equals(((BLiveMember) arrayList.get(0)).role, "anchor")) {
            int iM200293G = vwb.m200293G(arrayList, new w9j() { // from class: l.m3o0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((BLiveMember) obj).role, "anchor"));
                }
            });
            if (iM200293G > -1) {
                arrayList.add(0, (BLiveMember) arrayList.remove(iM200293G));
                return arrayList;
            }
            BLiveMember bLiveMember = (BLiveMember) vwb.m200346r(vwb.m200321e(this.f184415e, this.f184416f), new w9j() { // from class: l.n3o0
                @Override // p149l.w9j
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
    public BLiveMember m201354G(String str) {
        return this.f184413c.get(str);
    }

    /* JADX INFO: renamed from: H */
    public List<BLiveMember> m201355H() {
        int iM200293G;
        List<BLiveMember> listM200321e = vwb.m200321e(this.f184415e, this.f184416f);
        if (!listM200321e.isEmpty() && !TEnum.equals(listM200321e.get(0).role, "anchor") && (iM200293G = vwb.m200293G(listM200321e, new w9j() { // from class: l.r3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((BLiveMember) obj).role, "anchor"));
            }
        })) > -1) {
            listM200321e.add(0, listM200321e.remove(iM200293G));
        }
        return listM200321e;
    }

    /* JADX INFO: renamed from: I */
    public List<BLiveVoiceCall> m201356I() {
        List<BLiveVoiceCall> listM201352E = m201352E();
        final HashMap map = new HashMap();
        vwb.m200354z(listM201352E, new e30() { // from class: l.h3o0
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                map.put(bLiveVoiceCall.user, bLiveVoiceCall);
            }
        });
        ArrayList arrayList = new ArrayList(map.values());
        if (this.f184417g) {
            vwb.m200354z(arrayList, new e30() { // from class: l.i3o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f111360a.m201362O((BLiveVoiceCall) obj);
                }
            });
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.j3o0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return w3o0.m201334j((BLiveVoiceCall) obj, (BLiveVoiceCall) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public long m201357J() {
        return this.f184418h;
    }

    /* JADX INFO: renamed from: K */
    public int m201358K(String str) {
        if (this.f184414d.get(str) == null) {
            return -2;
        }
        return this.f184414d.get(str).intValue();
    }

    /* JADX INFO: renamed from: L */
    public mqv<i54> m201359L(String str) {
        return this.f184412b.get(str);
    }

    /* JADX INFO: renamed from: M */
    public final void m201360M(BLiveMember bLiveMember, Map<String, BLiveUserMask> map, boolean z) {
        this.f184413c.put(bLiveMember.getId(), bLiveMember);
        if (m201350C(bLiveMember.getId()) != null || TEnum.equals(bLiveMember.role, "anchor")) {
            this.f184415e.add(bLiveMember);
        } else {
            this.f184416f.add(bLiveMember);
        }
        String id = bLiveMember.getId();
        this.f184412b.put(id, mqv.m155998f(new i54(id, map.get(id).name, map.get(id).avatar)).m156001c(id, map.get(id), z));
    }

    /* JADX INFO: renamed from: N */
    public final boolean m201361N(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall != null && TextUtils.equals(bLiveVoiceCall.user, bLiveVoiceCall.anchor);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m201362O(BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.position = this.f184414d.get(bLiveVoiceCall.user).intValue() - 1;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m201363P(BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.userName = this.f184412b.get(bLiveVoiceCall.user).f135304a.f111521b;
        bLiveVoiceCall.userPicture = this.f184412b.get(bLiveVoiceCall.user).f135304a.f111522c;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m201364Q(BLiveVoiceCall bLiveVoiceCall) {
        Integer num = this.f184414d.get(bLiveVoiceCall.user);
        if (num != null) {
            bLiveVoiceCall.position = num.intValue() - 1;
            return;
        }
        hfw.m130790a(f184410j, "member data exception ,userId=" + bLiveVoiceCall.user);
    }

    /* JADX INFO: renamed from: R */
    public final void m201365R() {
        List<BLiveMember> listM201355H = m201355H();
        boolean z = false;
        for (int i = 0; i < listM201355H.size(); i++) {
            String id = listM201355H.get(i).getId();
            if ("guideGoCallUser".equals(id)) {
                this.f184414d.put(id, -1);
                z = true;
            } else {
                HashMap<String, Integer> map = this.f184414d;
                if (z) {
                    map.put(id, Integer.valueOf(i));
                } else {
                    map.put(id, Integer.valueOf(i + 1));
                }
            }
        }
        if (this.f184417g) {
            vwb.m200354z(m201352E(), new e30() { // from class: l.u3o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f173641a.m201364Q((BLiveVoiceCall) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public void m201366S(final BLiveVoiceCall bLiveVoiceCall) {
        if (this.f184411a.get(bLiveVoiceCall.f44485id) == null) {
            return;
        }
        this.f184411a.remove(bLiveVoiceCall.f44485id);
        vwb.m200320d0(this.f184415e, new w9j() { // from class: l.l3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        BLiveMember bLiveMember = this.f184413c.get(bLiveVoiceCall.user);
        if (bLiveMember != null) {
            bLiveMember.role = BLiveRole.get(m201361N(bLiveVoiceCall) ? "anchor" : "audience");
            this.f184416f.add(bLiveMember);
        }
        m201375z();
        m201365R();
    }

    /* JADX INFO: renamed from: T */
    public void m201367T(final String str) {
        this.f184412b.remove(str);
        this.f184413c.remove(str);
        int iM200320d0 = vwb.m200320d0(this.f184416f, new w9j() { // from class: l.a3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), str));
            }
        });
        int iM200320d1 = vwb.m200320d0(this.f184415e, new w9j() { // from class: l.b3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), str));
            }
        });
        if (iM200320d0 > 0 || iM200320d1 > 0) {
            this.f184418h--;
        }
        m201365R();
    }

    /* JADX INFO: renamed from: U */
    public void m201368U(long j) {
        this.f184418h = j;
    }

    /* JADX INFO: renamed from: V */
    public void m201369V(BLiveVoiceCall bLiveVoiceCall) {
        this.f184411a.put(bLiveVoiceCall.f44485id, bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: W */
    public void m201370W(final BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        vwb.m200354z(this.f184411a.values(), new e30() { // from class: l.e3o0
            @Override // p149l.e30
            public final void call(Object obj) {
                w3o0.m201336l(bLiveVoiceKtvGameInfo, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m201371X(VoiceSweet.VoiceSweetCpEffect voiceSweetCpEffect) {
        List<String> userIdsList = voiceSweetCpEffect.getUserIdsList();
        if (vwb.m200296J(userIdsList) || userIdsList.size() != 2) {
            return;
        }
        final String str = userIdsList.get(0);
        final String str2 = userIdsList.get(1);
        BLiveMember bLiveMember = this.f184413c.get(str);
        BLiveMember bLiveMember2 = this.f184413c.get(str2);
        if (NullChecker.m81303a(bLiveMember)) {
            vwb.m200320d0(bLiveMember.callConnections, new w9j() { // from class: l.c3o0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveCallConnection) obj).userId, str2));
                }
            });
        }
        if (NullChecker.m81303a(bLiveMember2)) {
            vwb.m200320d0(bLiveMember2.callConnections, new w9j() { // from class: l.d3o0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveCallConnection) obj).userId, str));
                }
            });
        }
        if (voiceSweetCpEffect.getOn()) {
            if (NullChecker.m81303a(bLiveMember)) {
                BLiveCallConnection bLiveCallConnectionNew_ = BLiveCallConnection.new_();
                bLiveCallConnectionNew_.horizontalEffectSvga = voiceSweetCpEffect.getHorizontalCallConnectionEffectSvga();
                bLiveCallConnectionNew_.verticalEffectSvga = voiceSweetCpEffect.getVerticalCallConnectionEffectSvga();
                bLiveCallConnectionNew_.userId = str2;
                bLiveMember.callConnections.add(bLiveCallConnectionNew_);
            }
            if (NullChecker.m81303a(bLiveMember2)) {
                BLiveCallConnection bLiveCallConnectionNew_2 = BLiveCallConnection.new_();
                bLiveCallConnectionNew_2.horizontalEffectSvga = voiceSweetCpEffect.getHorizontalCallConnectionEffectSvga();
                bLiveCallConnectionNew_2.verticalEffectSvga = voiceSweetCpEffect.getVerticalCallConnectionEffectSvga();
                bLiveCallConnectionNew_2.userId = str;
                bLiveMember2.callConnections.add(bLiveCallConnectionNew_2);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m201372Y(boolean z) {
        this.f184417g = z;
    }

    /* JADX INFO: renamed from: x */
    public void m201373x(final BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        this.f184412b.put(bLiveVoiceCall.user, mqvVar);
        this.f184411a.put(bLiveVoiceCall.f44485id, bLiveVoiceCall);
        vwb.m200320d0(this.f184416f, new w9j() { // from class: l.f3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        vwb.m200320d0(this.f184415e, new w9j() { // from class: l.g3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMember) obj).getId(), bLiveVoiceCall.user));
            }
        });
        BLiveMember bLiveMemberM201348A = this.f184413c.get(bLiveVoiceCall.user);
        String str = BLiveRole.caller;
        if (bLiveMemberM201348A == null) {
            bLiveMemberM201348A = m201348A(bLiveVoiceCall.user, BLiveRole.get(BLiveRole.caller));
        }
        if (m201361N(bLiveVoiceCall)) {
            str = "anchor";
        }
        bLiveMemberM201348A.role = BLiveRole.get(str);
        this.f184413c.put(bLiveMemberM201348A.getId(), bLiveMemberM201348A);
        this.f184415e.add(bLiveMemberM201348A);
        m201375z();
        m201365R();
    }

    /* JADX INFO: renamed from: y */
    public void m201374y(final mqv<i54> mqvVar, String str) {
        if (vwb.m200320d0(this.f184416f, new w9j() { // from class: l.v3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((i54) mqvVar.f135304a).f111520a, ((BLiveMember) obj).getId()));
            }
        }) == 0) {
            this.f184418h++;
        }
        this.f184412b.put(mqvVar.f135304a.f111520a, mqvVar);
        BLiveMember bLiveMemberM201348A = m201348A(mqvVar.f135304a.f111520a, BLiveRole.get("audience"));
        if ("anchor".equals(str)) {
            bLiveMemberM201348A.role = BLiveRole.get("anchor");
        } else if ("manager".equals(str)) {
            bLiveMemberM201348A.isManager = true;
        }
        this.f184413c.put(mqvVar.f135304a.f111520a, bLiveMemberM201348A);
        this.f184416f.add(bLiveMemberM201348A);
        m201375z();
        m201365R();
        String str2 = mqvVar.f135304a.f111520a;
    }

    /* JADX INFO: renamed from: z */
    public final void m201375z() {
        BLiveMember bLiveMember = this.f184413c.get(ypv.f199493a.m199309D0());
        if (!NullChecker.m81303a(bLiveMember) || this.f184415e.size() >= this.f184419i || (!bLiveMember.isManager && !"audience".equals(bLiveMember.role.name()) && !"admin".equals(bLiveMember.role.name()) && !"anchor".equals(bLiveMember.role.name()))) {
            if (this.f184413c.containsKey("guideGoCallUser")) {
                this.f184413c.remove("guideGoCallUser");
                vwb.m200320d0(this.f184416f, new w9j() { // from class: l.s3o0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf("guideGoCallUser".equals(((BLiveMember) obj).reference));
                    }
                });
                return;
            }
            return;
        }
        if (this.f184413c.containsKey("guideGoCallUser")) {
            return;
        }
        BLiveMember bLiveMemberM201348A = m201348A("guideGoCallUser", BLiveRole.get("unknown_"));
        this.f184416f.add(0, bLiveMemberM201348A);
        this.f184413c.put(bLiveMemberM201348A.getId(), bLiveMemberM201348A);
        this.f184412b.put("guideGoCallUser", mqv.m155998f(new i54("guideGoCallUser", "", "")).m156001c("guideGoCallUser", BLiveUserMask.new_(), false));
    }

    public w3o0() {
        this.f184411a = new HashMap<>();
        this.f184412b = new HashMap<>();
        this.f184413c = new HashMap<>();
        this.f184414d = new HashMap<>();
        this.f184415e = new ArrayList();
        this.f184416f = new ArrayList();
    }
}
