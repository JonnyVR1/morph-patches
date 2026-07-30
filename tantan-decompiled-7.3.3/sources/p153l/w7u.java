package p153l;

import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerDragMask;

/* JADX INFO: loaded from: classes4.dex */
public class w7u extends i6t<mu40, LiveStickerDragMask> {
    public w7u(dum dumVar, LiveStickerDragMask liveStickerDragMask) {
        super(dumVar);
        mo52715C(liveStickerDragMask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m205390K3(Integer num) {
        ((LiveStickerDragMask) this.viewModel).m73504b(num.intValue());
    }

    /* JADX INFO: renamed from: L3 */
    public void m205391L3(boolean z) {
        ((LiveStickerDragMask) this.viewModel).setMaskVisibility(z);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().StickerEvent.setMaskVisibility().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.u7u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177942a.m205391L3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m213811F2().ChatViewRightChangeEvent.chatRightChange().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.v7u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182821a.m205390K3((Integer) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }
}
