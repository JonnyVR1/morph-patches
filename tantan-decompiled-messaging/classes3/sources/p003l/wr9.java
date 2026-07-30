package p003l;

import android.os.Bundle;
import java.util.ArrayList;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class wr9 extends jq2<yr9> {
    public wr9(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m8576f0(Bundle bundle) {
        ((yr9) ((jq2) this).viewModel).m9223d((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    /* JADX INFO: renamed from: a0 */
    public void m8577a0() {
        creates(new e30() { // from class: l.vr9
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8401a.m8576f0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
