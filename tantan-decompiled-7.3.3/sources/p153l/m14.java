package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class m14 extends i6t<oo2, RoomPusherView> {

    /* JADX INFO: renamed from: i */
    public final zed0 f134381i;

    /* JADX INFO: renamed from: j */
    public y34 f134382j;

    /* JADX INFO: renamed from: k */
    public kcg0 f134383k;

    /* JADX INFO: renamed from: l */
    public kcg0 f134384l;

    /* JADX INFO: renamed from: m */
    public String f134385m;

    /* JADX INFO: renamed from: n */
    public kcg0 f134386n;

    public m14(dum dumVar, zed0 zed0Var, RoomPusherView roomPusherView) {
        super(dumVar);
        this.f134381i = zed0Var;
        mo52715C(roomPusherView);
        if (wft.m206159b(2)) {
            m153103z2(new e510(dumVar));
        }
        m153103z2(new wkd0(dumVar, zed0Var));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: A4 */
    private void m156552A4(final y34 y34Var) {
        final String str = y34Var.f197301a.f45190id;
        C22421c c22421cFlatMap = m138858H3(m213810E2().m168521h2(30, TimeUnit.SECONDS)).take(1).map(new qcj() { // from class: l.j14
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return m14.m156564U3(str, (Long) obj);
            }
        }).filter(new qcj() { // from class: l.k14
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123447a.m156595r4(str, (Long) obj);
            }
        }).flatMap(new qcj() { // from class: l.l14
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129649a.m156596s4(str, (Long) obj);
            }
        });
        y20 y20Var = new y20() { // from class: l.q04
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155024a.m156597t4(y34Var, (List) obj);
            }
        };
        zed0 zed0Var = this.f134381i;
        Objects.requireNonNull(zed0Var);
        this.f134383k = c22421cFlatMap.subscribe(dhw.m115826e(y20Var, new r04(zed0Var)));
    }

    /* JADX INFO: renamed from: E4 */
    private void m156553E4() {
        psd0.m173633z(this.f134383k);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m156558N3(Throwable th) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ Long m156564U3(String str, Long l2) {
        return (Long) g64.m129082c("audience control 30s timeout,callId " + str, l2);
    }

    /* JADX INFO: renamed from: f4 */
    private void m156575f4() {
        this.f134381i.m219438L4();
        this.f134381i.m161647Y3(new y20() { // from class: l.s04
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165658a.m156590m4((j2s) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: k4 */
    public void m156576k4(BLiveCall bLiveCall) {
        if (u54.m194526f(bLiveCall)) {
            m156589l4(m213810E2().m202193m().m146877c());
            m156553E4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m156577u4(jsv jsvVar) {
        zed0 zed0Var = this.f134381i;
        zed0Var.m161646X3(zed0Var.m219440N4(), q24.f155279e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m156578v4(Long l2) {
        m156575f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m156579w4(vxj0 vxj0Var) {
        m156585g4();
    }

    /* JADX INFO: renamed from: x4 */
    private void m156580x4(y34 y34Var) {
        o1j0.m165651y(this.f196919f.getString(R$string.f47560H1, ""));
        g64.m129083d("audience onConnectFailed");
        this.f134381i.m219461j5(y34Var.f197301a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public void m156581y4(jsv jsvVar) {
        if (jsvVar.m146877c()) {
            zed0 zed0Var = this.f134381i;
            zed0Var.m161646X3(zed0Var.m219440N4(), q24.f155278d);
            m156589l4(true);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: B4 */
    public final void m156582B4(BLiveRtcToken bLiveRtcToken) {
        ((RoomPusherView) this.viewModel).setVisible(true);
        ((h0m) m138856F3(new z310(4400))).mo133185d(new x14(m213810E2().mo183435j().room.f45267id, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.rtcProvider, bLiveRtcToken.userSig, ((RoomPusherView) this.viewModel).f52369b, new rcj() { // from class: l.b14
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Integer.valueOf(this.f74319a.m156588j4((Integer) obj, obj2));
            }
        }));
    }

    /* JADX INFO: renamed from: C4 */
    public void m156583C4() {
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(4400))).mo133182a();
        if (c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            ((v14) c12877bMo133182a.m73074T0(v14.class)).m198972s1(this.f196919f, true, ((RoomPusherView) this.viewModel).f52368a);
            m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: D4 */
    public final void m156584D4() {
        C22421c<T> c22421cDuringCreated = duringCreated(LivingNormalApiProvider.m72721o7(m213810E2().mo183435j().room.f45267id, "call", ""));
        y20 y20Var = new y20() { // from class: l.z04
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202284a.m156582B4((BLiveRtcToken) obj);
            }
        };
        zed0 zed0Var = this.f134381i;
        Objects.requireNonNull(zed0Var);
        c22421cDuringCreated.subscribe(dhw.m115826e(y20Var, new r04(zed0Var)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: g4 */
    public final void m156585g4() {
        psd0.m173633z(this.f134384l);
        this.f134384l = m138858H3(m213810E2().m168521h2(5, TimeUnit.SECONDS)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.t04
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171445a.m156591n4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m156586h4(LiveCallMessage liveCallMessage) {
        this.f134382j = new y34(liveCallMessage.getCall(), liveCallMessage.getCallUser());
        int type = liveCallMessage.getType();
        if (type == 5) {
            m156552A4(this.f134382j);
            m156584D4();
            return;
        }
        if (type == 6 || type == 30) {
            m156553E4();
            return;
        }
        switch (type) {
            case 19:
            case 20:
                C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(4400))).mo133182a();
                if (c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
                    ((v14) c12877bMo133182a.m73074T0(v14.class)).m198972s1(this.f196919f, false, null);
                }
                break;
            case 21:
            case 23:
                if (TextUtils.equals(this.f134382j.f197302b.f107997a, zrv.f205799a.m207631D0())) {
                    ((xzl) m138856F3(new r410(4400))).mo170536n(true);
                }
                break;
            case 22:
            case 24:
                if (TextUtils.equals(this.f134382j.f197302b.f107997a, zrv.f205799a.m207631D0())) {
                    ((xzl) m138856F3(new r410(4400))).mo170536n(false);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m156587i4(j2s j2sVar) {
        if (TextUtils.isEmpty(this.f134385m)) {
            return;
        }
        BLiveCall bLiveCallM143250j = j2sVar.m143250j(this.f134385m);
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(4400))).mo133182a();
        if (u54.m194528h(bLiveCallM143250j) && c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            ((v14) c12877bMo133182a.m73074T0(v14.class)).m198974u1(this.f134385m, true);
            this.f134385m = "";
        }
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r5v26, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r5v8, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: j4 */
    public final int m156588j4(Integer num, final Object obj) {
        g64.m129085f(num, obj, this.f134381i.m161648Z3());
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            m213811F2().PlayerEvent.pausePlay().m199277p();
            m213811F2().PlayerEvent.playerVisible().mo199273j(Boolean.FALSE);
            if (TextUtils.equals(m213810E2().mo183435j().anchor.f45267id, String.valueOf(obj))) {
                return 1;
            }
            if (jyb.m147529r(this.f134381i.m161648Z3().m178270m().m143253m(), new qcj() { // from class: l.c14
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveCall) obj2).user, String.valueOf(obj)));
                }
            }) != null) {
                return 2;
            }
            this.f134385m = String.valueOf(obj);
            return 0;
        }
        if (iIntValue == 2) {
            this.f134385m = null;
            if (!TextUtils.equals(m213810E2().mo183435j().anchor.f45267id, String.valueOf(obj))) {
                return 2;
            }
            zed0 zed0Var = this.f134381i;
            zed0Var.m161646X3(zed0Var.m219440N4(), q24.f155279e);
            return 1;
        }
        if (iIntValue == 3) {
            m213811F2().CallEvent.memberVolume().mo199273j((BLiveCallVolume) obj);
            return 0;
        }
        if (iIntValue != 4) {
            this.f134381i.m161644V3(new IllegalArgumentException("wrong user in video"));
            return 0;
        }
        duringCreated(LivingNormalApiProvider.m72721o7(m213810E2().mo183435j().room.f45267id, "call", String.valueOf(obj))).subscribe(dhw.m115829h(new y20() { // from class: l.d14
            @Override // p153l.y20
            public final void call(Object obj2) {
                this.f84637a.m156592o4((BLiveRtcToken) obj2);
            }
        }));
        return 0;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m156589l4(boolean z) {
        g64.m129083d("hangUpCallAndRestartPlayer,isEndLive: " + z);
        psd0.m173633z(this.f134384l);
        h0m h0mVar = (h0m) m138856F3(new z310(4400));
        if (h0mVar != null) {
            h0mVar.mo133183b();
        }
        ((RoomPusherView) this.viewModel).setVisible(false);
        m213811F2().PlayerEvent.playerVisible().mo199273j(Boolean.TRUE);
        if (z) {
            return;
        }
        m213811F2().PlayerEvent.restartPlay().m199277p();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m156590m4(j2s j2sVar) {
        this.f134381i.m219456e5(j2sVar);
        m156587i4(j2sVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m156589l4(m213810E2().m202193m().m146877c());
        psd0.m173633z(this.f134384l);
        psd0.m173633z(this.f134386n);
        this.f134385m = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m156591n4(Long l2) {
        m156583C4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m156592o4(BLiveRtcToken bLiveRtcToken) {
        ((xzl) m138856F3(new r410(4400))).mo170538o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ Boolean m156593p4(Object obj) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g() && lifecycle_() == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m156594q4(Object obj) {
        m156575f4();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m156595r4(String str, Long l2) {
        return Boolean.valueOf(this.f134381i.m161648Z3().m178270m().m143249i(str) == null);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ C22421c m156596s4(String str, Long l2) {
        return duringCreated(LivingNormalApiProvider.m72639f6(str, false, q24.f155280f));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v11, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v14, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98283f()).subscribe(dhw.m115825d(new y20() { // from class: l.p04
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150006a.m156586h4((LiveCallMessage) obj);
            }
        }));
        duringCreated(this.f134381i.m219441O4()).filter(new qcj() { // from class: l.a14
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(u54.m194531k((BLiveCall) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.e14
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91565a.m156576k4((BLiveCall) obj);
            }
        }));
        duringCreated(m213810E2().m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.f14
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96767a.m156581y4((jsv) obj);
            }
        }));
        duringCreated(m213810E2().mo183449u()).subscribe(dhw.m115825d(new y20() { // from class: l.g14
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101717a.m156577u4((jsv) obj);
            }
        }));
        m138858H3(m213810E2().m168521h2(20, TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.h14
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107403a.m156578v4((Long) obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.delayStartVideoPreview().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.i14
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112487a.m156579w4((vxj0) obj);
            }
        }));
        m156598z4();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m156597t4(y34 y34Var, List list) {
        m156580x4(y34Var);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m156598z4() {
        this.f134386n = C22421c.merge(ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.u04
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }), lifecycle().filter(new qcj() { // from class: l.v04
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        })).filter(new qcj() { // from class: l.w04
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186538a.m156593p4(obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.x04
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191866a.m156594q4(obj);
            }
        }, new y20() { // from class: l.y04
            @Override // p153l.y20
            public final void call(Object obj) {
                m14.m156558N3((Throwable) obj);
            }
        }));
    }
}
