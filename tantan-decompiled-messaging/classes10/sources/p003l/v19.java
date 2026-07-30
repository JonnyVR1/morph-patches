package p003l;

import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.List;
import l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v19 {

    /* JADX INFO: renamed from: a */
    public static int f7854a = 86400000;

    /* JADX INFO: renamed from: a */
    public static <T> boolean m9800a(@NonNull List<T> list, @NonNull List<T> list2) {
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
    public static int m9801b(Throwable th) {
        try {
            Field declaredField = th.getClass().getDeclaredField("code");
            if (!NullChecker.a(declaredField)) {
                return 0;
            }
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(th)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9802c(long j) {
        return mqi0.o() - j < ((long) f7854a);
    }
}
