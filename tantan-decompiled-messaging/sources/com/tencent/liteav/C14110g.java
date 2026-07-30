package com.tencent.liteav;

import android.graphics.Bitmap;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.gms.common.ConnectionResult;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.p086a.EnumC14005c;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.tencent.liteav.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14110g implements Cloneable {

    /* JADX INFO: renamed from: a */
    public int f59305a = 0;

    /* JADX INFO: renamed from: b */
    public int f59306b = 0;

    /* JADX INFO: renamed from: c */
    public int f59307c = 1200;

    /* JADX INFO: renamed from: d */
    public int f59308d = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* JADX INFO: renamed from: e */
    public int f59309e = 800;

    /* JADX INFO: renamed from: f */
    public int f59310f = 5;

    /* JADX INFO: renamed from: g */
    public boolean f59311g = true;

    /* JADX INFO: renamed from: h */
    public int f59312h = 20;

    /* JADX INFO: renamed from: i */
    public int f59313i = 1;

    /* JADX INFO: renamed from: j */
    public int f59314j = 2;

    /* JADX INFO: renamed from: k */
    public EnumC14005c f59315k = EnumC14005c.RESOLUTION_TYPE_540_960;

    /* JADX INFO: renamed from: l */
    public int f59316l = 1;

    /* JADX INFO: renamed from: m */
    public boolean f59317m = true;

    /* JADX INFO: renamed from: n */
    public int f59318n = 3;

    /* JADX INFO: renamed from: o */
    public int f59319o = 0;

    /* JADX INFO: renamed from: p */
    public boolean f59320p = false;

    /* JADX INFO: renamed from: q */
    public int f59321q = 3;

    /* JADX INFO: renamed from: r */
    public int f59322r = 3;

    /* JADX INFO: renamed from: s */
    public int f59323s = 48000;

    /* JADX INFO: renamed from: t */
    public int f59324t = 1;

    /* JADX INFO: renamed from: u */
    public boolean f59325u = true;

    /* JADX INFO: renamed from: v */
    public boolean f59326v = false;

    /* JADX INFO: renamed from: w */
    public boolean f59327w = false;

    /* JADX INFO: renamed from: x */
    public int f59328x = 0;

    /* JADX INFO: renamed from: y */
    public int f59329y = 10;

    /* JADX INFO: renamed from: z */
    public boolean f59330z = false;

    /* JADX INFO: renamed from: A */
    public Bitmap f59280A = null;

    /* JADX INFO: renamed from: B */
    public int f59281B = 300;

    /* JADX INFO: renamed from: C */
    public int f59282C = 10;

    /* JADX INFO: renamed from: D */
    public int f59283D = 1;

    /* JADX INFO: renamed from: E */
    public Bitmap f59284E = null;

    /* JADX INFO: renamed from: F */
    public int f59285F = 0;

    /* JADX INFO: renamed from: G */
    public int f59286G = 0;

    /* JADX INFO: renamed from: H */
    public float f59287H = 0.0f;

    /* JADX INFO: renamed from: I */
    public float f59288I = 0.0f;

    /* JADX INFO: renamed from: J */
    public float f59289J = -1.0f;

    /* JADX INFO: renamed from: K */
    public boolean f59290K = true;

    /* JADX INFO: renamed from: L */
    public boolean f59291L = false;

    /* JADX INFO: renamed from: M */
    public boolean f59292M = false;

    /* JADX INFO: renamed from: N */
    public boolean f59293N = true;

    /* JADX INFO: renamed from: O */
    public int f59294O = 1;

    /* JADX INFO: renamed from: P */
    public boolean f59295P = false;

    /* JADX INFO: renamed from: Q */
    public boolean f59296Q = false;

    /* JADX INFO: renamed from: R */
    public int f59297R = 0;

    /* JADX INFO: renamed from: S */
    public boolean f59298S = false;

    /* JADX INFO: renamed from: T */
    public boolean f59299T = true;

    /* JADX INFO: renamed from: U */
    public boolean f59300U = false;

    /* JADX INFO: renamed from: V */
    public boolean f59301V = false;

    /* JADX INFO: renamed from: W */
    public boolean f59302W = false;

    /* JADX INFO: renamed from: X */
    public int f59303X = 0;

    /* JADX INFO: renamed from: Y */
    public JSONArray f59304Y = null;

    /* JADX INFO: renamed from: com.tencent.liteav.g$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f59331a;

        static {
            int[] iArr = new int[EnumC14005c.values().length];
            f59331a = iArr;
            try {
                iArr[EnumC14005c.RESOLUTION_TYPE_360_640.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_540_960.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_720_1280.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_320_480.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_180_320.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_270_480.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_240_320.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_360_480.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_480_640.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_480_480.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_270_270.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_160_160.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_640_360.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_960_540.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_1280_720.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_640_480.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_480_360.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_320_240.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_480_270.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_320_180.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_120_120.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_1080_1920.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f59331a[EnumC14005c.RESOLUTION_TYPE_1920_1080.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f59332a = 0;

        /* JADX INFO: renamed from: b */
        public int f59333b = 0;
    }

    /* JADX INFO: renamed from: a */
    public static a m83596a(EnumC14005c enumC14005c) {
        a aVar = new a();
        switch (AnonymousClass1.f59331a[enumC14005c.ordinal()]) {
            case 1:
                aVar.f59332a = 368;
                aVar.f59333b = 640;
                break;
            case 2:
                aVar.f59332a = 544;
                aVar.f59333b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                break;
            case 3:
                aVar.f59332a = 720;
                aVar.f59333b = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                break;
            case 4:
                aVar.f59332a = 320;
                aVar.f59333b = 480;
                break;
            case 5:
                aVar.f59332a = 192;
                aVar.f59333b = 320;
                break;
            case 6:
                aVar.f59332a = 272;
                aVar.f59333b = 480;
                break;
            case 7:
                aVar.f59332a = 240;
                aVar.f59333b = 320;
                break;
            case 8:
                aVar.f59332a = 368;
                aVar.f59333b = 480;
                break;
            case 9:
                aVar.f59332a = 480;
                aVar.f59333b = 640;
                break;
            case 10:
                aVar.f59332a = 480;
                aVar.f59333b = 480;
                break;
            case 11:
                aVar.f59332a = 272;
                aVar.f59333b = 272;
                break;
            case 12:
                aVar.f59332a = 160;
                aVar.f59333b = 160;
                break;
            case 13:
                aVar.f59332a = 640;
                aVar.f59333b = 368;
                break;
            case 14:
                aVar.f59332a = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                aVar.f59333b = 544;
                break;
            case 15:
                aVar.f59332a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                aVar.f59333b = 720;
                break;
            case 16:
                aVar.f59332a = 640;
                aVar.f59333b = 480;
                break;
            case 17:
                aVar.f59332a = 480;
                aVar.f59333b = 368;
                break;
            case 18:
                aVar.f59332a = 320;
                aVar.f59333b = 240;
                break;
            case 19:
                aVar.f59332a = 480;
                aVar.f59333b = 272;
                break;
            case 20:
                aVar.f59332a = 320;
                aVar.f59333b = 192;
                break;
            case 21:
                aVar.f59332a = 128;
                aVar.f59333b = 128;
                break;
            case 22:
                aVar.f59332a = 1088;
                aVar.f59333b = WBConstants.SDK_NEW_PAY_VERSION;
                break;
            case 23:
                aVar.f59332a = WBConstants.SDK_NEW_PAY_VERSION;
                aVar.f59333b = 1088;
                break;
            default:
                aVar.f59332a = 368;
                aVar.f59333b = 640;
                break;
        }
        return aVar;
    }

    public Object clone() throws CloneNotSupportedException {
        return (C14110g) super.clone();
    }

    /* JADX INFO: renamed from: a */
    public boolean m83597a() {
        EnumC14005c enumC14005c = this.f59315k;
        if (enumC14005c != EnumC14005c.RESOLUTION_TYPE_INVALID) {
            a aVarM83596a = m83596a(enumC14005c);
            this.f59305a = aVarM83596a.f59332a;
            this.f59306b = aVarM83596a.f59333b;
        }
        return this.f59305a > this.f59306b;
    }
}
