package p153l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f26 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static Cursor m123602a(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) throws Exception {
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
    public static Cursor m123603b(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable fg4 fg4Var) {
        return m123602a(contentResolver, uri, strArr, str, strArr2, str2, fg4Var != null ? (CancellationSignal) fg4Var.m125476b() : null);
    }
}
