package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import l.bwr;
import l.e30;
import l.ffw;
import l.soj0;
import p002l.x350;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j450<T extends x350> extends q5l0<T> {

    /* JADX INFO: renamed from: x */
    public pfc0 f13548x;

    public j450(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public /* synthetic */ void m15611x6(soj0 soj0Var) {
        m9709E4();
    }

    @Override // p002l.q5l0, p002l.ahs
    /* JADX INFO: renamed from: P5 */
    public void mo9731P5(GiftDialogContentView giftDialogContentView) {
        super.mo9731P5(giftDialogContentView);
        this.f13548x = (pfc0) z2(new pfc0(this.f22036e, ((mfs) ((bwr) this).viewModel).m17907z().f6318l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.q5l0, p002l.ahs
    /* JADX INFO: renamed from: T */
    public void mo9736T() {
        super.mo9736T();
        duringCreated(((x350) m25547E2()).m14596q1().T).subscribe(ffw.h(new e30() { // from class: l.h450
            public final void call(Object obj) {
                this.f11867a.m15612w6((LongLinkLiveUserLevel.UserLiveHierarchyProgressChange) obj);
            }
        }));
        duringCreated((c) m25548F2().OfficialShowEvent.updateCurrentAnchor().g()).subscribe(ffw.h(new e30() { // from class: l.i450
            public final void call(Object obj) {
                this.f13034a.m15611x6((soj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.ahs
    /* JADX INFO: renamed from: g6 */
    public void mo9756g6(fp50 fp50Var, boolean z) {
        pfc0 pfc0Var;
        super.mo9756g6(fp50Var, z);
        if (((x350) m25547E2()).m25674S2() == null || (pfc0Var = this.f13548x) == null) {
            return;
        }
        pfc0Var.m20195J3(((x350) m25547E2()).m25674S2());
    }

    @Override // p002l.ahs
    /* JADX INFO: renamed from: t */
    public void mo9772t() {
        super.mo9772t();
        ((mfs) ((bwr) this).viewModel).m17907z().m7972G0();
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m15612w6(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ((mfs) ((bwr) this).viewModel).m17893Z(userLiveHierarchyProgressChange);
    }
}
