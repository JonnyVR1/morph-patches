package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.facebook.internal.C1680e;
import com.p051p1.mobile.putong.data.Link;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.g0l0;
import p153l.kkm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 22\u00020\u0001:\u00013BQ\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b,\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b1\u00100¨\u00064"}, m88121d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "", "id", "firstName", "middleName", "lastName", "name", "Landroid/net/Uri;", "linkUri", "pictureUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "width", "height", "e", "(II)Landroid/net/Uri;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "f", "()Lorg/json/JSONObject;", "describeContents", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getFirstName", "getMiddleName", "getLastName", Constants.INAPP_DATA_TAG, "Landroid/net/Uri;", "getLinkUri", "()Landroid/net/Uri;", "getPictureUri", "Companion", "b", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class Profile implements Parcelable {

    @NotNull
    private static final String FIRST_NAME_KEY = "first_name";

    @NotNull
    private static final String ID_KEY = "id";

    @NotNull
    private static final String LAST_NAME_KEY = "last_name";

    @NotNull
    private static final String LINK_URI_KEY = "link_uri";

    @NotNull
    private static final String MIDDLE_NAME_KEY = "middle_name";

    @NotNull
    private static final String NAME_KEY = "name";

    @NotNull
    private static final String PICTURE_URI_KEY = "picture_uri";

    @Nullable
    private final String firstName;

    @Nullable
    private final String id;

    @Nullable
    private final String lastName;

    @Nullable
    private final Uri linkUri;

    @Nullable
    private final String middleName;

    @Nullable
    private final String name;

    @Nullable
    private final Uri pictureUri;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = Profile.class.getSimpleName();

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Profile> CREATOR = new C1547a();

    /* JADX INFO: renamed from: com.facebook.Profile$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/Profile$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/Profile;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/Profile;", "", "size", "", "b", "(I)[Lcom/facebook/Profile;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C1547a implements Parcelable.Creator<Profile> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new Profile(source, null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Profile[] newArray(int size) {
            return new Profile[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.Profile$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\u0003R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, m88121d2 = {"Lcom/facebook/Profile$b;", "", "<init>", "()V", "Lcom/facebook/Profile;", "b", "()Lcom/facebook/Profile;", "profile", "", "c", "(Lcom/facebook/Profile;)V", "a", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "FIRST_NAME_KEY", "Ljava/lang/String;", "ID_KEY", "LAST_NAME_KEY", "LINK_URI_KEY", "MIDDLE_NAME_KEY", "NAME_KEY", "PICTURE_URI_KEY", "kotlin.jvm.PlatformType", "TAG", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.Profile$b$a */
        @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/facebook/Profile$b$a", "Lcom/facebook/internal/e$a;", "Lorg/json/JSONObject;", "userInfo", "", "a", "(Lorg/json/JSONObject;)V", "Lcom/facebook/FacebookException;", "error", "b", "(Lcom/facebook/FacebookException;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class a implements C1680e.a {
            @Override // com.facebook.internal.C1680e.a
            /* JADX INFO: renamed from: a */
            public void mo7678a(@Nullable JSONObject userInfo) {
                String strOptString = userInfo != null ? userInfo.optString("id") : null;
                if (strOptString == null) {
                    String unused = Profile.TAG;
                    return;
                }
                String strOptString2 = userInfo.optString(Link.TYPE);
                String strOptString3 = userInfo.optString("profile_picture", null);
                Profile.INSTANCE.m7677c(new Profile(strOptString, userInfo.optString(Profile.FIRST_NAME_KEY), userInfo.optString("middle_name"), userInfo.optString(Profile.LAST_NAME_KEY), userInfo.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
            }

            @Override // com.facebook.internal.C1680e.a
            /* JADX INFO: renamed from: b */
            public void mo7679b(@Nullable FacebookException error) {
                Log.e(Profile.TAG, "Got unexpected exception: " + error);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m7675a() {
            AccessToken.Companion companion = AccessToken.INSTANCE;
            AccessToken accessTokenM7490e = companion.m7490e();
            if (accessTokenM7490e == null) {
                return;
            }
            if (companion.m7492g()) {
                C1680e.m8870H(accessTokenM7490e.getToken(), new a());
            } else {
                m7677c(null);
            }
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final Profile m7676b() {
            return C1634g.INSTANCE.m8440a().getCurrentProfileField();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m7677c(@Nullable Profile profile) {
            C1634g.INSTANCE.m8440a().m8438f(profile);
        }

        public Companion() {
        }
    }

    public Profile(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.id = jSONObject.optString("id", null);
        this.firstName = jSONObject.optString(FIRST_NAME_KEY, null);
        this.middleName = jSONObject.optString("middle_name", null);
        this.lastName = jSONObject.optString(LAST_NAME_KEY, null);
        this.name = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString(LINK_URI_KEY, null);
        this.linkUri = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString(PICTURE_URI_KEY, null);
        this.pictureUri = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Profile m7668b() {
        return INSTANCE.m7676b();
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Uri m7671e(int width, int height) {
        String token;
        Uri uri = this.pictureUri;
        if (uri != null) {
            return uri;
        }
        AccessToken.Companion companion = AccessToken.INSTANCE;
        if (companion.m7492g()) {
            AccessToken accessTokenM7490e = companion.m7490e();
            token = accessTokenM7490e != null ? accessTokenM7490e.getToken() : null;
        } else {
            token = "";
        }
        return kkm.INSTANCE.m150269a(this.id, width, height, token);
    }

    public boolean equals(@Nullable Object other) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        String str5 = this.id;
        return ((str5 == null && ((Profile) other).id == null) || Intrinsics.m88377d(str5, ((Profile) other).id)) && (((str = this.firstName) == null && ((Profile) other).firstName == null) || Intrinsics.m88377d(str, ((Profile) other).firstName)) && ((((str2 = this.middleName) == null && ((Profile) other).middleName == null) || Intrinsics.m88377d(str2, ((Profile) other).middleName)) && ((((str3 = this.lastName) == null && ((Profile) other).lastName == null) || Intrinsics.m88377d(str3, ((Profile) other).lastName)) && ((((str4 = this.name) == null && ((Profile) other).name == null) || Intrinsics.m88377d(str4, ((Profile) other).name)) && ((((uri = this.linkUri) == null && ((Profile) other).linkUri == null) || Intrinsics.m88377d(uri, ((Profile) other).linkUri)) && (((uri2 = this.pictureUri) == null && ((Profile) other).pictureUri == null) || Intrinsics.m88377d(uri2, ((Profile) other).pictureUri))))));
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final JSONObject m7672f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put(FIRST_NAME_KEY, this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put(LAST_NAME_KEY, this.lastName);
            jSONObject.put("name", this.name);
            Uri uri = this.linkUri;
            if (uri != null) {
                jSONObject.put(LINK_URI_KEY, uri.toString());
            }
            Uri uri2 = this.pictureUri;
            if (uri2 != null) {
                jSONObject.put(PICTURE_URI_KEY, uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.firstName;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.name);
        Uri uri = this.linkUri;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.pictureUri;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    @JvmOverloads
    public Profile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri, @Nullable Uri uri2) {
        g0l0.m128440k(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }

    public /* synthetic */ Profile(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public Profile(Parcel parcel) {
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String string = parcel.readString();
        this.linkUri = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.pictureUri = string2 != null ? Uri.parse(string2) : null;
    }
}
