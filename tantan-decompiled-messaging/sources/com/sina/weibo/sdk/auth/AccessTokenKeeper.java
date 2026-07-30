package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.content.SharedPreferences;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.RequestListener;
import com.sina.weibo.sdk.network.IRequestService;
import com.sina.weibo.sdk.network.impl.RequestParam;
import com.sina.weibo.sdk.network.impl.RequestService;
import com.sina.weibo.sdk.network.target.SimpleTarget;

/* JADX INFO: loaded from: classes11.dex */
public class AccessTokenKeeper {
    private static final String KEY_ACCESS_TOKEN = "access_token";
    private static final String KEY_EXPIRES_IN = "expires_in";
    private static final String KEY_REFRESH_TOKEN = "refresh_token";
    private static final String KEY_UID = "uid";
    private static final String PREFERENCES_NAME = "com_weibo_sdk_android";

    public static void clear(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES_NAME, 32768).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public static Oauth2AccessToken readAccessToken(Context context) {
        if (context == null) {
            return null;
        }
        Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 32768);
        oauth2AccessToken.setUid(sharedPreferences.getString("uid", ""));
        oauth2AccessToken.setToken(sharedPreferences.getString("access_token", ""));
        oauth2AccessToken.setRefreshToken(sharedPreferences.getString("refresh_token", ""));
        oauth2AccessToken.setExpiresTime(sharedPreferences.getLong("expires_in", 0L));
        return oauth2AccessToken;
    }

    public static void refreshToken(String str, final Context context, final RequestListener requestListener) {
        Oauth2AccessToken accessToken = readAccessToken(context);
        if (accessToken == null) {
            return;
        }
        IRequestService requestService = RequestService.getInstance();
        RequestParam.Builder builder = new RequestParam.Builder(context);
        builder.setShortUrl("https://api.weibo.com/oauth2/access_token");
        builder.addPostParam("client_id", str);
        builder.addPostParam("appKey", str);
        builder.addPostParam("grant_type", "refresh_token");
        builder.addPostParam("refresh_token", accessToken.getRefreshToken());
        requestService.asyncRequest(builder.build(), new SimpleTarget() { // from class: com.sina.weibo.sdk.auth.AccessTokenKeeper.1
            @Override // com.sina.weibo.sdk.network.target.Target
            public void onFailure(Exception exc) {
                RequestListener requestListener2 = requestListener;
                if (requestListener2 != null) {
                    requestListener2.onWeiboException(new WeiboException(exc));
                }
            }

            @Override // com.sina.weibo.sdk.network.target.SimpleTarget
            public void onSuccess(String str2) {
                AccessTokenKeeper.writeAccessToken(context, Oauth2AccessToken.parseAccessToken(str2));
                RequestListener requestListener2 = requestListener;
                if (requestListener2 != null) {
                    requestListener2.onComplete(str2);
                }
            }
        });
    }

    public static void writeAccessToken(Context context, Oauth2AccessToken oauth2AccessToken) {
        if (context == null || oauth2AccessToken == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES_NAME, 32768).edit();
        editorEdit.putString("uid", oauth2AccessToken.getUid());
        editorEdit.putString("access_token", oauth2AccessToken.getToken());
        editorEdit.putString("refresh_token", oauth2AccessToken.getRefreshToken());
        editorEdit.putLong("expires_in", oauth2AccessToken.getExpiresTime());
        editorEdit.commit();
    }
}
