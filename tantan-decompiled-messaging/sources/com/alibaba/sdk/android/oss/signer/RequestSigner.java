package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.internal.RequestMessage;

/* JADX INFO: loaded from: classes.dex */
public interface RequestSigner {
    void sign(RequestMessage requestMessage) throws Exception;
}
