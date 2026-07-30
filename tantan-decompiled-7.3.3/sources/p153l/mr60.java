package p153l;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class mr60 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f138300a;

    /* JADX INFO: renamed from: b */
    public final long f138301b;

    /* JADX INFO: renamed from: c */
    public final List<y70> f138302c;

    /* JADX INFO: renamed from: d */
    public final List<a6f> f138303d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final tvd f138304e;

    public mr60(@Nullable String str, long j, List<y70> list, List<a6f> list2, @Nullable tvd tvdVar) {
        this.f138300a = str;
        this.f138301b = j;
        this.f138302c = Collections.unmodifiableList(list);
        this.f138303d = Collections.unmodifiableList(list2);
        this.f138304e = tvdVar;
    }

    /* JADX INFO: renamed from: a */
    public int m159622a(int i) {
        int size = this.f138302c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f138302c.get(i2).f197728b == i) {
                return i2;
            }
        }
        return -1;
    }

    public mr60(@Nullable String str, long j, List<y70> list, List<a6f> list2) {
        this(str, j, list, list2, null);
    }
}
