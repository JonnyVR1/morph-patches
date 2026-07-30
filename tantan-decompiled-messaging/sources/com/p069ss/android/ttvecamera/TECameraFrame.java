package com.p069ss.android.ttvecamera;

import android.hardware.camera2.TotalCaptureResult;
import p149l.sjh0;

/* JADX INFO: loaded from: classes11.dex */
public class TECameraFrame {

    /* JADX INFO: renamed from: a */
    private int f55139a;

    /* JADX INFO: renamed from: b */
    private int f55140b;

    /* JADX INFO: renamed from: c */
    public long f55141c;

    /* JADX INFO: renamed from: d */
    private C13243d f55142d;

    /* JADX INFO: renamed from: e */
    private C13242c f55143e = new C13242c(0, 0, 0);

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
    public static /* synthetic */ class C13240a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f55144a;

        static {
            int[] iArr = new int[ETEPixelFormat.values().length];
            f55144a = iArr;
            try {
                iArr[ETEPixelFormat.PIXEL_FORMAT_YUV420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_YUV420P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_YUV422P.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_YUYV422.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_UYVY422.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_RGB8.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_RGBA8.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_JPEG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_GRAY8.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_BGR8.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_NV12.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_GRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGB8.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGBA8.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f55144a[ETEPixelFormat.PIXEL_FORMAT_Count.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$b */
    public static class C13241b extends C13242c {

        /* JADX INFO: renamed from: g */
        private int f55145g;

        /* JADX INFO: renamed from: h */
        private byte[] f55146h;

        public C13241b(int i, int i2, long j, byte[] bArr, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f55149c = 2;
            this.f55150d = i3;
            this.f55148b = eTEPixelFormat;
            this.f55146h = bArr;
            this.f55145g = i * i2 * 4;
        }

        /* JADX INFO: renamed from: a */
        public byte[] m80491a() {
            return this.f55146h;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$d */
    public static class C13243d {

        /* JADX INFO: renamed from: a */
        public int f55153a = -1;

        /* JADX INFO: renamed from: b */
        public int f55154b = -1;

        /* JADX INFO: renamed from: c */
        public long f55155c = -1;

        /* JADX INFO: renamed from: d */
        public TotalCaptureResult f55156d = null;

        /* JADX INFO: renamed from: e */
        public int f55157e = 0;

        /* JADX INFO: renamed from: f */
        public int f55158f = 0;
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$e */
    public static class C13244e extends C13242c {

        /* JADX INFO: renamed from: g */
        private int f55159g;

        /* JADX INFO: renamed from: h */
        float[] f55160h;

        public C13244e(int i, int i2, long j, int i3, int i4, float[] fArr, ETEPixelFormat eTEPixelFormat, int i5) {
            super(i, i2, j, i5);
            this.f55149c = 1;
            this.f55159g = i3;
            this.f55150d = i4;
            this.f55160h = fArr;
            this.f55148b = eTEPixelFormat;
        }

        /* JADX INFO: renamed from: a */
        public int m80492a() {
            return this.f55159g;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$f */
    public static class C13245f extends C13242c {

        /* JADX INFO: renamed from: g */
        sjh0 f55161g;

        public C13245f(int i, int i2, long j, sjh0 sjh0Var, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f55149c = 3;
            this.f55150d = i3;
            this.f55148b = eTEPixelFormat;
            this.f55161g = sjh0Var;
        }
    }

    public TECameraFrame(int i, int i2, long j) {
        this.f55139a = i;
        this.f55140b = i2;
        this.f55141c = j;
    }

    /* JADX INFO: renamed from: g */
    public static int m80483g(ETEPixelFormat eTEPixelFormat) {
        switch (C13240a.f55144a[eTEPixelFormat.ordinal()]) {
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
            case 9:
                return 256;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m80484a() {
        C13242c c13242c = this.f55143e;
        if (c13242c instanceof C13241b) {
            return ((C13241b) c13242c).m80491a();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public TEFrameSizei m80485b() {
        return this.f55143e.f55147a;
    }

    /* JADX INFO: renamed from: c */
    public int m80486c() {
        C13242c c13242c = this.f55143e;
        if (c13242c instanceof C13244e) {
            return ((C13244e) c13242c).m80492a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public void m80487d(byte[] bArr, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.f55143e = new C13241b(this.f55139a, this.f55140b, this.f55141c, bArr, i, eTEPixelFormat, i2);
    }

    /* JADX INFO: renamed from: e */
    public void m80488e(int i, int i2, float[] fArr, ETEPixelFormat eTEPixelFormat, int i3) {
        this.f55143e = new C13244e(this.f55139a, this.f55140b, this.f55141c, i, i2, fArr, eTEPixelFormat, i3);
    }

    /* JADX INFO: renamed from: f */
    public void m80489f(sjh0 sjh0Var, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.f55143e = new C13245f(this.f55139a, this.f55140b, this.f55141c, sjh0Var, i, eTEPixelFormat, i2);
    }

    /* JADX INFO: renamed from: h */
    public void m80490h(C13243d c13243d) {
        this.f55142d = c13243d;
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$c */
    public static class C13242c {

        /* JADX INFO: renamed from: a */
        public TEFrameSizei f55147a;

        /* JADX INFO: renamed from: b */
        public ETEPixelFormat f55148b;

        /* JADX INFO: renamed from: c */
        public int f55149c;

        /* JADX INFO: renamed from: d */
        public int f55150d;

        /* JADX INFO: renamed from: e */
        public long f55151e;

        /* JADX INFO: renamed from: f */
        public int f55152f;

        public C13242c(int i, int i2, long j, int i3) {
            this.f55149c = 0;
            this.f55147a = new TEFrameSizei(i, i2);
            this.f55151e = j;
            this.f55152f = i3;
        }

        public C13242c(int i, int i2, long j) {
            this(i, i2, j, 0);
        }
    }
}
