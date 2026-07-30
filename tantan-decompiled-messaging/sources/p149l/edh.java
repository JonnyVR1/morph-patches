package p149l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class edh extends jq2<kdh> {
    public edh(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m115808f0(Bundle bundle) {
        ((kdh) this.viewModel).m145636j((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ddh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85599a.m115808f0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
