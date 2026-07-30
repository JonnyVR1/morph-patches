package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c7l0 extends pat<yl40> {

    /* JADX INFO: renamed from: i */
    public final ygb0 f79629i;

    /* JADX INFO: renamed from: j */
    public final LivePusherView f79630j;

    /* JADX INFO: renamed from: k */
    public int f79631k;

    public c7l0(bsm<? extends yl40> bsmVar, ygb0 ygb0Var, LivePusherView livePusherView) {
        super(bsmVar);
        this.f79631k = 0;
        this.f79630j = livePusherView;
        this.f79629i = ygb0Var;
    }

    /* JADX INFO: renamed from: P3 */
    public final void m105599P3(final BLive bLive) {
        if (!TextUtils.isEmpty(bLive.rtcInfo.provider)) {
            duringCreated(LivingNormalApiProvider.m71547p7(bLive.room.f44419id, "live", bLive.rtcInfo.provider, (bLive.getFrom() == 6000 || bLive.getFrom() == 600) ? "pk-mutilcall-end" : "", "anchor")).subscribe(ffw.m121194e(new e30() { // from class: l.z6l0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201934a.m105600R3(bLive, (BLiveRtcToken) obj);
                }
            }, new e30() { // from class: l.a7l0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67937a.m105601S3((Throwable) obj);
                }
            }));
        } else {
            m105607Y3(bLive);
            h5j0.INSTANCE.m129404c("live_anchor_call", "RtmpNormalPush");
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m105600R3(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        m105606X3(bLive, bLiveRtcToken);
        h5j0.INSTANCE.m129404c("live_anchor_call", "RtcNormalPus");
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m105601S3(Throwable th) {
        this.f79629i.mo100522r0("rtc start pusher error", R$string.f46570Ad, -1);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((zwl) m129297F3(new tt00(2600))).mo185833m0(act());
        kxl kxlVar = (kxl) m129297F3(new ix00(2600));
        if (kxlVar != null) {
            kxlVar.mo133283b(this.f79630j.f47871b);
            kxlVar.mo133284c(this.f79630j.f47872c);
            kxlVar.mo133282a();
        }
        duringCreated(m206028F2().LivePusherEvent.switchPushToNormal().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.x6l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191250a.m105599P3((BLive) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m105602T3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f79631k == 1));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m105603U3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f79631k == 1));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m105604V3(BLive bLive, Integer num, Object obj) {
        if (1 == num.intValue()) {
            m206028F2().MomoSdkEvent.renewRtcToken().mo172463j(new xw00(bLive.room.f44419id, "live", String.valueOf(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m105605W3() {
        if (((yl40) m206027E2()).m215221O2()) {
            return;
        }
        if (ConnectivityReceiver.m81287j()) {
            lsi0.m151564B(ypv.f199497e.getString(R$string.f47296i6), false, true);
        }
        BLive bLiveMo165470l = ((yl40) m206027E2()).m170393A2().mo165470l();
        ((oxl) m129297F3(new rv00(2600))).mo133472b();
        m105599P3(bLiveMo165470l);
        this.f79631k++;
        eet.m116003b(this, "anchor_pusher_start", new e30() { // from class: l.w6l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184932a.m105603U3((Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final void m105606X3(final BLive bLive, BLiveRtcToken bLiveRtcToken) {
        oxl oxlVar = (oxl) m129297F3(new rv00(4400));
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        oxlVar.mo133474d(new chd0(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, bLive.room.f44419id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf, bLiveRtcToken, new f30() { // from class: l.b7l0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f74000a.m105604V3(bLive, (Integer) obj, obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m105607Y3(BLive bLive) {
        int iMo133474d;
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        try {
            iMo133474d = ((oxl) m129297F3(new rv00(2600))).mo133474d(zn40.m219447b(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, bLive.room.f44419id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf));
            hfw.m130790a(u0t.f172943b, "call sdk push done");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            iMo133474d = -1;
        }
        if (iMo133474d != 0) {
            this.f79629i.mo100522r0("start pusher error", R$string.f46570Ad, iMo133474d);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m105608l() {
        eet.m116003b(this, "anchor_pusher_success", new e30() { // from class: l.y6l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196577a.m105602T3((Map) obj);
            }
        });
        h5j0.INSTANCE.m129402a("live_anchor_call", "onPushBegin");
    }
}
