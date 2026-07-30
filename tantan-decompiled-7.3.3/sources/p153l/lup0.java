package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ExportedBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p153l.sup0;

/* JADX INFO: loaded from: classes10.dex */
public class lup0<T extends sup0> extends ar2<T> {
    public lup0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m155958h0(Bundle bundle) {
        ((sup0) this.viewModel).mo115155y();
        ((sup0) this.viewModel).m188056M();
        ((sup0) this.viewModel).mo115145A(null);
        m155960j0("onReady");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m155959i0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m155960j0("onShow");
        } else if (c4470c == C4470c.f16268j) {
            m155960j0("onHide");
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.iup0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116974a.m155958h0((Bundle) obj);
            }
        });
        lifecycle().filter(new qcj() { // from class: l.jup0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                C4470c c4470c = (C4470c) obj;
                return Boolean.valueOf(c4470c == C4470c.f16267i || c4470c == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.kup0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128915a.m155959i0((C4470c) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
        m155960j0("onDestroy");
    }

    /* JADX INFO: renamed from: j0 */
    public final void m155960j0(String str) {
        V v2 = this.viewModel;
        if (v2 == 0 || ((sup0) v2).f170715d == null) {
            return;
        }
        Map<String, String> map = ExportedBridgeImplementation.f55386a.get(Integer.valueOf(((sup0) v2).f170715d.hashCode()));
        if (NullChecker.m82486a(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().toLowerCase().trim().startsWith(str.toLowerCase().trim())) {
                    ((sup0) this.viewModel).m188066p().m220919d().mo97004b(entry.getKey(), new String[0]);
                }
            }
        }
    }
}
