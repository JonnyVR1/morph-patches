package com.idv.identity.service;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.idv.identity.base.algorithm.IDFrame;
import com.idv.identity.base.algorithm.IIdentityDelegate;
import com.idv.identity.base.algorithm.IdentityAlgConfig;
import com.idv.identity.base.algorithm.IdentityFaceAttr;
import com.idv.identity.service.algorithm.IdentityFace;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.cn2;
import p153l.dn2;
import p153l.dwq0;
import p153l.gfm;
import p153l.j4r0;
import p153l.jki;
import p153l.l0r0;
import p153l.muq0;
import p153l.o4r0;
import p153l.o6r0;
import p153l.ofm;
import p153l.qrq0;
import p153l.rxk;
import p153l.txq0;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityFaceService extends cn2 {
    public static final String ASSET_FACE_DET_MNN = "facedet_yolo.mnn";
    public static final String ASSET_FACE_QUALITY_SCORE = "face_qualityscore.mnn";
    private static final String TAG = "IdentityFaceService";
    private static final int desiredWidth = 480;
    private static long totalDropFrame;
    private Context cacheContext;
    private o4r0 cacheRunnable;
    private gfm mDebugToolIdentityFaceService;
    private final AtomicBoolean mImageProcessing = new AtomicBoolean(false);
    private HandlerThread mProcessThread = null;
    private Handler mCallbackThreadHandler = null;
    private Handler mProcessThreadHandler = null;
    private HandlerThread mCallbackThread = null;
    CopyOnWriteArrayList<gfm> identityFaceCallbacks = new CopyOnWriteArrayList<>();
    public boolean initResult = false;
    private final List<String> models = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public void configAndLoadModel(IdentityAlgConfig identityAlgConfig, IIdentityDelegate iIdentityDelegate) {
        dn2 dn2VarM167458b = ofm.m167458b("com.idv.identity.quality.QualityRouter");
        if (dn2VarM167458b != null) {
            this.models.addAll(dn2VarM167458b.getModel());
        } else {
            identityAlgConfig.isOpenQualityCheck = false;
        }
        dn2 dn2VarM167458b2 = ofm.m167458b("com.idv.identity.blink.BlinkRouter");
        if (dn2VarM167458b2 != null) {
            this.models.addAll(dn2VarM167458b2.getModel());
        } else if (identityAlgConfig.livenessCombinations.contains(IdentityAlgConfig.FACE_BLINK_LIVENESS)) {
            identityAlgConfig.livenessCombinations.replace(IdentityAlgConfig.FACE_BLINK_LIVENESS, "");
        }
        dn2 dn2VarM167458b3 = ofm.m167458b("com.aliyun.identity.mouth.MouthRouter");
        if (dn2VarM167458b3 != null) {
            this.models.addAll(dn2VarM167458b3.getModel());
        } else if (identityAlgConfig.livenessCombinations.contains(IdentityAlgConfig.OPEN_MOUTH_LIVENESS)) {
            identityAlgConfig.livenessCombinations.replace(IdentityAlgConfig.OPEN_MOUTH_LIVENESS, "");
        }
        boolean zCopyModelFromAssetsToData = copyModelFromAssetsToData(this.cacheContext, this.models);
        o6r0.m166282b(TAG, "Doc.init copyModelFromAssetsToData isSuc:" + zCopyModelFromAssetsToData);
        CopyOnWriteArrayList<gfm> copyOnWriteArrayList = this.identityFaceCallbacks;
        if (!zCopyModelFromAssetsToData) {
            Iterator<gfm> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo130085e("INIT_LOAD_MODEL_ERROR", null);
            }
            this.initResult = false;
            return;
        }
        Iterator<gfm> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo130085e("INIT_LOAD_MODEL_SUCCESS", null);
        }
        String str = this.cacheContext.getFilesDir() + File.separator;
        o6r0.m166281a("IdentityAlgConfig:" + identityAlgConfig.toString());
        IdentityFace.config(iIdentityDelegate, identityAlgConfig);
        this.initResult = IdentityFace.loadModelPath(str, 4);
    }

    private int setupWorkingThread() {
        if (this.mProcessThread == null) {
            rxk.m183550e(3000L);
            HandlerThread handlerThreadM183548c = rxk.m183548c("IdentityProcessQueue");
            this.mProcessThread = handlerThreadM183548c;
            if (handlerThreadM183548c.getState() == Thread.State.NEW) {
                this.mProcessThread.start();
            }
            if (this.mProcessThread == null) {
                return -1;
            }
        }
        if (this.mProcessThreadHandler == null) {
            if (this.mProcessThread.getLooper() == null) {
                this.mProcessThread = rxk.m183548c("IdentityProcessQueue" + hashCode());
            }
            this.mProcessThreadHandler = new Handler(this.mProcessThread.getLooper());
        }
        if (this.mCallbackThread == null) {
            HandlerThread handlerThread = new HandlerThread("IdentityCallbackQueue");
            this.mCallbackThread = handlerThread;
            handlerThread.start();
            if (this.mCallbackThread == null) {
                return -3;
            }
        }
        if (this.mCallbackThreadHandler != null) {
            return 0;
        }
        this.mCallbackThreadHandler = new dwq0(this.mCallbackThread.getLooper());
        return 0;
    }

    @Override // p153l.cn2
    public boolean config(IdentityAlgConfig identityAlgConfig) {
        Handler handler = this.mProcessThreadHandler;
        if (handler == null) {
            return true;
        }
        handler.post(new txq0(this, identityAlgConfig, this));
        return true;
    }

    public boolean copyModelFromAssetsToData(Context context, List<String> list) {
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!jki.m145846a(context, it.next())) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            o6r0.m166283c(TAG + e.getMessage());
            return false;
        }
    }

    @Override // p153l.cn2
    public void finishPhotinus() {
        Handler handler = this.mProcessThreadHandler;
        if (handler != null) {
            handler.post(new muq0());
        }
    }

    @Override // p153l.cn2, com.idv.identity.base.algorithm.IIdentityDelegate
    public void handleCaptureCompleted(int i, Map<String, Object> map) {
        Handler handler = this.mCallbackThreadHandler;
        if (handler != null) {
            handler.post(new RunnableC3878d(this, i, map));
        }
    }

    @Override // p153l.cn2, com.idv.identity.base.algorithm.IIdentityDelegate
    public void handleEventStated(int i) {
        this.mCallbackThreadHandler.post(new RunnableC3875a(this, i));
    }

    @Override // p153l.cn2, com.idv.identity.base.algorithm.IIdentityDelegate
    public void handleInfoReady(IDFrame iDFrame) {
        this.mCallbackThreadHandler.postAtFrontOfQueue(new RunnableC3876b(this, iDFrame));
    }

    @Override // p153l.cn2, com.idv.identity.base.algorithm.IIdentityDelegate
    public void handleStateUpdated(int i, IdentityFaceAttr identityFaceAttr) {
        Handler handler = this.mCallbackThreadHandler;
        if (handler != null) {
            handler.post(new RunnableC3877c(this, i, identityFaceAttr));
        }
    }

    @Override // p153l.cn2
    public boolean init(Context context, IdentityAlgConfig identityAlgConfig, gfm gfmVar) {
        if (setupWorkingThread() != 0) {
            return false;
        }
        this.models.add(ASSET_FACE_DET_MNN);
        this.models.add(ASSET_FACE_QUALITY_SCORE);
        this.cacheContext = context.getApplicationContext();
        this.identityFaceCallbacks.add(gfmVar);
        gfm gfmVar2 = (gfm) ofm.m167457a("com.idv.identity.tools.DebugToolIdentityFaceService", gfm.class);
        this.mDebugToolIdentityFaceService = gfmVar2;
        if (gfmVar2 != null) {
            this.identityFaceCallbacks.add(gfmVar2);
        }
        boolean zLoadLibrary = IdentityFace.loadLibrary(context);
        this.initResult = zLoadLibrary;
        if (zLoadLibrary) {
            return config(identityAlgConfig);
        }
        Iterator<gfm> it = this.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().mo130085e("INIT_LOAD_SO_ERROR", null);
        }
        this.initResult = false;
        return false;
    }

    @Override // p153l.cn2
    public void preProcess() {
        Iterator<gfm> it = this.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().preProcess();
        }
    }

    @Override // p153l.cn2
    public boolean processImage(IDFrame iDFrame) {
        if (this.initResult && this.mImageProcessing.compareAndSet(false, true)) {
            try {
                Handler handler = this.mProcessThreadHandler;
                if (handler != null) {
                    if (this.cacheRunnable == null) {
                        this.cacheRunnable = new l0r0(this, iDFrame);
                    }
                    o4r0 o4r0Var = this.cacheRunnable;
                    o4r0Var.f145005a = iDFrame;
                    handler.post(o4r0Var);
                }
            } catch (Exception unused) {
                return false;
            }
        } else {
            totalDropFrame++;
        }
        return true;
    }

    @Override // p153l.cn2
    public void registerIdentityFaceCallback(gfm gfmVar) {
        this.identityFaceCallbacks.add(gfmVar);
    }

    @Override // p153l.cn2
    public void release() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Handler handler = this.mProcessThreadHandler;
        if (handler != null) {
            handler.post(new qrq0(this));
            this.mProcessThreadHandler.removeCallbacksAndMessages(null);
            this.mProcessThreadHandler = null;
        }
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            HandlerThread handlerThread = this.mProcessThread;
            if (handlerThread != null) {
                rxk.m183549d(handlerThread);
                this.mProcessThread = null;
            }
            HandlerThread handlerThread2 = this.mCallbackThread;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.mCallbackThread = null;
            }
            Handler handler2 = this.mCallbackThreadHandler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.mCallbackThreadHandler = null;
            }
        } catch (Exception unused) {
        }
        this.mImageProcessing.set(false);
        this.cacheRunnable = null;
        this.identityFaceCallbacks.clear();
        totalDropFrame = 0L;
    }

    @Override // p153l.cn2
    public void removeIdentityFaceCallback(gfm gfmVar) {
        this.identityFaceCallbacks.remove(gfmVar);
    }

    @Override // com.idv.identity.base.algorithm.IIdentityDelegate
    public void reset() {
        Handler handler = this.mProcessThreadHandler;
        if (handler != null) {
            handler.post(new j4r0());
        }
    }

    @Override // p153l.cn2
    public boolean setFarNeatAction(boolean z) {
        IdentityFace.setFarNeatAction(z);
        return z;
    }
}
