package p153l;

import android.os.Build;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes9.dex */
public class mvk0 extends ahu<LiveVChatGiftLayer> {
    public mvk0(knu knuVar, LiveVChatGiftLayer liveVChatGiftLayer) {
        super(knuVar);
        mo52715C(liveVChatGiftLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m160274Y2(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            ((LiveVChatGiftLayer) this.viewModel).m70458z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m160275Z2(Boolean bool) {
        ((LiveVChatGiftLayer) this.viewModel).m70457y();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m97928K2().GiftTraysEventGroup.m70368d().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jvk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122816a.m160279X2((vzj) obj);
            }
        }));
        if (m160277V2() || m160276U2()) {
            lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.kvk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f128971a.m160274Y2((C4470c) obj);
                }
            }));
        }
        duringCreated(m97926H2().m212355z()).distinctUntilChanged().map(new ctz("stopped")).subscribe(dhw.m115829h(new y20() { // from class: l.lvk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133716a.m160275Z2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final boolean m160276U2() {
        return ThirdPushManager.VENDOR_TYPE_MEIZU.equals(Build.BRAND.toUpperCase()) && Constants.VIA_REPORT_TYPE_WPA_STATE.equals(Build.MODEL.toUpperCase());
    }

    /* JADX INFO: renamed from: V2 */
    public final boolean m160277V2() {
        return Build.BRAND.toUpperCase().equals(RomUtil.ROM_OPPO) && Build.MODEL.toUpperCase().equals("PBDM00");
    }

    /* JADX INFO: renamed from: W2 */
    public boolean m160278W2(BLiveEffect bLiveEffect, w8e w8eVar) {
        if (bLiveEffect == null) {
            return false;
        }
        return wqe.m207509d(bLiveEffect.type).m152744e(bLiveEffect.f45207id, true, w8eVar);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m160279X2(vzj vzjVar) {
        m160280a3(vzjVar.f186492f);
    }

    /* JADX INFO: renamed from: a3 */
    public void m160280a3(GiftTrayData giftTrayData) {
        ((LiveVChatGiftLayer) this.viewModel).m70451q(giftTrayData);
    }
}
