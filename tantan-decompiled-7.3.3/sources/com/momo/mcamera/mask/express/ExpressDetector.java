package com.momo.mcamera.mask.express;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.core.glcore.util.XEEngineHelper;
import com.momo.mcamera.mask.detect.IPatternDetect;
import com.momo.xeengine.p049cv.bean.CVExpressInfo;
import com.momocv.express.Express;
import com.momocv.express.ExpressInfo;
import com.momocv.express.SingleExpressInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.cyx;
import p153l.lnw;
import p153l.omw;
import p153l.u6y;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class ExpressDetector implements IPatternDetect {
    private ByteBuffer curByteBuffer;
    private ExpressThread detectThread;
    private Express express;
    private String expressModelPath;
    private IPatternDetect.ExpressDetectListener listener;
    private boolean running;
    private umw mmFrame = new umw();
    private lnw paramsInfo = new lnw(6);
    private ExpressInfo expressInfo = new ExpressInfo();
    private Object waitSignal = new Object();
    private Object startSync = new Object();
    private AtomicBoolean isDetecting = new AtomicBoolean(false);

    public class ExpressThread extends Thread {
        public ExpressThread(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            ExpressDetector.this.running = true;
            try {
                synchronized (ExpressDetector.this.waitSignal) {
                    while (ExpressDetector.this.running) {
                        try {
                            ExpressDetector.this.waitSignal.wait();
                            ExpressDetector.this.detect();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ExpressDetector.this.curByteBuffer.clear();
                ExpressDetector.this.curByteBuffer = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect
    public void detect() {
        this.isDetecting.set(true);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.express == null && !TextUtils.isEmpty(this.expressModelPath)) {
            Express express = new Express();
            this.express = express;
            express.LoadModel(this.expressModelPath);
        }
        if (this.express != null) {
            byte[] bArrArray = this.curByteBuffer.array();
            this.mmFrame.m196801g(bArrArray);
            this.mmFrame.m196800f(bArrArray.length);
            this.express.ProcessFrame(this.mmFrame.m196796b(), this.paramsInfo.m155007b(), this.expressInfo);
            SingleExpressInfo[] singleExpressInfoArr = this.expressInfo.express_infos_;
            if (singleExpressInfoArr != null && singleExpressInfoArr.length > 0 && cyx.m113254a()) {
                ArrayList arrayList = new ArrayList();
                for (SingleExpressInfo singleExpressInfo : this.expressInfo.express_infos_) {
                    CVExpressInfo cVExpressInfo = new CVExpressInfo();
                    cVExpressInfo.setHead(singleExpressInfo.head_);
                    cVExpressInfo.setLeftEye(singleExpressInfo.lefteye_);
                    cVExpressInfo.setRightEye(singleExpressInfo.righteye_);
                    cVExpressInfo.setMouth(singleExpressInfo.mouth_);
                    cVExpressInfo.setNeck(singleExpressInfo.neck_);
                    arrayList.add(cVExpressInfo);
                }
                IPatternDetect.ExpressDetectListener expressDetectListener = this.listener;
                if (expressDetectListener != null) {
                    expressDetectListener.onExpressDetect(this.expressInfo);
                }
                XEEngineHelper.setExpressionInfos(arrayList);
            }
        }
        u6y.m194722F().m194755d0(SystemClock.elapsedRealtime() - jElapsedRealtime);
        SystemClock.sleep(200L);
        this.isDetecting.set(false);
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect
    public void setExpressDetectListener(IPatternDetect.ExpressDetectListener expressDetectListener) {
        this.listener = expressDetectListener;
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect
    public void setMMCVInfo(omw omwVar) {
        if (this.isDetecting.get()) {
            return;
        }
        this.mmFrame.m196802h(17);
        this.mmFrame.m196807m(omwVar.f148018e);
        this.mmFrame.m196804j(omwVar.f148019f);
        this.mmFrame.m196806l(omwVar.f148018e);
        this.curByteBuffer = ByteBuffer.wrap(omwVar.f148020g);
        this.paramsInfo.m155021p(omwVar.f148014a);
        this.paramsInfo.m154993A(omwVar.f148015b);
        this.paramsInfo.m155031z(omwVar.f148016c);
        this.paramsInfo.m155026u(omwVar.m168300o());
        this.paramsInfo.m155027v(omwVar.m168301p());
        synchronized (this.waitSignal) {
            this.waitSignal.notify();
        }
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect
    public void setModelPath(String str) {
        this.expressModelPath = str;
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect
    public void startDetect() {
        synchronized (this.startSync) {
            try {
                if (this.detectThread == null) {
                    this.running = true;
                    ExpressThread expressThread = new ExpressThread("ExpressDetect");
                    this.detectThread = expressThread;
                    expressThread.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect
    public void stopDetect() {
        this.running = false;
        ByteBuffer byteBuffer = this.curByteBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ExpressThread expressThread = this.detectThread;
        if (expressThread != null) {
            try {
                expressThread.interrupt();
            } catch (Exception unused) {
            }
            this.detectThread = null;
        }
        Express express = this.express;
        if (express != null) {
            express.Release();
            this.express = null;
        }
    }
}
