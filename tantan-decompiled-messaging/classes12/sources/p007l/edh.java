package p007l;

import android.os.Bundle;
import java.util.ArrayList;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class edh extends jq2<kdh> {
    public edh(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m9812f0(Bundle bundle) {
        ((kdh) ((jq2) this).viewModel).m11417j((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    /* JADX INFO: renamed from: a0 */
    public void m9813a0() {
        creates(new e30() { // from class: l.ddh
            public final void call(Object obj) {
                this.f6899a.m9812f0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
