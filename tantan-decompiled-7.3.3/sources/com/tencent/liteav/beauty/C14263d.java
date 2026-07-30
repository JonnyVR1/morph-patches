package com.tencent.liteav.beauty;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Bitmap;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14203a;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14171a;
import com.tencent.liteav.basic.p093c.C14180j;
import com.tencent.liteav.basic.structs.C14205b;
import com.tencent.liteav.basic.util.C14213d;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14263d extends C14203a implements InterfaceC14264e {

    /* JADX INFO: renamed from: a */
    protected Context f59822a;

    /* JADX INFO: renamed from: b */
    protected boolean f59823b;

    /* JADX INFO: renamed from: h */
    protected HandlerThreadC14262c f59829h;

    /* JADX INFO: renamed from: k */
    InterfaceC14265f f59832k;

    /* JADX INFO: renamed from: p */
    private Object f59837p;

    /* JADX INFO: renamed from: c */
    protected boolean f59824c = false;

    /* JADX INFO: renamed from: d */
    protected int f59825d = 0;

    /* JADX INFO: renamed from: e */
    protected int f59826e = 0;

    /* JADX INFO: renamed from: f */
    protected int f59827f = 1;

    /* JADX INFO: renamed from: g */
    protected C14171a f59828g = null;

    /* JADX INFO: renamed from: i */
    protected b f59830i = new b();

    /* JADX INFO: renamed from: j */
    protected c f59831j = null;

    /* JADX INFO: renamed from: l */
    private d f59833l = d.MODE_THRESHOLD;

    /* JADX INFO: renamed from: m */
    private long f59834m = 0;

    /* JADX INFO: renamed from: n */
    private long f59835n = 0;

    /* JADX INFO: renamed from: o */
    private long f59836o = 0;

    /* JADX INFO: renamed from: q */
    private a f59838q = new a(this);

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        int f59841a;

        /* JADX INFO: renamed from: b */
        int f59842b;

        /* JADX INFO: renamed from: c */
        int f59843c;

        /* JADX INFO: renamed from: d */
        int f59844d;

        /* JADX INFO: renamed from: e */
        int f59845e;

        /* JADX INFO: renamed from: f */
        int f59846f;

        /* JADX INFO: renamed from: g */
        int f59847g;

        /* JADX INFO: renamed from: h */
        int f59848h;

        /* JADX INFO: renamed from: i */
        boolean f59849i;

        /* JADX INFO: renamed from: j */
        boolean f59850j;

        /* JADX INFO: renamed from: k */
        public int f59851k = 5;

        /* JADX INFO: renamed from: l */
        public int f59852l = 0;

        /* JADX INFO: renamed from: m */
        C14171a f59853m = null;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f59854a;

        /* JADX INFO: renamed from: b */
        public int f59855b;

        /* JADX INFO: renamed from: c */
        public int f59856c;

        /* JADX INFO: renamed from: d */
        public int f59857d;

        /* JADX INFO: renamed from: e */
        public boolean f59858e;

        /* JADX INFO: renamed from: f */
        public int f59859f;

        /* JADX INFO: renamed from: g */
        public int f59860g;

        /* JADX INFO: renamed from: h */
        public int f59861h;

        /* JADX INFO: renamed from: i */
        public int f59862i;

        /* JADX INFO: renamed from: j */
        public C14171a f59863j;

        private c() {
            this.f59858e = false;
            this.f59861h = 5;
            this.f59862i = 0;
            this.f59863j = null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$d */
    public enum d {
        MODE_SAME_AS_OUTPUT,
        MODE_SAME_AS_INPUT,
        MODE_THRESHOLD
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public g f59868a = g.TXE_FILL_MODE_SCALL_ASPECT_FILL;

        /* JADX INFO: renamed from: b */
        public boolean f59869b = false;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public Bitmap f59870a;

        /* JADX INFO: renamed from: b */
        public float f59871b;

        /* JADX INFO: renamed from: c */
        public float f59872c;

        /* JADX INFO: renamed from: d */
        public float f59873d;

        /* JADX INFO: renamed from: e */
        public int f59874e;

        /* JADX INFO: renamed from: f */
        public int f59875f;

        /* JADX INFO: renamed from: g */
        public int f59876g;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$g */
    public enum g {
        TXE_FILL_MODE_SCALL_TO_FILL,
        TXE_FILL_MODE_SCALL_ASPECT_FILL
    }

    public C14263d(Context context, boolean z) {
        this.f59823b = true;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        TXCLog.m84152i("TXCVideoPreprocessor", "TXCVideoPreprocessor version: VideoPreprocessor-v1.1");
        ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
        if (deviceConfigurationInfo != null) {
            TXCLog.m84152i("TXCVideoPreprocessor", "opengl es version " + deviceConfigurationInfo.reqGlEsVersion);
            TXCLog.m84152i("TXCVideoPreprocessor", "set GLContext " + z);
            if (deviceConfigurationInfo.reqGlEsVersion > 131072) {
                TXCLog.m84152i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_3");
                C14180j.m84013a(3);
            } else {
                TXCLog.m84152i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_2");
                C14180j.m84013a(2);
            }
        } else {
            TXCLog.m84149e("TXCVideoPreprocessor", "getDeviceConfigurationInfo opengl Info failed!");
        }
        this.f59822a = context;
        this.f59823b = z;
        this.f59829h = new HandlerThreadC14262c(this.f59822a, this.f59823b);
        C14220a.m84249a().m84251a(context);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0156  */
    /* JADX INFO: renamed from: a */
    private boolean m84449a(int i, int i2, int i3, int i4, int i5) {
        C14263d c14263d;
        c cVar;
        int i6;
        int i7;
        C14171a c14171a;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C14171a c14171a2;
        C14171a c14171a3;
        C14171a c14171a4;
        C14171a c14171a5;
        if (this.f59831j == null) {
            this.f59831j = new c();
            this.f59835n = 0L;
            this.f59836o = System.currentTimeMillis();
        }
        c cVar2 = this.f59831j;
        if (i == cVar2.f59855b && i2 == cVar2.f59856c && i3 == cVar2.f59857d && (((i6 = this.f59825d) <= 0 || i6 == cVar2.f59859f) && (((i7 = this.f59826e) <= 0 || i7 == cVar2.f59860g) && (((c14171a = this.f59828g) == null || (((i9 = c14171a.f58929c) <= 0 || ((c14171a5 = cVar2.f59863j) != null && i9 == c14171a5.f58929c)) && (((i10 = c14171a.f58930d) <= 0 || ((c14171a4 = cVar2.f59863j) != null && i10 == c14171a4.f58930d)) && (((i11 = c14171a.f58927a) < 0 || ((c14171a3 = cVar2.f59863j) != null && i11 == c14171a3.f58927a)) && ((i12 = c14171a.f58928b) < 0 || ((c14171a2 = cVar2.f59863j) != null && i12 == c14171a2.f58928b)))))) && this.f59824c == cVar2.f59858e && (i8 = cVar2.f59861h) == i4)))) {
            if (i4 == i8 && i5 == cVar2.f59862i) {
                return true;
            }
            cVar2.f59861h = i4;
            b bVar = this.f59830i;
            bVar.f59851k = i4;
            cVar2.f59862i = i5;
            bVar.f59852l = i5;
            this.f59829h.m84419b(i5);
            return true;
        }
        TXCLog.m84152i("TXCVideoPreprocessor", "Init sdk");
        TXCLog.m84152i("TXCVideoPreprocessor", "Input widht " + i + " height " + i2);
        c cVar3 = this.f59831j;
        cVar3.f59855b = i;
        cVar3.f59856c = i2;
        C14171a c14171a6 = this.f59828g;
        if (c14171a6 != null && c14171a6.f58927a >= 0 && c14171a6.f58928b >= 0 && c14171a6.f58929c > 0 && c14171a6.f58930d > 0) {
            TXCLog.m84152i("TXCVideoPreprocessor", "set Crop Rect; init ");
            C14171a c14171a7 = this.f59828g;
            int i13 = c14171a7.f58927a;
            int i14 = i - i13;
            int i15 = c14171a7.f58929c;
            i = i14 > i15 ? i15 : i - i13;
            int i16 = c14171a7.f58928b;
            int i17 = i2 - i16;
            int i18 = c14171a7.f58930d;
            i2 = i17 > i18 ? i18 : i2 - i16;
            c14171a7.f58929c = i;
            c14171a7.f58930d = i2;
        }
        int i19 = i;
        int i20 = i2;
        c cVar4 = this.f59831j;
        cVar4.f59863j = this.f59828g;
        cVar4.f59857d = i3;
        cVar4.f59854a = this.f59823b;
        cVar4.f59861h = i4;
        cVar4.f59862i = i5;
        int i21 = this.f59825d;
        cVar4.f59859f = i21;
        int i22 = this.f59826e;
        cVar4.f59860g = i22;
        if (i21 <= 0 || i22 <= 0) {
            if (90 == i3 || 270 == i3) {
                cVar4.f59859f = i20;
                cVar4.f59860g = i19;
            } else {
                cVar4.f59859f = i19;
                cVar4.f59860g = i20;
            }
        }
        d dVar = this.f59833l;
        if (dVar != d.MODE_SAME_AS_OUTPUT) {
            if (dVar != d.MODE_SAME_AS_INPUT) {
                c14263d = this;
                C14213d c14213dM84451b = c14263d.m84451b(i19, i20, i3, cVar4.f59859f, cVar4.f59860g);
                i19 = ((c14213dM84451b.f59350a + 7) / 8) * 8;
                i20 = ((c14213dM84451b.f59351b + 7) / 8) * 8;
            }
            cVar = c14263d.f59831j;
            cVar.f59858e = c14263d.f59824c;
            if (!c14263d.m84450a(cVar, i19, i20)) {
                return true;
            }
            TXCLog.m84149e("TXCVideoPreprocessor", "init failed!");
            return false;
        }
        if (90 == i3 || 270 == i3) {
            i19 = cVar4.f59860g;
            i20 = cVar4.f59859f;
        } else {
            i19 = cVar4.f59859f;
            i20 = cVar4.f59860g;
        }
        c14263d = this;
        cVar = c14263d.f59831j;
        cVar.f59858e = c14263d.f59824c;
        if (!c14263d.m84450a(cVar, i19, i20)) {
            return true;
        }
        TXCLog.m84149e("TXCVideoPreprocessor", "init failed!");
        return false;
    }

    /* JADX INFO: renamed from: b */
    private C14213d m84451b(int i, int i2, int i3, int i4, int i5) {
        if (i3 == 90 || i3 == 270) {
            i5 = i4;
            i4 = i5;
        }
        int iMin = Math.min(i4, i5);
        int iMin2 = Math.min(i, i2);
        int[] iArr = {720, 1080, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr[i6];
            if (iMin <= i7 && iMin2 >= i7) {
                float f2 = (i7 * 1.0f) / iMin;
                return new C14213d((int) (i4 * f2), (int) (f2 * i5));
            }
        }
        return new C14213d(i, i2);
    }

    /* JADX INFO: renamed from: c */
    private void m84452c() {
        if (this.f59834m != 0) {
            setStatusValue(3002, Long.valueOf(System.currentTimeMillis() - this.f59834m));
        }
        this.f59835n++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f59836o;
        if (jCurrentTimeMillis > 2000 + j) {
            setStatusValue(3003, Double.valueOf((this.f59835n * 1000.0d) / (jCurrentTimeMillis - j)));
            this.f59835n = 0L;
            this.f59836o = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: z */
    private int m84453z(int i) {
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i != 3) {
            return i;
        }
        return 270;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m84480d(int i) {
        try {
            if (i > 9) {
                TXCLog.m84149e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.m84149e("TXCVideoPreprocessor", "Brightness < 0; set 0");
                i = 0;
            }
            HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
            if (handlerThreadC14262c != null) {
                handlerThreadC14262c.m84424e(i);
            }
            this.f59838q.m84503a("whiteLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m84481e(int i) {
        try {
            if (i > 9) {
                TXCLog.m84149e("TXCVideoPreprocessor", "Ruddy value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.m84149e("TXCVideoPreprocessor", "Ruddy < 0; set 0");
                i = 0;
            }
            HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
            if (handlerThreadC14262c != null) {
                handlerThreadC14262c.m84426g(i);
            }
            this.f59838q.m84503a("ruddyLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m84482f(int i) {
        if (i > 9) {
            TXCLog.m84149e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
            i = 9;
        } else if (i < 0) {
            TXCLog.m84149e("TXCVideoPreprocessor", "Brightness < 0; set 0");
            i = 0;
        }
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84425f(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m84483g(int i) {
        try {
            HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
            if (handlerThreadC14262c != null) {
                handlerThreadC14262c.m84427h(i);
            }
            this.f59838q.m84503a("eyeBigScale", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m84484h(int i) {
        try {
            HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
            if (handlerThreadC14262c != null) {
                handlerThreadC14262c.m84428i(i);
            }
            this.f59838q.m84503a("faceSlimLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m84485i(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84429j(i);
        }
        this.f59838q.m84503a("faceVLevel", i);
    }

    /* JADX INFO: renamed from: j */
    public void m84486j(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84430k(i);
        }
        this.f59838q.m84503a("faceShortLevel", i);
    }

    /* JADX INFO: renamed from: k */
    public void m84487k(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84431l(i);
        }
        this.f59838q.m84503a("chinLevel", i);
    }

    /* JADX INFO: renamed from: l */
    public void m84488l(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84432m(i);
        }
        this.f59838q.m84503a("noseSlimLevel", i);
    }

    /* JADX INFO: renamed from: m */
    public void m84489m(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84433n(i);
        }
        this.f59838q.m84503a("eyeLightenLevel", i);
    }

    /* JADX INFO: renamed from: n */
    public void m84490n(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84434o(i);
        }
        this.f59838q.m84503a("toothWhitenLevel", i);
    }

    /* JADX INFO: renamed from: o */
    public void m84491o(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84435p(i);
        }
        this.f59838q.m84503a("wrinkleRemoveLevel", i);
    }

    /* JADX INFO: renamed from: p */
    public void m84492p(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84436q(i);
        }
        this.f59838q.m84503a("pounchRemoveLevel", i);
    }

    /* JADX INFO: renamed from: q */
    public void m84493q(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84437r(i);
        }
        this.f59838q.m84503a("smileLinesRemoveLevel", i);
    }

    /* JADX INFO: renamed from: r */
    public void m84494r(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84438s(i);
        }
        this.f59838q.m84503a("foreheadLevel", i);
    }

    /* JADX INFO: renamed from: s */
    public void m84495s(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84439t(i);
        }
        this.f59838q.m84503a("eyeDistanceLevel", i);
    }

    @Override // com.tencent.liteav.basic.module.C14203a
    public void setID(String str) {
        super.setID(str);
        setStatusValue(3001, this.f59838q.m84502a());
    }

    /* JADX INFO: renamed from: t */
    public void m84496t(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84440u(i);
        }
        this.f59838q.m84503a("eyeAngleLevel", i);
    }

    /* JADX INFO: renamed from: u */
    public void m84497u(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84441v(i);
        }
        this.f59838q.m84503a("mouthShapeLevel", i);
    }

    /* JADX INFO: renamed from: v */
    public void m84498v(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84442w(i);
        }
        this.f59838q.m84503a("noseWingLevel", i);
    }

    /* JADX INFO: renamed from: w */
    public void m84499w(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84443x(i);
        }
        this.f59838q.m84503a("nosePositionLevel", i);
    }

    /* JADX INFO: renamed from: x */
    public void m84500x(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84444y(i);
        }
        this.f59838q.m84503a("lipsThicknessLevel", i);
    }

    /* JADX INFO: renamed from: y */
    public void m84501y(int i) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84445z(i);
        }
        this.f59838q.m84503a("faceBeautyLevel", i);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84477b(boolean z) {
        this.f59824c = z;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84475b() {
        try {
            HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
            if (handlerThreadC14262c != null) {
                handlerThreadC14262c.m84405a();
            }
            this.f59831j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m84478c(int i) {
        try {
            if (i > 9) {
                TXCLog.m84149e("TXCVideoPreprocessor", "Beauty value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.m84149e("TXCVideoPreprocessor", "Beauty < 0; set 0");
                i = 0;
            }
            HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
            if (handlerThreadC14262c != null) {
                handlerThreadC14262c.m84422c(i);
            }
            this.f59838q.m84503a("beautyLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84476b(int i) {
        try {
            HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
            if (handlerThreadC14262c != null) {
                handlerThreadC14262c.m84423d(i);
            }
            this.f59838q.m84503a("beautyStyle", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m84479c(boolean z) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84420b(z);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        WeakReference<C14263d> f59839a;

        /* JADX INFO: renamed from: b */
        private HashMap<String, String> f59840b = new HashMap<>();

        public a(C14263d c14263d) {
            this.f59839a = new WeakReference<>(c14263d);
        }

        /* JADX INFO: renamed from: a */
        public String m84502a() {
            String str = "";
            for (String str2 : this.f59840b.keySet()) {
                str = str + str2 + ":" + this.f59840b.get(str2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            }
            return "{" + str + "}";
        }

        /* JADX INFO: renamed from: a */
        public void m84503a(String str, int i) {
            String id;
            this.f59840b.put(str, String.valueOf(i));
            C14263d c14263d = this.f59839a.get();
            if (c14263d == null || (id = c14263d.getID()) == null || id.length() <= 0) {
                return;
            }
            c14263d.setStatusValue(3001, m84502a());
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14264e
    /* JADX INFO: renamed from: a */
    public void mo84462a(int i, int i2, int i3, long j) {
        m84452c();
        if (this.f59832k != null) {
            C14205b c14205b = new C14205b();
            c14205b.f59314e = i2;
            c14205b.f59315f = i3;
            c14205b.f59319j = 0;
            c cVar = this.f59831j;
            c14205b.f59318i = cVar != null ? cVar.f59858e : false;
            c14205b.f59310a = i;
            this.f59832k.mo84505a(c14205b, j);
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14264e
    /* JADX INFO: renamed from: a */
    public void mo84472a(byte[] bArr, int i, int i2, int i3, long j) {
        InterfaceC14265f interfaceC14265f = this.f59832k;
        if (interfaceC14265f != null) {
            interfaceC14265f.mo84506a(bArr, i, i2, i3, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84473a(float[] fArr) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84417a(fArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84471a(boolean z) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84415a(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m84457a(byte[] bArr, int i, int i2, int i3, int i4, int i5) throws Throwable {
        try {
            try {
                m84449a(i, i2, m84453z(i3), i4, i5);
                this.f59829h.m84421b(this.f59830i);
                return this.f59829h.m84404a(bArr, i4);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m84455a(int i, int i2, int i3, int i4, int i5, int i6, long j) throws Throwable {
        try {
            try {
                m84449a(i2, i3, m84453z(i4), i5, i6);
                this.f59829h.m84421b(this.f59830i);
                return this.f59829h.m84403a(i, i5, j);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m84456a(C14205b c14205b, int i, int i2, long j) throws Throwable {
        try {
            try {
                this.f59834m = System.currentTimeMillis();
                m84466a(c14205b.f59321l);
                m84461a(c14205b.f59316g, c14205b.f59317h);
                m84477b(c14205b.f59318i);
                m84473a(c14205b.f59312c);
                m84471a(c14205b.f59313d);
                byte[] bArr = c14205b.f59322m;
                if (bArr != null && c14205b.f59310a == -1) {
                    return m84457a(bArr, c14205b.f59314e, c14205b.f59315f, c14205b.f59319j, i, i2);
                }
                return m84455a(c14205b.f59310a, c14205b.f59314e, c14205b.f59315f, c14205b.f59319j, i, i2, j);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84467a(d dVar) {
        this.f59833l = dVar;
        TXCLog.m84152i("TXCVideoPreprocessor", "set Process SDK performance " + dVar);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84466a(C14171a c14171a) {
        this.f59828g = c14171a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84461a(int i, int i2) {
        this.f59825d = i;
        this.f59826e = i2;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84464a(Bitmap bitmap, float f2, float f3, float f4) {
        try {
            if (f2 >= 0.0f && f3 >= 0.0f && f4 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
                if (handlerThreadC14262c != null) {
                    handlerThreadC14262c.m84410a(bitmap, f2, f3, f4);
                }
                return;
            }
            TXCLog.m84149e("TXCVideoPreprocessor", "WaterMark param is Error!");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84469a(Object obj) {
        this.f59837p = obj;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Object m84458a() {
        return this.f59837p;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84468a(InterfaceC14265f interfaceC14265f) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c == null) {
            TXCLog.m84149e("TXCVideoPreprocessor", "setListener mDrawer is null!");
            return;
        }
        this.f59832k = interfaceC14265f;
        if (interfaceC14265f == null) {
            handlerThreadC14262c.m84412a((InterfaceC14264e) null);
        } else {
            handlerThreadC14262c.m84412a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84465a(InterfaceC14170b interfaceC14170b) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c == null) {
            TXCLog.m84149e("TXCVideoPreprocessor", "setListener mDrawer is null!");
        } else {
            handlerThreadC14262c.m84411a(interfaceC14170b);
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14264e
    /* JADX INFO: renamed from: a */
    public int mo84454a(int i, int i2, int i3) {
        if (this.f59832k == null) {
            return 0;
        }
        C14205b c14205b = new C14205b();
        c14205b.f59314e = i2;
        c14205b.f59315f = i3;
        c14205b.f59319j = 0;
        c cVar = this.f59831j;
        c14205b.f59318i = cVar != null ? cVar.f59858e : false;
        c14205b.f59310a = i;
        return this.f59832k.mo84504a(c14205b);
    }

    /* JADX INFO: renamed from: a */
    private boolean m84450a(c cVar, int i, int i2) {
        b bVar = this.f59830i;
        bVar.f59844d = cVar.f59855b;
        bVar.f59845e = cVar.f59856c;
        bVar.f59853m = cVar.f59863j;
        bVar.f59847g = i;
        bVar.f59846f = i2;
        bVar.f59848h = (cVar.f59857d + 360) % 360;
        bVar.f59842b = cVar.f59859f;
        bVar.f59843c = cVar.f59860g;
        bVar.f59841a = 0;
        bVar.f59850j = cVar.f59854a;
        bVar.f59849i = cVar.f59858e;
        bVar.f59851k = cVar.f59861h;
        bVar.f59852l = cVar.f59862i;
        if (this.f59829h == null) {
            HandlerThreadC14262c handlerThreadC14262c = new HandlerThreadC14262c(this.f59822a, cVar.f59854a);
            this.f59829h = handlerThreadC14262c;
            handlerThreadC14262c.m84408a(this.f59827f);
        }
        return this.f59829h.m84418a(this.f59830i);
    }

    /* JADX INFO: renamed from: a */
    public void m84460a(int i) {
        if (i != this.f59827f) {
            this.f59827f = i;
            HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
            if (handlerThreadC14262c != null) {
                handlerThreadC14262c.m84408a(i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84470a(String str) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84413a(str);
        }
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: a */
    public boolean m84474a(String str, boolean z) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c == null) {
            return true;
        }
        handlerThreadC14262c.m84414a(str, z);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84459a(float f2) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84406a(f2);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84463a(Bitmap bitmap) {
        HandlerThreadC14262c handlerThreadC14262c = this.f59829h;
        if (handlerThreadC14262c != null) {
            handlerThreadC14262c.m84409a(bitmap);
        }
    }
}
