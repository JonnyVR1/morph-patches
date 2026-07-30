package p149l;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;

/* JADX INFO: renamed from: l.j1 */
/* JADX INFO: loaded from: classes13.dex */
public class C17663j1 {
    /* JADX INFO: renamed from: a */
    public static MonitorEvent m139215a(@NonNull Throwable th, @NonNull String str, @Nullable String str2) {
        Throwable th2 = new Throwable(str);
        th2.setStackTrace(th.getStackTrace());
        MonitorEvent monitorEvent = new MonitorEvent("crash", "anr", th2);
        monitorEvent.setCrashThread(Looper.getMainLooper().getThread());
        monitorEvent.setNeedOtherThread(true);
        if (!TextUtils.isEmpty(str2)) {
            monitorEvent.setExtra("trace", str2);
        }
        return monitorEvent;
    }
}
