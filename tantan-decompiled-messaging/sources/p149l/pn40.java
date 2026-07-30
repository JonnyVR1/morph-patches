package p149l;

import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pn40 extends ho2 {
    public pn40(qn40 qn40Var, zgt zgtVar) {
        super(qn40Var, zgtVar);
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ BLiveUserMask m170382p2(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m170383q2(Throwable th) {
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ void m170386t2(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ mqv m170387u2(HashMap map, mqv mqvVar) {
        String str = ((BLiveMember) mqvVar.f135304a).reference;
        mqvVar.m155999a(((idv) ypv.m215673l(fld0.f98147b)).m135637i(str));
        if (ypv.m215672k().m195959u7() && c5k0.m105345b(mqvVar) && c5k0.m105344a(mqvVar).hierarchy != null) {
            ((BLiveMember) mqvVar.f135304a).liveUserLevel = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(c5k0.m105344a(mqvVar).hierarchy.grade);
        }
        if (map.containsKey(str)) {
            mqvVar.m156003e((BLiveUserMask) map.get(str));
        }
        return mqvVar;
    }

    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m170390x2(Throwable th) {
    }

    /* JADX INFO: renamed from: z2 */
    public static LivingUsers<BLiveMember> m170392z2(List<BLiveMember> list, List<BLiveUserMask> list2) {
        final HashMap mapM200319d = vwb.m200319d(list2, new w9j() { // from class: l.mn40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.nn40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pn40.m170382p2((BLiveUserMask) obj);
            }
        });
        return LivingUsers.convert(list, new w9j() { // from class: l.on40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pn40.m170387u2(mapM200319d, (mqv) obj);
            }
        });
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: A0 */
    public String mo132054A0() {
        return "live";
    }

    /* JADX INFO: renamed from: A2 */
    public qn40 m170393A2() {
        return (qn40) this.f128032a;
    }

    /* JADX INFO: renamed from: B2 */
    public boolean m170394B2() {
        BLiveRoom bLiveRoomM175587e = m170393A2().mo165469j();
        return bLiveRoomM175587e == null || bLiveRoomM175587e.equals(BLiveRoom.EMPTY);
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: C0 */
    public String mo132058C0() {
        return "room";
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m170395C2(ArrayList arrayList) {
        this.f108769z.m181788n().onNext(arrayList);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m170396D2(BLiveEnvelope bLiveEnvelope) {
        this.f108769z.m181788n().onNext(new ArrayList<>(vwb.m200303Q(bLiveEnvelope.data.managers, new w9j() { // from class: l.jn40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveMember) obj).reference;
            }
        })));
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m170397E2(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        List<BLiveMember> list = bLiveData.members;
        if (list != null) {
            this.f108751h.onNext(m170392z2(list, bLiveData.masks));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m170398F2(boolean z, BLiveEnvelope bLiveEnvelope) {
        this.f108769z.m181790s(z, bLiveEnvelope.data.liveChatMessages);
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: K1 */
    public void mo132074K1(String str) {
        upv.m194935w(cll.m107499l(ytr.m216073b("/rooms/" + str + "/managers")), "refreshRoomManager").subscribe(ffw.m121194e(new e30() { // from class: l.en40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92278a.m170396D2((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.gn40
            @Override // p149l.e30
            public final void call(Object obj) {
                pn40.m170390x2((Throwable) obj);
            }
        }));
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: N1 */
    public void mo132080N1(String str) {
        int iM195664K4 = ypv.m215672k().m195664K4();
        this.f108764u = iM195664K4;
        LivingNormalApiProvider.m71484i7(str, iM195664K4).subscribe(ffw.m121194e(new e30() { // from class: l.kn40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123859a.m170397E2((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.ln40
            @Override // p149l.e30
            public final void call(Object obj) {
                pn40.m170386t2((Throwable) obj);
            }
        }));
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: O1 */
    public void mo132082O1(final boolean z, String str, String str2) {
        LivingNormalApiProvider.m71493j7(z, str, str2).subscribe(ffw.m121194e(new e30() { // from class: l.hn40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108582a.m170398F2(z, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.in40
            @Override // p149l.e30
            public final void call(Object obj) {
                pn40.m170383q2((Throwable) obj);
            }
        }));
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: p */
    public boolean mo97490p() {
        return false;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: r1 */
    public void mo132162r1(String str, String str2, boolean z) {
        LivingNormalApiProvider.m71546p6(str, str2, z).subscribe(ffw.m121193d(new e30() { // from class: l.fn40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98398a.m170395C2((ArrayList) obj);
            }
        }));
    }
}
