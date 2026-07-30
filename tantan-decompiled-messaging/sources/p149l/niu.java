package p149l;

import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogBottomBar;
import p133rx.C22306c;
import p149l.jlu;

/* JADX INFO: loaded from: classes13.dex */
public class niu<T extends jlu> extends zeu<LiveVChatGiftDialogBottomBar> {
    public niu(jlu jluVar, LiveVChatGiftDialogBottomBar liveVChatGiftDialogBottomBar) {
        super(jluVar);
        mo51532C(liveVChatGiftDialogBottomBar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c<T>) m218411K2().GiftDialogEventGroup.m69179g().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.liu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128261a.m159563T2((elj) obj);
            }
        }));
        duringCreated((C22306c<T>) ((ggv) ypv.m215673l(fld0.f98148c)).m126022h()).subscribe(ffw.m121193d(new e30() { // from class: l.miu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134036a.m159564U2((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m159563T2(elj eljVar) {
        ((LiveVChatGiftDialogBottomBar) this.viewModel).m69366l0(eljVar);
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m159564U2(Long l2) {
        ((LiveVChatGiftDialogBottomBar) this.viewModel).setAvailableCoin(l2);
    }
}
