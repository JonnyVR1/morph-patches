package p149l;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lgx0 {
    /* JADX INFO: renamed from: a */
    public static HashSet m149799a(int i) {
        return new HashSet(m149802d(i));
    }

    /* JADX INFO: renamed from: b */
    public static LinkedHashMap m149800b(int i) {
        return new LinkedHashMap(m149802d(i));
    }

    /* JADX INFO: renamed from: c */
    public static List m149801c(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    /* JADX INFO: renamed from: d */
    public static int m149802d(int i) {
        if (i < 3) {
            return i + 1;
        }
        return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
