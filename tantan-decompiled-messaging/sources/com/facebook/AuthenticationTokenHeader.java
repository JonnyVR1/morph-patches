package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ark0;
import p149l.ig3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 (2\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0015R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u0015¨\u0006)"}, m87232d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "", "encodedHeaderString", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;)V", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "c", "()Lorg/json/JSONObject;", "headerString", "b", "(Ljava/lang/String;)Z", "alg", "Ljava/lang/String;", "getAlg", "typ", "getTyp", "kid", "a", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class AuthenticationTokenHeader implements Parcelable {

    @NotNull
    private final String alg;

    @NotNull
    private final String kid;

    @NotNull
    private final String typ;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new C1495a();

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenHeader$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/AuthenticationTokenHeader$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/AuthenticationTokenHeader;", "", "size", "", "b", "(I)[Lcom/facebook/AuthenticationTokenHeader;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1495a implements Parcelable.Creator<AuthenticationTokenHeader> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new AuthenticationTokenHeader(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader[] newArray(int size) {
            return new AuthenticationTokenHeader[size];
        }
    }

    public AuthenticationTokenHeader(@NotNull String str) throws JSONException {
        str.getClass();
        if (!m7459b(str)) {
            ig3.m135964a("Invalid Header");
            throw null;
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        bArrDecode.getClass();
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, Charsets.UTF_8));
        String string = jSONObject.getString("alg");
        string.getClass();
        this.alg = string;
        String string2 = jSONObject.getString("typ");
        string2.getClass();
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        string3.getClass();
        this.kid = string3;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7459b(String headerString) {
        ark0.m98518g(headerString, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(headerString, 0);
        bArrDecode.getClass();
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, Charsets.UTF_8));
            String strOptString = jSONObject.optString("alg");
            strOptString.getClass();
            boolean z = strOptString.length() > 0 && Intrinsics.m87488d(strOptString, "RS256");
            String strOptString2 = jSONObject.optString("kid");
            strOptString2.getClass();
            boolean z2 = strOptString2.length() > 0;
            String strOptString3 = jSONObject.optString("typ");
            strOptString3.getClass();
            return z && z2 && (strOptString3.length() > 0);
        } catch (JSONException unused) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final JSONObject m7460c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put("typ", this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) other;
        return Intrinsics.m87488d(this.alg, authenticationTokenHeader.alg) && Intrinsics.m87488d(this.typ, authenticationTokenHeader.typ) && Intrinsics.m87488d(this.kid, authenticationTokenHeader.kid);
    }

    public int hashCode() {
        return ((((527 + this.alg.hashCode()) * 31) + this.typ.hashCode()) * 31) + this.kid.hashCode();
    }

    @NotNull
    public String toString() {
        String string = m7460c().toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.alg);
        dest.writeString(this.typ);
        dest.writeString(this.kid);
    }

    public AuthenticationTokenHeader(@NotNull Parcel parcel) {
        parcel.getClass();
        this.alg = ark0.m98522k(parcel.readString(), "alg");
        this.typ = ark0.m98522k(parcel.readString(), "typ");
        this.kid = ark0.m98522k(parcel.readString(), "kid");
    }

    public AuthenticationTokenHeader(@NotNull JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("alg");
        string.getClass();
        this.alg = string;
        String string2 = jSONObject.getString("typ");
        string2.getClass();
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        string3.getClass();
        this.kid = string3;
    }
}
