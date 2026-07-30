package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;
import p153l.f7t0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "RewardItemParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzcag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcag> CREATOR = new f7t0();

    @SafeParcelable.Field(m12517id = 2)
    public final String zza;

    @SafeParcelable.Field(m12517id = 3)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzcag(@SafeParcelable.Param(m12518id = 2) String str, @SafeParcelable.Param(m12518id = 3) int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static zzcag m13610g(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcag(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcag)) {
            zzcag zzcagVar = (zzcag) obj;
            if (Objects.equal(this.zza, zzcagVar.zza)) {
                if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcagVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
