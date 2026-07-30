package com.tencent.liteav.beauty;

import android.graphics.Bitmap;
import com.tencent.liteav.basic.license.InterfaceC14034e;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14061b implements TXBeautyManager {

    /* JADX INFO: renamed from: a */
    private InterfaceC14034e f58571a;

    /* JADX INFO: renamed from: b */
    private C14100d f58572b;

    /* JADX INFO: renamed from: c */
    private int f58573c;

    /* JADX INFO: renamed from: e */
    private boolean f58575e = true;

    /* JADX INFO: renamed from: d */
    private a f58574d = new a();

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b$a */
    public class a {

        /* JADX INFO: renamed from: A */
        public float f58576A;

        /* JADX INFO: renamed from: B */
        public String f58577B;

        /* JADX INFO: renamed from: a */
        public int f58579a;

        /* JADX INFO: renamed from: b */
        public int f58580b;

        /* JADX INFO: renamed from: c */
        public int f58581c;

        /* JADX INFO: renamed from: d */
        public int f58582d;

        /* JADX INFO: renamed from: e */
        public int f58583e;

        /* JADX INFO: renamed from: f */
        public int f58584f;

        /* JADX INFO: renamed from: g */
        public int f58585g;

        /* JADX INFO: renamed from: h */
        public int f58586h;

        /* JADX INFO: renamed from: i */
        public int f58587i;

        /* JADX INFO: renamed from: j */
        public int f58588j;

        /* JADX INFO: renamed from: k */
        public int f58589k;

        /* JADX INFO: renamed from: l */
        public int f58590l;

        /* JADX INFO: renamed from: m */
        public int f58591m;

        /* JADX INFO: renamed from: n */
        public int f58592n;

        /* JADX INFO: renamed from: o */
        public int f58593o;

        /* JADX INFO: renamed from: p */
        public int f58594p;

        /* JADX INFO: renamed from: q */
        public int f58595q;

        /* JADX INFO: renamed from: r */
        public int f58596r;

        /* JADX INFO: renamed from: s */
        public int f58597s;

        /* JADX INFO: renamed from: t */
        public int f58598t;

        /* JADX INFO: renamed from: u */
        public int f58599u;

        /* JADX INFO: renamed from: v */
        public int f58600v;

        /* JADX INFO: renamed from: w */
        public int f58601w;

        /* JADX INFO: renamed from: x */
        public String f58602x;

        /* JADX INFO: renamed from: y */
        public boolean f58603y;

        /* JADX INFO: renamed from: z */
        public Bitmap f58604z;

        public a() {
        }
    }

    public C14061b(InterfaceC14034e interfaceC14034e) {
        this.f58571a = interfaceC14034e;
        enableSharpnessEnhancement(true);
        setFilterStrength(0.5f);
    }

    /* JADX INFO: renamed from: a */
    private void m83085a() {
        TXCLog.m82964d("TXBeautyManager", "applyBeautyParams");
        this.f58572b.m83293b(this.f58573c);
        m83086b(this.f58575e);
        if (this.f58571a.mo82961a()) {
            this.f58572b.m83300g(this.f58574d.f58583e);
            this.f58572b.m83301h(this.f58574d.f58584f);
            this.f58572b.m83302i(this.f58574d.f58585g);
            this.f58572b.m83304k(this.f58574d.f58586h);
            this.f58572b.m83303j(this.f58574d.f58587i);
            this.f58572b.m83305l(this.f58574d.f58588j);
            this.f58572b.m83306m(this.f58574d.f58589k);
            this.f58572b.m83307n(this.f58574d.f58590l);
            this.f58572b.m83308o(this.f58574d.f58591m);
            this.f58572b.m83309p(this.f58574d.f58592n);
            this.f58572b.m83310q(this.f58574d.f58593o);
            this.f58572b.m83311r(this.f58574d.f58594p);
            this.f58572b.m83312s(this.f58574d.f58595q);
            this.f58572b.m83313t(this.f58574d.f58596r);
            this.f58572b.m83314u(this.f58574d.f58597s);
            this.f58572b.m83315v(this.f58574d.f58598t);
            this.f58572b.m83316w(this.f58574d.f58599u);
            this.f58572b.m83317x(this.f58574d.f58600v);
            this.f58572b.m83318y(this.f58574d.f58601w);
            this.f58572b.m83291a(this.f58574d.f58577B, true);
        }
        this.f58572b.m83280a(this.f58574d.f58604z);
        this.f58572b.m83276a(this.f58574d.f58576A);
        this.f58572b.m83287a(this.f58574d.f58602x);
        this.f58572b.m83296c(this.f58574d.f58603y);
    }

    /* JADX INFO: renamed from: b */
    private void m83086b(boolean z) {
        C14100d c14100d = this.f58572b;
        if (z) {
            c14100d.m83295c(this.f58574d.f58579a);
            this.f58572b.m83297d(this.f58574d.f58580b);
            this.f58572b.m83298e(this.f58574d.f58581c);
            this.f58572b.m83299f(this.f58574d.f58582d);
            return;
        }
        c14100d.m83295c(0);
        this.f58572b.m83297d(0);
        this.f58572b.m83298e(0);
        this.f58572b.m83299f(0);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void enableSharpnessEnhancement(boolean z) {
        TXCLog.m82965d("TXBeautyManager", "enableSharpnessEnhancement enable: %b", Boolean.valueOf(z));
        a aVar = this.f58574d;
        int i = z ? 4 : 0;
        aVar.f58582d = i;
        C14100d c14100d = this.f58572b;
        if (c14100d == null || !this.f58575e) {
            return;
        }
        c14100d.m83299f(i);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setBeautyLevel beautyLevel:" + i);
        this.f58574d.f58579a = i;
        C14100d c14100d = this.f58572b;
        if (c14100d == null || !this.f58575e) {
            return;
        }
        c14100d.m83295c(i);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyStyle(int i) {
        TXCLog.m82964d("TXBeautyManager", "setBeautyStyle beautyStyle:" + i);
        this.f58573c = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83293b(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setChinLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setChinLevel chinLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58586h = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83304k(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeAngleLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setEyeAngleLevel eyeAngleLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58596r = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83313t(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeDistanceLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setEyeDistanceLevel eyeDistanceLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58595q = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83312s(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeLightenLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setEyeLightenLevel eyeLightenLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58589k = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83306m(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeScaleLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setEyeScaleLevel eyeScaleLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58583e = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83300g(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceBeautyLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setFaceBeautyLevel faceBeautyLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58601w = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83318y(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceShortLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setFaceShortLevel faceShortLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58587i = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83303j(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceSlimLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setFaceSlimLevel faceSlimLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58584f = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83301h(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceVLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setFaceVLevel faceVLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58585g = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83302i(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilter(Bitmap bitmap) {
        TXCLog.m82964d("TXBeautyManager", "setFilter image:" + bitmap);
        this.f58574d.f58604z = bitmap;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83280a(bitmap);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilterStrength(float f) {
        TXCLog.m82964d("TXBeautyManager", "setFilterStrength strength:" + f);
        this.f58574d.f58576A = f;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83276a(f);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setForeheadLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setForeheadLevel foreheadLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58594p = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83311r(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setGreenScreenFile(String str) {
        TXCLog.m82964d("TXBeautyManager", "setGreenScreenFile path:" + str);
        this.f58574d.f58577B = str;
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82966e("TXBeautyManager", "setGreenScreenFile is only supported in EnterprisePro license");
            return;
        }
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83291a(str, true);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setLipsThicknessLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setLipsThicknessLevel lipsThicknessLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58600v = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83317x(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionMute(boolean z) {
        TXCLog.m82964d("TXBeautyManager", "setMotionMute motionMute:" + z);
        this.f58574d.f58603y = z;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83296c(z);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionTmpl(String str) {
        TXCLog.m82964d("TXBeautyManager", "setMotionTmpl tmplPath:" + str);
        this.f58574d.f58602x = str;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83287a(str);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMouthShapeLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setMouthShapeLevel mouthShapeLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58597s = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83314u(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNosePositionLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setNosePositionLevel nosePositionLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58599u = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83316w(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNoseSlimLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setNoseSlimLevel noseSlimLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58588j = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83305l(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNoseWingLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setNoseWingLevel noseWingLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58598t = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83315v(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setPounchRemoveLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setPounchRemoveLevel pounchRemoveLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58592n = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83309p(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setPreprocessor(C14100d c14100d) {
        this.f58572b = c14100d;
        if (c14100d != null) {
            m83085a();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setRuddyLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setRuddyLevel ruddyLevel:" + i);
        this.f58574d.f58581c = i;
        C14100d c14100d = this.f58572b;
        if (c14100d == null || !this.f58575e) {
            return;
        }
        c14100d.m83298e(i);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setSmileLinesRemoveLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setSmileLinesRemoveLevel smileLinesRemoveLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58593o = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83310q(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setToothWhitenLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setToothWhitenLevel toothWhitenLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58590l = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83307n(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWhitenessLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setWhitenessLevel whitenessLevel:" + i);
        this.f58574d.f58580b = i;
        C14100d c14100d = this.f58572b;
        if (c14100d == null || !this.f58575e) {
            return;
        }
        c14100d.m83297d(i);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWrinkleRemoveLevel(int i) {
        TXCLog.m82964d("TXBeautyManager", "setWrinkleRemoveLevel wrinkleRemoveLevel:" + i);
        if (!this.f58571a.mo82961a()) {
            TXCLog.m82969i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.f58574d.f58591m = i;
        C14100d c14100d = this.f58572b;
        if (c14100d != null) {
            c14100d.m83308o(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83087a(boolean z) {
        this.f58575e = z;
        m83086b(z);
    }
}
