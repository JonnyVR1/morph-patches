package p153l;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class g3t0 {
    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m128759a(@Nullable Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(g3t0.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(g3t0.class.getClassLoader());
        return (T) bundle2.getParcelable(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m128760b(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableM128759a = m128759a(bundle, "MapOptions");
        if (parcelableM128759a != null) {
            m128761c(bundle2, "MapOptions", parcelableM128759a);
        }
        Parcelable parcelableM128759a2 = m128759a(bundle, "StreetViewPanoramaOptions");
        if (parcelableM128759a2 != null) {
            m128761c(bundle2, "StreetViewPanoramaOptions", parcelableM128759a2);
        }
        Parcelable parcelableM128759a3 = m128759a(bundle, "camera");
        if (parcelableM128759a3 != null) {
            m128761c(bundle2, "camera", parcelableM128759a3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m128761c(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(g3t0.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(g3t0.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
