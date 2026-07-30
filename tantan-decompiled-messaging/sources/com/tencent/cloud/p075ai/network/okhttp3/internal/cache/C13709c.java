package com.tencent.cloud.p075ai.network.okhttp3.internal.cache;

import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.cache.c */
/* JADX INFO: loaded from: classes13.dex */
public final class C13709c {

    /* JADX INFO: renamed from: a */
    public final Request f56471a;

    /* JADX INFO: renamed from: b */
    public final Response f56472b;

    public C13709c(Request request, Response response) {
        this.f56471a = request;
        this.f56472b = response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r3.cacheControl().f56411e == false) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m81634a(com.tencent.cloud.p075ai.network.okhttp3.Response r3, com.tencent.cloud.p075ai.network.okhttp3.Request r4) {
        /*
            int r0 = r3.code()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L54
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L54
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L54
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L54
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L54
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L54
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L54
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L54
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L54
            switch(r0) {
                case 300: goto L54;
                case 301: goto L54;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L53
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.header(r0)
            if (r0 != 0) goto L54
            com.tencent.cloud.ai.network.okhttp3.d r0 = r3.cacheControl()
            int r0 = r0.f56409c
            r1 = -1
            if (r0 != r1) goto L54
            com.tencent.cloud.ai.network.okhttp3.d r0 = r3.cacheControl()
            boolean r0 = r0.f56412f
            if (r0 != 0) goto L54
            com.tencent.cloud.ai.network.okhttp3.d r0 = r3.cacheControl()
            boolean r0 = r0.f56411e
            if (r0 == 0) goto L53
            goto L54
        L53:
            return r2
        L54:
            com.tencent.cloud.ai.network.okhttp3.d r3 = r3.cacheControl()
            boolean r3 = r3.f56408b
            if (r3 != 0) goto L66
            com.tencent.cloud.ai.network.okhttp3.d r3 = r4.cacheControl()
            boolean r3 = r3.f56408b
            if (r3 != 0) goto L66
            r3 = 1
            return r3
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.cloud.p075ai.network.okhttp3.internal.cache.C13709c.m81634a(com.tencent.cloud.ai.network.okhttp3.Response, com.tencent.cloud.ai.network.okhttp3.Request):boolean");
    }
}
