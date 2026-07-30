package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class pgv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final ttv0 f148832a;

    public pgv0(@Nullable ttv0 ttv0Var) {
        this.f148832a = ttv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m168916a(Bundle bundle) {
        bundle.putString("key_schema", this.f148832a.m190624a());
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 15;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        ttv0 ttv0Var = this.f148832a;
        plv0 plv0Var = null;
        if (ttv0Var != null && ttv0Var.m190624a() != null && !ttv0Var.m190624a().isEmpty()) {
            plv0Var = new plv0() { // from class: l.ogv0
                @Override // p149l.plv0
                /* JADX INFO: renamed from: a */
                public final void mo96132a(Object obj) {
                    this.f143922a.m168916a((Bundle) obj);
                }
            };
        }
        return jmw0.m142235h(plv0Var);
    }
}
