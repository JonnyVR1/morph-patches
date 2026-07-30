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
import p149l.bvk;
import p149l.dvq0;
import p149l.frq0;
import p149l.glq0;
import p149l.ivq0;
import p149l.ixq0;
import p149l.liq0;
import p149l.mhi;
import p149l.noq0;
import p149l.qcm;
import p149l.vm2;
import p149l.wm2;
import p149l.xmq0;
import p149l.ycm;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityFaceService extends vm2 {
    public static final String ASSET_FACE_DET_MNN = "facedet_yolo.mnn";
    public static final String ASSET_FACE_QUALITY_SCORE = "face_qualityscore.mnn";
    private static final String TAG = "IdentityFaceService";
    private static final int desiredWidth = 480;
    private static long totalDropFrame;
    private Context cacheContext;
    private ivq0 cacheRunnable;
    private qcm mDebugToolIdentityFaceService;
    private final AtomicBoolean mImageProcessing = new AtomicBoolean(false);
    private HandlerThread mProcessThread = null;
    private Handler mCallbackThreadHandler = null;
    private Handler mProcessThreadHandler = null;
    private HandlerThread mCallbackThread = null;
    CopyOnWriteArrayList<qcm> identityFaceCallbacks = new CopyOnWriteArrayList<>();
    public boolean initResult = false;
    private final List<String> models = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public void configAndLoadModel(IdentityAlgConfig identityAlgConfig, IIdentityDelegate iIdentityDelegate) {
        wm2 wm2VarM214161b = ycm.m214161b("com.idv.identity.quality.QualityRouter");
        if (wm2VarM214161b != null) {
            this.models.addAll(wm2VarM214161b.getModel());
        } else {
            identityAlgConfig.isOpenQualityCheck = false;
        }
        wm2 wm2VarM214161b2 = ycm.m214161b("com.idv.identity.blink.BlinkRouter");
        if (wm2VarM214161b2 != null) {
            this.models.addAll(wm2VarM214161b2.getModel());
        } else if (identityAlgConfig.livenessCombinations.contains(IdentityAlgConfig.FACE_BLINK_LIVENESS)) {
            identityAlgConfig.livenessCombinations.replace(IdentityAlgConfig.FACE_BLINK_LIVENESS, "");
        }
        wm2 wm2VarM214161b3 = ycm.m214161b("com.aliyun.identity.mouth.MouthRouter");
        if (wm2VarM214161b3 != null) {
            this.models.addAll(wm2VarM214161b3.getModel());
        } else if (identityAlgConfig.livenessCombinations.contains(IdentityAlgConfig.OPEN_MOUTH_LIVENESS)) {
            identityAlgConfig.livenessCombinations.replace(IdentityAlgConfig.OPEN_MOUTH_LIVENESS, "");
        }
        boolean zCopyModelFromAssetsToData = copyModelFromAssetsToData(this.cacheContext, this.models);
        ixq0.m138885b(TAG, "Doc.init copyModelFromAssetsToData isSuc:" + zCopyModelFromAssetsToData);
        CopyOnWriteArrayList<qcm> copyOnWriteArrayList = this.identityFaceCallbacks;
        if (!zCopyModelFromAssetsToData) {
            Iterator<qcm> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo173884e("INIT_LOAD_MODEL_ERROR", null);
            }
            this.initResult = false;
            return;
        }
        Iterator<qcm> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo173884e("INIT_LOAD_MODEL_SUCCESS", null);
        }
        String str = this.cacheContext.getFilesDir() + File.separator;
        ixq0.m138884a("IdentityAlgConfig:" + identityAlgConfig.toString());
        IdentityFace.config(iIdentityDelegate, identityAlgConfig);
        this.initResult = IdentityFace.loadModelPath(str, 4);
    }

    private int setupWorkingThread() {
        if (this.mProcessThread == null) {
            bvk.m104048e(3000L);
            HandlerThread handlerThreadM104046c = bvk.m104046c("IdentityProcessQueue");
            this.mProcessThread = handlerThreadM104046c;
            if (handlerThreadM104046c.getState() == Thread.State.NEW) {
                this.mProcessThread.start();
            }
            if (this.mProcessThread == null) {
                return -1;
            }
        }
        if (this.mProcessThreadHandler == null) {
            if (this.mProcessThread.getLooper() == null) {
                this.mProcessThread = bvk.m104046c("IdentityProcessQueue" + hashCode());
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
        this.mCallbackThreadHandler = new xmq0(this.mCallbackThread.getLooper());
        return 0;
    }

    @Override // p149l.vm2
    public boolean config(IdentityAlgConfig identityAlgConfig) {
        Handler handler = this.mProcessThreadHandler;
        if (handler == null) {
            return true;
        }
        handler.post(new noq0(this, identityAlgConfig, this));
        return true;
    }

    public boolean copyModelFromAssetsToData(Context context, List<String> list) {
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!mhi.m154629a(context, it.next())) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            ixq0.m138886c(TAG + e.getMessage());
            return false;
        }
    }

    @Override // p149l.vm2
    public void finishPhotinus() {
        Handler handler = this.mProcessThreadHandler;
        if (handler != null) {
            handler.post(new glq0());
        }
    }

    @Override // p149l.vm2, com.idv.identity.base.algorithm.IIdentityDelegate
    public void handleCaptureCompleted(int i, Map<String, Object> map) {
        Handler handler = this.mCallbackThreadHandler;
        if (handler != null) {
            handler.post(new RunnableC3719d(this, i, map));
        }
    }

    @Override // p149l.vm2, com.idv.identity.base.algorithm.IIdentityDelegate
    public void handleEventStated(int i) {
        this.mCallbackThreadHandler.post(new RunnableC3716a(this, i));
    }

    @Override // p149l.vm2, com.idv.identity.base.algorithm.IIdentityDelegate
    public void handleInfoReady(IDFrame iDFrame) {
        this.mCallbackThreadHandler.postAtFrontOfQueue(new RunnableC3717b(this, iDFrame));
    }

    @Override // p149l.vm2, com.idv.identity.base.algorithm.IIdentityDelegate
    public void handleStateUpdated(int i, IdentityFaceAttr identityFaceAttr) {
        Handler handler = this.mCallbackThreadHandler;
        if (handler != null) {
            handler.post(new RunnableC3718c(this, i, identityFaceAttr));
        }
    }

    @Override // p149l.vm2
    public boolean init(Context context, IdentityAlgConfig identityAlgConfig, qcm qcmVar) {
        if (setupWorkingThread() != 0) {
            return false;
        }
        this.models.add(ASSET_FACE_DET_MNN);
        this.models.add(ASSET_FACE_QUALITY_SCORE);
        this.cacheContext = context.getApplicationContext();
        this.identityFaceCallbacks.add(qcmVar);
        qcm qcmVar2 = (qcm) ycm.m214160a("com.idv.identity.tools.DebugToolIdentityFaceService", qcm.class);
        this.mDebugToolIdentityFaceService = qcmVar2;
        if (qcmVar2 != null) {
            this.identityFaceCallbacks.add(qcmVar2);
        }
        boolean zLoadLibrary = IdentityFace.loadLibrary(context);
        this.initResult = zLoadLibrary;
        if (zLoadLibrary) {
            return config(identityAlgConfig);
        }
        Iterator<qcm> it = this.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().mo173884e("INIT_LOAD_SO_ERROR", null);
        }
        this.initResult = false;
        return false;
    }

    @Override // p149l.vm2
    public void preProcess() {
        Iterator<qcm> it = this.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().preProcess();
        }
    }

    @Override // p149l.vm2
    public boolean processImage(IDFrame iDFrame) {
        if (this.initResult && this.mImageProcessing.compareAndSet(false, true)) {
            try {
                Handler handler = this.mProcessThreadHandler;
                if (handler != null) {
                    if (this.cacheRunnable == null) {
                        this.cacheRunnable = new frq0(this, iDFrame);
                    }
                    ivq0 ivq0Var = this.cacheRunnable;
                    ivq0Var.f115192a = iDFrame;
                    handler.post(ivq0Var);
                }
            } catch (Exception unused) {
                return false;
            }
        } else {
            totalDropFrame++;
        }
        return true;
    }

    @Override // p149l.vm2
    public void registerIdentityFaceCallback(qcm qcmVar) {
        this.identityFaceCallbacks.add(qcmVar);
    }

    @Override // p149l.vm2
    public void release() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Handler handler = this.mProcessThreadHandler;
        if (handler != null) {
            handler.post(new liq0(this));
            this.mProcessThreadHandler.removeCallbacksAndMessages(null);
            this.mProcessThreadHandler = null;
        }
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            HandlerThread handlerThread = this.mProcessThread;
            if (handlerThread != null) {
                bvk.m104047d(handlerThread);
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

    @Override // p149l.vm2
    public void removeIdentityFaceCallback(qcm qcmVar) {
        this.identityFaceCallbacks.remove(qcmVar);
    }

    @Override // com.idv.identity.base.algorithm.IIdentityDelegate
    public void reset() {
        Handler handler = this.mProcessThreadHandler;
        if (handler != null) {
            handler.post(new dvq0());
        }
    }

    @Override // p149l.vm2
    public boolean setFarNeatAction(boolean z) {
        IdentityFace.setFarNeatAction(z);
        return z;
    }
}
