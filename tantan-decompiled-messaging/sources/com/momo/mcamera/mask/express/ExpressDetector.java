package com.momo.mcamera.mask.express;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.core.glcore.util.XEEngineHelper;
import com.momo.mcamera.mask.detect.IPatternDetect;
import com.momo.xeengine.p044cv.bean.CVExpressInfo;
import com.momocv.express.Express;
import com.momocv.express.ExpressInfo;
import com.momocv.express.SingleExpressInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.fpx;
import p149l.mkw;
import p149l.pjw;
import p149l.vjw;
import p149l.xxx;

/* JADX INFO: loaded from: classes7.dex */
public class ExpressDetector implements IPatternDetect {
    private ByteBuffer curByteBuffer;
    private ExpressThread detectThread;
    private Express express;
    private String expressModelPath;
    private IPatternDetect.ExpressDetectListener listener;
    private boolean running;
    private vjw mmFrame = new vjw();
    private mkw paramsInfo = new mkw(6);
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
            this.mmFrame.m198694g(bArrArray);
            this.mmFrame.m198693f(bArrArray.length);
            this.express.ProcessFrame(this.mmFrame.m198689b(), this.paramsInfo.m155080b(), this.expressInfo);
            SingleExpressInfo[] singleExpressInfoArr = this.expressInfo.express_infos_;
            if (singleExpressInfoArr != null && singleExpressInfoArr.length > 0 && fpx.m122681a()) {
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
        xxx.m211572F().m211605d0(SystemClock.elapsedRealtime() - jElapsedRealtime);
        SystemClock.sleep(200L);
        this.isDetecting.set(false);
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect
    public void setExpressDetectListener(IPatternDetect.ExpressDetectListener expressDetectListener) {
        this.listener = expressDetectListener;
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect
    public void setMMCVInfo(pjw pjwVar) {
        if (this.isDetecting.get()) {
            return;
        }
        this.mmFrame.m198695h(17);
        this.mmFrame.m198700m(pjwVar.f149898e);
        this.mmFrame.m198697j(pjwVar.f149899f);
        this.mmFrame.m198699l(pjwVar.f149898e);
        this.curByteBuffer = ByteBuffer.wrap(pjwVar.f149900g);
        this.paramsInfo.m155094p(pjwVar.f149894a);
        this.paramsInfo.m155066A(pjwVar.f149895b);
        this.paramsInfo.m155104z(pjwVar.f149896c);
        this.paramsInfo.m155099u(pjwVar.m169951o());
        this.paramsInfo.m155100v(pjwVar.m169952p());
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
