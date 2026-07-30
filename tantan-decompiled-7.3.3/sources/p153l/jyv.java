package p153l;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class jyv {

    /* JADX INFO: renamed from: a */
    public final String f123203a;

    /* JADX INFO: renamed from: b */
    public final LocusId f123204b;

    /* JADX INFO: renamed from: l.jyv$a */
    @RequiresApi(29)
    public static class C18061a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static LocusId m147627a(@NonNull String str) {
            return new LocusId(str);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static String m147628b(@NonNull LocusId locusId) {
            return locusId.getId();
        }
    }

    public jyv(@NonNull String str) {
        this.f123203a = (String) yn80.m216778h(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f123204b = C18061a.m147627a(str);
        } else {
            this.f123204b = null;
        }
    }

    @NonNull
    @RequiresApi(29)
    /* JADX INFO: renamed from: c */
    public static jyv m147624c(@NonNull LocusId locusId) {
        yn80.m216776f(locusId, "locusId cannot be null");
        return new jyv((String) yn80.m216778h(C18061a.m147628b(locusId), "id cannot be empty"));
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final String m147625a() {
        return this.f123203a.length() + "_chars";
    }

    @NonNull
    @RequiresApi(29)
    /* JADX INFO: renamed from: b */
    public LocusId m147626b() {
        return this.f123204b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jyv.class != obj.getClass()) {
            return false;
        }
        String str = this.f123203a;
        String str2 = ((jyv) obj).f123203a;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        String str = this.f123203a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public String toString() {
        return "LocusIdCompat[" + m147625a() + Constants.AES_SUFFIX;
    }
}
