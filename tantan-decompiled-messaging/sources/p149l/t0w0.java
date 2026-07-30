package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfiz;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class t0w0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f167214a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final s0w0 m186877a(zzfiz zzfizVar, Context context, xzv0 xzv0Var, z0w0 z0w0Var) {
        s0w0 s0w0Var = (s0w0) this.f167214a.get(zzfizVar);
        if (s0w0Var != null) {
            return s0w0Var;
        }
        c0w0 c0w0Var = new c0w0(zzfjc.m13748g(zzfizVar, context));
        s0w0 s0w0Var2 = new s0w0(c0w0Var, new b1w0(c0w0Var, xzv0Var, z0w0Var));
        this.f167214a.put(zzfizVar, s0w0Var2);
        return s0w0Var2;
    }
}
