package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzmx extends zzlt {
    final CharSequence zzb;
    final zzma zzc;
    int zzd = 0;
    int zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public zzmx(zzmy zzmyVar, CharSequence charSequence) {
        this.zzc = zzmyVar.zza;
        this.zzb = charSequence;
    }

    @Override // com.google.android.libraries.places.internal.zzlt
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i2);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzd = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzd = iZzc;
            }
            if (iZzc != i) {
                while (i < iZzd && this.zzc.zza(this.zzb.charAt(i))) {
                    i++;
                }
                while (iZzd > i) {
                    int i3 = iZzd - 1;
                    if (!this.zzc.zza(this.zzb.charAt(i3))) {
                        break;
                    }
                    iZzd = i3;
                }
                int i4 = this.zze;
                if (i4 == 1) {
                    iZzd = this.zzb.length();
                    this.zzd = -1;
                    while (iZzd > i) {
                        int i5 = iZzd - 1;
                        if (!this.zzc.zza(this.zzb.charAt(i5))) {
                            break;
                        }
                        iZzd = i5;
                    }
                } else {
                    this.zze = i4 - 1;
                }
                return this.zzb.subSequence(i, iZzd).toString();
            }
            int i6 = iZzc + 1;
            this.zzd = i6;
            if (i6 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
