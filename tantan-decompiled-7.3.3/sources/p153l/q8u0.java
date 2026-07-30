package p153l;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q8u0 extends kdu0 implements yns0 {

    /* JADX INFO: renamed from: b */
    public final Bundle f156164b;

    public q8u0(Set set) {
        super(set);
        this.f156164b = new Bundle();
    }

    @Override // p153l.yns0
    /* JADX INFO: renamed from: K */
    public final synchronized void mo117708K(String str, Bundle bundle) {
        this.f156164b.putAll(bundle);
        m149285v0(new jdu0() { // from class: l.p8u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((gl50) obj).mo124324x();
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized Bundle m175826w0() {
        return new Bundle(this.f156164b);
    }
}
