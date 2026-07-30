package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e84 {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static Handler m115238a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
