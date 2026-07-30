package p009l;

import android.os.Bundle;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ExportedBridgeImplementation;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.s7m;
import l.w9j;
import p009l.olp0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hlp0<T extends olp0> extends jq2<T> {
    public hlp0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m15878h0(Bundle bundle) {
        ((olp0) ((jq2) this).viewModel).mo16306y();
        ((olp0) ((jq2) this).viewModel).m19956M();
        ((olp0) ((jq2) this).viewModel).mo16293A(null);
        m15881j0("onReady");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m15879i0(c cVar) {
        if (cVar == c.i) {
            m15881j0("onShow");
        } else if (cVar == c.j) {
            m15881j0("onHide");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m15880a0() {
        super.a0();
        creates(new e30() { // from class: l.elp0
            public final void call(Object obj) {
                this.f12600a.m15878h0((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.flp0
            public final Object call(Object obj) {
                c cVar = (c) obj;
                return Boolean.valueOf(cVar == c.i || cVar == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.glp0
            public final void call(Object obj) {
                this.f13640a.m15879i0((c) obj);
            }
        }));
    }

    public void destroy() {
        m15881j0("onDestroy");
    }

    /* JADX INFO: renamed from: j0 */
    public final void m15881j0(String str) {
        s7m s7mVar = ((jq2) this).viewModel;
        if (s7mVar == null || ((olp0) s7mVar).f18145d == null) {
            return;
        }
        Map<String, String> map = ExportedBridgeImplementation.f8144a.get(Integer.valueOf(((olp0) s7mVar).f18145d.hashCode()));
        if (NullChecker.a(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().toLowerCase().trim().startsWith(str.toLowerCase().trim())) {
                    ((olp0) ((jq2) this).viewModel).m19967p().m11539d().mo15130b(entry.getKey(), new String[0]);
                }
            }
        }
    }
}
