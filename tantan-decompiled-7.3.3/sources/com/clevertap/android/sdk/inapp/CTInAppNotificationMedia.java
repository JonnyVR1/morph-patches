package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001%B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001d\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006+"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Landroid/os/Parcelable;", "", "mediaUrl", "contentType", "contentDescription", "cacheKey", "", Constants.KEY_ORIENTATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "e", "()Z", "f", "g", "h", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Ljava/lang/String;", "c", "()Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "b", "a", "getCacheKey", "I", Constants.INAPP_DATA_TAG, "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class CTInAppNotificationMedia implements Parcelable {

    @Nullable
    private final String cacheKey;

    @NotNull
    private final String contentDescription;

    @NotNull
    private final String contentType;

    @NotNull
    private String mediaUrl;
    private final int orientation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CTInAppNotificationMedia> CREATOR = new C1228a();

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotificationMedia$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/clevertap/android/sdk/inapp/CTInAppNotificationMedia$a", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "", "size", "", "b", "(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1228a implements Parcelable.Creator<CTInAppNotificationMedia> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CTInAppNotificationMedia createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CTInAppNotificationMedia(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CTInAppNotificationMedia[] newArray(int size) {
            return new CTInAppNotificationMedia[size];
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotificationMedia$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$b;", "", "<init>", "()V", "Lorg/json/JSONObject;", "json", "", Constants.KEY_ORIENTATION, "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "a", "(Lorg/json/JSONObject;I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final CTInAppNotificationMedia m6259a(@NotNull JSONObject json, int orientation) {
            json.getClass();
            String strOptString = json.optString("content_type");
            strOptString.getClass();
            String str = null;
            if (StringsKt.m94329e0(strOptString)) {
                return null;
            }
            String strOptString2 = json.optString("url");
            strOptString2.getClass();
            if (!StringsKt.m94329e0(strOptString2) && C15493d.m94374J(strOptString, "image", false, 2, null)) {
                str = UUID.randomUUID() + json.optString(Constants.KEY_KEY);
            }
            String strOptString3 = json.optString(Constants.KEY_ALT_TEXT);
            strOptString3.getClass();
            return new CTInAppNotificationMedia(strOptString2, strOptString, strOptString3, str, orientation);
        }

        private Companion() {
        }
    }

    private CTInAppNotificationMedia(Parcel parcel) {
        String string = parcel.readString();
        this.mediaUrl = string == null ? "" : string;
        String string2 = parcel.readString();
        this.contentType = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.contentDescription = string3 != null ? string3 : "";
        this.cacheKey = parcel.readString();
        this.orientation = parcel.readInt();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6252e() {
        return !StringsKt.m94329e0(this.mediaUrl) && C15493d.m94374J(this.contentType, "audio", false, 2, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(CTInAppNotificationMedia.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) other;
        return this.orientation == cTInAppNotificationMedia.orientation && Intrinsics.m88377d(this.mediaUrl, cTInAppNotificationMedia.mediaUrl) && Intrinsics.m88377d(this.contentType, cTInAppNotificationMedia.contentType) && Intrinsics.m88377d(this.contentDescription, cTInAppNotificationMedia.contentDescription) && Intrinsics.m88377d(this.cacheKey, cTInAppNotificationMedia.cacheKey);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6253f() {
        return !StringsKt.m94329e0(this.mediaUrl) && Intrinsics.m88377d(this.contentType, "image/gif");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6254g() {
        return (StringsKt.m94329e0(this.mediaUrl) || !C15493d.m94374J(this.contentType, "image", false, 2, null) || Intrinsics.m88377d(this.contentType, "image/gif")) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6255h() {
        return !StringsKt.m94329e0(this.mediaUrl) && C15493d.m94374J(this.contentType, "video", false, 2, null);
    }

    public int hashCode() {
        int iHashCode = ((((((this.orientation * 31) + this.mediaUrl.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.contentDescription.hashCode()) * 31;
        String str = this.cacheKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m6256i(@NotNull String str) {
        str.getClass();
        this.mediaUrl = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.mediaUrl);
        dest.writeString(this.contentType);
        dest.writeString(this.contentDescription);
        dest.writeString(this.cacheKey);
        dest.writeInt(this.orientation);
    }

    public CTInAppNotificationMedia(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.mediaUrl = str;
        this.contentType = str2;
        this.contentDescription = str3;
        this.cacheKey = str4;
        this.orientation = i;
    }

    public /* synthetic */ CTInAppNotificationMedia(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }
}
