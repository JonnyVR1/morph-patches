package p149l;

import android.os.Trace;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class v4j0 {
    /* JADX INFO: renamed from: a */
    public static void m196993a(@NonNull String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: b */
    public static void m196994b(@NonNull String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    @DoNotInline
    /* JADX INFO: renamed from: c */
    public static boolean m196995c() {
        return Trace.isEnabled();
    }
}
