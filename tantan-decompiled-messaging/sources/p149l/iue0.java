package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class iue0 extends jq2<uue0> {

    /* JADX INFO: renamed from: a */
    public String f115010a;

    public iue0(mcr mcrVar) {
        super(mcrVar);
        this.f115010a = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m138389f0(Bundle bundle) {
        ((uue0) this.viewModel).m195347A3(this.f115010a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f115010a = act().getIntent().getStringExtra("userId");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.hue0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109560a.m138389f0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
