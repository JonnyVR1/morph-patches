package p149l;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class kzt0 extends e4u0 implements ses0 {

    /* JADX INFO: renamed from: b */
    public final Bundle f125420b;

    public kzt0(Set set) {
        super(set);
        this.f125420b = new Bundle();
    }

    @Override // p149l.ses0
    /* JADX INFO: renamed from: K */
    public final synchronized void mo147952K(String str, Bundle bundle) {
        this.f125420b.putAll(bundle);
        m114712v0(new d4u0() { // from class: l.jzt0
            @Override // p149l.d4u0
            public final void zza(Object obj) {
                ((zc50) obj).mo128651x();
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized Bundle m147953w0() {
        return new Bundle(this.f125420b);
    }
}
