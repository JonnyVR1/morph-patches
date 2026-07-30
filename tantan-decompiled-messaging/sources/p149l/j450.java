package p149l;

import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import p133rx.C22306c;
import p149l.x350;

/* JADX INFO: loaded from: classes4.dex */
public class j450<T extends x350> extends q5l0<T> {

    /* JADX INFO: renamed from: x */
    public pfc0 f116141x;

    public j450(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public /* synthetic */ void m139614x6(soj0 soj0Var) {
        m96613E4();
    }

    @Override // p149l.q5l0, p149l.ahs
    /* JADX INFO: renamed from: P5 */
    public void mo96635P5(GiftDialogContentView giftDialogContentView) {
        super.mo96635P5(giftDialogContentView);
        this.f116141x = (pfc0) m144512z2(new pfc0(this.f188512e, ((mfs) this.viewModel).m154464z().f50276l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.q5l0, p149l.ahs, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((x350) m206027E2()).m132160q1().f170404T).subscribe(ffw.m121197h(new e30() { // from class: l.h450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105801a.m139615w6((LongLinkLiveUserLevel.UserLiveHierarchyProgressChange) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().OfficialShowEvent.updateCurrentAnchor().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.i450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111408a.m139614x6((soj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.ahs
    /* JADX INFO: renamed from: g6 */
    public void mo96659g6(fp50 fp50Var, boolean z) {
        pfc0 pfc0Var;
        super.mo96659g6(fp50Var, z);
        if (((x350) m206027E2()).m206897S2() == null || (pfc0Var = this.f116141x) == null) {
            return;
        }
        pfc0Var.m168607J3(((x350) m206027E2()).m206897S2());
    }

    @Override // p149l.ahs, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((mfs) this.viewModel).m154464z().m74389G0();
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m139615w6(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ((mfs) this.viewModel).m154451Z(userLiveHierarchyProgressChange);
    }
}
