package com.tencent.liteav.beauty;

import android.graphics.Bitmap;
import com.tencent.liteav.basic.license.InterfaceC14197e;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14224b implements TXBeautyManager {

    /* JADX INFO: renamed from: a */
    private InterfaceC14197e f59419a;

    /* JADX INFO: renamed from: b */
    private C14263d f59420b;

    /* JADX INFO: renamed from: c */
    private int f59421c;

    /* JADX INFO: renamed from: e */
    private boolean f59423e = true;

    /* JADX INFO: renamed from: d */
    private a f59422d = new a();

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b$a */
    public class a {

        /* JADX INFO: renamed from: A */
        public float f59424A;

        /* JADX INFO: renamed from: B */
        public String f59425B;

        /* JADX INFO: renamed from: a */
        public int f59427a;

        /* JADX INFO: renamed from: b */
        public int f59428b;

        /* JADX INFO: renamed from: c */
        public int f59429c;

        /* JADX INFO: renamed from: d */
        public int f59430d;

        /* JADX INFO: renamed from: e */
        public int f59431e;

        /* JADX INFO: renamed from: f */
        public int f59432f;

        /* JADX INFO: renamed from: g */
        public int f59433g;

        /* JADX INFO: renamed from: h */
        public int f59434h;

        /* JADX INFO: renamed from: i */
        public int f59435i;

        /* JADX INFO: renamed from: j */
        public int f59436j;

        /* JADX INFO: renamed from: k */
        public int f59437k;

        /* JADX INFO: renamed from: l */
        public int f59438l;

        /* JADX INFO: renamed from: m */
        public int f59439m;

        /* JADX INFO: renamed from: n */
        public int f59440n;

        /* JADX INFO: renamed from: o */
        public int f59441o;

        /* JADX INFO: renamed from: p */
        public int f59442p;

        /* JADX INFO: renamed from: q */
        public int f59443q;

        /* JADX INFO: renamed from: r */
        public int f59444r;

        /* JADX INFO: renamed from: s */
        public int f59445s;

        /* JADX INFO: renamed from: t */
        public int f59446t;

        /* JADX INFO: renamed from: u */
        public int f59447u;

        /* JADX INFO: renamed from: v */
        public int f59448v;

        /* JADX INFO: renamed from: w */
        public int f59449w;

        /* JADX INFO: renamed from: x */
        public String f59450x;

        /* JADX INFO: renamed from: y */
        public boolean f59451y;

        /* JADX INFO: renamed from: z */
        public Bitmap f59452z;

        public a() {
        }
    }

    public C14224b(InterfaceC14197e interfaceC14197e) {
        this.f59419a = interfaceC14197e;
        enableSharpnessEnhancement(true);
        setFilterStrength(0.5f);
    }

    /* JADX INFO: renamed from: a */
    private void m84268a() {
        TXCLog.m84147d("TXBeautyManager", "applyBeautyParams");
        this.f59420b.m84476b(this.f59421c);
        m84269b(this.f59423e);
        if (this.f59419a.mo84144a()) {
            this.f59420b.m84483g(this.f59422d.f59431e);
            this.f59420b.m84484h(this.f59422d.f59432f);
            this.f59420b.m84485i(this.f59422d.f59433g);
            this.f59420b.m84487k(this.f59422d.f59434h);
            this.f59420b.m84486j(this.f59422d.f59435i);
            this.f59420b.m84488l(this.f59422d.f59436j);
            this.f59420b.m84489m(this.f59422d.f59437k);
            this.f59420b.m84490n(this.f59422d.f59438l);
            this.f59420b.m84491o(this.f59422d.f59439m);
            this.f59420b.m84492p(this.f59422d.f59440n);
            this.f59420b.m84493q(this.f59422d.f59441o);
            this.f59420b.m84494r(this.f59422d.f59442p);
            this.f59420b.m84495s(this.f59422d.f59443q);
            this.f59420b.m84496t(this.f59422d.f59444r);
            this.f59420b.m84497u(this.f59422d.f59445s);
            this.f59420b.m84498v(this.f59422d.f59446t);
            this.f59420b.m84499w(this.f59422d.f59447u);
            this.f59420b.m84500x(this.f59422d.f59448v);
            this.f59420b.m84501y(this.f59422d.f59449w);
            this.f59420b.m84474a(this.f59422d.f59425B, true);
        }
        this.f59420b.m84463a(this.f59422d.f59452z);
        this.f59420b.m84459a(this.f59422d.f59424A);
        this.f59420b.m84470a(this.f59422d.f59450x);
        this.f59420b.m84479c(this.f59422d.f59451y);
    }

    /* JADX INFO: renamed from: b */
    private void m84269b(boolean z) {
        C14263d c14263d = this.f59420b;
        if (z) {
            c14263d.m84478c(this.f59422d.f59427a);
            this.f59420b.m84480d(this.f59422d.f59428b);
            this.f59420b.m84481e(this.f59422d.f59429c);
            this.f59420b.m84482f(this.f59422d.f59430d);
            return;
        }
        c14263d.m84478c(0);
        this.f59420b.m84480d(0);
        this.f59420b.m84481e(0);
        this.f59420b.m84482f(0);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void enableSharpnessEnhancement(boolean z) {
        TXCLog.m84148d("TXBeautyManager", "enableSharpnessEnhancement enable: %b", Boolean.valueOf(z));
        a aVar = this.f59422d;
        int i = z ? 4 : 0;
        aVar.f59430d = i;
        C14263d c14263d = this.f59420b;
        if (c14263d == null || !this.f59423e) {
            return;
        }
        c14263d.m84482f(i);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setBeautyLevel beautyLevel:" + i);
        this.f59422d.f59427a = i;
        C14263d c14263d = this.f59420b;
        if (c14263d == null || !this.f59423e) {
            return;
        }
        c14263d.m84478c(i);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyStyle(int i) {
        TXCLog.m84147d("TXBeautyManager", "setBeautyStyle beautyStyle:" + i);
        this.f59421c = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84476b(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setChinLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setChinLevel chinLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59434h = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84487k(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeAngleLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setEyeAngleLevel eyeAngleLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59444r = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84496t(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeDistanceLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setEyeDistanceLevel eyeDistanceLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59443q = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84495s(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeLightenLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setEyeLightenLevel eyeLightenLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59437k = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84489m(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeScaleLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setEyeScaleLevel eyeScaleLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59431e = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84483g(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceBeautyLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setFaceBeautyLevel faceBeautyLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59449w = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84501y(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceShortLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setFaceShortLevel faceShortLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59435i = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84486j(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceSlimLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setFaceSlimLevel faceSlimLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59432f = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84484h(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceVLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setFaceVLevel faceVLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59433g = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84485i(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilter(Bitmap bitmap) {
        TXCLog.m84147d("TXBeautyManager", "setFilter image:" + bitmap);
        this.f59422d.f59452z = bitmap;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84463a(bitmap);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilterStrength(float f) {
        TXCLog.m84147d("TXBeautyManager", "setFilterStrength strength:" + f);
        this.f59422d.f59424A = f;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84459a(f);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setForeheadLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setForeheadLevel foreheadLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59442p = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84494r(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setGreenScreenFile(String str) {
        TXCLog.m84147d("TXBeautyManager", "setGreenScreenFile path:" + str);
        this.f59422d.f59425B = str;
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84149e("TXBeautyManager", "setGreenScreenFile is only supported in EnterprisePro license");
            return;
        }
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84474a(str, true);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setLipsThicknessLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setLipsThicknessLevel lipsThicknessLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59448v = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84500x(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionMute(boolean z) {
        TXCLog.m84147d("TXBeautyManager", "setMotionMute motionMute:" + z);
        this.f59422d.f59451y = z;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84479c(z);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionTmpl(String str) {
        TXCLog.m84147d("TXBeautyManager", "setMotionTmpl tmplPath:" + str);
        this.f59422d.f59450x = str;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84470a(str);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMouthShapeLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setMouthShapeLevel mouthShapeLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59445s = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84497u(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNosePositionLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setNosePositionLevel nosePositionLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59447u = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84499w(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNoseSlimLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setNoseSlimLevel noseSlimLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59436j = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84488l(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNoseWingLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setNoseWingLevel noseWingLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59446t = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84498v(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setPounchRemoveLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setPounchRemoveLevel pounchRemoveLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59440n = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84492p(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setPreprocessor(C14263d c14263d) {
        this.f59420b = c14263d;
        if (c14263d != null) {
            m84268a();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setRuddyLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setRuddyLevel ruddyLevel:" + i);
        this.f59422d.f59429c = i;
        C14263d c14263d = this.f59420b;
        if (c14263d == null || !this.f59423e) {
            return;
        }
        c14263d.m84481e(i);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setSmileLinesRemoveLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setSmileLinesRemoveLevel smileLinesRemoveLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59441o = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84493q(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setToothWhitenLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setToothWhitenLevel toothWhitenLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59438l = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84490n(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWhitenessLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setWhitenessLevel whitenessLevel:" + i);
        this.f59422d.f59428b = i;
        C14263d c14263d = this.f59420b;
        if (c14263d == null || !this.f59423e) {
            return;
        }
        c14263d.m84480d(i);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWrinkleRemoveLevel(int i) {
        TXCLog.m84147d("TXBeautyManager", "setWrinkleRemoveLevel wrinkleRemoveLevel:" + i);
        if (!this.f59419a.mo84144a()) {
            TXCLog.m84152i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f59422d.f59439m = i;
        C14263d c14263d = this.f59420b;
        if (c14263d != null) {
            c14263d.m84491o(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84270a(boolean z) {
        this.f59423e = z;
        m84269b(z);
    }
}
