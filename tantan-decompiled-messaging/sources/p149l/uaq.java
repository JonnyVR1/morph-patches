package p149l;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public interface uaq {

    /* JADX INFO: renamed from: s0 */
    public static final HashMap<String, Boolean> f175626s0 = new HashMap<>(8);

    /* JADX INFO: renamed from: I */
    default void m192793I(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f175626s0.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: K */
    default boolean m192794K(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f175626s0.containsKey(str);
    }

    /* JADX INFO: renamed from: e0 */
    default void m192795e0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f175626s0.remove(str);
    }

    /* JADX INFO: renamed from: r0 */
    default void m192796r0() {
        f175626s0.clear();
    }
}
