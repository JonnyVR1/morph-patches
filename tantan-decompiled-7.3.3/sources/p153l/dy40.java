package p153l;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class dy40 {
    @NonNull
    @RequiresApi(23)
    /* JADX INFO: renamed from: a */
    public static Parcelable[] m118617a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
