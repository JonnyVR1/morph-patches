package com.tencent.liteav.trtc.impl;

import android.opengl.GLES20;
import android.os.HandlerThread;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.C14270d;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.HandlerC14177g;
import com.tencent.liteav.beauty.p098b.C14246k;
import com.tencent.trtc.TRTCCloudDef;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes2.dex */
public class TRTCCustomTextureUtil {
    private static final String TAG = "TRTCCustomTextureUtil";
    private C14270d mCaptureAndEnc;
    private long mLastGLThreadId;
    private C14178h mRotateFilter;
    private HandlerC14177g mGLThreadHandler = null;
    private HandlerThread mEGLThread = null;
    private Object mEGLContext = null;
    private C14246k mI4202RGBAFilter = null;

    public TRTCCustomTextureUtil(C14270d c14270d) {
        this.mCaptureAndEnc = c14270d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void apiLog(String str) {
        TXCLog.m84152i(TAG, "trtc_api " + str);
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
                C14178h c14178h = new C14178h();
                c14178h.mo83979a();
                c14178h.m83976a(true);
                c14178h.mo83969a(tRTCVideoFrame.width, tRTCVideoFrame.height);
                this.mRotateFilter = c14178h;
            }
            C14178h c14178h2 = this.mRotateFilter;
            if (c14178h2 != null) {
                GLES20.glViewport(0, 0, tRTCVideoFrame.width, tRTCVideoFrame.height);
                int i4 = (720 - i3) % 360;
                c14178h2.mo83969a(tRTCVideoFrame.width, tRTCVideoFrame.height);
                int i5 = tRTCVideoFrame.width;
                int i6 = tRTCVideoFrame.height;
                c14178h2.m83970a(i5, i6, i4, null, i5 / i6, false, false);
                c14178h2.mo83981b(i);
                int iM83997l = c14178h2.m83997l();
                int i7 = (i4 == 90 || i4 == 270) ? tRTCVideoFrame.height : tRTCVideoFrame.width;
                int i8 = (i4 == 90 || i4 == 270) ? tRTCVideoFrame.width : tRTCVideoFrame.height;
                tRTCVideoFrame.width = i7;
                tRTCVideoFrame.height = i8;
                return iM83997l;
            }
        }
        return i;
    }

    private void sendCustomTextureInternal(final TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        synchronized (this) {
            try {
                if (this.mGLThreadHandler != null) {
                    GLES20.glFinish();
                    final HandlerC14177g handlerC14177g = this.mGLThreadHandler;
                    handlerC14177g.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.1
                        @Override // java.lang.Runnable
                        public void run() {
                            handlerC14177g.m83964d();
                            boolean z = handlerC14177g.f59007d;
                            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2 = tRTCVideoFrame;
                            if (z) {
                                TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame2.texture;
                                if (tRTCTexture != null) {
                                    tRTCTexture.textureId = TRTCCustomTextureUtil.this.checkRotate(tRTCTexture.textureId, tRTCVideoFrame2);
                                    C14270d c14270d = TRTCCustomTextureUtil.this.mCaptureAndEnc;
                                    TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame3 = tRTCVideoFrame;
                                    int i = tRTCVideoFrame3.texture.textureId;
                                    int i2 = tRTCVideoFrame3.width;
                                    int i3 = tRTCVideoFrame3.height;
                                    android.opengl.EGLContext eGLContextM83916e = handlerC14177g.f59008e.m83916e();
                                    TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame4 = tRTCVideoFrame;
                                    c14270d.m84649a(i, i2, i3, eGLContextM83916e, tRTCVideoFrame4.timestamp, tRTCVideoFrame4.rotation);
                                    return;
                                }
                                return;
                            }
                            TRTCCloudDef.TRTCTexture tRTCTexture2 = tRTCVideoFrame2.texture;
                            if (tRTCTexture2 != null) {
                                tRTCTexture2.textureId = TRTCCustomTextureUtil.this.checkRotate(tRTCTexture2.textureId, tRTCVideoFrame2);
                                C14270d c14270d2 = TRTCCustomTextureUtil.this.mCaptureAndEnc;
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame5 = tRTCVideoFrame;
                                int i4 = tRTCVideoFrame5.texture.textureId;
                                int i5 = tRTCVideoFrame5.width;
                                int i6 = tRTCVideoFrame5.height;
                                EGLContext eGLContextM83905d = handlerC14177g.f59010g.m83905d();
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame6 = tRTCVideoFrame;
                                c14270d2.m84649a(i4, i5, i6, eGLContextM83905d, tRTCVideoFrame6.timestamp, tRTCVideoFrame6.rotation);
                                return;
                            }
                            int i7 = tRTCVideoFrame2.pixelFormat == 1 ? 1 : 3;
                            if (TRTCCustomTextureUtil.this.mI4202RGBAFilter == null) {
                                C14246k c14246k = new C14246k(i7);
                                c14246k.m83976a(true);
                                if (!c14246k.mo83979a()) {
                                    TXCLog.m84149e(TRTCCustomTextureUtil.TAG, "mI4202RGBAFilter init failed!!, break init");
                                }
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame7 = tRTCVideoFrame;
                                c14246k.mo83969a(tRTCVideoFrame7.width, tRTCVideoFrame7.height);
                                TRTCCustomTextureUtil.this.mI4202RGBAFilter = c14246k;
                            }
                            C14246k c14246k2 = TRTCCustomTextureUtil.this.mI4202RGBAFilter;
                            if (c14246k2 == null) {
                                C14270d c14270d3 = TRTCCustomTextureUtil.this.mCaptureAndEnc;
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame8 = tRTCVideoFrame;
                                byte[] bArr = tRTCVideoFrame8.data;
                                int i8 = tRTCVideoFrame8.width;
                                int i9 = tRTCVideoFrame8.height;
                                EGLContext eGLContextM83905d2 = handlerC14177g.f59010g.m83905d();
                                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame9 = tRTCVideoFrame;
                                c14270d3.m84651a(bArr, i7, i8, i9, eGLContextM83905d2, tRTCVideoFrame9.timestamp, tRTCVideoFrame9.rotation);
                                return;
                            }
                            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame10 = tRTCVideoFrame;
                            GLES20.glViewport(0, 0, tRTCVideoFrame10.width, tRTCVideoFrame10.height);
                            c14246k2.m84320a(tRTCVideoFrame.data);
                            int iCheckRotate = TRTCCustomTextureUtil.this.checkRotate(c14246k2.m84321q(), tRTCVideoFrame);
                            C14270d c14270d4 = TRTCCustomTextureUtil.this.mCaptureAndEnc;
                            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame11 = tRTCVideoFrame;
                            int i10 = tRTCVideoFrame11.width;
                            int i11 = tRTCVideoFrame11.height;
                            EGLContext eGLContextM83905d3 = handlerC14177g.f59010g.m83905d();
                            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame12 = tRTCVideoFrame;
                            c14270d4.m84649a(iCheckRotate, i10, i11, eGLContextM83905d3, tRTCVideoFrame12.timestamp, tRTCVideoFrame12.rotation);
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
                    this.mGLThreadHandler = new HandlerC14177g(this.mEGLThread.getLooper());
                    TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
                    if (tRTCTexture == null) {
                        apiLog("CustomCapture buffer start egl10 thread");
                        HandlerC14177g handlerC14177g = this.mGLThreadHandler;
                        handlerC14177g.f59007d = false;
                        handlerC14177g.f59011h = null;
                        handlerC14177g.f59004a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14177g.f59005b = 720;
                        handlerC14177g.sendEmptyMessage(100);
                    } else if (tRTCTexture.eglContext10 != null) {
                        apiLog("CustomCapture texture start egl10 thread");
                        HandlerC14177g handlerC14177g2 = this.mGLThreadHandler;
                        handlerC14177g2.f59007d = false;
                        handlerC14177g2.f59011h = tRTCVideoFrame.texture.eglContext10;
                        handlerC14177g2.f59004a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14177g2.f59005b = 720;
                        handlerC14177g2.sendEmptyMessage(100);
                    } else if (tRTCTexture.eglContext14 != null) {
                        apiLog("CustomCapture texture start egl14 thread");
                        HandlerC14177g handlerC14177g3 = this.mGLThreadHandler;
                        handlerC14177g3.f59007d = true;
                        handlerC14177g3.f59009f = tRTCVideoFrame.texture.eglContext14;
                        handlerC14177g3.f59004a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14177g3.f59005b = 720;
                        handlerC14177g3.sendEmptyMessage(100);
                    }
                    this.mGLThreadHandler.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TXCLog.m84152i(TRTCCustomTextureUtil.TAG, "GLContext create finished!");
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
            HandlerC14177g handlerC14177g = this.mGLThreadHandler;
            if (handlerC14177g != null) {
                final C14178h c14178h = this.mRotateFilter;
                this.mRotateFilter = null;
                final C14246k c14246k = this.mI4202RGBAFilter;
                this.mI4202RGBAFilter = null;
                handlerC14177g.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C14178h c14178h2 = c14178h;
                        if (c14178h2 != null) {
                            c14178h2.mo83989d();
                        }
                        C14246k c14246k2 = c14246k;
                        if (c14246k2 != null) {
                            c14246k2.mo83989d();
                        }
                        if (TRTCCustomTextureUtil.this.mCaptureAndEnc != null) {
                            TRTCCustomTextureUtil.this.apiLog("CustomCapture release");
                            TRTCCustomTextureUtil.this.mCaptureAndEnc.m84699p();
                        }
                    }
                });
                HandlerC14177g.m83954a(this.mGLThreadHandler, this.mEGLThread);
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
