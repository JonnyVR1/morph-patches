package com.p069ss.bytertc.engine.data;

import android.opengl.EGLContext;
import com.p069ss.bytertc.engine.video.FovVideoFrameInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class VideoFrameData {
    public EGLContext eglContext;
    public FovVideoFrameInfo fovTileInfo;
    public int height;
    public int numberOfPlanes;
    public ByteBuffer[] planeData;
    public int[] planeStride;
    public ByteBuffer roiData;
    public ByteBuffer seiData;
    public int textureId;
    public float[] textureMatrix;
    public long timestampUs;
    public int width;
    public VideoBufferType bufferType = VideoBufferType.RAW_MEMORY;
    public VideoPixelFormat pixelFormat = VideoPixelFormat.UNKNOWN;
    public VideoContentType contentType = VideoContentType.NORMAL_FRAME;
    public VideoRotation rotation = VideoRotation.VIDEO_ROTATION_0;
}
