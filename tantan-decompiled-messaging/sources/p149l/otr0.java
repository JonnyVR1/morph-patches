package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.C2120d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class otr0 extends ntr0 {
    public otr0(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* JADX INFO: renamed from: x */
    public static otr0 m165968x(String str, Context context, boolean z) {
        ntr0.m161406t(context, false);
        return new otr0(context, str, false);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static otr0 m165969y(String str, Context context, boolean z, int i) {
        ntr0.m161406t(context, z);
        return new otr0(context, str, z);
    }

    @Override // p149l.ntr0
    /* JADX INFO: renamed from: r */
    public final List mo161409r(vur0 vur0Var, Context context, zpr0 zpr0Var, C2120d c2120d) {
        if (vur0Var.m200109k() == null || !this.f140524v) {
            return super.mo161409r(vur0Var, context, zpr0Var, null);
        }
        int iM200100a = vur0Var.m200100a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo161409r(vur0Var, context, zpr0Var, null));
        arrayList.add(new vvr0(vur0Var, "8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", zpr0Var, iM200100a, 24));
        return arrayList;
    }
}
