package com.vivo.push;

import android.net.Uri;

/* JADX INFO: renamed from: com.vivo.push.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C14770p {

    /* JADX INFO: renamed from: a */
    public static final Uri f61915a = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/config");

    /* JADX INFO: renamed from: b */
    public static final Uri f61916b = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/permission");

    /* JADX INFO: renamed from: c */
    public static final Uri f61917c = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/clientState");

    /* JADX INFO: renamed from: d */
    public static final Uri f61918d = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/debugInfo");

    /* JADX INFO: renamed from: a */
    public static String m86107a(int i) {
        switch (i) {
            case 2002:
                return "method_alias_bind";
            case 2003:
                return "method_alias_unbind";
            case 2004:
                return "method_tag_bind";
            case 2005:
                return "method_tag_unbind";
            case 2006:
                return "method_sdk_bind";
            case 2007:
                return "method_sdk_unbind";
            case 2008:
                return "method_stop";
            default:
                return null;
        }
    }
}
