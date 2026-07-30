package com.bytedance.realx.video;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import com.bytedance.realx.video.memory.NativeRXByteMemory;
import com.bytedance.realx.video.memory.RXVideoByteMemoryInterface;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import com.bytedance.realx.video.memory.RXVideoMemoryInterface;
import com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface;
import java.nio.ByteBuffer;
import p153l.azk0;

/* JADX INFO: loaded from: classes.dex */
public class VideoFrameDrawer {
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    @Nullable
    private RXVideoFrameInterface lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final YuvUploader yuvUploader = new YuvUploader(null);
    private final Matrix renderMatrix = new Matrix();

    /* JADX INFO: renamed from: com.bytedance.realx.video.VideoFrameDrawer$1 */
    public static /* synthetic */ class C11741 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXPixelFormat;

        static {
            int[] iArr = new int[RXPixelFormat.values().length];
            $SwitchMap$com$bytedance$realx$video$RXPixelFormat = iArr;
            try {
                iArr[RXPixelFormat.kTextureOES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void calculateTransformedRenderSize(int i, int i2, @Nullable Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        int i3 = 0;
        while (true) {
            float[] fArr = this.dstPoints;
            if (i3 >= 3) {
                this.renderWidth = distance(fArr[0], fArr[1], fArr[2], fArr[3]);
                float[] fArr2 = this.dstPoints;
                this.renderHeight = distance(fArr2[0], fArr2[1], fArr2[4], fArr2[5]);
                return;
            } else {
                int i4 = i3 * 2;
                fArr[i4] = fArr[i4] * i;
                int i5 = i4 + 1;
                fArr[i5] = fArr[i5] * i2;
                i3++;
            }
        }
    }

    private static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot(f3 - f, f4 - f2));
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, RXVideoOpenGLMemoryInterface rXVideoOpenGLMemoryInterface, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8) {
        Matrix matrix2 = new Matrix(rXVideoOpenGLMemoryInterface.getAndroidTextureMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i9 = C11741.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[rXVideoOpenGLMemoryInterface.getTextureTarget().ordinal()];
        if (i9 == 1) {
            glDrawer.drawOes(rXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8);
        } else if (i9 == 2) {
            glDrawer.drawRgb(rXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8);
        } else {
            azk0.m101074a("Unknown texture type.");
        }
    }

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, @Nullable Matrix matrix, int i, int i2, int i3, int i4) {
        RXVideoMemoryInterface andRetainVideoFrameMemory;
        if (rXVideoFrameInterface == null || (andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory()) == null) {
            return;
        }
        try {
            calculateTransformedRenderSize(rXVideoFrameInterface.getRotatedWidth(), rXVideoFrameInterface.getRotatedHeight(), matrix);
            boolean z = andRetainVideoFrameMemory.getMemoryType() == RXVideoMemoryType.kOPENGL_TEXTURE;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate(rXVideoFrameInterface.getRotation().value());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (!z || this.renderWidth <= 0) {
                if (rXVideoFrameInterface != this.lastI420Frame) {
                    this.lastI420Frame = rXVideoFrameInterface;
                    RXVideoFrameInterface i420 = rXVideoFrameInterface.toI420();
                    if (i420 == null) {
                        return;
                    }
                    RXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                    if (!(andRetainVideoFrameMemory2 instanceof NativeRXByteMemory)) {
                        i420.release();
                        return;
                    } else {
                        this.yuvUploader.uploadFromBuffer((RXVideoByteMemoryInterface) andRetainVideoFrameMemory2);
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                    }
                }
                glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4, FilterType.Origin, 0, 0);
            } else {
                RXVideoOpenGLMemoryInterface rXVideoOpenGLMemoryInterface = (RXVideoOpenGLMemoryInterface) andRetainVideoFrameMemory;
                FilterType filterTypeFromValue = FilterType.fromValue(rXVideoOpenGLMemoryInterface.getScaleFilter().value());
                int unScaledWidth = rXVideoOpenGLMemoryInterface.getUnScaledWidth();
                int unScaledHeight = rXVideoOpenGLMemoryInterface.getUnScaledHeight();
                this.lastI420Frame = null;
                if (filterTypeFromValue == null || filterTypeFromValue == FilterType.Origin || unScaledWidth == 0 || unScaledHeight == 0) {
                    drawTexture(glDrawer, rXVideoOpenGLMemoryInterface, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4, FilterType.Origin, 0, 0);
                } else {
                    drawTexture(glDrawer, rXVideoOpenGLMemoryInterface, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4, filterTypeFromValue, unScaledWidth, unScaledHeight);
                }
            }
        } catch (Exception unused) {
        } finally {
            andRetainVideoFrameMemory.release();
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public static class YuvUploader {

        @Nullable
        private ByteBuffer copyBuffer;

        @Nullable
        private int[] yuvTextures;

        private YuvUploader() {
        }

        @Nullable
        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        @Nullable
        public int[] uploadFromBuffer(RXVideoByteMemoryInterface rXVideoByteMemoryInterface) {
            if (rXVideoByteMemoryInterface.getPixelFormat() != RXPixelFormat.kI420) {
                return null;
            }
            return uploadYuvData(rXVideoByteMemoryInterface.getWidth(), rXVideoByteMemoryInterface.getHeight(), new int[]{rXVideoByteMemoryInterface.getPlaneLineSize(0), rXVideoByteMemoryInterface.getPlaneLineSize(1), rXVideoByteMemoryInterface.getPlaneLineSize(2)}, new ByteBuffer[]{rXVideoByteMemoryInterface.getPlaneData(0), rXVideoByteMemoryInterface.getPlaneData(1), rXVideoByteMemoryInterface.getPlaneData(2)});
        }

        @Nullable
        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = i / 2;
            int[] iArr2 = {i, i3, i3};
            int i4 = i2 / 2;
            int[] iArr3 = {i2, i4, i4};
            int iMax = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i5];
                if (i6 > i7) {
                    iMax = Math.max(iMax, i7 * iArr3[i5]);
                }
            }
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i8 = 0; i8 < 3; i8++) {
                    this.yuvTextures[i8] = GlUtil.generateTexture(3553);
                }
            }
            for (int i9 = 0; i9 < 3; i9++) {
                GLES20.glPixelStorei(3317, 1);
                GLES20.glActiveTexture(33984 + i9);
                GLES20.glBindTexture(3553, this.yuvTextures[i9]);
                int i10 = iArr[i9];
                int i11 = iArr2[i9];
                if (i10 == i11) {
                    byteBuffer = byteBufferArr[i9];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i9], i10, this.copyBuffer, i11, i11, iArr3[i9]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i9], iArr3[i9], 0, 6409, 5121, byteBuffer);
                GLES20.glPixelStorei(3317, 4);
            }
            return this.yuvTextures;
        }

        public /* synthetic */ YuvUploader(C11741 c11741) {
            this();
        }
    }

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(rXVideoFrameInterface, glDrawer, matrix, 0, 0, rXVideoFrameInterface.getRotatedWidth(), rXVideoFrameInterface.getRotatedHeight());
    }

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer) {
        drawFrame(rXVideoFrameInterface, glDrawer, null);
    }
}
