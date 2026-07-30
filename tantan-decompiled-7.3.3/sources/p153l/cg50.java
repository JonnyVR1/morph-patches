package p153l;

import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class cg50 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public final a4m f81632i;

    /* JADX INFO: renamed from: j */
    public final OfficialShowPusherView f81633j;

    /* JADX INFO: renamed from: k */
    public int f81634k;

    public cg50(dum<? extends mu40> dumVar, a4m a4mVar, OfficialShowPusherView officialShowPusherView) {
        super(dumVar);
        this.f81634k = 0;
        this.f81633j = officialShowPusherView;
        this.f81632i = a4mVar;
    }

    /* JADX INFO: renamed from: L3 */
    private void m109678L3(BLive bLive) {
        m109680P3(bLive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m109679N3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f81634k == 1));
    }

    /* JADX INFO: renamed from: P3 */
    private void m109680P3(BLive bLive) {
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
            this.f81632i.mo95985r0("start pusher error", R$string.f47418Ad, iMo133185d);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m109681M3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f81634k == 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m109682O3() {
        if (ConnectivityReceiver.m82470j()) {
            o1j0.m165620B(zrv.f205803e.getString(R$string.f48144i6), false, true);
        }
        BLive bLiveMo122892l = ((dw40) m213810E2()).m118363A2().mo122892l();
        ((h0m) m138856F3(new z310(2600))).mo133183b();
        m109678L3(bLiveMo122892l);
        this.f81634k++;
        fgt.m125530b(this, "anchor_pusher_start", new y20() { // from class: l.ag50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71085a.m109679N3((Map) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((szl) m138856F3(new c210(2600))).mo101596m0(act());
        d0m d0mVar = (d0m) m138856F3(new s510(2600));
        if (d0mVar != null) {
            d0mVar.mo113412b(this.f81633j.f51962d);
            d0mVar.mo113413c(this.f81633j.f51963e);
            d0mVar.mo113411a();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m109683l() {
        fgt.m125530b(this, "anchor_pusher_success", new y20() { // from class: l.bg50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76568a.m109681M3((Map) obj);
            }
        });
        lej0.INSTANCE.m153907a("live_anchor_call", "onPushBegin");
    }
}
