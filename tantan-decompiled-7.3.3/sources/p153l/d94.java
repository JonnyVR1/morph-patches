package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class d94 {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static Handler m114994a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
