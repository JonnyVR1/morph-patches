package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1tSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(context);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        LinkGenerator linkGeneratorAddParameter = new LinkGenerator("af_app_invites").setBaseURL(string, string2, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId(AFb1tSDK.getMediationNetwork()).addParameter("af_siteid", context.getPackageName());
        String string3 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_SCHEME);
        if (string3 != null && string3.length() > 3) {
            linkGeneratorAddParameter.setBaseDeeplink(string3);
        }
        return linkGeneratorAddParameter;
    }

    public static void logInvite(Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
            return;
        }
        LinkGenerator linkGeneratorGenerateInviteUrl = generateInviteUrl(context);
        linkGeneratorGenerateInviteUrl.addParameters(map);
        AFLogger.afDebugLog("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder("[Invite] Generated URL: ");
        sb.append(linkGeneratorGenerateInviteUrl.generateLink());
        AFLogger.afDebugLog(sb.toString());
        String mediaSource = linkGeneratorGenerateInviteUrl.getMediaSource();
        if ("af_app_invites".equals(mediaSource)) {
            mediaSource = AFInAppEventType.INVITE;
        } else if ("af_user_share".equals(mediaSource)) {
            mediaSource = AFInAppEventType.SHARE;
        }
        HashMap map2 = new HashMap();
        if (linkGeneratorGenerateInviteUrl.getUserParams() != null) {
            map2.putAll(linkGeneratorGenerateInviteUrl.getUserParams());
        }
        map2.put(AFInAppEventParameterName.AF_CHANNEL, str);
        AppsFlyerLib.getInstance().logEvent(context, mediaSource, map2);
    }
}
