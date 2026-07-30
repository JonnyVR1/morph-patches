package p149l;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class aus0 {
    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m99087a(@Nullable Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(aus0.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(aus0.class.getClassLoader());
        return (T) bundle2.getParcelable(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m99088b(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableM99087a = m99087a(bundle, "MapOptions");
        if (parcelableM99087a != null) {
            m99089c(bundle2, "MapOptions", parcelableM99087a);
        }
        Parcelable parcelableM99087a2 = m99087a(bundle, "StreetViewPanoramaOptions");
        if (parcelableM99087a2 != null) {
            m99089c(bundle2, "StreetViewPanoramaOptions", parcelableM99087a2);
        }
        Parcelable parcelableM99087a3 = m99087a(bundle, "camera");
        if (parcelableM99087a3 != null) {
            m99089c(bundle2, "camera", parcelableM99087a3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m99089c(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(aus0.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(aus0.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
