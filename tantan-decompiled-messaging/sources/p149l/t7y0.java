package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class t7y0 {
    /* JADX INFO: renamed from: a */
    public static void m187517a(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            jfd0.m141176a("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            mxk.m156912a("null value in entry: ", obj, "=null");
        }
    }
}
