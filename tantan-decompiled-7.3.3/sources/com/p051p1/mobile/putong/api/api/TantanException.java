package com.p051p1.mobile.putong.api.api;

import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.Meta;
import com.tantanapp.common.network.ApiExcep;
import p153l.i5d0;

/* JADX INFO: loaded from: classes9.dex */
public class TantanException {
    public static final int NAME_VERIFICATION_BAD_REQUEST = 400313;
    public static final int NET_ACTION_AVATAR_VERIFICATION = 400314;
    public static final int PIC_VERIFICATION_BAD_REQUEST = 400312;
    public static final int SLIDER_BAD_REQUEST = 400311;

    public static class ServerException extends ApiExcep.Server {
        public final int code;
        public final Meta meta;

        public ServerException(i5d0 i5d0Var, int i, Meta meta) {
            super(i5d0Var);
            this.code = i;
            this.meta = meta;
        }
    }

    public static class Client {

        public static class CoreService extends ApiExcep.Client.BadRequest {
            public static final int AUTOPAYCANCEL = 48805;
            public static final int AUTOPAYLIMIT = 48804;
            public static final int FACE_NOT_FOUND = 40003;
            public static final int GIFT_MESSAGE_NOT_IN_GROUP = 42000;
            public static final int HASPRIVILEGE = 48803;
            public static final int MATCH_HAS_EXISTED = 40018;
            public static final int NUMLIMIT = 4000103;
            public static final int OTHER_USER_BANNED = 40044;
            public static final int OTHER_USER_INACTIVATED = 40045;
            public static final int OTHER_USER_ISJAILED = 40042;
            public static final int PRIVILEGE_TAKE_FAIL_OUT_OF_CONDITION = 4000201;
            public static final int PRIVILEGE_TAKE_FAIL_REPEATED = 4000203;
            public static final int SEND_LETTER_CONTENT_ILLEGAL = 40099;
            public static final int USERLEFT = 4000102;
            public static final int USER_ISJAILED = 40041;
            public final int code;
            public final String metaMessage;
            public final int subCode;

            /* JADX WARN: Illegal instructions before constructor call */
            public CoreService(i5d0 i5d0Var, Meta meta) {
                String str = meta.message;
                super(i5d0Var, str == null ? "no message" : str);
                this.code = meta.code;
                this.subCode = meta.subCode;
                this.metaMessage = meta.message;
            }
        }

        public static class TooManyRequests extends ApiExcep.Client {
            public final int resetInSeconds;

            public TooManyRequests(i5d0 i5d0Var, int i) {
                super(i5d0Var, "too many requests. reset in " + i);
                this.resetInSeconds = i;
            }
        }

        public static class Unauthorized extends ApiExcep.Client {
            public Unauthorized(i5d0 i5d0Var) {
                super(i5d0Var, "unauthorized");
            }
        }

        public static class AccountService extends ApiExcep.Client.BadRequest {
            public static final int ACCOUNT_BIND_PHONE_INTERVAL_TOO_SHORT = 400146;
            public static final int ACCOUNT_DELETE = 40019;
            public static final int ACCOUNT_INVALID_ACCESS_TOKEN = 40026;
            public static final int ACCOUNT_PASSWORD_FAIL = 40012;
            public static final int ACCOUNT_QUESTION_LIMIT = 40080;
            public static final int ACCOUNT_SPAM_ALREADY_REGISTERED = 40061;
            public static final int ACCOUNT_SPAM_NO_REGISTERED = 40062;
            public static final int ACCOUNT_VERIFY_CODE_ERROR_LIMIT = 40031;
            public static final int BIND_PHONE_ALREADY_REGISTERED = 40060;
            public static final int CHINA_MOBILE_NOT_SIGN_UP = 40016;
            public static final int CONF_CODE_EXPIRED = 40015;
            public static final int ERROR_ACCOUNT_CHANGE_PHONE_FORBIDDEN = 40063;
            public static final int ERROR_ACCOUNT_PICTURE_VERIFY = 40064;
            public static final int ERROR_DEVICE_NOT_FOUND = 40028;
            public static final int ERROR_DEVICE_NOT_FOUND_OLD_DEVICE = 40011;
            public static final int ERROR_JIYAN_VERIFY = 403003;
            public static final int ERROR_VERIFY_EMAIL_FORMAT = 40003;
            public static final int ERROR_VERIFY_EMAIL_FREQUENTLY = 40090;
            public static final int GENERAL_BAD_REQUEST = 40000;
            public static final int INACTIVATED = 40020;
            public static final int INACTIVATED_15DAYS = 40091;
            public static final int INVALID_SMS_CODE = 40014;
            public static final int INVALID_THIRD_PARTY_INFO = 40036;
            public static final int INVALID_THIRD_PARTY_TOKEN = 40035;
            public static final int NEW_DEVICE_SIGN_IN = 40022;
            public static final int SHORT_PASSWORD = 40008;
            public static final int SIGN_UP_PHONE_EXIST = 40011;
            public static final int THIRD_PARTY_TYPE_INVALID = 40033;
            public static final int THIRD_PARTY_USER_EXIST = 40037;
            public static final int VERIFY_CURRENT_PASSWORD = 40021;
            public final int code;

            /* JADX WARN: Illegal instructions before constructor call */
            public AccountService(i5d0 i5d0Var, AccountErrorResponse accountErrorResponse) {
                String str = accountErrorResponse.message;
                super(i5d0Var, str == null ? "no message" : str);
                this.code = accountErrorResponse.code;
            }

            public AccountService(int i, String str) {
                super(null, str);
                this.code = i;
            }
        }

        public static class TantanForbidden extends ApiExcep.Client.Forbidden {
            private static final int CANNOT_MODIFY = 40310;
            public static final int COMMUNICATION_BE_BLACKLIST = 40308;
            public static final int COMMUNICATION_CONNECT_HIDE = 40309;
            private static final int ERROR_HAS_REJECTED = 40306;
            public static final int FOLLOW_SETTING_FORBIDDEN = 41030;
            private static final int ID_CARD_AUTHING = 40307;
            public static final int LETTER_PRIVILEGE_NOT_ENOUGH = 40323;
            private static final int LIMITED_NUMBER_OF_MODIFICATIONS = 40302;
            public static final int LIVE_ADMISSION_MESSAGE_LEVEL_NOT_ENOUGH_TO_CLOSE = 40312;
            public static final int LIVE_ADMISSION_MESSAGE_LEVEL_NOT_ENOUGH_TO_CLOSE_NEW = 40315;
            public static final int LIVE_ADMISSION_MESSAGE_LEVEL_NOT_ENOUGH_TO_OPEN = 40311;
            public static final int MESSAGE_CONTENT_VERIFY_ILLEGAL = 40325;
            public static final int MESSAGE_DEL_CODE = 40346;
            public static final int MESSAGE_INTR_RISK_ERROR = 40345;
            public static final int MESSAGE_LIMIT_BY_NO_SEE_TRIAL_PRIVILEGE = 40340;
            public static final int MESSAGE_SENSITIVE_VERIFY_CODE = 40339;
            private static final int OTHERNOT_VERFIED = 40305;
            public static final int USER_BLOCKED_YOU = 40301;
            public int code;
            public boolean hasHandle;
            public String message;
            public int subCode;

            public TantanForbidden(i5d0 i5d0Var, Meta meta) {
                super(i5d0Var);
                this.hasHandle = false;
                if (meta != null) {
                    this.code = meta.code;
                    this.subCode = meta.subCode;
                    this.message = meta.message;
                }
            }

            public static boolean isIllegalContent(Throwable th) {
                return (th instanceof TantanForbidden) && ((TantanForbidden) th).code == 40325;
            }

            public boolean isBlocked() {
                return this.code == 40301;
            }

            public boolean isCannotModify() {
                return this.code == CANNOT_MODIFY;
            }

            public boolean isCannotModifyExceedLimt() {
                return this.code == LIMITED_NUMBER_OF_MODIFICATIONS;
            }

            public boolean isFollowForbidden() {
                return this.code == 41030;
            }

            public boolean isIdCardAuthing() {
                return this.code == ID_CARD_AUTHING;
            }

            public boolean isLetterNotEnough() {
                return this.code == 40323;
            }

            public boolean isLevelNotEnoughToClose() {
                return this.code == 40312;
            }

            public boolean isLevelNotEnoughToCloseNew() {
                return this.code == 40315;
            }

            public boolean isLevelNotEnoughToOpen() {
                return this.code == 40311;
            }

            public boolean isOtherNotVerify() {
                return this.code == OTHERNOT_VERFIED;
            }

            public boolean isRejectedContact() {
                return this.code == ERROR_HAS_REJECTED;
            }

            public TantanForbidden(i5d0 i5d0Var) {
                super(i5d0Var);
                this.hasHandle = false;
            }
        }
    }
}
