package com.momo.mcamera.mask.gesture;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.core.glcore.p024cv.MMCVBoxes;
import com.core.glcore.util.CVObjectHelper;
import com.core.glcore.yuvutil.YuvTools;
import com.momocv.MMBox;
import com.momocv.objectdetect.ObjectDetectInfo;
import com.momocv.objectdetect.ObjectDetectParams;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.c950;
import p153l.cyx;
import p153l.omw;
import p153l.u6y;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class GestureDetector extends CVDetector {
    private int cameraDegree;
    private ByteBuffer curByteBuffer;
    GestureDetectThread detectThread;
    private int height;
    private boolean isFrontCamera;
    private RenderHandler mCallbackRenderHandler;
    private omw mmcvInfo;
    private ObjectDetectInfo objectDetectInfo;
    private boolean running;
    private int width;
    private int detectInterval = 300;
    private umw mmFrame = new umw();
    private ObjectDetectParams detectParams = new ObjectDetectParams();
    private int dataFormatType = 17;
    private Object waitSignal = new Object();
    private Object startSync = new Object();
    private AtomicBoolean isDetecting = new AtomicBoolean(false);

    public final class GestureDetectThread extends Thread {
        public GestureDetectThread() {
            super("GestureDetect");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            GestureDetector.this.running = true;
            try {
                synchronized (GestureDetector.this.waitSignal) {
                    while (GestureDetector.this.running) {
                        try {
                            GestureDetector.this.waitSignal.wait();
                            GestureDetector.this.detectGesture();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                GestureDetector.this.curByteBuffer.clear();
                GestureDetector.this.curByteBuffer = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class RenderHandler extends Handler {
        public RenderHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CVDetector.GestureDetectorListener gestureDetectorListener = GestureDetector.this.gestureDetectorListener;
            if (gestureDetectorListener != null) {
                gestureDetectorListener.gestureDetect((MMCVBoxes) message.obj);
            }
        }
    }

    public GestureDetector(CVDetector.GestureDetectorListener gestureDetectorListener) {
        this.gestureDetectorListener = gestureDetectorListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void detectGesture() {
        this.isDetecting.set(true);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MMCVBoxes mMCVBoxes = new MMCVBoxes();
        byte[] bArrArray = this.curByteBuffer.array();
        if (this.dataFormatType == 4) {
            bArrArray = YuvTools.m7383a(this.curByteBuffer.array(), this.width, this.height, null);
            this.dataFormatType = 17;
        }
        this.mmFrame.m196802h(this.dataFormatType);
        this.mmFrame.m196806l(this.width);
        this.mmFrame.m196807m(this.width);
        this.mmFrame.m196804j(this.height);
        this.mmFrame.m196801g(bArrArray);
        this.mmFrame.m196800f(bArrArray.length);
        ObjectDetectParams objectDetectParams = this.detectParams;
        objectDetectParams.rotate_degree_ = this.cameraDegree;
        objectDetectParams.fliped_show_ = this.isFrontCamera;
        this.objectDetectInfo = new ObjectDetectInfo();
        this.mmcvInfo.m168285B(this.detectParams);
        c950.m108407b().m108411e(this.mmFrame.m196796b(), this.detectParams, this.objectDetectInfo);
        omw omwVar = this.mmcvInfo;
        ObjectDetectInfo objectDetectInfo = this.objectDetectInfo;
        omwVar.f148009G = objectDetectInfo;
        mMCVBoxes.setDetectResult(objectDetectInfo.detect_results_);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        uploadGestureInfo(this.objectDetectInfo.detect_results_, jElapsedRealtime2);
        u6y.m194722F().m194765i0(jElapsedRealtime2);
        if (cyx.m113254a()) {
            CVObjectHelper.transObjectInfos(this.objectDetectInfo.detect_results_);
        }
        int i = this.detectInterval;
        if (i > 0) {
            SystemClock.sleep(i);
        }
        this.isDetecting.set(false);
        this.curByteBuffer.clear();
        Message message = new Message();
        message.obj = mMCVBoxes;
        RenderHandler renderHandler = this.mCallbackRenderHandler;
        if (renderHandler != null) {
            renderHandler.sendMessage(message);
        }
    }

    private void uploadGestureInfo(MMBox[] mMBoxArr, long j) {
        long j2;
        if (mMBoxArr == null || mMBoxArr.length <= 0) {
            return;
        }
        int length = mMBoxArr.length;
        int i = 0;
        while (i < length) {
            MMBox mMBox = mMBoxArr[i];
            String str = mMBox.class_name_;
            if (mMBox.class_index_ <= 0 || TextUtils.isEmpty(str)) {
                j2 = j;
            } else {
                j2 = j;
                u6y.m194722F().m194767j0(str, j2, System.currentTimeMillis());
            }
            i++;
            j = j2;
        }
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void cancel() {
        this.gestureDetectorListener = null;
        this.running = false;
        ByteBuffer byteBuffer = this.curByteBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        GestureDetectThread gestureDetectThread = this.detectThread;
        if (gestureDetectThread != null) {
            try {
                gestureDetectThread.interrupt();
            } catch (Exception unused) {
            }
        }
        this.detectThread = null;
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void setDetectInterval(int i) {
        this.detectInterval = i;
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void setGestureDetectorListener(CVDetector.GestureDetectorListener gestureDetectorListener) {
        this.gestureDetectorListener = gestureDetectorListener;
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void setMMCVInfo(omw omwVar) {
        if (this.isDetecting.get() || omwVar.f148020g == null) {
            return;
        }
        this.width = omwVar.f148018e;
        this.height = omwVar.f148019f;
        this.isFrontCamera = omwVar.f148014a;
        this.cameraDegree = omwVar.f148015b;
        this.dataFormatType = omwVar.m168293e();
        this.curByteBuffer = ByteBuffer.wrap(omwVar.f148020g);
        this.mmcvInfo = omwVar;
        synchronized (this.waitSignal) {
            this.waitSignal.notify();
        }
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void startDetect() {
        c950.m108407b().m108409a();
        synchronized (this.startSync) {
            try {
                if (this.detectThread == null) {
                    this.running = true;
                    GestureDetectThread gestureDetectThread = new GestureDetectThread();
                    this.detectThread = gestureDetectThread;
                    gestureDetectThread.setPriority(1);
                    this.detectThread.start();
                    if (this.mCallbackRenderHandler == null) {
                        this.mCallbackRenderHandler = new RenderHandler(Looper.myLooper());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void stopDetect() {
        cancel();
        this.detectThread = null;
        c950.m108407b().m108412f();
    }
}
