package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2047a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gwf0 implements a5c {

    /* JADX INFO: renamed from: a */
    public final a5c f104703a;

    /* JADX INFO: renamed from: b */
    public long f104704b;

    /* JADX INFO: renamed from: c */
    public Uri f104705c = Uri.EMPTY;

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> f104706d = Collections.EMPTY_MAP;

    public gwf0(a5c a5cVar) {
        this.f104703a = (a5c) p11.m167011e(a5cVar);
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return this.f104703a.mo11121a();
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: b */
    public Map<String, List<String>> mo11122b() {
        return this.f104703a.mo11122b();
    }

    @Override // p149l.a5c
    public void close() throws IOException {
        this.f104703a.close();
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: e */
    public void mo11123e(l7j0 l7j0Var) {
        p11.m167011e(l7j0Var);
        this.f104703a.mo11123e(l7j0Var);
    }

    /* JADX INFO: renamed from: j */
    public long m128402j() {
        return this.f104704b;
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws IOException {
        this.f104705c = c2047a.f9492a;
        this.f104706d = Collections.EMPTY_MAP;
        long jMo11125n = this.f104703a.mo11125n(c2047a);
        this.f104705c = (Uri) p11.m167011e(mo11121a());
        this.f104706d = mo11122b();
        return jMo11125n;
    }

    /* JADX INFO: renamed from: q */
    public Uri m128403q() {
        return this.f104705c;
    }

    /* JADX INFO: renamed from: r */
    public Map<String, List<String>> m128404r() {
        return this.f104706d;
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f104703a.read(bArr, i, i2);
        if (i3 != -1) {
            this.f104704b += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: s */
    public void m128405s() {
        this.f104704b = 0L;
    }
}
