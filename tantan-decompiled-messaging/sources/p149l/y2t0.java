package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes6.dex */
public final class y2t0 {
    /* JADX INFO: renamed from: a */
    public static boolean m212747a(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !m212747a((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!Objects.equal(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }
}
