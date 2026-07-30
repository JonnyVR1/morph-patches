package io.agora.base.internal.video;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGLContext;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class VideoFrameSenderExImpl {
    private static final String TAG = "VideoFrameSenderEx";

    @Nullable
    private EglBase.Context eglContext = null;

    @Nullable
    private SurfaceTextureHelper surfaceTextureHelper = null;

    @Nullable
    private Handler toI420Handler = null;

    @Nullable
    private YuvConverter yuvConverter = null;
    private boolean enableTextureCopy = false;
    private int textureBufferCount = 4;
    private final Object surfaceTextureHelperLock = new Object();
    private long prevFenceObject = 0;

    public @interface VIDEO_PIXEL_FORMAT {
        public static final int VIDEO_TEXTURE_2D = 10;
        public static final int VIDEO_TEXTURE_OES = 11;
    }

    @CalledByNative
    public VideoFrameSenderExImpl() {
        Logging.m88100i(TAG, "constructor() enableTextureCopy:" + this.enableTextureCopy);
    }

    @Nullable
    private VideoFrame.Buffer copyToNewTextureBuffer(VideoFrame.Buffer buffer) {
        if (!(buffer instanceof IHandlerReplaceable) && !(buffer instanceof VideoFrame.TextureBuffer)) {
            return buffer;
        }
        VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
        IHandlerReplaceable iHandlerReplaceable = (IHandlerReplaceable) buffer;
        if (getSurfaceTextureHelper(textureBuffer.getEglBaseContext())) {
            VideoFrame.Buffer bufferApplyNewI420Handler = iHandlerReplaceable.applyNewI420Handler(this.toI420Handler, this.yuvConverter);
            return this.enableTextureCopy ? this.surfaceTextureHelper.textureCopy((VideoFrame.TextureBuffer) bufferApplyNewI420Handler) : bufferApplyNewI420Handler;
        }
        Logging.m88098e(TAG, "Failed to create surfaceTextureHelper in copyToNewTextureBuffer");
        return null;
    }

    public static EglBase.Context createEglBaseContext(Object obj) {
        if (obj instanceof EglBase.Context) {
            return (EglBase.Context) obj;
        }
        if (obj instanceof EGLContext) {
            return new EglBase10.Context((EGLContext) obj);
        }
        if (obj instanceof android.opengl.EGLContext) {
            return new EglBase14.Context((android.opengl.EGLContext) obj);
        }
        wg3.m206174a("illegal egl context");
        return null;
    }

    @CalledByNative
    private void enableTextureCopy(boolean z) {
        Logging.m88100i(TAG, "enableTextureCopy new:" + z + ", old:" + this.enableTextureCopy);
        this.enableTextureCopy = z;
    }

    private boolean getSurfaceTextureHelper(@NonNull EglBase.Context context) {
        synchronized (this.surfaceTextureHelperLock) {
            try {
                if (this.surfaceTextureHelper != null) {
                    return true;
                }
                SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("VideoFrameSender", context, this.textureBufferCount, 1);
                this.surfaceTextureHelper = surfaceTextureHelperCreate;
                if (surfaceTextureHelperCreate == null) {
                    Logging.m88098e(TAG, "Failed to create surfaceTextureHelper");
                    return false;
                }
                this.toI420Handler = surfaceTextureHelperCreate.getHandler();
                this.yuvConverter = new YuvConverter();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean reInitSurfaceTextureHelper(@NonNull EglBase.Context context) {
        Logging.m88100i(TAG, "reInitI420Converter()");
        if (this.surfaceTextureHelper != null) {
            dispose();
        }
        if (getSurfaceTextureHelper(context)) {
            this.eglContext = context;
            return true;
        }
        Logging.m88098e(TAG, "Failed to create surfaceTextureHelper in reInitI420Converter");
        return false;
    }

    private boolean reInitSurfaceTextureHelperIfNeed(EglBase.Context context) {
        EglBase.Context context2 = this.eglContext;
        return (context2 != null && context2.equals(context)) || reInitSurfaceTextureHelper(context);
    }

    @CalledByNative
    private void setTextureBufferCount(int i) {
        Logging.m88100i(TAG, "setTextureBufferCount bufferCount:" + i);
        this.textureBufferCount = i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035 A[Catch: all -> 0x0019, TryCatch #1 {, blocks: (B:4:0x000c, B:6:0x0010, B:12:0x0031, B:14:0x0035, B:15:0x003b, B:11:0x001c), top: B:21:0x000c, inners: #0 }] */
    @CalledByNative
    public void dispose() {
        SurfaceTextureHelper surfaceTextureHelper;
        Logging.m88100i(TAG, "dispose()");
        synchronized (this.surfaceTextureHelperLock) {
            Handler handler = this.toI420Handler;
            if (handler != null) {
                try {
                    ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.base.internal.video.VideoFrameSenderExImpl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            VideoFrameSenderExImpl.this.yuvConverter.release();
                        }
                    });
                } catch (Exception e) {
                    Logging.m88098e(TAG, "yuvConverter release failed:" + e.toString());
                }
                surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.dispose();
                    this.surfaceTextureHelper = null;
                }
            } else {
                surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.dispose();
                    this.surfaceTextureHelper = null;
                }
            }
            throw th;
        }
    }

    @Nullable
    @CalledByNative
    public VideoFrame.Buffer newTextureBuffer(Object obj, int i, int i2, int i3, int i4, long j, float[] fArr) {
        VideoFrame.TextureBuffer.Type type;
        EglBase.Context contextCreateEglBaseContext = createEglBaseContext(obj);
        if (i3 == 10) {
            type = VideoFrame.TextureBuffer.Type.RGB;
        } else {
            if (i3 != 11) {
                wg3.m206174a("illegal pixel format");
                return null;
            }
            type = VideoFrame.TextureBuffer.Type.OES;
        }
        VideoFrame.TextureBuffer.Type type2 = type;
        if (fArr.length != 16) {
            wg3.m206174a("unsupported matrix");
            return null;
        }
        TextureBuffer textureBuffer = new TextureBuffer(contextCreateEglBaseContext, i, i2, type2, i4, j, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), (Handler) null, (YuvConverter) null, (Runnable) null);
        VideoFrame.Buffer bufferReconstructTextureBuffer = reconstructTextureBuffer(textureBuffer);
        textureBuffer.release();
        return bufferReconstructTextureBuffer;
    }

    @Nullable
    @CalledByNative
    public VideoFrame.Buffer reconstructTextureBuffer(VideoFrame.Buffer buffer) {
        YuvConverter yuvConverter;
        if ((buffer instanceof IHandlerReplaceable) || (buffer instanceof VideoFrame.TextureBuffer)) {
            if (this.surfaceTextureHelper != null) {
                VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
                if (textureBuffer.getFenceObject() != 0) {
                    this.surfaceTextureHelper.invoke(new Callable<Void>() { // from class: io.agora.base.internal.video.VideoFrameSenderExImpl.1
                        @Override // java.util.concurrent.Callable
                        public Void call() {
                            TextureBufferPool.deleteFenceObject(VideoFrameSenderExImpl.this.prevFenceObject, "VideoFrameSenderExImpl");
                            return null;
                        }
                    });
                    this.prevFenceObject = textureBuffer.getFenceObject();
                }
            }
            if (this.enableTextureCopy) {
                if (reInitSurfaceTextureHelperIfNeed(((VideoFrame.TextureBuffer) buffer).getEglBaseContext())) {
                    return copyToNewTextureBuffer(buffer);
                }
                return null;
            }
            IHandlerReplaceable iHandlerReplaceable = (IHandlerReplaceable) buffer;
            if (iHandlerReplaceable.getToI420Handler() == null || iHandlerReplaceable.getYuvConverter() == null) {
                if (!reInitSurfaceTextureHelperIfNeed(((VideoFrame.TextureBuffer) buffer).getEglBaseContext())) {
                    return null;
                }
                Handler handler = this.toI420Handler;
                if (handler != null && (yuvConverter = this.yuvConverter) != null) {
                    return iHandlerReplaceable.applyNewI420Handler(handler, yuvConverter);
                }
                Logging.m88098e(TAG, "converter null");
                return null;
            }
        }
        return buffer;
    }
}
