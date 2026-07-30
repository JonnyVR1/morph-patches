package p153l;

import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;

/* JADX INFO: loaded from: classes9.dex */
public class bnt extends klt<ent> {
    public bnt(ner nerVar, imt imtVar) {
        super(nerVar, imtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m105621M2(Boolean bool) {
        ((ent) this.viewModel).m121558j(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m105622N2(Boolean bool) {
        ((ent) this.viewModel).m121559k(bool);
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m105623P2(LiveAnchorsInfo liveAnchorsInfo) {
        boolean z = false;
        boolean z2 = liveAnchorsInfo == null;
        boolean z3 = !z2 && liveAnchorsInfo.isEmpty();
        boolean z4 = ((ent) this.viewModel).f94815j.getInput() == null || TextUtils.isEmpty(((ent) this.viewModel).f94815j.getInput().toString());
        bnl0.m105524M(((ent) this.viewModel).f94816k, (z4 || z2 || z3) ? false : true);
        bnl0.m105524M(((ent) this.viewModel).f94808c, (z4 || z2 || !z3) ? false : true);
        RelativeLayout relativeLayout = ((ent) this.viewModel).f94811f;
        if (!z4 && z2) {
            z = true;
        }
        bnl0.m105524M(relativeLayout, z);
        bnl0.m105524M(((ent) this.viewModel).f94817l, z4);
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m105624Q2(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence.toString().trim())) {
            bnl0.m105524M(((ent) this.viewModel).f94816k, false);
            bnl0.m105524M(((ent) this.viewModel).f94808c, false);
            bnl0.m105524M(((ent) this.viewModel).f94811f, false);
            bnl0.m105524M(((ent) this.viewModel).f94817l, true);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m150393D2().LiveSearchRootEvent.showEmpty().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xmt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195326a.m105621M2((Boolean) obj);
            }
        }));
        duringCreated(m150393D2().LiveSearchRootEvent.showError().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ymt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200713a.m105622N2((Boolean) obj);
            }
        }));
        duringCreated(m150393D2().LiveSearchEvent.onSearchResult().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.zmt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205101a.m105623P2((LiveAnchorsInfo) obj);
            }
        }));
        duringCreated(m150393D2().LiveSearchEvent.onTextChanged().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ant
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72380a.m105624Q2((CharSequence) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((ent) v2).destroy();
        }
    }
}
