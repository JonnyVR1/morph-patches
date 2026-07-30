package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.upstream.C2047a;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class fix extends n35 {

    /* JADX INFO: renamed from: j */
    public final long f97730j;

    public fix(a5c a5cVar, C2047a c2047a, C1871k c1871k, int i, @Nullable Object obj, long j, long j2, long j3) {
        super(a5cVar, c2047a, 1, c1871k, i, obj, j, j2);
        p11.m167011e(c1871k);
        this.f97730j = j3;
    }

    /* JADX INFO: renamed from: g */
    public long mo121564g() {
        long j = this.f97730j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo111872h();
}
