package p153l;

import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ksy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Exception f128639a;

    /* JADX INFO: renamed from: b */
    public long f128640b;

    public ksy0(long j) {
    }

    /* JADX INFO: renamed from: a */
    public final void m151311a() {
        this.f128639a = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m151312b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f128639a == null) {
            this.f128639a = exc;
            this.f128640b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f128640b) {
            Exception exc2 = this.f128639a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f128639a;
            this.f128639a = null;
            throw exc3;
        }
    }
}
