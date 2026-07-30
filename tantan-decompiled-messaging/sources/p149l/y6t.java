package p149l;

import android.view.View;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class y6t extends cts<a7t> {
    public y6t(mcr mcrVar, mss mssVar, VNavigationBar vNavigationBar, View view, View view2) {
        super(mcrVar, mssVar);
        a7t a7tVar = new a7t(vNavigationBar, view, view2);
        this.viewModel = a7tVar;
        mo51532C(a7tVar);
        m144512z2(new q4u(mcrVar, mssVar, ((a7t) this.viewModel).f67952b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m213249S2(String str) {
        ((a7t) this.viewModel).m95303e("square-curated".equals(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m213250T2(Boolean bool) {
        ((a7t) this.viewModel).m95304f(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m213251U2(Boolean bool) {
        ((a7t) this.viewModel).m95302d(bool);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.v6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180224a.m213249S2((String) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomeMenuEvent.onMenuDialogShow().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.w6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184993a.m213250T2((Boolean) obj);
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).subscribe(ffw.m121197h(new e30() { // from class: l.x6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191272a.m213251U2((Boolean) obj);
            }
        }));
    }
}
