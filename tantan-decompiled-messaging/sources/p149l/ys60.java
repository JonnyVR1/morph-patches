package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public class ys60 {
    /* JADX INFO: renamed from: a */
    public static String m215881a(int i, String str) {
        if (i != 86) {
            return Marker.ANY_NON_NULL_MARKER + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str;
        }
        return Marker.ANY_NON_NULL_MARKER + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str.substring(0, 3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str.substring(3, 7) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str.substring(7, 11);
    }
}
