package com.hihonor.push.sdk.internal;

import android.util.SparseArray;
import com.hihonor.push.sdk.common.data.ApiException;

/* JADX INFO: loaded from: classes7.dex */
public enum HonorPushErrorEnum {
    SUCCESS(0, "success"),
    ERROR_NOT_SUPPORT_PUSH(8001000, "device is not support push."),
    ERROR_MAIN_THREAD(8001001, "operation in MAIN thread prohibited."),
    ERROR_NO_TOKEN(8001004, "token missing."),
    ERROR_NO_APPID(8001002, "app id missing."),
    ERROR_NOT_INITIALIZED(8001005, "SDK not initialized"),
    ERROR_CERT_FINGERPRINT_EMPTY(8001003, "certificate fingerprint empty."),
    ERROR_BIND_SERVICE(8002001, "bind service failed."),
    ERROR_SERVICE_DISCONNECTED(8002002, "service disconnected."),
    ERROR_SERVICE_TIME_OUT(8002003, "service connect time out."),
    ERROR_SERVICE_ARGUMENTS_INVALID(8002004, "service arguments invalid."),
    ERROR_SERVICE_NULL_BINDING(8002005, "service being bound has return null."),
    ERROR_SERVICE_INVALID(8002006, "service invalid."),
    ERROR_SERVICE_DISABLED(8002007, "service disabled."),
    ERROR_SERVICE_MISSING(8002008, "service missing."),
    ERROR_PUSH_SERVER(8003001, "push server error."),
    ERROR_UNKNOWN(8003002, "unknown error."),
    ERROR_INTERNAL_ERROR(8003003, "internal error."),
    ERROR_ARGUMENTS_INVALID(8003004, "arguments invalid."),
    ERROR_OPERATION_FREQUENTLY(8003005, "operation too frequently."),
    ERROR_NETWORK_NONE(8003006, "no network."),
    ERROR_STATEMENT_AGREEMENT(8003007, "not statement agreement."),
    ERROR_SERVICE_REQUEST_TIME_OUT(8003008, "service request time out."),
    ERROR_HTTP_OPERATION_FREQUENTLY(10214, "http operation too frequently.");

    public static final SparseArray<HonorPushErrorEnum> ENUM_MAPPER = new SparseArray<>();
    public String message;
    public int statusCode;

    static {
        HonorPushErrorEnum[] honorPushErrorEnumArrValues = values();
        for (int i = 0; i < 24; i++) {
            HonorPushErrorEnum honorPushErrorEnum = honorPushErrorEnumArrValues[i];
            ENUM_MAPPER.put(honorPushErrorEnum.statusCode, honorPushErrorEnum);
        }
    }

    HonorPushErrorEnum(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }

    public static HonorPushErrorEnum fromCode(int i) {
        return ENUM_MAPPER.get(i, ERROR_UNKNOWN);
    }

    public int getErrorCode() {
        return this.statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    public ApiException toApiException() {
        return new ApiException(getErrorCode(), getMessage());
    }
}
