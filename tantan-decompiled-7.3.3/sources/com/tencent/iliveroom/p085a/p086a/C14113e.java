package com.tencent.iliveroom.p085a.p086a;

import com.tencent.liteav.basic.p093c.C14171a;
import com.tencent.liteav.basic.p095e.C14190a;
import com.tencent.liteav.p102c.C14267a;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.a.e */
/* JADX INFO: loaded from: classes12.dex */
public class C14113e {

    /* JADX INFO: renamed from: a */
    private C14111c f58627a = new C14111c();

    /* JADX INFO: renamed from: b */
    private C14267a f58628b = new C14267a();

    /* JADX INFO: renamed from: a */
    public int m83774a(C14109a[] c14109aArr, int i, int i2) {
        if (c14109aArr == null) {
            return -1;
        }
        if (c14109aArr.length == 1) {
            return c14109aArr[0].f58609a;
        }
        C14109a[] c14109aArrM83773a = this.f58627a.m83773a(c14109aArr);
        C14190a[] c14190aArr = new C14190a[c14109aArr.length];
        int length = c14109aArrM83773a.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            C14109a c14109a = c14109aArrM83773a[i3];
            C14190a c14190a = new C14190a();
            c14190a.f59254a = c14109a.f58609a;
            c14190a.f59255b = 0;
            c14190a.f59256c = c14109a.f58611c;
            c14190a.f59257d = c14109a.f58612d;
            c14190a.f59259f = new C14171a(c14109a.f58615g, c14109a.f58616h, c14109a.f58613e, c14109a.f58614f);
            c14190aArr[i4] = c14190a;
            i3++;
            i4++;
        }
        this.f58628b.m84562a(i, i2);
        this.f58628b.m84563a((C14171a) null);
        return this.f58628b.m84560a(c14190aArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m83775a() {
        this.f58627a.m83772a();
        this.f58628b.m84561a();
    }
}
