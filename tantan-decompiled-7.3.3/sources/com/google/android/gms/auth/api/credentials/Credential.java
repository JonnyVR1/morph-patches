package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import p153l.q6t0;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CredentialCreator")
@SafeParcelable.Reserved({1000})
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new q6t0();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";

    @SafeParcelable.Field(getter = "getId", m12517id = 1)
    private final String mId;

    @Nullable
    @SafeParcelable.Field(getter = "getName", m12517id = 2)
    private final String mName;

    @Nullable
    @SafeParcelable.Field(getter = "getProfilePictureUri", m12517id = 3)
    private final Uri zzo;

    @SafeParcelable.Field(getter = "getIdTokens", m12517id = 4)
    private final List<IdToken> zzp;

    @Nullable
    @SafeParcelable.Field(getter = "getPassword", m12517id = 5)
    private final String zzq;

    @Nullable
    @SafeParcelable.Field(getter = "getAccountType", m12517id = 6)
    private final String zzr;

    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", m12517id = 9)
    private final String zzs;

    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", m12517id = 10)
    private final String zzt;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    public static class C2100a {

        /* JADX INFO: renamed from: a */
        public final String f9788a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String f9789b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Uri f9790c;

        /* JADX INFO: renamed from: d */
        public List<IdToken> f9791d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public String f9792e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public String f9793f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f9794g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f9795h;

        public C2100a(String str) {
            this.f9788a = str;
        }

        /* JADX INFO: renamed from: a */
        public Credential m12425a() {
            return new Credential(this.f9788a, this.f9789b, this.f9790c, this.f9791d, this.f9792e, this.f9793f, this.f9794g, this.f9795h);
        }

        /* JADX INFO: renamed from: b */
        public C2100a m12426b(String str) {
            this.f9789b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C2100a m12427c(@Nullable String str) {
            this.f9792e = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2100a m12428d(Uri uri) {
            this.f9790c = uri;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public Credential(@SafeParcelable.Param(m12518id = 1) String str, @Nullable @SafeParcelable.Param(m12518id = 2) String str2, @Nullable @SafeParcelable.Param(m12518id = 3) Uri uri, @SafeParcelable.Param(m12518id = 4) List<IdToken> list, @Nullable @SafeParcelable.Param(m12518id = 5) String str3, @Nullable @SafeParcelable.Param(m12518id = 6) String str4, @Nullable @SafeParcelable.Param(m12518id = 9) String str5, @Nullable @SafeParcelable.Param(m12518id = 10) String str6) {
        String strTrim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            wg3.m206174a("Password must not be empty if set");
            throw null;
        }
        if (str4 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri uri2 = Uri.parse(str4);
                if (uri2.isAbsolute() && uri2.isHierarchical() && !TextUtils.isEmpty(uri2.getScheme()) && !TextUtils.isEmpty(uri2.getAuthority()) && ("http".equalsIgnoreCase(uri2.getScheme()) || "https".equalsIgnoreCase(uri2.getScheme()))) {
                    z = true;
                }
            }
            if (!z) {
                wg3.m206174a("Account type must be a valid Http/Https URI");
                throw null;
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            wg3.m206174a("Password and AccountType are mutually exclusive");
            throw null;
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.mName = str2;
        this.zzo = uri;
        this.zzp = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.mId = strTrim;
        this.zzq = str3;
        this.zzr = str4;
        this.zzs = str5;
        this.zzt = str6;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public String m12419F() {
        return this.zzr;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public String m12420H() {
        return this.zzt;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public String m12421I() {
        return this.zzs;
    }

    /* JADX INFO: renamed from: J */
    public String m12422J() {
        return this.mId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.mId, credential.mId) && TextUtils.equals(this.mName, credential.mName) && Objects.equal(this.zzo, credential.zzo) && TextUtils.equals(this.zzq, credential.zzq) && TextUtils.equals(this.zzr, credential.zzr);
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    @Nullable
    public String getPassword() {
        return this.zzq;
    }

    /* JADX INFO: renamed from: h0 */
    public List<IdToken> m12423h0() {
        return this.zzp;
    }

    public int hashCode() {
        return Objects.hashCode(this.mId, this.mName, this.zzo, this.zzq, this.zzr);
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public Uri m12424i0() {
        return this.zzo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, m12422J(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, m12424i0(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, m12423h0(), false);
        SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 6, m12419F(), false);
        SafeParcelWriter.writeString(parcel, 9, m12421I(), false);
        SafeParcelWriter.writeString(parcel, 10, m12420H(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
