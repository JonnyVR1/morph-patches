package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class n04 extends h4t<ho2, RoomPusherView> {

    /* JADX INFO: renamed from: i */
    public final w6d0 f136464i;

    /* JADX INFO: renamed from: j */
    public z24 f136465j;

    /* JADX INFO: renamed from: k */
    public c4g0 f136466k;

    /* JADX INFO: renamed from: l */
    public c4g0 f136467l;

    /* JADX INFO: renamed from: m */
    public String f136468m;

    /* JADX INFO: renamed from: n */
    public c4g0 f136469n;

    public n04(bsm bsmVar, w6d0 w6d0Var, RoomPusherView roomPusherView) {
        super(bsmVar);
        this.f136464i = w6d0Var;
        mo51532C(roomPusherView);
        if (vdt.m198092b(2)) {
            m144512z2(new ww00(bsmVar));
        }
        m144512z2(new ucd0(bsmVar, w6d0Var));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: A4 */
    private void m157193A4(final z24 z24Var) {
        final String str = z24Var.f201156a.f44342id;
        C22306c c22306cFlatMap = m129299H3(m206027E2().m132135h2(30, TimeUnit.SECONDS)).take(1).map(new w9j() { // from class: l.k04
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return n04.m157205U3(str, (Long) obj);
            }
        }).filter(new w9j() { // from class: l.l04
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f125461a.m157236r4(str, (Long) obj);
            }
        }).flatMap(new w9j() { // from class: l.m04
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130708a.m157237s4(str, (Long) obj);
            }
        });
        e30 e30Var = new e30() { // from class: l.rz3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161605a.m157238t4(z24Var, (List) obj);
            }
        };
        w6d0 w6d0Var = this.f136464i;
        Objects.requireNonNull(w6d0Var);
        this.f136466k = c22306cFlatMap.subscribe(ffw.m121194e(e30Var, new sz3(w6d0Var)));
    }

    /* JADX INFO: renamed from: E4 */
    private void m157194E4() {
        mkd0.m154992z(this.f136466k);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m157199N3(Throwable th) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ Long m157205U3(String str, Long l2) {
        return (Long) h54.m129376c("audience control 30s timeout,callId " + str, l2);
    }

    /* JADX INFO: renamed from: f4 */
    private void m157216f4() {
        this.f136464i.m201765L4();
        this.f136464i.m162530Y3(new e30() { // from class: l.tz3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172683a.m157231m4((i0s) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: k4 */
    public void m157217k4(BLiveCall bLiveCall) {
        if (v44.m196938f(bLiveCall)) {
            m157230l4(m206027E2().m149816m().m137796c());
            m157194E4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m157218u4(iqv iqvVar) {
        w6d0 w6d0Var = this.f136464i;
        w6d0Var.m162529X3(w6d0Var.m201767N4(), r14.f157234e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m157219v4(Long l2) {
        m157216f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m157220w4(soj0 soj0Var) {
        m157226g4();
    }

    /* JADX INFO: renamed from: x4 */
    private void m157221x4(z24 z24Var) {
        lsi0.m151595y(this.f188513f.getString(R$string.f46712H1, ""));
        h54.m129377d("audience onConnectFailed");
        this.f136464i.m201788j5(z24Var.f201156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public void m157222y4(iqv iqvVar) {
        if (iqvVar.m137796c()) {
            w6d0 w6d0Var = this.f136464i;
            w6d0Var.m162529X3(w6d0Var.m201767N4(), r14.f157233d);
            m157230l4(true);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: B4 */
    public final void m157223B4(BLiveRtcToken bLiveRtcToken) {
        ((RoomPusherView) this.viewModel).setVisible(true);
        ((oxl) m129297F3(new rv00(4400))).mo133474d(new y04(m206027E2().mo149813j().room.f44419id, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.rtcProvider, bLiveRtcToken.userSig, ((RoomPusherView) this.viewModel).f51521b, new x9j() { // from class: l.c04
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Integer.valueOf(this.f78113a.m157229j4((Integer) obj, obj2));
            }
        }));
    }

    /* JADX INFO: renamed from: C4 */
    public void m157224C4() {
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(4400))).mo133471a();
        if (c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            ((w04) c12714bMo133471a.m71891T0(w04.class)).m200825s1(this.f188513f, true, ((RoomPusherView) this.viewModel).f51520a);
            m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: D4 */
    public final void m157225D4() {
        C22306c<T> c22306cDuringCreated = duringCreated(LivingNormalApiProvider.m71538o7(m206027E2().mo149813j().room.f44419id, "call", ""));
        e30 e30Var = new e30() { // from class: l.a04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67006a.m157223B4((BLiveRtcToken) obj);
            }
        };
        w6d0 w6d0Var = this.f136464i;
        Objects.requireNonNull(w6d0Var);
        c22306cDuringCreated.subscribe(ffw.m121194e(e30Var, new sz3(w6d0Var)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: g4 */
    public final void m157226g4() {
        mkd0.m154992z(this.f136467l);
        this.f136467l = m129299H3(m206027E2().m132135h2(5, TimeUnit.SECONDS)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.uz3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178937a.m157232n4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m157227h4(LiveCallMessage liveCallMessage) {
        this.f136465j = new z24(liveCallMessage.getCall(), liveCallMessage.getCallUser());
        int type = liveCallMessage.getType();
        if (type == 5) {
            m157193A4(this.f136465j);
            m157225D4();
            return;
        }
        if (type == 6 || type == 30) {
            m157194E4();
            return;
        }
        switch (type) {
            case 19:
            case 20:
                C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(4400))).mo133471a();
                if (c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
                    ((w04) c12714bMo133471a.m71891T0(w04.class)).m200825s1(this.f188513f, false, null);
                }
                break;
            case 21:
            case 23:
                if (TextUtils.equals(this.f136465j.f201157b.f111520a, ypv.f199493a.m199309D0())) {
                    ((exl) m129297F3(new jw00(4400))).mo118679n(true);
                }
                break;
            case 22:
            case 24:
                if (TextUtils.equals(this.f136465j.f201157b.f111520a, ypv.f199493a.m199309D0())) {
                    ((exl) m129297F3(new jw00(4400))).mo118679n(false);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m157228i4(i0s i0sVar) {
        if (TextUtils.isEmpty(this.f136468m)) {
            return;
        }
        BLiveCall bLiveCallM133916j = i0sVar.m133916j(this.f136468m);
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(4400))).mo133471a();
        if (v44.m196940h(bLiveCallM133916j) && c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            ((w04) c12714bMo133471a.m71891T0(w04.class)).m200827u1(this.f136468m, true);
            this.f136468m = "";
        }
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r5v26, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r5v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j4 */
    public final int m157229j4(Integer num, final Object obj) {
        h54.m129379f(num, obj, this.f136464i.m162531Z3());
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            m206028F2().PlayerEvent.pausePlay().m172467p();
            m206028F2().PlayerEvent.playerVisible().mo172463j(Boolean.FALSE);
            if (TextUtils.equals(m206027E2().mo149813j().anchor.f44419id, String.valueOf(obj))) {
                return 1;
            }
            if (vwb.m200346r(this.f136464i.m162531Z3().m108760m().m133919m(), new w9j() { // from class: l.d04
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveCall) obj2).user, String.valueOf(obj)));
                }
            }) != null) {
                return 2;
            }
            this.f136468m = String.valueOf(obj);
            return 0;
        }
        if (iIntValue == 2) {
            this.f136468m = null;
            if (!TextUtils.equals(m206027E2().mo149813j().anchor.f44419id, String.valueOf(obj))) {
                return 2;
            }
            w6d0 w6d0Var = this.f136464i;
            w6d0Var.m162529X3(w6d0Var.m201767N4(), r14.f157234e);
            return 1;
        }
        if (iIntValue == 3) {
            m206028F2().CallEvent.memberVolume().mo172463j((BLiveCallVolume) obj);
            return 0;
        }
        if (iIntValue != 4) {
            this.f136464i.m162527V3(new IllegalArgumentException("wrong user in video"));
            return 0;
        }
        duringCreated(LivingNormalApiProvider.m71538o7(m206027E2().mo149813j().room.f44419id, "call", String.valueOf(obj))).subscribe(ffw.m121197h(new e30() { // from class: l.e04
            @Override // p149l.e30
            public final void call(Object obj2) {
                this.f88534a.m157233o4((BLiveRtcToken) obj2);
            }
        }));
        return 0;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m157230l4(boolean z) {
        h54.m129377d("hangUpCallAndRestartPlayer,isEndLive: " + z);
        mkd0.m154992z(this.f136467l);
        oxl oxlVar = (oxl) m129297F3(new rv00(4400));
        if (oxlVar != null) {
            oxlVar.mo133472b();
        }
        ((RoomPusherView) this.viewModel).setVisible(false);
        m206028F2().PlayerEvent.playerVisible().mo172463j(Boolean.TRUE);
        if (z) {
            return;
        }
        m206028F2().PlayerEvent.restartPlay().m172467p();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m157231m4(i0s i0sVar) {
        this.f136464i.m201783e5(i0sVar);
        m157228i4(i0sVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m157230l4(m206027E2().m149816m().m137796c());
        mkd0.m154992z(this.f136467l);
        mkd0.m154992z(this.f136469n);
        this.f136468m = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m157232n4(Long l2) {
        m157224C4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m157233o4(BLiveRtcToken bLiveRtcToken) {
        ((exl) m129297F3(new jw00(4400))).mo118680o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ Boolean m157234p4(Object obj) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g() && lifecycle_() == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m157235q4(Object obj) {
        m157216f4();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m157236r4(String str, Long l2) {
        return Boolean.valueOf(this.f136464i.m162531Z3().m108760m().m133915i(str) == null);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ C22306c m157237s4(String str, Long l2) {
        return duringCreated(LivingNormalApiProvider.m71456f6(str, false, r14.f157235f));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v14, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189101f()).subscribe(ffw.m121193d(new e30() { // from class: l.qz3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156991a.m157227h4((LiveCallMessage) obj);
            }
        }));
        duringCreated(this.f136464i.m201768O4()).filter(new w9j() { // from class: l.b04
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(v44.m196943k((BLiveCall) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.f04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93957a.m157217k4((BLiveCall) obj);
            }
        }));
        duringCreated(m206027E2().m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.g04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100021a.m157222y4((iqv) obj);
            }
        }));
        duringCreated(m206027E2().mo149823u()).subscribe(ffw.m121193d(new e30() { // from class: l.h04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105200a.m157218u4((iqv) obj);
            }
        }));
        m129299H3(m206027E2().m132135h2(20, TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.i04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110257a.m157219v4((Long) obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.delayStartVideoPreview().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.j04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115634a.m157220w4((soj0) obj);
            }
        }));
        m157239z4();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m157238t4(z24 z24Var, List list) {
        m157221x4(z24Var);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m157239z4() {
        this.f136469n = C22306c.merge(ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.vz3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }), lifecycle().filter(new w9j() { // from class: l.wz3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        })).filter(new w9j() { // from class: l.xz3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f195150a.m157234p4(obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.yz3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200845a.m157235q4(obj);
            }
        }, new e30() { // from class: l.zz3
            @Override // p149l.e30
            public final void call(Object obj) {
                n04.m157199N3((Throwable) obj);
            }
        }));
    }
}
