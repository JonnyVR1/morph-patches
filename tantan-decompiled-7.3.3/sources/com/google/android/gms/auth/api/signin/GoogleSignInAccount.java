package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.a7r0;
import p153l.iig0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a7r0();

    @NonNull
    @VisibleForTesting
    public static final Clock zaa = DefaultClock.getInstance();

    @SafeParcelable.VersionField(m12520id = 1)
    final int zab;

    @SafeParcelable.Field(m12517id = 10)
    final List zac;

    @Nullable
    @SafeParcelable.Field(getter = "getId", m12517id = 2)
    private final String zad;

    @Nullable
    @SafeParcelable.Field(getter = "getIdToken", m12517id = 3)
    private final String zae;

    @Nullable
    @SafeParcelable.Field(getter = "getEmail", m12517id = 4)
    private final String zaf;

    @Nullable
    @SafeParcelable.Field(getter = "getDisplayName", m12517id = 5)
    private final String zag;

    @Nullable
    @SafeParcelable.Field(getter = "getPhotoUrl", m12517id = 6)
    private final Uri zah;

    @Nullable
    @SafeParcelable.Field(getter = "getServerAuthCode", m12517id = 7)
    private String zai;

    @SafeParcelable.Field(getter = "getExpirationTimeSecs", m12517id = 8)
    private final long zaj;

    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", m12517id = 9)
    private final String zak;

    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", m12517id = 11)
    private final String zal;

    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", m12517id = 12)
    private final String zam;
    private final Set zan = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(m12518id = 1) int i, @Nullable @SafeParcelable.Param(m12518id = 2) String str, @Nullable @SafeParcelable.Param(m12518id = 3) String str2, @Nullable @SafeParcelable.Param(m12518id = 4) String str3, @Nullable @SafeParcelable.Param(m12518id = 5) String str4, @Nullable @SafeParcelable.Param(m12518id = 6) Uri uri, @Nullable @SafeParcelable.Param(m12518id = 7) String str5, @SafeParcelable.Param(m12518id = 8) long j, @SafeParcelable.Param(m12518id = 9) String str6, @SafeParcelable.Param(m12518id = 10) List list, @Nullable @SafeParcelable.Param(m12518id = 11) String str7, @Nullable @SafeParcelable.Param(m12518id = 12) String str8) {
        this.zab = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    @NonNull
    /* JADX INFO: renamed from: m0 */
    public static GoogleSignInAccount m12454m0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l2, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l2.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: n0 */
    public static GoogleSignInAccount m12455n0(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccountM12454m0 = m12454m0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountM12454m0.zai = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountM12454m0;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public String m12456F() {
        return this.zag;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public String m12457H() {
        return this.zaf;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public String m12458I() {
        return this.zam;
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public String m12459J() {
        return this.zal;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.zak.equals(this.zak) && googleSignInAccount.m12463k0().equals(m12463k0());
    }

    @Nullable
    public Account getAccount() {
        String str = this.zaf;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public String m12460h0() {
        return this.zad;
    }

    public int hashCode() {
        return ((this.zak.hashCode() + 527) * 31) + m12463k0().hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public String m12461i0() {
        return this.zae;
    }

    @Nullable
    /* JADX INFO: renamed from: j0 */
    public Uri m12462j0() {
        return this.zah;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: k0 */
    public Set<Scope> m12463k0() {
        HashSet hashSet = new HashSet(this.zac);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public String m12464l0() {
        return this.zai;
    }

    @NonNull
    /* JADX INFO: renamed from: o0 */
    public final String m12465o0() {
        return this.zak;
    }

    @NonNull
    /* JADX INFO: renamed from: p0 */
    public final String m12466p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m12460h0() != null) {
                jSONObject.put("id", m12460h0());
            }
            if (m12461i0() != null) {
                jSONObject.put("tokenId", m12461i0());
            }
            if (m12457H() != null) {
                jSONObject.put("email", m12457H());
            }
            if (m12456F() != null) {
                jSONObject.put("displayName", m12456F());
            }
            if (m12459J() != null) {
                jSONObject.put("givenName", m12459J());
            }
            if (m12458I() != null) {
                jSONObject.put("familyName", m12458I());
            }
            Uri uriM12462j0 = m12462j0();
            if (uriM12462j0 != null) {
                jSONObject.put("photoUrl", uriM12462j0.toString());
            }
            if (m12464l0() != null) {
                jSONObject.put("serverAuthCode", m12464l0());
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            JSONArray jSONArray = new JSONArray();
            List list = this.zac;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: l.v6r0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zab);
        SafeParcelWriter.writeString(parcel, 2, m12460h0(), false);
        SafeParcelWriter.writeString(parcel, 3, m12461i0(), false);
        SafeParcelWriter.writeString(parcel, 4, m12457H(), false);
        SafeParcelWriter.writeString(parcel, 5, m12456F(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, m12462j0(), i, false);
        SafeParcelWriter.writeString(parcel, 7, m12464l0(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zaj);
        SafeParcelWriter.writeString(parcel, 9, this.zak, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zac, false);
        SafeParcelWriter.writeString(parcel, 11, m12459J(), false);
        SafeParcelWriter.writeString(parcel, 12, m12458I(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
