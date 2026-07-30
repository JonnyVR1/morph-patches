package com.p069ss.bytertc.engine.video;

import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.data.CameraId;
import com.p069ss.bytertc.engine.data.VideoBufferType;
import com.p069ss.bytertc.engine.data.VideoContentType;
import com.p069ss.bytertc.engine.data.VideoFrameData;
import com.p069ss.bytertc.engine.data.VideoPixelFormat;
import com.p069ss.bytertc.engine.data.VideoRotation;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.lwm;

/* JADX INFO: loaded from: classes13.dex */
public class VideoFrameBridge implements IVideoFrame {
    private CameraId mCameraId;
    private long mNativePtr;
    private final AtomicInteger mRefCount = new AtomicInteger(1);
    private VideoFrameData mVfd;

    @CalledByNative
    public VideoFrameBridge(long j, int i, int i2, int i3, int i4, int i5, int i6, long j2, int i7, ByteBuffer[] byteBufferArr, int[] iArr, ByteBuffer byteBuffer, int i8, float[] fArr, EGLContext eGLContext, FovVideoFrameInfo fovVideoFrameInfo, int i9) {
        this.mNativePtr = 0L;
        this.mVfd = null;
        this.mCameraId = CameraId.CAMERA_ID_FRONT;
        this.mNativePtr = j;
        VideoFrameData videoFrameData = new VideoFrameData();
        this.mVfd = videoFrameData;
        videoFrameData.bufferType = VideoBufferType.fromId(i);
        this.mVfd.pixelFormat = VideoPixelFormat.fromId(i2);
        this.mVfd.contentType = VideoContentType.fromId(i3);
        VideoFrameData videoFrameData2 = this.mVfd;
        videoFrameData2.width = i4;
        videoFrameData2.height = i5;
        videoFrameData2.rotation = VideoRotation.fromId(i6);
        VideoFrameData videoFrameData3 = this.mVfd;
        videoFrameData3.timestampUs = j2;
        videoFrameData3.numberOfPlanes = i7;
        videoFrameData3.planeData = byteBufferArr;
        videoFrameData3.planeStride = iArr;
        videoFrameData3.seiData = byteBuffer;
        videoFrameData3.textureId = i8;
        videoFrameData3.textureMatrix = fArr;
        videoFrameData3.eglContext = eGLContext;
        videoFrameData3.fovTileInfo = fovVideoFrameInfo;
        this.mCameraId = CameraId.fromId(i9);
        nativeAddRef(this.mNativePtr);
    }

    @CalledByNative
    public static long ConvertJVideoFrameDataToVideoFrameData(VideoFrameData videoFrameData) {
        ByteBuffer[] byteBufferArr = new ByteBuffer[3];
        for (int i = 0; i < videoFrameData.numberOfPlanes; i++) {
            byteBufferArr[i] = ensureDirectBuffer(videoFrameData.planeData[i]);
        }
        return nativeCreateVideoFrameData(videoFrameData.bufferType.value(), videoFrameData.pixelFormat.value(), videoFrameData.contentType.value(), videoFrameData.width, videoFrameData.height, videoFrameData.rotation.value(), videoFrameData.timestampUs, videoFrameData.numberOfPlanes, byteBufferArr, videoFrameData.planeStride, ensureDirectBuffer(videoFrameData.seiData), ensureDirectBuffer(videoFrameData.roiData), videoFrameData.textureId, videoFrameData.textureMatrix, videoFrameData.eglContext);
    }

    @CalledByNative
    public static long ConvertVideoFrameToIVideoFrame(IVideoFrame iVideoFrame) {
        ByteBuffer[] byteBufferArr = new ByteBuffer[3];
        int[] iArr = new int[3];
        for (int i = 0; i < iVideoFrame.numberOfPlanes(); i++) {
            byteBufferArr[i] = ensureDirectBuffer(iVideoFrame.planeData(i));
            iArr[i] = iVideoFrame.planeStride(i);
        }
        return nativeCreateIVideoFrame(iVideoFrame, iVideoFrame.bufferType().value(), iVideoFrame.pixelFormat().value(), iVideoFrame.contentType().value(), iVideoFrame.width(), iVideoFrame.height(), iVideoFrame.rotation().value(), iVideoFrame.numberOfPlanes(), byteBufferArr, iArr, ensureDirectBuffer(iVideoFrame.seiData()), iVideoFrame.textureId(), iVideoFrame.textureMatrix(), iVideoFrame.eglContext(), iVideoFrame.cameraId().value());
    }

    @CalledByNative
    public static void addRefOfVideoFrame(IVideoFrame iVideoFrame) {
        iVideoFrame.addRef();
    }

    public static ByteBuffer ensureDirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static native void nativeAddRef(long j);

    public static native long nativeCreateIVideoFrame(IVideoFrame iVideoFrame, int i, int i2, int i3, int i4, int i5, int i6, int i7, ByteBuffer[] byteBufferArr, int[] iArr, ByteBuffer byteBuffer, int i8, float[] fArr, EGLContext eGLContext, int i9);

    public static native long nativeCreateVideoFrameData(int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, ByteBuffer[] byteBufferArr, int[] iArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i8, float[] fArr, EGLContext eGLContext);

    public static native long nativeReleaseRef(long j);

    @CalledByNative
    public static long releaseRefOfVideoFrame(IVideoFrame iVideoFrame) {
        return iVideoFrame.releaseRef();
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public void addRef() {
        if (this.mRefCount.getAndIncrement() >= 1) {
            nativeAddRef(this.mNativePtr);
        } else {
            lwm.m151979a("addRef on an object that has already been destroyed.");
        }
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public VideoBufferType bufferType() {
        return this.mVfd.bufferType;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public CameraId cameraId() {
        return this.mCameraId;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public VideoContentType contentType() {
        return this.mVfd.contentType;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public EGLContext eglContext() {
        return this.mVfd.eglContext;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public FovVideoFrameInfo fovTileInfo() {
        return this.mVfd.fovTileInfo;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public int height() {
        return this.mVfd.height;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public int numberOfPlanes() {
        return this.mVfd.numberOfPlanes;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public VideoPixelFormat pixelFormat() {
        return this.mVfd.pixelFormat;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public ByteBuffer planeData(int i) {
        VideoFrameData videoFrameData = this.mVfd;
        if (i >= videoFrameData.numberOfPlanes) {
            return null;
        }
        return videoFrameData.planeData[i];
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public int planeStride(int i) {
        VideoFrameData videoFrameData = this.mVfd;
        if (i >= videoFrameData.numberOfPlanes) {
            return 0;
        }
        return videoFrameData.planeStride[i];
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public long releaseRef() {
        if (this.mRefCount.getAndDecrement() >= 1) {
            nativeReleaseRef(this.mNativePtr);
        }
        return this.mRefCount.get();
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public VideoRotation rotation() {
        return this.mVfd.rotation;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public ByteBuffer seiData() {
        return this.mVfd.seiData;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public int textureId() {
        return this.mVfd.textureId;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public float[] textureMatrix() {
        return this.mVfd.textureMatrix;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public long timestampUs() {
        return this.mVfd.timestampUs;
    }

    @Override // com.p069ss.bytertc.engine.video.IVideoFrame
    public int width() {
        return this.mVfd.width;
    }
}
