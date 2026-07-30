package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class vpv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final z2w0 f185309a;

    public vpv0(@Nullable z2w0 z2w0Var) {
        this.f185309a = z2w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m202345a(Bundle bundle) {
        bundle.putString("key_schema", this.f185309a.m218465a());
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 15;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        z2w0 z2w0Var = this.f185309a;
        vuv0 vuv0Var = null;
        if (z2w0Var != null && z2w0Var.m218465a() != null && !z2w0Var.m218465a().isEmpty()) {
            vuv0Var = new vuv0() { // from class: l.upv0
                @Override // p153l.vuv0
                /* JADX INFO: renamed from: a */
                public final void mo99378a(Object obj) {
                    this.f180330a.m202345a((Bundle) obj);
                }
            };
        }
        return pvw0.m173981h(vuv0Var);
    }
}
