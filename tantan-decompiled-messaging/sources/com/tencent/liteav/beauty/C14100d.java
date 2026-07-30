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
import com.tencent.liteav.basic.module.C14040a;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14008a;
import com.tencent.liteav.basic.p088c.C14017j;
import com.tencent.liteav.basic.structs.C14042b;
import com.tencent.liteav.basic.util.C14050d;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14100d extends C14040a implements InterfaceC14101e {

    /* JADX INFO: renamed from: a */
    protected Context f58974a;

    /* JADX INFO: renamed from: b */
    protected boolean f58975b;

    /* JADX INFO: renamed from: h */
    protected HandlerThreadC14099c f58981h;

    /* JADX INFO: renamed from: k */
    InterfaceC14102f f58984k;

    /* JADX INFO: renamed from: p */
    private Object f58989p;

    /* JADX INFO: renamed from: c */
    protected boolean f58976c = false;

    /* JADX INFO: renamed from: d */
    protected int f58977d = 0;

    /* JADX INFO: renamed from: e */
    protected int f58978e = 0;

    /* JADX INFO: renamed from: f */
    protected int f58979f = 1;

    /* JADX INFO: renamed from: g */
    protected C14008a f58980g = null;

    /* JADX INFO: renamed from: i */
    protected b f58982i = new b();

    /* JADX INFO: renamed from: j */
    protected c f58983j = null;

    /* JADX INFO: renamed from: l */
    private d f58985l = d.MODE_THRESHOLD;

    /* JADX INFO: renamed from: m */
    private long f58986m = 0;

    /* JADX INFO: renamed from: n */
    private long f58987n = 0;

    /* JADX INFO: renamed from: o */
    private long f58988o = 0;

    /* JADX INFO: renamed from: q */
    private a f58990q = new a(this);

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        int f58993a;

        /* JADX INFO: renamed from: b */
        int f58994b;

        /* JADX INFO: renamed from: c */
        int f58995c;

        /* JADX INFO: renamed from: d */
        int f58996d;

        /* JADX INFO: renamed from: e */
        int f58997e;

        /* JADX INFO: renamed from: f */
        int f58998f;

        /* JADX INFO: renamed from: g */
        int f58999g;

        /* JADX INFO: renamed from: h */
        int f59000h;

        /* JADX INFO: renamed from: i */
        boolean f59001i;

        /* JADX INFO: renamed from: j */
        boolean f59002j;

        /* JADX INFO: renamed from: k */
        public int f59003k = 5;

        /* JADX INFO: renamed from: l */
        public int f59004l = 0;

        /* JADX INFO: renamed from: m */
        C14008a f59005m = null;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f59006a;

        /* JADX INFO: renamed from: b */
        public int f59007b;

        /* JADX INFO: renamed from: c */
        public int f59008c;

        /* JADX INFO: renamed from: d */
        public int f59009d;

        /* JADX INFO: renamed from: e */
        public boolean f59010e;

        /* JADX INFO: renamed from: f */
        public int f59011f;

        /* JADX INFO: renamed from: g */
        public int f59012g;

        /* JADX INFO: renamed from: h */
        public int f59013h;

        /* JADX INFO: renamed from: i */
        public int f59014i;

        /* JADX INFO: renamed from: j */
        public C14008a f59015j;

        private c() {
            this.f59010e = false;
            this.f59013h = 5;
            this.f59014i = 0;
            this.f59015j = null;
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
        public g f59020a = g.TXE_FILL_MODE_SCALL_ASPECT_FILL;

        /* JADX INFO: renamed from: b */
        public boolean f59021b = false;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public Bitmap f59022a;

        /* JADX INFO: renamed from: b */
        public float f59023b;

        /* JADX INFO: renamed from: c */
        public float f59024c;

        /* JADX INFO: renamed from: d */
        public float f59025d;

        /* JADX INFO: renamed from: e */
        public int f59026e;

        /* JADX INFO: renamed from: f */
        public int f59027f;

        /* JADX INFO: renamed from: g */
        public int f59028g;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$g */
    public enum g {
        TXE_FILL_MODE_SCALL_TO_FILL,
        TXE_FILL_MODE_SCALL_ASPECT_FILL
    }

    public C14100d(Context context, boolean z) {
        this.f58975b = true;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        TXCLog.m82969i("TXCVideoPreprocessor", "TXCVideoPreprocessor version: VideoPreprocessor-v1.1");
        ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
        if (deviceConfigurationInfo != null) {
            TXCLog.m82969i("TXCVideoPreprocessor", "opengl es version " + deviceConfigurationInfo.reqGlEsVersion);
            TXCLog.m82969i("TXCVideoPreprocessor", "set GLContext " + z);
            if (deviceConfigurationInfo.reqGlEsVersion > 131072) {
                TXCLog.m82969i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_3");
                C14017j.m82830a(3);
            } else {
                TXCLog.m82969i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_2");
                C14017j.m82830a(2);
            }
        } else {
            TXCLog.m82966e("TXCVideoPreprocessor", "getDeviceConfigurationInfo opengl Info failed!");
        }
        this.f58974a = context;
        this.f58975b = z;
        this.f58981h = new HandlerThreadC14099c(this.f58974a, this.f58975b);
        C14057a.m83066a().m83068a(context);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0156  */
    /* JADX INFO: renamed from: a */
    private boolean m83266a(int i, int i2, int i3, int i4, int i5) {
        C14100d c14100d;
        c cVar;
        int i6;
        int i7;
        C14008a c14008a;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C14008a c14008a2;
        C14008a c14008a3;
        C14008a c14008a4;
        C14008a c14008a5;
        if (this.f58983j == null) {
            this.f58983j = new c();
            this.f58987n = 0L;
            this.f58988o = System.currentTimeMillis();
        }
        c cVar2 = this.f58983j;
        if (i == cVar2.f59007b && i2 == cVar2.f59008c && i3 == cVar2.f59009d && (((i6 = this.f58977d) <= 0 || i6 == cVar2.f59011f) && (((i7 = this.f58978e) <= 0 || i7 == cVar2.f59012g) && (((c14008a = this.f58980g) == null || (((i9 = c14008a.f58081c) <= 0 || ((c14008a5 = cVar2.f59015j) != null && i9 == c14008a5.f58081c)) && (((i10 = c14008a.f58082d) <= 0 || ((c14008a4 = cVar2.f59015j) != null && i10 == c14008a4.f58082d)) && (((i11 = c14008a.f58079a) < 0 || ((c14008a3 = cVar2.f59015j) != null && i11 == c14008a3.f58079a)) && ((i12 = c14008a.f58080b) < 0 || ((c14008a2 = cVar2.f59015j) != null && i12 == c14008a2.f58080b)))))) && this.f58976c == cVar2.f59010e && (i8 = cVar2.f59013h) == i4)))) {
            if (i4 == i8 && i5 == cVar2.f59014i) {
                return true;
            }
            cVar2.f59013h = i4;
            b bVar = this.f58982i;
            bVar.f59003k = i4;
            cVar2.f59014i = i5;
            bVar.f59004l = i5;
            this.f58981h.m83236b(i5);
            return true;
        }
        TXCLog.m82969i("TXCVideoPreprocessor", "Init sdk");
        TXCLog.m82969i("TXCVideoPreprocessor", "Input widht " + i + " height " + i2);
        c cVar3 = this.f58983j;
        cVar3.f59007b = i;
        cVar3.f59008c = i2;
        C14008a c14008a6 = this.f58980g;
        if (c14008a6 != null && c14008a6.f58079a >= 0 && c14008a6.f58080b >= 0 && c14008a6.f58081c > 0 && c14008a6.f58082d > 0) {
            TXCLog.m82969i("TXCVideoPreprocessor", "set Crop Rect; init ");
            C14008a c14008a7 = this.f58980g;
            int i13 = c14008a7.f58079a;
            int i14 = i - i13;
            int i15 = c14008a7.f58081c;
            i = i14 > i15 ? i15 : i - i13;
            int i16 = c14008a7.f58080b;
            int i17 = i2 - i16;
            int i18 = c14008a7.f58082d;
            i2 = i17 > i18 ? i18 : i2 - i16;
            c14008a7.f58081c = i;
            c14008a7.f58082d = i2;
        }
        int i19 = i;
        int i20 = i2;
        c cVar4 = this.f58983j;
        cVar4.f59015j = this.f58980g;
        cVar4.f59009d = i3;
        cVar4.f59006a = this.f58975b;
        cVar4.f59013h = i4;
        cVar4.f59014i = i5;
        int i21 = this.f58977d;
        cVar4.f59011f = i21;
        int i22 = this.f58978e;
        cVar4.f59012g = i22;
        if (i21 <= 0 || i22 <= 0) {
            if (90 == i3 || 270 == i3) {
                cVar4.f59011f = i20;
                cVar4.f59012g = i19;
            } else {
                cVar4.f59011f = i19;
                cVar4.f59012g = i20;
            }
        }
        d dVar = this.f58985l;
        if (dVar != d.MODE_SAME_AS_OUTPUT) {
            if (dVar != d.MODE_SAME_AS_INPUT) {
                c14100d = this;
                C14050d c14050dM83268b = c14100d.m83268b(i19, i20, i3, cVar4.f59011f, cVar4.f59012g);
                i19 = ((c14050dM83268b.f58502a + 7) / 8) * 8;
                i20 = ((c14050dM83268b.f58503b + 7) / 8) * 8;
            }
            cVar = c14100d.f58983j;
            cVar.f59010e = c14100d.f58976c;
            if (!c14100d.m83267a(cVar, i19, i20)) {
                return true;
            }
            TXCLog.m82966e("TXCVideoPreprocessor", "init failed!");
            return false;
        }
        if (90 == i3 || 270 == i3) {
            i19 = cVar4.f59012g;
            i20 = cVar4.f59011f;
        } else {
            i19 = cVar4.f59011f;
            i20 = cVar4.f59012g;
        }
        c14100d = this;
        cVar = c14100d.f58983j;
        cVar.f59010e = c14100d.f58976c;
        if (!c14100d.m83267a(cVar, i19, i20)) {
            return true;
        }
        TXCLog.m82966e("TXCVideoPreprocessor", "init failed!");
        return false;
    }

    /* JADX INFO: renamed from: b */
    private C14050d m83268b(int i, int i2, int i3, int i4, int i5) {
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
                return new C14050d((int) (i4 * f2), (int) (f2 * i5));
            }
        }
        return new C14050d(i, i2);
    }

    /* JADX INFO: renamed from: c */
    private void m83269c() {
        if (this.f58986m != 0) {
            setStatusValue(3002, Long.valueOf(System.currentTimeMillis() - this.f58986m));
        }
        this.f58987n++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f58988o;
        if (jCurrentTimeMillis > 2000 + j) {
            setStatusValue(3003, Double.valueOf((this.f58987n * 1000.0d) / (jCurrentTimeMillis - j)));
            this.f58987n = 0L;
            this.f58988o = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: z */
    private int m83270z(int i) {
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
    public synchronized void m83297d(int i) {
        try {
            if (i > 9) {
                TXCLog.m82966e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.m82966e("TXCVideoPreprocessor", "Brightness < 0; set 0");
                i = 0;
            }
            HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
            if (handlerThreadC14099c != null) {
                handlerThreadC14099c.m83241e(i);
            }
            this.f58990q.m83320a("whiteLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m83298e(int i) {
        try {
            if (i > 9) {
                TXCLog.m82966e("TXCVideoPreprocessor", "Ruddy value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.m82966e("TXCVideoPreprocessor", "Ruddy < 0; set 0");
                i = 0;
            }
            HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
            if (handlerThreadC14099c != null) {
                handlerThreadC14099c.m83243g(i);
            }
            this.f58990q.m83320a("ruddyLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m83299f(int i) {
        if (i > 9) {
            TXCLog.m82966e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
            i = 9;
        } else if (i < 0) {
            TXCLog.m82966e("TXCVideoPreprocessor", "Brightness < 0; set 0");
            i = 0;
        }
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83242f(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m83300g(int i) {
        try {
            HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
            if (handlerThreadC14099c != null) {
                handlerThreadC14099c.m83244h(i);
            }
            this.f58990q.m83320a("eyeBigScale", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m83301h(int i) {
        try {
            HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
            if (handlerThreadC14099c != null) {
                handlerThreadC14099c.m83245i(i);
            }
            this.f58990q.m83320a("faceSlimLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m83302i(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83246j(i);
        }
        this.f58990q.m83320a("faceVLevel", i);
    }

    /* JADX INFO: renamed from: j */
    public void m83303j(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83247k(i);
        }
        this.f58990q.m83320a("faceShortLevel", i);
    }

    /* JADX INFO: renamed from: k */
    public void m83304k(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83248l(i);
        }
        this.f58990q.m83320a("chinLevel", i);
    }

    /* JADX INFO: renamed from: l */
    public void m83305l(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83249m(i);
        }
        this.f58990q.m83320a("noseSlimLevel", i);
    }

    /* JADX INFO: renamed from: m */
    public void m83306m(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83250n(i);
        }
        this.f58990q.m83320a("eyeLightenLevel", i);
    }

    /* JADX INFO: renamed from: n */
    public void m83307n(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83251o(i);
        }
        this.f58990q.m83320a("toothWhitenLevel", i);
    }

    /* JADX INFO: renamed from: o */
    public void m83308o(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83252p(i);
        }
        this.f58990q.m83320a("wrinkleRemoveLevel", i);
    }

    /* JADX INFO: renamed from: p */
    public void m83309p(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83253q(i);
        }
        this.f58990q.m83320a("pounchRemoveLevel", i);
    }

    /* JADX INFO: renamed from: q */
    public void m83310q(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83254r(i);
        }
        this.f58990q.m83320a("smileLinesRemoveLevel", i);
    }

    /* JADX INFO: renamed from: r */
    public void m83311r(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83255s(i);
        }
        this.f58990q.m83320a("foreheadLevel", i);
    }

    /* JADX INFO: renamed from: s */
    public void m83312s(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83256t(i);
        }
        this.f58990q.m83320a("eyeDistanceLevel", i);
    }

    @Override // com.tencent.liteav.basic.module.C14040a
    public void setID(String str) {
        super.setID(str);
        setStatusValue(3001, this.f58990q.m83319a());
    }

    /* JADX INFO: renamed from: t */
    public void m83313t(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83257u(i);
        }
        this.f58990q.m83320a("eyeAngleLevel", i);
    }

    /* JADX INFO: renamed from: u */
    public void m83314u(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83258v(i);
        }
        this.f58990q.m83320a("mouthShapeLevel", i);
    }

    /* JADX INFO: renamed from: v */
    public void m83315v(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83259w(i);
        }
        this.f58990q.m83320a("noseWingLevel", i);
    }

    /* JADX INFO: renamed from: w */
    public void m83316w(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83260x(i);
        }
        this.f58990q.m83320a("nosePositionLevel", i);
    }

    /* JADX INFO: renamed from: x */
    public void m83317x(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83261y(i);
        }
        this.f58990q.m83320a("lipsThicknessLevel", i);
    }

    /* JADX INFO: renamed from: y */
    public void m83318y(int i) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83262z(i);
        }
        this.f58990q.m83320a("faceBeautyLevel", i);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m83294b(boolean z) {
        this.f58976c = z;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m83292b() {
        try {
            HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
            if (handlerThreadC14099c != null) {
                handlerThreadC14099c.m83222a();
            }
            this.f58983j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m83295c(int i) {
        try {
            if (i > 9) {
                TXCLog.m82966e("TXCVideoPreprocessor", "Beauty value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.m82966e("TXCVideoPreprocessor", "Beauty < 0; set 0");
                i = 0;
            }
            HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
            if (handlerThreadC14099c != null) {
                handlerThreadC14099c.m83239c(i);
            }
            this.f58990q.m83320a("beautyLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m83293b(int i) {
        try {
            HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
            if (handlerThreadC14099c != null) {
                handlerThreadC14099c.m83240d(i);
            }
            this.f58990q.m83320a("beautyStyle", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m83296c(boolean z) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83237b(z);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        WeakReference<C14100d> f58991a;

        /* JADX INFO: renamed from: b */
        private HashMap<String, String> f58992b = new HashMap<>();

        public a(C14100d c14100d) {
            this.f58991a = new WeakReference<>(c14100d);
        }

        /* JADX INFO: renamed from: a */
        public String m83319a() {
            String str = "";
            for (String str2 : this.f58992b.keySet()) {
                str = str + str2 + ":" + this.f58992b.get(str2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            }
            return "{" + str + "}";
        }

        /* JADX INFO: renamed from: a */
        public void m83320a(String str, int i) {
            String id;
            this.f58992b.put(str, String.valueOf(i));
            C14100d c14100d = this.f58991a.get();
            if (c14100d == null || (id = c14100d.getID()) == null || id.length() <= 0) {
                return;
            }
            c14100d.setStatusValue(3001, m83319a());
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14101e
    /* JADX INFO: renamed from: a */
    public void mo83279a(int i, int i2, int i3, long j) {
        m83269c();
        if (this.f58984k != null) {
            C14042b c14042b = new C14042b();
            c14042b.f58466e = i2;
            c14042b.f58467f = i3;
            c14042b.f58471j = 0;
            c cVar = this.f58983j;
            c14042b.f58470i = cVar != null ? cVar.f59010e : false;
            c14042b.f58462a = i;
            this.f58984k.mo83322a(c14042b, j);
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14101e
    /* JADX INFO: renamed from: a */
    public void mo83289a(byte[] bArr, int i, int i2, int i3, long j) {
        InterfaceC14102f interfaceC14102f = this.f58984k;
        if (interfaceC14102f != null) {
            interfaceC14102f.mo83323a(bArr, i, i2, i3, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83290a(float[] fArr) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83234a(fArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83288a(boolean z) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83232a(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m83274a(byte[] bArr, int i, int i2, int i3, int i4, int i5) throws Throwable {
        try {
            try {
                m83266a(i, i2, m83270z(i3), i4, i5);
                this.f58981h.m83238b(this.f58982i);
                return this.f58981h.m83221a(bArr, i4);
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
    public synchronized int m83272a(int i, int i2, int i3, int i4, int i5, int i6, long j) throws Throwable {
        try {
            try {
                m83266a(i2, i3, m83270z(i4), i5, i6);
                this.f58981h.m83238b(this.f58982i);
                return this.f58981h.m83220a(i, i5, j);
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
    public synchronized int m83273a(C14042b c14042b, int i, int i2, long j) throws Throwable {
        try {
            try {
                this.f58986m = System.currentTimeMillis();
                m83283a(c14042b.f58473l);
                m83278a(c14042b.f58468g, c14042b.f58469h);
                m83294b(c14042b.f58470i);
                m83290a(c14042b.f58464c);
                m83288a(c14042b.f58465d);
                byte[] bArr = c14042b.f58474m;
                if (bArr != null && c14042b.f58462a == -1) {
                    return m83274a(bArr, c14042b.f58466e, c14042b.f58467f, c14042b.f58471j, i, i2);
                }
                return m83272a(c14042b.f58462a, c14042b.f58466e, c14042b.f58467f, c14042b.f58471j, i, i2, j);
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
    public synchronized void m83284a(d dVar) {
        this.f58985l = dVar;
        TXCLog.m82969i("TXCVideoPreprocessor", "set Process SDK performance " + dVar);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83283a(C14008a c14008a) {
        this.f58980g = c14008a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83278a(int i, int i2) {
        this.f58977d = i;
        this.f58978e = i2;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83281a(Bitmap bitmap, float f2, float f3, float f4) {
        try {
            if (f2 >= 0.0f && f3 >= 0.0f && f4 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
                if (handlerThreadC14099c != null) {
                    handlerThreadC14099c.m83227a(bitmap, f2, f3, f4);
                }
                return;
            }
            TXCLog.m82966e("TXCVideoPreprocessor", "WaterMark param is Error!");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83286a(Object obj) {
        this.f58989p = obj;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Object m83275a() {
        return this.f58989p;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83285a(InterfaceC14102f interfaceC14102f) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c == null) {
            TXCLog.m82966e("TXCVideoPreprocessor", "setListener mDrawer is null!");
            return;
        }
        this.f58984k = interfaceC14102f;
        if (interfaceC14102f == null) {
            handlerThreadC14099c.m83229a((InterfaceC14101e) null);
        } else {
            handlerThreadC14099c.m83229a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83282a(InterfaceC14007b interfaceC14007b) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c == null) {
            TXCLog.m82966e("TXCVideoPreprocessor", "setListener mDrawer is null!");
        } else {
            handlerThreadC14099c.m83228a(interfaceC14007b);
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14101e
    /* JADX INFO: renamed from: a */
    public int mo83271a(int i, int i2, int i3) {
        if (this.f58984k == null) {
            return 0;
        }
        C14042b c14042b = new C14042b();
        c14042b.f58466e = i2;
        c14042b.f58467f = i3;
        c14042b.f58471j = 0;
        c cVar = this.f58983j;
        c14042b.f58470i = cVar != null ? cVar.f59010e : false;
        c14042b.f58462a = i;
        return this.f58984k.mo83321a(c14042b);
    }

    /* JADX INFO: renamed from: a */
    private boolean m83267a(c cVar, int i, int i2) {
        b bVar = this.f58982i;
        bVar.f58996d = cVar.f59007b;
        bVar.f58997e = cVar.f59008c;
        bVar.f59005m = cVar.f59015j;
        bVar.f58999g = i;
        bVar.f58998f = i2;
        bVar.f59000h = (cVar.f59009d + 360) % 360;
        bVar.f58994b = cVar.f59011f;
        bVar.f58995c = cVar.f59012g;
        bVar.f58993a = 0;
        bVar.f59002j = cVar.f59006a;
        bVar.f59001i = cVar.f59010e;
        bVar.f59003k = cVar.f59013h;
        bVar.f59004l = cVar.f59014i;
        if (this.f58981h == null) {
            HandlerThreadC14099c handlerThreadC14099c = new HandlerThreadC14099c(this.f58974a, cVar.f59006a);
            this.f58981h = handlerThreadC14099c;
            handlerThreadC14099c.m83225a(this.f58979f);
        }
        return this.f58981h.m83235a(this.f58982i);
    }

    /* JADX INFO: renamed from: a */
    public void m83277a(int i) {
        if (i != this.f58979f) {
            this.f58979f = i;
            HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
            if (handlerThreadC14099c != null) {
                handlerThreadC14099c.m83225a(i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83287a(String str) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83230a(str);
        }
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: a */
    public boolean m83291a(String str, boolean z) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c == null) {
            return true;
        }
        handlerThreadC14099c.m83231a(str, z);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83276a(float f2) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83223a(f2);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83280a(Bitmap bitmap) {
        HandlerThreadC14099c handlerThreadC14099c = this.f58981h;
        if (handlerThreadC14099c != null) {
            handlerThreadC14099c.m83226a(bitmap);
        }
    }
}
