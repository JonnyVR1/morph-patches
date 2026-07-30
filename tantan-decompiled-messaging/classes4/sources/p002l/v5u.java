package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerDragMask;
import l.bwr;
import l.e30;
import l.ffw;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v5u extends h4t<yl40, LiveStickerDragMask> {
    public v5u(bsm bsmVar, LiveStickerDragMask liveStickerDragMask) {
        super(bsmVar);
        C(liveStickerDragMask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m23781K3(Integer num) {
        ((LiveStickerDragMask) ((bwr) this).viewModel).m5797b(num.intValue());
    }

    /* JADX INFO: renamed from: L3 */
    public void m23782L3(boolean z) {
        ((LiveStickerDragMask) ((bwr) this).viewModel).setMaskVisibility(z);
    }

    /* JADX INFO: renamed from: T */
    public void m23783T() {
        super.T();
        duringCreated((c) m25548F2().StickerEvent.setMaskVisibility().g()).subscribe(ffw.d(new e30() { // from class: l.t5u
            public final void call(Object obj) {
                this.f19430a.m23782L3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((c) m25548F2().ChatViewRightChangeEvent.chatRightChange().g()).subscribe(ffw.d(new e30() { // from class: l.u5u
            public final void call(Object obj) {
                this.f20501a.m23781K3((Integer) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
    }
}
