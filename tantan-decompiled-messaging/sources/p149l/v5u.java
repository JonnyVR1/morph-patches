package p149l;

import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerDragMask;

/* JADX INFO: loaded from: classes4.dex */
public class v5u extends h4t<yl40, LiveStickerDragMask> {
    public v5u(bsm bsmVar, LiveStickerDragMask liveStickerDragMask) {
        super(bsmVar);
        mo51532C(liveStickerDragMask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m197183K3(Integer num) {
        ((LiveStickerDragMask) this.viewModel).m72321b(num.intValue());
    }

    /* JADX INFO: renamed from: L3 */
    public void m197184L3(boolean z) {
        ((LiveStickerDragMask) this.viewModel).setMaskVisibility(z);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().StickerEvent.setMaskVisibility().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.t5u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167877a.m197184L3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m206028F2().ChatViewRightChangeEvent.chatRightChange().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.u5u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174772a.m197183K3((Integer) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }
}
