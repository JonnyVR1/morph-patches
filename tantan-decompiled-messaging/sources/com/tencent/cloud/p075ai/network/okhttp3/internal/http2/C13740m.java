package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.m */
/* JADX INFO: loaded from: classes13.dex */
public class C13740m extends AbstractRunnableC13705b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f56719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13748u f56720c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C13733f.g f56721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13740m(C13733f.g gVar, String str, Object[] objArr, boolean z, C13748u c13748u) {
        super(str, objArr);
        this.f56721d = gVar;
        this.f56719b = z;
        this.f56720c = c13748u;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
    /* JADX INFO: renamed from: a */
    public void mo81597a() {
        int i;
        C13744q[] c13744qArr;
        long j;
        C13733f.g gVar = this.f56721d;
        boolean z = this.f56719b;
        C13748u c13748u = this.f56720c;
        synchronized (C13733f.this.f56676v) {
            synchronized (C13733f.this) {
                try {
                    int iM81780a = C13733f.this.f56674t.m81780a();
                    if (z) {
                        C13748u c13748u2 = C13733f.this.f56674t;
                        c13748u2.f56784a = 0;
                        Arrays.fill(c13748u2.f56785b, 0);
                    }
                    C13748u c13748u3 = C13733f.this.f56674t;
                    c13744qArr = null;
                    if (c13748u3 == null) {
                        throw null;
                    }
                    for (int i2 = 0; i2 < 10; i2++) {
                        if (((1 << i2) & c13748u.f56784a) != 0) {
                            c13748u3.m81781a(i2, c13748u.f56785b[i2]);
                        }
                    }
                    int iM81780a2 = C13733f.this.f56674t.m81780a();
                    if (iM81780a2 == -1 || iM81780a2 == iM81780a) {
                        j = 0;
                    } else {
                        j = iM81780a2 - iM81780a;
                        if (!C13733f.this.f56657c.isEmpty()) {
                            c13744qArr = (C13744q[]) C13733f.this.f56657c.values().toArray(new C13744q[C13733f.this.f56657c.size()]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                C13733f c13733f = C13733f.this;
                c13733f.f56676v.m81774a(c13733f.f56674t);
            } catch (IOException e) {
                C13733f c13733f2 = C13733f.this;
                EnumC13729b enumC13729b = EnumC13729b.PROTOCOL_ERROR;
                c13733f2.m81739a(enumC13729b, enumC13729b, e);
            }
        }
        if (c13744qArr != null) {
            for (C13744q c13744q : c13744qArr) {
                synchronized (c13744q) {
                    try {
                        c13744q.f56744b += j;
                        if (j > 0) {
                            c13744q.notifyAll();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        C13733f.f56653y.execute(new C13741n(gVar, "OkHttp %s settings", C13733f.this.f56658d));
    }
}
