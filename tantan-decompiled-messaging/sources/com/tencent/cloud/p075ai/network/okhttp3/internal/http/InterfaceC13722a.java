package com.tencent.cloud.p075ai.network.okhttp3.internal.http;

import com.tencent.cloud.p075ai.network.okhttp3.C13766o;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13715e;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13793v;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http.a */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC13722a {
    /* JADX INFO: renamed from: a */
    long mo81690a(Response response);

    /* JADX INFO: renamed from: a */
    Response.Builder mo81691a(boolean z);

    /* JADX INFO: renamed from: a */
    C13766o mo81692a();

    /* JADX INFO: renamed from: a */
    InterfaceC13793v mo81693a(Request request, long j);

    /* JADX INFO: renamed from: a */
    void mo81694a(Request request);

    /* JADX INFO: renamed from: b */
    InterfaceC13794w mo81695b(Response response);

    /* JADX INFO: renamed from: b */
    void mo81696b();

    /* JADX INFO: renamed from: c */
    void mo81697c();

    void cancel();

    C13715e connection();
}
