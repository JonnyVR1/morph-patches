package com.google.android.libraries.places.internal;

import android.location.Location;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import org.eclipse.jetty.util.security.Constraint;
import p153l.gig0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzjc {
    private static final zzoa zza;

    static {
        zznz zznzVar = new zznz();
        zznzVar.zza(zzen.NONE, Constraint.NONE);
        zznzVar.zza(zzen.PSK, "WPA_PSK");
        zznzVar.zza(zzen.EAP, "WPA_EAP");
        zznzVar.zza(zzen.OTHER, "SECURED_NONE");
        zza = zznzVar.zzc();
    }

    @Nullable
    public static String zza(@Nullable Location location) {
        if (location == null) {
            return null;
        }
        return zzf(location.getLatitude(), location.getLongitude());
    }

    @Nullable
    public static String zzb(@Nullable LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zzf(latLng.latitude, latLng.longitude);
    }

    @Nullable
    public static String zzc(@Nullable LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zzg((RectangularBounds) locationBias);
        }
        gig0.m130323a("Unknown LocationBias type.");
        return null;
    }

    @Nullable
    public static String zzd(@Nullable LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zzg((RectangularBounds) locationRestriction);
        }
        gig0.m130323a("Unknown LocationRestriction type.");
        return null;
    }

    public static String zze(zznx zznxVar, int i) {
        StringBuilder sb = new StringBuilder();
        int size = zznxVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzeo zzeoVar = (zzeo) zznxVar.get(i2);
            int length = sb.length();
            zznz zznzVar = new zznz();
            zznzVar.zza("mac", zzeoVar.zzd());
            zznzVar.zza("strength_dbm", Integer.valueOf(zzeoVar.zzb()));
            zznzVar.zza("wifi_auth_type", zza.get(zzeoVar.zzc()));
            zznzVar.zza("is_connected", Boolean.valueOf(zzeoVar.zze()));
            zznzVar.zza("frequency_mhz", Integer.valueOf(zzeoVar.zza()));
            zzoa zzoaVarZzc = zznzVar.zzc();
            zzmh zzmhVarZzc = zzmh.zzc(Constants.SEPARATOR_COMMA);
            Iterator<E> it = zzoaVarZzc.entrySet().iterator();
            StringBuilder sb2 = new StringBuilder();
            try {
                zzmf.zza(sb2, it, zzmhVarZzc, "=");
                String string = sb2.toString();
                int length2 = sb.length();
                String strConcat = (length > 0 ? "|" : "").concat(string);
                if (length2 + strConcat.length() > 4000) {
                    break;
                }
                sb.append(strConcat);
            } catch (IOException e) {
                gig0.m130323a(e);
                return null;
            }
        }
        return sb.toString();
    }

    private static String zzf(double d, double d2) {
        return String.format(Locale.US, "%.15f,%.15f", Double.valueOf(d), Double.valueOf(d2));
    }

    private static String zzg(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d = southwest.latitude;
        double d2 = southwest.longitude;
        LatLng northeast = rectangularBounds.getNortheast();
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(northeast.latitude), Double.valueOf(northeast.longitude));
    }
}
