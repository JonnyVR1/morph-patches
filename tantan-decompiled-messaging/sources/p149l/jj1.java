package p149l;

import android.os.Build;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface jj1 {

    /* JADX INFO: renamed from: f0 */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final boolean f118213f0;

    static {
        f118213f0 = Build.VERSION.SDK_INT >= 27;
    }
}
