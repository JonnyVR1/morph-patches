package p149l;

import com.quickjs.JSFunction;
import com.quickjs.JSObject;
import com.quickjs.JSValue;

/* JADX INFO: loaded from: classes7.dex */
public class jej0 {
    /* JADX INFO: renamed from: a */
    public static boolean m141146a(Object... objArr) {
        for (Object obj : objArr) {
            if (!(obj instanceof JSFunction)) {
                return false;
            }
        }
        return objArr.length > 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m141147b(Object... objArr) {
        for (Object obj : objArr) {
            if (!(obj instanceof JSObject) || m141149d(obj)) {
                return false;
            }
        }
        return objArr.length > 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m141148c(Object... objArr) {
        for (Object obj : objArr) {
            if (!(obj instanceof JSObject) || m141149d(obj)) {
                return false;
            }
        }
        return objArr.length > 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m141149d(Object... objArr) {
        for (Object obj : objArr) {
            if (!(obj instanceof JSValue) || !((JSValue) obj).isUndefined()) {
                return false;
            }
        }
        return objArr.length > 0;
    }
}
