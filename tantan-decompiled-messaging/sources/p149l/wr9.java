package p149l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class wr9 extends jq2<yr9> {
    public wr9(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m205168f0(Bundle bundle) {
        ((yr9) this.viewModel).m215832d((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.vr9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182706a.m205168f0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
