package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class qpw implements Executor {

    /* JADX INFO: renamed from: a */
    Handler f155835a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f155835a.post(runnable);
    }
}
