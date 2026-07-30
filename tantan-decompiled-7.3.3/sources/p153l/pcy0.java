package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class pcy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static pcy0 f151638a;

    /* JADX INFO: renamed from: a */
    public static synchronized pcy0 m171702a() {
        try {
            if (f151638a == null) {
                f151638a = new pcy0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f151638a;
    }
}
