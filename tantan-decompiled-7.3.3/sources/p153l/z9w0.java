package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfiz;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class z9w0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f203521a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final y9w0 m219088a(zzfiz zzfizVar, Context context, d9w0 d9w0Var, faw0 faw0Var) {
        y9w0 y9w0Var = (y9w0) this.f203521a.get(zzfizVar);
        if (y9w0Var != null) {
            return y9w0Var;
        }
        i9w0 i9w0Var = new i9w0(zzfjc.m13802g(zzfizVar, context));
        y9w0 y9w0Var2 = new y9w0(i9w0Var, new haw0(i9w0Var, d9w0Var, faw0Var));
        this.f203521a.put(zzfizVar, y9w0Var2);
        return y9w0Var2;
    }
}
