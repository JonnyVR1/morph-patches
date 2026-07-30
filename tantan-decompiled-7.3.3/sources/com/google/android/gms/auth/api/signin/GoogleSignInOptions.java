package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.g7r0;
import p153l.iig0;
import p153l.oyk;
import p153l.q7r0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    @NonNull
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;

    @NonNull
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;

    @NonNull
    @VisibleForTesting
    public static final Scope zaa = new Scope("profile");

    @NonNull
    @VisibleForTesting
    public static final Scope zab = new Scope("email");

    @NonNull
    @VisibleForTesting
    public static final Scope zac = new Scope("openid");

    @NonNull
    @VisibleForTesting
    public static final Scope zad;

    @NonNull
    @VisibleForTesting
    public static final Scope zae;
    private static final Comparator zag;

    @SafeParcelable.VersionField(m12520id = 1)
    final int zaf;

    @SafeParcelable.Field(getter = "getScopes", m12517id = 2)
    private final ArrayList zah;

    @Nullable
    @SafeParcelable.Field(getter = "getAccount", m12517id = 3)
    private Account zai;

    @SafeParcelable.Field(getter = "isIdTokenRequested", m12517id = 4)
    private boolean zaj;

    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", m12517id = 5)
    private final boolean zak;

    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", m12517id = 6)
    private final boolean zal;

    @Nullable
    @SafeParcelable.Field(getter = "getServerClientId", m12517id = 7)
    private String zam;

    @Nullable
    @SafeParcelable.Field(getter = "getHostedDomain", m12517id = 8)
    private String zan;

    @SafeParcelable.Field(getter = "getExtensions", m12517id = 9)
    private ArrayList zao;

    @Nullable
    @SafeParcelable.Field(getter = "getLogSessionId", m12517id = 10)
    private String zap;
    private Map zaq;

    static {
        Scope scope = new Scope(Scopes.GAMES_LITE);
        zad = scope;
        zae = new Scope(Scopes.GAMES);
        C2103a c2103a = new C2103a();
        c2103a.m12489c();
        c2103a.m12491e();
        DEFAULT_SIGN_IN = c2103a.m12487a();
        C2103a c2103a2 = new C2103a();
        c2103a2.m12492f(scope, new Scope[0]);
        DEFAULT_GAMES_SIGN_IN = c2103a2.m12487a();
        CREATOR = new q7r0();
        zag = new g7r0();
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, Map map, @Nullable String str3) {
        this.zaf = i;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z;
        this.zak = z2;
        this.zal = z3;
        this.zam = str;
        this.zan = str2;
        this.zao = new ArrayList(map.values());
        this.zaq = map;
        this.zap = str3;
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public static GoogleSignInOptions m12468l0(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(com.p051p1.mobile.putong.data.Scopes.TYPE);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, AccountType.GOOGLE) : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: renamed from: w0 */
    public static Map m12478w0(@Nullable List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: F */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> m12479F() {
        return this.zao;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: H */
    public String m12480H() {
        return this.zap;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: I */
    public ArrayList<Scope> m12481I() {
        return new ArrayList<>(this.zah);
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: J */
    public String m12482J() {
        return this.zam;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.zao.isEmpty() && googleSignInOptions.zao.isEmpty() && this.zah.size() == googleSignInOptions.m12481I().size() && this.zah.containsAll(googleSignInOptions.m12481I())) {
                Account account = this.zai;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                        if (TextUtils.isEmpty(this.zam)) {
                            if (TextUtils.isEmpty(googleSignInOptions.m12482J())) {
                                if (this.zal != googleSignInOptions.m12483h0() && this.zaj == googleSignInOptions.m12484i0() && this.zak == googleSignInOptions.m12485j0() && TextUtils.equals(this.zap, googleSignInOptions.m12480H())) {
                                    return true;
                                }
                            }
                        } else if (!this.zam.equals(googleSignInOptions.m12482J())) {
                            if (this.zal != googleSignInOptions.m12483h0()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.getAccount())) {
                    if (TextUtils.isEmpty(this.zam)) {
                        if (TextUtils.isEmpty(googleSignInOptions.m12482J())) {
                            if (this.zal != googleSignInOptions.m12483h0()) {
                            }
                        }
                    } else if (!this.zam.equals(googleSignInOptions.m12482J())) {
                        if (this.zal != googleSignInOptions.m12483h0()) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    @Nullable
    @KeepForSdk
    public Account getAccount() {
        return this.zai;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: h0 */
    public boolean m12483h0() {
        return this.zal;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).getScopeUri());
        }
        Collections.sort(arrayList);
        oyk oykVar = new oyk();
        oykVar.m169872a(arrayList);
        oykVar.m169872a(this.zai);
        oykVar.m169872a(this.zam);
        oykVar.m169874c(this.zal);
        oykVar.m169874c(this.zaj);
        oykVar.m169874c(this.zak);
        oykVar.m169872a(this.zap);
        return oykVar.m169873b();
    }

    @KeepForSdk
    /* JADX INFO: renamed from: i0 */
    public boolean m12484i0() {
        return this.zaj;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: j0 */
    public boolean m12485j0() {
        return this.zak;
    }

    @NonNull
    /* JADX INFO: renamed from: p0 */
    public final String m12486p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zah, zag);
            Iterator it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).getScopeUri());
            }
            jSONObject.put(com.p051p1.mobile.putong.data.Scopes.TYPE, jSONArray);
            Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zaf;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeTypedList(parcel, 2, m12481I(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, m12484i0());
        SafeParcelWriter.writeBoolean(parcel, 5, m12485j0());
        SafeParcelWriter.writeBoolean(parcel, 6, m12483h0());
        SafeParcelWriter.writeString(parcel, 7, m12482J(), false);
        SafeParcelWriter.writeString(parcel, 8, this.zan, false);
        SafeParcelWriter.writeTypedList(parcel, 9, m12479F(), false);
        SafeParcelWriter.writeString(parcel, 10, m12480H(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GoogleSignInOptions(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) ArrayList arrayList, @Nullable @SafeParcelable.Param(m12518id = 3) Account account, @SafeParcelable.Param(m12518id = 4) boolean z, @SafeParcelable.Param(m12518id = 5) boolean z2, @SafeParcelable.Param(m12518id = 6) boolean z3, @Nullable @SafeParcelable.Param(m12518id = 7) String str, @Nullable @SafeParcelable.Param(m12518id = 8) String str2, @SafeParcelable.Param(m12518id = 9) ArrayList arrayList2, @Nullable @SafeParcelable.Param(m12518id = 10) String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m12478w0(arrayList2), str3);
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C2103a {

        /* JADX INFO: renamed from: a */
        public Set f9807a;

        /* JADX INFO: renamed from: b */
        public boolean f9808b;

        /* JADX INFO: renamed from: c */
        public boolean f9809c;

        /* JADX INFO: renamed from: d */
        public boolean f9810d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public String f9811e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public Account f9812f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f9813g;

        /* JADX INFO: renamed from: h */
        public Map f9814h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public String f9815i;

        public C2103a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f9807a = new HashSet();
            this.f9814h = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            this.f9807a = new HashSet(googleSignInOptions.zah);
            this.f9808b = googleSignInOptions.zak;
            this.f9809c = googleSignInOptions.zal;
            this.f9810d = googleSignInOptions.zaj;
            this.f9811e = googleSignInOptions.zam;
            this.f9812f = googleSignInOptions.zai;
            this.f9813g = googleSignInOptions.zan;
            this.f9814h = GoogleSignInOptions.m12478w0(googleSignInOptions.zao);
            this.f9815i = googleSignInOptions.zap;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public GoogleSignInOptions m12487a() {
            if (this.f9807a.contains(GoogleSignInOptions.zae)) {
                Set set = this.f9807a;
                Scope scope = GoogleSignInOptions.zad;
                if (set.contains(scope)) {
                    this.f9807a.remove(scope);
                }
            }
            if (this.f9810d && (this.f9812f == null || !this.f9807a.isEmpty())) {
                m12489c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f9807a), this.f9812f, this.f9810d, this.f9808b, this.f9809c, this.f9811e, this.f9813g, this.f9814h, this.f9815i);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C2103a m12488b() {
            this.f9807a.add(GoogleSignInOptions.zab);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C2103a m12489c() {
            this.f9807a.add(GoogleSignInOptions.zac);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C2103a m12490d(@NonNull String str) {
            this.f9810d = true;
            m12494h(str);
            this.f9811e = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public C2103a m12491e() {
            this.f9807a.add(GoogleSignInOptions.zaa);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public C2103a m12492f(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f9807a.add(scope);
            this.f9807a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        @KeepForSdk
        /* JADX INFO: renamed from: g */
        public C2103a m12493g(@NonNull String str) {
            this.f9815i = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final String m12494h(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.f9811e;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.checkArgument(z, "two different server client ids provided");
            return str;
        }

        public C2103a() {
            this.f9807a = new HashSet();
            this.f9814h = new HashMap();
        }
    }
}
