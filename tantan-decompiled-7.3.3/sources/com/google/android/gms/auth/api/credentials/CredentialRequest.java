package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.irw0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CredentialRequestCreator")
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new irw0();

    @SafeParcelable.Field(getter = "isPasswordLoginSupported", m12517id = 1)
    private final boolean zzaa;

    @SafeParcelable.Field(getter = "getAccountTypes", m12517id = 2)
    private final String[] zzab;

    @SafeParcelable.Field(getter = "getCredentialPickerConfig", m12517id = 3)
    private final CredentialPickerConfig zzac;

    @SafeParcelable.Field(getter = "getCredentialHintPickerConfig", m12517id = 4)
    private final CredentialPickerConfig zzad;

    @SafeParcelable.Field(getter = "isIdTokenRequested", m12517id = 5)
    private final boolean zzae;

    @Nullable
    @SafeParcelable.Field(getter = "getServerClientId", m12517id = 6)
    private final String zzaf;

    @Nullable
    @SafeParcelable.Field(getter = "getIdTokenNonce", m12517id = 7)
    private final String zzag;

    @SafeParcelable.Field(getter = "getRequireUserMediation", m12517id = 8)
    private final boolean zzah;

    @SafeParcelable.Field(m12517id = 1000)
    private final int zzv;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$a */
    public static final class C2102a {

        /* JADX INFO: renamed from: a */
        public boolean f9799a;

        /* JADX INFO: renamed from: b */
        public String[] f9800b;

        /* JADX INFO: renamed from: c */
        public CredentialPickerConfig f9801c;

        /* JADX INFO: renamed from: d */
        public CredentialPickerConfig f9802d;

        /* JADX INFO: renamed from: e */
        public boolean f9803e = false;

        /* JADX INFO: renamed from: f */
        public boolean f9804f = false;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f9805g = null;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f9806h;

        /* JADX INFO: renamed from: a */
        public final CredentialRequest m12450a() {
            if (this.f9800b == null) {
                this.f9800b = new String[0];
            }
            if (this.f9799a || this.f9800b.length != 0) {
                return new CredentialRequest(this);
            }
            wtq0.m207906a("At least one authentication method must be specified");
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final C2102a m12451b(boolean z) {
            this.f9799a = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CredentialRequest(@SafeParcelable.Param(m12518id = 1000) int i, @SafeParcelable.Param(m12518id = 1) boolean z, @SafeParcelable.Param(m12518id = 2) String[] strArr, @Nullable @SafeParcelable.Param(m12518id = 3) CredentialPickerConfig credentialPickerConfig, @Nullable @SafeParcelable.Param(m12518id = 4) CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(m12518id = 5) boolean z2, @Nullable @SafeParcelable.Param(m12518id = 6) String str, @Nullable @SafeParcelable.Param(m12518id = 7) String str2, @SafeParcelable.Param(m12518id = 8) boolean z3) {
        this.zzv = i;
        this.zzaa = z;
        this.zzab = (String[]) Preconditions.checkNotNull(strArr);
        this.zzac = credentialPickerConfig == null ? new CredentialPickerConfig.C2101a().m12435a() : credentialPickerConfig;
        this.zzad = credentialPickerConfig2 == null ? new CredentialPickerConfig.C2101a().m12435a() : credentialPickerConfig2;
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
    public final String[] m12436F() {
        return this.zzab;
    }

    @NonNull
    /* JADX INFO: renamed from: H */
    public final CredentialPickerConfig m12437H() {
        return this.zzad;
    }

    @NonNull
    /* JADX INFO: renamed from: I */
    public final CredentialPickerConfig m12438I() {
        return this.zzac;
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public final String m12439J() {
        return this.zzag;
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public final String m12440h0() {
        return this.zzaf;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m12441i0() {
        return this.zzae;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m12442j0() {
        return this.zzaa;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, m12442j0());
        SafeParcelWriter.writeStringArray(parcel, 2, m12436F(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, m12438I(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, m12437H(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, m12441i0());
        SafeParcelWriter.writeString(parcel, 6, m12440h0(), false);
        SafeParcelWriter.writeString(parcel, 7, m12439J(), false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzah);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public CredentialRequest(C2102a c2102a) {
        this(4, c2102a.f9799a, c2102a.f9800b, c2102a.f9801c, c2102a.f9802d, c2102a.f9803e, c2102a.f9805g, c2102a.f9806h, false);
    }
}
