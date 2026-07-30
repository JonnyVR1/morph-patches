package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class t9s0 {

    /* JADX INFO: renamed from: i */
    public static final String f169053i = Integer.toString(0, 36);

    /* JADX INFO: renamed from: j */
    public static final String f169054j = Integer.toString(1, 36);

    /* JADX INFO: renamed from: k */
    public static final String f169055k = Integer.toString(2, 36);

    /* JADX INFO: renamed from: l */
    public static final String f169056l = Integer.toString(3, 36);

    /* JADX INFO: renamed from: m */
    public static final String f169057m = Integer.toString(4, 36);

    /* JADX INFO: renamed from: n */
    public static final String f169058n = Integer.toString(5, 36);

    /* JADX INFO: renamed from: o */
    public static final String f169059o = Integer.toString(6, 36);

    /* JADX INFO: renamed from: p */
    public static final String f169060p = Integer.toString(7, 36);

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final g8y0 f169061q = new g8y0() { // from class: l.e7s0
    };

    /* JADX INFO: renamed from: a */
    public final Uri f169062a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f169063b;

    /* JADX INFO: renamed from: c */
    public final List f169064c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f169065d;

    /* JADX INFO: renamed from: e */
    public final zzgaa f169066e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final List f169067f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final Object f169068g;

    /* JADX INFO: renamed from: h */
    public final long f169069h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t9s0(Uri uri, String str, d2s0 d2s0Var, vmr0 vmr0Var, List list, String str2, zzgaa zzgaaVar, Object obj, long j, l8s0 l8s0Var) {
        this.f169062a = uri;
        ArrayList arrayList = uys0.f178911a;
        this.f169063b = null;
        this.f169064c = list;
        this.f169065d = null;
        this.f169066e = zzgaaVar;
        ghw0 ghw0Var = new ghw0();
        if (zzgaaVar.size() > 0) {
            throw null;
        }
        this.f169067f = ghw0Var.m126243j();
        this.f169068g = null;
        this.f169069h = -9223372036854775807L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9s0)) {
            return false;
        }
        t9s0 t9s0Var = (t9s0) obj;
        return this.f169062a.equals(t9s0Var.f169062a) && ggw0.m126064f(null, null) && ggw0.m126064f(null, null) && ggw0.m126064f(null, null) && this.f169064c.equals(t9s0Var.f169064c) && ggw0.m126064f(null, null) && this.f169066e.equals(t9s0Var.f169066e) && ggw0.m126064f(null, null) && ggw0.m126064f(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.f169062a.hashCode() * 923521) + this.f169064c.hashCode()) * 961) + this.f169066e.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
