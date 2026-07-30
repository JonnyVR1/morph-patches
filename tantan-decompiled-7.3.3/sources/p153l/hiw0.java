package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class hiw0 implements mfv0 {
    @Override // p153l.mfv0
    /* JADX INFO: renamed from: a */
    public final usv0 mo135184a(Looper looper, @Nullable Handler.Callback callback) {
        return new elw0(new Handler(looper, callback));
    }

    @Override // p153l.mfv0
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
