package com.tencent.p101mm.opensdk.diffdev;

import com.tencent.p101mm.opensdk.diffdev.p103a.C14333a;
import com.tencent.p101mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class DiffDevOAuthFactory {
    public static final int MAX_SUPPORTED_VERSION = 1;
    private static final String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
    public static final int VERSION_1 = 1;
    private static IDiffDevOAuth v1Instance;

    private DiffDevOAuthFactory() {
    }

    public static IDiffDevOAuth getDiffDevOAuth(int i) {
        Log.m84177v(TAG, "getDiffDevOAuth, version = " + i);
        if (i > 1) {
            Log.m84175e(TAG, "getDiffDevOAuth fail, unsupported version = " + i);
            return null;
        }
        if (i != 1) {
            return null;
        }
        if (v1Instance == null) {
            v1Instance = new C14333a();
        }
        return v1Instance;
    }

    public static IDiffDevOAuth getDiffDevOAuth() {
        return getDiffDevOAuth(1);
    }
}
