package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.ConversationCounter;

/* JADX INFO: loaded from: classes11.dex */
public class s56 extends ar2<d66> {
    public s56(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m184604g0(Bundle bundle) {
        ((d66) this.viewModel).m114410i(bundle);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.q56
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155663a.m184604g0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20384f0.m33776Qe()).subscribe(psd0.m173596G(new y20() { // from class: l.r56
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161290a.m184605h0((ConversationCounter) obj);
            }
        }));
        ((d66) this.viewModel).m114416q(false);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m184605h0(ConversationCounter conversationCounter) {
        int i = conversationCounter.conversations.addressBookUnseen;
        if (((d66) this.viewModel).m114408e()) {
            CoreModule.f18264c.f20384f0.m33615Cp(pzi0.m174454o());
            i = 0;
        }
        ((d66) this.viewModel).m114413l(i);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
