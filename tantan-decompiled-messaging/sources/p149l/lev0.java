package p149l;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class lev0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final gnr f127755a;

    /* JADX INFO: renamed from: b */
    public final Executor f127756b;

    public lev0(gnr gnrVar, Executor executor) {
        this.f127755a = gnrVar;
        this.f127756b = executor;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 6;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142241n(this.f127755a, new rlw0() { // from class: l.kev0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                final String str = (String) obj;
                return jmw0.m142235h(new plv0() { // from class: l.jev0
                    @Override // p149l.plv0
                    /* JADX INFO: renamed from: a */
                    public final void mo96132a(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.f127756b);
    }
}
