package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class jqd implements sid0 {

    /* JADX INFO: renamed from: a */
    public final Handler f119258a = uuk.m195375a(Looper.getMainLooper());

    @Override // p149l.sid0
    /* JADX INFO: renamed from: a */
    public void mo142786a(@NonNull Runnable runnable) {
        this.f119258a.removeCallbacks(runnable);
    }

    @Override // p149l.sid0
    /* JADX INFO: renamed from: b */
    public void mo142787b(long j, @NonNull Runnable runnable) {
        this.f119258a.postDelayed(runnable, j);
    }
}
