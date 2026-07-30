package p149l;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class pp40 {
    @NonNull
    @RequiresApi(23)
    /* JADX INFO: renamed from: a */
    public static Parcelable[] m170707a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
