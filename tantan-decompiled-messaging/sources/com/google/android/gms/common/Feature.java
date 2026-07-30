package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.p046p1.mobile.putong.data.User;
import com.sina.weibo.sdk.constant.WBConstants;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getName", m12463id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getOldVersion", m12463id = 2)
    @Deprecated
    private final int zzb;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getVersion", m12463id = 3)
    private final long zzc;

    @KeepForSdk
    public Feature(@NonNull String str, long j) {
        this.zza = str;
        this.zzc = j;
        this.zzb = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.zza;
    }

    @KeepForSdk
    public long getVersion() {
        long j = this.zzc;
        return j == -1 ? this.zzb : j;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add(AuthenticationTokenClaims.JSON_KEY_NAME, getName());
        stringHelper.add(WBConstants.AUTH_PARAMS_VERSION, Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public Feature(@NonNull @SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) int i, @SafeParcelable.Param(m12464id = 3) long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
    }
}
