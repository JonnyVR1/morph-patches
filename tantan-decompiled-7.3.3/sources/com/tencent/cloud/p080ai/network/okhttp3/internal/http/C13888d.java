package com.tencent.cloud.p080ai.network.okhttp3.internal.http;

import com.tencent.cloud.p080ai.network.okhttp3.MediaType;
import com.tencent.cloud.p080ai.network.okhttp3.ResponseBody;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http.d */
/* JADX INFO: loaded from: classes12.dex */
public final class C13888d extends ResponseBody {

    /* JADX INFO: renamed from: b */
    public final String f57427b;

    /* JADX INFO: renamed from: c */
    public final long f57428c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13941g f57429d;

    public C13888d(String str, long j, InterfaceC13941g interfaceC13941g) {
        this.f57427b = str;
        this.f57428c = j;
        this.f57429d = interfaceC13941g;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.ResponseBody
    public long contentLength() {
        return this.f57428c;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.f57427b;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.ResponseBody
    public InterfaceC13941g source() {
        return this.f57429d;
    }
}
