package p149l;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class pqx0 {
    /* JADX INFO: renamed from: a */
    public static <T> T m170938a(@NonNull Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        yek0.m214351a("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()});
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m170939b(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
