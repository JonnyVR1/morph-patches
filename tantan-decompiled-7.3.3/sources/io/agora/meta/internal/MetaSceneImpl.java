package io.agora.meta.internal;

import android.view.TextureView;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.meta.EnterSceneConfig;
import io.agora.meta.ILocalUserAvatar;
import io.agora.meta.IMetaScene;
import io.agora.meta.IMetaSceneEventHandler;
import io.agora.meta.SceneDisplayConfig;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.utils2.internal.Logging;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class MetaSceneImpl extends IMetaScene {
    private static final String TAG = "MetaSceneImpl";
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    private final ILocalUserAvatar mLocalUserAvatar;
    private long mNativeHandle;

    @CalledByNative
    public MetaSceneImpl(long j) {
        this.mNativeHandle = 0L;
        this.mNativeHandle = j;
        this.mLocalUserAvatar = new LocalUserAvatarImpl(nativeGetLocalUserAvatar(j));
    }

    private native int nativeAddEventHandler(long j, Object obj);

    private native int nativeAddSceneView(long j, TextureView textureView, SceneDisplayConfig sceneDisplayConfig);

    private static native int nativeDestroy(long j);

    private native int nativeEnableFaceCapture(long j, boolean z);

    private native int nativeEnableSceneVideoCapture(long j, TextureView textureView, boolean z);

    private native int nativeEnableVideoDisplay(long j, String str, boolean z);

    private native int nativeEnterScene(long j, EnterSceneConfig enterSceneConfig);

    private native long nativeGetLocalUserAvatar(long j);

    private native int nativeLeaveScene(long j);

    private native int nativePushAgoraVideoFrameToDisplay(long j, String str, int i, byte[] bArr, int i2, int i3, long j2);

    private native int nativePushVideoFrameToDisplay(long j, String str, VideoFrame videoFrame);

    private native int nativeRemoveEventHandler(long j, Object obj);

    private native int nativeRemoveSceneView(long j, TextureView textureView);

    private native int nativeSendSceneMessage(long j, byte[] bArr);

    private native int nativeSetSceneParameters(long j, String str);

    @Override // io.agora.meta.IMetaScene
    public int addEventHandler(IMetaSceneEventHandler iMetaSceneEventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(addEventHandler)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (addEventHandler)");
                    return -7;
                }
                return nativeAddEventHandler(j, iMetaSceneEventHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int addSceneView(TextureView textureView, SceneDisplayConfig sceneDisplayConfig) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(addSceneView)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (addSceneView)");
                    return -7;
                }
                return nativeAddSceneView(j, textureView, sceneDisplayConfig);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableFaceCapture(boolean z) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(enableFaceCapture)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (enableFaceCapture)");
                    return -7;
                }
                return nativeEnableFaceCapture(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableSceneVideoCapture(TextureView textureView, boolean z) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(enableSceneVideoCapture)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (enableSceneVideoCapture)");
                    return -7;
                }
                return nativeEnableSceneVideoCapture(j, textureView, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableVideoDisplay(String str, boolean z) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(enableVideoDisplay)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (enableVideoDisplay)");
                    return -7;
                }
                return nativeEnableVideoDisplay(j, str, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enterScene(EnterSceneConfig enterSceneConfig) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(enterScene)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (enterScene)");
                    return -7;
                }
                return nativeEnterScene(j, enterSceneConfig);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public ILocalUserAvatar getLocalUserAvatar() {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(getLocalUserAvatar)");
            return null;
        }
        synchronized (this) {
            try {
                if (this.mNativeHandle == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (getLocalUserAvatar)");
                    return null;
                }
                return this.mLocalUserAvatar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int leaveScene() {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(leaveScene)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (leaveScene)");
                    return -7;
                }
                return nativeLeaveScene(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int pushVideoFrameToDisplay(String str, AgoraVideoFrame agoraVideoFrame) throws Throwable {
        Throwable th;
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(pushVideoFrameToDisplay(AgoraVideoFrame))");
            return -8;
        }
        synchronized (this) {
            try {
                try {
                    long j = this.mNativeHandle;
                    if (j != 0) {
                        return nativePushAgoraVideoFrameToDisplay(j, str, agoraVideoFrame.format, agoraVideoFrame.buf, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.timeStamp);
                    }
                    try {
                        Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (pushVideoFrameToDisplay)");
                        return -7;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int release() {
        if (this.mNativeHandle != 0) {
            this.mIsDestroying.set(true);
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
            this.mIsDestroying.set(false);
        }
        return 0;
    }

    @Override // io.agora.meta.IMetaScene
    public int removeEventHandler(IMetaSceneEventHandler iMetaSceneEventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(removeEventHandler)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (removeEventHandler)");
                    return -7;
                }
                return nativeRemoveEventHandler(j, iMetaSceneEventHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int removeSceneView(TextureView textureView) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(removeSceneView)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (removeSceneView)");
                    return -7;
                }
                return nativeRemoveSceneView(j, textureView);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int sendSceneMessage(byte[] bArr) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(sendSceneMessage)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (sendSceneMessage)");
                    return -7;
                }
                return nativeSendSceneMessage(j, bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int setSceneParameters(String str) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(setSceneParameters)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (setSceneParameters)");
                    return -7;
                }
                return nativeSetSceneParameters(j, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int pushVideoFrameToDisplay(String str, VideoFrame videoFrame) {
        if (this.mIsDestroying.get()) {
            Logging.m88108e(TAG, "MetaScene is destroying(pushVideoFrameToDisplay(VideoFrame))");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m88108e(TAG, "MetaScene does not initialize or it may be destroyed (pushVideoFrameToDisplay)");
                    return -7;
                }
                return nativePushVideoFrameToDisplay(j, str, videoFrame);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
