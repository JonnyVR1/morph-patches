package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.immomo.medialog.thread.Priority;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hv80 implements Runnable {

    /* JADX INFO: renamed from: a */
    private Priority f111740a = Priority.LOW;

    /* JADX INFO: renamed from: b */
    private String f111741b;

    /* JADX INFO: renamed from: a */
    public Priority m137274a() {
        return this.f111740a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof av80) {
            Runnable runnableM100432b = ((av80) obj).m100432b();
            if (runnableM100432b instanceof hv80) {
                return TextUtils.equals(this.f111741b, ((hv80) runnableM100432b).f111741b);
            }
        }
        return this == obj;
    }
}
