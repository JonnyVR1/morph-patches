package p149l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a16 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static Cursor m94507a(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) throws Exception {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                throw new androidx.core.os.OperationCanceledException();
            }
            throw e;
        }
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: b */
    public static Cursor m94508b(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable gf4 gf4Var) {
        return m94507a(contentResolver, uri, strArr, str, strArr2, str2, gf4Var != null ? (CancellationSignal) gf4Var.m125874b() : null);
    }
}
