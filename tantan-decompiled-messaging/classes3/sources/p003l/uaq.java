package p003l;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface uaq {

    /* JADX INFO: renamed from: s0 */
    public static final HashMap<String, Boolean> f7944s0 = new HashMap<>(8);

    /* JADX INFO: renamed from: I */
    default void m8103I(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f7944s0.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: K */
    default boolean m8104K(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f7944s0.containsKey(str);
    }

    /* JADX INFO: renamed from: e0 */
    default void m8105e0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f7944s0.remove(str);
    }

    /* JADX INFO: renamed from: r0 */
    default void m8106r0() {
        f7944s0.clear();
    }
}
