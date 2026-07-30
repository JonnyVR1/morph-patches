package p149l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes6.dex */
public final class bzq0 extends e16 {
    @Nullable
    @ResultIgnorabilityUnspecified
    @Deprecated
    /* JADX INFO: renamed from: p */
    public static Intent m104641p(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (azq0.m99723a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != azq0.m99723a() ? 0 : 2);
        }
        return ii5.m136342l(context, broadcastReceiver, intentFilter);
    }
}
