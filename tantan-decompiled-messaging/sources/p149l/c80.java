package p149l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class c80 {

    /* JADX INFO: renamed from: a */
    public final long f79670a;

    /* JADX INFO: renamed from: b */
    public final int f79671b;

    /* JADX INFO: renamed from: c */
    public final List<otc0> f79672c;

    /* JADX INFO: renamed from: d */
    public final List<fud> f79673d;

    /* JADX INFO: renamed from: e */
    public final List<fud> f79674e;

    /* JADX INFO: renamed from: f */
    public final List<fud> f79675f;

    public c80(long j, int i, List<otc0> list, List<fud> list2, List<fud> list3, List<fud> list4) {
        this.f79670a = j;
        this.f79671b = i;
        this.f79672c = Collections.unmodifiableList(list);
        this.f79673d = Collections.unmodifiableList(list2);
        this.f79674e = Collections.unmodifiableList(list3);
        this.f79675f = Collections.unmodifiableList(list4);
    }
}
