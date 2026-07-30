package p149l;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class l6y0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final PowerManager f126682a;

    public l6y0(Context context) {
        this.f126682a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
