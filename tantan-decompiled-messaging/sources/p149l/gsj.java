package p149l;

import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import p133rx.C22306c;
import p149l.jlu;

/* JADX INFO: loaded from: classes13.dex */
public class gsj<T extends jlu> extends zeu<LiveVChatGiftOperationView> {

    /* JADX INFO: renamed from: f */
    public final GiftDialogShadeLayer f104182f;

    public gsj(jlu jluVar, LiveVChatGiftOperationView liveVChatGiftOperationView, GiftDialogShadeLayer giftDialogShadeLayer) {
        super(jluVar);
        mo51532C(liveVChatGiftOperationView);
        this.f104182f = giftDialogShadeLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m127798W2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((LiveVChatGiftOperationView) this.viewModel).m69485n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m127799X2(soj0 soj0Var) {
        ((LiveVChatGiftOperationView) this.viewModel).m69485n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m127800Y2(soj0 soj0Var) {
        ((LiveVChatGiftOperationView) this.viewModel).m69489v();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c<T>) m218411K2().GiftDialogEventGroup.m69174b().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.yrj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199672a.m127798W2((Boolean) obj);
            }
        }));
        duringCreated((C22306c<T>) m218411K2().GiftDialogEventGroup.m69176d().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.asj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71457a.m127799X2((soj0) obj);
            }
        }));
        duringCreated((C22306c<T>) m218411K2().GiftDialogEventGroup.m69175c().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.csj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82356a.m127800Y2((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public void m127801V2(boolean z) {
        this.f104182f.m73687c(z);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m127802Z2(ffe0 ffe0Var) {
        m218411K2().GiftDialogEventGroup.m69177e().mo172463j(ffe0Var);
    }

    /* JADX INFO: renamed from: a3 */
    public void m127803a3(nb0 nb0Var) {
        ((LiveVChatGiftOperationView) this.viewModel).m69488u(nb0Var, new LiveVChatMultipleGiftView.InterfaceC12530a() { // from class: l.esj
            @Override // com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView.InterfaceC12530a
            /* JADX INFO: renamed from: a */
            public final void mo69682a(ffe0 ffe0Var) {
                this.f93013a.m127802Z2(ffe0Var);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public void m127804b3() {
        this.f104182f.m73690f();
    }
}
