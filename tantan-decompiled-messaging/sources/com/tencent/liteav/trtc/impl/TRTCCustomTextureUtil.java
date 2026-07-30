package com.tencent.liteav.trtc.impl;

import android.opengl.GLES20;
import android.os.HandlerThread;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.C14107d;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.HandlerC14014g;
import com.tencent.liteav.beauty.p093b.C14083k;
import com.tencent.trtc.TRTCCloudDef;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes2.dex */
public class TRTCCustomTextureUtil {
    private static final String TAG = "TRTCCustomTextureUtil";
    private C14107d mCaptureAndEnc;
    private long mLastGLThreadId;
    private C14015h mRotateFilter;
    private HandlerC14014g mGLThreadHandler = null;
    private HandlerThread mEGLThread = null;
    private Object mEGLContext = null;
    private C14083k mI4202RGBAFilter = null;

    public TRTCCustomTextureUtil(C14107d c14107d) {
        this.mCaptureAndEnc = c14107d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void apiLog(String str) {
        TXCLog.m82969i(TAG, "trtc_api " + str);
    }

    private void checkEGLContext(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        boolean z;
        if (tRTCVideoFrame == null) {
            return;
        }
        if (this.mLastGLThreadId == Thread.currentThread().getId()) {
            TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
            z = false;
            if (tRTCTexture != null) {
                EGLContext eGLContext = tRTCTexture.eglContext10;
                if (eGLContext != null) {
                    boolean zEquals = eGLContext.equals(this.mEGLContext);
                    z = !zEquals;
                    if (!zEquals) {
                        apiLog("CustomCapture egl10Context change!");
                    }
                }
                android.opengl.EGLContext eGLContext2 = tRTCVideoFrame.texture.eglContext14;
                if (eGLContext2 != null) {
                    boolean zEquals2 = eGLContext2.equals(this.mEGLContext);
                    z = !zEquals2;
                    if (!zEquals2) {
                        apiLog("CustomCapture egl14Context change!");
                    }
                }
            }
        } else {
            apiLog("CustomCapture eglContext's thread change!");
            z = true;
        }
        this.mLastGLThreadId = Thread.currentThread().getId();
        TRTCCloudDef.TRTCTexture tRTCTexture2 = tRTCVideoFrame.texture;
        if (tRTCTexture2 != null) {
            EGLContext eGLContext3 = tRTCTexture2.eglContext10;
            if (eGLContext3 != null) {
                this.mEGLContext = eGLContext3;
            } else {
                this.mEGLContext = tRTCTexture2.eglContext14;
            }
        }
        if (z) {
            stopThread();
            startThread(tRTCVideoFrame);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int checkRotate(int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        int i2;
        if (tRTCVideoFrame != null && (i2 = tRTCVideoFrame.rotation) != 0) {
            int i3 = i2 * 90;
            if (this.mRotateFilter == null) {
                C14015h c14015h = new C14015h();
                c14015h.mo82796a();
                c14015h.m82793a(true);
                c14015h.mo82786a(tRTCVideoFrame.width, tRTCVideoFrame.height);
                this.mRotateFilter = c14015h;
            }
            C14015h c14015h2 = this.mRotateFilter;
            if (c14015h2 != null) {
                GLES20.glViewport(0, 0, tRTCVideoFrame.width, tRTCVideoFrame.height);
                int i4 = (720 - i3) % 360;
                c14015h2.mo82786a(tRTCVideoFrame.width, tRTCVideoFrame.height);
                int i5 = tRTCVideoFrame.width;
                int i6 = tRTCVideoFrame.height;
                c14015h2.m82787a(i5, i6, i4, null, i5 / i6, false, false);
                c14015h2.mo82798b(i);
                int iM82814l = c14015h2.m82814l();
                int i7 = (i4 == 90 || i4 == 270) ? tRTCVideoFrame.height : tRTCVideoFrame.width;
                int i8 = (i4 == 90 || i4 == 270) ? tRTCVideoFrame.width : tRTCVideoFrame.height;
                tRTCVideoFrame.width = i7;
                tRTCVideoFrame.height = i8;
                return iM82814l;
            }
        }
        return i;
    }

    private void sendCustomTextureInternal(final TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        synchronized (this) {
            try {
                if (this.mGLThreadHandler != null) {
                    GLES20.glFinish();
                    final HandlerC14014g handlerC14014g = this.mGLThreadHandler;
                    handlerC14014g.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.1
                        @Override // java.lang.Runnable
                        public void run() {
                            handlerC14014g.m82781d();
                            boolean z = handlerC14014g.f58159d;
                            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2 = tRTCVideoFrame;
                            if (z) {
                                TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame2.texture;
                                if (tRTCTexture != null) {
                                    tRTCTexture.textureId = TRTCCustomTextureUtil.this.checkRotate(tRTCTexture.textureId, tRTCVideoFrame2);
                                    C14107d c14107d = TRTCCustomTextureUtil.this.mCaptureAndEnc;
                                    TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame3 = tRTCVideoFrame;
                                    int i = tRTCVideoFrame3.texture.textureId;
                                    int i2 = tRTCVideoFrame3.width;
                                    int i3 = tRTCVideoFrame3.height;
                                    android.opengl.EGLContext eGLContextM82733e = handlerC14014g.f58160e.m82733e();
                                    TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame4 = tRTCVideoFrame;
                                    c14107d.m83466a(i, i2, i3, eGLContextM82733e, tRTCVideoFrame4.timestamp, tRTCVideoFrame4.rotation);
                                    return;
                                }
                                return;
                            }
                            TRTCCloudDef.TRTCTexture tRTCTexture2 = tRTCVideoFrame2.texture;
                            if (tRTCTexture2 != null) {
                                tRTCTexture2.textureId = TRTCCustomTextureUtil.this.checkRotate(tRTCTexture2.textureId, tRTCVideoFrame2);
                                C14107d c14107d2 = TRTCCustomTextureUtil.this.mCaptureAndEnc;
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame5 = tRTCVideoFrame;
                                int i4 = tRTCVideoFrame5.texture.textureId;
                                int i5 = tRTCVideoFrame5.width;
                                int i6 = tRTCVideoFrame5.height;
                                EGLContext eGLContextM82722d = handlerC14014g.f58162g.m82722d();
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame6 = tRTCVideoFrame;
                                c14107d2.m83466a(i4, i5, i6, eGLContextM82722d, tRTCVideoFrame6.timestamp, tRTCVideoFrame6.rotation);
                                return;
                            }
                            int i7 = tRTCVideoFrame2.pixelFormat == 1 ? 1 : 3;
                            if (TRTCCustomTextureUtil.this.mI4202RGBAFilter == null) {
                                C14083k c14083k = new C14083k(i7);
                                c14083k.m82793a(true);
                                if (!c14083k.mo82796a()) {
                                    TXCLog.m82966e(TRTCCustomTextureUtil.TAG, "mI4202RGBAFilter init failed!!, break init");
                                }
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame7 = tRTCVideoFrame;
                                c14083k.mo82786a(tRTCVideoFrame7.width, tRTCVideoFrame7.height);
                                TRTCCustomTextureUtil.this.mI4202RGBAFilter = c14083k;
                            }
                            C14083k c14083k2 = TRTCCustomTextureUtil.this.mI4202RGBAFilter;
                            if (c14083k2 == null) {
                                C14107d c14107d3 = TRTCCustomTextureUtil.this.mCaptureAndEnc;
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame8 = tRTCVideoFrame;
                                byte[] bArr = tRTCVideoFrame8.data;
                                int i8 = tRTCVideoFrame8.width;
                                int i9 = tRTCVideoFrame8.height;
                                EGLContext eGLContextM82722d2 = handlerC14014g.f58162g.m82722d();
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame9 = tRTCVideoFrame;
                                c14107d3.m83468a(bArr, i7, i8, i9, eGLContextM82722d2, tRTCVideoFrame9.timestamp, tRTCVideoFrame9.rotation);
                                return;
                            }
                            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame10 = tRTCVideoFrame;
                            GLES20.glViewport(0, 0, tRTCVideoFrame10.width, tRTCVideoFrame10.height);
                            c14083k2.m83137a(tRTCVideoFrame.data);
                            int iCheckRotate = TRTCCustomTextureUtil.this.checkRotate(c14083k2.m83138q(), tRTCVideoFrame);
                            C14107d c14107d4 = TRTCCustomTextureUtil.this.mCaptureAndEnc;
                            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame11 = tRTCVideoFrame;
                            int i10 = tRTCVideoFrame11.width;
                            int i11 = tRTCVideoFrame11.height;
                            EGLContext eGLContextM82722d3 = handlerC14014g.f58162g.m82722d();
                            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame12 = tRTCVideoFrame;
                            c14107d4.m83466a(iCheckRotate, i10, i11, eGLContextM82722d3, tRTCVideoFrame12.timestamp, tRTCVideoFrame12.rotation);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startThread(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this) {
            try {
                if (this.mEGLThread == null) {
                    HandlerThread handlerThread = new HandlerThread("customCaptureGLThread");
                    this.mEGLThread = handlerThread;
                    handlerThread.start();
                    this.mGLThreadHandler = new HandlerC14014g(this.mEGLThread.getLooper());
                    TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
                    if (tRTCTexture == null) {
                        apiLog("CustomCapture buffer start egl10 thread");
                        HandlerC14014g handlerC14014g = this.mGLThreadHandler;
                        handlerC14014g.f58159d = false;
                        handlerC14014g.f58163h = null;
                        handlerC14014g.f58156a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14014g.f58157b = 720;
                        handlerC14014g.sendEmptyMessage(100);
                    } else if (tRTCTexture.eglContext10 != null) {
                        apiLog("CustomCapture texture start egl10 thread");
                        HandlerC14014g handlerC14014g2 = this.mGLThreadHandler;
                        handlerC14014g2.f58159d = false;
                        handlerC14014g2.f58163h = tRTCVideoFrame.texture.eglContext10;
                        handlerC14014g2.f58156a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14014g2.f58157b = 720;
                        handlerC14014g2.sendEmptyMessage(100);
                    } else if (tRTCTexture.eglContext14 != null) {
                        apiLog("CustomCapture texture start egl14 thread");
                        HandlerC14014g handlerC14014g3 = this.mGLThreadHandler;
                        handlerC14014g3.f58159d = true;
                        handlerC14014g3.f58161f = tRTCVideoFrame.texture.eglContext14;
                        handlerC14014g3.f58156a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14014g3.f58157b = 720;
                        handlerC14014g3.sendEmptyMessage(100);
                    }
                    this.mGLThreadHandler.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TXCLog.m82969i(TRTCCustomTextureUtil.TAG, "GLContext create finished!");
                            countDownLatch.countDown();
                        }
                    });
                } else {
                    countDownLatch.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private synchronized void stopThread() {
        try {
            HandlerC14014g handlerC14014g = this.mGLThreadHandler;
            if (handlerC14014g != null) {
                final C14015h c14015h = this.mRotateFilter;
                this.mRotateFilter = null;
                final C14083k c14083k = this.mI4202RGBAFilter;
                this.mI4202RGBAFilter = null;
                handlerC14014g.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C14015h c14015h2 = c14015h;
                        if (c14015h2 != null) {
                            c14015h2.mo82806d();
                        }
                        C14083k c14083k2 = c14083k;
                        if (c14083k2 != null) {
                            c14083k2.mo82806d();
                        }
                        if (TRTCCustomTextureUtil.this.mCaptureAndEnc != null) {
                            TRTCCustomTextureUtil.this.apiLog("CustomCapture release");
                            TRTCCustomTextureUtil.this.mCaptureAndEnc.m83516p();
                        }
                    }
                });
                HandlerC14014g.m82771a(this.mGLThreadHandler, this.mEGLThread);
                apiLog("CustomCapture destroy egl thread");
            }
            this.mGLThreadHandler = null;
            this.mEGLThread = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void release() {
        stopThread();
    }

    public void sendCustomTexture(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        checkEGLContext(tRTCVideoFrame);
        sendCustomTextureInternal(tRTCVideoFrame);
    }
}
