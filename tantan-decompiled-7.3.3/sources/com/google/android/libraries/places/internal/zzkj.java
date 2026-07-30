package com.google.android.libraries.places.internal;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzkj extends zzks {
    private AutocompleteActivityMode zza;
    private zznx zzb;
    private zzkr zzc;
    private String zzd;
    private String zze;
    private LocationBias zzf;
    private LocationRestriction zzg;
    private zznx zzh;
    private TypeFilter zzi;
    private zznx zzj;
    private int zzk;
    private int zzl;
    private String zzm;
    private byte zzn;

    public zzkj(zzkt zzktVar) {
        this.zza = zzktVar.zzh();
        this.zzb = zzktVar.zzj();
        this.zzc = zzktVar.zzf();
        this.zzd = zzktVar.zzm();
        this.zze = zzktVar.zzl();
        this.zzf = zzktVar.zzc();
        this.zzg = zzktVar.zzd();
        this.zzh = zzktVar.zzi();
        this.zzi = zzktVar.zze();
        this.zzj = zzktVar.zzk();
        this.zzk = zzktVar.zza();
        this.zzl = zzktVar.zzb();
        this.zzm = zzktVar.zzn();
        this.zzn = (byte) 3;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zza(List list) {
        this.zzh = zznx.zzj(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzb(@Nullable String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzc(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzd(@Nullable LocationBias locationBias) {
        this.zzf = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zze(@Nullable LocationRestriction locationRestriction) {
        this.zzg = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzf(AutocompleteActivityMode autocompleteActivityMode) {
        if (autocompleteActivityMode != null) {
            this.zza = autocompleteActivityMode;
            return this;
        }
        mnd0.m159157a("Null mode");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzg(zzkr zzkrVar) {
        if (zzkrVar != null) {
            this.zzc = zzkrVar;
            return this;
        }
        mnd0.m159157a("Null origin");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzh(List list) {
        this.zzb = zznx.zzj(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzi(int i) {
        this.zzk = i;
        this.zzn = (byte) (this.zzn | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzj(int i) {
        this.zzl = i;
        this.zzn = (byte) (this.zzn | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzk(@Nullable String str) {
        this.zzm = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzl(@Nullable TypeFilter typeFilter) {
        this.zzi = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzks zzm(List list) {
        this.zzj = zznx.zzj(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final zzkt zzn() {
        AutocompleteActivityMode autocompleteActivityMode;
        zznx zznxVar;
        zzkr zzkrVar;
        zznx zznxVar2;
        zznx zznxVar3;
        if (this.zzn == 3 && (autocompleteActivityMode = this.zza) != null && (zznxVar = this.zzb) != null && (zzkrVar = this.zzc) != null && (zznxVar2 = this.zzh) != null && (zznxVar3 = this.zzj) != null) {
            return new zzkm(autocompleteActivityMode, zznxVar, zzkrVar, this.zzd, this.zze, this.zzf, this.zzg, zznxVar2, this.zzi, zznxVar3, this.zzk, this.zzl, this.zzm);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" mode");
        }
        if (this.zzb == null) {
            sb.append(" placeFields");
        }
        if (this.zzc == null) {
            sb.append(" origin");
        }
        if (this.zzh == null) {
            sb.append(" countries");
        }
        if (this.zzj == null) {
            sb.append(" typesFilter");
        }
        if ((this.zzn & 1) == 0) {
            sb.append(" primaryColor");
        }
        if ((this.zzn & 2) == 0) {
            sb.append(" primaryColorDark");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public zzkj() {
    }
}
