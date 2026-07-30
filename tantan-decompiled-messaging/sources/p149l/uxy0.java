package p149l;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class uxy0 {

    /* JADX INFO: renamed from: d */
    public static final pxy0 f178783d = new pxy0(0, -9223372036854775807L, null);

    /* JADX INFO: renamed from: e */
    public static final pxy0 f178784e = new pxy0(1, -9223372036854775807L, null);

    /* JADX INFO: renamed from: f */
    public static final pxy0 f178785f = new pxy0(2, -9223372036854775807L, null);

    /* JADX INFO: renamed from: g */
    public static final pxy0 f178786g = new pxy0(3, -9223372036854775807L, null);

    /* JADX INFO: renamed from: a */
    public final ExecutorService f178787a = ggw0.m126062d("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: b */
    @Nullable
    public qxy0 f178788b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public IOException f178789c;

    public uxy0(String str) {
    }

    /* JADX INFO: renamed from: b */
    public static pxy0 m196213b(boolean z, long j) {
        return new pxy0(z ? 1 : 0, j, null);
    }

    /* JADX INFO: renamed from: a */
    public final long m196218a(rxy0 rxy0Var, nxy0 nxy0Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        f5v0.m119531b(looperMyLooper);
        this.f178789c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new qxy0(this, looperMyLooper, rxy0Var, nxy0Var, i, jElapsedRealtime).m177015c(0L);
        return jElapsedRealtime;
    }

    /* JADX INFO: renamed from: g */
    public final void m196219g() {
        qxy0 qxy0Var = this.f178788b;
        f5v0.m119531b(qxy0Var);
        qxy0Var.m177013a(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m196220h() {
        this.f178789c = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m196221i(int i) throws IOException {
        IOException iOException = this.f178789c;
        if (iOException != null) {
            throw iOException;
        }
        qxy0 qxy0Var = this.f178788b;
        if (qxy0Var != null) {
            qxy0Var.m177014b(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m196222j(@Nullable sxy0 sxy0Var) {
        qxy0 qxy0Var = this.f178788b;
        if (qxy0Var != null) {
            qxy0Var.m177013a(true);
        }
        this.f178787a.execute(new txy0(sxy0Var));
        this.f178787a.shutdown();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m196223k() {
        return this.f178789c != null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m196224l() {
        return this.f178788b != null;
    }
}
