package com.tencent.p106mm.opensdk.diffdev;

import com.tencent.p106mm.opensdk.diffdev.p108a.C14496a;
import com.tencent.p106mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class DiffDevOAuthFactory {
    public static final int MAX_SUPPORTED_VERSION = 1;
    private static final String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
    public static final int VERSION_1 = 1;
    private static IDiffDevOAuth v1Instance;

    private DiffDevOAuthFactory() {
    }

    public static IDiffDevOAuth getDiffDevOAuth(int i) {
        Log.m85360v(TAG, "getDiffDevOAuth, version = " + i);
        if (i > 1) {
            Log.m85358e(TAG, "getDiffDevOAuth fail, unsupported version = " + i);
            return null;
        }
        if (i != 1) {
            return null;
        }
        if (v1Instance == null) {
            v1Instance = new C14496a();
        }
        return v1Instance;
    }

    public static IDiffDevOAuth getDiffDevOAuth() {
        return getDiffDevOAuth(1);
    }
}
