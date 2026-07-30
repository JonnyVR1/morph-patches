package com.tencent.iliveroom.p085a.p086a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.a.c */
/* JADX INFO: loaded from: classes12.dex */
public class C14111c {

    /* JADX INFO: renamed from: a */
    private List<C14114f> f58623a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public C14109a[] m83773a(C14109a[] c14109aArr) {
        C14114f c14114f;
        int i = 0;
        int i2 = 0;
        for (C14109a c14109a : c14109aArr) {
            ByteBuffer byteBuffer = c14109a.f58610b;
            if (byteBuffer != null) {
                if (i2 < this.f58623a.size()) {
                    c14114f = this.f58623a.get(i2);
                } else {
                    c14114f = new C14114f();
                    this.f58623a.add(c14114f);
                }
                c14109a.f58609a = c14114f.m83781a(byteBuffer, c14109a.f58611c, c14109a.f58612d);
                i2++;
            }
        }
        if (this.f58623a.size() > c14109aArr.length) {
            Iterator<C14114f> it = this.f58623a.iterator();
            while (it.hasNext()) {
                C14114f next = it.next();
                if (i >= c14109aArr.length) {
                    next.m83782a();
                    it.remove();
                }
                i++;
            }
        }
        return c14109aArr;
    }

    /* JADX INFO: renamed from: a */
    public void m83772a() {
        for (C14114f c14114f : this.f58623a) {
            if (c14114f != null) {
                c14114f.m83782a();
            }
        }
        this.f58623a.clear();
    }
}
