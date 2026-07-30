package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.m */
/* JADX INFO: loaded from: classes12.dex */
public class C13903m extends AbstractRunnableC13868b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f57567b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13911u f57568c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C13896f.g f57569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13903m(C13896f.g gVar, String str, Object[] objArr, boolean z, C13911u c13911u) {
        super(str, objArr);
        this.f57569d = gVar;
        this.f57567b = z;
        this.f57568c = c13911u;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
    /* JADX INFO: renamed from: a */
    public void mo82780a() {
        int i;
        C13907q[] c13907qArr;
        long j;
        C13896f.g gVar = this.f57569d;
        boolean z = this.f57567b;
        C13911u c13911u = this.f57568c;
        synchronized (C13896f.this.f57524v) {
            synchronized (C13896f.this) {
                try {
                    int iM82963a = C13896f.this.f57522t.m82963a();
                    if (z) {
                        C13911u c13911u2 = C13896f.this.f57522t;
                        c13911u2.f57632a = 0;
                        Arrays.fill(c13911u2.f57633b, 0);
                    }
                    C13911u c13911u3 = C13896f.this.f57522t;
                    c13907qArr = null;
                    if (c13911u3 == null) {
                        throw null;
                    }
                    for (int i2 = 0; i2 < 10; i2++) {
                        if (((1 << i2) & c13911u.f57632a) != 0) {
                            c13911u3.m82964a(i2, c13911u.f57633b[i2]);
                        }
                    }
                    int iM82963a2 = C13896f.this.f57522t.m82963a();
                    if (iM82963a2 == -1 || iM82963a2 == iM82963a) {
                        j = 0;
                    } else {
                        j = iM82963a2 - iM82963a;
                        if (!C13896f.this.f57505c.isEmpty()) {
                            c13907qArr = (C13907q[]) C13896f.this.f57505c.values().toArray(new C13907q[C13896f.this.f57505c.size()]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                C13896f c13896f = C13896f.this;
                c13896f.f57524v.m82957a(c13896f.f57522t);
            } catch (IOException e) {
                C13896f c13896f2 = C13896f.this;
                EnumC13892b enumC13892b = EnumC13892b.PROTOCOL_ERROR;
                c13896f2.m82922a(enumC13892b, enumC13892b, e);
            }
        }
        if (c13907qArr != null) {
            for (C13907q c13907q : c13907qArr) {
                synchronized (c13907q) {
                    try {
                        c13907q.f57592b += j;
                        if (j > 0) {
                            c13907q.notifyAll();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        C13896f.f57501y.execute(new C13904n(gVar, "OkHttp %s settings", C13896f.this.f57506d));
    }
}
