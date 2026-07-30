package p149l;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class w750 {

    /* JADX INFO: renamed from: a */
    private static volatile w750 f185024a;

    /* JADX INFO: renamed from: b */
    private static final HashSet<String> f185025b = new HashSet<>();

    private w750() {
    }

    /* JADX INFO: renamed from: a */
    public static w750 m202005a() {
        if (f185024a == null) {
            synchronized (w750.class) {
                try {
                    if (f185024a == null) {
                        f185024a = new w750();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f185024a;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m202006b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet<String> hashSet = f185025b;
        if (hashSet.contains(str)) {
            return false;
        }
        hashSet.add(str);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m202007c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f185025b.remove(str);
    }
}
