package p153l;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y40 {
    @Nullable
    /* JADX INFO: renamed from: c */
    public static y40 m214194c() {
        return Build.VERSION.SDK_INT >= 28 ? new a50() : new z40();
    }

    /* JADX INFO: renamed from: a */
    public final void m214195a(int i, Message message) {
        try {
            mo96011b(mo96012d(i, message));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo96011b(IBinder iBinder);

    /* JADX INFO: renamed from: d */
    public abstract IBinder mo96012d(int i, Message message);
}
