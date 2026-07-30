package p153l;

import android.view.View;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class z8t extends dvs<b9t> {
    public z8t(ner nerVar, nus nusVar, VNavigationBar vNavigationBar, View view, View view2) {
        super(nerVar, nusVar);
        b9t b9tVar = new b9t(vNavigationBar, view, view2);
        this.viewModel = b9tVar;
        mo52715C(b9tVar);
        m153103z2(new r6u(nerVar, nusVar, ((b9t) this.viewModel).f75612b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m219027S2(String str) {
        ((b9t) this.viewModel).m103134e("square-curated".equals(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m219028T2(Boolean bool) {
        ((b9t) this.viewModel).m103135f(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m219029U2(Boolean bool) {
        ((b9t) this.viewModel).m103133d(bool);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.w8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187931a.m219027S2((String) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomeMenuEvent.onMenuDialogShow().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.x8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192870a.m219028T2((Boolean) obj);
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).subscribe(dhw.m115829h(new y20() { // from class: l.y8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198038a.m219029U2((Boolean) obj);
            }
        }));
    }
}
