package p149l;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes.dex */
public class x760 {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public static <T extends o0l0> T m207240a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).m4099a();
        }
        ig3.m135964a("Invalid parcel");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static <T extends o0l0> T m207241b(@NonNull Bundle bundle, @NonNull String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(x760.class.getClassLoader());
            return (T) m207240a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
