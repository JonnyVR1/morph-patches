package p149l;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class kp1 {

    /* JADX INFO: renamed from: f */
    private static int f124085f = 30;

    /* JADX INFO: renamed from: a */
    private int f124086a = 65;

    /* JADX INFO: renamed from: b */
    private boolean f124087b = true;

    /* JADX INFO: renamed from: c */
    private long f124088c = -1;

    /* JADX INFO: renamed from: d */
    private long f124089d = 0;

    /* JADX INFO: renamed from: e */
    private List<Long> f124090e = new LinkedList();

    /* JADX INFO: renamed from: a */
    public long m146803a(long j) {
        if (this.f124087b) {
            this.f124087b = false;
            this.f124089d = 0L;
        } else {
            long j2 = j - this.f124088c;
            this.f124090e.add(Long.valueOf(j2));
            this.f124089d += j2;
        }
        this.f124088c = j;
        if (this.f124090e.size() > f124085f) {
            this.f124089d -= this.f124090e.remove(0).longValue();
        }
        if (this.f124090e.size() > 0) {
            return this.f124089d / ((long) this.f124090e.size());
        }
        return 0L;
    }
}
