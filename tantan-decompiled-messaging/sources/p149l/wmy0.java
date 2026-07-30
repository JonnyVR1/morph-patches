package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class wmy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static umy0 f187190a;

    /* JADX INFO: renamed from: a */
    public static synchronized dmy0 m204055a(uly0 uly0Var) {
        try {
            if (f187190a == null) {
                f187190a = new umy0(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (dmy0) f187190a.m192148b(uly0Var);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized dmy0 m204056b(String str) {
        return m204055a(uly0.m194284d("common").mo184624c());
    }
}
