package p149l;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class abj0 {

    /* JADX INFO: renamed from: a */
    public final t4m f68701a;

    public abj0(@NonNull t4m t4mVar) {
        this.f68701a = t4mVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static abj0 m95667a(@Nullable IBinder iBinder) {
        t4m t4mVarM187219O = iBinder == null ? null : t4m.AbstractBinderC20106a.m187219O(iBinder);
        if (t4mVarM187219O == null) {
            return null;
        }
        return new abj0(t4mVarM187219O);
    }
}
