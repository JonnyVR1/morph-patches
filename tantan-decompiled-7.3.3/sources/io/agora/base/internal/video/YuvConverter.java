package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import io.agora.base.JavaI010Buffer;
import io.agora.base.JavaI420Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.iig0;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class YuvConverter {
    private static final int ANDROID_MATRIX_LENGTH = 9;
    private static final boolean DEBUG = false;
    private static final String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String TAG = "YuvConverter";
    private static boolean enableHardwareBuffer = false;
    private static boolean enablePboOpt = true;
    private final List<YuvConverterStats> convertStatsList;
    private long convertTimeCounter;
    private long convertTimeInNS;
    private final GlGenericDrawer drawer;
    private final GlRectDrawer drawer10bit;
    private Matrix formerTextureMatrix;
    private final GPUPBOUtil gpupboUtil;
    private final HardwareBufferHelper hardwareBufferHelper;
    private final GlTextureFrameBuffer i010TextureFrameBuffer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer;
    private int maxTextureSize;
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;
    private static final AtomicBoolean mIsNeedForceResetPbo = new AtomicBoolean(false);
    private static boolean enableConvertPerLog = false;
    private static boolean enableReportYuvConvertStats = true;

    /* JADX INFO: renamed from: io.agora.base.internal.video.YuvConverter$3 */
    public static /* synthetic */ class C151423 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private float[] coeffs;
        private int coeffsLoc;
        private VideoFrame.ColorSpace colorSpace;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] Y_COEFFS_BIT601_LIMIT = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] U_COEFFS_BIT601_LIMIT = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] V_COEFFS_BIT601_LIMIT = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};
        private static final float[] Y_COEFFS_BIT601_FULL = {0.299f, 0.587f, 0.114f, 0.0f};
        private static final float[] U_COEFFS_BIT601_FULL = {-0.168736f, -0.331264f, 0.5f, 0.5f};
        private static final float[] V_COEFFS_BIT601_FULL = {0.5f, -0.418688f, -0.0813124f, 0.5f};
        private static final float[] Y_COEFFS_BIT709_LIMIT = {0.183f, 0.614f, 0.062f, 0.0627451f};
        private static final float[] U_COEFFS_BIT709_LIMIT = {-0.101f, -0.339f, 0.439f, 0.5f};
        private static final float[] V_COEFFS_BIT709_LIMIT = {0.439f, -0.399f, -0.04f, 0.5f};
        private static final float[] Y_COEFFS_BIT709_FULL = {0.2126f, 0.7154f, 0.072f, 0.0f};
        private static final float[] U_COEFFS_BIT709_FULL = {-0.1145f, -0.3855f, 0.5f, 0.5f};
        private static final float[] V_COEFFS_BIT709_FULL = {0.5f, -0.4543f, -0.0457f, 0.5f};
        private static final float[] Y_BT2020_FULL = {0.2627f, 0.678f, 0.0593f, 0.0f};
        private static final float[] U_BT2020_FULL = {-0.1396f, -0.3604f, 0.5f, 0.5f};
        private static final float[] V_BT2020_FULL = {0.5f, -0.4598f, -0.0402f, 0.5f};

        private ShaderCallbacks() {
            this.colorSpace = new WrappedNativeColorSpace(VideoFrame.ColorSpace.Range.Full.getRange(), VideoFrame.ColorSpace.Matrix.SMPTE170M.getMatrix(), VideoFrame.ColorSpace.Transfer.SMPTE170M.getTransfer(), VideoFrame.ColorSpace.Primary.kSMPTE170M.getPrimary());
        }

        @Override // io.agora.base.internal.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // io.agora.base.internal.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }

        public void setColorSpace(VideoFrame.ColorSpace colorSpace) {
            if (colorSpace != null) {
                this.colorSpace = colorSpace;
            }
        }

        public void setPlaneU() {
            this.stepSize = 2.0f;
            if (this.colorSpace.getTransfer() == VideoFrame.ColorSpace.Transfer.BT2020_10) {
                this.coeffs = U_BT2020_FULL;
                return;
            }
            VideoFrame.ColorSpace.Range range = this.colorSpace.getRange();
            VideoFrame.ColorSpace.Range range2 = VideoFrame.ColorSpace.Range.Full;
            VideoFrame.ColorSpace colorSpace = this.colorSpace;
            if (range == range2) {
                this.coeffs = colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709 ? U_COEFFS_BIT709_FULL : U_COEFFS_BIT601_FULL;
            } else {
                this.coeffs = colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709 ? U_COEFFS_BIT709_LIMIT : U_COEFFS_BIT601_LIMIT;
            }
        }

        public void setPlaneV() {
            this.stepSize = 2.0f;
            if (this.colorSpace.getTransfer() == VideoFrame.ColorSpace.Transfer.BT2020_10) {
                this.coeffs = V_BT2020_FULL;
                return;
            }
            VideoFrame.ColorSpace.Range range = this.colorSpace.getRange();
            VideoFrame.ColorSpace.Range range2 = VideoFrame.ColorSpace.Range.Full;
            VideoFrame.ColorSpace colorSpace = this.colorSpace;
            if (range == range2) {
                this.coeffs = colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709 ? V_COEFFS_BIT709_FULL : V_COEFFS_BIT601_FULL;
            } else {
                this.coeffs = colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709 ? V_COEFFS_BIT709_LIMIT : V_COEFFS_BIT601_LIMIT;
            }
        }

        public void setPlaneY() {
            this.stepSize = 1.0f;
            if (this.colorSpace.getTransfer() == VideoFrame.ColorSpace.Transfer.BT2020_10) {
                this.coeffs = Y_BT2020_FULL;
                return;
            }
            VideoFrame.ColorSpace.Range range = this.colorSpace.getRange();
            VideoFrame.ColorSpace.Range range2 = VideoFrame.ColorSpace.Range.Full;
            VideoFrame.ColorSpace colorSpace = this.colorSpace;
            if (range == range2) {
                this.coeffs = colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709 ? Y_COEFFS_BIT709_FULL : Y_COEFFS_BIT601_FULL;
            } else {
                this.coeffs = colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709 ? Y_COEFFS_BIT709_LIMIT : Y_COEFFS_BIT601_LIMIT;
            }
        }
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer(FRAGMENT_SHADER, shaderCallbacks);
        this.i010TextureFrameBuffer = new GlTextureFrameBuffer(34842);
        this.drawer10bit = new GlRectDrawer();
        this.gpupboUtil = new GPUPBOUtil();
        this.formerTextureMatrix = new Matrix();
        this.maxTextureSize = 0;
        this.convertTimeInNS = 0L;
        this.convertTimeCounter = 0L;
        this.convertStatsList = new ArrayList();
        this.hardwareBufferHelper = new HardwareBufferHelper();
        threadChecker.detachThread();
    }

    private boolean checkMaxTextureSize(int i, int i2) {
        if (this.maxTextureSize == 0) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(3379, iArr, 0);
            GlUtil.checkNoGLES2Error("glGetIntegerv of max texture size error");
            this.maxTextureSize = iArr[0];
        }
        int i3 = this.maxTextureSize;
        if (i3 >= i && i3 >= i2) {
            return false;
        }
        Logging.m88098e(TAG, "reach max texture size width:" + i + ", height:" + i2 + ", maxTextureSize:" + this.maxTextureSize);
        return true;
    }

    @CalledByNative
    public static void clearPboBuffer() {
        mIsNeedForceResetPbo.set(true);
    }

    private JavaI010Buffer convert10Texture(VideoFrame.TextureBuffer textureBuffer) {
        this.threadChecker.checkIsOnValidThread();
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = height + i2;
        int i4 = i / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        if (checkMaxTextureSize(i4, i3)) {
            return null;
        }
        this.i010TextureFrameBuffer.setSize(i4, i3);
        this.shaderCallbacks.setColorSpace(new WrappedNativeColorSpace(VideoFrame.ColorSpace.Range.Full.getRange(), VideoFrame.ColorSpace.Matrix.BT2020_CL.getMatrix(), VideoFrame.ColorSpace.Transfer.BT2020_10.getTransfer(), VideoFrame.ColorSpace.Primary.kBT2020.getPrimary()));
        GLES20.glBindFramebuffer(36160, this.i010TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, 0, i4, height, 0);
        this.shaderCallbacks.setPlaneU();
        int i5 = i4 / 2;
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, height, i5, i2, 0);
        this.shaderCallbacks.setPlaneV();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, i5, height, i5, i2, 0);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i3 * 4);
        GLES20.glReadPixels(0, 0, width, i3, 6408, 5126, byteBufferAllocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkNoGLES2Error("glReadPixels setSize");
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        final ByteBuffer byteBuffer = get10BitBuffer(byteBufferAllocateDirect, width, height, i, i3);
        int i6 = i * height;
        int i7 = i6 * 2;
        int i8 = i6 / 4;
        int i9 = (i6 + i8) * 2;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBuffer.position(i7);
        int i10 = i8 * 2;
        byteBuffer.limit(i7 + i10);
        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBuffer.position(i9);
        byteBuffer.limit(i9 + i10);
        int i11 = i / 2;
        return JavaI010Buffer.wrap(width, height, byteBufferSlice, i, byteBufferSlice2, i11, byteBuffer.slice(), i11, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.2
            @Override // java.lang.Runnable
            public void run() {
                JniCommon.nativeFreeByteBuffer(byteBuffer);
            }
        });
    }

    private void drawTexture(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4) {
        GLES20.glClear(16384);
        int i5 = C151423.$SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[type.ordinal()];
        if (i5 == 1) {
            this.drawer10bit.drawOes(i, 0, GlUtil.IDENTITY_MATRIX, i2, i3, 0, 0, i2, i3, i4, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
        } else {
            if (i5 != 2) {
                wg3.m206174a("Unknown texture type.");
                return;
            }
            this.drawer10bit.drawRgb(i, 0, GlUtil.IDENTITY_MATRIX, i2, i3, 0, 0, i2, i3, i4, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
        }
        GlUtil.checkNoGLES2Error("yuvconvert.drawFrameBuffer");
    }

    private ByteBuffer get10BitBuffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        int i5 = i3 * i4;
        float[] fArr = new float[i5];
        floatBufferAsFloatBuffer.get(fArr);
        int i6 = i * i2;
        byte[] bArr = new byte[i6 * 2];
        int i7 = (i6 / 4) * 2;
        byte[] bArr2 = new byte[i7];
        byte[] bArr3 = new byte[i7];
        for (int i8 = 0; i8 < i3; i8++) {
            for (int i9 = 0; i9 < i4; i9++) {
                int i10 = (i9 * i3) + i8;
                try {
                    float f = fArr[i10];
                    if (i10 < i3 * i2) {
                        short s = (short) (f * 1024.0f);
                        int i11 = i10 * 2;
                        bArr[i11] = (byte) (s & 255);
                        bArr[i11 + 1] = (byte) (s >> 8);
                    } else if (i8 < i3 / 2) {
                        short s2 = (short) (f * 1024.0f);
                        int i12 = (((i9 - i2) * (i3 / 2)) + i8) * 2;
                        bArr2[i12] = (byte) (s2 & 255);
                        bArr2[i12 + 1] = (byte) (s2 >> 8);
                    } else {
                        short s3 = (short) (f * 1024.0f);
                        int i13 = ((((i9 - i2) * (i3 / 2)) + i8) - (i3 / 2)) * 2;
                        bArr3[i13] = (byte) (s3 & 255);
                        bArr3[i13 + 1] = (byte) (s3 >> 8);
                    }
                } catch (Exception e) {
                    iig0.m140070a(e);
                    return null;
                }
            }
        }
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i5 * 2);
        byteBufferNativeAllocateByteBuffer.put(bArr);
        byteBufferNativeAllocateByteBuffer.put(bArr2);
        byteBufferNativeAllocateByteBuffer.put(bArr3);
        byteBufferNativeAllocateByteBuffer.flip();
        return byteBufferNativeAllocateByteBuffer;
    }

    private YuvConverterStats getYuvConverterStats(int i, int i2, YuvConverterStats.YuvConvertMethod yuvConvertMethod) {
        YuvConverterStats yuvConverterStats = null;
        for (YuvConverterStats yuvConverterStats2 : this.convertStatsList) {
            if (yuvConverterStats2.getWidth() == i && yuvConverterStats2.getHeight() == i2 && yuvConverterStats2.getMethod() == yuvConvertMethod.value) {
                yuvConverterStats = yuvConverterStats2;
            }
        }
        if (yuvConverterStats != null) {
            return yuvConverterStats;
        }
        YuvConverterStats yuvConverterStats3 = new YuvConverterStats(i, i2, yuvConvertMethod);
        this.convertStatsList.add(yuvConverterStats3);
        return yuvConverterStats3;
    }

    public static native void nativeReportYuvConvertStats(YuvConverterStats yuvConverterStats);

    @CalledByNative
    public static void setEnableConvertPerLog(boolean z) {
        enableConvertPerLog = z;
    }

    @CalledByNative
    public static void setEnableConvertReport(boolean z) {
        enableReportYuvConvertStats = z;
    }

    @CalledByNative
    public static void setEnableHardwareBuffer(boolean z) {
        enableHardwareBuffer = z;
    }

    @CalledByNative
    public static void setEnablePboOpt(boolean z) {
        enablePboOpt = z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:15:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:27:0x011c  */
    /* JADX WARN: Code duplicated, block: B:29:0x011f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0123  */
    /* JADX WARN: Code duplicated, block: B:36:0x014e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0157  */
    /* JADX WARN: Code duplicated, block: B:42:0x015d  */
    /* JADX WARN: Code duplicated, block: B:46:0x018c A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0199 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x019f A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01b5 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01be  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e3 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ea A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f1 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0201 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:44:0x017a, B:46:0x018c, B:48:0x0199, B:52:0x01a7, B:54:0x01b5, B:58:0x01c3, B:60:0x01df, B:62:0x01e3, B:64:0x01ea, B:67:0x01f1, B:68:0x01f3, B:70:0x0201, B:65:0x01ed, B:71:0x0204, B:51:0x019f), top: B:76:0x017a }] */
    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer, @Nullable VideoFrame.ColorSpace colorSpace) {
        int i;
        int i2;
        boolean z;
        GlTextureFrameBuffer glTextureFrameBuffer;
        int i3;
        int i4;
        ByteBuffer byteBufferNativeAllocateByteBuffer;
        long jNanoTime;
        boolean z2;
        boolean z3;
        AtomicBoolean atomicBoolean;
        final ByteBuffer byteBuffer;
        boolean z4;
        long jNanoTime2;
        YuvConverterStats.YuvConvertMethod yuvConvertMethod;
        YuvConverterStats yuvConverterStats;
        long jNanoTime3;
        long j;
        long j2;
        String str;
        this.threadChecker.checkIsOnValidThread();
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i5 = ((width + 7) / 8) * 8;
        int i6 = (height + 1) / 2;
        int i7 = height + i6;
        int i8 = i5 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        if (checkMaxTextureSize(i8, i7)) {
            return null;
        }
        boolean z5 = !textureBuffer.getTransformMatrix().equals(this.formerTextureMatrix);
        try {
            if (enableHardwareBuffer) {
                i = i7;
                i2 = i8;
                if (this.hardwareBufferHelper.prepare(i2, i, 1, 259L, z5)) {
                    z = true;
                }
                glTextureFrameBuffer = this.i420TextureFrameBuffer;
                if (z) {
                    int i9 = i;
                    int i10 = i2;
                    glTextureFrameBuffer.bindTexture(this.hardwareBufferHelper.getOesTextureId(), 36197, i10, i9, z5);
                    i3 = i10;
                    i4 = i9;
                } else {
                    i3 = i2;
                    i4 = i;
                    glTextureFrameBuffer.setSize(i3, i4);
                }
                GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
                GlUtil.checkNoGLES2Error("glBindFramebuffer");
                this.shaderCallbacks.setColorSpace(colorSpace);
                this.shaderCallbacks.setPlaneY();
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, 0, i3, height, 0);
                this.shaderCallbacks.setPlaneU();
                int i11 = i3 / 2;
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, height, i11, i6, 0);
                this.shaderCallbacks.setPlaneV();
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, i11, height, i11, i6, 0);
                byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i5 * i4);
                if (!enableConvertPerLog || enableReportYuvConvertStats) {
                    jNanoTime = System.nanoTime();
                } else {
                    jNanoTime = 0;
                }
                if (z || !this.hardwareBufferHelper.readFrame(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), byteBufferNativeAllocateByteBuffer)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (enablePboOpt || !this.gpupboUtil.readFrame(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), z5, 6408, 5121, byteBufferNativeAllocateByteBuffer, mIsNeedForceResetPbo.get())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    atomicBoolean = mIsNeedForceResetPbo;
                    if (atomicBoolean.get()) {
                        atomicBoolean.set(false);
                    }
                    if (z3) {
                        GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, byteBufferNativeAllocateByteBuffer);
                        byteBuffer = byteBufferNativeAllocateByteBuffer;
                    }
                    float[] fArr = new float[9];
                    textureBuffer.getTransformMatrix().getValues(fArr);
                    this.formerTextureMatrix.setValues(fArr);
                    if (enableConvertPerLog) {
                        jNanoTime3 = System.nanoTime() - jNanoTime;
                        z4 = z2;
                        j = this.convertTimeInNS;
                        if (j == 0) {
                            this.convertTimeInNS = jNanoTime3;
                        } else {
                            this.convertTimeInNS = (long) ((j + jNanoTime3) / 2.0d);
                        }
                        j2 = this.convertTimeCounter + 1;
                        this.convertTimeCounter = j2;
                        if (j2 % 100 == 0) {
                            this.convertTimeCounter = 0L;
                            StringBuilder sb = new StringBuilder("pbo ");
                            if (z3) {
                                str = "YES";
                            } else {
                                str = "NO";
                            }
                            sb.append(str);
                            sb.append(", avg timing for read pixel, ");
                            sb.append(this.convertTimeInNS);
                            sb.append(" ns");
                            Logging.m88102w(TAG, sb.toString());
                        }
                    } else {
                        z4 = z2;
                    }
                    if (enableReportYuvConvertStats) {
                        jNanoTime2 = System.nanoTime() - jNanoTime;
                        if (z3) {
                            yuvConvertMethod = YuvConverterStats.YuvConvertMethod.PBO;
                        } else {
                            yuvConvertMethod = YuvConverterStats.YuvConvertMethod.GL_READ_PIXELS;
                        }
                        if (z4) {
                            yuvConvertMethod = YuvConverterStats.YuvConvertMethod.HARDWARE_BUFFER;
                        }
                        yuvConverterStats = getYuvConverterStats(width, height, yuvConvertMethod);
                        if (yuvConverterStats.stats((int) (jNanoTime2 / 1000))) {
                            nativeReportYuvConvertStats(yuvConverterStats);
                        }
                    }
                    GlUtil.checkNoGLES2Error("YuvConverter.convert");
                    GLES20.glBindFramebuffer(36160, 0);
                    int i12 = i5 * height;
                    int i13 = i5 / 2;
                    int i14 = i12 + i13;
                    byteBuffer.position(0);
                    byteBuffer.limit(i12);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBuffer.position(i12);
                    int i15 = (i5 * (i6 - 1)) + i13;
                    byteBuffer.limit(i12 + i15);
                    ByteBuffer byteBufferSlice2 = byteBuffer.slice();
                    byteBuffer.position(i14);
                    byteBuffer.limit(i14 + i15);
                    return JavaI420Buffer.wrap(width, height, byteBufferSlice, i5, byteBufferSlice2, i5, byteBuffer.slice(), i5, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.1
                        @Override // java.lang.Runnable
                        public void run() {
                            JniCommon.nativeFreeByteBuffer(byteBuffer);
                        }
                    });
                }
                z3 = false;
                byteBuffer = byteBufferNativeAllocateByteBuffer;
                float[] fArr2 = new float[9];
                textureBuffer.getTransformMatrix().getValues(fArr2);
                this.formerTextureMatrix.setValues(fArr2);
                if (enableConvertPerLog) {
                    jNanoTime3 = System.nanoTime() - jNanoTime;
                    z4 = z2;
                    j = this.convertTimeInNS;
                    if (j == 0) {
                        this.convertTimeInNS = jNanoTime3;
                    } else {
                        this.convertTimeInNS = (long) ((j + jNanoTime3) / 2.0d);
                    }
                    j2 = this.convertTimeCounter + 1;
                    this.convertTimeCounter = j2;
                    if (j2 % 100 == 0) {
                        this.convertTimeCounter = 0L;
                        StringBuilder sb2 = new StringBuilder("pbo ");
                        if (z3) {
                            str = "YES";
                        } else {
                            str = "NO";
                        }
                        sb2.append(str);
                        sb2.append(", avg timing for read pixel, ");
                        sb2.append(this.convertTimeInNS);
                        sb2.append(" ns");
                        Logging.m88102w(TAG, sb2.toString());
                    }
                } else {
                    z4 = z2;
                }
                if (enableReportYuvConvertStats) {
                    jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (z3) {
                        yuvConvertMethod = YuvConverterStats.YuvConvertMethod.PBO;
                    } else {
                        yuvConvertMethod = YuvConverterStats.YuvConvertMethod.GL_READ_PIXELS;
                    }
                    if (z4) {
                        yuvConvertMethod = YuvConverterStats.YuvConvertMethod.HARDWARE_BUFFER;
                    }
                    yuvConverterStats = getYuvConverterStats(width, height, yuvConvertMethod);
                    if (yuvConverterStats.stats((int) (jNanoTime2 / 1000))) {
                        nativeReportYuvConvertStats(yuvConverterStats);
                    }
                }
                GlUtil.checkNoGLES2Error("YuvConverter.convert");
                GLES20.glBindFramebuffer(36160, 0);
                int i16 = i5 * height;
                int i17 = i5 / 2;
                int i18 = i16 + i17;
                byteBuffer.position(0);
                byteBuffer.limit(i16);
                ByteBuffer byteBufferSlice3 = byteBuffer.slice();
                byteBuffer.position(i16);
                int i19 = (i5 * (i6 - 1)) + i17;
                byteBuffer.limit(i16 + i19);
                ByteBuffer byteBufferSlice4 = byteBuffer.slice();
                byteBuffer.position(i18);
                byteBuffer.limit(i18 + i19);
                return JavaI420Buffer.wrap(width, height, byteBufferSlice3, i5, byteBufferSlice4, i5, byteBuffer.slice(), i5, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.1
                    @Override // java.lang.Runnable
                    public void run() {
                        JniCommon.nativeFreeByteBuffer(byteBuffer);
                    }
                });
            }
            i = i7;
            i2 = i8;
            if (z2) {
                if (enablePboOpt) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                atomicBoolean = mIsNeedForceResetPbo;
                if (atomicBoolean.get()) {
                    atomicBoolean.set(false);
                }
                if (z3) {
                    GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, byteBufferNativeAllocateByteBuffer);
                    byteBuffer = byteBufferNativeAllocateByteBuffer;
                }
                float[] fArr3 = new float[9];
                textureBuffer.getTransformMatrix().getValues(fArr3);
                this.formerTextureMatrix.setValues(fArr3);
                if (enableConvertPerLog) {
                    jNanoTime3 = System.nanoTime() - jNanoTime;
                    z4 = z2;
                    j = this.convertTimeInNS;
                    if (j == 0) {
                        this.convertTimeInNS = jNanoTime3;
                    } else {
                        this.convertTimeInNS = (long) ((j + jNanoTime3) / 2.0d);
                    }
                    j2 = this.convertTimeCounter + 1;
                    this.convertTimeCounter = j2;
                    if (j2 % 100 == 0) {
                        this.convertTimeCounter = 0L;
                        StringBuilder sb3 = new StringBuilder("pbo ");
                        if (z3) {
                            str = "YES";
                        } else {
                            str = "NO";
                        }
                        sb3.append(str);
                        sb3.append(", avg timing for read pixel, ");
                        sb3.append(this.convertTimeInNS);
                        sb3.append(" ns");
                        Logging.m88102w(TAG, sb3.toString());
                    }
                } else {
                    z4 = z2;
                }
                if (enableReportYuvConvertStats) {
                    jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (z3) {
                        yuvConvertMethod = YuvConverterStats.YuvConvertMethod.PBO;
                    } else {
                        yuvConvertMethod = YuvConverterStats.YuvConvertMethod.GL_READ_PIXELS;
                    }
                    if (z4) {
                        yuvConvertMethod = YuvConverterStats.YuvConvertMethod.HARDWARE_BUFFER;
                    }
                    yuvConverterStats = getYuvConverterStats(width, height, yuvConvertMethod);
                    if (yuvConverterStats.stats((int) (jNanoTime2 / 1000))) {
                        nativeReportYuvConvertStats(yuvConverterStats);
                    }
                }
                GlUtil.checkNoGLES2Error("YuvConverter.convert");
                GLES20.glBindFramebuffer(36160, 0);
                int i110 = i5 * height;
                int i111 = i5 / 2;
                int i112 = i110 + i111;
                byteBuffer.position(0);
                byteBuffer.limit(i110);
                ByteBuffer byteBufferSlice5 = byteBuffer.slice();
                byteBuffer.position(i110);
                int i113 = (i5 * (i6 - 1)) + i111;
                byteBuffer.limit(i110 + i113);
                ByteBuffer byteBufferSlice6 = byteBuffer.slice();
                byteBuffer.position(i112);
                byteBuffer.limit(i112 + i113);
                return JavaI420Buffer.wrap(width, height, byteBufferSlice5, i5, byteBufferSlice6, i5, byteBuffer.slice(), i5, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.1
                    @Override // java.lang.Runnable
                    public void run() {
                        JniCommon.nativeFreeByteBuffer(byteBuffer);
                    }
                });
            }
            z3 = false;
            float[] fArr4 = new float[9];
            textureBuffer.getTransformMatrix().getValues(fArr4);
            this.formerTextureMatrix.setValues(fArr4);
            if (enableConvertPerLog) {
                jNanoTime3 = System.nanoTime() - jNanoTime;
                z4 = z2;
                j = this.convertTimeInNS;
                if (j == 0) {
                    this.convertTimeInNS = jNanoTime3;
                } else {
                    this.convertTimeInNS = (long) ((j + jNanoTime3) / 2.0d);
                }
                j2 = this.convertTimeCounter + 1;
                this.convertTimeCounter = j2;
                if (j2 % 100 == 0) {
                    this.convertTimeCounter = 0L;
                    StringBuilder sb4 = new StringBuilder("pbo ");
                    if (z3) {
                        str = "YES";
                    } else {
                        str = "NO";
                    }
                    sb4.append(str);
                    sb4.append(", avg timing for read pixel, ");
                    sb4.append(this.convertTimeInNS);
                    sb4.append(" ns");
                    Logging.m88102w(TAG, sb4.toString());
                }
            } else {
                z4 = z2;
            }
            if (enableReportYuvConvertStats) {
                jNanoTime2 = System.nanoTime() - jNanoTime;
                if (z3) {
                    yuvConvertMethod = YuvConverterStats.YuvConvertMethod.PBO;
                } else {
                    yuvConvertMethod = YuvConverterStats.YuvConvertMethod.GL_READ_PIXELS;
                }
                if (z4) {
                    yuvConvertMethod = YuvConverterStats.YuvConvertMethod.HARDWARE_BUFFER;
                }
                yuvConverterStats = getYuvConverterStats(width, height, yuvConvertMethod);
                if (yuvConverterStats.stats((int) (jNanoTime2 / 1000))) {
                    nativeReportYuvConvertStats(yuvConverterStats);
                }
            }
            GlUtil.checkNoGLES2Error("YuvConverter.convert");
            GLES20.glBindFramebuffer(36160, 0);
            int i114 = i5 * height;
            int i115 = i5 / 2;
            int i116 = i114 + i115;
            byteBuffer.position(0);
            byteBuffer.limit(i114);
            ByteBuffer byteBufferSlice7 = byteBuffer.slice();
            byteBuffer.position(i114);
            int i117 = (i5 * (i6 - 1)) + i115;
            byteBuffer.limit(i114 + i117);
            ByteBuffer byteBufferSlice8 = byteBuffer.slice();
            byteBuffer.position(i116);
            byteBuffer.limit(i116 + i117);
            return JavaI420Buffer.wrap(width, height, byteBufferSlice7, i5, byteBufferSlice8, i5, byteBuffer.slice(), i5, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.1
                @Override // java.lang.Runnable
                public void run() {
                    JniCommon.nativeFreeByteBuffer(byteBuffer);
                }
            });
        } catch (Exception e) {
            JniCommon.nativeFreeByteBuffer(byteBuffer);
            Logging.m88102w(TAG, "convert error: " + e.getMessage());
            return null;
        }
        z = false;
        glTextureFrameBuffer = this.i420TextureFrameBuffer;
        if (z) {
            int i20 = i;
            int i118 = i2;
            glTextureFrameBuffer.bindTexture(this.hardwareBufferHelper.getOesTextureId(), 36197, i118, i20, z5);
            i3 = i118;
            i4 = i20;
        } else {
            i3 = i2;
            i4 = i;
            glTextureFrameBuffer.setSize(i3, i4);
        }
        GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setColorSpace(colorSpace);
        this.shaderCallbacks.setPlaneY();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, 0, i3, height, 0);
        this.shaderCallbacks.setPlaneU();
        int i119 = i3 / 2;
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, height, i119, i6, 0);
        this.shaderCallbacks.setPlaneV();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, i119, height, i119, i6, 0);
        byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i5 * i4);
        if (enableConvertPerLog) {
            jNanoTime = System.nanoTime();
        } else {
            jNanoTime = System.nanoTime();
        }
        if (z) {
            z2 = false;
        } else {
            z2 = false;
        }
        byteBuffer = byteBufferNativeAllocateByteBuffer;
    }

    public JavaI010Buffer convertI010(VideoFrame.TextureBuffer textureBuffer) {
        if (HdrUtil.isSupportedEGL3()) {
            return convert10Texture(textureBuffer);
        }
        return null;
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.gpupboUtil.release();
        this.threadChecker.detachThread();
        this.convertStatsList.clear();
        this.hardwareBufferHelper.release();
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        return convert(textureBuffer, null);
    }
}
