package p149l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class edy0 {

    /* JADX INFO: renamed from: a */
    public final Context f90653a;

    @VisibleForTesting
    public edy0(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f90653a = applicationContext;
    }
}
