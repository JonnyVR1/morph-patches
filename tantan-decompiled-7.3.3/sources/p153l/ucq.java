package p153l;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public interface ucq {

    /* JADX INFO: renamed from: s0 */
    public static final HashMap<String, Boolean> f178457s0 = new HashMap<>(8);

    /* JADX INFO: renamed from: J */
    default void m195419J(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f178457s0.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L */
    default boolean m195420L(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f178457s0.containsKey(str);
    }

    /* JADX INFO: renamed from: f0 */
    default void m195421f0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f178457s0.remove(str);
    }

    /* JADX INFO: renamed from: s0 */
    default void m195422s0() {
        f178457s0.clear();
    }
}
