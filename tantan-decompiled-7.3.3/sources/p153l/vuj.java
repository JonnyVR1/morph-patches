package p153l;

import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class vuj<T extends oo2> extends i6t<T, GiftOperationView> {

    /* JADX INFO: renamed from: i */
    public final GiftDialogShadeLayer f185819i;

    public vuj(dum<? extends T> dumVar, GiftOperationView giftOperationView, GiftDialogShadeLayer giftDialogShadeLayer) {
        super(dumVar);
        mo52715C(giftOperationView);
        this.f185819i = giftDialogShadeLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m202798P3(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((GiftOperationView) this.viewModel).m74891n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m202799R3(vxj0 vxj0Var) {
        ((GiftOperationView) this.viewModel).m74891n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m202800S3(vxj0 vxj0Var) {
        ((GiftOperationView) this.viewModel).m74894v();
    }

    /* JADX INFO: renamed from: N3 */
    public void m202801N3(boolean z) {
        this.f185819i.m74870c(z);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m202802O3(jne0 jne0Var) {
        m213811F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().mo199273j(jne0Var);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: T3 */
    public void m202803T3(ib0 ib0Var) {
        ((GiftOperationView) this.viewModel).m74893u(ib0Var, new LiveMultipleGiftView.InterfaceC12974a() { // from class: l.tuj
            @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView.InterfaceC12974a
            /* JADX INFO: renamed from: a */
            public final void mo75070a(jne0 jne0Var) {
                this.f176194a.m202802O3(jne0Var);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m202804U3() {
        this.f185819i.m74873f();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.giftDialogStatus().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.nuj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143718a.m202798P3((Boolean) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.hideGiftOperationLayer().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.puj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154191a.m202799R3((vxj0) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.giftLongPressCancel().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ruj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164922a.m202800S3((vxj0) obj);
            }
        }));
    }
}
