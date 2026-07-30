package p149l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/ezg0;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "", "b", "(Landroid/database/Cursor;Landroid/content/ContentResolver;Ljava/util/List;)V", "a", "(Landroid/database/Cursor;)Ljava/util/List;", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ezg0 {

    @NotNull
    public static final ezg0 INSTANCE = new ezg0();

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<Uri> m118979a(@NotNull Cursor cursor) {
        cursor.getClass();
        List<Uri> notificationUris = cursor.getNotificationUris();
        notificationUris.getClass();
        return notificationUris;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public static final void m118980b(@NotNull Cursor cursor, @NotNull ContentResolver cr, @NotNull List<? extends Uri> uris) {
        cursor.getClass();
        cr.getClass();
        uris.getClass();
        cursor.setNotificationUris(cr, uris);
    }
}
