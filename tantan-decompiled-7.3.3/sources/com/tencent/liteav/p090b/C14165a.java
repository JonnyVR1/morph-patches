package com.tencent.liteav.p090b;

import com.tencent.liteav.beauty.C14263d;
import com.tencent.liteav.beauty.p098b.C14261z;

/* JADX INFO: renamed from: com.tencent.liteav.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14165a extends C14261z {

    /* JADX INFO: renamed from: x */
    private String f58889x;

    public C14165a(String str, String str2) {
        super(str, str2);
        this.f58889x = "WatermarkTexture";
        ((C14261z) this).f59671t = true;
        ((C14261z) this).f59672u = 770;
    }

    /* JADX INFO: renamed from: a */
    public void m83897a(C14263d.f[] fVarArr) {
        if (((C14261z) this).f59669r == null) {
            ((C14261z) this).f59669r = new C14261z.a[fVarArr.length];
        }
        int i = 0;
        while (i < fVarArr.length) {
            C14261z.a[] aVarArr = ((C14261z) this).f59669r;
            if (aVarArr[i] == null) {
                aVarArr[i] = new C14261z.a();
            }
            C14261z.a aVar = ((C14261z) this).f59669r[i];
            if (aVar.f59679d == null) {
                aVar.f59679d = new int[1];
            }
            C14263d.f fVar = fVarArr[i];
            int i2 = fVar.f59875f;
            int i3 = fVar.f59876g;
            float f = fVar.f59871b;
            float f2 = fVar.f59872c;
            float f3 = fVar.f59873d;
            C14165a c14165a = this;
            c14165a.m84351a(i2, i3, f, f2, f3, i);
            ((C14261z) c14165a).f59669r[i].f59679d[0] = fVarArr[i].f59874e;
            i++;
            this = c14165a;
        }
    }
}
