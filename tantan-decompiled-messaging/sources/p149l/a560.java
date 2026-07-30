package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveTabGiftExpiration;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftExpirationView;

/* JADX INFO: loaded from: classes4.dex */
public class a560 {

    /* JADX INFO: renamed from: a */
    public ahs<?> f67633a;

    /* JADX INFO: renamed from: b */
    public DialogC12611a f67634b;

    /* JADX INFO: renamed from: c */
    public PacketGiftExpirationView f67635c;

    public a560(ahs<?> ahsVar) {
        this.f67633a = ahsVar;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m95016c() {
        this.f67634b.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m95017d(Act act, ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, BLiveTabGiftExpiration bLiveTabGiftExpiration) {
        if (this.f67634b == null) {
            this.f67635c = ipj.m137489d(act);
            f2s f2sVar = new f2s(this.f67633a, this.f67635c);
            this.f67634b = f2sVar;
            f2sVar.m71771c0(d8c0.f84850e);
            this.f67634b.m71778j0(LiveDialogEnum.GIFT_SHOW_EXPIRATION_DIALOG);
        }
        ihsVar.m136283h().interactRules.longPress.expirationInfos = bLiveTabGiftExpiration.expirationInfos;
        this.f67634b.show();
        this.f67635c.m73919q(ihsVar, liveGiftItemView, i, new d30() { // from class: l.z460
            @Override // p149l.d30
            public final void call() {
                this.f201441a.m95016c();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public void m95018e(final Act act, final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i) {
        this.f67633a.duringCreated(zfv.m218603t0(ihsVar.m136283h().f44377id, this.f67633a.m206027E2().m149818o(), this.f67633a.m206027E2().mo132054A0())).subscribe(ffw.m121197h(new e30() { // from class: l.y460
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195908a.m95017d(act, ihsVar, liveGiftItemView, i, (BLiveTabGiftExpiration) obj);
            }
        }));
    }
}
