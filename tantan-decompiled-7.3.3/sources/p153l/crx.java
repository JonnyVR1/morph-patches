package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.upstream.C2070a;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class crx extends o45 {

    /* JADX INFO: renamed from: j */
    public final long f83373j;

    public crx(g6c g6cVar, C2070a c2070a, C1894k c1894k, int i, @Nullable Object obj, long j, long j2, long j3) {
        super(g6cVar, c2070a, 1, c1894k, i, obj, j, j2);
        w11.m204369e(c1894k);
        this.f83373j = j3;
    }

    /* JADX INFO: renamed from: g */
    public long mo112089g() {
        long j = this.f83373j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo112090h();
}
