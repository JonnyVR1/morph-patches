package io.agora.utils2.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class PowerChangeReceiver extends BroadcastReceiver {
    private static final String TAG = "PowerChangeReceiver";
    private WeakReference<CommonUtility> mCommonUtility;

    public PowerChangeReceiver(CommonUtility commonUtility) {
        this.mCommonUtility = new WeakReference<>(commonUtility);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CommonUtility commonUtility = this.mCommonUtility.get();
        if (commonUtility == null) {
            Logging.m87224w(TAG, "rtc engine is not ready");
            return;
        }
        if (intent != null) {
            int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra2 = intent.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
            if (intExtra2 != 0) {
                commonUtility.onPowerChange((int) ((intExtra / intExtra2) * 100.0f));
            }
        }
    }
}
