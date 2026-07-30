package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.internal.RequestMessage;

/* JADX INFO: loaded from: classes.dex */
public interface RequestPresigner {
    void presign(RequestMessage requestMessage) throws Exception;
}
