package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.l */
/* JADX INFO: loaded from: classes12.dex */
public class C13902l extends AbstractRunnableC13868b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13907q f57565b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13896f.g f57566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13902l(C13896f.g gVar, String str, Object[] objArr, C13907q c13907q) {
        super(str, objArr);
        this.f57566c = gVar;
        this.f57565b = c13907q;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
    /* JADX INFO: renamed from: a */
    public void mo82780a() {
        try {
            C13896f.this.f57504b.mo82845a(this.f57565b);
        } catch (IOException e) {
            C13915c.f57649a.mo82971a(4, "Http2Connection.Listener failure for " + C13896f.this.f57506d, e);
            try {
                this.f57565b.m82941a(EnumC13892b.PROTOCOL_ERROR, e);
            } catch (IOException unused) {
            }
        }
    }
}
