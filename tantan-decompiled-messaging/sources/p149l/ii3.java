package p149l;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ii3 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static IBinder m136329a(@NonNull Bundle bundle, @Nullable String str) {
        return bundle.getBinder(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m136330b(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
