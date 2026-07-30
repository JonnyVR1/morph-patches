package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {
    boolean zza = false;
    private final BlockingQueue zzb = new LinkedBlockingQueue();

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.zza) {
            wtq0.m207906a("Cannot call get on this connection more than once");
            return null;
        }
        this.zza = true;
        return (IBinder) this.zzb.take();
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public IBinder getServiceWithTimeout(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zza) {
            wtq0.m207906a("Cannot call get on this connection more than once");
            return null;
        }
        this.zza = true;
        IBinder iBinder = (IBinder) this.zzb.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.zzb.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
