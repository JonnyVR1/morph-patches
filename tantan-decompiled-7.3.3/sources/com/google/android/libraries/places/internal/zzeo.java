package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class zzeo {

    @Nullable
    private final String zza;
    private final int zzb;
    private final zzen zzc;
    private final boolean zzd;
    private final int zze;

    public zzeo(@Nullable WifiInfo wifiInfo, ScanResult scanResult) {
        zzen zzenVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i = scanResult.level;
        int i2 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            zzenVar = zzen.OTHER;
        } else {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            zzenVar = (upperCase.equals("[ESS]") || upperCase.equals("[IBSS]")) ? zzen.NONE : upperCase.matches(".*WPA[0-9]*-PSK.*") ? zzen.PSK : upperCase.matches(".*WPA[0-9]*-EAP.*") ? zzen.EAP : zzen.OTHER;
        }
        boolean z = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z = true;
        }
        this.zza = str;
        this.zzb = i;
        this.zzc = zzenVar;
        this.zzd = z;
        this.zze = i2;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzen zzc() {
        return this.zzc;
    }

    @Nullable
    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
