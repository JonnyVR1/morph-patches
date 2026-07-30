package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ExportedBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p149l.olp0;

/* JADX INFO: loaded from: classes11.dex */
public class hlp0<T extends olp0> extends jq2<T> {
    public hlp0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m131684h0(Bundle bundle) {
        ((olp0) this.viewModel).mo135232y();
        ((olp0) this.viewModel).m164969M();
        ((olp0) this.viewModel).mo135219A(null);
        m131686j0("onReady");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m131685i0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m131686j0("onShow");
        } else if (c4319c == C4319c.f15549j) {
            m131686j0("onHide");
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.elp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92135a.m131684h0((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.flp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                C4319c c4319c = (C4319c) obj;
                return Boolean.valueOf(c4319c == C4319c.f15548i || c4319c == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.glp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103392a.m131685i0((C4319c) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
        m131686j0("onDestroy");
    }

    /* JADX INFO: renamed from: j0 */
    public final void m131686j0(String str) {
        V v2 = this.viewModel;
        if (v2 == 0 || ((olp0) v2).f144530d == null) {
            return;
        }
        Map<String, String> map = ExportedBridgeImplementation.f54538a.get(Integer.valueOf(((olp0) v2).f144530d.hashCode()));
        if (NullChecker.m81303a(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().toLowerCase().trim().startsWith(str.toLowerCase().trim())) {
                    ((olp0) this.viewModel).m164979p().m97924d().mo127285b(entry.getKey(), new String[0]);
                }
            }
        }
    }
}
