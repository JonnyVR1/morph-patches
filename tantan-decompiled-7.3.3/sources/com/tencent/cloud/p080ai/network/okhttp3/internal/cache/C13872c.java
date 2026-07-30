package com.tencent.cloud.p080ai.network.okhttp3.internal.cache;

import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.cache.c */
/* JADX INFO: loaded from: classes12.dex */
public final class C13872c {

    /* JADX INFO: renamed from: a */
    public final Request f57319a;

    /* JADX INFO: renamed from: b */
    public final Response f57320b;

    public C13872c(Request request, Response response) {
        this.f57319a = request;
        this.f57320b = response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r3.cacheControl().f57259e == false) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m82817a(Response response, Request request) {
        int iCode = response.code();
        if (iCode != 200 && iCode != 410 && iCode != 414 && iCode != 501 && iCode != 203 && iCode != 204) {
            if (iCode != 307) {
                if (iCode != 308 && iCode != 404 && iCode != 405) {
                    switch (iCode) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (response.header("Expires") == null) {
                if (response.cacheControl().f57257c == -1) {
                    if (!response.cacheControl().f57260f) {
                    }
                }
            }
        }
        return (response.cacheControl().f57256b || request.cacheControl().f57256b) ? false : true;
    }
}
