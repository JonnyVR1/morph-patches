package com.tencent.iliveroom.p080a.p081a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13948c {

    /* JADX INFO: renamed from: a */
    private List<C13951f> f57775a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public C13946a[] m82590a(C13946a[] c13946aArr) {
        C13951f c13951f;
        int i = 0;
        int i2 = 0;
        for (C13946a c13946a : c13946aArr) {
            ByteBuffer byteBuffer = c13946a.f57762b;
            if (byteBuffer != null) {
                if (i2 < this.f57775a.size()) {
                    c13951f = this.f57775a.get(i2);
                } else {
                    c13951f = new C13951f();
                    this.f57775a.add(c13951f);
                }
                c13946a.f57761a = c13951f.m82598a(byteBuffer, c13946a.f57763c, c13946a.f57764d);
                i2++;
            }
        }
        if (this.f57775a.size() > c13946aArr.length) {
            Iterator<C13951f> it = this.f57775a.iterator();
            while (it.hasNext()) {
                C13951f next = it.next();
                if (i >= c13946aArr.length) {
                    next.m82599a();
                    it.remove();
                }
                i++;
            }
        }
        return c13946aArr;
    }

    /* JADX INFO: renamed from: a */
    public void m82589a() {
        for (C13951f c13951f : this.f57775a) {
            if (c13951f != null) {
                c13951f.m82599a();
            }
        }
        this.f57775a.clear();
    }
}
