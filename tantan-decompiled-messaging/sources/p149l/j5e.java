package p149l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j5e {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final j5e f116299a;

    public j5e(@Nullable j5e j5eVar) {
        this.f116299a = j5eVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static j5e m139840a(@NonNull Context context, @NonNull Uri uri) {
        return new xhf0(null, context, uri);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract String mo139841b();
}
