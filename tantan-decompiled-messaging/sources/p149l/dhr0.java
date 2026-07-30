package p149l;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dhr0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static ehr0 m111828a(@Nullable ehr0 ehr0Var, @Nullable String[] strArr, Map map) {
        int length;
        int i = 0;
        if (ehr0Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (ehr0) map.get(strArr[0]);
            }
            if (length2 > 1) {
                ehr0 ehr0Var2 = new ehr0();
                while (i < length2) {
                    ehr0Var2.m116590v((ehr0) map.get(strArr[i]));
                    i++;
                }
                return ehr0Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ehr0Var.m116590v((ehr0) map.get(strArr[0]));
                return ehr0Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    ehr0Var.m116590v((ehr0) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ehr0Var;
    }
}
