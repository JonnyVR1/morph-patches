package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveTabGiftExpiration;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftExpirationView;

/* JADX INFO: loaded from: classes4.dex */
public class gd60 {

    /* JADX INFO: renamed from: a */
    public bjs<?> f103630a;

    /* JADX INFO: renamed from: b */
    public DialogC12774a f103631b;

    /* JADX INFO: renamed from: c */
    public PacketGiftExpirationView f103632c;

    public gd60(bjs<?> bjsVar) {
        this.f103630a = bjsVar;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m129918c() {
        this.f103631b.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m129919d(Act act, jjs jjsVar, LiveGiftItemView liveGiftItemView, int i, BLiveTabGiftExpiration bLiveTabGiftExpiration) {
        if (this.f103631b == null) {
            this.f103632c = yrj.m217170d(act);
            g4s g4sVar = new g4s(this.f103630a, this.f103632c);
            this.f103631b = g4sVar;
            g4sVar.m72954c0(jgc0.f120698e);
            this.f103631b.m72961j0(LiveDialogEnum.GIFT_SHOW_EXPIRATION_DIALOG);
        }
        jjsVar.m145122h().interactRules.longPress.expirationInfos = bLiveTabGiftExpiration.expirationInfos;
        this.f103631b.show();
        this.f103632c.m75102q(jjsVar, liveGiftItemView, i, new x20() { // from class: l.fd60
            @Override // p153l.x20
            public final void call() {
                this.f98322a.m129918c();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    /* JADX INFO: renamed from: e */
    public void m129920e(final Act act, final jjs jjsVar, final LiveGiftItemView liveGiftItemView, final int i) {
        this.f103630a.duringCreated(aiv.m98137t0(jjsVar.m145122h().f45225id, this.f103630a.m213810E2().m202194o(), this.f103630a.m213810E2().mo118362A0())).subscribe(dhw.m115829h(new y20() { // from class: l.ed60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93141a.m129919d(act, jjsVar, liveGiftItemView, i, (BLiveTabGiftExpiration) obj);
            }
        }));
    }
}
