package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.g2v0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new g2v0();

    @SafeParcelable.Field(getter = "shouldShowCancelButton", m12517id = 2)
    private final boolean mShowCancelButton;

    @SafeParcelable.Field(m12517id = 1000)
    private final int zzv;

    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", m12517id = 1)
    private final boolean zzw;

    @SafeParcelable.Field(getter = "isForNewAccount", m12517id = 3)
    @Deprecated
    private final boolean zzx;

    @SafeParcelable.Field(getter = "getPromptInternalId", m12517id = 4)
    private final int zzy;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C2101a {

        /* JADX INFO: renamed from: a */
        public boolean f9796a = false;

        /* JADX INFO: renamed from: b */
        public boolean f9797b = true;

        /* JADX INFO: renamed from: c */
        public int f9798c = 1;

        /* JADX INFO: renamed from: a */
        public CredentialPickerConfig m12435a() {
            return new CredentialPickerConfig(this);
        }
    }

    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(m12518id = 1000) int i, @SafeParcelable.Param(m12518id = 1) boolean z, @SafeParcelable.Param(m12518id = 2) boolean z2, @SafeParcelable.Param(m12518id = 3) boolean z3, @SafeParcelable.Param(m12518id = 4) int i2) {
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
    public final boolean m12429F() {
        return this.zzy == 3;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m12430H() {
        return this.zzw;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m12431I() {
        return this.mShowCancelButton;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, m12430H());
        SafeParcelWriter.writeBoolean(parcel, 2, m12431I());
        SafeParcelWriter.writeBoolean(parcel, 3, m12429F());
        SafeParcelWriter.writeInt(parcel, 4, this.zzy);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public CredentialPickerConfig(C2101a c2101a) {
        this(2, c2101a.f9796a, c2101a.f9797b, false, c2101a.f9798c);
    }
}
