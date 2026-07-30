package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b8w0 {
    /* JADX INFO: renamed from: a */
    public static Bundle m103038a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    /* JADX INFO: renamed from: b */
    public static void m103039b(Bundle bundle, @Nullable String str, @Nullable Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m103040c(Bundle bundle, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m103041d(Bundle bundle, @Nullable String str, @Nullable List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m103042e(Bundle bundle, @Nullable String str, int i, boolean z) {
        if (z) {
            bundle.putInt(str, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m103043f(Bundle bundle, @Nullable String str, @Nullable String str2, boolean z) {
        if (!z || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m103044g(Bundle bundle, @Nullable String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }
}
