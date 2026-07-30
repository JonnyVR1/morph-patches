package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;
import l.e30;
import l.h5j0;
import l.hfw;
import l.lsi0;
import l.u0t;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n750 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public final h1m f15850i;

    /* JADX INFO: renamed from: j */
    public final OfficialShowPusherView f15851j;

    /* JADX INFO: renamed from: k */
    public int f15852k;

    public n750(bsm<? extends yl40> bsmVar, h1m h1mVar, OfficialShowPusherView officialShowPusherView) {
        super(bsmVar);
        this.f15852k = 0;
        this.f15851j = officialShowPusherView;
        this.f15850i = h1mVar;
    }

    /* JADX INFO: renamed from: L3 */
    private void m18518L3(BLive bLive) {
        m18520P3(bLive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m18519N3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f15852k == 1));
    }

    /* JADX INFO: renamed from: P3 */
    private void m18520P3(BLive bLive) {
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
            this.f15850i.mo10199r0("start pusher error", R$string.f2612Ad, iMo14927d);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m18521M3(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f15852k == 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m18522O3() {
        if (ConnectivityReceiver.j()) {
            lsi0.B(ypv.e.getString(R$string.f3338i6), false, true);
        }
        BLive bLiveMo19690l = ((pn40) m25547E2()).m20501A2().mo19690l();
        ((oxl) m14184F3(new rv00(2600))).mo14925b();
        m18518L3(bLiveMo19690l);
        this.f15852k++;
        eet.m12448b(this, "anchor_pusher_start", new e30() { // from class: l.l750
            public final void call(Object obj) {
                this.f14701a.m18519N3((Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m18523T() {
        super.T();
        ((zwl) m14184F3(new tt00(2600))).mo22663m0(act());
        kxl kxlVar = (kxl) m14184F3(new ix00(2600));
        if (kxlVar != null) {
            kxlVar.mo14890b(this.f15851j.f7156d);
            kxlVar.mo14891c(this.f15851j.f7157e);
            kxlVar.mo14889a();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m18524l() {
        eet.m12448b(this, "anchor_pusher_success", new e30() { // from class: l.m750
            public final void call(Object obj) {
                this.f15257a.m18521M3((Map) obj);
            }
        });
        h5j0.INSTANCE.a("live_anchor_call", "onPushBegin");
    }
}
