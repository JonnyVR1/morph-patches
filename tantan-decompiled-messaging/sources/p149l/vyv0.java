package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vyv0 {
    /* JADX INFO: renamed from: a */
    public static Bundle m200674a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    /* JADX INFO: renamed from: b */
    public static void m200675b(Bundle bundle, @Nullable String str, @Nullable Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m200676c(Bundle bundle, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m200677d(Bundle bundle, @Nullable String str, @Nullable List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m200678e(Bundle bundle, @Nullable String str, int i, boolean z) {
        if (z) {
            bundle.putInt(str, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m200679f(Bundle bundle, @Nullable String str, @Nullable String str2, boolean z) {
        if (!z || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m200680g(Bundle bundle, @Nullable String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }
}
