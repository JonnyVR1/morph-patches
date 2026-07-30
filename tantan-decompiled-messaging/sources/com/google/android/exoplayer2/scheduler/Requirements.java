package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import p149l.ii5;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C1931a();
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int DEVICE_STORAGE_NOT_LOW = 16;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;
    private final int requirements;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.Requirements$a */
    public class C1931a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(int i) {
        this.requirements = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10899g(ConnectivityManager connectivityManager) {
        if (vck0.f180948a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m10900a(Context context) {
        if (!m10906h()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) p11.m167011e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && m10899g(connectivityManager)) {
            return (m10909l() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
        }
        return this.requirements & 3;
    }

    /* JADX INFO: renamed from: b */
    public int m10901b(Context context) {
        int iM10900a = m10900a(context);
        if (m10902c() && !m10903d(context)) {
            iM10900a |= 8;
        }
        if (m10905f() && !m10904e(context)) {
            iM10900a |= 4;
        }
        return (!m10908k() || m10907i(context)) ? iM10900a : iM10900a | 16;
    }

    /* JADX INFO: renamed from: c */
    public boolean m10902c() {
        return (this.requirements & 8) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10903d(Context context) {
        Intent intentM136342l = ii5.m136342l(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentM136342l == null) {
            return false;
        }
        int intExtra = intentM136342l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10904e(Context context) {
        PowerManager powerManager = (PowerManager) p11.m167011e(context.getSystemService("power"));
        int i = vck0.f180948a;
        if (i >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i >= 20) {
            return !powerManager.isInteractive();
        }
        return !powerManager.isScreenOn();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.requirements == ((Requirements) obj).requirements;
    }

    /* JADX INFO: renamed from: f */
    public boolean m10905f() {
        return (this.requirements & 4) != 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m10906h() {
        return (this.requirements & 1) != 0;
    }

    public int hashCode() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10907i(Context context) {
        return ii5.m136342l(context, null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m10908k() {
        return (this.requirements & 16) != 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m10909l() {
        return (this.requirements & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requirements);
    }
}
