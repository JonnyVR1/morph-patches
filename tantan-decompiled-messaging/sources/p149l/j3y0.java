package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class j3y0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static j3y0 f116122a;

    /* JADX INFO: renamed from: a */
    public static synchronized j3y0 m139607a() {
        try {
            if (f116122a == null) {
                f116122a = new j3y0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f116122a;
    }
}
