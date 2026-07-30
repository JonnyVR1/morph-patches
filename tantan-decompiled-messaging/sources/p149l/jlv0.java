package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class jlv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f118594a;

    public jlv0(@Nullable wuv0 wuv0Var) {
        this.f118594a = wuv0Var != null;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 36;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142235h(this.f118594a ? new plv0() { // from class: l.ilv0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
