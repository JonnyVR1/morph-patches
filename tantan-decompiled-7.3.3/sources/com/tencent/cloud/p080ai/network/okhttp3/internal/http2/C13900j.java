package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.j */
/* JADX INFO: loaded from: classes12.dex */
public class C13900j extends AbstractRunnableC13868b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f57557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13939e f57558c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f57559d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f57560e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C13896f f57561f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13900j(C13896f c13896f, String str, Object[] objArr, int i, C13939e c13939e, int i2, boolean z) {
        super(str, objArr);
        this.f57561f = c13896f;
        this.f57557b = i;
        this.f57558c = c13939e;
        this.f57559d = i2;
        this.f57560e = z;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
    /* JADX INFO: renamed from: a */
    public void mo82780a() {
        try {
            InterfaceC13910t interfaceC13910t = this.f57561f.f57512j;
            C13939e c13939e = this.f57558c;
            int i = this.f57559d;
            if (((InterfaceC13910t.a) interfaceC13910t) == null) {
                throw null;
            }
            c13939e.mo83110d(i);
            this.f57561f.f57524v.m82955a(this.f57557b, EnumC13892b.CANCEL);
            synchronized (this.f57561f) {
                this.f57561f.f57526x.remove(Integer.valueOf(this.f57557b));
            }
        } catch (IOException unused) {
        }
    }
}
