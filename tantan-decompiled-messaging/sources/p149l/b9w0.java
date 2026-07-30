package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b9w0 implements g6v0 {
    @Override // p149l.g6v0
    /* JADX INFO: renamed from: a */
    public final ojv0 mo100826a(Looper looper, @Nullable Handler.Callback callback) {
        return new ybw0(new Handler(looper, callback));
    }

    @Override // p149l.g6v0
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
