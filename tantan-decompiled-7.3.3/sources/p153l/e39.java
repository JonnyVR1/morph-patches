package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e39 {

    /* JADX INFO: renamed from: a */
    public static int f91941a = 86400000;

    /* JADX INFO: renamed from: a */
    public static <T> boolean m119254a(@NonNull List<T> list, @NonNull List<T> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m119255b(Throwable th) {
        try {
            Field declaredField = th.getClass().getDeclaredField("code");
            if (!NullChecker.m82486a(declaredField)) {
                return 0;
            }
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(th)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m119256c(long j) {
        return pzi0.m174454o() - j < ((long) f91941a);
    }
}
