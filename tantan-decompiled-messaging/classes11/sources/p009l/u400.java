package p009l;

import android.os.Bundle;
import com.p1.mobile.android.app.c;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import p009l.a500;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class u400<T extends a500> extends jq2<T> {
    public u400(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m22740h0(Bundle bundle) {
        m22743g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m22741i0(c cVar) {
        if (cVar == c.i) {
            ((a500) ((jq2) this).viewModel).m11222T();
        } else if (cVar == c.j) {
            ((a500) ((jq2) this).viewModel).m11221S();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m22742a0() {
        super.a0();
        creates(new e30() { // from class: l.s400
            public final void call(Object obj) {
                this.f20088a.m22740h0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.t400
            public final void call(Object obj) {
                this.f20552a.m22741i0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g0 */
    public void m22743g0() {
        ((a500) ((jq2) this).viewModel).m11212E();
        ((a500) ((jq2) this).viewModel).mo11213F();
        ((a500) ((jq2) this).viewModel).m11226X();
        ((a500) ((jq2) this).viewModel).mo11215J();
    }

    public void destroy() {
    }
}
