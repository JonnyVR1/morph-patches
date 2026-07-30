package com.p069ss.bytertc.engine.video.converter;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.p069ss.bytertc.engine.data.VideoBufferType;
import com.p069ss.bytertc.engine.data.VideoPixelFormat;
import com.p069ss.bytertc.engine.utils.ByteBufferUtils;
import com.p069ss.bytertc.engine.utils.LogUtil;
import com.p069ss.bytertc.engine.video.IVideoFrame;
import java.nio.ByteBuffer;
import p149l.tip0;

/* JADX INFO: loaded from: classes13.dex */
public class WebRTCConverter {
    private static final String TAG = "WebRTCConverter";

    public static VideoFrame convertByteI420Frame2WebrtcI420Frame(IVideoFrame iVideoFrame) {
        if (iVideoFrame.bufferType() != VideoBufferType.RAW_MEMORY || iVideoFrame.pixelFormat() != VideoPixelFormat.I420) {
            return null;
        }
        iVideoFrame.addRef();
        try {
            return new VideoFrame(JavaI420Buffer.wrap(iVideoFrame.width(), iVideoFrame.height(), iVideoFrame.planeData(0), iVideoFrame.planeStride(0), iVideoFrame.planeData(1), iVideoFrame.planeStride(1), iVideoFrame.planeData(2), iVideoFrame.planeStride(2), new tip0(iVideoFrame)), iVideoFrame.rotation().value(), iVideoFrame.timestampUs());
        } catch (IllegalArgumentException e) {
            iVideoFrame.releaseRef();
            LogUtil.m80901e(TAG, "Frame convert failed: " + e.getMessage());
            return null;
        }
    }

    public static VideoFrame convertByteRGBAFrame2WebrtcI420Frame(IVideoFrame iVideoFrame) {
        if (iVideoFrame.bufferType() != VideoBufferType.RAW_MEMORY || iVideoFrame.pixelFormat() != VideoPixelFormat.RGBA) {
            return null;
        }
        int iWidth = iVideoFrame.width();
        int iHeight = iVideoFrame.height();
        int iPlaneStride = iVideoFrame.planeStride(0);
        int i = ((iWidth + 63) / 64) * 64;
        int i2 = (((iWidth >> 1) + 63) / 64) * 64;
        ByteBuffer byteBufferPlaneData = iVideoFrame.planeData(0);
        if (byteBufferPlaneData == null) {
            return null;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * iHeight);
        int i3 = ((iHeight + 1) >> 1) * i2;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i3);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i3);
        ByteBufferUtils.nativeRGBAToI420(byteBufferPlaneData, iPlaneStride, byteBufferAllocateDirect, i, byteBufferAllocateDirect2, i2, byteBufferAllocateDirect3, i2, iWidth, iHeight);
        return new VideoFrame(JavaI420Buffer.wrap(iWidth, iHeight, byteBufferAllocateDirect, i, byteBufferAllocateDirect2, i2, byteBufferAllocateDirect3, i2, new tip0(iVideoFrame)), iVideoFrame.rotation().value(), iVideoFrame.timestampUs());
    }

    public static VideoFrame convertByteTexFrame2WebrtcTexFrame(IVideoFrame iVideoFrame, Looper looper) {
        if (iVideoFrame.bufferType() != VideoBufferType.GL_TEXTURE || looper == null) {
            return null;
        }
        Matrix matrixConvertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(iVideoFrame.textureMatrix());
        VideoFrame.TextureBuffer.Type type = iVideoFrame.pixelFormat() == VideoPixelFormat.TEXTURE_2D ? VideoFrame.TextureBuffer.Type.RGB : VideoFrame.TextureBuffer.Type.OES;
        iVideoFrame.addRef();
        return new VideoFrame(new TextureBufferImpl(iVideoFrame.width(), iVideoFrame.height(), type, iVideoFrame.textureId(), matrixConvertMatrixToAndroidGraphicsMatrix, new Handler(looper), new YuvConverter(), new tip0(iVideoFrame)), iVideoFrame.rotation().value(), iVideoFrame.timestampUs());
    }
}
