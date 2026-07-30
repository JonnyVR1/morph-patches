package com.bytedance.realx.video.memory;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class NativeRXByteMemory extends RXVideoMemory implements RXVideoByteMemoryInterface {
    private final int height;
    private final RXPixelFormat pixelFormat;
    private final ByteBuffer[] planeData;
    private final int[] planeLineSize;
    private final int width;

    /* JADX INFO: renamed from: com.bytedance.realx.video.memory.NativeRXByteMemory$1 */
    public static /* synthetic */ class C11811 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXPixelFormat;

        static {
            int[] iArr = new int[RXPixelFormat.values().length];
            $SwitchMap$com$bytedance$realx$video$RXPixelFormat = iArr;
            try {
                iArr[RXPixelFormat.kArgb.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kBgra.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kI420.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kIYUV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNv12.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNv21.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRgb.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRgba.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRGB565.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kUYVY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kYUY2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kYV12.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @CalledByNative
    public NativeRXByteMemory(int i, int i2, long j, ByteBuffer[] byteBufferArr, int[] iArr, RXPixelFormat rXPixelFormat) {
        super(j);
        this.width = i;
        this.height = i2;
        this.nativeHandle = j;
        this.planeData = byteBufferArr;
        this.planeLineSize = iArr;
        this.pixelFormat = rXPixelFormat;
    }

    public static NativeRXByteMemory createRXByteMemory(int i, int i2, RXPixelFormat rXPixelFormat, long j) {
        switch (C11811.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[rXPixelFormat.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return nativeCreateRXByteMemory(i, i2, rXPixelFormat, j);
            default:
                return null;
        }
    }

    private static native NativeRXByteMemory nativeCreateRXByteMemory(int i, int i2, RXPixelFormat rXPixelFormat, long j);

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXVideoMemoryType getMemoryType() {
        return RXVideoMemoryType.kBYTE_MEMORY;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoByteMemoryInterface
    public int getNumberOfPlanes() {
        ByteBuffer[] byteBufferArr = this.planeData;
        if (byteBufferArr == null) {
            return 0;
        }
        return byteBufferArr.length;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoByteMemoryInterface
    public ByteBuffer getPlaneData(int i) {
        ByteBuffer[] byteBufferArr = this.planeData;
        if (byteBufferArr != null && i <= byteBufferArr.length) {
            return byteBufferArr[i].slice();
        }
        return null;
    }

    public ByteBuffer[] getPlaneDataArray() {
        return this.planeData;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoByteMemoryInterface
    public int getPlaneLineSize(int i) {
        int[] iArr = this.planeLineSize;
        if (iArr != null && i <= iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public int[] getPlaneLineSizeArray() {
        return this.planeLineSize;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getWidth() {
        return this.width;
    }
}
