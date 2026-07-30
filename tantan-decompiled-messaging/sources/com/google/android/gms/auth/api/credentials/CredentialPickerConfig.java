package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.atu0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new atu0();

    @SafeParcelable.Field(getter = "shouldShowCancelButton", m12463id = 2)
    private final boolean mShowCancelButton;

    @SafeParcelable.Field(m12463id = 1000)
    private final int zzv;

    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", m12463id = 1)
    private final boolean zzw;

    @SafeParcelable.Field(getter = "isForNewAccount", m12463id = 3)
    @Deprecated
    private final boolean zzx;

    @SafeParcelable.Field(getter = "getPromptInternalId", m12463id = 4)
    private final int zzy;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C2078a {

        /* JADX INFO: renamed from: a */
        public boolean f9759a = false;

        /* JADX INFO: renamed from: b */
        public boolean f9760b = true;

        /* JADX INFO: renamed from: c */
        public int f9761c = 1;

        /* JADX INFO: renamed from: a */
        public CredentialPickerConfig m12381a() {
            return new CredentialPickerConfig(this);
        }
    }

    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(m12464id = 1000) int i, @SafeParcelable.Param(m12464id = 1) boolean z, @SafeParcelable.Param(m12464id = 2) boolean z2, @SafeParcelable.Param(m12464id = 3) boolean z3, @SafeParcelable.Param(m12464id = 4) int i2) {
        this.zzv = i;
        this.zzw = z;
        this.mShowCancelButton = z2;
        if (i < 2) {
            this.zzx = z3;
            this.zzy = z3 ? 3 : 1;
        } else {
            this.zzx = i2 == 3;
            this.zzy = i2;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: F */
    public final boolean m12375F() {
        return this.zzy == 3;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m12376H() {
        return this.zzw;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m12377I() {
        return this.mShowCancelButton;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, m12376H());
        SafeParcelWriter.writeBoolean(parcel, 2, m12377I());
        SafeParcelWriter.writeBoolean(parcel, 3, m12375F());
        SafeParcelWriter.writeInt(parcel, 4, this.zzy);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public CredentialPickerConfig(C2078a c2078a) {
        this(2, c2078a.f9759a, c2078a.f9760b, false, c2078a.f9761c);
    }
}
