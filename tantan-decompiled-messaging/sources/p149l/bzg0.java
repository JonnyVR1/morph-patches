package p149l;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/bzg0;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", "a", "(Landroid/database/Cursor;)Landroid/net/Uri;", "Landroid/app/ActivityManager;", "activityManager", "", "b", "(Landroid/app/ActivityManager;)Z", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class bzg0 {

    @NotNull
    public static final bzg0 INSTANCE = new bzg0();

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Uri m104619a(@NotNull Cursor cursor) {
        cursor.getClass();
        Uri notificationUri = cursor.getNotificationUri();
        notificationUri.getClass();
        return notificationUri;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public static final boolean m104620b(@NotNull ActivityManager activityManager) {
        activityManager.getClass();
        return activityManager.isLowRamDevice();
    }
}
