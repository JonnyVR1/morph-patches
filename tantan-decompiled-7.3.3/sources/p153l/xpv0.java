package p153l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class xpv0 {

    /* JADX INFO: renamed from: a */
    public final hpr f195746a;

    /* JADX INFO: renamed from: b */
    public final long f195747b;

    /* JADX INFO: renamed from: c */
    public final Clock f195748c;

    public xpv0(hpr hprVar, long j, Clock clock) {
        this.f195746a = hprVar;
        this.f195748c = clock;
        this.f195747b = clock.elapsedRealtime() + j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m212684a() {
        return this.f195747b < this.f195748c.elapsedRealtime();
    }
}
