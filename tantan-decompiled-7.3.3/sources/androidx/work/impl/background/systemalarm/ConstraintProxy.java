package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.NetworkType;
import java.util.Iterator;
import java.util.List;
import p153l.l06;
import p153l.mjq0;
import p153l.qzv;

/* JADX INFO: loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {
    private static final String TAG = qzv.m178831i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static void updateAll(Context context, List<mjq0> list) {
        Iterator<mjq0> it = list.iterator();
        boolean requiresBatteryNotLow = false;
        boolean requiresCharging = false;
        boolean requiresStorageNotLow = false;
        boolean z = false;
        while (it.hasNext()) {
            l06 l06Var = it.next().constraints;
            requiresBatteryNotLow |= l06Var.getRequiresBatteryNotLow();
            requiresCharging |= l06Var.getRequiresCharging();
            requiresStorageNotLow |= l06Var.getRequiresStorageNotLow();
            z |= l06Var.getRequiredNetworkType() != NetworkType.NOT_REQUIRED;
            if (requiresBatteryNotLow && requiresCharging && requiresStorageNotLow && z) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, requiresBatteryNotLow, requiresCharging, requiresStorageNotLow, z));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        qzv.m178829e().mo178832a(TAG, "onReceive : " + intent);
        context.startService(C0778a.m4529a(context));
    }
}
