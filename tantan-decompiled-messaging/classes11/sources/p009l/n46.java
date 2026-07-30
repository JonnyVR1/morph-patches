package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.ConversationCounter;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class n46 extends jq2<y46> {
    public n46(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m18769g0(Bundle bundle) {
        ((y46) ((jq2) this).viewModel).m25192i(bundle);
    }

    /* JADX INFO: renamed from: a0 */
    public void m18770a0() {
        super.a0();
        creates(new e30() { // from class: l.l46
            public final void call(Object obj) {
                this.f15929a.m18769g0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.f0.Qe()).subscribe(mkd0.G(new e30() { // from class: l.m46
            public final void call(Object obj) {
                this.f16497a.m18771h0((ConversationCounter) obj);
            }
        }));
        ((y46) ((jq2) this).viewModel).m25199q(false);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m18771h0(ConversationCounter conversationCounter) {
        int i = conversationCounter.conversations.addressBookUnseen;
        if (((y46) ((jq2) this).viewModel).m25190e()) {
            CoreModule.c.f0.Cp(mqi0.m18550o());
            i = 0;
        }
        ((y46) ((jq2) this).viewModel).m25196l(i);
    }

    public void destroy() {
    }
}
