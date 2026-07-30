package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.auy0;
import p149l.yvk;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new auy0();

    @SafeParcelable.Field(getter = "getConsumerPkgName", m12463id = 2)
    private final String zzcm;

    @SafeParcelable.Field(getter = "getGoogleConfig", m12463id = 5)
    private GoogleSignInOptions zzcn;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param(m12464id = 2) String str, @SafeParcelable.Param(m12464id = 5) GoogleSignInOptions googleSignInOptions) {
        this.zzcm = Preconditions.checkNotEmpty(str);
        this.zzcn = googleSignInOptions;
    }

    /* JADX INFO: renamed from: F */
    public final GoogleSignInOptions m12443F() {
        return this.zzcn;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.zzcm.equals(signInConfiguration.zzcm)) {
            GoogleSignInOptions googleSignInOptions = this.zzcn;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.zzcn;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new yvk().m216224a(this.zzcm).m216224a(this.zzcn).m216225b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzcm, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzcn, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
