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
import p149l.aag0;
import p149l.uxq0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new uxq0();

    @NonNull
    @VisibleForTesting
    public static final Clock zaa = DefaultClock.getInstance();

    @SafeParcelable.VersionField(m12466id = 1)
    final int zab;

    @SafeParcelable.Field(m12463id = 10)
    final List zac;

    @Nullable
    @SafeParcelable.Field(getter = "getId", m12463id = 2)
    private final String zad;

    @Nullable
    @SafeParcelable.Field(getter = "getIdToken", m12463id = 3)
    private final String zae;

    @Nullable
    @SafeParcelable.Field(getter = "getEmail", m12463id = 4)
    private final String zaf;

    @Nullable
    @SafeParcelable.Field(getter = "getDisplayName", m12463id = 5)
    private final String zag;

    @Nullable
    @SafeParcelable.Field(getter = "getPhotoUrl", m12463id = 6)
    private final Uri zah;

    @Nullable
    @SafeParcelable.Field(getter = "getServerAuthCode", m12463id = 7)
    private String zai;

    @SafeParcelable.Field(getter = "getExpirationTimeSecs", m12463id = 8)
    private final long zaj;

    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", m12463id = 9)
    private final String zak;

    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", m12463id = 11)
    private final String zal;

    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", m12463id = 12)
    private final String zam;
    private final Set zan = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(m12464id = 1) int i, @Nullable @SafeParcelable.Param(m12464id = 2) String str, @Nullable @SafeParcelable.Param(m12464id = 3) String str2, @Nullable @SafeParcelable.Param(m12464id = 4) String str3, @Nullable @SafeParcelable.Param(m12464id = 5) String str4, @Nullable @SafeParcelable.Param(m12464id = 6) Uri uri, @Nullable @SafeParcelable.Param(m12464id = 7) String str5, @SafeParcelable.Param(m12464id = 8) long j, @SafeParcelable.Param(m12464id = 9) String str6, @SafeParcelable.Param(m12464id = 10) List list, @Nullable @SafeParcelable.Param(m12464id = 11) String str7, @Nullable @SafeParcelable.Param(m12464id = 12) String str8) {
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
    /* JADX INFO: renamed from: l0 */
    public static GoogleSignInAccount m12400l0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l2, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l2.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: m0 */
    public static GoogleSignInAccount m12401m0(@Nullable String str) throws JSONException {
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
        GoogleSignInAccount googleSignInAccountM12400l0 = m12400l0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountM12400l0.zai = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountM12400l0;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public String m12402F() {
        return this.zag;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public String m12403H() {
        return this.zaf;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public String m12404I() {
        return this.zam;
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public String m12405J() {
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
        return googleSignInAccount.zak.equals(this.zak) && googleSignInAccount.m12409j0().equals(m12409j0());
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public String m12406g0() {
        return this.zad;
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
    public String m12407h0() {
        return this.zae;
    }

    public int hashCode() {
        return ((this.zak.hashCode() + 527) * 31) + m12409j0().hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public Uri m12408i0() {
        return this.zah;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: j0 */
    public Set<Scope> m12409j0() {
        HashSet hashSet = new HashSet(this.zac);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public String m12410k0() {
        return this.zai;
    }

    @NonNull
    /* JADX INFO: renamed from: n0 */
    public final String m12411n0() {
        return this.zak;
    }

    @NonNull
    /* JADX INFO: renamed from: o0 */
    public final String m12412o0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m12406g0() != null) {
                jSONObject.put("id", m12406g0());
            }
            if (m12407h0() != null) {
                jSONObject.put("tokenId", m12407h0());
            }
            if (m12403H() != null) {
                jSONObject.put("email", m12403H());
            }
            if (m12402F() != null) {
                jSONObject.put("displayName", m12402F());
            }
            if (m12405J() != null) {
                jSONObject.put("givenName", m12405J());
            }
            if (m12404I() != null) {
                jSONObject.put("familyName", m12404I());
            }
            Uri uriM12408i0 = m12408i0();
            if (uriM12408i0 != null) {
                jSONObject.put("photoUrl", uriM12408i0.toString());
            }
            if (m12410k0() != null) {
                jSONObject.put("serverAuthCode", m12410k0());
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            JSONArray jSONArray = new JSONArray();
            List list = this.zac;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: l.pxq0
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
            aag0.m95543a(e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zab);
        SafeParcelWriter.writeString(parcel, 2, m12406g0(), false);
        SafeParcelWriter.writeString(parcel, 3, m12407h0(), false);
        SafeParcelWriter.writeString(parcel, 4, m12403H(), false);
        SafeParcelWriter.writeString(parcel, 5, m12402F(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, m12408i0(), i, false);
        SafeParcelWriter.writeString(parcel, 7, m12410k0(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zaj);
        SafeParcelWriter.writeString(parcel, 9, this.zak, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zac, false);
        SafeParcelWriter.writeString(parcel, 11, m12405J(), false);
        SafeParcelWriter.writeString(parcel, 12, m12404I(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
