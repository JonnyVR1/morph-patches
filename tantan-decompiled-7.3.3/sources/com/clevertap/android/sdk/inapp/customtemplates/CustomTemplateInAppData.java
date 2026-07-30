package com.clevertap.android.sdk.inapp.customtemplates;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.c0c;
import p153l.cqi0;
import p153l.kx3;
import p153l.xrq;
import p153l.zpi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u0000 62\u00020\u0001:\u0001\u001fB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010\u001dR(\u0010(\u001a\u0004\u0018\u00010\u00102\b\u0010'\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010,\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010)R\u0018\u00103\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010)R\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "", "h", "b", "()Lorg/json/JSONObject;", "Ll/cqi0;", "templatesManager", "", "", "c", "(Ll/cqi0;)Ljava/util/List;", "", "filesList", Constants.INAPP_DATA_TAG, "(Ll/cqi0;Ljava/util/List;)V", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", RXScreenCaptureService.KEY_INDEX, "a", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "value", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "Ljava/lang/String;", "e", "()Ljava/lang/String;", CustomTemplateInAppData.KEY_IS_ACTION, "Z", "f", "()Z", "g", "(Z)V", CustomTemplateInAppData.KEY_TEMPLATE_ID, CustomTemplateInAppData.KEY_TEMPLATE_DESCRIPTION, "args", "Lorg/json/JSONObject;", "CREATOR", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class CustomTemplateInAppData implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_IS_ACTION = "isAction";

    @NotNull
    private static final String KEY_TEMPLATE_DESCRIPTION = "templateDescription";

    @NotNull
    private static final String KEY_TEMPLATE_ID = "templateId";

    @NotNull
    public static final String KEY_TEMPLATE_NAME = "templateName";

    @NotNull
    public static final String KEY_VARS = "vars";

    @Nullable
    private JSONObject args;
    private boolean isAction;

    @Nullable
    private String templateDescription;

    @Nullable
    private String templateId;

    @Nullable
    private String templateName;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$a;", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "b", "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "", "size", "", "c", "(I)[Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "Lorg/json/JSONObject;", "inApp", "a", "(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "", "KEY_TEMPLATE_NAME", "Ljava/lang/String;", "KEY_VARS", "KEY_IS_ACTION", "KEY_TEMPLATE_ID", "KEY_TEMPLATE_DESCRIPTION", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion implements Parcelable.Creator<CustomTemplateInAppData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final CustomTemplateInAppData m6363a(@Nullable JSONObject inApp) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (inApp == null) {
                return null;
            }
            if (CTInAppType.CTInAppTypeCustomCodeTemplate == CTInAppType.INSTANCE.m6260a(inApp.optString("type"))) {
                return new CustomTemplateInAppData(inApp, defaultConstructorMarker);
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTemplateInAppData createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new CustomTemplateInAppData(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CustomTemplateInAppData[] newArray(int size) {
            return new CustomTemplateInAppData[size];
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$b */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C1240b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5092a;

        static {
            int[] iArr = new int[TemplateArgumentType.values().length];
            try {
                iArr[TemplateArgumentType.FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TemplateArgumentType.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5092a = iArr;
        }
    }

    private CustomTemplateInAppData(Parcel parcel) {
        this.templateName = parcel != null ? parcel.readString() : null;
        boolean z = false;
        if (parcel != null && parcel.readByte() == 0) {
            z = true;
        }
        this.isAction = !z;
        this.templateId = parcel != null ? parcel.readString() : null;
        this.templateDescription = parcel != null ? parcel.readString() : null;
        this.args = parcel != null ? xrq.m212847b(parcel) : null;
    }

    /* JADX INFO: renamed from: h */
    private final void m6354h(JSONObject json) {
        this.templateName = xrq.m212846a(json, KEY_TEMPLATE_NAME);
        this.isAction = json.optBoolean(KEY_IS_ACTION);
        this.templateId = xrq.m212846a(json, KEY_TEMPLATE_ID);
        this.templateDescription = xrq.m212846a(json, KEY_TEMPLATE_DESCRIPTION);
        this.args = json.optJSONObject("vars");
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CustomTemplateInAppData m6355a() {
        CustomTemplateInAppData customTemplateInAppData = new CustomTemplateInAppData((Parcel) null);
        customTemplateInAppData.templateName = this.templateName;
        customTemplateInAppData.isAction = this.isAction;
        customTemplateInAppData.templateId = this.templateId;
        customTemplateInAppData.templateDescription = this.templateDescription;
        JSONObject jSONObject = this.args;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            kx3.m151786g(jSONObject2, jSONObject);
            customTemplateInAppData.args = jSONObject2;
        }
        return customTemplateInAppData;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final JSONObject m6356b() {
        JSONObject jSONObject = this.args;
        if (jSONObject != null) {
            return kx3.m151785f(jSONObject);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<String> m6357c(@NotNull cqi0 templatesManager) {
        templatesManager.getClass();
        ArrayList arrayList = new ArrayList();
        m6358d(templatesManager, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m6358d(@NotNull cqi0 templatesManager, @NotNull List<String> filesList) {
        c0c c0cVarM111908e;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        CustomTemplateInAppData customTemplateInAppDataM6363a;
        templatesManager.getClass();
        filesList.getClass();
        String str = this.templateName;
        if (str == null || (c0cVarM111908e = templatesManager.m111908e(str)) == null || (jSONObject = this.args) == null) {
            return;
        }
        for (zpi0 zpi0Var : c0cVarM111908e.m107391b()) {
            int i = C1240b.f5092a[zpi0Var.getType().ordinal()];
            if (i == 1) {
                String strM212846a = xrq.m212846a(jSONObject, zpi0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (strM212846a != null) {
                    filesList.add(strM212846a);
                }
            } else if (i == 2 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(zpi0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String())) != null && (customTemplateInAppDataM6363a = INSTANCE.m6363a(jSONObjectOptJSONObject)) != null) {
                customTemplateInAppDataM6363a.m6358d(templatesManager, filesList);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(CustomTemplateInAppData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        CustomTemplateInAppData customTemplateInAppData = (CustomTemplateInAppData) other;
        if (!Intrinsics.m88377d(this.templateName, customTemplateInAppData.templateName) || this.isAction != customTemplateInAppData.isAction || !Intrinsics.m88377d(this.templateId, customTemplateInAppData.templateId) || !Intrinsics.m88377d(this.templateDescription, customTemplateInAppData.templateDescription)) {
            return false;
        }
        JSONObject jSONObject = this.args;
        String string = jSONObject != null ? jSONObject.toString() : null;
        JSONObject jSONObject2 = customTemplateInAppData.args;
        return Intrinsics.m88377d(string, jSONObject2 != null ? jSONObject2.toString() : null);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsAction() {
        return this.isAction;
    }

    /* JADX INFO: renamed from: g */
    public final void m6361g(boolean z) {
        this.isAction = z;
    }

    public int hashCode() {
        String string;
        String str = this.templateName;
        int iHashCode = 0;
        int iHashCode2 = (((str != null ? str.hashCode() : 0) * 31) + Boolean.hashCode(this.isAction)) * 31;
        String str2 = this.templateId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.templateDescription;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.args;
        if (jSONObject != null && (string = jSONObject.toString()) != null) {
            iHashCode = string.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m6362i(@NotNull JSONObject json) throws JSONException {
        json.getClass();
        json.put(KEY_TEMPLATE_NAME, this.templateName);
        json.put(KEY_IS_ACTION, this.isAction);
        json.put(KEY_TEMPLATE_ID, this.templateId);
        json.put(KEY_TEMPLATE_DESCRIPTION, this.templateDescription);
        json.put("vars", this.args);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.templateName);
        dest.writeByte(this.isAction ? (byte) 1 : (byte) 0);
        dest.writeString(this.templateId);
        dest.writeString(this.templateDescription);
        xrq.m212848c(dest, this.args);
    }

    public /* synthetic */ CustomTemplateInAppData(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    public /* synthetic */ CustomTemplateInAppData(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private CustomTemplateInAppData(JSONObject jSONObject) {
        this((Parcel) null);
        m6354h(jSONObject);
    }
}
