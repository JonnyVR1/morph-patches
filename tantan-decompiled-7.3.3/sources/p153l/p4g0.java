package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2070a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class p4g0 implements g6c {

    /* JADX INFO: renamed from: a */
    public final g6c f150533a;

    /* JADX INFO: renamed from: b */
    public long f150534b;

    /* JADX INFO: renamed from: c */
    public Uri f150535c = Uri.EMPTY;

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> f150536d = Collections.EMPTY_MAP;

    public p4g0(g6c g6cVar) {
        this.f150533a = (g6c) w11.m204369e(g6cVar);
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: a */
    public Map<String, List<String>> mo11175a() {
        return this.f150533a.mo11175a();
    }

    @Override // p153l.g6c
    public void close() throws IOException {
        this.f150533a.close();
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return this.f150533a.mo11176d();
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: e */
    public void mo11177e(pgj0 pgj0Var) {
        w11.m204369e(pgj0Var);
        this.f150533a.mo11177e(pgj0Var);
    }

    /* JADX INFO: renamed from: j */
    public long m170565j() {
        return this.f150534b;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws IOException {
        this.f150535c = c2070a.f9529a;
        this.f150536d = Collections.EMPTY_MAP;
        long jMo11179n = this.f150533a.mo11179n(c2070a);
        this.f150535c = (Uri) w11.m204369e(mo11176d());
        this.f150536d = mo11175a();
        return jMo11179n;
    }

    /* JADX INFO: renamed from: q */
    public Uri m170566q() {
        return this.f150535c;
    }

    /* JADX INFO: renamed from: r */
    public Map<String, List<String>> m170567r() {
        return this.f150536d;
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f150533a.read(bArr, i, i2);
        if (i3 != -1) {
            this.f150534b += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: s */
    public void m170568s() {
        this.f150534b = 0L;
    }
}
