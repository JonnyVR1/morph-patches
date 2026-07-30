package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.l */
/* JADX INFO: loaded from: classes13.dex */
public class C13739l extends AbstractRunnableC13705b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13744q f56717b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13733f.g f56718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13739l(C13733f.g gVar, String str, Object[] objArr, C13744q c13744q) {
        super(str, objArr);
        this.f56718c = gVar;
        this.f56717b = c13744q;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
    /* JADX INFO: renamed from: a */
    public void mo81597a() {
        try {
            C13733f.this.f56656b.mo81662a(this.f56717b);
        } catch (IOException e) {
            C13752c.f56801a.mo81788a(4, "Http2Connection.Listener failure for " + C13733f.this.f56658d, e);
            try {
                this.f56717b.m81758a(EnumC13729b.PROTOCOL_ERROR, e);
            } catch (IOException unused) {
            }
        }
    }
}
