package com.cosmos.photon.push.thirdparty;

import android.content.Intent;
import android.text.TextUtils;
import io.agora.utils2.internal.CommonUtility;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class IntentUtil {
    public static Intent safeParseUri(String str) {
        Intent uri;
        try {
            uri = Intent.parseUri(str, 0);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            uri = null;
        }
        if (uri != null && TextUtils.isEmpty(uri.getDataString())) {
            return uri;
        }
        if (uri == null || uri.getDataString().toLowerCase().contains(CommonUtility.PREFIX_URI) || uri.getDataString().toLowerCase().contains("file://")) {
            return null;
        }
        return uri;
    }
}
