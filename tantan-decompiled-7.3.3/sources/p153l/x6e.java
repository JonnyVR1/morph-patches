package p153l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x6e {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final x6e f192580a;

    public x6e(@Nullable x6e x6eVar) {
        this.f192580a = x6eVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static x6e m209487a(@NonNull Context context, @NonNull Uri uri) {
        return new gqf0(null, context, uri);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract String mo131373b();
}
