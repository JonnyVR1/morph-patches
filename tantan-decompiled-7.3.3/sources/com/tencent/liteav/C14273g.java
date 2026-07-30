package com.tencent.liteav;

import android.graphics.Bitmap;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.gms.common.ConnectionResult;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.p091a.EnumC14168c;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.tencent.liteav.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14273g implements Cloneable {

    /* JADX INFO: renamed from: a */
    public int f60153a = 0;

    /* JADX INFO: renamed from: b */
    public int f60154b = 0;

    /* JADX INFO: renamed from: c */
    public int f60155c = 1200;

    /* JADX INFO: renamed from: d */
    public int f60156d = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* JADX INFO: renamed from: e */
    public int f60157e = 800;

    /* JADX INFO: renamed from: f */
    public int f60158f = 5;

    /* JADX INFO: renamed from: g */
    public boolean f60159g = true;

    /* JADX INFO: renamed from: h */
    public int f60160h = 20;

    /* JADX INFO: renamed from: i */
    public int f60161i = 1;

    /* JADX INFO: renamed from: j */
    public int f60162j = 2;

    /* JADX INFO: renamed from: k */
    public EnumC14168c f60163k = EnumC14168c.RESOLUTION_TYPE_540_960;

    /* JADX INFO: renamed from: l */
    public int f60164l = 1;

    /* JADX INFO: renamed from: m */
    public boolean f60165m = true;

    /* JADX INFO: renamed from: n */
    public int f60166n = 3;

    /* JADX INFO: renamed from: o */
    public int f60167o = 0;

    /* JADX INFO: renamed from: p */
    public boolean f60168p = false;

    /* JADX INFO: renamed from: q */
    public int f60169q = 3;

    /* JADX INFO: renamed from: r */
    public int f60170r = 3;

    /* JADX INFO: renamed from: s */
    public int f60171s = 48000;

    /* JADX INFO: renamed from: t */
    public int f60172t = 1;

    /* JADX INFO: renamed from: u */
    public boolean f60173u = true;

    /* JADX INFO: renamed from: v */
    public boolean f60174v = false;

    /* JADX INFO: renamed from: w */
    public boolean f60175w = false;

    /* JADX INFO: renamed from: x */
    public int f60176x = 0;

    /* JADX INFO: renamed from: y */
    public int f60177y = 10;

    /* JADX INFO: renamed from: z */
    public boolean f60178z = false;

    /* JADX INFO: renamed from: A */
    public Bitmap f60128A = null;

    /* JADX INFO: renamed from: B */
    public int f60129B = 300;

    /* JADX INFO: renamed from: C */
    public int f60130C = 10;

    /* JADX INFO: renamed from: D */
    public int f60131D = 1;

    /* JADX INFO: renamed from: E */
    public Bitmap f60132E = null;

    /* JADX INFO: renamed from: F */
    public int f60133F = 0;

    /* JADX INFO: renamed from: G */
    public int f60134G = 0;

    /* JADX INFO: renamed from: H */
    public float f60135H = 0.0f;

    /* JADX INFO: renamed from: I */
    public float f60136I = 0.0f;

    /* JADX INFO: renamed from: J */
    public float f60137J = -1.0f;

    /* JADX INFO: renamed from: K */
    public boolean f60138K = true;

    /* JADX INFO: renamed from: L */
    public boolean f60139L = false;

    /* JADX INFO: renamed from: M */
    public boolean f60140M = false;

    /* JADX INFO: renamed from: N */
    public boolean f60141N = true;

    /* JADX INFO: renamed from: O */
    public int f60142O = 1;

    /* JADX INFO: renamed from: P */
    public boolean f60143P = false;

    /* JADX INFO: renamed from: Q */
    public boolean f60144Q = false;

    /* JADX INFO: renamed from: R */
    public int f60145R = 0;

    /* JADX INFO: renamed from: S */
    public boolean f60146S = false;

    /* JADX INFO: renamed from: T */
    public boolean f60147T = true;

    /* JADX INFO: renamed from: U */
    public boolean f60148U = false;

    /* JADX INFO: renamed from: V */
    public boolean f60149V = false;

    /* JADX INFO: renamed from: W */
    public boolean f60150W = false;

    /* JADX INFO: renamed from: X */
    public int f60151X = 0;

    /* JADX INFO: renamed from: Y */
    public JSONArray f60152Y = null;

    /* JADX INFO: renamed from: com.tencent.liteav.g$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f60179a;

        static {
            int[] iArr = new int[EnumC14168c.values().length];
            f60179a = iArr;
            try {
                iArr[EnumC14168c.RESOLUTION_TYPE_360_640.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_540_960.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_720_1280.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_320_480.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_180_320.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_270_480.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_240_320.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_360_480.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_480_640.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_480_480.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_270_270.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_160_160.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_640_360.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_960_540.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_1280_720.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_640_480.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_480_360.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_320_240.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_480_270.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_320_180.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_120_120.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_1080_1920.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f60179a[EnumC14168c.RESOLUTION_TYPE_1920_1080.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f60180a = 0;

        /* JADX INFO: renamed from: b */
        public int f60181b = 0;
    }

    /* JADX INFO: renamed from: a */
    public static a m84779a(EnumC14168c enumC14168c) {
        a aVar = new a();
        switch (AnonymousClass1.f60179a[enumC14168c.ordinal()]) {
            case 1:
                aVar.f60180a = 368;
                aVar.f60181b = 640;
                break;
            case 2:
                aVar.f60180a = 544;
                aVar.f60181b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                break;
            case 3:
                aVar.f60180a = 720;
                aVar.f60181b = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                break;
            case 4:
                aVar.f60180a = 320;
                aVar.f60181b = 480;
                break;
            case 5:
                aVar.f60180a = 192;
                aVar.f60181b = 320;
                break;
            case 6:
                aVar.f60180a = 272;
                aVar.f60181b = 480;
                break;
            case 7:
                aVar.f60180a = 240;
                aVar.f60181b = 320;
                break;
            case 8:
                aVar.f60180a = 368;
                aVar.f60181b = 480;
                break;
            case 9:
                aVar.f60180a = 480;
                aVar.f60181b = 640;
                break;
            case 10:
                aVar.f60180a = 480;
                aVar.f60181b = 480;
                break;
            case 11:
                aVar.f60180a = 272;
                aVar.f60181b = 272;
                break;
            case 12:
                aVar.f60180a = 160;
                aVar.f60181b = 160;
                break;
            case 13:
                aVar.f60180a = 640;
                aVar.f60181b = 368;
                break;
            case 14:
                aVar.f60180a = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                aVar.f60181b = 544;
                break;
            case 15:
                aVar.f60180a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                aVar.f60181b = 720;
                break;
            case 16:
                aVar.f60180a = 640;
                aVar.f60181b = 480;
                break;
            case 17:
                aVar.f60180a = 480;
                aVar.f60181b = 368;
                break;
            case 18:
                aVar.f60180a = 320;
                aVar.f60181b = 240;
                break;
            case 19:
                aVar.f60180a = 480;
                aVar.f60181b = 272;
                break;
            case 20:
                aVar.f60180a = 320;
                aVar.f60181b = 192;
                break;
            case 21:
                aVar.f60180a = 128;
                aVar.f60181b = 128;
                break;
            case 22:
                aVar.f60180a = 1088;
                aVar.f60181b = WBConstants.SDK_NEW_PAY_VERSION;
                break;
            case 23:
                aVar.f60180a = WBConstants.SDK_NEW_PAY_VERSION;
                aVar.f60181b = 1088;
                break;
            default:
                aVar.f60180a = 368;
                aVar.f60181b = 640;
                break;
        }
        return aVar;
    }

    public Object clone() throws CloneNotSupportedException {
        return (C14273g) super.clone();
    }

    /* JADX INFO: renamed from: a */
    public boolean m84780a() {
        EnumC14168c enumC14168c = this.f60163k;
        if (enumC14168c != EnumC14168c.RESOLUTION_TYPE_INVALID) {
            a aVarM84779a = m84779a(enumC14168c);
            this.f60153a = aVarM84779a.f60180a;
            this.f60154b = aVarM84779a.f60181b;
        }
        return this.f60153a > this.f60154b;
    }
}
