package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import io.agora.base.JavaI010Buffer;
import io.agora.base.VideoFrame;
import java.nio.ByteBuffer;
import p153l.azk0;

/* JADX INFO: loaded from: classes2.dex */
public class VideoFrameDrawer {
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    @Nullable
    private VideoFrame lastConvertFrame;

    @Nullable
    private VideoFrame lastI1010Frame;

    @Nullable
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final YuvUploader yuvUploader = new YuvUploader(null);
    private final Matrix renderMatrix = new Matrix();

    /* JADX INFO: renamed from: io.agora.base.internal.video.VideoFrameDrawer$1 */
    public static /* synthetic */ class C151351 {
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

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, int i, Matrix matrix, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        TextureBufferPool.waitFenceSignal2(textureBuffer.getFenceObject(), "VideoFrameDrawer");
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i10 = C151351.$SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i10 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), i, fArrConvertMatrixFromAndroidGraphicsMatrix, i2, i3, i4, i5, i6, i7, i8, i9);
        } else if (i10 == 2) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), i, fArrConvertMatrixFromAndroidGraphicsMatrix, i2, i3, i4, i5, i6, i7, i8, i9);
        } else {
            azk0.m101074a("Unknown texture type.");
        }
    }

    public void convertByDrawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, @Nullable Matrix matrix, int i, int i2, int i3, int i4) {
        calculateTransformedRenderSize(i3, i4, matrix);
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate(0.0f);
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix != null) {
            this.renderMatrix.preConcat(matrix);
        }
        if (z) {
            drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), 0, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4, videoFrame.getColorSpace().getTransfer().getTransfer());
            return;
        }
        if (videoFrame != this.lastConvertFrame) {
            this.lastConvertFrame = videoFrame;
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            GLES20.glPixelStorei(3317, 1);
            this.yuvUploader.uploadFromBuffer(i420);
            i420.release();
        }
        glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4, videoFrame.getColorSpace(), videoFrame.getColorSpace().getTransfer().getTransfer());
    }

    public void disableNegativeAlphaData() {
        YuvUploader yuvUploader = this.yuvUploader;
        if (yuvUploader != null) {
            yuvUploader.disableNegativeAlphaData();
        }
    }

    public void doLut10Frame(RendererCommon.GlDrawer glDrawer, byte[] bArr) {
        glDrawer.setLut10Texture(bArr);
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, @Nullable Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        boolean z2 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z2) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate(videoFrame.getRotation());
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix != null) {
            this.renderMatrix.preConcat(matrix);
        }
        int alphaTexture = 0;
        if (z2) {
            this.lastI420Frame = null;
            this.lastI1010Frame = null;
            if (videoFrame.getAlphaBuffer() != null && z) {
                alphaTexture = this.yuvUploader.uploadAlphaData(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getAlphaBuffer(), z2);
            }
            drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), alphaTexture, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4, videoFrame.getColorSpace().getTransfer().getTransfer(), videoFrame.getAlphaStitchMode());
            return;
        }
        if ((videoFrame.getBuffer() instanceof JavaI010Buffer) && videoFrame != this.lastI1010Frame) {
            this.lastI1010Frame = videoFrame;
            JavaI010Buffer javaI010Buffer = (JavaI010Buffer) videoFrame.getBuffer();
            if (javaI010Buffer != null) {
                javaI010Buffer.retain();
                this.yuvUploader.uploadI1010FromBuffer(javaI010Buffer);
                javaI010Buffer.release();
            }
        } else if (videoFrame != this.lastI420Frame) {
            this.lastI420Frame = videoFrame;
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            this.yuvUploader.uploadFromBuffer(i420);
            i420.release();
            if (videoFrame.getAlphaBuffer() != null && z) {
                alphaTexture = this.yuvUploader.uploadAlphaData(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getAlphaBuffer(), z2);
            }
        } else if (z) {
            alphaTexture = this.yuvUploader.getAlphaTexture();
        }
        int i5 = alphaTexture;
        int alphaStitchMode = videoFrame.getAlphaStitchMode();
        int iValue = VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value();
        YuvUploader yuvUploader = this.yuvUploader;
        if (alphaStitchMode == iValue) {
            glDrawer.drawYuv(yuvUploader.getYuvTextures(), i5, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4, videoFrame.getColorSpace(), videoFrame.getColorSpace().getTransfer().getTransfer());
        } else {
            glDrawer.drawAlphaStitchGraph(yuvUploader.getYuvTextures(), i5, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4, videoFrame.getColorSpace(), videoFrame.getColorSpace().getTransfer().getTransfer(), videoFrame.getAlphaStitchMode());
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
        this.lastI1010Frame = null;
        this.lastConvertFrame = null;
    }

    public static class YuvUploader {
        private int alphaTexture;

        @Nullable
        private ByteBuffer copyAlphaBuffer;

        @Nullable
        private ByteBuffer copyBuffer;
        private boolean enableNegativeAlphaData;

        @Nullable
        private int[] yuvTextures;

        private YuvUploader() {
            this.alphaTexture = 0;
            this.enableNegativeAlphaData = true;
        }

        public void disableNegativeAlphaData() {
            this.enableNegativeAlphaData = false;
        }

        public int getAlphaTexture() {
            return this.alphaTexture;
        }

        @Nullable
        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            this.copyAlphaBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
            int i = this.alphaTexture;
            if (i > 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.alphaTexture = 0;
            }
        }

        public int uploadAlphaData(int i, int i2, ByteBuffer byteBuffer, boolean z) {
            if (this.alphaTexture == 0) {
                this.alphaTexture = GlUtil.generateTexture(3553);
            }
            boolean z2 = false;
            if (i <= 0 || i2 <= 0) {
                return 0;
            }
            int i3 = i * i2;
            if (z && this.enableNegativeAlphaData) {
                z2 = true;
            }
            if (z2) {
                ByteBuffer byteBuffer2 = this.copyAlphaBuffer;
                if (byteBuffer2 == null || byteBuffer2.capacity() < i3) {
                    this.copyAlphaBuffer = ByteBuffer.allocateDirect(i3);
                }
                YuvHelper.copyPlane(byteBuffer, i, this.copyAlphaBuffer, i, i, -i2);
            }
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, this.alphaTexture);
            GLES20.glTexImage2D(3553, 0, 6406, i, i2, 0, 6406, 5121, z2 ? this.copyAlphaBuffer : byteBuffer);
            return this.alphaTexture;
        }

        @Nullable
        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()}, true);
        }

        @Nullable
        public int[] uploadI1010FromBuffer(JavaI010Buffer javaI010Buffer) {
            return uploadYuvData(javaI010Buffer.getWidth(), javaI010Buffer.getHeight(), new int[]{javaI010Buffer.getStrideY(), javaI010Buffer.getStrideU(), javaI010Buffer.getStrideV()}, new ByteBuffer[]{javaI010Buffer.getDataY(), javaI010Buffer.getDataU(), javaI010Buffer.getDataV()}, false);
        }

        @Nullable
        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr, boolean z) {
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
                    iMax = z ? Math.max(iMax, i7 * iArr3[i5]) : Math.max(iMax, i7 * iArr3[i5] * 2);
                }
            }
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i8 = 0; i8 < 3; i8++) {
                    this.yuvTextures[i8] = GlUtil.generateTexture(3553);
                    GlUtil.checkNoGLES2Error("generateTexture");
                }
            }
            for (int i9 = 0; i9 < 3; i9++) {
                GLES20.glActiveTexture(33984 + i9);
                GLES20.glBindTexture(3553, this.yuvTextures[i9]);
                int i10 = iArr[i9];
                int i11 = iArr2[i9];
                if (i10 == i11) {
                    byteBuffer = byteBufferArr[i9];
                } else {
                    if (z) {
                        YuvHelper.copyPlane(byteBufferArr[i9], i10, this.copyBuffer, i11, i11, iArr3[i9]);
                    } else {
                        YuvHelper.copyPlane16(byteBufferArr[i9], i10, this.copyBuffer, i11, i11, iArr3[i9]);
                    }
                    byteBuffer = this.copyBuffer;
                }
                ByteBuffer byteBuffer3 = byteBuffer;
                if (z) {
                    GLES20.glTexImage2D(3553, 0, 6409, iArr2[i9], iArr3[i9], 0, 6409, 5121, byteBuffer3);
                } else {
                    GLES20.glTexImage2D(3553, 0, 6410, iArr2[i9], iArr3[i9], 0, 6410, 5121, byteBuffer3);
                }
                GlUtil.checkNoGLES2Error("glTexImage2D");
            }
            return this.yuvTextures;
        }

        public /* synthetic */ YuvUploader(C151351 c151351) {
            this();
        }
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, int i, Matrix matrix, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        drawTexture(glDrawer, textureBuffer, i, matrix, i2, i3, i4, i5, i6, i7, i8, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), false);
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }
}
