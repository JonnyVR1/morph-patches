package p149l;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class hj60 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f108036a;

    /* JADX INFO: renamed from: b */
    public final long f108037b;

    /* JADX INFO: renamed from: c */
    public final List<c80> f108038c;

    /* JADX INFO: renamed from: d */
    public final List<w4f> f108039d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final fud f108040e;

    public hj60(@Nullable String str, long j, List<c80> list, List<w4f> list2, @Nullable fud fudVar) {
        this.f108036a = str;
        this.f108037b = j;
        this.f108038c = Collections.unmodifiableList(list);
        this.f108039d = Collections.unmodifiableList(list2);
        this.f108040e = fudVar;
    }

    /* JADX INFO: renamed from: a */
    public int m131354a(int i) {
        int size = this.f108038c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f108038c.get(i2).f79671b == i) {
                return i2;
            }
        }
        return -1;
    }

    public hj60(@Nullable String str, long j, List<c80> list, List<w4f> list2) {
        this(str, j, list, list2, null);
    }
}
