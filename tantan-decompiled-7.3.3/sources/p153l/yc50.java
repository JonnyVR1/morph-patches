package p153l;

import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import p137rx.C22421c;
import p153l.mc50;

/* JADX INFO: loaded from: classes4.dex */
public class yc50<T extends mc50> extends uel0<T> {

    /* JADX INFO: renamed from: x */
    public wnc0 f198390x;

    public yc50(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public /* synthetic */ void m215133x6(vxj0 vxj0Var) {
        m104700E4();
    }

    @Override // p153l.uel0, p153l.bjs
    /* JADX INFO: renamed from: P5 */
    public void mo104722P5(GiftDialogContentView giftDialogContentView) {
        super.mo104722P5(giftDialogContentView);
        this.f198390x = (wnc0) m153103z2(new wnc0(this.f196918e, ((nhs) this.viewModel).m163233z().f51124l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.uel0, p153l.bjs, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((mc50) m213810E2()).m168545q1().f71671T).subscribe(dhw.m115829h(new y20() { // from class: l.wc50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188391a.m215134w6((LongLinkLiveUserLevel.UserLiveHierarchyProgressChange) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().OfficialShowEvent.updateCurrentAnchor().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.xc50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193269a.m215133x6((vxj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.bjs
    /* JADX INFO: renamed from: g6 */
    public void mo104746g6(lx50 lx50Var, boolean z) {
        wnc0 wnc0Var;
        super.mo104746g6(lx50Var, z);
        if (((mc50) m213810E2()).m157913S2() == null || (wnc0Var = this.f198390x) == null) {
            return;
        }
        wnc0Var.m207187J3(((mc50) m213810E2()).m157913S2());
    }

    @Override // p153l.bjs, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((nhs) this.viewModel).m163233z().m75572G0();
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m215134w6(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ((nhs) this.viewModel).m163220Z(userLiveHierarchyProgressChange);
    }
}
