package com.p008ss.android.ttvecamera;

import android.hardware.camera2.TotalCaptureResult;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import p009l.sjh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TECameraFrame {

    /* JADX INFO: renamed from: a */
    private int f8745a;

    /* JADX INFO: renamed from: b */
    private int f8746b;

    /* JADX INFO: renamed from: c */
    public long f8747c;

    /* JADX INFO: renamed from: d */
    private C0645d f8748d;

    /* JADX INFO: renamed from: e */
    private C0644c f8749e = new C0644c(0, 0, 0);

    public enum ETEPixelFormat {
        PIXEL_FORMAT_YUV420,
        PIXEL_FORMAT_YUV420P,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_YUYV422,
        PIXEL_FORMAT_YUV422P,
        PIXEL_FORMAT_UYVY422,
        PIXEL_FORMAT_GRAY8,
        PIXEL_FORMAT_RGB8,
        PIXEL_FORMAT_BGR8,
        PIXEL_FORMAT_ARGB8,
        PIXEL_FORMAT_RGBA8,
        PIXEL_FORMAT_BGRA8,
        PIXEL_FORMAT_OpenGL_GRAY,
        PIXEL_FORMAT_OpenGL_RGB8,
        PIXEL_FORMAT_OpenGL_RGBA8,
        PIXEL_FORMAT_OpenGL_OES,
        PIXEL_FORMAT_JPEG,
        PIXEL_FORMAT_BUFFER,
        PIXEL_FORMAT_Count,
        PIXEL_FORMAT_Recorder,
        PIXEL_FORMAT_RAW_SENSOR
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$a */
    public static /* synthetic */ class C0642a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f8750a;

        static {
            int[] iArr = new int[ETEPixelFormat.values().length];
            f8750a = iArr;
            try {
                iArr[ETEPixelFormat.PIXEL_FORMAT_YUV420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_YUV420P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_YUV422P.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_YUYV422.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_UYVY422.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_RGB8.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_RGBA8.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_JPEG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_GRAY8.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_BGR8.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_NV12.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_GRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGB8.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGBA8.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8750a[ETEPixelFormat.PIXEL_FORMAT_Count.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$b */
    public static class C0643b extends C0644c {

        /* JADX INFO: renamed from: g */
        private int f8751g;

        /* JADX INFO: renamed from: h */
        private byte[] f8752h;

        public C0643b(int i, int i2, long j, byte[] bArr, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f8755c = 2;
            this.f8756d = i3;
            this.f8754b = eTEPixelFormat;
            this.f8752h = bArr;
            this.f8751g = i * i2 * 4;
        }

        /* JADX INFO: renamed from: a */
        public byte[] m10842a() {
            return this.f8752h;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$d */
    public static class C0645d {

        /* JADX INFO: renamed from: a */
        public int f8759a = -1;

        /* JADX INFO: renamed from: b */
        public int f8760b = -1;

        /* JADX INFO: renamed from: c */
        public long f8761c = -1;

        /* JADX INFO: renamed from: d */
        public TotalCaptureResult f8762d = null;

        /* JADX INFO: renamed from: e */
        public int f8763e = 0;

        /* JADX INFO: renamed from: f */
        public int f8764f = 0;
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$e */
    public static class C0646e extends C0644c {

        /* JADX INFO: renamed from: g */
        private int f8765g;

        /* JADX INFO: renamed from: h */
        float[] f8766h;

        public C0646e(int i, int i2, long j, int i3, int i4, float[] fArr, ETEPixelFormat eTEPixelFormat, int i5) {
            super(i, i2, j, i5);
            this.f8755c = 1;
            this.f8765g = i3;
            this.f8756d = i4;
            this.f8766h = fArr;
            this.f8754b = eTEPixelFormat;
        }

        /* JADX INFO: renamed from: a */
        public int m10843a() {
            return this.f8765g;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$f */
    public static class C0647f extends C0644c {

        /* JADX INFO: renamed from: g */
        sjh0 f8767g;

        public C0647f(int i, int i2, long j, sjh0 sjh0Var, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f8755c = 3;
            this.f8756d = i3;
            this.f8754b = eTEPixelFormat;
            this.f8767g = sjh0Var;
        }
    }

    public TECameraFrame(int i, int i2, long j) {
        this.f8745a = i;
        this.f8746b = i2;
        this.f8747c = j;
    }

    /* JADX INFO: renamed from: g */
    public static int m10834g(ETEPixelFormat eTEPixelFormat) {
        switch (C0642a.f8750a[eTEPixelFormat.ordinal()]) {
            case 1:
                return 35;
            case 2:
                return 842094169;
            case 3:
                return 17;
            case 4:
                return 16;
            case 5:
            case 6:
                return 39;
            case 7:
                return 41;
            case 8:
                return 42;
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                return 256;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m10835a() {
        C0644c c0644c = this.f8749e;
        if (c0644c instanceof C0643b) {
            return ((C0643b) c0644c).m10842a();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public TEFrameSizei m10836b() {
        return this.f8749e.f8753a;
    }

    /* JADX INFO: renamed from: c */
    public int m10837c() {
        C0644c c0644c = this.f8749e;
        if (c0644c instanceof C0646e) {
            return ((C0646e) c0644c).m10843a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public void m10838d(byte[] bArr, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.f8749e = new C0643b(this.f8745a, this.f8746b, this.f8747c, bArr, i, eTEPixelFormat, i2);
    }

    /* JADX INFO: renamed from: e */
    public void m10839e(int i, int i2, float[] fArr, ETEPixelFormat eTEPixelFormat, int i3) {
        this.f8749e = new C0646e(this.f8745a, this.f8746b, this.f8747c, i, i2, fArr, eTEPixelFormat, i3);
    }

    /* JADX INFO: renamed from: f */
    public void m10840f(sjh0 sjh0Var, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.f8749e = new C0647f(this.f8745a, this.f8746b, this.f8747c, sjh0Var, i, eTEPixelFormat, i2);
    }

    /* JADX INFO: renamed from: h */
    public void m10841h(C0645d c0645d) {
        this.f8748d = c0645d;
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$c */
    public static class C0644c {

        /* JADX INFO: renamed from: a */
        public TEFrameSizei f8753a;

        /* JADX INFO: renamed from: b */
        public ETEPixelFormat f8754b;

        /* JADX INFO: renamed from: c */
        public int f8755c;

        /* JADX INFO: renamed from: d */
        public int f8756d;

        /* JADX INFO: renamed from: e */
        public long f8757e;

        /* JADX INFO: renamed from: f */
        public int f8758f;

        public C0644c(int i, int i2, long j, int i3) {
            this.f8755c = 0;
            this.f8753a = new TEFrameSizei(i, i2);
            this.f8757e = j;
            this.f8758f = i3;
        }

        public C0644c(int i, int i2, long j) {
            this(i, i2, j, 0);
        }
    }
}
