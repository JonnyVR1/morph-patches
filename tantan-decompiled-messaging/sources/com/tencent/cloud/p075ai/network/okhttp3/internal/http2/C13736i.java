package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.i */
/* JADX INFO: loaded from: classes13.dex */
public class C13736i extends AbstractRunnableC13705b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f56705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f56706c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f56707d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C13733f f56708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13736i(C13733f c13733f, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.f56708e = c13733f;
        this.f56705b = i;
        this.f56706c = list;
        this.f56707d = z;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
    /* JADX INFO: renamed from: a */
    public void mo81597a() {
        C13733f c13733f = this.f56708e;
        InterfaceC13747t interfaceC13747t = c13733f.f56664j;
        int i = this.f56705b;
        ((InterfaceC13747t.a) interfaceC13747t).getClass();
        try {
            c13733f.f56676v.m81772a(i, EnumC13729b.CANCEL);
            synchronized (this.f56708e) {
                this.f56708e.f56678x.remove(Integer.valueOf(this.f56705b));
            }
        } catch (IOException unused) {
        }
    }
}
