package p153l;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class rnv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final hpr f164110a;

    /* JADX INFO: renamed from: b */
    public final Executor f164111b;

    public rnv0(hpr hprVar, Executor executor) {
        this.f164110a = hprVar;
        this.f164111b = executor;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 6;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173987n(this.f164110a, new xuw0() { // from class: l.qnv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                final String str = (String) obj;
                return pvw0.m173981h(new vuv0() { // from class: l.pnv0
                    @Override // p153l.vuv0
                    /* JADX INFO: renamed from: a */
                    public final void mo99378a(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.f164111b);
    }
}
