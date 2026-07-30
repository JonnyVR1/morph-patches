package com.tencent.p101mm.opensdk.openapi;

import android.content.Context;
import com.tencent.p101mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXAPIFactory {
    private static final String TAG = "MicroMsg.PaySdk.WXFactory";

    private WXAPIFactory() {
        throw new RuntimeException(WXAPIFactory.class.getSimpleName().concat(" should not be instantiated"));
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z, int i) {
        Log.m84174d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z + ", launchMode = " + i);
        return new WXApiImplV10(context, str, z, i);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z) {
        Log.m84174d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z);
        return createWXAPI(context, str, z, 2);
    }

    public static IWXAPI createWXAPI(Context context, String str) {
        return createWXAPI(context, str, true);
    }
}
