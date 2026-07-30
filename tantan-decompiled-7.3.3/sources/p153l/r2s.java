package p153l;

import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class r2s extends n54 {

    /* JADX INFO: renamed from: l */
    public final hz3 f160970l;

    /* JADX INFO: renamed from: m */
    public kcg0 f160971m;

    public r2s(dum dumVar, z34 z34Var) {
        super(dumVar, z34Var);
        this.f140282k.onNext(Boolean.TRUE);
        ((xzl) m138856F3(new r410(4400))).mo170509N(false);
        m153103z2(new rzp(dumVar, this));
        m153103z2(new z74(dumVar, z34Var.f202778a, this));
        m153103z2(new o04(dumVar, z34Var.f202779b, this));
        this.f160970l = (hz3) m153103z2(new hz3(dumVar, this));
        m153103z2(new a04(dumVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m179551A4(pf60<BLive, BLiveRtcToken> pf60Var) {
        h0m h0mVar = (h0m) m138856F3(new z310(4400));
        BLive bLive = pf60Var.f152156a;
        h0mVar.mo133185d(new i04(bLive.streamUrl.push, bLive.streamUrl.pushIpv6, bLive.room.f45267id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(pf60Var.f152156a.streamCdnInfo.businessType), pf60Var.f152156a.videoQualityConf, pf60Var.f152157b, new z20() { // from class: l.q2s
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f155384a.m179564y4((Integer) obj, obj2);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    private void m179552C4() {
        C12877b c12877bMo133182a;
        this.f140281j.m178276s();
        m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
        g64.m129083d("real stop call push");
        h0m h0mVar = (h0m) m138856F3(new z310(2600));
        if (h0mVar == null || (c12877bMo133182a = h0mVar.mo133182a()) == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72486O6(((dw40) m213810E2()).m202191k(), LivingNormalApiProvider.SwitchType.CALL_TO_NORMAL)).subscribe(dhw.m115826e(new y20() { // from class: l.k2s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123646a.m179563x4((BLive) obj);
            }
        }, new l2s(this)));
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ pf60 m179553o4(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        return new pf60(bLive, bLiveRtcToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final void m179559B4() {
        if (((h0m) m138856F3(new z310(2600))).mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR)) {
            return;
        }
        g64.m129083d("request call token and refresh Stream Url");
        duringCreated((C22421c) LivingNormalApiProvider.m72486O6(((dw40) m213810E2()).m202191k(), LivingNormalApiProvider.SwitchType.NORMAL_TO_CALL).flatMap(new qcj() { // from class: l.n2s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f139890a.m179562w4((BLive) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.o2s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144767a.m179551A4((pf60) obj);
            }
        }, new l2s(this)));
    }

    @Override // p153l.n54
    /* JADX INFO: renamed from: i4 */
    public void mo161657i4(LiveCallMessage liveCallMessage) {
        super.mo161657i4(liveCallMessage);
        if (liveCallMessage.m73006is(15)) {
            o1j0.m165651y(String.format(this.f196919f.getString(R$string.f47406A1), liveCallMessage.getCall().userName));
            this.f140281j.m178280w(liveCallMessage.getCall());
        } else if (liveCallMessage.m73006is(26)) {
            o1j0.m165651y(String.format(this.f196919f.getString(R$string.f48512z1), liveCallMessage.getCall().userName));
            this.f140281j.m178280w(liveCallMessage.getCall());
        } else if (liveCallMessage.m73006is(14)) {
            o1j0.m165651y(this.f196919f.getString(R$string.f48490y1, liveCallMessage.getCall().userName));
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m179552C4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m179560u4(boolean z, boolean z2) {
        g64.m129086g(z, z2, m161648Z3());
        if (m161648Z3().m178270m().m143253m().size() == 0) {
            if (z) {
                g64.m129083d("start call push");
                psd0.m173633z(this.f160971m);
                m179559B4();
            } else {
                if (z2) {
                    return;
                }
                g64.m129083d("stop call push");
                psd0.m173633z(this.f160971m);
                this.f160971m = m138858H3(((dw40) m213810E2()).m168521h2(10, TimeUnit.SECONDS)).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.m2s
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f134609a.m179561v4((Long) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m179561v4(Long l2) {
        m179552C4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ C22421c m179562w4(final BLive bLive) {
        return LivingNormalApiProvider.m72721o7(((dw40) m213810E2()).mo183435j().room.f45267id, "call", bLive.rtcInfo.provider).map(new qcj() { // from class: l.p2s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return r2s.m179553o4(bLive, (BLiveRtcToken) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m179563x4(BLive bLive) {
        m213811F2().LivePusherEvent.switchPushToNormal().mo199273j(bLive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final void m179564y4(Integer num, Object obj) {
        g64.m129084e(num, obj, m161648Z3());
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            if (!this.f160970l.m137817W3((Long) obj) && m161648Z3().m178270m().m143250j(String.valueOf(obj)) == null) {
                g64.m129083d("there is a illegal person enter room");
                return;
            }
            return;
        }
        if (iIntValue == 2) {
            BLiveCall bLiveCallM178263f = this.f140281j.m178263f(String.valueOf(obj));
            if (bLiveCallM178263f != null) {
                m161646X3(bLiveCallM178263f, q24.f155275a);
                return;
            }
            return;
        }
        if (iIntValue == 4) {
            BLiveCall bLiveCallM178263f2 = this.f140281j.m178263f(String.valueOf(obj));
            if (bLiveCallM178263f2 != null) {
                this.f160970l.m137829j4(bLiveCallM178263f2);
                return;
            }
            return;
        }
        if (iIntValue == 5) {
            m213811F2().CallEvent.memberVolume().mo199273j((BLiveCallVolume) obj);
        } else {
            if (iIntValue != 6) {
                return;
            }
            m213811F2().MomoSdkEvent.renewRtcToken().mo199273j(new f510(((dw40) m213810E2()).mo183435j().room.f45267id, "call", String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public void m179565z4(y34 y34Var) {
        this.f160970l.m137826g4(y34Var);
    }
}
