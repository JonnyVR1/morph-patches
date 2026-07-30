package com.xiaomi.push.service;

/* JADX INFO: renamed from: com.xiaomi.push.service.an */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14991an {

    /* JADX INFO: renamed from: A */
    public static String f63765A = "ext_auth_method";

    /* JADX INFO: renamed from: B */
    public static String f63766B = "ext_security";

    /* JADX INFO: renamed from: C */
    public static String f63767C = "ext_kick";

    /* JADX INFO: renamed from: D */
    public static String f63768D = "ext_client_attr";

    /* JADX INFO: renamed from: E */
    public static String f63769E = "ext_cloud_attr";

    /* JADX INFO: renamed from: F */
    public static String f63770F = "ext_pkg_name";

    /* JADX INFO: renamed from: G */
    public static String f63771G = "ext_notify_id";

    /* JADX INFO: renamed from: H */
    public static String f63772H = "ext_clicked_button";

    /* JADX INFO: renamed from: I */
    public static String f63773I = "ext_notify_type";

    /* JADX INFO: renamed from: J */
    public static String f63774J = "ext_session";

    /* JADX INFO: renamed from: K */
    public static String f63775K = "sig";

    /* JADX INFO: renamed from: L */
    public static String f63776L = "ext_notify_title";

    /* JADX INFO: renamed from: M */
    public static String f63777M = "ext_notify_description";

    /* JADX INFO: renamed from: N */
    public static String f63778N = "ext_messenger";

    /* JADX INFO: renamed from: O */
    public static String f63779O = "title";

    /* JADX INFO: renamed from: P */
    public static String f63780P = "description";

    /* JADX INFO: renamed from: Q */
    public static String f63781Q = "notifyId";

    /* JADX INFO: renamed from: R */
    public static String f63782R = "dump";

    /* JADX INFO: renamed from: a */
    public static String f63783a = "1";

    /* JADX INFO: renamed from: b */
    public static String f63784b = "2";

    /* JADX INFO: renamed from: c */
    public static String f63785c = "3";

    /* JADX INFO: renamed from: d */
    public static String f63786d = "com.xiaomi.push.OPEN_CHANNEL";

    /* JADX INFO: renamed from: e */
    public static String f63787e = "com.xiaomi.push.SEND_MESSAGE";

    /* JADX INFO: renamed from: f */
    public static String f63788f = "com.xiaomi.push.SEND_IQ";

    /* JADX INFO: renamed from: g */
    public static String f63789g = "com.xiaomi.push.BATCH_SEND_MESSAGE";

    /* JADX INFO: renamed from: h */
    public static String f63790h = "com.xiaomi.push.SEND_PRES";

    /* JADX INFO: renamed from: i */
    public static String f63791i = "com.xiaomi.push.CLOSE_CHANNEL";

    /* JADX INFO: renamed from: j */
    public static String f63792j = "com.xiaomi.push.FORCE_RECONN";

    /* JADX INFO: renamed from: k */
    public static String f63793k = "com.xiaomi.push.RESET_CONN";

    /* JADX INFO: renamed from: l */
    public static String f63794l = "com.xiaomi.push.UPDATE_CHANNEL_INFO";

    /* JADX INFO: renamed from: m */
    public static String f63795m = "com.xiaomi.push.SEND_STATS";

    /* JADX INFO: renamed from: n */
    public static String f63796n = "com.xiaomi.push.HANDLE_FCM_MSG";

    /* JADX INFO: renamed from: o */
    public static String f63797o = "com.xiaomi.push.APP_NOTIFY_MSG";

    /* JADX INFO: renamed from: p */
    public static String f63798p = "com.xiaomi.push.CHANGE_HOST";

    /* JADX INFO: renamed from: q */
    public static String f63799q = "com.xiaomi.push.PING_TIMER";

    /* JADX INFO: renamed from: r */
    public static String f63800r = "com.xiaomi.push.APP_CHANNEL_SWITCH";

    /* JADX INFO: renamed from: s */
    public static String f63801s = "ext_user_id";

    /* JADX INFO: renamed from: t */
    public static String f63802t = "ext_user_server";

    /* JADX INFO: renamed from: u */
    public static String f63803u = "ext_user_res";

    /* JADX INFO: renamed from: v */
    public static String f63804v = "ext_chid";

    /* JADX INFO: renamed from: w */
    public static String f63805w = "ext_receive_time";

    /* JADX INFO: renamed from: x */
    public static String f63806x = "ext_broadcast_time";

    /* JADX INFO: renamed from: y */
    public static String f63807y = "ext_sid";

    /* JADX INFO: renamed from: z */
    public static String f63808z = "ext_token";

    /* JADX INFO: renamed from: a */
    public static String m87707a(int i) {
        switch (i) {
            case 0:
                return "ERROR_OK";
            case 1:
                return "ERROR_SERVICE_NOT_INSTALLED";
            case 2:
                return "ERROR_NETWORK_NOT_AVAILABLE";
            case 3:
                return "ERROR_NETWORK_FAILED";
            case 4:
                return "ERROR_ACCESS_DENIED";
            case 5:
                return "ERROR_AUTH_FAILED";
            case 6:
                return "ERROR_MULTI_LOGIN";
            case 7:
                return "ERROR_SERVER_ERROR";
            case 8:
                return "ERROR_RECEIVE_TIMEOUT";
            case 9:
                return "ERROR_READ_ERROR";
            case 10:
                return "ERROR_SEND_ERROR";
            case 11:
                return "ERROR_RESET";
            case 12:
                return "ERROR_NO_CLIENT";
            case 13:
                return "ERROR_SERVER_STREAM";
            case 14:
                return "ERROR_THREAD_BLOCK";
            case 15:
                return "ERROR_SERVICE_DESTROY";
            case 16:
                return "ERROR_SESSION_CHANGED";
            case 17:
                return "ERROR_READ_TIMEOUT";
            case 18:
                return "ERROR_CONNECTIING_TIMEOUT";
            case 19:
                return "ERROR_USER_BLOCKED";
            case 20:
                return "ERROR_REDIRECT";
            case 21:
                return "ERROR_BIND_TIMEOUT";
            case 22:
                return "ERROR_PING_TIMEOUT";
            default:
                return String.valueOf(i);
        }
    }
}
