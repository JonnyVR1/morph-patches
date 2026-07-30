package p153l;

import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes7.dex */
public class k0f {

    /* JADX INFO: renamed from: a */
    @NonNull
    private static vsl f123386a = new kod();

    /* JADX INFO: renamed from: a */
    public static synchronized vsl m147784a() {
        return f123386a;
    }

    /* JADX INFO: renamed from: b */
    public static void m147785b(Throwable th) {
        MDLog.printErrStackTrace("momoenc", th);
    }
}
