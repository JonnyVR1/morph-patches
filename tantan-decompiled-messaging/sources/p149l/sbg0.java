package p149l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class sbg0 {

    /* JADX INFO: renamed from: a */
    public final long f163534a;

    /* JADX INFO: renamed from: b */
    public final long f163535b;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f163536c;

    public sbg0(long j, long j2, long j3) {
        if (j < 0 || ((j2 < 0 && j2 != -1) || j3 < 0)) {
            x9g0.m207497a();
            throw null;
        }
        this.f163534a = j;
        this.f163535b = j2;
        this.f163536c = new AtomicLong(j3);
    }

    public final String toString() {
        return "[" + this.f163534a + ", " + ((this.f163534a + this.f163535b) - 1) + ")-current:" + this.f163536c;
    }
}
