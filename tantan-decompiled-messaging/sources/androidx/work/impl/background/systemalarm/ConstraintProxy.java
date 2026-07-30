package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.NetworkType;
import java.util.Iterator;
import java.util.List;
import p149l.gz5;
import p149l.haq0;
import p149l.txv;

/* JADX INFO: loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {
    private static final String TAG = txv.m190978i("ConstraintProxy");

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

    public static void updateAll(Context context, List<haq0> list) {
        Iterator<haq0> it = list.iterator();
        boolean requiresBatteryNotLow = false;
        boolean requiresCharging = false;
        boolean requiresStorageNotLow = false;
        boolean z = false;
        while (it.hasNext()) {
            gz5 gz5Var = it.next().constraints;
            requiresBatteryNotLow |= gz5Var.getRequiresBatteryNotLow();
            requiresCharging |= gz5Var.getRequiresCharging();
            requiresStorageNotLow |= gz5Var.getRequiresStorageNotLow();
            z |= gz5Var.getRequiredNetworkType() != NetworkType.NOT_REQUIRED;
            if (requiresBatteryNotLow && requiresCharging && requiresStorageNotLow && z) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, requiresBatteryNotLow, requiresCharging, requiresStorageNotLow, z));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        txv.m190976e().mo190979a(TAG, "onReceive : " + intent);
        context.startService(C0776a.m4527a(context));
    }
}
