package p153l;

import android.os.Trace;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class zdj0 {
    /* JADX INFO: renamed from: a */
    public static void m219300a(@NonNull String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: b */
    public static void m219301b(@NonNull String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    @DoNotInline
    /* JADX INFO: renamed from: c */
    public static boolean m219302c() {
        return Trace.isEnabled();
    }
}
