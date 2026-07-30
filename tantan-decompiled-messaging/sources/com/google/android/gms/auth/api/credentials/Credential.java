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
import p149l.ig3;
import p149l.kxs0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CredentialCreator")
@SafeParcelable.Reserved({1000})
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new kxs0();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";

    @SafeParcelable.Field(getter = "getId", m12463id = 1)
    private final String mId;

    @Nullable
    @SafeParcelable.Field(getter = "getName", m12463id = 2)
    private final String mName;

    @Nullable
    @SafeParcelable.Field(getter = "getProfilePictureUri", m12463id = 3)
    private final Uri zzo;

    @SafeParcelable.Field(getter = "getIdTokens", m12463id = 4)
    private final List<IdToken> zzp;

    @Nullable
    @SafeParcelable.Field(getter = "getPassword", m12463id = 5)
    private final String zzq;

    @Nullable
    @SafeParcelable.Field(getter = "getAccountType", m12463id = 6)
    private final String zzr;

    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", m12463id = 9)
    private final String zzs;

    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", m12463id = 10)
    private final String zzt;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    public static class C2077a {

        /* JADX INFO: renamed from: a */
        public final String f9751a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String f9752b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Uri f9753c;

        /* JADX INFO: renamed from: d */
        public List<IdToken> f9754d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public String f9755e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public String f9756f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f9757g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f9758h;

        public C2077a(String str) {
            this.f9751a = str;
        }

        /* JADX INFO: renamed from: a */
        public Credential m12371a() {
            return new Credential(this.f9751a, this.f9752b, this.f9753c, this.f9754d, this.f9755e, this.f9756f, this.f9757g, this.f9758h);
        }

        /* JADX INFO: renamed from: b */
        public C2077a m12372b(String str) {
            this.f9752b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C2077a m12373c(@Nullable String str) {
            this.f9755e = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2077a m12374d(Uri uri) {
            this.f9753c = uri;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public Credential(@SafeParcelable.Param(m12464id = 1) String str, @Nullable @SafeParcelable.Param(m12464id = 2) String str2, @Nullable @SafeParcelable.Param(m12464id = 3) Uri uri, @SafeParcelable.Param(m12464id = 4) List<IdToken> list, @Nullable @SafeParcelable.Param(m12464id = 5) String str3, @Nullable @SafeParcelable.Param(m12464id = 6) String str4, @Nullable @SafeParcelable.Param(m12464id = 9) String str5, @Nullable @SafeParcelable.Param(m12464id = 10) String str6) {
        String strTrim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            ig3.m135964a("Password must not be empty if set");
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
                ig3.m135964a("Account type must be a valid Http/Https URI");
                throw null;
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            ig3.m135964a("Password and AccountType are mutually exclusive");
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
    public String m12365F() {
        return this.zzr;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public String m12366H() {
        return this.zzt;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public String m12367I() {
        return this.zzs;
    }

    /* JADX INFO: renamed from: J */
    public String m12368J() {
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

    /* JADX INFO: renamed from: g0 */
    public List<IdToken> m12369g0() {
        return this.zzp;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    @Nullable
    public String getPassword() {
        return this.zzq;
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public Uri m12370h0() {
        return this.zzo;
    }

    public int hashCode() {
        return Objects.hashCode(this.mId, this.mName, this.zzo, this.zzq, this.zzr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, m12368J(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, m12370h0(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, m12369g0(), false);
        SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 6, m12365F(), false);
        SafeParcelWriter.writeString(parcel, 9, m12367I(), false);
        SafeParcelWriter.writeString(parcel, 10, m12366H(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
