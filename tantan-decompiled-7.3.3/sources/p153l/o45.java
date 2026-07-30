package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.exoplayer2.upstream.Loader;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class o45 implements Loader.InterfaceC2067e {

    /* JADX INFO: renamed from: a */
    public final long f144926a = mtv.m160053a();

    /* JADX INFO: renamed from: b */
    public final C2070a f144927b;

    /* JADX INFO: renamed from: c */
    public final int f144928c;

    /* JADX INFO: renamed from: d */
    public final C1894k f144929d;

    /* JADX INFO: renamed from: e */
    public final int f144930e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Object f144931f;

    /* JADX INFO: renamed from: g */
    public final long f144932g;

    /* JADX INFO: renamed from: h */
    public final long f144933h;

    /* JADX INFO: renamed from: i */
    public final p4g0 f144934i;

    public o45(g6c g6cVar, C2070a c2070a, int i, C1894k c1894k, int i2, @Nullable Object obj, long j, long j2) {
        this.f144934i = new p4g0(g6cVar);
        this.f144927b = (C2070a) w11.m204369e(c2070a);
        this.f144928c = i;
        this.f144929d = c1894k;
        this.f144930e = i2;
        this.f144931f = obj;
        this.f144932g = j;
        this.f144933h = j2;
    }

    /* JADX INFO: renamed from: b */
    public final long m165969b() {
        return this.f144934i.m170565j();
    }

    /* JADX INFO: renamed from: d */
    public final long m165970d() {
        return this.f144933h - this.f144932g;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, List<String>> m165971e() {
        return this.f144934i.m170567r();
    }

    /* JADX INFO: renamed from: f */
    public final Uri m165972f() {
        return this.f144934i.m170566q();
    }
}
