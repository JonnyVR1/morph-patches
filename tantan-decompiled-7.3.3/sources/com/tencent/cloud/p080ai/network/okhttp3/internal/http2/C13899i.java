package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.i */
/* JADX INFO: loaded from: classes12.dex */
public class C13899i extends AbstractRunnableC13868b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f57553b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f57554c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f57555d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C13896f f57556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13899i(C13896f c13896f, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.f57556e = c13896f;
        this.f57553b = i;
        this.f57554c = list;
        this.f57555d = z;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
    /* JADX INFO: renamed from: a */
    public void mo82780a() {
        C13896f c13896f = this.f57556e;
        InterfaceC13910t interfaceC13910t = c13896f.f57512j;
        int i = this.f57553b;
        ((InterfaceC13910t.a) interfaceC13910t).getClass();
        try {
            c13896f.f57524v.m82955a(i, EnumC13892b.CANCEL);
            synchronized (this.f57556e) {
                this.f57556e.f57526x.remove(Integer.valueOf(this.f57553b));
            }
        } catch (IOException unused) {
        }
    }
}
