package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.data.AuthData;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class iai extends jq2<mai> {
    public iai(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m10851k0(Bundle bundle) {
        ((mai) ((jq2) this).viewModel).m11903x();
        ((mai) ((jq2) this).viewModel).m11887J();
        ((mai) ((jq2) this).viewModel).m11905z(null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m10852a0() {
        super.a0();
        creates(new e30() { // from class: l.fai
            public final void call(Object obj) {
                this.f8056a.m10851k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m10853h0() {
        duringCreated(qib0.c0.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.gai
            public final void call(Object obj) {
                this.f8411a.m10854i0((AuthData) obj);
            }
        }, new e30() { // from class: l.hai
            public final void call(Object obj) {
                this.f8662a.m10855j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m10854i0(AuthData authData) {
        ((mai) ((jq2) this).viewModel).m11886I(authData);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m10855j0(Throwable th) {
        ((mai) ((jq2) this).viewModel).m11885H(th);
    }

    public void destroy() {
    }
}
