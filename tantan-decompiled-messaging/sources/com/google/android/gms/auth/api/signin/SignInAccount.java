package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.vut0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new vut0();

    @SafeParcelable.Field(defaultValue = "", m12463id = 4)
    @Deprecated
    private String zzbv;

    @SafeParcelable.Field(getter = "getGoogleSignInAccount", m12463id = 7)
    private GoogleSignInAccount zzbw;

    @SafeParcelable.Field(defaultValue = "", m12463id = 8)
    @Deprecated
    private String zzbx;

    @SafeParcelable.Constructor
    public SignInAccount(@SafeParcelable.Param(m12464id = 4) String str, @SafeParcelable.Param(m12464id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(m12464id = 8) String str2) {
        this.zzbw = googleSignInAccount;
        this.zzbv = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zzbx = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzbw;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.zzbv, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzbw, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzbx, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
