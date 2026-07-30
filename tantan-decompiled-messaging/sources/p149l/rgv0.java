package p149l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class rgv0 {

    /* JADX INFO: renamed from: a */
    public final gnr f159295a;

    /* JADX INFO: renamed from: b */
    public final long f159296b;

    /* JADX INFO: renamed from: c */
    public final Clock f159297c;

    public rgv0(gnr gnrVar, long j, Clock clock) {
        this.f159295a = gnrVar;
        this.f159297c = clock;
        this.f159296b = clock.elapsedRealtime() + j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m179265a() {
        return this.f159296b < this.f159297c.elapsedRealtime();
    }
}
