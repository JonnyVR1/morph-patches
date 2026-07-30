package io.agora.base;

import android.graphics.Matrix;
import androidx.annotation.Nullable;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.RefCounted;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.WrappedNativeColorSpace;
import java.nio.ByteBuffer;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class VideoFrame implements RefCounted {

    @Nullable
    private ByteBuffer alphaBuffer;
    private AlphaStitchMode alphaStitchMode;
    private Buffer buffer;
    private ColorSpace colorSpace;
    private VideoFrameMetaInfo metaInfo;
    private long nativeAlphaBuffer;
    private int rotation;
    private float sampleAspectRatio;
    private SourceType sourceType;
    private long timestampNs;

    public enum AlphaStitchMode {
        ALPHA_NO_STITCH(0),
        ALPHA_STITCH_UP(1),
        ALPHA_STITCH_BELOW(2),
        ALPHA_STITCH_LEFT(3),
        ALPHA_STITCH_RIGHT(4);

        private final int stitchMode;

        AlphaStitchMode(int i) {
            this.stitchMode = i;
        }

        public int value() {
            return this.stitchMode;
        }
    }

    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @Nullable
        @CalledByNative("Buffer")
        Buffer mirror(int i);

        @Override // io.agora.base.internal.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // io.agora.base.internal.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @Nullable
        @CalledByNative("Buffer")
        Buffer rotate(int i);

        @CalledByNative("Buffer")
        I420Buffer toI420();

        @Nullable
        @CalledByNative("Buffer")
        Buffer transform(int i, int i2, int i3, int i4, int i5, int i6, int i7);
    }

    public interface ColorSpace {

        public enum Matrix {
            RGB(0),
            BT709(1),
            Unspecified(2),
            FCC(4),
            BT470BG(5),
            SMPTE170M(6),
            SMPTE240M(7),
            YCOCG(8),
            BT2020_NCL(9),
            BT2020_CL(10),
            SMPTE2085(11),
            CDNCLS(12),
            CDCLS(13),
            BT2100_ICTCP(14);

            private final int matrix;

            Matrix(int i) {
                this.matrix = i;
            }

            public int getMatrix() {
                return this.matrix;
            }
        }

        public enum Primary {
            BT709(1),
            Unspecified(2),
            BT470M(4),
            BT470BG(5),
            kSMPTE170M(6),
            kSMPTE240M(7),
            kFILM(8),
            kBT2020(9),
            kSMPTEST428(10),
            kSMPTEST431(11),
            kSMPTEST432(12),
            kJEDECP22(22);

            private final int primary;

            Primary(int i) {
                this.primary = i;
            }

            public int getPrimary() {
                return this.primary;
            }
        }

        public enum Range {
            Invalid(0),
            Limited(1),
            Full(2);

            private final int range;

            Range(int i) {
                this.range = i;
            }

            public int getRange() {
                return this.range;
            }
        }

        public enum Transfer {
            BT709(1),
            Unspecified(2),
            GAMMA22(4),
            GAMMA28(5),
            SMPTE170M(6),
            SMPTE240M(7),
            LINEAR(8),
            LOG(9),
            LOG_SQRT(10),
            IEC61966_2_4(11),
            BT1361_ECG(12),
            IEC61966_2_1(13),
            BT2020_10(14),
            BT2020_12(15),
            SMPTEST2084(16),
            SMPTEST428(17),
            ARIB_STD_B67(18);

            private final int transfer;

            Transfer(int i) {
                this.transfer = i;
            }

            public int getTransfer() {
                return this.transfer;
            }
        }

        HdrMetadata getHdrMetadata();

        Matrix getMatrix();

        Primary getPrimary();

        Range getRange();

        Transfer getTransfer();
    }

    public interface HdrMetadata {

        public static class Chromaticity {

            /* JADX INFO: renamed from: x */
            public int f64008x;

            /* JADX INFO: renamed from: y */
            public int f64009y;

            public Chromaticity(int i, int i2) {
                this.f64008x = i;
                this.f64009y = i2;
            }
        }

        int getLuminanceMax();

        int getLuminanceMin();

        int getMaxContentLightLevel();

        int getMaxFrameAverageLightLevel();

        Chromaticity getWhitePoint();

        Chromaticity getprimaryB();

        Chromaticity getprimaryG();

        Chromaticity getprimaryR();
    }

    public interface I010Buffer extends Buffer {
        @CalledByNative("I010Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I010Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I010Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I010Buffer")
        int getStrideU();

        @CalledByNative("I010Buffer")
        int getStrideV();

        @CalledByNative("I010Buffer")
        int getStrideY();
    }

    public interface I420Buffer extends Buffer {
        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    public interface I422Buffer extends Buffer {
        @CalledByNative("I422Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I422Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I422Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I422Buffer")
        int getStrideU();

        @CalledByNative("I422Buffer")
        int getStrideV();

        @CalledByNative("I422Buffer")
        int getStrideY();
    }

    public interface RgbaBuffer extends Buffer {
        @CalledByNative("RgbaBuffer")
        ByteBuffer getData();
    }

    public enum SourceType {
        kFrontCamera,
        kBackCamera,
        kUnspecified
    }

    public interface TextureBuffer extends Buffer {

        public enum ContextType {
            EGL_CONTEXT_10,
            EGL_CONTEXT_14
        }

        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        @CalledByNative("TextureBuffer")
        EglBase.Context getEglBaseContext();

        @CalledByNative("TextureBuffer")
        int getEglContextType();

        @CalledByNative("TextureBuffer")
        long getFenceObject();

        @CalledByNative("TextureBuffer")
        long getNativeEglContext();

        @CalledByNative("TextureBuffer")
        int getSequence();

        @CalledByNative("TextureBuffer")
        Object getSourceTexturePool();

        @CalledByNative("TextureBuffer")
        int getTextureId();

        Matrix getTransformMatrix();

        @CalledByNative("TextureBuffer")
        float[] getTransformMatrixArray();

        Type getType();

        @CalledByNative("TextureBuffer")
        boolean is10BitTexture();

        @CalledByNative("TextureBuffer")
        I010Buffer toI010();
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, int i, long j, ColorSpace colorSpace, ByteBuffer byteBuffer, long j2, float f, int i2) {
        this.alphaStitchMode = AlphaStitchMode.ALPHA_NO_STITCH;
        this.metaInfo = new VideoFrameMetaInfo();
        if (buffer == null) {
            wg3.m206174a("buffer not allowed to be null");
            throw null;
        }
        if (i % 90 != 0) {
            wg3.m206174a("rotation must be a multiple of 90");
            throw null;
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
        this.colorSpace = colorSpace;
        this.alphaBuffer = byteBuffer;
        this.nativeAlphaBuffer = j2;
        this.sampleAspectRatio = f;
        this.sourceType = SourceType.values()[i2];
    }

    @CalledByNative
    private int getColorSpaceMatrix() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Matrix.Unspecified.getMatrix() : colorSpace.getMatrix().getMatrix();
    }

    @CalledByNative
    private int getColorSpacePrimary() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Primary.Unspecified.getPrimary() : colorSpace.getPrimary().getPrimary();
    }

    @CalledByNative
    private int getColorSpaceRange() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Range.Invalid.getRange() : colorSpace.getRange().getRange();
    }

    @CalledByNative
    private int getColorSpaceTransfer() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Transfer.Unspecified.getTransfer() : colorSpace.getTransfer().getTransfer();
    }

    public void fillAlphaData(ByteBuffer byteBuffer) {
        this.alphaBuffer = byteBuffer;
    }

    @CalledByNative
    public ByteBuffer getAlphaBuffer() {
        return this.alphaBuffer;
    }

    @CalledByNative
    public int getAlphaStitchMode() {
        return this.alphaStitchMode.value();
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @CalledByNative
    public VideoFrameMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public int getRotatedHeight() {
        int i = this.rotation % 180;
        AlphaStitchMode alphaStitchMode = this.alphaStitchMode;
        if (i == 0) {
            return (alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_UP || alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_BELOW) ? this.buffer.getHeight() / 2 : this.buffer.getHeight();
        }
        return (alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_LEFT || alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_RIGHT) ? this.buffer.getWidth() / 2 : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % 180;
        AlphaStitchMode alphaStitchMode = this.alphaStitchMode;
        if (i == 0) {
            return (alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_LEFT || alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_RIGHT) ? this.buffer.getWidth() / 2 : this.buffer.getWidth();
        }
        return (alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_UP || alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_BELOW) ? this.buffer.getHeight() / 2 : this.buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    public float getSampleAspectRatio() {
        return this.sampleAspectRatio;
    }

    @CalledByNative
    public SourceType getSourceType() {
        return this.sourceType;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // io.agora.base.internal.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    public void releaseAlphaBuffer() {
        JniCommon.nativeReleaseRef(this.nativeAlphaBuffer);
    }

    public void replaceBuffer(Buffer buffer, int i, long j) {
        release();
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
    }

    @Override // io.agora.base.internal.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public void retainAlphaBuffer() {
        JniCommon.nativeAddRef(this.nativeAlphaBuffer);
    }

    @CalledByNative
    public void setAlphaStitchMode(int i) {
        this.alphaStitchMode = AlphaStitchMode.values()[i];
    }

    public void setColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        this(buffer, i, j, new WrappedNativeColorSpace(), null, 0L, 1.0f, SourceType.kUnspecified.ordinal());
    }
}
