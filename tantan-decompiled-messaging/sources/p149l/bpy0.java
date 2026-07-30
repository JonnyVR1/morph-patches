package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class bpy0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f76691a = new p0r0(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f76691a.post(runnable);
    }
}
