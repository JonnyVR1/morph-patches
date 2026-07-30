package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0001\u001fB\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010 \u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "text", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "backgroundColor", "a", "borderColor", "b", "borderRadius", "c", "textColor", "e", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "action", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class CTInAppNotificationButton implements Parcelable {

    @JvmField
    @Nullable
    public final CTInAppAction action;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String borderColor;

    @NotNull
    private final String borderRadius;

    @NotNull
    private final String text;

    @NotNull
    private final String textColor;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CTInAppNotificationButton> CREATOR = new C1226a();

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotificationButton$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/clevertap/android/sdk/inapp/CTInAppNotificationButton$a", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "", "size", "", "b", "(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1226a implements Parcelable.Creator<CTInAppNotificationButton> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CTInAppNotificationButton createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CTInAppNotificationButton(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CTInAppNotificationButton[] newArray(int size) {
            return new CTInAppNotificationButton[size];
        }
    }

    private CTInAppNotificationButton(Parcel parcel) {
        String string = parcel.readString();
        this.text = string == null ? "" : string;
        String string2 = parcel.readString();
        this.textColor = string2 == null ? Constants.BLUE : string2;
        String string3 = parcel.readString();
        this.backgroundColor = string3 == null ? "#FFFFFF" : string3;
        String string4 = parcel.readString();
        this.borderColor = string4 != null ? string4 : "#FFFFFF";
        String string5 = parcel.readString();
        this.borderRadius = string5 != null ? string5 : "";
        this.action = (CTInAppAction) parcel.readParcelable(CTInAppAction.class.getClassLoader());
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBorderRadius() {
        return this.borderRadius;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(CTInAppNotificationButton.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) other;
        return Intrinsics.m88377d(this.backgroundColor, cTInAppNotificationButton.backgroundColor) && Intrinsics.m88377d(this.borderColor, cTInAppNotificationButton.borderColor) && Intrinsics.m88377d(this.borderRadius, cTInAppNotificationButton.borderRadius) && Intrinsics.m88377d(this.text, cTInAppNotificationButton.text) && Intrinsics.m88377d(this.textColor, cTInAppNotificationButton.textColor) && Intrinsics.m88377d(this.action, cTInAppNotificationButton.action);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.backgroundColor.hashCode() * 31) + this.borderColor.hashCode()) * 31) + this.borderRadius.hashCode()) * 31) + this.text.hashCode()) * 31) + this.textColor.hashCode()) * 31;
        CTInAppAction cTInAppAction = this.action;
        return iHashCode + (cTInAppAction != null ? cTInAppAction.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.text);
        dest.writeString(this.textColor);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.borderColor);
        dest.writeString(this.borderRadius);
        dest.writeParcelable(this.action, flags);
    }

    public CTInAppNotificationButton(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.text = jSONObject.optString("text");
        this.textColor = jSONObject.optString("color", Constants.BLUE);
        this.backgroundColor = jSONObject.optString(Constants.KEY_BG, "#FFFFFF");
        this.borderColor = jSONObject.optString("border", "#FFFFFF");
        this.borderRadius = jSONObject.optString(Constants.KEY_RADIUS);
        this.action = CTInAppAction.INSTANCE.m6185b(jSONObject.optJSONObject(Constants.KEY_ACTIONS));
    }

    public /* synthetic */ CTInAppNotificationButton(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }
}
