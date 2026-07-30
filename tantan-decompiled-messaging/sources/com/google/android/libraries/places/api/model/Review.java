package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.zzmt;
import com.google.android.libraries.places.internal.zznb;
import com.google.android.libraries.places.internal.zzrz;
import com.google.android.libraries.places.internal.zzsa;
import com.google.android.libraries.places.internal.zzsb;
import com.google.android.libraries.places.internal.zzsc;
import org.eclipse.jetty.util.URIUtil;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Review implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public Review build() {
            Double rating = zzd().getRating();
            boolean z = false;
            if (rating.doubleValue() >= 1.0d && rating.doubleValue() <= 5.0d) {
                z = true;
            }
            zzmt.zzj(z, "Rating must between 1.0 and 5.0 (inclusive), but was: %s.", rating);
            return zzd();
        }

        @RecentlyNullable
        public abstract String getOriginalText();

        @RecentlyNullable
        public abstract String getOriginalTextLanguageCode();

        @RecentlyNullable
        public abstract String getPublishTime();

        @RecentlyNullable
        public abstract String getRelativePublishTimeDescription();

        @RecentlyNullable
        public abstract String getText();

        @RecentlyNullable
        public abstract String getTextLanguageCode();

        @RecentlyNonNull
        public abstract Builder setOriginalText(@Nullable String str);

        @RecentlyNonNull
        public abstract Builder setOriginalTextLanguageCode(@Nullable String str);

        @RecentlyNonNull
        public abstract Builder setPublishTime(@Nullable String str);

        @RecentlyNonNull
        public abstract Builder setRelativePublishTimeDescription(@Nullable String str);

        @RecentlyNonNull
        public abstract Builder setText(@Nullable String str);

        @RecentlyNonNull
        public abstract Builder setTextLanguageCode(@Nullable String str);

        public abstract Builder zza(String str);

        public abstract Builder zzb(AuthorAttribution authorAttribution);

        public abstract Review zzd();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull Double d, @RecentlyNonNull AuthorAttribution authorAttribution) {
        String strZzc = zznb.zzc(authorAttribution.getUri());
        if (strZzc.startsWith("//")) {
            strZzc = URIUtil.HTTPS_COLON.concat(strZzc);
        }
        zzsa zzsaVar = new zzsa("a");
        int i = zzsc.zza;
        zzsaVar.zzc(zzsc.zza(strZzc, zzsb.zza));
        zzsaVar.zzb(authorAttribution.getName());
        zzrz zzrzVarZza = zzsaVar.zza();
        zzad zzadVar = new zzad();
        zzadVar.zzc(d);
        zzadVar.zzb(authorAttribution);
        zzadVar.zza(zzrzVarZza.zza());
        return zzadVar;
    }

    @RecentlyNonNull
    public abstract String getAttribution();

    @RecentlyNonNull
    public abstract AuthorAttribution getAuthorAttribution();

    @RecentlyNullable
    public abstract String getOriginalText();

    @RecentlyNullable
    public abstract String getOriginalTextLanguageCode();

    @RecentlyNullable
    public abstract String getPublishTime();

    @RecentlyNonNull
    public abstract Double getRating();

    @RecentlyNullable
    public abstract String getRelativePublishTimeDescription();

    @RecentlyNullable
    public abstract String getText();

    @RecentlyNullable
    public abstract String getTextLanguageCode();
}
