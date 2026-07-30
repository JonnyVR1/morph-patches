package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdl;

/* JADX INFO: loaded from: classes6.dex */
public final class jyy0 implements s3r0 {

    /* JADX INFO: renamed from: a */
    public final Context f120338a;

    /* JADX INFO: renamed from: b */
    public final w1r0 f120339b;

    public jyy0(Context context, w1r0 w1r0Var, xht0 xht0Var) throws zzdl {
        this.f120338a = context;
        this.f120339b = w1r0Var;
        int i = ggw0.f102568a;
        if (i >= 29 && context.getApplicationInfo().targetSdkVersion >= 29 && i == 30) {
            String str = ggw0.f102571d;
            if (!qew0.m174259c(str, "moto g(20)")) {
                qew0.m174259c(str, "rmx3231");
            }
        }
        throw null;
    }
}
