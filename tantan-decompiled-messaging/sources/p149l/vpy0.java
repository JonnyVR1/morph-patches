package p149l;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class vpy0 {

    /* JADX INFO: renamed from: d */
    public static final AtomicLong f182550d = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final uax0 f182551a;

    /* JADX INFO: renamed from: b */
    public final Uri f182552b;

    /* JADX INFO: renamed from: c */
    public final Map f182553c;

    public vpy0(long j, uax0 uax0Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.f182551a = uax0Var;
        this.f182552b = uri;
        this.f182553c = map;
    }

    /* JADX INFO: renamed from: a */
    public static long m199391a() {
        return f182550d.getAndIncrement();
    }
}
