package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.swy0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdValueParcelCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new swy0();

    @SafeParcelable.Field(m12517id = 1)
    public final int zza;

    @SafeParcelable.Field(m12517id = 2)
    public final int zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final String zzc;

    @SafeParcelable.Field(m12517id = 4)
    public final long zzd;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) int i2, @SafeParcelable.Param(m12518id = 3) String str, @SafeParcelable.Param(m12518id = 4) long j) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = j;
    }

    /* JADX INFO: renamed from: g */
    public static zzs m12312g(JSONObject jSONObject) throws JSONException {
        return new zzs(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(FirebaseAnalytics.Param.CURRENCY), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
