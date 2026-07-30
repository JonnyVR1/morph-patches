package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ark0;
import p149l.h850;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u0001\rB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J/\u0010!\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%¨\u00064"}, m87232d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "", "token", "expectedNonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;)V", "b", "()Lorg/json/JSONObject;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "headerString", "claimsString", "sigString", "kid", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getExpectedNonce", "Lcom/facebook/AuthenticationTokenHeader;", AuthenticationToken.HEADER_KEY, "Lcom/facebook/AuthenticationTokenHeader;", "getHeader", "()Lcom/facebook/AuthenticationTokenHeader;", "Lcom/facebook/AuthenticationTokenClaims;", AuthenticationToken.CLAIMS_KEY, "Lcom/facebook/AuthenticationTokenClaims;", "getClaims", "()Lcom/facebook/AuthenticationTokenClaims;", "signature", "getSignature", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class AuthenticationToken implements Parcelable {

    @NotNull
    public static final String AUTHENTICATION_TOKEN_KEY = "id_token";

    @NotNull
    private static final String CLAIMS_KEY = "claims";

    @NotNull
    private static final String EXPECTED_NONCE_KEY = "expected_nonce";

    @NotNull
    private static final String HEADER_KEY = "header";

    @NotNull
    private static final String SIGNATURE_KEY = "signature";

    @NotNull
    private static final String TOKEN_STRING_KEY = "token_string";

    @NotNull
    private final AuthenticationTokenClaims claims;

    @NotNull
    private final String expectedNonce;

    @NotNull
    private final AuthenticationTokenHeader header;

    @NotNull
    private final String signature;

    @NotNull
    private final String token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new C1491a();

    /* JADX INFO: renamed from: com.facebook.AuthenticationToken$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/AuthenticationToken$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/AuthenticationToken;", "", "size", "", "b", "(I)[Lcom/facebook/AuthenticationToken;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1491a implements Parcelable.Creator<AuthenticationToken> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new AuthenticationToken(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken[] newArray(int size) {
            return new AuthenticationToken[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationToken$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m87232d2 = {"Lcom/facebook/AuthenticationToken$b;", "", "<init>", "()V", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "", "a", "(Lcom/facebook/AuthenticationToken;)V", "", "AUTHENTICATION_TOKEN_KEY", "Ljava/lang/String;", "CLAIMS_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "EXPECTED_NONCE_KEY", "HEADER_KEY", "SIGNATURE_KEY", "TOKEN_STRING_KEY", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m7451a(@Nullable AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.INSTANCE.m7469a().m7467e(authenticationToken);
        }

        public Companion() {
        }
    }

    @JvmOverloads
    public AuthenticationToken(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        ark0.m98518g(str, "token");
        ark0.m98518g(str2, "expectedNonce");
        List listSplit$default = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        if (listSplit$default.size() != 3) {
            ig3.m135964a("Invalid IdToken string");
            throw null;
        }
        String str3 = (String) listSplit$default.get(0);
        String str4 = (String) listSplit$default.get(1);
        String str5 = (String) listSplit$default.get(2);
        this.token = str;
        this.expectedNonce = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.header = authenticationTokenHeader;
        this.claims = new AuthenticationTokenClaims(str4, str2);
        if (m7447a(str3, str4, str5, authenticationTokenHeader.getKid())) {
            this.signature = str5;
        } else {
            ig3.m135964a("Invalid Signature");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7447a(String headerString, String claimsString, String sigString, String kid) {
        try {
            String strM129878c = h850.m129878c(kid);
            if (strM129878c == null) {
                return false;
            }
            return h850.m129879d(h850.m129877b(strM129878c), headerString + '.' + claimsString, sigString);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JSONObject m7448b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TOKEN_STRING_KEY, this.token);
        jSONObject.put(EXPECTED_NONCE_KEY, this.expectedNonce);
        jSONObject.put(HEADER_KEY, this.header.m7460c());
        jSONObject.put(CLAIMS_KEY, this.claims.m7453b());
        jSONObject.put("signature", this.signature);
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
        if (!(other instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) other;
        return Intrinsics.m87488d(this.token, authenticationToken.token) && Intrinsics.m87488d(this.expectedNonce, authenticationToken.expectedNonce) && Intrinsics.m87488d(this.header, authenticationToken.header) && Intrinsics.m87488d(this.claims, authenticationToken.claims) && Intrinsics.m87488d(this.signature, authenticationToken.signature);
    }

    public int hashCode() {
        return ((((((((527 + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.token);
        dest.writeString(this.expectedNonce);
        dest.writeParcelable(this.header, flags);
        dest.writeParcelable(this.claims, flags);
        dest.writeString(this.signature);
    }

    public AuthenticationToken(@NotNull Parcel parcel) {
        parcel.getClass();
        this.token = ark0.m98522k(parcel.readString(), "token");
        this.expectedNonce = ark0.m98522k(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable != null) {
            this.header = (AuthenticationTokenHeader) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (parcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) parcelable2;
                this.signature = ark0.m98522k(parcel.readString(), "signature");
                return;
            } else {
                qkq0.m175383a("Required value was null.");
                throw null;
            }
        }
        qkq0.m175383a("Required value was null.");
        throw null;
    }

    public AuthenticationToken(@NotNull JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString(TOKEN_STRING_KEY);
        string.getClass();
        this.token = string;
        String string2 = jSONObject.getString(EXPECTED_NONCE_KEY);
        string2.getClass();
        this.expectedNonce = string2;
        String string3 = jSONObject.getString("signature");
        string3.getClass();
        this.signature = string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject(HEADER_KEY);
        JSONObject jSONObject3 = jSONObject.getJSONObject(CLAIMS_KEY);
        jSONObject2.getClass();
        this.header = new AuthenticationTokenHeader(jSONObject2);
        AuthenticationTokenClaims.Companion c1494b = AuthenticationTokenClaims.INSTANCE;
        jSONObject3.getClass();
        this.claims = c1494b.m7456a(jSONObject3);
    }
}
