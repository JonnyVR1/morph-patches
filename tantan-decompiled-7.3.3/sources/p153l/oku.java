package p153l;

import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogBottomBar;
import p137rx.C22421c;
import p153l.knu;

/* JADX INFO: loaded from: classes9.dex */
public class oku<T extends knu> extends ahu<LiveVChatGiftDialogBottomBar> {
    public oku(knu knuVar, LiveVChatGiftDialogBottomBar liveVChatGiftDialogBottomBar) {
        super(knuVar);
        mo52715C(liveVChatGiftDialogBottomBar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c<T>) m97928K2().GiftDialogEventGroup.m70362g().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.mku
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137331a.m168055T2((unj) obj);
            }
        }));
        duringCreated((C22421c<T>) ((hiv) zrv.m221194l(htd0.f111521c)).m135156h()).subscribe(dhw.m115825d(new y20() { // from class: l.nku
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142480a.m168056U2((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m168055T2(unj unjVar) {
        ((LiveVChatGiftDialogBottomBar) this.viewModel).m70549l0(unjVar);
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m168056U2(Long l2) {
        ((LiveVChatGiftDialogBottomBar) this.viewModel).setAvailableCoin(l2);
    }
}
