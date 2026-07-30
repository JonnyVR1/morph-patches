package p149l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class r9y0 {

    /* JADX INFO: renamed from: a */
    public final Clock f158460a;

    /* JADX INFO: renamed from: b */
    public long f158461b;

    public r9y0(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f158460a = clock;
    }

    /* JADX INFO: renamed from: a */
    public final void m178466a() {
        this.f158461b = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m178467b(long j) {
        return this.f158461b == 0 || this.f158460a.elapsedRealtime() - this.f158461b >= 3600000;
    }

    /* JADX INFO: renamed from: c */
    public final void m178468c() {
        this.f158461b = this.f158460a.elapsedRealtime();
    }
}
