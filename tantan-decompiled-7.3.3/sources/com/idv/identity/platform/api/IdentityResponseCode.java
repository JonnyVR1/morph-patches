package com.idv.identity.platform.api;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityResponseCode {
    public static final int IDENTITY_CAMERA_ERROR = 1004;
    public static final int IDENTITY_CLIENT_MODULE_NOT_EXIST = 1008;
    public static final int IDENTITY_CLIENT_NFC_CONFIG_ERROR = 2000;
    public static final int IDENTITY_CLIENT_NFC_UNSUPPORTED = 2002;
    public static final int IDENTITY_CLIENT_TIME_INVALID = 1009;
    public static final int IDENTITY_CODE_PARAM_EXCEPTION = 1017;
    public static final int IDENTITY_CONTENT_FORMAT_ERROR = 2001;
    public static final String IDENTITY_CONTENT_FORMAT_ERROR_MSG = "内容格式有误";
    public static final int IDENTITY_DECRYPTED_ERROR = 2001;
    public static final String IDENTITY_DECRYPTED_ERROR_MSG = "解密失败";
    public static final int IDENTITY_FAIL = 1001;
    public static final int IDENTITY_INIT_ERROR = 1003;
    public static final int IDENTITY_MISS_KEY_INFO = 1012;
    public static final int IDENTITY_NET_ERROR = 1005;
    public static final int IDENTITY_NOT_INIT = 1010;
    public static final int IDENTITY_NO_CAMERA_PERMISSION = 1016;
    public static final int IDENTITY_OCR_ID_TYPE_ERROR = 1011;
    public static final int IDENTITY_OS_VERSION_LOW = 1015;
    public static final int IDENTITY_OUT_TIME = 1014;
    public static final int IDENTITY_POOR_IMAGE_QUALITY = 1013;
    public static final int IDENTITY_SUCCESS = 1000;
    public static final int IDENTITY_SYS_ERROR = 1002;
    public static final int IDENTITY_TRANSACTION_ID_ERROR = 1007;
    public static final int IDENTITY_USER_BACK = 1006;

    public static class SubCode {
        public static final String SUB_IDENTITY_CLIENT_NFC_CONFIG_ERROR = "A2000_1";
        public static final String SUB_IDENTITY_CLIENT_NFC_UNSUPPORTED = "A2002_1";
        public static final String SUB_IDENTITY_CODE_FACE_MODULE_NOT_EXIST = "A1008_3";
        public static final String SUB_IDENTITY_CODE_NFC_MODULE_NOT_EXIST = "A1008_1";
        public static final String SUB_IDENTITY_CODE_OCR_MODULE_NOT_EXIST = "A1008_2";
        public static final String SUB_IDENTITY_CODE_PARAM_EXCEPTION = "A1017_1";
        public static final String SUB_IDENTITY_CONTEXT_NULL = "A1003_7";
        public static final String SUB_IDENTITY_FAIL = "A1001_1";
        public static final String SUB_IDENTITY_HOME_EXIT = "A1002_2";
        public static final String SUB_IDENTITY_INIT_LOAD_MODEL_ERROR = "A1002_1";
        public static final String SUB_IDENTITY_INIT_LOAD_SO_ERROR = "A1002_3";
        public static final String SUB_IDENTITY_INIT_OSS_ERROR = "A1003_6";
        public static final String SUB_IDENTITY_INIT_RESPONSE_CONTENT_DECRYPTION_FAILED = "A1003_4";
        public static final String SUB_IDENTITY_INIT_RESPONSE_ERROR = "A1003_5";
        public static final String SUB_IDENTITY_INIT_RESPONSE_FORMAT_ERROR = "A1003_2";
        public static final String SUB_IDENTITY_INIT_RESPONSE_NULL = "A1003_1";
        public static final String SUB_IDENTITY_INIT_RESPONSE_PARSING_FAILED = "A1003_3";
        public static final String SUB_IDENTITY_MISS_KEY_INFO = "A1012_1";
        public static final String SUB_IDENTITY_NETWORK_INIT_ERROR = "A1005_1";
        public static final String SUB_IDENTITY_NETWORK_VERIFY_ERROR = "A1005_2";
        public static final String SUB_IDENTITY_NOT_INIT = "A1010_1";
        public static final String SUB_IDENTITY_NO_BACK_CAMERA = "A1004_3";
        public static final String SUB_IDENTITY_NO_CAMERA_PERMISSION = "A1016_1";
        public static final String SUB_IDENTITY_NO_FRONT_CAMERA = "A1004_1";
        public static final String SUB_IDENTITY_NO_NFC_PERMISSION = "A2000_2";
        public static final String SUB_IDENTITY_OPEN_CAMERA_ERROR = "A1004_2";
        public static final String SUB_IDENTITY_OS_VERSION_LOW = "A1015_1";
        public static final String SUB_IDENTITY_OUT_TIME = "A1014_1";
        public static final String SUB_IDENTITY_SUCCESS = "A1000_1";
        public static final String SUB_IDENTITY_TRANSACTION_ID_ERROR = "A1007_1";
        public static final String SUB_IDENTITY_USER_BACK = "A1006_1";
    }
}
