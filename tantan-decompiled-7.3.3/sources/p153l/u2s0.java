package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.C2143d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class u2s0 extends t2s0 {
    public u2s0(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* JADX INFO: renamed from: x */
    public static u2s0 m194300x(String str, Context context, boolean z) {
        t2s0.m188980t(context, false);
        return new u2s0(context, str, false);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static u2s0 m194301y(String str, Context context, boolean z, int i) {
        t2s0.m188980t(context, z);
        return new u2s0(context, str, z);
    }

    @Override // p153l.t2s0
    /* JADX INFO: renamed from: r */
    public final List mo188983r(b4s0 b4s0Var, Context context, fzr0 fzr0Var, C2143d c2143d) {
        if (b4s0Var.m102525k() == null || !this.f171797v) {
            return super.mo188983r(b4s0Var, context, fzr0Var, null);
        }
        int iM102516a = b4s0Var.m102516a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo188983r(b4s0Var, context, fzr0Var, null));
        arrayList.add(new b5s0(b4s0Var, "8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", fzr0Var, iM102516a, 24));
        return arrayList;
    }
}
