package com.p069ss.bytertc.engine.video;

import android.opengl.EGLContext;
import com.p069ss.bytertc.engine.data.CameraId;
import com.p069ss.bytertc.engine.data.VideoBufferType;
import com.p069ss.bytertc.engine.data.VideoContentType;
import com.p069ss.bytertc.engine.data.VideoPixelFormat;
import com.p069ss.bytertc.engine.data.VideoRotation;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface IVideoFrame {
    void addRef();

    VideoBufferType bufferType();

    CameraId cameraId();

    VideoContentType contentType();

    EGLContext eglContext();

    FovVideoFrameInfo fovTileInfo();

    int height();

    int numberOfPlanes();

    VideoPixelFormat pixelFormat();

    ByteBuffer planeData(int i);

    int planeStride(int i);

    long releaseRef();

    VideoRotation rotation();

    ByteBuffer seiData();

    int textureId();

    float[] textureMatrix();

    long timestampUs();

    int width();
}
