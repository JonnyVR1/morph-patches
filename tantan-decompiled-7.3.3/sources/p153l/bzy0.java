package p153l;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class bzy0 {

    /* JADX INFO: renamed from: d */
    public static final AtomicLong f79185d = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final akx0 f79186a;

    /* JADX INFO: renamed from: b */
    public final Uri f79187b;

    /* JADX INFO: renamed from: c */
    public final Map f79188c;

    public bzy0(long j, akx0 akx0Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.f79186a = akx0Var;
        this.f79187b = uri;
        this.f79188c = map;
    }

    /* JADX INFO: renamed from: a */
    public static long m107273a() {
        return f79185d.getAndIncrement();
    }
}
