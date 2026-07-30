package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;
import p149l.mts0;
import p149l.s050;
import p149l.uyl;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "NativeAdLayoutInfoParcelCreator")
public final class zzbxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxr> CREATOR = new mts0();

    @SafeParcelable.Field(getter = "getAdViewAsBinder", m12463id = 1, type = "android.os.IBinder")
    public final View zza;

    @SafeParcelable.Field(getter = "getAssetViewMapAsBinder", m12463id = 2, type = "android.os.IBinder")
    public final Map zzb;

    @SafeParcelable.Constructor
    public zzbxr(@SafeParcelable.Param(m12464id = 1) IBinder iBinder, @SafeParcelable.Param(m12464id = 2) IBinder iBinder2) {
        this.zza = (View) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder));
        this.zzb = (Map) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        View view = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, s050.m181848Y2(view).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, s050.m181848Y2(this.zzb).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
