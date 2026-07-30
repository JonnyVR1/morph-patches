package p153l;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class a7z0 {

    /* JADX INFO: renamed from: d */
    public static final v6z0 f68864d = new v6z0(0, -9223372036854775807L, null);

    /* JADX INFO: renamed from: e */
    public static final v6z0 f68865e = new v6z0(1, -9223372036854775807L, null);

    /* JADX INFO: renamed from: f */
    public static final v6z0 f68866f = new v6z0(2, -9223372036854775807L, null);

    /* JADX INFO: renamed from: g */
    public static final v6z0 f68867g = new v6z0(3, -9223372036854775807L, null);

    /* JADX INFO: renamed from: a */
    public final ExecutorService f68868a = mpw0.m159406d("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: b */
    @Nullable
    public w6z0 f68869b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public IOException f68870c;

    public a7z0(String str) {
    }

    /* JADX INFO: renamed from: b */
    public static v6z0 m96395b(boolean z, long j) {
        return new v6z0(z ? 1 : 0, j, null);
    }

    /* JADX INFO: renamed from: a */
    public final long m96400a(x6z0 x6z0Var, t6z0 t6z0Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        lev0.m153954b(looperMyLooper);
        this.f68870c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new w6z0(this, looperMyLooper, x6z0Var, t6z0Var, i, jElapsedRealtime).m205203c(0L);
        return jElapsedRealtime;
    }

    /* JADX INFO: renamed from: g */
    public final void m96401g() {
        w6z0 w6z0Var = this.f68869b;
        lev0.m153954b(w6z0Var);
        w6z0Var.m205201a(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m96402h() {
        this.f68870c = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m96403i(int i) throws IOException {
        IOException iOException = this.f68870c;
        if (iOException != null) {
            throw iOException;
        }
        w6z0 w6z0Var = this.f68869b;
        if (w6z0Var != null) {
            w6z0Var.m205202b(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m96404j(@Nullable y6z0 y6z0Var) {
        w6z0 w6z0Var = this.f68869b;
        if (w6z0Var != null) {
            w6z0Var.m205201a(true);
        }
        this.f68868a.execute(new z6z0(y6z0Var));
        this.f68868a.shutdown();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m96405k() {
        return this.f68870c != null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m96406l() {
        return this.f68869b != null;
    }
}
