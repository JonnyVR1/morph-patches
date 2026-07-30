package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class cph0 implements qa5 {
    @Override // p153l.qa5
    /* JADX INFO: renamed from: a */
    public long mo111759a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p153l.qa5
    /* JADX INFO: renamed from: c */
    public sxk mo111761c(Looper looper, @Nullable Handler.Callback callback) {
        return new gph0(new Handler(looper, callback));
    }

    @Override // p153l.qa5
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p153l.qa5
    /* JADX INFO: renamed from: b */
    public void mo111760b() {
    }
}
