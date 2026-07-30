package p149l;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d50 {
    @Nullable
    /* JADX INFO: renamed from: c */
    public static d50 m110000c() {
        return Build.VERSION.SDK_INT >= 28 ? new f50() : new e50();
    }

    /* JADX INFO: renamed from: a */
    public final void m110001a(int i, Message message) {
        try {
            mo110002b(mo110003d(i, message));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo110002b(IBinder iBinder);

    /* JADX INFO: renamed from: d */
    public abstract IBinder mo110003d(int i, Message message);
}
