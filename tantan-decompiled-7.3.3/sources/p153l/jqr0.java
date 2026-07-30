package p153l;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jqr0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static kqr0 m146625a(@Nullable kqr0 kqr0Var, @Nullable String[] strArr, Map map) {
        int length;
        int i = 0;
        if (kqr0Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (kqr0) map.get(strArr[0]);
            }
            if (length2 > 1) {
                kqr0 kqr0Var2 = new kqr0();
                while (i < length2) {
                    kqr0Var2.m150957v((kqr0) map.get(strArr[i]));
                    i++;
                }
                return kqr0Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                kqr0Var.m150957v((kqr0) map.get(strArr[0]));
                return kqr0Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    kqr0Var.m150957v((kqr0) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return kqr0Var;
    }
}
