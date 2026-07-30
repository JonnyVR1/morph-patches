package p153l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes6.dex */
public final class h8r0 extends j26 {
    @Nullable
    @ResultIgnorabilityUnspecified
    @Deprecated
    /* JADX INFO: renamed from: p */
    public static Intent m133944p(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (g8r0.m129454a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != g8r0.m129454a() ? 0 : 2);
        }
        return jj5.m145018l(context, broadcastReceiver, intentFilter);
    }
}
