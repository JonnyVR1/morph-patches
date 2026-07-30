package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.internal.C1653a;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 H2\u00020\u0001:\u0003I,<B\u0083\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u0016\u0010\u001bB%\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u001dB\u0011\b\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0016\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010)R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b1\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b<\u0010\"R(\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010=\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010F\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u0010\"¨\u0006J"}, m87232d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "", "requestStatusCode", "errorCode", "subErrorCode", "", "errorType", "errorMessageField", "errorUserTitle", "errorUserMessage", "Lorg/json/JSONObject;", "requestResultBody", "requestResult", "", "batchRequestResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/FacebookException;", "exceptionField", "", "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "errorMessage", "(ILjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "toString", "()Ljava/lang/String;", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "I", "f", "b", "g", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "getErrorUserTitle", "getErrorUserMessage", "Lorg/json/JSONObject;", "getRequestResultBody", "()Lorg/json/JSONObject;", "getRequestResult", "Ljava/lang/Object;", "getBatchRequestResult", "()Ljava/lang/Object;", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "c", "<set-?>", "Lcom/facebook/FacebookException;", "e", "()Lcom/facebook/FacebookException;", "Lcom/facebook/FacebookRequestError$Category;", "category", "Lcom/facebook/FacebookRequestError$Category;", "getCategory", "()Lcom/facebook/FacebookRequestError$Category;", "errorRecoveryMessage", "getErrorRecoveryMessage", "Companion", "Category", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class FacebookRequestError implements Parcelable {

    @NotNull
    private static final String BODY_KEY = "body";

    @NotNull
    private static final String CODE_KEY = "code";

    @NotNull
    private static final String ERROR_CODE_FIELD_KEY = "code";

    @NotNull
    private static final String ERROR_CODE_KEY = "error_code";

    @NotNull
    private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";

    @NotNull
    private static final String ERROR_KEY = "error";

    @NotNull
    private static final String ERROR_MESSAGE_FIELD_KEY = "message";

    @NotNull
    private static final String ERROR_MSG_KEY = "error_msg";

    @NotNull
    private static final String ERROR_REASON_KEY = "error_reason";

    @NotNull
    private static final String ERROR_SUB_CODE_KEY = "error_subcode";

    @NotNull
    private static final String ERROR_TYPE_FIELD_KEY = "type";

    @NotNull
    private static final String ERROR_USER_MSG_KEY = "error_user_msg";

    @NotNull
    private static final String ERROR_USER_TITLE_KEY = "error_user_title";
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;

    @Nullable
    private final Object batchRequestResult;

    @NotNull
    private final Category category;

    @Nullable
    private final HttpURLConnection connection;
    private final int errorCode;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final String errorRecoveryMessage;

    @Nullable
    private final String errorType;

    @Nullable
    private final String errorUserMessage;

    @Nullable
    private final String errorUserTitle;

    @Nullable
    private FacebookException exception;

    @Nullable
    private final JSONObject requestResult;

    @Nullable
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final int subErrorCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final C1510c HTTP_RANGE_SUCCESS = new C1510c(200, 299);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C1508a();

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m87232d2 = {"Lcom/facebook/FacebookRequestError$Category;", "", "(Ljava/lang/String;I)V", "LOGIN_RECOVERABLE", "OTHER", "TRANSIENT", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/FacebookRequestError$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/facebook/FacebookRequestError;", "", "size", "", "b", "(I)[Lcom/facebook/FacebookRequestError;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1508a implements Parcelable.Creator<FacebookRequestError> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int size) {
            return new FacebookRequestError[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u0014\u0010%\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u0014\u0010&\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0014\u0010(\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006+"}, m87232d2 = {"Lcom/facebook/FacebookRequestError$b;", "", "<init>", "()V", "Lorg/json/JSONObject;", "singleResult", "batchResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/FacebookRequestError;", "a", "(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/facebook/FacebookRequestError;", "Lcom/facebook/FacebookRequestError$c;", "HTTP_RANGE_SUCCESS", "Lcom/facebook/FacebookRequestError$c;", "c", "()Lcom/facebook/FacebookRequestError$c;", "Lcom/facebook/internal/a;", "b", "()Lcom/facebook/internal/a;", "errorClassification", "", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "ERROR_CODE_FIELD_KEY", "ERROR_CODE_KEY", "ERROR_IS_TRANSIENT_KEY", "ERROR_KEY", "ERROR_MESSAGE_FIELD_KEY", "ERROR_MSG_KEY", "ERROR_REASON_KEY", "ERROR_SUB_CODE_KEY", "ERROR_TYPE_FIELD_KEY", "ERROR_USER_MSG_KEY", "ERROR_USER_TITLE_KEY", "", "INVALID_ERROR_CODE", "I", "INVALID_HTTP_STATUS_CODE", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final FacebookRequestError m7503a(@NotNull JSONObject singleResult, @Nullable Object batchResult, @Nullable HttpURLConnection connection) {
            String strOptString;
            int iOptInt;
            String str;
            boolean zOptBoolean;
            String strOptString2;
            String strOptString3;
            String str2 = FacebookRequestError.BODY_KEY;
            singleResult.getClass();
            try {
                if (singleResult.has("code")) {
                    int i = singleResult.getInt("code");
                    Object objM8821O = C1657e.m8821O(singleResult, FacebookRequestError.BODY_KEY, "FACEBOOK_NON_JSON_RESULT");
                    if (objM8821O == null || !(objM8821O instanceof JSONObject)) {
                        str2 = FacebookRequestError.BODY_KEY;
                    } else {
                        boolean z = true;
                        int iOptInt2 = -1;
                        if (((JSONObject) objM8821O).has("error")) {
                            JSONObject jSONObject = (JSONObject) C1657e.m8821O((JSONObject) objM8821O, "error", null);
                            String strOptString4 = jSONObject != null ? jSONObject.optString("type", null) : null;
                            strOptString = jSONObject != null ? jSONObject.optString("message", null) : null;
                            int iOptInt3 = jSONObject != null ? jSONObject.optInt("code", -1) : -1;
                            iOptInt2 = jSONObject != null ? jSONObject.optInt(FacebookRequestError.ERROR_SUB_CODE_KEY, -1) : -1;
                            strOptString3 = jSONObject != null ? jSONObject.optString(FacebookRequestError.ERROR_USER_MSG_KEY, null) : null;
                            iOptInt = iOptInt2;
                            iOptInt2 = iOptInt3;
                            str = strOptString4;
                            strOptString2 = jSONObject != null ? jSONObject.optString(FacebookRequestError.ERROR_USER_TITLE_KEY, null) : null;
                            zOptBoolean = jSONObject != null ? jSONObject.optBoolean(FacebookRequestError.ERROR_IS_TRANSIENT_KEY, false) : false;
                        } else if (((JSONObject) objM8821O).has("error_code") || ((JSONObject) objM8821O).has(FacebookRequestError.ERROR_MSG_KEY) || ((JSONObject) objM8821O).has(FacebookRequestError.ERROR_REASON_KEY)) {
                            String strOptString5 = ((JSONObject) objM8821O).optString(FacebookRequestError.ERROR_REASON_KEY, null);
                            strOptString = ((JSONObject) objM8821O).optString(FacebookRequestError.ERROR_MSG_KEY, null);
                            iOptInt2 = ((JSONObject) objM8821O).optInt("error_code", -1);
                            iOptInt = ((JSONObject) objM8821O).optInt(FacebookRequestError.ERROR_SUB_CODE_KEY, -1);
                            str = strOptString5;
                            zOptBoolean = false;
                            strOptString2 = null;
                            strOptString3 = null;
                        } else {
                            z = false;
                            zOptBoolean = false;
                            iOptInt = -1;
                            str = null;
                            strOptString2 = null;
                            strOptString = null;
                            strOptString3 = null;
                        }
                        if (z) {
                            return new FacebookRequestError(i, iOptInt2, iOptInt, str, strOptString, strOptString2, strOptString3, (JSONObject) objM8821O, singleResult, batchResult, connection, null, zOptBoolean, null);
                        }
                    }
                    if (!m7505c().m7506a(i)) {
                        return new FacebookRequestError(i, -1, -1, null, null, null, null, singleResult.has(str2) ? (JSONObject) C1657e.m8821O(singleResult, str2, "FACEBOOK_NON_JSON_RESULT") : null, singleResult, batchResult, connection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final synchronized C1653a m7504b() {
            C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
            if (c1656dM8689f == null) {
                return C1653a.INSTANCE.m8758b();
            }
            return c1656dM8689f.getErrorClassification();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C1510c m7505c() {
            return FacebookRequestError.HTTP_RANGE_SUCCESS;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$c */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m87232d2 = {"Lcom/facebook/FacebookRequestError$c;", "", "", "start", "end", "<init>", "(II)V", "value", "", "a", "(I)Z", "I", "b", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1510c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int start;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int end;

        public C1510c(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7506a(int value) {
            return value <= this.end && this.start <= value;
        }
    }

    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z) {
        Category categoryM8755c;
        this.requestStatusCode = i;
        this.errorCode = i2;
        this.subErrorCode = i3;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            categoryM8755c = Category.OTHER;
        } else {
            this.exception = new FacebookServiceException(this, m7496c());
            categoryM8755c = INSTANCE.m7504b().m8755c(i2, i3, z);
        }
        this.category = categoryM8755c;
        this.errorRecoveryMessage = INSTANCE.m7504b().m8756d(categoryM8755c);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m7496c() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.exception;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final FacebookException getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    @NotNull
    public String toString() {
        return "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + m7496c() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        out.getClass();
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(m7496c());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public /* synthetic */ FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z);
    }

    @VisibleForTesting(otherwise = 4)
    public FacebookRequestError(@Nullable HttpURLConnection httpURLConnection, @Nullable Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i, @Nullable String str, @Nullable String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
