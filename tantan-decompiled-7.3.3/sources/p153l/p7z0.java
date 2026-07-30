package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdl;

/* JADX INFO: loaded from: classes6.dex */
public final class p7z0 implements ycr0 {

    /* JADX INFO: renamed from: a */
    public final Context f150978a;

    /* JADX INFO: renamed from: b */
    public final cbr0 f150979b;

    public p7z0(Context context, cbr0 cbr0Var, drt0 drt0Var) throws zzdl {
        this.f150978a = context;
        this.f150979b = cbr0Var;
        int i = mpw0.f137957a;
        if (i >= 29 && context.getApplicationInfo().targetSdkVersion >= 29 && i == 30) {
            String str = mpw0.f137960d;
            if (!wnw0.m207230c(str, "moto g(20)")) {
                wnw0.m207230c(str, "rmx3231");
            }
        }
        throw null;
    }
}
