package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.ciw0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CredentialRequestCreator")
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new ciw0();

    @SafeParcelable.Field(getter = "isPasswordLoginSupported", m12463id = 1)
    private final boolean zzaa;

    @SafeParcelable.Field(getter = "getAccountTypes", m12463id = 2)
    private final String[] zzab;

    @SafeParcelable.Field(getter = "getCredentialPickerConfig", m12463id = 3)
    private final CredentialPickerConfig zzac;

    @SafeParcelable.Field(getter = "getCredentialHintPickerConfig", m12463id = 4)
    private final CredentialPickerConfig zzad;

    @SafeParcelable.Field(getter = "isIdTokenRequested", m12463id = 5)
    private final boolean zzae;

    @Nullable
    @SafeParcelable.Field(getter = "getServerClientId", m12463id = 6)
    private final String zzaf;

    @Nullable
    @SafeParcelable.Field(getter = "getIdTokenNonce", m12463id = 7)
    private final String zzag;

    @SafeParcelable.Field(getter = "getRequireUserMediation", m12463id = 8)
    private final boolean zzah;

    @SafeParcelable.Field(m12463id = 1000)
    private final int zzv;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$a */
    public static final class C2079a {

        /* JADX INFO: renamed from: a */
        public boolean f9762a;

        /* JADX INFO: renamed from: b */
        public String[] f9763b;

        /* JADX INFO: renamed from: c */
        public CredentialPickerConfig f9764c;

        /* JADX INFO: renamed from: d */
        public CredentialPickerConfig f9765d;

        /* JADX INFO: renamed from: e */
        public boolean f9766e = false;

        /* JADX INFO: renamed from: f */
        public boolean f9767f = false;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f9768g = null;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f9769h;

        /* JADX INFO: renamed from: a */
        public final CredentialRequest m12396a() {
            if (this.f9763b == null) {
                this.f9763b = new String[0];
            }
            if (this.f9762a || this.f9763b.length != 0) {
                return new CredentialRequest(this);
            }
            qkq0.m175383a("At least one authentication method must be specified");
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final C2079a m12397b(boolean z) {
            this.f9762a = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CredentialRequest(@SafeParcelable.Param(m12464id = 1000) int i, @SafeParcelable.Param(m12464id = 1) boolean z, @SafeParcelable.Param(m12464id = 2) String[] strArr, @Nullable @SafeParcelable.Param(m12464id = 3) CredentialPickerConfig credentialPickerConfig, @Nullable @SafeParcelable.Param(m12464id = 4) CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(m12464id = 5) boolean z2, @Nullable @SafeParcelable.Param(m12464id = 6) String str, @Nullable @SafeParcelable.Param(m12464id = 7) String str2, @SafeParcelable.Param(m12464id = 8) boolean z3) {
        this.zzv = i;
        this.zzaa = z;
        this.zzab = (String[]) Preconditions.checkNotNull(strArr);
        this.zzac = credentialPickerConfig == null ? new CredentialPickerConfig.C2078a().m12381a() : credentialPickerConfig;
        this.zzad = credentialPickerConfig2 == null ? new CredentialPickerConfig.C2078a().m12381a() : credentialPickerConfig2;
        if (i < 3) {
            this.zzae = true;
            this.zzaf = null;
            this.zzag = null;
        } else {
            this.zzae = z2;
            this.zzaf = str;
            this.zzag = str2;
        }
        this.zzah = z3;
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public final String[] m12382F() {
        return this.zzab;
    }

    @NonNull
    /* JADX INFO: renamed from: H */
    public final CredentialPickerConfig m12383H() {
        return this.zzad;
    }

    @NonNull
    /* JADX INFO: renamed from: I */
    public final CredentialPickerConfig m12384I() {
        return this.zzac;
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public final String m12385J() {
        return this.zzag;
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public final String m12386g0() {
        return this.zzaf;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m12387h0() {
        return this.zzae;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m12388i0() {
        return this.zzaa;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, m12388i0());
        SafeParcelWriter.writeStringArray(parcel, 2, m12382F(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, m12384I(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, m12383H(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, m12387h0());
        SafeParcelWriter.writeString(parcel, 6, m12386g0(), false);
        SafeParcelWriter.writeString(parcel, 7, m12385J(), false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzah);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public CredentialRequest(C2079a c2079a) {
        this(4, c2079a.f9762a, c2079a.f9763b, c2079a.f9764c, c2079a.f9765d, c2079a.f9766e, c2079a.f9768g, c2079a.f9769h, false);
    }
}
