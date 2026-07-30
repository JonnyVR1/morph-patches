package p149l;

import android.os.Build;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class gmk0 extends zeu<LiveVChatGiftLayer> {
    public gmk0(jlu jluVar, LiveVChatGiftLayer liveVChatGiftLayer) {
        super(jluVar);
        mo51532C(liveVChatGiftLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m127027Y2(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            ((LiveVChatGiftLayer) this.viewModel).m69275z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m127028Z2(Boolean bool) {
        ((LiveVChatGiftLayer) this.viewModel).m69274y();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m218411K2().GiftTraysEventGroup.m69185d().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.dmk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86954a.m127032X2((fxj) obj);
            }
        }));
        if (m127030V2() || m127029U2()) {
            lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.emk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92223a.m127027Y2((C4319c) obj);
                }
            }));
        }
        duringCreated(m218409H2().m203948z()).distinctUntilChanged().map(new fkz("stopped")).subscribe(ffw.m121197h(new e30() { // from class: l.fmk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98308a.m127028Z2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final boolean m127029U2() {
        return ThirdPushManager.VENDOR_TYPE_MEIZU.equals(Build.BRAND.toUpperCase()) && Constants.VIA_REPORT_TYPE_WPA_STATE.equals(Build.MODEL.toUpperCase());
    }

    /* JADX INFO: renamed from: V2 */
    public final boolean m127030V2() {
        return Build.BRAND.toUpperCase().equals(RomUtil.ROM_OPPO) && Build.MODEL.toUpperCase().equals("PBDM00");
    }

    /* JADX INFO: renamed from: W2 */
    public boolean m127031W2(BLiveEffect bLiveEffect, h7e h7eVar) {
        if (bLiveEffect == null) {
            return false;
        }
        return spe.m185365d(bLiveEffect.type).m152982e(bLiveEffect.f44359id, true, h7eVar);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m127032X2(fxj fxjVar) {
        m127033a3(fxjVar.f99770f);
    }

    /* JADX INFO: renamed from: a3 */
    public void m127033a3(GiftTrayData giftTrayData) {
        ((LiveVChatGiftLayer) this.viewModel).m69268q(giftTrayData);
    }
}
