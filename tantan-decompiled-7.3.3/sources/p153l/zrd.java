package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class zrd implements vqd0 {

    /* JADX INFO: renamed from: a */
    public final Handler f205750a = kxk.m151837a(Looper.getMainLooper());

    @Override // p153l.vqd0
    /* JADX INFO: renamed from: a */
    public void mo202376a(@NonNull Runnable runnable) {
        this.f205750a.removeCallbacks(runnable);
    }

    @Override // p153l.vqd0
    /* JADX INFO: renamed from: b */
    public void mo202377b(long j, @NonNull Runnable runnable) {
        this.f205750a.postDelayed(runnable, j);
    }
}
