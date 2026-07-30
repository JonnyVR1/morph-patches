package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class p2f0 extends ar2<b3f0> {

    /* JADX INFO: renamed from: a */
    public String f150263a;

    public p2f0(ner nerVar) {
        super(nerVar);
        this.f150263a = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m170349f0(Bundle bundle) {
        ((b3f0) this.viewModel).m102306A3(this.f150263a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f150263a = act().getIntent().getStringExtra("userId");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.o2f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144741a.m170349f0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
