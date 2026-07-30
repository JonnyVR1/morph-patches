package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class puv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f154249a;

    public puv0(@Nullable c4w0 c4w0Var) {
        this.f154249a = c4w0Var != null;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 36;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173981h(this.f154249a ? new vuv0() { // from class: l.ouv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
