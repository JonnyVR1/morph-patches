package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.immomo.medialog.thread.Priority;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dn80 implements Runnable {

    /* JADX INFO: renamed from: a */
    private Priority f87036a = Priority.LOW;

    /* JADX INFO: renamed from: b */
    private String f87037b;

    /* JADX INFO: renamed from: a */
    public Priority m112611a() {
        return this.f87036a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof wm80) {
            Runnable runnableM203979b = ((wm80) obj).m203979b();
            if (runnableM203979b instanceof dn80) {
                return TextUtils.equals(this.f87037b, ((dn80) runnableM203979b).f87037b);
            }
        }
        return this == obj;
    }
}
