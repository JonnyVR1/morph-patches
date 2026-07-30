package p149l;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class iwv {

    /* JADX INFO: renamed from: a */
    public final String f115298a;

    /* JADX INFO: renamed from: b */
    public final LocusId f115299b;

    /* JADX INFO: renamed from: l.iwv$a */
    @RequiresApi(29)
    public static class C17639a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static LocusId m138765a(@NonNull String str) {
            return new LocusId(str);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static String m138766b(@NonNull LocusId locusId) {
            return locusId.getId();
        }
    }

    public iwv(@NonNull String str) {
        this.f115298a = (String) tf80.m188661h(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f115299b = C17639a.m138765a(str);
        } else {
            this.f115299b = null;
        }
    }

    @NonNull
    @RequiresApi(29)
    /* JADX INFO: renamed from: c */
    public static iwv m138762c(@NonNull LocusId locusId) {
        tf80.m188659f(locusId, "locusId cannot be null");
        return new iwv((String) tf80.m188661h(C17639a.m138766b(locusId), "id cannot be empty"));
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final String m138763a() {
        return this.f115298a.length() + "_chars";
    }

    @NonNull
    @RequiresApi(29)
    /* JADX INFO: renamed from: b */
    public LocusId m138764b() {
        return this.f115299b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iwv.class != obj.getClass()) {
            return false;
        }
        String str = this.f115298a;
        String str2 = ((iwv) obj).f115298a;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        String str = this.f115298a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public String toString() {
        return "LocusIdCompat[" + m138763a() + Constants.AES_SUFFIX;
    }
}
