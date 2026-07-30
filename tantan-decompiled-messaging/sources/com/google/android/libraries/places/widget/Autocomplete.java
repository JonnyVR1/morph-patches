package com.google.android.libraries.places.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzkd;
import com.google.android.libraries.places.internal.zzkr;
import com.google.android.libraries.places.internal.zzks;
import com.google.android.libraries.places.internal.zzkt;
import com.google.android.libraries.places.internal.zzkw;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Autocomplete {
    private Autocomplete() {
    }

    @RecentlyNonNull
    public static Place getPlaceFromIntent(@RecentlyNonNull Intent intent) {
        return zzkw.zzb(intent);
    }

    @RecentlyNonNull
    public static Status getStatusFromIntent(@RecentlyNonNull Intent intent) {
        return zzkw.zza(intent);
    }

    public static class IntentBuilder {
        private final zzks zza;

        public IntentBuilder(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode, @RecentlyNonNull List<Place.Field> list) {
            this.zza = zzkt.zzo(autocompleteActivityMode, list, zzkr.INTENT);
        }

        @RecentlyNonNull
        public Intent build(@RecentlyNonNull Context context) {
            try {
                Intent intent = new Intent(context, (Class<?>) AutocompleteActivity.class);
                zzks zzksVar = this.zza;
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = new TypedValue();
                if (theme.resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                    zzksVar.zzi(typedValue.data);
                }
                TypedValue typedValue2 = new TypedValue();
                if (theme.resolveAttribute(R.attr.colorPrimaryDark, typedValue2, true)) {
                    zzksVar.zzj(typedValue2.data);
                }
                intent.putExtra("places/AutocompleteOptions", this.zza.zzn());
                return intent;
            } catch (Error | RuntimeException e) {
                zzkd.zzb(e);
                throw e;
            }
        }

        @RecentlyNonNull
        public IntentBuilder setCountries(@RecentlyNonNull List<String> list) {
            this.zza.zza(list);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public IntentBuilder setCountry(@Nullable String str) {
            this.zza.zzo(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setHint(@Nullable String str) {
            this.zza.zzb(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setInitialQuery(@Nullable String str) {
            this.zza.zzc(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setLocationBias(@Nullable LocationBias locationBias) {
            this.zza.zzd(locationBias);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setLocationRestriction(@Nullable LocationRestriction locationRestriction) {
            this.zza.zze(locationRestriction);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setRegionCode(@Nullable String str) {
            this.zza.zzk(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public IntentBuilder setTypeFilter(@Nullable TypeFilter typeFilter) {
            this.zza.zzl(typeFilter);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setTypesFilter(@RecentlyNonNull List<String> list) {
            this.zza.zzm(list);
            return this;
        }

        public final IntentBuilder zza(zzkr zzkrVar) {
            this.zza.zzg(zzkrVar);
            return this;
        }

        public IntentBuilder(zzkt zzktVar) {
            this.zza = zzktVar.zzg();
        }
    }
}
