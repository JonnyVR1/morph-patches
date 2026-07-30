package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ggl0 extends qct<mu40> {

    /* JADX INFO: renamed from: i */
    public final cpb0 f104026i;

    /* JADX INFO: renamed from: j */
    public final LivePusherView f104027j;

    /* JADX INFO: renamed from: k */
    public int f104028k;

    public ggl0(dum<? extends mu40> dumVar, cpb0 cpb0Var, LivePusherView livePusherView) {
        super(dumVar);
        this.f104028k = 0;
        this.f104027j = livePusherView;
        this.f104026i = cpb0Var;
    }

    /* JADX INFO: renamed from: P3 */
    public final void m130155P3(final BLive bLive) {
        if (!TextUtils.isEmpty(bLive.rtcInfo.provider)) {
            duringCreated(LivingNormalApiProvider.m72730p7(bLive.room.f45267id, "live", bLive.rtcInfo.provider, (bLive.getFrom() == 6000 || bLive.getFrom() == 600) ? "pk-mutilcall-end" : "", "anchor")).subscribe(dhw.m115826e(new y20() { // from class: l.dgl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88316a.m130156R3(bLive, (BLiveRtcToken) obj);
                }
            }, new y20() { // from class: l.egl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f93951a.m130157S3((Throwable) obj);
                }
            }));
        } else {
            m130163Y3(bLive);
            lej0.INSTANCE.m153909c("live_anchor_call", "RtmpNormalPush");
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m130156R3(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        m130162X3(bLive, bLiveRtcToken);
        lej0.INSTANCE.m153909c("live_anchor_call", "RtcNormalPus");
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m130157S3(Throwable th) {
        this.f104026i.mo95985r0("rtc start pusher error", R$string.f47418Ad, -1);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((szl) m138856F3(new c210(2600))).mo101596m0(act());
        d0m d0mVar = (d0m) m138856F3(new s510(2600));
        if (d0mVar != null) {
            d0mVar.mo113412b(this.f104027j.f48719b);
            d0mVar.mo113413c(this.f104027j.f48720c);
            d0mVar.mo113411a();
        }
        duringCreated(m213811F2().LivePusherEvent.switchPushToNormal().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.bgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76665a.m130155P3((BLive) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m130158T3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f104028k == 1));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m130159U3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f104028k == 1));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m130160V3(BLive bLive, Integer num, Object obj) {
        if (1 == num.intValue()) {
            m213811F2().MomoSdkEvent.renewRtcToken().mo199273j(new f510(bLive.room.f45267id, "live", String.valueOf(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m130161W3() {
        if (((mu40) m213810E2()).m160110O2()) {
            return;
        }
        if (ConnectivityReceiver.m82470j()) {
            o1j0.m165620B(zrv.f205803e.getString(R$string.f48144i6), false, true);
        }
        BLive bLiveMo122892l = ((mu40) m213810E2()).m118363A2().mo122892l();
        ((h0m) m138856F3(new z310(2600))).mo133183b();
        m130155P3(bLiveMo122892l);
        this.f104028k++;
        fgt.m125530b(this, "anchor_pusher_start", new y20() { // from class: l.agl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71249a.m130159U3((Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final void m130162X3(final BLive bLive, BLiveRtcToken bLiveRtcToken) {
        h0m h0mVar = (h0m) m138856F3(new z310(4400));
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        h0mVar.mo133185d(new fpd0(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, bLive.room.f45267id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf, bLiveRtcToken, new z20() { // from class: l.fgl0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f98951a.m130160V3(bLive, (Integer) obj, obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m130163Y3(BLive bLive) {
        int iMo133185d;
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        try {
            iMo133185d = ((h0m) m138856F3(new z310(2600))).mo133185d(nw40.m164939b(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, bLive.room.f45267id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf));
            fhw.m125605a(v2t.f182112b, "call sdk push done");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            iMo133185d = -1;
        }
        if (iMo133185d != 0) {
            this.f104026i.mo95985r0("start pusher error", R$string.f47418Ad, iMo133185d);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m130164l() {
        fgt.m125530b(this, "anchor_pusher_success", new y20() { // from class: l.cgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81685a.m130158T3((Map) obj);
            }
        });
        lej0.INSTANCE.m153907a("live_anchor_call", "onPushBegin");
    }
}
