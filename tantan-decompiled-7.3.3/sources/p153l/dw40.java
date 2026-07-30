package p153l;

import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dw40 extends oo2 {
    public dw40(ew40 ew40Var, ajt ajtVar) {
        super(ew40Var, ajtVar);
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ BLiveUserMask m118351p2(BLiveUserMask bLiveUserMask) {
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m118352q2(Throwable th) {
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ void m118355t2(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ nsv m118356u2(HashMap map, nsv nsvVar) {
        String str = ((BLiveMember) nsvVar.f143542a).reference;
        nsvVar.m164637a(((jfv) zrv.m221194l(htd0.f111520b)).m144722i(str));
        if (zrv.m221193k().m203746u7() && iek0.m139635b(nsvVar) && iek0.m139634a(nsvVar).hierarchy != null) {
            ((BLiveMember) nsvVar.f143542a).liveUserLevel = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(iek0.m139634a(nsvVar).hierarchy.grade);
        }
        if (map.containsKey(str)) {
            nsvVar.m164641e((BLiveUserMask) map.get(str));
        }
        return nsvVar;
    }

    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m118359x2(Throwable th) {
    }

    /* JADX INFO: renamed from: z2 */
    public static LivingUsers<BLiveMember> m118361z2(List<BLiveMember> list, List<BLiveUserMask> list2) {
        final HashMap mapM147502d = jyb.m147502d(list2, new qcj() { // from class: l.aw40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveUserMask) obj).userId;
            }
        }, new qcj() { // from class: l.bw40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dw40.m118351p2((BLiveUserMask) obj);
            }
        });
        return LivingUsers.convert(list, new qcj() { // from class: l.cw40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dw40.m118356u2(mapM147502d, (nsv) obj);
            }
        });
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: A0 */
    public String mo118362A0() {
        return "live";
    }

    /* JADX INFO: renamed from: A2 */
    public ew40 m118363A2() {
        return (ew40) this.f185207a;
    }

    /* JADX INFO: renamed from: B2 */
    public boolean m118364B2() {
        BLiveRoom bLiveRoomM122889e = m118363A2().mo122891j();
        return bLiveRoomM122889e == null || bLiveRoomM122889e.equals(BLiveRoom.EMPTY);
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: C0 */
    public String mo118365C0() {
        return "room";
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m118366C2(ArrayList arrayList) {
        this.f148282z.m170283n().onNext(arrayList);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m118367D2(BLiveEnvelope bLiveEnvelope) {
        this.f148282z.m170283n().onNext(new ArrayList<>(jyb.m147486Q(bLiveEnvelope.data.managers, new qcj() { // from class: l.xv40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveMember) obj).reference;
            }
        })));
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m118368E2(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        List<BLiveMember> list = bLiveData.members;
        if (list != null) {
            this.f148264h.onNext(m118361z2(list, bLiveData.masks));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m118369F2(boolean z, BLiveEnvelope bLiveEnvelope) {
        this.f148282z.m170285s(z, bLiveEnvelope.data.liveChatMessages);
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: K1 */
    public void mo118370K1(String str) {
        vrv.m202562w(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/managers")), "refreshRoomManager").subscribe(dhw.m115826e(new y20() { // from class: l.sv40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170807a.m118367D2((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.uv40
            @Override // p153l.y20
            public final void call(Object obj) {
                dw40.m118359x2((Throwable) obj);
            }
        }));
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: N1 */
    public void mo118371N1(String str) {
        int iM203451K4 = zrv.m221193k().m203451K4();
        this.f148277u = iM203451K4;
        LivingNormalApiProvider.m72667i7(str, iM203451K4).subscribe(dhw.m115826e(new y20() { // from class: l.yv40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201677a.m118368E2((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.zv40
            @Override // p153l.y20
            public final void call(Object obj) {
                dw40.m118355t2((Throwable) obj);
            }
        }));
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: O1 */
    public void mo118372O1(final boolean z, String str, String str2) {
        LivingNormalApiProvider.m72676j7(z, str, str2).subscribe(dhw.m115826e(new y20() { // from class: l.vv40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185894a.m118369F2(z, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.wv40
            @Override // p153l.y20
            public final void call(Object obj) {
                dw40.m118352q2((Throwable) obj);
            }
        }));
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: p */
    public boolean mo118373p() {
        return false;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: r1 */
    public void mo118374r1(String str, String str2, boolean z) {
        LivingNormalApiProvider.m72729p6(str, str2, z).subscribe(dhw.m115825d(new y20() { // from class: l.tv40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176241a.m118366C2((ArrayList) obj);
            }
        }));
    }
}
