package com.tencent.iliveroom.p080a.p081a;

import com.tencent.liteav.basic.p088c.C14008a;
import com.tencent.liteav.basic.p090e.C14027a;
import com.tencent.liteav.p097c.C14104a;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.a.e */
/* JADX INFO: loaded from: classes2.dex */
public class C13950e {

    /* JADX INFO: renamed from: a */
    private C13948c f57779a = new C13948c();

    /* JADX INFO: renamed from: b */
    private C14104a f57780b = new C14104a();

    /* JADX INFO: renamed from: a */
    public int m82591a(C13946a[] c13946aArr, int i, int i2) {
        if (c13946aArr == null) {
            return -1;
        }
        if (c13946aArr.length == 1) {
            return c13946aArr[0].f57761a;
        }
        C13946a[] c13946aArrM82590a = this.f57779a.m82590a(c13946aArr);
        C14027a[] c14027aArr = new C14027a[c13946aArr.length];
        int length = c13946aArrM82590a.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            C13946a c13946a = c13946aArrM82590a[i3];
            C14027a c14027a = new C14027a();
            c14027a.f58406a = c13946a.f57761a;
            c14027a.f58407b = 0;
            c14027a.f58408c = c13946a.f57763c;
            c14027a.f58409d = c13946a.f57764d;
            c14027a.f58411f = new C14008a(c13946a.f57767g, c13946a.f57768h, c13946a.f57765e, c13946a.f57766f);
            c14027aArr[i4] = c14027a;
            i3++;
            i4++;
        }
        this.f57780b.m83379a(i, i2);
        this.f57780b.m83380a((C14008a) null);
        return this.f57780b.m83377a(c14027aArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m82592a() {
        this.f57779a.m82589a();
        this.f57780b.m83378a();
    }
}
