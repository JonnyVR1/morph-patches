package com.p074ss.android.ttvecamera;

import android.hardware.camera2.TotalCaptureResult;
import p153l.zrh0;

/* JADX INFO: loaded from: classes11.dex */
public class TECameraFrame {

    /* JADX INFO: renamed from: a */
    private int f55987a;

    /* JADX INFO: renamed from: b */
    private int f55988b;

    /* JADX INFO: renamed from: c */
    public long f55989c;

    /* JADX INFO: renamed from: d */
    private C13406d f55990d;

    /* JADX INFO: renamed from: e */
    private C13405c f55991e = new C13405c(0, 0, 0);

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
    public static /* synthetic */ class C13403a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f55992a;

        static {
            int[] iArr = new int[ETEPixelFormat.values().length];
            f55992a = iArr;
            try {
                iArr[ETEPixelFormat.PIXEL_FORMAT_YUV420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_YUV420P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_YUV422P.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_YUYV422.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_UYVY422.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_RGB8.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_RGBA8.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_JPEG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_GRAY8.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_BGR8.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_NV12.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_GRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGB8.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGBA8.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f55992a[ETEPixelFormat.PIXEL_FORMAT_Count.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$b */
    public static class C13404b extends C13405c {

        /* JADX INFO: renamed from: g */
        private int f55993g;

        /* JADX INFO: renamed from: h */
        private byte[] f55994h;

        public C13404b(int i, int i2, long j, byte[] bArr, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f55997c = 2;
            this.f55998d = i3;
            this.f55996b = eTEPixelFormat;
            this.f55994h = bArr;
            this.f55993g = i * i2 * 4;
        }

        /* JADX INFO: renamed from: a */
        public byte[] m81674a() {
            return this.f55994h;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$d */
    public static class C13406d {

        /* JADX INFO: renamed from: a */
        public int f56001a = -1;

        /* JADX INFO: renamed from: b */
        public int f56002b = -1;

        /* JADX INFO: renamed from: c */
        public long f56003c = -1;

        /* JADX INFO: renamed from: d */
        public TotalCaptureResult f56004d = null;

        /* JADX INFO: renamed from: e */
        public int f56005e = 0;

        /* JADX INFO: renamed from: f */
        public int f56006f = 0;
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$e */
    public static class C13407e extends C13405c {

        /* JADX INFO: renamed from: g */
        private int f56007g;

        /* JADX INFO: renamed from: h */
        float[] f56008h;

        public C13407e(int i, int i2, long j, int i3, int i4, float[] fArr, ETEPixelFormat eTEPixelFormat, int i5) {
            super(i, i2, j, i5);
            this.f55997c = 1;
            this.f56007g = i3;
            this.f55998d = i4;
            this.f56008h = fArr;
            this.f55996b = eTEPixelFormat;
        }

        /* JADX INFO: renamed from: a */
        public int m81675a() {
            return this.f56007g;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$f */
    public static class C13408f extends C13405c {

        /* JADX INFO: renamed from: g */
        zrh0 f56009g;

        public C13408f(int i, int i2, long j, zrh0 zrh0Var, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f55997c = 3;
            this.f55998d = i3;
            this.f55996b = eTEPixelFormat;
            this.f56009g = zrh0Var;
        }
    }

    public TECameraFrame(int i, int i2, long j) {
        this.f55987a = i;
        this.f55988b = i2;
        this.f55989c = j;
    }

    /* JADX INFO: renamed from: g */
    public static int m81666g(ETEPixelFormat eTEPixelFormat) {
        switch (C13403a.f55992a[eTEPixelFormat.ordinal()]) {
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
    public byte[] m81667a() {
        C13405c c13405c = this.f55991e;
        if (c13405c instanceof C13404b) {
            return ((C13404b) c13405c).m81674a();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public TEFrameSizei m81668b() {
        return this.f55991e.f55995a;
    }

    /* JADX INFO: renamed from: c */
    public int m81669c() {
        C13405c c13405c = this.f55991e;
        if (c13405c instanceof C13407e) {
            return ((C13407e) c13405c).m81675a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public void m81670d(byte[] bArr, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.f55991e = new C13404b(this.f55987a, this.f55988b, this.f55989c, bArr, i, eTEPixelFormat, i2);
    }

    /* JADX INFO: renamed from: e */
    public void m81671e(int i, int i2, float[] fArr, ETEPixelFormat eTEPixelFormat, int i3) {
        this.f55991e = new C13407e(this.f55987a, this.f55988b, this.f55989c, i, i2, fArr, eTEPixelFormat, i3);
    }

    /* JADX INFO: renamed from: f */
    public void m81672f(zrh0 zrh0Var, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.f55991e = new C13408f(this.f55987a, this.f55988b, this.f55989c, zrh0Var, i, eTEPixelFormat, i2);
    }

    /* JADX INFO: renamed from: h */
    public void m81673h(C13406d c13406d) {
        this.f55990d = c13406d;
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraFrame$c */
    public static class C13405c {

        /* JADX INFO: renamed from: a */
        public TEFrameSizei f55995a;

        /* JADX INFO: renamed from: b */
        public ETEPixelFormat f55996b;

        /* JADX INFO: renamed from: c */
        public int f55997c;

        /* JADX INFO: renamed from: d */
        public int f55998d;

        /* JADX INFO: renamed from: e */
        public long f55999e;

        /* JADX INFO: renamed from: f */
        public int f56000f;

        public C13405c(int i, int i2, long j, int i3) {
            this.f55997c = 0;
            this.f55995a = new TEFrameSizei(i, i2);
            this.f55999e = j;
            this.f56000f = i3;
        }

        public C13405c(int i, int i2, long j) {
            this(i, i2, j, 0);
        }
    }
}
