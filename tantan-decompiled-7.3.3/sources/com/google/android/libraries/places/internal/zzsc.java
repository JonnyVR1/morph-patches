package com.google.android.libraries.places.internal;

import java.util.Iterator;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes7.dex */
public final class zzsc {
    public static final /* synthetic */ int zza = 0;
    private static final zzob zzb = zzob.zzn("http", "https", "mailto", "ftp");
    private static final zzob zzc = zzob.zzp("audio/3gpp2", DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP, "audio/aac", "audio/midi", "audio/mp3", DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4, DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG, "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG, "image/jpg", DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG, "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, "video/ogg", "video/webm", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MATROSKA, "font/ttf");
    private static final zzob zzd = zzob.zzk();

    public static zzsb zza(String str, zzsb zzsbVar) {
        char cCharAt;
        int i;
        char cCharAt2;
        char cCharAt3;
        zzob zzobVar = zzd;
        String strZza = zzlu.zza(str);
        zzox it = zzb.iterator();
        while (it.hasNext()) {
            if (strZza.startsWith(String.valueOf((String) it.next()).concat(":"))) {
                return new zzsb(str);
            }
        }
        if (!strZza.startsWith("data:")) {
            Iterator it2 = zzobVar.iterator();
            while (it2.hasNext()) {
                if (strZza.startsWith(String.valueOf(zzlu.zza(((zzry) it2.next()).name()).replace('_', '-')).concat(":"))) {
                    return new zzsb(str);
                }
            }
            for (int i2 = 0; i2 < str.length() && (cCharAt = str.charAt(i2)) != '#' && cCharAt != '/'; i2++) {
                if (cCharAt == ':') {
                    return zzsbVar;
                }
                if (cCharAt == '?') {
                    break;
                }
            }
            return new zzsb(str);
        }
        String strZza2 = zzlu.zza(str);
        if (strZza2.startsWith("data:") && strZza2.length() > 5) {
            int i3 = 5;
            while (i3 < strZza2.length() && (cCharAt3 = strZza2.charAt(i3)) != ';' && cCharAt3 != ',') {
                i3++;
            }
            if (zzc.contains(strZza2.substring(5, i3)) && strZza2.startsWith(";base64,", i3) && (i = i3 + 8) < strZza2.length()) {
                while (i < strZza2.length() && (cCharAt2 = strZza2.charAt(i)) != '=') {
                    if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '/')) {
                        i++;
                    }
                }
                while (i < strZza2.length()) {
                    if (strZza2.charAt(i) == '=') {
                        i++;
                    }
                }
                return new zzsb(str);
            }
        }
        return zzsbVar;
    }
}
