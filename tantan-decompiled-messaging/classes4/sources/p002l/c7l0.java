package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;
import l.e30;
import l.f30;
import l.ffw;
import l.h5j0;
import l.hfw;
import l.lsi0;
import l.u0t;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c7l0 extends pat<yl40> {

    /* JADX INFO: renamed from: i */
    public final ygb0 f8529i;

    /* JADX INFO: renamed from: j */
    public final LivePusherView f8530j;

    /* JADX INFO: renamed from: k */
    public int f8531k;

    public c7l0(bsm<? extends yl40> bsmVar, ygb0 ygb0Var, LivePusherView livePusherView) {
        super(bsmVar);
        this.f8531k = 0;
        this.f8530j = livePusherView;
        this.f8529i = ygb0Var;
    }

    /* JADX INFO: renamed from: P3 */
    public final void m10799P3(final BLive bLive) {
        if (!TextUtils.isEmpty(bLive.rtcInfo.provider)) {
            duringCreated(LivingNormalApiProvider.m4913p7(((BLiveAbsData) bLive).room.id, "live", bLive.rtcInfo.provider, (bLive.getFrom() == 6000 || bLive.getFrom() == 600) ? "pk-mutilcall-end" : "", "anchor")).subscribe(ffw.e(new e30() { // from class: l.z6l0
                public final void call(Object obj) {
                    this.f23282a.m10800R3(bLive, (BLiveRtcToken) obj);
                }
            }, new e30() { // from class: l.a7l0
                public final void call(Object obj) {
                    this.f7436a.m10801S3((Throwable) obj);
                }
            }));
        } else {
            m10808Y3(bLive);
            h5j0.INSTANCE.c("live_anchor_call", "RtmpNormalPush");
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m10800R3(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        m10807X3(bLive, bLiveRtcToken);
        h5j0.INSTANCE.c("live_anchor_call", "RtcNormalPus");
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m10801S3(Throwable th) {
        this.f8529i.mo10199r0("rtc start pusher error", R$string.f2612Ad, -1);
    }

    /* JADX INFO: renamed from: T */
    public void m10802T() {
        super.T();
        ((zwl) m14184F3(new tt00(2600))).mo22663m0(act());
        kxl kxlVar = (kxl) m14184F3(new ix00(2600));
        if (kxlVar != null) {
            kxlVar.mo14890b(this.f8530j.f3913b);
            kxlVar.mo14891c(this.f8530j.f3914c);
            kxlVar.mo14889a();
        }
        duringCreated((c) m25548F2().LivePusherEvent.switchPushToNormal().g()).subscribe(ffw.d(new e30() { // from class: l.x6l0
            public final void call(Object obj) {
                this.f22142a.m10799P3((BLive) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m10803T3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f8531k == 1));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m10804U3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f8531k == 1));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m10805V3(BLive bLive, Integer num, Object obj) {
        if (1 == num.intValue()) {
            m25548F2().MomoSdkEvent.renewRtcToken().j(new xw00(((BLiveAbsData) bLive).room.id, "live", String.valueOf(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m10806W3() {
        if (((yl40) m25547E2()).m26792O2()) {
            return;
        }
        if (ConnectivityReceiver.j()) {
            lsi0.B(ypv.e.getString(R$string.f3338i6), false, true);
        }
        BLive bLiveMo19690l = ((yl40) m25547E2()).m20501A2().mo19690l();
        ((oxl) m14184F3(new rv00(2600))).mo14925b();
        m10799P3(bLiveMo19690l);
        this.f8531k++;
        eet.m12448b(this, "anchor_pusher_start", new e30() { // from class: l.w6l0
            public final void call(Object obj) {
                this.f21491a.m10804U3((Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final void m10807X3(final BLive bLive, BLiveRtcToken bLiveRtcToken) {
        oxl oxlVar = (oxl) m14184F3(new rv00(4400));
        BLiveStreamUrl bLiveStreamUrl = ((BLiveAbsData) bLive).streamUrl;
        oxlVar.mo14927d(new chd0(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, ((BLiveAbsData) bLive).room.id, String.valueOf(((BLiveAbsData) bLive).streamCdnInfo.provider), String.valueOf(((BLiveAbsData) bLive).streamCdnInfo.businessType), bLive.videoQualityConf, bLiveRtcToken, new f30() { // from class: l.b7l0
            public final void call(Object obj, Object obj2) {
                this.f8022a.m10805V3(bLive, (Integer) obj, obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m10808Y3(BLive bLive) {
        int iMo14927d;
        BLiveStreamUrl bLiveStreamUrl = ((BLiveAbsData) bLive).streamUrl;
        try {
            iMo14927d = ((oxl) m14184F3(new rv00(2600))).mo14927d(zn40.m27437b(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, ((BLiveAbsData) bLive).room.id, String.valueOf(((BLiveAbsData) bLive).streamCdnInfo.provider), String.valueOf(((BLiveAbsData) bLive).streamCdnInfo.businessType), bLive.videoQualityConf));
            hfw.a(u0t.b, "call sdk push done");
        } catch (Exception e) {
            CrashHelper.c(e);
            iMo14927d = -1;
        }
        if (iMo14927d != 0) {
            this.f8529i.mo10199r0("start pusher error", R$string.f2612Ad, iMo14927d);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m10809l() {
        eet.m12448b(this, "anchor_pusher_success", new e30() { // from class: l.y6l0
            public final void call(Object obj) {
                this.f22702a.m10803T3((Map) obj);
            }
        });
        h5j0.INSTANCE.a("live_anchor_call", "onPushBegin");
    }
}
