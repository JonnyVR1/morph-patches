package p007l;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class kp1 {

    /* JADX INFO: renamed from: f */
    private static int f3078f = 30;

    /* JADX INFO: renamed from: a */
    private int f3079a = 65;

    /* JADX INFO: renamed from: b */
    private boolean f3080b = true;

    /* JADX INFO: renamed from: c */
    private long f3081c = -1;

    /* JADX INFO: renamed from: d */
    private long f3082d = 0;

    /* JADX INFO: renamed from: e */
    private List<Long> f3083e = new LinkedList();

    /* JADX INFO: renamed from: a */
    public long m9610a(long j) {
        if (this.f3080b) {
            this.f3080b = false;
            this.f3082d = 0L;
        } else {
            long j2 = j - this.f3081c;
            this.f3083e.add(Long.valueOf(j2));
            this.f3082d += j2;
        }
        this.f3081c = j;
        if (this.f3083e.size() > f3078f) {
            this.f3082d -= this.f3083e.remove(0).longValue();
        }
        if (this.f3083e.size() > 0) {
            return this.f3082d / ((long) this.f3083e.size());
        }
        return 0L;
    }
}
