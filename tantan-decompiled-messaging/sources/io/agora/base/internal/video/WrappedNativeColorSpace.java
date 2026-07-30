package io.agora.base.internal.video;

import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class WrappedNativeColorSpace implements VideoFrame.ColorSpace {
    private VideoFrame.ColorSpace.Matrix matrix;
    private VideoFrame.ColorSpace.Primary primary;
    private VideoFrame.ColorSpace.Range range;
    private VideoFrame.ColorSpace.Transfer transfer;

    @CalledByNative
    public WrappedNativeColorSpace(int i, int i2, int i3, int i4) {
        this.range = VideoFrame.ColorSpace.Range.Invalid;
        this.matrix = VideoFrame.ColorSpace.Matrix.Unspecified;
        this.transfer = VideoFrame.ColorSpace.Transfer.Unspecified;
        this.primary = VideoFrame.ColorSpace.Primary.Unspecified;
        for (VideoFrame.ColorSpace.Range range : VideoFrame.ColorSpace.Range.values()) {
            if (range.getRange() == i) {
                this.range = range;
                break;
            }
        }
        for (VideoFrame.ColorSpace.Matrix matrix : VideoFrame.ColorSpace.Matrix.values()) {
            if (matrix.getMatrix() == i2) {
                this.matrix = matrix;
                break;
            }
        }
        for (VideoFrame.ColorSpace.Transfer transfer : VideoFrame.ColorSpace.Transfer.values()) {
            if (transfer.getTransfer() == i3) {
                this.transfer = transfer;
                break;
            }
        }
        for (VideoFrame.ColorSpace.Primary primary : VideoFrame.ColorSpace.Primary.values()) {
            if (primary.getPrimary() == i4) {
                this.primary = primary;
                return;
            }
        }
    }

    @Override // io.agora.base.VideoFrame.ColorSpace
    public VideoFrame.HdrMetadata getHdrMetadata() {
        return null;
    }

    @Override // io.agora.base.VideoFrame.ColorSpace
    public VideoFrame.ColorSpace.Matrix getMatrix() {
        return this.matrix;
    }

    @Override // io.agora.base.VideoFrame.ColorSpace
    public VideoFrame.ColorSpace.Primary getPrimary() {
        return this.primary;
    }

    @Override // io.agora.base.VideoFrame.ColorSpace
    public VideoFrame.ColorSpace.Range getRange() {
        return this.range;
    }

    @Override // io.agora.base.VideoFrame.ColorSpace
    public VideoFrame.ColorSpace.Transfer getTransfer() {
        return this.transfer;
    }

    public WrappedNativeColorSpace() {
        this.range = VideoFrame.ColorSpace.Range.Invalid;
        this.matrix = VideoFrame.ColorSpace.Matrix.Unspecified;
        this.transfer = VideoFrame.ColorSpace.Transfer.Unspecified;
        this.primary = VideoFrame.ColorSpace.Primary.Unspecified;
    }
}
