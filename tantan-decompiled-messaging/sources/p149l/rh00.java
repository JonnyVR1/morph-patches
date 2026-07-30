package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.settings.MomentMutedAct;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class rh00 extends jq2<th00> {
    public rh00(MomentMutedAct momentMutedAct) {
        super(momentMutedAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m179271g0(Bundle bundle) {
        ((th00) this.viewModel).m188842r();
        CoreModule.m29934N().coreMomentMutedUsers().mo106874b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m179272h0(List list) {
        ((th00) this.viewModel).m188841f(list);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ph00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148860a.m179271g0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.m29934N().coreMomentMutedUsers().mo106873a()).subscribe(mkd0.m154955G(new e30() { // from class: l.qh00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154420a.m179272h0((List) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
