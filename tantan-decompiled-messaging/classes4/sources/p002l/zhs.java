package p002l;

import android.os.Build;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.C0421a;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import l.bwr;
import l.e30;
import l.ffw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zhs extends h4t<ho2, LiveGiftLayer> {

    /* JADX INFO: renamed from: l.zhs$a */
    public class C0944a extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f23428a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f23429b;

        public C0944a(GiftTrayData giftTrayData, boolean z) {
            this.f23428a = giftTrayData;
            this.f23429b = z;
        }

        @Override // p002l.i7e, p002l.h7e
        public void onFailed(String str) {
            GiftTrayData giftTrayData = this.f23428a;
            nqe.m18951f(bwc0.m10631b(giftTrayData, giftTrayData.m7734v(), this.f23429b));
        }
    }

    public zhs(bsm bsmVar, LiveGiftLayer liveGiftLayer) {
        super(bsmVar);
        C(liveGiftLayer);
    }

    /* JADX INFO: renamed from: L3 */
    private boolean m27382L3() {
        return "MEIZU".equals(Build.BRAND.toUpperCase()) && "15".equals(Build.MODEL.toUpperCase());
    }

    /* JADX INFO: renamed from: M3 */
    private boolean m27383M3() {
        return Build.BRAND.toUpperCase().equals("OPPO") && Build.MODEL.toUpperCase().equals("PBDM00");
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m27384N3(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        if (giftTrayData.m7730r()) {
            return true;
        }
        if (bLiveEffect == null) {
            return false;
        }
        return spe.m22604d(bLiveEffect.type).m17695e(bLiveEffect.id, true, new C0944a(giftTrayData, z));
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m27385O3(C0421a c0421a) {
        m27388S3(c0421a.f6200f);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m27386P3(c cVar) {
        if (cVar == c.j) {
            ((LiveGiftLayer) ((bwr) this).viewModel).m7175c();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m27387R3(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        C0421a.b bVar = new C0421a.b();
        bVar.f6205a = bLiveEffect;
        bVar.f6206b = giftTrayData;
        m25548F2().GiftTraysEvent.playGameEffect().j(bVar);
    }

    /* JADX INFO: renamed from: S3 */
    public void m27388S3(GiftTrayData giftTrayData) {
        ((LiveGiftLayer) ((bwr) this).viewModel).m7174b(giftTrayData);
    }

    /* JADX INFO: renamed from: T */
    public void m27389T() {
        super.T();
        duringCreated((rx.c) m25548F2().GiftTraysEvent.playGiftLayer().g()).subscribe(ffw.d(new e30() { // from class: l.yhs
            public final void call(Object obj) {
                this.f22890a.m27385O3((C0421a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m27390t() {
        super.t();
        if (m27383M3() || m27382L3()) {
            lifecycle().subscribe(ffw.d(new e30() { // from class: l.xhs
                public final void call(Object obj) {
                    this.f22286a.m27386P3((c) obj);
                }
            }));
        }
    }
}
