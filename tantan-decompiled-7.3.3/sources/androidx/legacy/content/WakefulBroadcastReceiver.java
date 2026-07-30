package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = new SparseArray<>();
    private static int mNextId = 1;

    public static boolean completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra(EXTRA_WAKE_LOCK_ID, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                if (wakeLock == null) {
                    return true;
                }
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            try {
                int i = mNextId;
                int i2 = i + 1;
                mNextId = i2;
                if (i2 <= 0) {
                    mNextId = 1;
                }
                intent.putExtra(EXTRA_WAKE_LOCK_ID, i);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(Constants.ONE_MIN_IN_MILLIS);
                sparseArray.put(i, wakeLockNewWakeLock);
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
