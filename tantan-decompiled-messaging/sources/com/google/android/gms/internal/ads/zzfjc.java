package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.d1s0;
import p149l.l0w0;
import p149l.m0w0;
import p149l.m7s0;
import p149l.n0w0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzfjc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfjc> CREATOR = new n0w0();
    public final Context zza;
    public final zzfiz zzb;

    @SafeParcelable.Field(m12463id = 2)
    public final int zzc;

    @SafeParcelable.Field(m12463id = 3)
    public final int zzd;

    @SafeParcelable.Field(m12463id = 4)
    public final int zze;

    @SafeParcelable.Field(m12463id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfiz[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", m12463id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", m12463id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", m12463id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfjc(Context context, zzfiz zzfizVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfiz.values();
        this.zzl = l0w0.m148124a();
        this.zzm = m0w0.m152547a();
        this.zza = context;
        this.zzi = zzfizVar.ordinal();
        this.zzb = zzfizVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }

    /* JADX INFO: renamed from: g */
    public static zzfjc m13748g(zzfiz zzfizVar, Context context) {
        if (zzfizVar == zzfiz.Rewarded) {
            return new zzfjc(context, zzfizVar, ((Integer) d1s0.m109677c().m144697a(m7s0.f132409t6)).intValue(), ((Integer) d1s0.m109677c().m144697a(m7s0.f132481z6)).intValue(), ((Integer) d1s0.m109677c().m144697a(m7s0.f131863B6)).intValue(), (String) d1s0.m109677c().m144697a(m7s0.f131887D6), (String) d1s0.m109677c().m144697a(m7s0.f132433v6), (String) d1s0.m109677c().m144697a(m7s0.f132457x6));
        }
        if (zzfizVar == zzfiz.Interstitial) {
            return new zzfjc(context, zzfizVar, ((Integer) d1s0.m109677c().m144697a(m7s0.f132421u6)).intValue(), ((Integer) d1s0.m109677c().m144697a(m7s0.f131851A6)).intValue(), ((Integer) d1s0.m109677c().m144697a(m7s0.f131875C6)).intValue(), (String) d1s0.m109677c().m144697a(m7s0.f131899E6), (String) d1s0.m109677c().m144697a(m7s0.f132445w6), (String) d1s0.m109677c().m144697a(m7s0.f132469y6));
        }
        if (zzfizVar != zzfiz.AppOpen) {
            return null;
        }
        return new zzfjc(context, zzfizVar, ((Integer) d1s0.m109677c().m144697a(m7s0.f131935H6)).intValue(), ((Integer) d1s0.m109677c().m144697a(m7s0.f131959J6)).intValue(), ((Integer) d1s0.m109677c().m144697a(m7s0.f131971K6)).intValue(), (String) d1s0.m109677c().m144697a(m7s0.f131911F6), (String) d1s0.m109677c().m144697a(m7s0.f131923G6), (String) d1s0.m109677c().m144697a(m7s0.f131947I6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfjc(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) int i2, @SafeParcelable.Param(m12464id = 3) int i3, @SafeParcelable.Param(m12464id = 4) int i4, @SafeParcelable.Param(m12464id = 5) String str, @SafeParcelable.Param(m12464id = 6) int i5, @SafeParcelable.Param(m12464id = 7) int i6) {
        zzfiz[] zzfizVarArrValues = zzfiz.values();
        this.zzh = zzfizVarArrValues;
        int[] iArrM148124a = l0w0.m148124a();
        this.zzl = iArrM148124a;
        int[] iArrM152547a = m0w0.m152547a();
        this.zzm = iArrM152547a;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfizVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrM148124a[i5];
        this.zzk = i6;
        int i7 = iArrM152547a[i6];
    }
}
