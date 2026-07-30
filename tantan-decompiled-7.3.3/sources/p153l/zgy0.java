package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class zgy0 {
    /* JADX INFO: renamed from: a */
    public static void m219682a(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            mnd0.m159157a("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            c0l.m107429a("null value in entry: ", obj, "=null");
        }
    }
}
