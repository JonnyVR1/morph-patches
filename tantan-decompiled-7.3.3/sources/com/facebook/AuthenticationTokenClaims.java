package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.C1680e;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.g0l0;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010\"\n\u0002\b\r\u0018\u0000 T2\u00020\u0001:\u00016B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0087\u0002\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u001fB\u0011\b\u0010\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u0005\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0019H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u00102J\u000f\u00106\u001a\u00020#H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b:\u00104R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b;\u00104R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b<\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b@\u0010?R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bA\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bB\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bC\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\bD\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bE\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bF\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bG\u00104R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010H8\u0006¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\bL\u00104R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\bN\u0010OR%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010M\u001a\u0004\bP\u0010OR%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010M\u001a\u0004\bQ\u0010OR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\bR\u00104R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\bS\u00104¨\u0006U"}, m88121d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "", "encodedClaims", "expectedNonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", AuthenticationTokenClaims.JSON_KEY_JIT, AuthenticationTokenClaims.JSON_KEY_ISS, AuthenticationTokenClaims.JSON_KEY_AUD, "nonce", "", AuthenticationTokenClaims.JSON_KEY_EXP, AuthenticationTokenClaims.JSON_KEY_IAT, AuthenticationTokenClaims.JSON_KEY_SUB, AuthenticationTokenClaims.JSON_KEY_NAME, "givenName", "middleName", "familyName", "email", "picture", "", "userFriends", "userBirthday", "", "", "userAgeRange", "userHometown", "userLocation", "userGender", "userLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lorg/json/JSONObject;", "claimsJson", "", "a", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "b", "()Lorg/json/JSONObject;", "Ljava/lang/String;", "getJti", "getIss", "getAud", "getNonce", "J", "getExp", "()J", "getIat", "getSub", "getName", "getGivenName", "getMiddleName", "getFamilyName", "getEmail", "getPicture", "", "Ljava/util/Set;", "getUserFriends", "()Ljava/util/Set;", "getUserBirthday", "Ljava/util/Map;", "getUserAgeRange", "()Ljava/util/Map;", "getUserHometown", "getUserLocation", "getUserGender", "getUserLink", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class AuthenticationTokenClaims implements Parcelable {

    @NotNull
    public static final String JSON_KEY_AUD = "aud";

    @NotNull
    public static final String JSON_KEY_EMAIL = "email";

    @NotNull
    public static final String JSON_KEY_EXP = "exp";

    @NotNull
    public static final String JSON_KEY_FAMILY_NAME = "family_name";

    @NotNull
    public static final String JSON_KEY_GIVEN_NAME = "given_name";

    @NotNull
    public static final String JSON_KEY_IAT = "iat";

    @NotNull
    public static final String JSON_KEY_ISS = "iss";

    @NotNull
    public static final String JSON_KEY_JIT = "jti";

    @NotNull
    public static final String JSON_KEY_MIDDLE_NAME = "middle_name";

    @NotNull
    public static final String JSON_KEY_NAME = "name";

    @NotNull
    public static final String JSON_KEY_NONCE = "nonce";

    @NotNull
    public static final String JSON_KEY_PICTURE = "picture";

    @NotNull
    public static final String JSON_KEY_SUB = "sub";

    @NotNull
    public static final String JSON_KEY_USER_AGE_RANGE = "user_age_range";

    @NotNull
    public static final String JSON_KEY_USER_BIRTHDAY = "user_birthday";

    @NotNull
    public static final String JSON_KEY_USER_FRIENDS = "user_friends";

    @NotNull
    public static final String JSON_KEY_USER_GENDER = "user_gender";

    @NotNull
    public static final String JSON_KEY_USER_HOMETOWN = "user_hometown";

    @NotNull
    public static final String JSON_KEY_USER_LINK = "user_link";

    @NotNull
    public static final String JSON_KEY_USER_LOCATION = "user_location";
    public static final long MAX_TIME_SINCE_TOKEN_ISSUED = 600000;

    @NotNull
    private final String aud;

    @Nullable
    private final String email;
    private final long exp;

    @Nullable
    private final String familyName;

    @Nullable
    private final String givenName;
    private final long iat;

    @NotNull
    private final String iss;

    @NotNull
    private final String jti;

    @Nullable
    private final String middleName;

    @Nullable
    private final String name;

    @NotNull
    private final String nonce;

    @Nullable
    private final String picture;

    @NotNull
    private final String sub;

    @Nullable
    private final Map<String, Integer> userAgeRange;

    @Nullable
    private final String userBirthday;

    @Nullable
    private final Set<String> userFriends;

    @Nullable
    private final String userGender;

    @Nullable
    private final Map<String, String> userHometown;

    @Nullable
    private final String userLink;

    @Nullable
    private final Map<String, String> userLocation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new C1516a();

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenClaims$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/AuthenticationTokenClaims$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/AuthenticationTokenClaims;", "", "size", "", "b", "(I)[Lcom/facebook/AuthenticationTokenClaims;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C1516a implements Parcelable.Creator<AuthenticationTokenClaims> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new AuthenticationTokenClaims(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int size) {
            return new AuthenticationTokenClaims[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenClaims$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0011R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0011R\u0014\u0010&\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m88121d2 = {"Lcom/facebook/AuthenticationTokenClaims$b;", "", "<init>", "()V", "Lorg/json/JSONObject;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "b", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "jsonObject", "Lcom/facebook/AuthenticationTokenClaims;", "a", "(Lorg/json/JSONObject;)Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "JSON_KEY_AUD", "Ljava/lang/String;", "JSON_KEY_EMAIL", "JSON_KEY_EXP", "JSON_KEY_FAMILY_NAME", "JSON_KEY_GIVEN_NAME", "JSON_KEY_IAT", "JSON_KEY_ISS", "JSON_KEY_JIT", "JSON_KEY_MIDDLE_NAME", "JSON_KEY_NAME", "JSON_KEY_NONCE", "JSON_KEY_PICTURE", "JSON_KEY_SUB", "JSON_KEY_USER_AGE_RANGE", "JSON_KEY_USER_BIRTHDAY", "JSON_KEY_USER_FRIENDS", "JSON_KEY_USER_GENDER", "JSON_KEY_USER_HOMETOWN", "JSON_KEY_USER_LINK", "JSON_KEY_USER_LOCATION", "", "MAX_TIME_SINCE_TOKEN_ISSUED", "J", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final AuthenticationTokenClaims m7510a(@NotNull JSONObject jsonObject) throws JSONException {
            jsonObject.getClass();
            String string = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_JIT);
            String string2 = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_ISS);
            String string3 = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_AUD);
            String string4 = jsonObject.getString("nonce");
            long j = jsonObject.getLong(AuthenticationTokenClaims.JSON_KEY_EXP);
            long j2 = jsonObject.getLong(AuthenticationTokenClaims.JSON_KEY_IAT);
            String string5 = jsonObject.getString(AuthenticationTokenClaims.JSON_KEY_SUB);
            String strM7511b = m7511b(jsonObject, AuthenticationTokenClaims.JSON_KEY_NAME);
            String strM7511b2 = m7511b(jsonObject, AuthenticationTokenClaims.JSON_KEY_GIVEN_NAME);
            String strM7511b3 = m7511b(jsonObject, AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME);
            String strM7511b4 = m7511b(jsonObject, AuthenticationTokenClaims.JSON_KEY_FAMILY_NAME);
            String strM7511b5 = m7511b(jsonObject, "email");
            String strM7511b6 = m7511b(jsonObject, "picture");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(AuthenticationTokenClaims.JSON_KEY_USER_FRIENDS);
            String strM7511b7 = m7511b(jsonObject, AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_AGE_RANGE);
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_HOMETOWN);
            JSONObject jSONObjectOptJSONObject3 = jsonObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION);
            String strM7511b8 = m7511b(jsonObject, AuthenticationTokenClaims.JSON_KEY_USER_GENDER);
            String strM7511b9 = m7511b(jsonObject, AuthenticationTokenClaims.JSON_KEY_USER_LINK);
            string.getClass();
            string2.getClass();
            string3.getClass();
            string4.getClass();
            string5.getClass();
            return new AuthenticationTokenClaims(string, string2, string3, string4, j, j2, string5, strM7511b, strM7511b2, strM7511b3, strM7511b4, strM7511b5, strM7511b6, jSONArrayOptJSONArray == null ? null : C1680e.m8893g0(jSONArrayOptJSONArray), strM7511b7, jSONObjectOptJSONObject == null ? null : C1680e.m8906o(jSONObjectOptJSONObject), jSONObjectOptJSONObject2 == null ? null : C1680e.m8908p(jSONObjectOptJSONObject2), jSONObjectOptJSONObject3 != null ? C1680e.m8908p(jSONObjectOptJSONObject3) : null, strM7511b8, strM7511b9);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final String m7511b(@NotNull JSONObject jSONObject, @NotNull String str) {
            jSONObject.getClass();
            str.getClass();
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        public Companion() {
        }
    }

    @JvmOverloads
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2) throws JSONException {
        str.getClass();
        str2.getClass();
        g0l0.m128436g(str, "encodedClaims");
        byte[] bArrDecode = Base64.decode(str, 8);
        bArrDecode.getClass();
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, Charsets.UTF_8));
        if (!m7506a(jSONObject, str2)) {
            wg3.m206174a("Invalid claims");
            throw null;
        }
        String string = jSONObject.getString(JSON_KEY_JIT);
        string.getClass();
        this.jti = string;
        String string2 = jSONObject.getString(JSON_KEY_ISS);
        string2.getClass();
        this.iss = string2;
        String string3 = jSONObject.getString(JSON_KEY_AUD);
        string3.getClass();
        this.aud = string3;
        String string4 = jSONObject.getString("nonce");
        string4.getClass();
        this.nonce = string4;
        this.exp = jSONObject.getLong(JSON_KEY_EXP);
        this.iat = jSONObject.getLong(JSON_KEY_IAT);
        String string5 = jSONObject.getString(JSON_KEY_SUB);
        string5.getClass();
        this.sub = string5;
        Companion companion = INSTANCE;
        this.name = companion.m7511b(jSONObject, JSON_KEY_NAME);
        this.givenName = companion.m7511b(jSONObject, JSON_KEY_GIVEN_NAME);
        this.middleName = companion.m7511b(jSONObject, JSON_KEY_MIDDLE_NAME);
        this.familyName = companion.m7511b(jSONObject, JSON_KEY_FAMILY_NAME);
        this.email = companion.m7511b(jSONObject, "email");
        this.picture = companion.m7511b(jSONObject, "picture");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(JSON_KEY_USER_FRIENDS);
        this.userFriends = jSONArrayOptJSONArray == null ? null : Collections.unmodifiableSet(C1680e.m8891f0(jSONArrayOptJSONArray));
        this.userBirthday = companion.m7511b(jSONObject, JSON_KEY_USER_BIRTHDAY);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JSON_KEY_USER_AGE_RANGE);
        this.userAgeRange = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(C1680e.m8906o(jSONObjectOptJSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(JSON_KEY_USER_HOMETOWN);
        this.userHometown = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(C1680e.m8908p(jSONObjectOptJSONObject2));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(JSON_KEY_USER_LOCATION);
        this.userLocation = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(C1680e.m8908p(jSONObjectOptJSONObject3)) : null;
        this.userGender = companion.m7511b(jSONObject, JSON_KEY_USER_GENDER);
        this.userLink = companion.m7511b(jSONObject, JSON_KEY_USER_LINK);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7506a(JSONObject claimsJson, String expectedNonce) {
        if (claimsJson == null) {
            return false;
        }
        String strOptString = claimsJson.optString(JSON_KEY_JIT);
        strOptString.getClass();
        if (strOptString.length() == 0) {
            return false;
        }
        try {
            String strOptString2 = claimsJson.optString(JSON_KEY_ISS);
            strOptString2.getClass();
            if (strOptString2.length() != 0 && (Intrinsics.m88377d(new URL(strOptString2).getHost(), "facebook.com") || Intrinsics.m88377d(new URL(strOptString2).getHost(), "www.facebook.com"))) {
                String strOptString3 = claimsJson.optString(JSON_KEY_AUD);
                strOptString3.getClass();
                if (strOptString3.length() == 0 || !Intrinsics.m88377d(strOptString3, C1600c.m8102m())) {
                    return false;
                }
                if (new Date().after(new Date(claimsJson.optLong(JSON_KEY_EXP) * 1000))) {
                    return false;
                }
                if (new Date().after(new Date((claimsJson.optLong(JSON_KEY_IAT) * 1000) + MAX_TIME_SINCE_TOKEN_ISSUED))) {
                    return false;
                }
                String strOptString4 = claimsJson.optString(JSON_KEY_SUB);
                strOptString4.getClass();
                if (strOptString4.length() == 0) {
                    return false;
                }
                String strOptString5 = claimsJson.optString("nonce");
                strOptString5.getClass();
                return strOptString5.length() != 0 && Intrinsics.m88377d(strOptString5, expectedNonce);
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    /* JADX INFO: renamed from: b */
    public final JSONObject m7507b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_KEY_JIT, this.jti);
        jSONObject.put(JSON_KEY_ISS, this.iss);
        jSONObject.put(JSON_KEY_AUD, this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put(JSON_KEY_EXP, this.exp);
        jSONObject.put(JSON_KEY_IAT, this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put(JSON_KEY_SUB, str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put(JSON_KEY_NAME, str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put(JSON_KEY_GIVEN_NAME, str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put(JSON_KEY_MIDDLE_NAME, str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put(JSON_KEY_FAMILY_NAME, str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put(JSON_KEY_USER_FRIENDS, new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put(JSON_KEY_USER_BIRTHDAY, str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put(JSON_KEY_USER_AGE_RANGE, new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put(JSON_KEY_USER_HOMETOWN, new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put(JSON_KEY_USER_LOCATION, new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put(JSON_KEY_USER_GENDER, str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put(JSON_KEY_USER_LINK, str10);
        }
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
        if (!(other instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) other;
        return Intrinsics.m88377d(this.jti, authenticationTokenClaims.jti) && Intrinsics.m88377d(this.iss, authenticationTokenClaims.iss) && Intrinsics.m88377d(this.aud, authenticationTokenClaims.aud) && Intrinsics.m88377d(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && Intrinsics.m88377d(this.sub, authenticationTokenClaims.sub) && Intrinsics.m88377d(this.name, authenticationTokenClaims.name) && Intrinsics.m88377d(this.givenName, authenticationTokenClaims.givenName) && Intrinsics.m88377d(this.middleName, authenticationTokenClaims.middleName) && Intrinsics.m88377d(this.familyName, authenticationTokenClaims.familyName) && Intrinsics.m88377d(this.email, authenticationTokenClaims.email) && Intrinsics.m88377d(this.picture, authenticationTokenClaims.picture) && Intrinsics.m88377d(this.userFriends, authenticationTokenClaims.userFriends) && Intrinsics.m88377d(this.userBirthday, authenticationTokenClaims.userBirthday) && Intrinsics.m88377d(this.userAgeRange, authenticationTokenClaims.userAgeRange) && Intrinsics.m88377d(this.userHometown, authenticationTokenClaims.userHometown) && Intrinsics.m88377d(this.userLocation, authenticationTokenClaims.userLocation) && Intrinsics.m88377d(this.userGender, authenticationTokenClaims.userGender) && Intrinsics.m88377d(this.userLink, authenticationTokenClaims.userLink);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((527 + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.exp)) * 31) + Long.hashCode(this.iat)) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.givenName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.middleName;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.familyName;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.picture;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set<String> set = this.userFriends;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.userBirthday;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.userHometown;
        int iHashCode11 = (iHashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.userLocation;
        int iHashCode12 = (iHashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.userGender;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.userLink;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String string = m7507b().toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.jti);
        dest.writeString(this.iss);
        dest.writeString(this.aud);
        dest.writeString(this.nonce);
        dest.writeLong(this.exp);
        dest.writeLong(this.iat);
        dest.writeString(this.sub);
        dest.writeString(this.name);
        dest.writeString(this.givenName);
        dest.writeString(this.middleName);
        dest.writeString(this.familyName);
        dest.writeString(this.email);
        dest.writeString(this.picture);
        if (this.userFriends == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(this.userFriends));
        }
        dest.writeString(this.userBirthday);
        dest.writeMap(this.userAgeRange);
        dest.writeMap(this.userHometown);
        dest.writeMap(this.userLocation);
        dest.writeString(this.userGender);
        dest.writeString(this.userLink);
    }

    @JvmOverloads
    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str13, @Nullable String str14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        g0l0.m128436g(str, JSON_KEY_JIT);
        g0l0.m128436g(str2, JSON_KEY_ISS);
        g0l0.m128436g(str3, JSON_KEY_AUD);
        g0l0.m128436g(str4, "nonce");
        g0l0.m128436g(str5, JSON_KEY_SUB);
        this.jti = str;
        this.iss = str2;
        this.aud = str3;
        this.nonce = str4;
        this.exp = j;
        this.iat = j2;
        this.sub = str5;
        this.name = str6;
        this.givenName = str7;
        this.middleName = str8;
        this.familyName = str9;
        this.email = str10;
        this.picture = str11;
        this.userFriends = collection != null ? Collections.unmodifiableSet(new HashSet(collection)) : null;
        this.userBirthday = str12;
        this.userAgeRange = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
        this.userHometown = map2 != null ? Collections.unmodifiableMap(new HashMap(map2)) : null;
        this.userLocation = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
        this.userGender = str13;
        this.userLink = str14;
    }

    public AuthenticationTokenClaims(@NotNull Parcel parcel) {
        parcel.getClass();
        this.jti = g0l0.m128440k(parcel.readString(), JSON_KEY_JIT);
        this.iss = g0l0.m128440k(parcel.readString(), JSON_KEY_ISS);
        this.aud = g0l0.m128440k(parcel.readString(), JSON_KEY_AUD);
        this.nonce = g0l0.m128440k(parcel.readString(), "nonce");
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        this.sub = g0l0.m128440k(parcel.readString(), JSON_KEY_SUB);
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.userFriends = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap hashMap = parcel.readHashMap(IntCompanionObject.INSTANCE.getClass().getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.userAgeRange = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        HashMap hashMap2 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.userHometown = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.userLocation = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}
