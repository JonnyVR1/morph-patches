package p153l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class teh extends ar2<zeh> {
    public teh(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m190705f0(Bundle bundle) {
        ((zeh) this.viewModel).m219475j((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.seh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167614a.m190705f0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
