package p153l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class xiy0 {

    /* JADX INFO: renamed from: a */
    public final Clock f194527a;

    /* JADX INFO: renamed from: b */
    public long f194528b;

    public xiy0(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f194527a = clock;
    }

    /* JADX INFO: renamed from: a */
    public final void m211180a() {
        this.f194528b = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m211181b(long j) {
        return this.f194528b == 0 || this.f194527a.elapsedRealtime() - this.f194528b >= 3600000;
    }

    /* JADX INFO: renamed from: c */
    public final void m211182c() {
        this.f194528b = this.f194527a.elapsedRealtime();
    }
}
