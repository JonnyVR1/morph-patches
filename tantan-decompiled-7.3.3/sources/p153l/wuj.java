package p153l;

import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import p137rx.C22421c;
import p153l.knu;

/* JADX INFO: loaded from: classes9.dex */
public class wuj<T extends knu> extends ahu<LiveVChatGiftOperationView> {

    /* JADX INFO: renamed from: f */
    public final GiftDialogShadeLayer f190868f;

    public wuj(knu knuVar, LiveVChatGiftOperationView liveVChatGiftOperationView, GiftDialogShadeLayer giftDialogShadeLayer) {
        super(knuVar);
        mo52715C(liveVChatGiftOperationView);
        this.f190868f = giftDialogShadeLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m207955W2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((LiveVChatGiftOperationView) this.viewModel).m70668n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m207956X2(vxj0 vxj0Var) {
        ((LiveVChatGiftOperationView) this.viewModel).m70668n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m207957Y2(vxj0 vxj0Var) {
        ((LiveVChatGiftOperationView) this.viewModel).m70672v();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c<T>) m97928K2().GiftDialogEventGroup.m70357b().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ouj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149171a.m207955W2((Boolean) obj);
            }
        }));
        duringCreated((C22421c<T>) m97928K2().GiftDialogEventGroup.m70359d().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.quj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159587a.m207956X2((vxj0) obj);
            }
        }));
        duringCreated((C22421c<T>) m97928K2().GiftDialogEventGroup.m70358c().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.suj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170691a.m207957Y2((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public void m207958V2(boolean z) {
        this.f190868f.m74870c(z);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m207959Z2(kne0 kne0Var) {
        m97928K2().GiftDialogEventGroup.m70360e().mo199273j(kne0Var);
    }

    /* JADX INFO: renamed from: a3 */
    public void m207960a3(jb0 jb0Var) {
        ((LiveVChatGiftOperationView) this.viewModel).m70671u(jb0Var, new LiveVChatMultipleGiftView.InterfaceC12693a() { // from class: l.uuj
            @Override // com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView.InterfaceC12693a
            /* JADX INFO: renamed from: a */
            public final void mo70865a(kne0 kne0Var) {
                this.f181080a.m207959Z2(kne0Var);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public void m207961b3() {
        this.f190868f.m74873f();
    }
}
