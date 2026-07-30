package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.k */
/* JADX INFO: loaded from: classes13.dex */
public class C13738k extends AbstractRunnableC13705b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f56714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC13729b f56715c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C13733f f56716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13738k(C13733f c13733f, String str, Object[] objArr, int i, EnumC13729b enumC13729b) {
        super(str, objArr);
        this.f56716d = c13733f;
        this.f56714b = i;
        this.f56715c = enumC13729b;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
    /* JADX INFO: renamed from: a */
    public void mo81597a() {
        C13733f c13733f = this.f56716d;
        ((InterfaceC13747t.a) c13733f.f56664j).getClass();
        synchronized (c13733f) {
            this.f56716d.f56678x.remove(Integer.valueOf(this.f56714b));
        }
    }
}
