package p153l;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class rfy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final PowerManager f162892a;

    public rfy0(Context context) {
        this.f162892a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
