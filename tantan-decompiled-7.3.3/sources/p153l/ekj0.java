package p153l;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ekj0 {

    /* JADX INFO: renamed from: a */
    public final j7m f94381a;

    public ekj0(@NonNull j7m j7mVar) {
        this.f94381a = j7mVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static ekj0 m121050a(@Nullable IBinder iBinder) {
        j7m j7mVarM143785O = iBinder == null ? null : j7m.AbstractBinderC17892a.m143785O(iBinder);
        if (j7mVarM143785O == null) {
            return null;
        }
        return new ekj0(j7mVarM143785O);
    }
}
