package com.tencent.liteav.p085b;

import com.tencent.liteav.beauty.C14100d;
import com.tencent.liteav.beauty.p093b.C14098z;

/* JADX INFO: renamed from: com.tencent.liteav.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14002a extends C14098z {

    /* JADX INFO: renamed from: x */
    private String f58041x;

    public C14002a(String str, String str2) {
        super(str, str2);
        this.f58041x = "WatermarkTexture";
        ((C14098z) this).f58823t = true;
        ((C14098z) this).f58824u = 770;
    }

    /* JADX INFO: renamed from: a */
    public void m82714a(C14100d.f[] fVarArr) {
        if (((C14098z) this).f58821r == null) {
            ((C14098z) this).f58821r = new C14098z.a[fVarArr.length];
        }
        int i = 0;
        while (i < fVarArr.length) {
            C14098z.a[] aVarArr = ((C14098z) this).f58821r;
            if (aVarArr[i] == null) {
                aVarArr[i] = new C14098z.a();
            }
            C14098z.a aVar = ((C14098z) this).f58821r[i];
            if (aVar.f58831d == null) {
                aVar.f58831d = new int[1];
            }
            C14100d.f fVar = fVarArr[i];
            int i2 = fVar.f59027f;
            int i3 = fVar.f59028g;
            float f = fVar.f59023b;
            float f2 = fVar.f59024c;
            float f3 = fVar.f59025d;
            C14002a c14002a = this;
            c14002a.m83168a(i2, i3, f, f2, f3, i);
            ((C14098z) c14002a).f58821r[i].f58831d[0] = fVarArr[i].f59026e;
            i++;
            this = c14002a;
        }
    }
}
