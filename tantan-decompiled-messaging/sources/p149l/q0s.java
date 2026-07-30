package p149l;

import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class q0s extends o44 {

    /* JADX INFO: renamed from: l */
    public final iy3 f152076l;

    /* JADX INFO: renamed from: m */
    public c4g0 f152077m;

    public q0s(bsm bsmVar, a34 a34Var) {
        super(bsmVar, a34Var);
        this.f141737k.onNext(Boolean.TRUE);
        ((exl) m129297F3(new jw00(4400))).mo118673N(false);
        m144512z2(new rxp(bsmVar, this));
        m144512z2(new a74(bsmVar, a34Var.f67324a, this));
        m144512z2(new pz3(bsmVar, a34Var.f67325b, this));
        this.f152076l = (iy3) m144512z2(new iy3(bsmVar, this));
        m144512z2(new bz3(bsmVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m172341A4(j760<BLive, BLiveRtcToken> j760Var) {
        oxl oxlVar = (oxl) m129297F3(new rv00(4400));
        BLive bLive = j760Var.f116564a;
        oxlVar.mo133474d(new jz3(bLive.streamUrl.push, bLive.streamUrl.pushIpv6, bLive.room.f44419id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(j760Var.f116564a.streamCdnInfo.businessType), j760Var.f116564a.videoQualityConf, j760Var.f116565b, new f30() { // from class: l.p0s
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f146618a.m172354y4((Integer) obj, obj2);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    private void m172342C4() {
        C12714b c12714bMo133471a;
        this.f141736j.m108766s();
        m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
        h54.m129377d("real stop call push");
        oxl oxlVar = (oxl) m129297F3(new rv00(2600));
        if (oxlVar == null || (c12714bMo133471a = oxlVar.mo133471a()) == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71303O6(((pn40) m206027E2()).m149814k(), LivingNormalApiProvider.SwitchType.CALL_TO_NORMAL)).subscribe(ffw.m121194e(new e30() { // from class: l.j0s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115710a.m172353x4((BLive) obj);
            }
        }, new k0s(this)));
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ j760 m172343o4(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        return new j760(bLive, bLiveRtcToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final void m172349B4() {
        if (((oxl) m129297F3(new rv00(2600))).mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR)) {
            return;
        }
        h54.m129377d("request call token and refresh Stream Url");
        duringCreated((C22306c) LivingNormalApiProvider.m71303O6(((pn40) m206027E2()).m149814k(), LivingNormalApiProvider.SwitchType.NORMAL_TO_CALL).flatMap(new w9j() { // from class: l.m0s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130757a.m172352w4((BLive) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.n0s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136582a.m172341A4((j760) obj);
            }
        }, new k0s(this)));
    }

    @Override // p149l.o44
    /* JADX INFO: renamed from: i4 */
    public void mo162540i4(LiveCallMessage liveCallMessage) {
        super.mo162540i4(liveCallMessage);
        if (liveCallMessage.m71823is(15)) {
            lsi0.m151595y(String.format(this.f188513f.getString(R$string.f46558A1), liveCallMessage.getCall().userName));
            this.f141736j.m108770w(liveCallMessage.getCall());
        } else if (liveCallMessage.m71823is(26)) {
            lsi0.m151595y(String.format(this.f188513f.getString(R$string.f47664z1), liveCallMessage.getCall().userName));
            this.f141736j.m108770w(liveCallMessage.getCall());
        } else if (liveCallMessage.m71823is(14)) {
            lsi0.m151595y(this.f188513f.getString(R$string.f47642y1, liveCallMessage.getCall().userName));
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m172342C4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m172350u4(boolean z, boolean z2) {
        h54.m129380g(z, z2, m162531Z3());
        if (m162531Z3().m108760m().m133919m().size() == 0) {
            if (z) {
                h54.m129377d("start call push");
                mkd0.m154992z(this.f152077m);
                m172349B4();
            } else {
                if (z2) {
                    return;
                }
                h54.m129377d("stop call push");
                mkd0.m154992z(this.f152077m);
                this.f152077m = m129299H3(((pn40) m206027E2()).m132135h2(10, TimeUnit.SECONDS)).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.l0s
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f125563a.m172351v4((Long) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m172351v4(Long l2) {
        m172342C4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ C22306c m172352w4(final BLive bLive) {
        return LivingNormalApiProvider.m71538o7(((pn40) m206027E2()).mo149813j().room.f44419id, "call", bLive.rtcInfo.provider).map(new w9j() { // from class: l.o0s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return q0s.m172343o4(bLive, (BLiveRtcToken) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m172353x4(BLive bLive) {
        m206028F2().LivePusherEvent.switchPushToNormal().mo172463j(bLive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final void m172354y4(Integer num, Object obj) {
        h54.m129378e(num, obj, m162531Z3());
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            if (!this.f152076l.m138941W3((Long) obj) && m162531Z3().m108760m().m133916j(String.valueOf(obj)) == null) {
                h54.m129377d("there is a illegal person enter room");
                return;
            }
            return;
        }
        if (iIntValue == 2) {
            BLiveCall bLiveCallM108753f = this.f141736j.m108753f(String.valueOf(obj));
            if (bLiveCallM108753f != null) {
                m162529X3(bLiveCallM108753f, r14.f157230a);
                return;
            }
            return;
        }
        if (iIntValue == 4) {
            BLiveCall bLiveCallM108753f2 = this.f141736j.m108753f(String.valueOf(obj));
            if (bLiveCallM108753f2 != null) {
                this.f152076l.m138953j4(bLiveCallM108753f2);
                return;
            }
            return;
        }
        if (iIntValue == 5) {
            m206028F2().CallEvent.memberVolume().mo172463j((BLiveCallVolume) obj);
        } else {
            if (iIntValue != 6) {
                return;
            }
            m206028F2().MomoSdkEvent.renewRtcToken().mo172463j(new xw00(((pn40) m206027E2()).mo149813j().room.f44419id, "call", String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public void m172355z4(z24 z24Var) {
        this.f152076l.m138950g4(z24Var);
    }
}
