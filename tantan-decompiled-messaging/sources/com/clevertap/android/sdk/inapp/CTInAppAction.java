package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.wpq;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 22\u00020\u0001:\u00013B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011R(\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"Rd\u0010%\u001a\"\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u0001`$2&\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u0001`$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u0019\u001a\u0004\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010.\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00148G@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "", "h", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lcom/clevertap/android/sdk/inapp/InAppActionType;", "value", "type", "Lcom/clevertap/android/sdk/inapp/InAppActionType;", "g", "()Lcom/clevertap/android/sdk/inapp/InAppActionType;", "", "actionUrl", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "keyValues", "Ljava/util/HashMap;", "f", "()Ljava/util/HashMap;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "customTemplateInAppData", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "e", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "shouldFallbackToSettings", "Z", RXScreenCaptureService.KEY_INDEX, "()Z", "CREATOR", "a", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CTInAppAction implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String actionUrl;

    @Nullable
    private CustomTemplateInAppData customTemplateInAppData;

    @Nullable
    private HashMap<String, String> keyValues;
    private boolean shouldFallbackToSettings;

    @Nullable
    private InAppActionType type;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppAction$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppAction$a;", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "c", "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "", "size", "", "e", "(I)[Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "", "url", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "a", "()Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion implements Parcelable.Creator<CTInAppAction> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final CTInAppAction m6130a() {
            CTInAppAction cTInAppAction = new CTInAppAction((Parcel) null, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            cTInAppAction.type = InAppActionType.CLOSE;
            return cTInAppAction;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final CTInAppAction m6131b(@Nullable JSONObject json) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (json == null) {
                return null;
            }
            return new CTInAppAction(json, defaultConstructorMarker);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CTInAppAction createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new CTInAppAction(parcel, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final CTInAppAction m6133d(@NotNull String url) {
            url.getClass();
            CTInAppAction cTInAppAction = new CTInAppAction((Parcel) null, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            cTInAppAction.type = InAppActionType.OPEN_URL;
            cTInAppAction.actionUrl = url;
            return cTInAppAction;
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public CTInAppAction[] newArray(int size) {
            return new CTInAppAction[size];
        }

        private Companion() {
        }
    }

    private CTInAppAction(Parcel parcel) {
        String string;
        this.type = (parcel == null || (string = parcel.readString()) == null) ? null : InAppActionType.INSTANCE.m6216a(string);
        this.actionUrl = parcel != null ? parcel.readString() : null;
        HashMap<String, String> hashMap = parcel != null ? parcel.readHashMap(null) : null;
        this.keyValues = hashMap == null ? null : hashMap;
        this.customTemplateInAppData = parcel != null ? (CustomTemplateInAppData) parcel.readParcelable(CustomTemplateInAppData.class.getClassLoader()) : null;
        boolean z = false;
        if (parcel != null && parcel.readByte() == 0) {
            z = true;
        }
        this.shouldFallbackToSettings = !z;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final CTInAppAction m6123c(@Nullable JSONObject jSONObject) {
        return INSTANCE.m6131b(jSONObject);
    }

    /* JADX INFO: renamed from: h */
    private final void m6124h(JSONObject json) {
        String strM204934a = wpq.m204934a(json, "type");
        this.type = strM204934a != null ? InAppActionType.INSTANCE.m6216a(strM204934a) : null;
        this.actionUrl = wpq.m204934a(json, "android");
        this.customTemplateInAppData = CustomTemplateInAppData.INSTANCE.m6309a(json);
        this.shouldFallbackToSettings = json.optBoolean(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS);
        if (C15386d.m93490x(Constants.KEY_KV, json.optString("type"), true) && json.has(Constants.KEY_KV)) {
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(Constants.KEY_KV);
            HashMap<String, String> map = this.keyValues;
            if (map == null) {
                map = new HashMap<>();
            }
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObjectOptJSONObject.optString(next);
                    strOptString.getClass();
                    if (strOptString.length() > 0) {
                        map.put(next, strOptString);
                    }
                }
                this.keyValues = map;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CustomTemplateInAppData getCustomTemplateInAppData() {
        return this.customTemplateInAppData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m87488d(CTInAppAction.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        CTInAppAction cTInAppAction = (CTInAppAction) other;
        return this.shouldFallbackToSettings == cTInAppAction.shouldFallbackToSettings && this.type == cTInAppAction.type && Intrinsics.m87488d(this.actionUrl, cTInAppAction.actionUrl) && Intrinsics.m87488d(this.keyValues, cTInAppAction.keyValues) && Intrinsics.m87488d(this.customTemplateInAppData, cTInAppAction.customTemplateInAppData);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final HashMap<String, String> m6127f() {
        return this.keyValues;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final InAppActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.shouldFallbackToSettings) * 31;
        InAppActionType inAppActionType = this.type;
        int iHashCode2 = (iHashCode + (inAppActionType != null ? inAppActionType.hashCode() : 0)) * 31;
        String str = this.actionUrl;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        HashMap<String, String> map = this.keyValues;
        int iHashCode4 = (iHashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        CustomTemplateInAppData customTemplateInAppData = this.customTemplateInAppData;
        return iHashCode4 + (customTemplateInAppData != null ? customTemplateInAppData.hashCode() : 0);
    }

    @JvmName
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShouldFallbackToSettings() {
        return this.shouldFallbackToSettings;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        InAppActionType inAppActionType = this.type;
        dest.writeString(inAppActionType != null ? inAppActionType.getStringValue() : null);
        dest.writeString(this.actionUrl);
        dest.writeMap(this.keyValues);
        dest.writeParcelable(this.customTemplateInAppData, flags);
        dest.writeByte(this.shouldFallbackToSettings ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ CTInAppAction(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    public /* synthetic */ CTInAppAction(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private CTInAppAction(JSONObject jSONObject) {
        this((Parcel) null);
        m6124h(jSONObject);
    }
}
