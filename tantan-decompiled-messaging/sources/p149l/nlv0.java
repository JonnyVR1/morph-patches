package p149l;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class nlv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f139588a;

    /* JADX INFO: renamed from: b */
    public final Context f139589b;

    public nlv0(rmw0 rmw0Var, Context context) {
        this.f139588a = rmw0Var;
        this.f139589b = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ plv0 m160076a() throws Exception {
        final Bundle bundleM182372b = s5r0.m182372b(this.f139589b, (String) d1s0.m109677c().m144697a(m7s0.f132228f6));
        if (bundleM182372b.isEmpty()) {
            return null;
        }
        return new plv0() { // from class: l.mlv0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", bundleM182372b);
            }
        };
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 37;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f139588a.mo122102R(new Callable() { // from class: l.llv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f128756a.m160076a();
            }
        });
    }
}
