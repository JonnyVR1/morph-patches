package p153l;

import android.os.Build;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12995a;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class aks extends i6t<oo2, LiveGiftLayer> {

    /* JADX INFO: renamed from: l.aks$a */
    public class C15737a extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f72036a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f72037b;

        public C15737a(GiftTrayData giftTrayData, boolean z) {
            this.f72036a = giftTrayData;
            this.f72037b = z;
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(String str) {
            GiftTrayData giftTrayData = this.f72036a;
            rre.m182734f(e4d0.m119410b(giftTrayData, giftTrayData.m75352v(), this.f72037b));
        }
    }

    public aks(dum dumVar, LiveGiftLayer liveGiftLayer) {
        super(dumVar);
        mo52715C(liveGiftLayer);
    }

    /* JADX INFO: renamed from: L3 */
    private boolean m98618L3() {
        return ThirdPushManager.VENDOR_TYPE_MEIZU.equals(Build.BRAND.toUpperCase()) && Constants.VIA_REPORT_TYPE_WPA_STATE.equals(Build.MODEL.toUpperCase());
    }

    /* JADX INFO: renamed from: M3 */
    private boolean m98619M3() {
        return Build.BRAND.toUpperCase().equals(RomUtil.ROM_OPPO) && Build.MODEL.toUpperCase().equals("PBDM00");
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m98620N3(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        if (giftTrayData.m75348r()) {
            return true;
        }
        if (bLiveEffect == null) {
            return false;
        }
        return wqe.m207509d(bLiveEffect.type).m152744e(bLiveEffect.f45207id, true, new C15737a(giftTrayData, z));
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m98621O3(C12995a c12995a) {
        m98624S3(c12995a.f51006f);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m98622P3(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            ((LiveGiftLayer) this.viewModel).m74811c();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m98623R3(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        C12995a.b bVar = new C12995a.b();
        bVar.f51011a = bLiveEffect;
        bVar.f51012b = giftTrayData;
        m213811F2().GiftTraysEvent.playGameEffect().mo199273j(bVar);
    }

    /* JADX INFO: renamed from: S3 */
    public void m98624S3(GiftTrayData giftTrayData) {
        ((LiveGiftLayer) this.viewModel).m74810b(giftTrayData);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().GiftTraysEvent.playGiftLayer().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.zjs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204702a.m98621O3((C12995a) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (m98619M3() || m98618L3()) {
            lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.yjs
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200330a.m98622P3((C4470c) obj);
                }
            }));
        }
    }
}
