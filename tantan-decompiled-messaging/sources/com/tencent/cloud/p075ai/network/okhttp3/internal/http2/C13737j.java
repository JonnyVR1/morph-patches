package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.j */
/* JADX INFO: loaded from: classes13.dex */
public class C13737j extends AbstractRunnableC13705b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f56709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13776e f56710c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f56711d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f56712e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C13733f f56713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13737j(C13733f c13733f, String str, Object[] objArr, int i, C13776e c13776e, int i2, boolean z) {
        super(str, objArr);
        this.f56713f = c13733f;
        this.f56709b = i;
        this.f56710c = c13776e;
        this.f56711d = i2;
        this.f56712e = z;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
    /* JADX INFO: renamed from: a */
    public void mo81597a() {
        try {
            InterfaceC13747t interfaceC13747t = this.f56713f.f56664j;
            C13776e c13776e = this.f56710c;
            int i = this.f56711d;
            if (((InterfaceC13747t.a) interfaceC13747t) == null) {
                throw null;
            }
            c13776e.mo81927d(i);
            this.f56713f.f56676v.m81772a(this.f56709b, EnumC13729b.CANCEL);
            synchronized (this.f56713f) {
                this.f56713f.f56678x.remove(Integer.valueOf(this.f56709b));
            }
        } catch (IOException unused) {
        }
    }
}
