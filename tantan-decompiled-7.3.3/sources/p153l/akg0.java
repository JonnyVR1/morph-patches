package p153l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class akg0 {

    /* JADX INFO: renamed from: a */
    public final long f72003a;

    /* JADX INFO: renamed from: b */
    public final long f72004b;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f72005c;

    public akg0(long j, long j2, long j3) {
        if (j < 0 || ((j2 < 0 && j2 != -1) || j3 < 0)) {
            fig0.m125680a();
            throw null;
        }
        this.f72003a = j;
        this.f72004b = j2;
        this.f72005c = new AtomicLong(j3);
    }

    public final String toString() {
        return "[" + this.f72003a + ", " + ((this.f72003a + this.f72004b) - 1) + ")-current:" + this.f72005c;
    }
}
