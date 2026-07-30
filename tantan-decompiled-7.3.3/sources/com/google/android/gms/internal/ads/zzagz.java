package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p153l.axs0;
import p153l.lev0;
import p153l.mpw0;
import p153l.yjr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagz extends zzagr {
    public static final Parcelable.Creator<zzagz> CREATOR = new yjr0();

    @Nullable
    public final String zza;

    @Deprecated
    public final String zzb;
    public final zzgaa zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzagz(String str, @Nullable String str2, List list) {
        super(str);
        lev0.m153956d(!list.isEmpty());
        this.zza = str2;
        zzgaa zzgaaVarZzj = zzgaa.zzj(list);
        this.zzc = zzgaaVarZzj;
        this.zzb = (String) zzgaaVarZzj.get(0);
    }

    /* JADX INFO: renamed from: a */
    public static List m13594a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x01d3, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x01d3, blocks: (B:59:0x00f3, B:72:0x0148, B:74:0x0151, B:76:0x015d, B:92:0x01ac), top: B:103:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzagr, com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: a0 */
    public final void mo13592a0(axs0 axs0Var) {
        String[] strArrSplit;
        Integer numValueOf;
        String str = this.zzf;
        try {
            switch (str.hashCode()) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    axs0Var.m100827v((CharSequence) this.zzc.get(0));
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    axs0Var.m100829x((CharSequence) this.zzc.get(0));
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) this.zzc.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    axs0Var.m100813C(Integer.valueOf(i));
                    axs0Var.m100812B(Integer.valueOf(i2));
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    axs0Var.m100828w((CharSequence) this.zzc.get(0));
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    axs0Var.m100826u((CharSequence) this.zzc.get(0));
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    axs0Var.m100830y((CharSequence) this.zzc.get(0));
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) this.zzc.get(0);
                    int i3 = mpw0.f137957a;
                    strArrSplit = str3.split("/", -1);
                    int i4 = Integer.parseInt(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    } else {
                        numValueOf = null;
                    }
                    axs0Var.m100821K(Integer.valueOf(i4));
                    axs0Var.m100820J(numValueOf);
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    axs0Var.m100819I((CharSequence) this.zzc.get(0));
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    axs0Var.m100822L((CharSequence) this.zzc.get(0));
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    axs0Var.m100814D(Integer.valueOf(Integer.parseInt((String) this.zzc.get(0))));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    axs0Var.m100827v((CharSequence) this.zzc.get(0));
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    axs0Var.m100829x((CharSequence) this.zzc.get(0));
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str4 = (String) this.zzc.get(0);
                    int i5 = Integer.parseInt(str4.substring(2, 4));
                    int i6 = Integer.parseInt(str4.substring(0, 2));
                    axs0Var.m100813C(Integer.valueOf(i5));
                    axs0Var.m100812B(Integer.valueOf(i6));
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        List listM13594a = m13594a((String) this.zzc.get(0));
                        int size = listM13594a.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    axs0Var.m100812B((Integer) listM13594a.get(2));
                                }
                            }
                            axs0Var.m100813C((Integer) listM13594a.get(1));
                        }
                        axs0Var.m100814D((Integer) listM13594a.get(0));
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        List listM13594a2 = m13594a((String) this.zzc.get(0));
                        int size2 = listM13594a2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    axs0Var.m100815E((Integer) listM13594a2.get(2));
                                }
                            }
                            axs0Var.m100816F((Integer) listM13594a2.get(1));
                        }
                        axs0Var.m100817G((Integer) listM13594a2.get(0));
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    axs0Var.m100822L((CharSequence) this.zzc.get(0));
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    axs0Var.m100819I((CharSequence) this.zzc.get(0));
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    axs0Var.m100828w((CharSequence) this.zzc.get(0));
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    axs0Var.m100826u((CharSequence) this.zzc.get(0));
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    axs0Var.m100830y((CharSequence) this.zzc.get(0));
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str5 = (String) this.zzc.get(0);
                    int i7 = mpw0.f137957a;
                    strArrSplit = str5.split("/", -1);
                    int i8 = Integer.parseInt(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    } else {
                        numValueOf = null;
                    }
                    axs0Var.m100821K(Integer.valueOf(i8));
                    axs0Var.m100820J(numValueOf);
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    axs0Var.m100814D(Integer.valueOf(Integer.parseInt((String) this.zzc.get(0))));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagz.class == obj.getClass()) {
            zzagz zzagzVar = (zzagz) obj;
            if (mpw0.m159408f(this.zzf, zzagzVar.zzf) && mpw0.m159408f(this.zza, zzagzVar.zza) && this.zzc.equals(zzagzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }
}
