package p149l;

import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n750 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public final h1m f137483i;

    /* JADX INFO: renamed from: j */
    public final OfficialShowPusherView f137484j;

    /* JADX INFO: renamed from: k */
    public int f137485k;

    public n750(bsm<? extends yl40> bsmVar, h1m h1mVar, OfficialShowPusherView officialShowPusherView) {
        super(bsmVar);
        this.f137485k = 0;
        this.f137484j = officialShowPusherView;
        this.f137483i = h1mVar;
    }

    /* JADX INFO: renamed from: L3 */
    private void m158111L3(BLive bLive) {
        m158113P3(bLive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m158112N3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f137485k == 1));
    }

    /* JADX INFO: renamed from: P3 */
    private void m158113P3(BLive bLive) {
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
            this.f137483i.mo100522r0("start pusher error", R$string.f46570Ad, iMo133474d);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m158114M3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f137485k == 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m158115O3() {
        if (ConnectivityReceiver.m81287j()) {
            lsi0.m151564B(ypv.f199497e.getString(R$string.f47296i6), false, true);
        }
        BLive bLiveMo165470l = ((pn40) m206027E2()).m170393A2().mo165470l();
        ((oxl) m129297F3(new rv00(2600))).mo133472b();
        m158111L3(bLiveMo165470l);
        this.f137485k++;
        eet.m116003b(this, "anchor_pusher_start", new e30() { // from class: l.l750
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126693a.m158112N3((Map) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((zwl) m129297F3(new tt00(2600))).mo185833m0(act());
        kxl kxlVar = (kxl) m129297F3(new ix00(2600));
        if (kxlVar != null) {
            kxlVar.mo133283b(this.f137484j.f51114d);
            kxlVar.mo133284c(this.f137484j.f51115e);
            kxlVar.mo133282a();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m158116l() {
        eet.m116003b(this, "anchor_pusher_success", new e30() { // from class: l.m750
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131792a.m158114M3((Map) obj);
            }
        });
        h5j0.INSTANCE.m129402a("live_anchor_call", "onPushBegin");
    }
}
