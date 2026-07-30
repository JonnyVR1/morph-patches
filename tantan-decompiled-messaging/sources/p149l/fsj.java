package p149l;

import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class fsj<T extends ho2> extends h4t<T, GiftOperationView> {

    /* JADX INFO: renamed from: i */
    public final GiftDialogShadeLayer f99082i;

    public fsj(bsm<? extends T> bsmVar, GiftOperationView giftOperationView, GiftDialogShadeLayer giftDialogShadeLayer) {
        super(bsmVar);
        mo51532C(giftOperationView);
        this.f99082i = giftDialogShadeLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m122944P3(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((GiftOperationView) this.viewModel).m73708n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m122945R3(soj0 soj0Var) {
        ((GiftOperationView) this.viewModel).m73708n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m122946S3(soj0 soj0Var) {
        ((GiftOperationView) this.viewModel).m73711v();
    }

    /* JADX INFO: renamed from: N3 */
    public void m122947N3(boolean z) {
        this.f99082i.m73687c(z);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m122948O3(efe0 efe0Var) {
        m206028F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().mo172463j(efe0Var);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: T3 */
    public void m122949T3(mb0 mb0Var) {
        ((GiftOperationView) this.viewModel).m73710u(mb0Var, new LiveMultipleGiftView.InterfaceC12811a() { // from class: l.dsj
            @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView.InterfaceC12811a
            /* JADX INFO: renamed from: a */
            public final void mo73887a(efe0 efe0Var) {
                this.f87771a.m122948O3(efe0Var);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m122950U3() {
        this.f99082i.m73690f();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.giftDialogStatus().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.xrj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194147a.m122944P3((Boolean) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.hideGiftOperationLayer().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.zrj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204518a.m122945R3((soj0) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.giftLongPressCancel().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.bsj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77089a.m122946S3((soj0) obj);
            }
        }));
    }
}
