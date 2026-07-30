package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.Loader;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class n35 implements Loader.InterfaceC2044e {

    /* JADX INFO: renamed from: a */
    public final long f136911a = lrv.m151512a();

    /* JADX INFO: renamed from: b */
    public final C2047a f136912b;

    /* JADX INFO: renamed from: c */
    public final int f136913c;

    /* JADX INFO: renamed from: d */
    public final C1871k f136914d;

    /* JADX INFO: renamed from: e */
    public final int f136915e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Object f136916f;

    /* JADX INFO: renamed from: g */
    public final long f136917g;

    /* JADX INFO: renamed from: h */
    public final long f136918h;

    /* JADX INFO: renamed from: i */
    public final gwf0 f136919i;

    public n35(a5c a5cVar, C2047a c2047a, int i, C1871k c1871k, int i2, @Nullable Object obj, long j, long j2) {
        this.f136919i = new gwf0(a5cVar);
        this.f136912b = (C2047a) p11.m167011e(c2047a);
        this.f136913c = i;
        this.f136914d = c1871k;
        this.f136915e = i2;
        this.f136916f = obj;
        this.f136917g = j;
        this.f136918h = j2;
    }

    /* JADX INFO: renamed from: b */
    public final long m157724b() {
        return this.f136919i.m128402j();
    }

    /* JADX INFO: renamed from: d */
    public final long m157725d() {
        return this.f136918h - this.f136917g;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, List<String>> m157726e() {
        return this.f136919i.m128404r();
    }

    /* JADX INFO: renamed from: f */
    public final Uri m157727f() {
        return this.f136919i.m128403q();
    }
}
