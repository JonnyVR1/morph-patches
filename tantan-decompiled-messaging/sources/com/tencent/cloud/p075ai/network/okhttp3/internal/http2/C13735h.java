package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.h */
/* JADX INFO: loaded from: classes13.dex */
public class C13735h extends AbstractRunnableC13705b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f56702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f56703c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C13733f f56704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13735h(C13733f c13733f, String str, Object[] objArr, int i, List list) {
        super(str, objArr);
        this.f56704d = c13733f;
        this.f56702b = i;
        this.f56703c = list;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
    /* JADX INFO: renamed from: a */
    public void mo81597a() {
        C13733f c13733f = this.f56704d;
        InterfaceC13747t interfaceC13747t = c13733f.f56664j;
        int i = this.f56702b;
        ((InterfaceC13747t.a) interfaceC13747t).getClass();
        try {
            c13733f.f56676v.m81772a(i, EnumC13729b.CANCEL);
            synchronized (this.f56704d) {
                this.f56704d.f56678x.remove(Integer.valueOf(this.f56702b));
            }
        } catch (IOException unused) {
        }
    }
}
