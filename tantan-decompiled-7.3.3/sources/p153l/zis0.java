package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zis0 {

    /* JADX INFO: renamed from: i */
    public static final String f204602i = Integer.toString(0, 36);

    /* JADX INFO: renamed from: j */
    public static final String f204603j = Integer.toString(1, 36);

    /* JADX INFO: renamed from: k */
    public static final String f204604k = Integer.toString(2, 36);

    /* JADX INFO: renamed from: l */
    public static final String f204605l = Integer.toString(3, 36);

    /* JADX INFO: renamed from: m */
    public static final String f204606m = Integer.toString(4, 36);

    /* JADX INFO: renamed from: n */
    public static final String f204607n = Integer.toString(5, 36);

    /* JADX INFO: renamed from: o */
    public static final String f204608o = Integer.toString(6, 36);

    /* JADX INFO: renamed from: p */
    public static final String f204609p = Integer.toString(7, 36);

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final mhy0 f204610q = new mhy0() { // from class: l.kgs0
    };

    /* JADX INFO: renamed from: a */
    public final Uri f204611a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f204612b;

    /* JADX INFO: renamed from: c */
    public final List f204613c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f204614d;

    /* JADX INFO: renamed from: e */
    public final zzgaa f204615e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final List f204616f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final Object f204617g;

    /* JADX INFO: renamed from: h */
    public final long f204618h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zis0(Uri uri, String str, jbs0 jbs0Var, bwr0 bwr0Var, List list, String str2, zzgaa zzgaaVar, Object obj, long j, rhs0 rhs0Var) {
        this.f204611a = uri;
        ArrayList arrayList = a8t0.f68959a;
        this.f204612b = null;
        this.f204613c = list;
        this.f204614d = null;
        this.f204615e = zzgaaVar;
        mqw0 mqw0Var = new mqw0();
        if (zzgaaVar.size() > 0) {
            throw null;
        }
        this.f204616f = mqw0Var.m159616j();
        this.f204617g = null;
        this.f204618h = -9223372036854775807L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zis0)) {
            return false;
        }
        zis0 zis0Var = (zis0) obj;
        return this.f204611a.equals(zis0Var.f204611a) && mpw0.m159408f(null, null) && mpw0.m159408f(null, null) && mpw0.m159408f(null, null) && this.f204613c.equals(zis0Var.f204613c) && mpw0.m159408f(null, null) && this.f204615e.equals(zis0Var.f204615e) && mpw0.m159408f(null, null) && mpw0.m159408f(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.f204611a.hashCode() * 923521) + this.f204613c.hashCode()) * 961) + this.f204615e.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
