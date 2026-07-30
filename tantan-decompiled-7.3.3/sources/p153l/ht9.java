package p153l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ht9 extends ar2<jt9> {
    public ht9(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m137068f0(Bundle bundle) {
        ((jt9) this.viewModel).m146893d((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.gt9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106391a.m137068f0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
