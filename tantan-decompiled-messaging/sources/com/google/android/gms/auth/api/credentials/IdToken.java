package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.nux0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "IdTokenCreator")
@SafeParcelable.Reserved({1000})
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new nux0();

    @NonNull
    @SafeParcelable.Field(getter = "getIdToken", m12463id = 2)
    private final String zzal;

    @NonNull
    @SafeParcelable.Field(getter = "getAccountType", m12463id = 1)
    private final String zzr;

    @SafeParcelable.Constructor
    public IdToken(@NonNull @SafeParcelable.Param(m12464id = 1) String str, @NonNull @SafeParcelable.Param(m12464id = 2) String str2) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        Preconditions.checkArgument(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.zzr = str;
        this.zzal = str2;
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public final String m12398F() {
        return this.zzr;
    }

    @NonNull
    /* JADX INFO: renamed from: H */
    public final String m12399H() {
        return this.zzal;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return Objects.equal(this.zzr, idToken.zzr) && Objects.equal(this.zzal, idToken.zzal);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, m12398F(), false);
        SafeParcelWriter.writeString(parcel, 2, m12399H(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
