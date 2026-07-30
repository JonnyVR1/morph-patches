package p153l;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class tuv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f176216a;

    /* JADX INFO: renamed from: b */
    public final Context f176217b;

    public tuv0(xvw0 xvw0Var, Context context) {
        this.f176216a = xvw0Var;
        this.f176217b = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vuv0 m192762a() throws Exception {
        final Bundle bundleM215443b = yer0.m215443b(this.f176217b, (String) jas0.m144075c().m176505a(sgs0.f168299f6));
        if (bundleM215443b.isEmpty()) {
            return null;
        }
        return new vuv0() { // from class: l.suv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", bundleM215443b);
            }
        };
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 37;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f176216a.mo155969R(new Callable() { // from class: l.ruv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f164945a.m192762a();
            }
        });
    }
}
