package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class vgh0 implements p95 {
    @Override // p149l.p95
    /* JADX INFO: renamed from: a */
    public long mo167855a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p149l.p95
    /* JADX INFO: renamed from: c */
    public cvk mo167857c(Looper looper, @Nullable Handler.Callback callback) {
        return new zgh0(new Handler(looper, callback));
    }

    @Override // p149l.p95
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p149l.p95
    /* JADX INFO: renamed from: b */
    public void mo167856b() {
    }
}
