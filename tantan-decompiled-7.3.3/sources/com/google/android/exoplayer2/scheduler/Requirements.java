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
import p153l.bmk0;
import p153l.jj5;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C1954a();
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int DEVICE_STORAGE_NOT_LOW = 16;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;
    private final int requirements;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.Requirements$a */
    public class C1954a implements Parcelable.Creator<Requirements> {
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
    public static boolean m10953g(ConnectivityManager connectivityManager) {
        if (bmk0.f77313a < 24) {
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
    public final int m10954a(Context context) {
        if (!m10960h()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) w11.m204369e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && m10953g(connectivityManager)) {
            return (m10963l() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
        }
        return this.requirements & 3;
    }

    /* JADX INFO: renamed from: b */
    public int m10955b(Context context) {
        int iM10954a = m10954a(context);
        if (m10956c() && !m10957d(context)) {
            iM10954a |= 8;
        }
        if (m10959f() && !m10958e(context)) {
            iM10954a |= 4;
        }
        return (!m10962k() || m10961i(context)) ? iM10954a : iM10954a | 16;
    }

    /* JADX INFO: renamed from: c */
    public boolean m10956c() {
        return (this.requirements & 8) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10957d(Context context) {
        Intent intentM145018l = jj5.m145018l(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentM145018l == null) {
            return false;
        }
        int intExtra = intentM145018l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10958e(Context context) {
        PowerManager powerManager = (PowerManager) w11.m204369e(context.getSystemService("power"));
        int i = bmk0.f77313a;
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
    public boolean m10959f() {
        return (this.requirements & 4) != 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m10960h() {
        return (this.requirements & 1) != 0;
    }

    public int hashCode() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10961i(Context context) {
        return jj5.m145018l(context, null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m10962k() {
        return (this.requirements & 16) != 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m10963l() {
        return (this.requirements & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requirements);
    }
}
