package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.l460;
import p149l.s9q0;
import p149l.txv;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String ACTION = "androidx.work.impl.background.systemalarm.UpdateProxies";
    static final String KEY_BATTERY_CHARGING_PROXY_ENABLED = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    static final String KEY_BATTERY_NOT_LOW_PROXY_ENABLED = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    static final String KEY_NETWORK_STATE_PROXY_ENABLED = "KEY_NETWORK_STATE_PROXY_ENABLED";
    static final String KEY_STORAGE_NOT_LOW_PROXY_ENABLED = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    static final String TAG = txv.m190978i("ConstrntProxyUpdtRecvr");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class RunnableC0775a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Intent f3531a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f3532b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BroadcastReceiver.PendingResult f3533c;

        public RunnableC0775a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3531a = intent;
            this.f3532b = context;
            this.f3533c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f3531a.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_BATTERY_NOT_LOW_PROXY_ENABLED, false);
                boolean booleanExtra2 = this.f3531a.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_BATTERY_CHARGING_PROXY_ENABLED, false);
                boolean booleanExtra3 = this.f3531a.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_STORAGE_NOT_LOW_PROXY_ENABLED, false);
                boolean booleanExtra4 = this.f3531a.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_NETWORK_STATE_PROXY_ENABLED, false);
                txv.m190976e().mo190979a(ConstraintProxyUpdateReceiver.TAG, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                l460.m148427c(this.f3532b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                l460.m148427c(this.f3532b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                l460.m148427c(this.f3532b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                l460.m148427c(this.f3532b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3533c.finish();
            }
        }
    }

    @NonNull
    public static Intent newConstraintProxyUpdateIntent(@NonNull Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(ACTION);
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra(KEY_BATTERY_NOT_LOW_PROXY_ENABLED, z).putExtra(KEY_BATTERY_CHARGING_PROXY_ENABLED, z2).putExtra(KEY_STORAGE_NOT_LOW_PROXY_ENABLED, z3).putExtra(KEY_NETWORK_STATE_PROXY_ENABLED, z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (ACTION.equals(action)) {
            s9q0.m182740p(context).m182752w().m218342b(new RunnableC0775a(intent, context, goAsync()));
            return;
        }
        txv.m190976e().mo190979a(TAG, "Ignoring unknown action " + action);
    }
}
