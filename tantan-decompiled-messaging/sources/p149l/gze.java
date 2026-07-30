package p149l;

import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes7.dex */
public class gze {

    /* JADX INFO: renamed from: a */
    @NonNull
    private static jql f105126a = new fnd();

    /* JADX INFO: renamed from: a */
    public static synchronized jql m128844a() {
        return f105126a;
    }

    /* JADX INFO: renamed from: b */
    public static void m128845b(Throwable th) {
        MDLog.printErrStackTrace("momoenc", th);
    }
}
