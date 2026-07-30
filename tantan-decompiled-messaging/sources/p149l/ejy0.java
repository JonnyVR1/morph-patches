package p149l;

import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ejy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Exception f91918a;

    /* JADX INFO: renamed from: b */
    public long f91919b;

    public ejy0(long j) {
    }

    /* JADX INFO: renamed from: a */
    public final void m116908a() {
        this.f91918a = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m116909b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f91918a == null) {
            this.f91918a = exc;
            this.f91919b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f91919b) {
            Exception exc2 = this.f91918a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f91918a;
            this.f91918a = null;
            throw exc3;
        }
    }
}
