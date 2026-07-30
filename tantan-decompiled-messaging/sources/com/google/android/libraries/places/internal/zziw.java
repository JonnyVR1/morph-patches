package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zziw {
    private final String zza;
    private final String zzb;
    private Locale zzc = null;
    private Map zzd = new HashMap();

    public zziw(String str, String str2) {
        this.zza = str;
        zzmt.zzf(!TextUtils.isEmpty(str2), "API key cannot be empty.");
        this.zzb = str2;
    }

    public final zziw zza(Locale locale) {
        this.zzc = locale;
        return this;
    }

    public final zziw zzb(Map map) {
        this.zzd = new HashMap(map);
        return this;
    }

    public final String zzc() {
        Uri.Builder builderBuildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        builderBuildUpon.appendEncodedPath("maps/api/place/");
        builderBuildUpon.appendEncodedPath(this.zza);
        builderBuildUpon.appendQueryParameter(Constants.KEY_KEY, this.zzb);
        Locale locale = this.zzc;
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                builderBuildUpon.appendQueryParameter(IjkMediaMeta.IJKM_KEY_LANGUAGE, languageTag);
            }
        }
        Map map = this.zzd;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builderBuildUpon.build().toString();
    }
}
