package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes12.dex */
public class cj0 extends jq2<dj0> {

    /* JADX INFO: renamed from: a */
    public boolean f81127a;

    /* JADX INFO: renamed from: b */
    public PutongAct f81128b;

    public cj0(PutongAct putongAct) {
        super(putongAct);
        this.f81128b = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m107103g0(Bundle bundle) {
        ((dj0) this.viewModel).m111967r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.bj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75852a.m107103g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m107104f0() {
        this.f81127a = this.f81128b.getIntent().getBooleanExtra("has_my_group", false);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
