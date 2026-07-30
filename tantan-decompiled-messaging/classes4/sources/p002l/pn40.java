package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.cll;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.idv;
import l.mqv;
import l.upv;
import l.vwb;
import l.w9j;
import l.ypv;
import l.ytr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pn40 extends ho2 {
    public pn40(qn40 qn40Var, zgt zgtVar) {
        super(qn40Var, zgtVar);
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ BLiveUserMask m20490p2(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m20491q2(Throwable th) {
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ void m20494t2(Throwable th) {
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ mqv m20495u2(HashMap map, mqv mqvVar) {
        String str = ((BLiveMember) mqvVar.a).reference;
        mqvVar.a(((idv) ypv.l(fld0.b)).i(str));
        if (ypv.k().u7() && c5k0.m10748b(mqvVar) && c5k0.m10747a(mqvVar).hierarchy != null) {
            ((BLiveMember) mqvVar.a).liveUserLevel = ((ggv) ypv.l(fld0.c)).v(c5k0.m10747a(mqvVar).hierarchy.grade);
        }
        if (map.containsKey(str)) {
            mqvVar.e((BLiveUserMask) map.get(str));
        }
        return mqvVar;
    }

    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m20498x2(Throwable th) {
    }

    /* JADX INFO: renamed from: z2 */
    public static LivingUsers<BLiveMember> m20500z2(List<BLiveMember> list, List<BLiveUserMask> list2) {
        final HashMap mapD = vwb.d(list2, new w9j() { // from class: l.mn40
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.nn40
            public final Object call(Object obj) {
                return pn40.m20490p2((BLiveUserMask) obj);
            }
        });
        return LivingUsers.convert(list, new w9j() { // from class: l.on40
            public final Object call(Object obj) {
                return pn40.m20495u2(mapD, (mqv) obj);
            }
        });
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: A0 */
    public String mo14489A0() {
        return "live";
    }

    /* JADX INFO: renamed from: A2 */
    public qn40 m20501A2() {
        return (qn40) this.f14865a;
    }

    /* JADX INFO: renamed from: B2 */
    public boolean m20502B2() {
        BLiveRoom bLiveRoomMo19689j = m20501A2().mo19689j();
        return bLiveRoomMo19689j == null || bLiveRoomMo19689j.equals(BLiveRoom.EMPTY);
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: C0 */
    public String mo14493C0() {
        return "room";
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m20503C2(ArrayList arrayList) {
        this.f12169z.m22171n().onNext(arrayList);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m20504D2(BLiveEnvelope bLiveEnvelope) {
        this.f12169z.m22171n().onNext(new ArrayList(vwb.Q(bLiveEnvelope.data.managers, new w9j() { // from class: l.jn40
            public final Object call(Object obj) {
                return ((BLiveMember) obj).reference;
            }
        })));
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m20505E2(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        List list = bLiveData.members;
        if (list != null) {
            this.f12151h.onNext(m20500z2(list, bLiveData.masks));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m20506F2(boolean z, BLiveEnvelope bLiveEnvelope) {
        this.f12169z.m22173s(z, bLiveEnvelope.data.liveChatMessages);
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: K1 */
    public void mo14510K1(String str) {
        upv.w(cll.l(ytr.b("/rooms/" + str + "/managers")), "refreshRoomManager").subscribe(ffw.e(new e30() { // from class: l.en40
            public final void call(Object obj) {
                this.f9880a.m20504D2((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.gn40
            public final void call(Object obj) {
                pn40.m20498x2((Throwable) obj);
            }
        }));
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: N1 */
    public void mo14516N1(String str) {
        int iK4 = ypv.k().K4();
        this.f12164u = iK4;
        LivingNormalApiProvider.m4850i7(str, iK4).subscribe(ffw.e(new e30() { // from class: l.kn40
            public final void call(Object obj) {
                this.f14429a.m20505E2((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.ln40
            public final void call(Object obj) {
                pn40.m20494t2((Throwable) obj);
            }
        }));
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: O1 */
    public void mo14518O1(final boolean z, String str, String str2) {
        LivingNormalApiProvider.m4859j7(z, str, str2).subscribe(ffw.e(new e30() { // from class: l.hn40
            public final void call(Object obj) {
                this.f12134a.m20506F2(z, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.in40
            public final void call(Object obj) {
                pn40.m20491q2((Throwable) obj);
            }
        }));
    }

    @Override // p002l.lh20
    /* JADX INFO: renamed from: p */
    public boolean mo9893p() {
        return false;
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: r1 */
    public void mo14598r1(String str, String str2, boolean z) {
        LivingNormalApiProvider.m4912p6(str, str2, z).subscribe(ffw.d(new e30() { // from class: l.fn40
            public final void call(Object obj) {
                this.f10533a.m20503C2((ArrayList) obj);
            }
        }));
    }
}
