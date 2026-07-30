package p149l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public final class tpt0 {

    /* JADX INFO: renamed from: a */
    public static final int f171507a;

    static {
        f171507a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m190008a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
