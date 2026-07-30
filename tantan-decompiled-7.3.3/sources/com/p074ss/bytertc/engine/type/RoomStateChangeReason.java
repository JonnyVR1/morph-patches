package com.p074ss.bytertc.engine.type;

import com.tencent.open.apireq.BaseResp;

/* JADX INFO: loaded from: classes11.dex */
public enum RoomStateChangeReason {
    JOIN_ROOM(0),
    RECONNECT(1),
    LEAVE_ROOM(2),
    JOIN_ROOM_FAILED(BaseResp.CODE_NOT_LOGIN),
    INVALID_TOKEN(-1000),
    TOKEN_EXPIRED(ErrorCode.ERROR_CODE_TOKEN_EXPIRED),
    UPDATE_TOKEN_WITH_INVALID_TOKEN(-1010),
    ROOM_FORBIDDEN(ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN),
    USER_FORBIDDEN(ErrorCode.ERROR_CODE_JOIN_ROOM_USER_FORBIDDEN),
    KICKED_OUT(ErrorCode.ERROR_CODE_KICKED_OUT),
    ROOM_DISMISS(ErrorCode.ERROR_CODE_ROOM_DISMISS),
    DUPLICATE_LOGIN(-1004),
    WITHOUT_LICENSE_AUTHENTICATE_SDK(ErrorCode.ERROR_CODE_JOIN_ROOM_WITHOUT_LICENSE_AUTHENTICATE_SDK),
    SERVER_LICENSE_EXPIRED(ErrorCode.ERROR_CODE_SERVER_LICENSE_EXPIRE),
    EXCEEDS_THE_UPPER_LIMIT(ErrorCode.ERROR_CODE_EXCEEDS_THE_UPPER_LIMIT),
    LICENSE_PARAMETER_ERROR(ErrorCode.ERROR_CODE_LICENSE_PARAMETER_ERROR),
    LICENSE_FILE_PATH_ERROR(ErrorCode.ERROR_CODE_LICENSE_FILE_PATH_ERROR),
    LICENSE_ILLEGAL(ErrorCode.ERROR_CODE_LICENSE_ILLEGAL),
    LICENSE_EXPIRED(ErrorCode.ERROR_CODE_LICENSE_EXPIRED),
    LICENSE_INFORMATION_NOT_MATCH(ErrorCode.ERROR_CODE_LICENSE_INFORMATION_NOT_MATCH),
    LICENSE_NOT_MATCH_WITH_CACHE(ErrorCode.ERROR_CODE_LICENSE_NOT_MATCH_WITH_CACHE),
    LICENSE_FUNCTION_NOT_FOUND(ErrorCode.ERROR_CODE_JOIN_ROOM_LICENSE_FUNCTION_NOT_FOUND),
    STATE_ABNORMAL_SERVER_STATUS(ErrorCode.ERROR_CODE_ABNORMAL_SERVER_STATUS),
    UNKNOWN(-1001);

    private int value;

    RoomStateChangeReason(int i) {
        this.value = i;
    }

    public static RoomStateChangeReason valueOf(int i) {
        if (i == -2001) {
            return JOIN_ROOM_FAILED;
        }
        if (i == -1084) {
            return STATE_ABNORMAL_SERVER_STATUS;
        }
        if (i == -1006) {
            return KICKED_OUT;
        }
        if (i == -1004) {
            return DUPLICATE_LOGIN;
        }
        if (i == -1001) {
            return UNKNOWN;
        }
        if (i == -1000) {
            return INVALID_TOKEN;
        }
        if (i == 0) {
            return JOIN_ROOM;
        }
        if (i == 1) {
            return RECONNECT;
        }
        if (i == 2) {
            return LEAVE_ROOM;
        }
        switch (i) {
            case ErrorCode.ERROR_CODE_JOIN_ROOM_LICENSE_FUNCTION_NOT_FOUND /* -1027 */:
                return LICENSE_FUNCTION_NOT_FOUND;
            case ErrorCode.ERROR_CODE_JOIN_ROOM_USER_FORBIDDEN /* -1026 */:
                return USER_FORBIDDEN;
            case ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN /* -1025 */:
                return ROOM_FORBIDDEN;
            case ErrorCode.ERROR_CODE_LICENSE_NOT_MATCH_WITH_CACHE /* -1024 */:
                return LICENSE_NOT_MATCH_WITH_CACHE;
            case ErrorCode.ERROR_CODE_LICENSE_INFORMATION_NOT_MATCH /* -1023 */:
                return LICENSE_INFORMATION_NOT_MATCH;
            case ErrorCode.ERROR_CODE_LICENSE_EXPIRED /* -1022 */:
                return LICENSE_EXPIRED;
            case ErrorCode.ERROR_CODE_LICENSE_ILLEGAL /* -1021 */:
                return LICENSE_ILLEGAL;
            case ErrorCode.ERROR_CODE_LICENSE_FILE_PATH_ERROR /* -1020 */:
                return LICENSE_FILE_PATH_ERROR;
            case ErrorCode.ERROR_CODE_LICENSE_PARAMETER_ERROR /* -1019 */:
                return LICENSE_PARAMETER_ERROR;
            case ErrorCode.ERROR_CODE_EXCEEDS_THE_UPPER_LIMIT /* -1018 */:
                return EXCEEDS_THE_UPPER_LIMIT;
            case ErrorCode.ERROR_CODE_SERVER_LICENSE_EXPIRE /* -1017 */:
                return SERVER_LICENSE_EXPIRED;
            default:
                switch (i) {
                    case ErrorCode.ERROR_CODE_JOIN_ROOM_WITHOUT_LICENSE_AUTHENTICATE_SDK /* -1012 */:
                        return WITHOUT_LICENSE_AUTHENTICATE_SDK;
                    case ErrorCode.ERROR_CODE_ROOM_DISMISS /* -1011 */:
                        return ROOM_DISMISS;
                    case -1010:
                        return UPDATE_TOKEN_WITH_INVALID_TOKEN;
                    case ErrorCode.ERROR_CODE_TOKEN_EXPIRED /* -1009 */:
                        return TOKEN_EXPIRED;
                    default:
                        return null;
                }
        }
    }

    public int value() {
        return this.value;
    }
}
