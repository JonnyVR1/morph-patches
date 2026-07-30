package com.momo.mcamera.mask.gesture;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.core.glcore.p023cv.MMCVBoxes;
import com.core.glcore.util.CVObjectHelper;
import com.core.glcore.yuvutil.YuvTools;
import com.momocv.MMBox;
import com.momocv.objectdetect.ObjectDetectInfo;
import com.momocv.objectdetect.ObjectDetectParams;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.fpx;
import p149l.n050;
import p149l.pjw;
import p149l.vjw;
import p149l.xxx;

/* JADX INFO: loaded from: classes7.dex */
public class GestureDetector extends CVDetector {
    private int cameraDegree;
    private ByteBuffer curByteBuffer;
    GestureDetectThread detectThread;
    private int height;
    private boolean isFrontCamera;
    private RenderHandler mCallbackRenderHandler;
    private pjw mmcvInfo;
    private ObjectDetectInfo objectDetectInfo;
    private boolean running;
    private int width;
    private int detectInterval = 300;
    private vjw mmFrame = new vjw();
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
            bArrArray = YuvTools.m7329a(this.curByteBuffer.array(), this.width, this.height, null);
            this.dataFormatType = 17;
        }
        this.mmFrame.m198695h(this.dataFormatType);
        this.mmFrame.m198699l(this.width);
        this.mmFrame.m198700m(this.width);
        this.mmFrame.m198697j(this.height);
        this.mmFrame.m198694g(bArrArray);
        this.mmFrame.m198693f(bArrArray.length);
        ObjectDetectParams objectDetectParams = this.detectParams;
        objectDetectParams.rotate_degree_ = this.cameraDegree;
        objectDetectParams.fliped_show_ = this.isFrontCamera;
        this.objectDetectInfo = new ObjectDetectInfo();
        this.mmcvInfo.m169936B(this.detectParams);
        n050.m157240b().m157244e(this.mmFrame.m198689b(), this.detectParams, this.objectDetectInfo);
        pjw pjwVar = this.mmcvInfo;
        ObjectDetectInfo objectDetectInfo = this.objectDetectInfo;
        pjwVar.f149889G = objectDetectInfo;
        mMCVBoxes.setDetectResult(objectDetectInfo.detect_results_);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        uploadGestureInfo(this.objectDetectInfo.detect_results_, jElapsedRealtime2);
        xxx.m211572F().m211615i0(jElapsedRealtime2);
        if (fpx.m122681a()) {
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
                xxx.m211572F().m211617j0(str, j2, System.currentTimeMillis());
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
    public void setMMCVInfo(pjw pjwVar) {
        if (this.isDetecting.get() || pjwVar.f149900g == null) {
            return;
        }
        this.width = pjwVar.f149898e;
        this.height = pjwVar.f149899f;
        this.isFrontCamera = pjwVar.f149894a;
        this.cameraDegree = pjwVar.f149895b;
        this.dataFormatType = pjwVar.m169944e();
        this.curByteBuffer = ByteBuffer.wrap(pjwVar.f149900g);
        this.mmcvInfo = pjwVar;
        synchronized (this.waitSignal) {
            this.waitSignal.notify();
        }
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void startDetect() {
        n050.m157240b().m157242a();
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
        n050.m157240b().m157245f();
    }
}
