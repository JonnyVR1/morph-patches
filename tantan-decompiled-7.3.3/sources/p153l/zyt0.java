package p153l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public final class zyt0 {

    /* JADX INFO: renamed from: a */
    public static final int f206633a;

    static {
        f206633a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m222151a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
