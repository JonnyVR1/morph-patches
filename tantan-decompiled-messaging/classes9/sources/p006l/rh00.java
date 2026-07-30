package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.MomentMutedAct;
import java.util.List;
import l.e30;
import l.jq2;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rh00 extends jq2<th00> {
    public rh00(MomentMutedAct momentMutedAct) {
        super(momentMutedAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m22844g0(Bundle bundle) {
        ((th00) ((jq2) this).viewModel).m24697r();
        CoreModule.m1853N().coreMomentMutedUsers().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m22845h0(List list) {
        ((th00) ((jq2) this).viewModel).m24695f(list);
    }

    /* JADX INFO: renamed from: a0 */
    public void m22846a0() {
        creates(new e30() { // from class: l.ph00
            public final void call(Object obj) {
                this.f18727a.m22844g0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.m1853N().coreMomentMutedUsers().a()).subscribe(mkd0.G(new e30() { // from class: l.qh00
            public final void call(Object obj) {
                this.f19751a.m22845h0((List) obj);
            }
        }));
    }

    public void destroy() {
    }
}
