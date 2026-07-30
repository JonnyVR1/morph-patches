package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import p153l.pd00;

/* JADX INFO: loaded from: classes10.dex */
public class jd00<T extends pd00> extends ar2<T> {
    public jd00(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m144399h0(Bundle bundle) {
        m144401g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m144400i0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            ((pd00) this.viewModel).m171734T();
        } else if (c4470c == C4470c.f16268j) {
            ((pd00) this.viewModel).m171733S();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.hd00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108770a.m144399h0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.id00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114461a.m144400i0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g0 */
    public void m144401g0() {
        ((pd00) this.viewModel).mo171724E();
        ((pd00) this.viewModel).mo171725F();
        ((pd00) this.viewModel).m171738X();
        ((pd00) this.viewModel).mo171727J();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
