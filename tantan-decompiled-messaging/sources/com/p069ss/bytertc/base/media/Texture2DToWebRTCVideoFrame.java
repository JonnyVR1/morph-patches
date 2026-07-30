package com.p069ss.bytertc.base.media;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.p069ss.bytertc.base.media.Texture2DToWebRTCVideoFrame;

/* JADX INFO: loaded from: classes12.dex */
public class Texture2DToWebRTCVideoFrame {
    Handler mHandler;
    Matrix mMat;
    boolean needPendingRelease;
    YuvConverter yuvConverter = new YuvConverter();
    boolean isReleased = false;
    boolean isFrameInUse = false;

    @CalledByNative
    public Texture2DToWebRTCVideoFrame() {
        this.mHandler = null;
        this.needPendingRelease = false;
        HandlerThread handlerThread = new HandlerThread("Texture2DToVideoFrame");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.needPendingRelease = false;
        Matrix matrix = new Matrix();
        this.mMat = matrix;
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80853a(Texture2DToWebRTCVideoFrame texture2DToWebRTCVideoFrame) {
        texture2DToWebRTCVideoFrame.yuvConverter.release();
        texture2DToWebRTCVideoFrame.mHandler.getLooper().quit();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m80855c(Texture2DToWebRTCVideoFrame texture2DToWebRTCVideoFrame) {
        texture2DToWebRTCVideoFrame.yuvConverter.release();
        texture2DToWebRTCVideoFrame.mHandler.getLooper().quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseFrame() {
        this.isFrameInUse = false;
        if (!this.needPendingRelease || this.isReleased) {
            return;
        }
        this.isReleased = true;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: l.yji0
            @Override // java.lang.Runnable
            public final void run() {
                Texture2DToWebRTCVideoFrame.m80855c(this.f198635a);
            }
        });
    }

    @CalledByNative
    public VideoFrame convertTexture2DToWebRTCVideoFrame(int i, int i2, int i3) {
        if (this.needPendingRelease || this.isReleased) {
            return null;
        }
        this.isFrameInUse = true;
        return new VideoFrame(new TextureBufferImpl(i2, i3, VideoFrame.TextureBuffer.Type.RGB, i, this.mMat, this.mHandler, this.yuvConverter, new Runnable() { // from class: l.xji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193225a.releaseFrame();
            }
        }), 0, 0L);
    }

    @CalledByNative
    public boolean isFameInUse() {
        return this.isFrameInUse;
    }

    @CalledByNative
    public void release() {
        if (this.isFrameInUse) {
            this.needPendingRelease = true;
        } else {
            this.isReleased = true;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: l.wji0
                @Override // java.lang.Runnable
                public final void run() {
                    Texture2DToWebRTCVideoFrame.m80853a(this.f186656a);
                }
            });
        }
    }
}
