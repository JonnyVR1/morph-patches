package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class psw implements Executor {

    /* JADX INFO: renamed from: a */
    Handler f153978a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f153978a.post(runnable);
    }
}
