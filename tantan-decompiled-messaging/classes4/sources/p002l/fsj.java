package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import l.bwr;
import l.e30;
import l.ffw;
import l.soj0;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fsj<T extends ho2> extends h4t<T, GiftOperationView> {

    /* JADX INFO: renamed from: i */
    public final GiftDialogShadeLayer f10625i;

    public fsj(bsm<? extends T> bsmVar, GiftOperationView giftOperationView, GiftDialogShadeLayer giftDialogShadeLayer) {
        super(bsmVar);
        C(giftOperationView);
        this.f10625i = giftDialogShadeLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m13473P3(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((GiftOperationView) ((bwr) this).viewModel).m7258n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m13474R3(soj0 soj0Var) {
        ((GiftOperationView) ((bwr) this).viewModel).m7258n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m13475S3(soj0 soj0Var) {
        ((GiftOperationView) ((bwr) this).viewModel).m7261v();
    }

    /* JADX INFO: renamed from: N3 */
    public void m13476N3(boolean z) {
        this.f10625i.m7235c(z);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m13477O3(efe0 efe0Var) {
        m25548F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().j(efe0Var);
    }

    /* JADX INFO: renamed from: T */
    public void m13478T() {
        super.T();
    }

    /* JADX INFO: renamed from: T3 */
    public void m13479T3(mb0 mb0Var) {
        ((GiftOperationView) ((bwr) this).viewModel).m7260u(mb0Var, new LiveMultipleGiftView.InterfaceC0400a() { // from class: l.dsj
            @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView.InterfaceC0400a
            /* JADX INFO: renamed from: a */
            public final void mo7443a(efe0 efe0Var) {
                this.f9415a.m13477O3(efe0Var);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m13480U3() {
        this.f10625i.m7238f();
    }

    /* JADX INFO: renamed from: t */
    public void m13481t() {
        super.t();
        duringCreated((c) m25548F2().GiftDialogEventGroup.giftDialogStatus().g()).subscribe(ffw.h(new e30() { // from class: l.xrj
            public final void call(Object obj) {
                this.f22431a.m13473P3((Boolean) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.hideGiftOperationLayer().g()).subscribe(ffw.h(new e30() { // from class: l.zrj
            public final void call(Object obj) {
                this.f23573a.m13474R3((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.giftLongPressCancel().g()).subscribe(ffw.h(new e30() { // from class: l.bsj
            public final void call(Object obj) {
                this.f8328a.m13475S3((soj0) obj);
            }
        }));
    }
}
