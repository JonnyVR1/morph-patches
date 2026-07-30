package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p149l.csu0;
import p149l.mov0;
import p149l.p0s0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class AdvertisingIdClient {

    @Nullable
    BlockingServiceConnection zza;

    @Nullable
    mov0 zzb;
    boolean zzc;
    final Object zzd;

    @Nullable
    p0s0 zze;
    final long zzf;
    private final Context zzg;

    /* JADX INFO: renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$a */
    @KeepForSdkWithMembers
    public static final class C2070a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final String f9653a;

        /* JADX INFO: renamed from: b */
        public final boolean f9654b;

        @Deprecated
        public C2070a(@Nullable String str, boolean z) {
            this.f9653a = str;
            this.f9654b = z;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public String m12233a() {
            return this.f9653a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m12234b() {
            return this.f9654b;
        }

        @NonNull
        public String toString() {
            String str = this.f9653a;
            boolean z = this.f9654b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
    }

    @NonNull
    @KeepForSdk
    public static C2070a getAdvertisingIdInfo(@NonNull Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            C2070a c2070aZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(c2070aZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            advertisingIdClient.zza();
            return c2070aZzd;
        } catch (Throwable th) {
            try {
                advertisingIdClient.zzc(null, true, 0.0f, -1L, "", th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.zza();
                throw th2;
            }
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            p0s0 p0s0Var = advertisingIdClient.zze;
                            if (p0s0Var == null || !p0s0Var.f146622d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    Preconditions.checkNotNull(advertisingIdClient.zza);
                    Preconditions.checkNotNull(advertisingIdClient.zzb);
                    try {
                        zZzd = advertisingIdClient.zzb.zzd();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return zZzd;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final C2070a zzd(int i) throws IOException {
        C2070a c2070a;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        p0s0 p0s0Var = this.zze;
                        if (p0s0Var == null || !p0s0Var.f146622d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                Preconditions.checkNotNull(this.zza);
                Preconditions.checkNotNull(this.zzb);
                try {
                    c2070a = new C2070a(this.zzb.zzc(), this.zzb.zze(true));
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return c2070a;
    }

    private final void zze() {
        synchronized (this.zzd) {
            p0s0 p0s0Var = this.zze;
            if (p0s0Var != null) {
                p0s0Var.f146621c.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new p0s0(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    @KeepForSdk
    public C2070a getInfo() throws IOException {
        return zzd(-1);
    }

    @KeepForSdk
    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzb(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                    }
                } catch (Throwable unused) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                    if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = blockingServiceConnection;
                        try {
                            this.zzb = csu0.m108562O(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                            this.zzc = true;
                            if (z) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(@Nullable C2070a c2070a, boolean z, float f, long j, String str, @Nullable Throwable th) {
        if (Math.random() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c2070a != null) {
            map.put("limit_ad_tracking", true != c2070a.m12234b() ? "0" : "1");
            String strM12233a = c2070a.m12233a();
            if (strM12233a != null) {
                map.put("ad_id_size", Integer.toString(strM12233a.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new C2071a(this, map).start();
        return true;
    }

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, false, false);
    }
}
