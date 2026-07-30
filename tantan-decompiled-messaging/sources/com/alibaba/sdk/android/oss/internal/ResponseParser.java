package com.alibaba.sdk.android.oss.internal;

import com.alibaba.sdk.android.oss.model.OSSResult;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface ResponseParser<T extends OSSResult> {
    T parse(ResponseMessage responseMessage) throws IOException;
}
