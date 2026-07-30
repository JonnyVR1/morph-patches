package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;
import p153l.h950;
import p153l.p1m;
import p153l.s2t0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "NativeAdLayoutInfoParcelCreator")
public final class zzbxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxr> CREATOR = new s2t0();

    @SafeParcelable.Field(getter = "getAdViewAsBinder", m12517id = 1, type = "android.os.IBinder")
    public final View zza;

    @SafeParcelable.Field(getter = "getAssetViewMapAsBinder", m12517id = 2, type = "android.os.IBinder")
    public final Map zzb;

    @SafeParcelable.Constructor
    public zzbxr(@SafeParcelable.Param(m12518id = 1) IBinder iBinder, @SafeParcelable.Param(m12518id = 2) IBinder iBinder2) {
        this.zza = (View) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder));
        this.zzb = (Map) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        View view = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, h950.m134038Y2(view).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, h950.m134038Y2(this.zzb).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
