package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class ConnectionTracker {
    private static final Object zzb = new Object();
    private static volatile ConnectionTracker zzc;

    @NonNull
    @VisibleForTesting
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @NonNull
    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                try {
                    if (zzc == null) {
                        zzc = new ConnectionTracker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private static void zzb(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean zzc(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!zzd(serviceConnection)) {
            return zze(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        try {
            boolean zZze = zze(context, intent, serviceConnection, i, executor);
            if (zZze) {
                return zZze;
            }
            this.zza.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.zza.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    private static boolean zzd(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzt);
    }

    private static final boolean zze(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!PlatformVersion.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public boolean bindService(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    @KeepForSdk
    public void unbindService(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (!zzd(serviceConnection) || !this.zza.containsKey(serviceConnection)) {
            zzb(context, serviceConnection);
            return;
        }
        try {
            zzb(context, (ServiceConnection) this.zza.get(serviceConnection));
        } finally {
            this.zza.remove(serviceConnection);
        }
    }

    @KeepForSdk
    public void unbindServiceSafe(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean zza(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i, Executor executor) {
        return zzc(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
