package p153l;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class rp1 {

    /* JADX INFO: renamed from: f */
    private static int f164291f = 30;

    /* JADX INFO: renamed from: a */
    private int f164292a = 65;

    /* JADX INFO: renamed from: b */
    private boolean f164293b = true;

    /* JADX INFO: renamed from: c */
    private long f164294c = -1;

    /* JADX INFO: renamed from: d */
    private long f164295d = 0;

    /* JADX INFO: renamed from: e */
    private List<Long> f164296e = new LinkedList();

    /* JADX INFO: renamed from: a */
    public long m182488a(long j) {
        if (this.f164293b) {
            this.f164293b = false;
            this.f164295d = 0L;
        } else {
            long j2 = j - this.f164294c;
            this.f164296e.add(Long.valueOf(j2));
            this.f164295d += j2;
        }
        this.f164294c = j;
        if (this.f164296e.size() > f164291f) {
            this.f164295d -= this.f164296e.remove(0).longValue();
        }
        if (this.f164296e.size() > 0) {
            return this.f164295d / ((long) this.f164296e.size());
        }
        return 0L;
    }
}
