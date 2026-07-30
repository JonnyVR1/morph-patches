package p149l;

import android.os.Build;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12832a;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class zhs extends h4t<ho2, LiveGiftLayer> {

    /* JADX INFO: renamed from: l.zhs$a */
    public class C21706a extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f203229a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f203230b;

        public C21706a(GiftTrayData giftTrayData, boolean z) {
            this.f203229a = giftTrayData;
            this.f203230b = z;
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(String str) {
            GiftTrayData giftTrayData = this.f203229a;
            nqe.m160600f(bwc0.m104149b(giftTrayData, giftTrayData.m74169v(), this.f203230b));
        }
    }

    public zhs(bsm bsmVar, LiveGiftLayer liveGiftLayer) {
        super(bsmVar);
        mo51532C(liveGiftLayer);
    }

    /* JADX INFO: renamed from: L3 */
    private boolean m218858L3() {
        return ThirdPushManager.VENDOR_TYPE_MEIZU.equals(Build.BRAND.toUpperCase()) && Constants.VIA_REPORT_TYPE_WPA_STATE.equals(Build.MODEL.toUpperCase());
    }

    /* JADX INFO: renamed from: M3 */
    private boolean m218859M3() {
        return Build.BRAND.toUpperCase().equals(RomUtil.ROM_OPPO) && Build.MODEL.toUpperCase().equals("PBDM00");
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m218860N3(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        if (giftTrayData.m74165r()) {
            return true;
        }
        if (bLiveEffect == null) {
            return false;
        }
        return spe.m185365d(bLiveEffect.type).m152982e(bLiveEffect.f44359id, true, new C21706a(giftTrayData, z));
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m218861O3(C12832a c12832a) {
        m218864S3(c12832a.f50158f);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m218862P3(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            ((LiveGiftLayer) this.viewModel).m73628c();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m218863R3(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        C12832a.b bVar = new C12832a.b();
        bVar.f50163a = bLiveEffect;
        bVar.f50164b = giftTrayData;
        m206028F2().GiftTraysEvent.playGameEffect().mo172463j(bVar);
    }

    /* JADX INFO: renamed from: S3 */
    public void m218864S3(GiftTrayData giftTrayData) {
        ((LiveGiftLayer) this.viewModel).m73627b(giftTrayData);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().GiftTraysEvent.playGiftLayer().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.yhs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198393a.m218861O3((C12832a) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (m218859M3() || m218858L3()) {
            lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.xhs
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192913a.m218862P3((C4319c) obj);
                }
            }));
        }
    }
}
