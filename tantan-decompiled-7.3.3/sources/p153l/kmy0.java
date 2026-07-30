package p153l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class kmy0 {

    /* JADX INFO: renamed from: a */
    public final Context f127543a;

    @VisibleForTesting
    public kmy0(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f127543a = applicationContext;
    }
}
