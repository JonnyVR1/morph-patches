package p007l;

import android.os.Bundle;
import com.p1.mobile.putong.app.PutongAct;
import l.e30;
import l.jq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cj0 extends jq2<dj0> {

    /* JADX INFO: renamed from: a */
    public boolean f6657a;

    /* JADX INFO: renamed from: b */
    public PutongAct f6658b;

    public cj0(PutongAct putongAct) {
        super(putongAct);
        this.f6658b = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m9183g0(Bundle bundle) {
        ((dj0) ((jq2) this).viewModel).m9416r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m9184a0() {
        creates(new e30() { // from class: l.bj0
            public final void call(Object obj) {
                this.f6336a.m9183g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m9185f0() {
        this.f6657a = this.f6658b.getIntent().getBooleanExtra("has_my_group", false);
    }

    public void destroy() {
    }
}
