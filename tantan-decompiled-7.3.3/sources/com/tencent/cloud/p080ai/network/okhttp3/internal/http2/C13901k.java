package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.k */
/* JADX INFO: loaded from: classes12.dex */
public class C13901k extends AbstractRunnableC13868b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f57562b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC13892b f57563c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C13896f f57564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13901k(C13896f c13896f, String str, Object[] objArr, int i, EnumC13892b enumC13892b) {
        super(str, objArr);
        this.f57564d = c13896f;
        this.f57562b = i;
        this.f57563c = enumC13892b;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
    /* JADX INFO: renamed from: a */
    public void mo82780a() {
        C13896f c13896f = this.f57564d;
        ((InterfaceC13910t.a) c13896f.f57512j).getClass();
        synchronized (c13896f) {
            this.f57564d.f57526x.remove(Integer.valueOf(this.f57562b));
        }
    }
}
