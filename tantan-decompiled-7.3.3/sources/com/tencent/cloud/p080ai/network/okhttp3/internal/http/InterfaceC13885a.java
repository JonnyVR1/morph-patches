package com.tencent.cloud.p080ai.network.okhttp3.internal.http;

import com.tencent.cloud.p080ai.network.okhttp3.C13929o;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13878e;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13956v;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http.a */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC13885a {
    /* JADX INFO: renamed from: a */
    long mo82873a(Response response);

    /* JADX INFO: renamed from: a */
    Response.Builder mo82874a(boolean z);

    /* JADX INFO: renamed from: a */
    C13929o mo82875a();

    /* JADX INFO: renamed from: a */
    InterfaceC13956v mo82876a(Request request, long j);

    /* JADX INFO: renamed from: a */
    void mo82877a(Request request);

    /* JADX INFO: renamed from: b */
    InterfaceC13957w mo82878b(Response response);

    /* JADX INFO: renamed from: b */
    void mo82879b();

    /* JADX INFO: renamed from: c */
    void mo82880c();

    void cancel();

    C13878e connection();
}
