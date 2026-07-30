package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.h */
/* JADX INFO: loaded from: classes12.dex */
public class C13898h extends AbstractRunnableC13868b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f57550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f57551c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C13896f f57552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13898h(C13896f c13896f, String str, Object[] objArr, int i, List list) {
        super(str, objArr);
        this.f57552d = c13896f;
        this.f57550b = i;
        this.f57551c = list;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
    /* JADX INFO: renamed from: a */
    public void mo82780a() {
        C13896f c13896f = this.f57552d;
        InterfaceC13910t interfaceC13910t = c13896f.f57512j;
        int i = this.f57550b;
        ((InterfaceC13910t.a) interfaceC13910t).getClass();
        try {
            c13896f.f57524v.m82955a(i, EnumC13892b.CANCEL);
            synchronized (this.f57552d) {
                this.f57552d.f57526x.remove(Integer.valueOf(this.f57550b));
            }
        } catch (IOException unused) {
        }
    }
}
