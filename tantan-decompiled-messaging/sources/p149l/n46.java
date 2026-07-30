package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.ConversationCounter;

/* JADX INFO: loaded from: classes11.dex */
public class n46 extends jq2<y46> {
    public n46(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m157801g0(Bundle bundle) {
        ((y46) this.viewModel).m212882i(bundle);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.l46
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125970a.m157801g0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19642f0.m32773Qe()).subscribe(mkd0.m154955G(new e30() { // from class: l.m46
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131250a.m157802h0((ConversationCounter) obj);
            }
        }));
        ((y46) this.viewModel).m212888q(false);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m157802h0(ConversationCounter conversationCounter) {
        int i = conversationCounter.conversations.addressBookUnseen;
        if (((y46) this.viewModel).m212880e()) {
            CoreModule.f17545c.f19642f0.m32612Cp(mqi0.m155944o());
            i = 0;
        }
        ((y46) this.viewModel).m212885l(i);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
