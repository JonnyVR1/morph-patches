package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftExpirationView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveTabGiftExpiration;
import l.d30;
import l.e30;
import l.ffw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a560 {

    /* JADX INFO: renamed from: a */
    public ahs<?> f7402a;

    /* JADX INFO: renamed from: b */
    public C0200a f7403b;

    /* JADX INFO: renamed from: c */
    public PacketGiftExpirationView f7404c;

    public a560(ahs<?> ahsVar) {
        this.f7402a = ahsVar;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m9392c() {
        this.f7403b.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m9393d(Act act, ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, BLiveTabGiftExpiration bLiveTabGiftExpiration) {
        if (this.f7403b == null) {
            this.f7404c = ipj.m15286d(act);
            f2s f2sVar = new f2s(this.f7402a, this.f7404c);
            this.f7403b = f2sVar;
            f2sVar.m5139c0(d8c0.f9100e);
            this.f7403b.m5146j0(LiveDialogEnum.GIFT_SHOW_EXPIRATION_DIALOG);
        }
        ihsVar.m15160h().interactRules.longPress.expirationInfos = bLiveTabGiftExpiration.expirationInfos;
        this.f7403b.show();
        this.f7404c.m7475q(ihsVar, liveGiftItemView, i, new d30() { // from class: l.z460
            public final void call() {
                this.f23239a.m9392c();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public void m9394e(final Act act, final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i) {
        this.f7402a.duringCreated(zfv.m27306t0(ihsVar.m15160h().id, this.f7402a.m25547E2().m17239o(), this.f7402a.m25547E2().mo14489A0())).subscribe(ffw.h(new e30() { // from class: l.y460
            public final void call(Object obj) {
                this.f22648a.m9393d(act, ihsVar, liveGiftItemView, i, (BLiveTabGiftExpiration) obj);
            }
        }));
    }
}
