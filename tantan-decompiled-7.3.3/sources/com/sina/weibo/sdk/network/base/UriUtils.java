package com.sina.weibo.sdk.network.base;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public class UriUtils {
    public static Uri buildCompleteUri(Uri uri, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (String str : bundle.keySet()) {
            builderBuildUpon.appendQueryParameter(str, String.valueOf(bundle.get(str)));
        }
        return builderBuildUpon.build();
    }

    public static String buildCompleteUri(String str, Bundle bundle) {
        Uri uriBuildCompleteUri = buildCompleteUri(Uri.parse(str), bundle);
        if (uriBuildCompleteUri != null) {
            return uriBuildCompleteUri.toString();
        }
        return null;
    }
}
