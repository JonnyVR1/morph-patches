package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.jas0;
import p153l.r9w0;
import p153l.s9w0;
import p153l.sgs0;
import p153l.t9w0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzfjc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfjc> CREATOR = new t9w0();
    public final Context zza;
    public final zzfiz zzb;

    @SafeParcelable.Field(m12517id = 2)
    public final int zzc;

    @SafeParcelable.Field(m12517id = 3)
    public final int zzd;

    @SafeParcelable.Field(m12517id = 4)
    public final int zze;

    @SafeParcelable.Field(m12517id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfiz[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", m12517id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", m12517id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", m12517id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfjc(Context context, zzfiz zzfizVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfiz.values();
        this.zzl = r9w0.m180661a();
        this.zzm = s9w0.m185249a();
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
    public static zzfjc m13802g(zzfiz zzfizVar, Context context) {
        if (zzfizVar == zzfiz.Rewarded) {
            return new zzfjc(context, zzfizVar, ((Integer) jas0.m144075c().m176505a(sgs0.f168480t6)).intValue(), ((Integer) jas0.m144075c().m176505a(sgs0.f168552z6)).intValue(), ((Integer) jas0.m144075c().m176505a(sgs0.f167934B6)).intValue(), (String) jas0.m144075c().m176505a(sgs0.f167958D6), (String) jas0.m144075c().m176505a(sgs0.f168504v6), (String) jas0.m144075c().m176505a(sgs0.f168528x6));
        }
        if (zzfizVar == zzfiz.Interstitial) {
            return new zzfjc(context, zzfizVar, ((Integer) jas0.m144075c().m176505a(sgs0.f168492u6)).intValue(), ((Integer) jas0.m144075c().m176505a(sgs0.f167922A6)).intValue(), ((Integer) jas0.m144075c().m176505a(sgs0.f167946C6)).intValue(), (String) jas0.m144075c().m176505a(sgs0.f167970E6), (String) jas0.m144075c().m176505a(sgs0.f168516w6), (String) jas0.m144075c().m176505a(sgs0.f168540y6));
        }
        if (zzfizVar != zzfiz.AppOpen) {
            return null;
        }
        return new zzfjc(context, zzfizVar, ((Integer) jas0.m144075c().m176505a(sgs0.f168006H6)).intValue(), ((Integer) jas0.m144075c().m176505a(sgs0.f168030J6)).intValue(), ((Integer) jas0.m144075c().m176505a(sgs0.f168042K6)).intValue(), (String) jas0.m144075c().m176505a(sgs0.f167982F6), (String) jas0.m144075c().m176505a(sgs0.f167994G6), (String) jas0.m144075c().m176505a(sgs0.f168018I6));
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
    public zzfjc(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) int i2, @SafeParcelable.Param(m12518id = 3) int i3, @SafeParcelable.Param(m12518id = 4) int i4, @SafeParcelable.Param(m12518id = 5) String str, @SafeParcelable.Param(m12518id = 6) int i5, @SafeParcelable.Param(m12518id = 7) int i6) {
        zzfiz[] zzfizVarArrValues = zzfiz.values();
        this.zzh = zzfizVarArrValues;
        int[] iArrM180661a = r9w0.m180661a();
        this.zzl = iArrM180661a;
        int[] iArrM185249a = s9w0.m185249a();
        this.zzm = iArrM185249a;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfizVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrM180661a[i5];
        this.zzk = i6;
        int i7 = iArrM185249a[i6];
    }
}
