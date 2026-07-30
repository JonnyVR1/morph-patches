package com.tencent.cloud.p075ai.network.okhttp3.internal.http;

import com.tencent.cloud.p075ai.network.okhttp3.MediaType;
import com.tencent.cloud.p075ai.network.okhttp3.ResponseBody;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http.d */
/* JADX INFO: loaded from: classes13.dex */
public final class C13725d extends ResponseBody {

    /* JADX INFO: renamed from: b */
    public final String f56579b;

    /* JADX INFO: renamed from: c */
    public final long f56580c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13778g f56581d;

    public C13725d(String str, long j, InterfaceC13778g interfaceC13778g) {
        this.f56579b = str;
        this.f56580c = j;
        this.f56581d = interfaceC13778g;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.ResponseBody
    public long contentLength() {
        return this.f56580c;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.f56579b;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.ResponseBody
    public InterfaceC13778g source() {
        return this.f56581d;
    }
}
