package p149l;

import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;

/* JADX INFO: loaded from: classes13.dex */
public class alt extends jjt<dlt> {
    public alt(mcr mcrVar, hkt hktVar) {
        super(mcrVar, hktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m97450M2(Boolean bool) {
        ((dlt) this.viewModel).m112423j(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m97451N2(Boolean bool) {
        ((dlt) this.viewModel).m112424k(bool);
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m97452P2(LiveAnchorsInfo liveAnchorsInfo) {
        boolean z = false;
        boolean z2 = liveAnchorsInfo == null;
        boolean z3 = !z2 && liveAnchorsInfo.isEmpty();
        boolean z4 = ((dlt) this.viewModel).f86865j.getInput() == null || TextUtils.isEmpty(((dlt) this.viewModel).f86865j.getInput().toString());
        xdl0.m208344M(((dlt) this.viewModel).f86866k, (z4 || z2 || z3) ? false : true);
        xdl0.m208344M(((dlt) this.viewModel).f86858c, (z4 || z2 || !z3) ? false : true);
        RelativeLayout relativeLayout = ((dlt) this.viewModel).f86861f;
        if (!z4 && z2) {
            z = true;
        }
        xdl0.m208344M(relativeLayout, z);
        xdl0.m208344M(((dlt) this.viewModel).f86867l, z4);
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m97453Q2(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence.toString().trim())) {
            xdl0.m208344M(((dlt) this.viewModel).f86866k, false);
            xdl0.m208344M(((dlt) this.viewModel).f86858c, false);
            xdl0.m208344M(((dlt) this.viewModel).f86861f, false);
            xdl0.m208344M(((dlt) this.viewModel).f86867l, true);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m141814D2().LiveSearchRootEvent.showEmpty().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.wkt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186825a.m97450M2((Boolean) obj);
            }
        }));
        duringCreated(m141814D2().LiveSearchRootEvent.showError().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xkt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193351a.m97451N2((Boolean) obj);
            }
        }));
        duringCreated(m141814D2().LiveSearchEvent.onSearchResult().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ykt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198835a.m97452P2((LiveAnchorsInfo) obj);
            }
        }));
        duringCreated(m141814D2().LiveSearchEvent.onTextChanged().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zkt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203563a.m97453Q2((CharSequence) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((dlt) v2).destroy();
        }
    }
}
