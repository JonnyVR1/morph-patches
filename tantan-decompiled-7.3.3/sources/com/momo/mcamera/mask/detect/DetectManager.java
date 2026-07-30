package com.momo.mcamera.mask.detect;

import com.core.glcore.p024cv.MMCVBoxes;
import com.core.glcore.util.DetectDelayStopHelper;
import com.momo.mcamera.mask.express.ExpressDetector;
import com.momo.mcamera.mask.gesture.CVDetector;
import com.momo.mcamera.mask.gesture.GestureDetector;
import com.momo.mcamera.mask.gesture.NewHandGestureDetector;
import com.momo.mcamera.mask.handdetect.PickNoseDetector;
import com.momocv.express.ExpressInfo;
import com.momocv.handdetectlandmark.HandDetectLandmarkPostInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.c950;
import p153l.jxk;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class DetectManager implements IDetectManager {
    private static volatile DetectManager instance;
    private IPatternDetect.ExpressDetectListener expressDetectListener;
    private ExpressDetector expressDetector;
    private CVDetector.GestureDetectorListener gestureDetectListener;
    private NewHandGestureDetector gestureDetector;
    private CVDetector.GestureDetectorListener objectDetectListener;
    private GestureDetector objectDetector;
    private PickNoseDetector pickNoseDetector;
    private List<IDetectManager.IObjectDetectListener> objectDetectListeners = new CopyOnWriteArrayList();
    private List<IDetectManager.IGestureDetectListener> gestureDetectListeners = new CopyOnWriteArrayList();
    private List<IDetectManager.IExpressDetectListener> expressDetectListeners = new CopyOnWriteArrayList();
    private List<IDetectManager.IPickNoseDetectListener> pickNoiseDetectListeners = new CopyOnWriteArrayList();
    private AtomicBoolean objectDetectOpened = new AtomicBoolean(false);
    private AtomicBoolean gestureDetectOpened = new AtomicBoolean(false);
    private AtomicBoolean expressDetectOpened = new AtomicBoolean(false);
    private volatile boolean pickNoiseOpen = false;

    private DetectManager() {
        this.objectDetectListeners.clear();
        this.gestureDetectListeners.clear();
        this.expressDetectListeners.clear();
        this.objectDetector = new GestureDetector(null);
        this.gestureDetector = new NewHandGestureDetector();
        this.expressDetector = new ExpressDetector();
    }

    private IPatternDetect.ExpressDetectListener getExpressDetectListener() {
        if (this.expressDetectListener == null) {
            this.expressDetectListener = new IPatternDetect.ExpressDetectListener() { // from class: com.momo.mcamera.mask.detect.DetectManager.3
                @Override // com.momo.mcamera.mask.detect.IPatternDetect.ExpressDetectListener
                public void onExpressDetect(ExpressInfo expressInfo) {
                    if (DetectManager.this.expressDetectListeners == null) {
                        return;
                    }
                    for (IDetectManager.IExpressDetectListener iExpressDetectListener : DetectManager.this.expressDetectListeners) {
                        if (iExpressDetectListener != null) {
                            iExpressDetectListener.onExpressDetected(expressInfo);
                        }
                    }
                }
            };
        }
        return this.expressDetectListener;
    }

    private CVDetector.GestureDetectorListener getGestureDetectListener() {
        if (this.gestureDetectListener == null) {
            this.gestureDetectListener = new CVDetector.GestureDetectorListener() { // from class: com.momo.mcamera.mask.detect.DetectManager.2
                @Override // com.momo.mcamera.mask.gesture.CVDetector.GestureDetectorListener
                public void gestureDetect(MMCVBoxes mMCVBoxes) {
                    if (DetectManager.this.gestureDetectListeners == null) {
                        return;
                    }
                    for (IDetectManager.IGestureDetectListener iGestureDetectListener : DetectManager.this.gestureDetectListeners) {
                        if (iGestureDetectListener != null) {
                            iGestureDetectListener.onGestureDetected(mMCVBoxes);
                        }
                    }
                }
            };
        }
        return this.gestureDetectListener;
    }

    public static DetectManager getInstance() {
        if (instance == null) {
            synchronized (DetectManager.class) {
                try {
                    if (instance == null) {
                        instance = new DetectManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private CVDetector.GestureDetectorListener getObjectDetectListener() {
        if (this.objectDetectListener == null) {
            this.objectDetectListener = new CVDetector.GestureDetectorListener() { // from class: com.momo.mcamera.mask.detect.DetectManager.1
                @Override // com.momo.mcamera.mask.gesture.CVDetector.GestureDetectorListener
                public void gestureDetect(MMCVBoxes mMCVBoxes) {
                    if (DetectManager.this.objectDetectListeners == null) {
                        return;
                    }
                    for (IDetectManager.IObjectDetectListener iObjectDetectListener : DetectManager.this.objectDetectListeners) {
                        if (iObjectDetectListener != null) {
                            iObjectDetectListener.onObjectDetected(mMCVBoxes);
                        }
                    }
                }
            };
        }
        return this.objectDetectListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void stopExpressDetectInner() {
        try {
            ExpressDetector expressDetector = this.expressDetector;
            if (expressDetector != null) {
                expressDetector.stopDetect();
                this.expressDetectOpened.set(false);
            }
            this.expressDetector = null;
            clearAllExpressDetectListener();
            this.expressDetectListener = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void stopGestureDetectInner() {
        try {
            NewHandGestureDetector newHandGestureDetector = this.gestureDetector;
            if (newHandGestureDetector != null) {
                newHandGestureDetector.stopDetect();
                this.gestureDetectOpened.set(false);
            }
            this.gestureDetector = null;
            clearAllGestureDetectListener();
            this.gestureDetectListener = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void stopObjectDetectInner() {
        try {
            GestureDetector gestureDetector = this.objectDetector;
            if (gestureDetector != null) {
                gestureDetector.stopDetect();
                this.objectDetectOpened.set(false);
            }
            this.gestureDetector = null;
            clearAllObjectDetectListener();
            this.objectDetectListener = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void stopPickNoseDetect() {
        DetectDelayStopHelper.getInstance().delayRelease(DetectDelayStopHelper.TYPE_DETECT_PICKNOISE, new Runnable() { // from class: com.momo.mcamera.mask.detect.DetectManager.7
            @Override // java.lang.Runnable
            public void run() {
                DetectManager.this.stopPickNoseDetectInner();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void stopPickNoseDetectInner() {
        try {
            PickNoseDetector pickNoseDetector = this.pickNoseDetector;
            if (pickNoseDetector != null) {
                pickNoseDetector.release();
                this.pickNoseDetector = null;
            }
            clearAllPickNoiseDetectListener();
            this.pickNoiseOpen = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void clearAll() {
        stopExpressDetect();
        stopGestureDetect();
        stopObjectDetect();
        stopPickNoseDetect();
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void clearAllExpressDetectListener() {
        List<IDetectManager.IExpressDetectListener> list = this.expressDetectListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void clearAllGestureDetectListener() {
        List<IDetectManager.IGestureDetectListener> list = this.gestureDetectListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void clearAllObjectDetectListener() {
        List<IDetectManager.IObjectDetectListener> list = this.objectDetectListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void clearAllPickNoiseDetectListener() {
        List<IDetectManager.IPickNoseDetectListener> list = this.pickNoiseDetectListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public boolean isExpressDetectOpened() {
        return this.expressDetectOpened.get();
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public boolean isGestureDetectOpened() {
        return this.gestureDetectOpened.get();
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public boolean isObjectDetectOpened() {
        return this.objectDetectOpened.get();
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void registerExpressDetectListener(IDetectManager.IExpressDetectListener iExpressDetectListener) {
        List<IDetectManager.IExpressDetectListener> list;
        if (iExpressDetectListener == null || (list = this.expressDetectListeners) == null || list.contains(iExpressDetectListener)) {
            return;
        }
        this.expressDetectListeners.add(iExpressDetectListener);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void registerGestureDetectListener(IDetectManager.IGestureDetectListener iGestureDetectListener) {
        List<IDetectManager.IGestureDetectListener> list;
        if (iGestureDetectListener == null || (list = this.gestureDetectListeners) == null || list.contains(iGestureDetectListener)) {
            return;
        }
        this.gestureDetectListeners.add(iGestureDetectListener);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void registerObjectDetectListener(IDetectManager.IObjectDetectListener iObjectDetectListener) {
        List<IDetectManager.IObjectDetectListener> list;
        if (iObjectDetectListener == null || (list = this.objectDetectListeners) == null || list.contains(iObjectDetectListener)) {
            return;
        }
        this.objectDetectListeners.add(iObjectDetectListener);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void registerPickNoiseDetectListener(IDetectManager.IPickNoseDetectListener iPickNoseDetectListener) {
        List<IDetectManager.IPickNoseDetectListener> list;
        if (iPickNoseDetectListener == null || (list = this.pickNoiseDetectListeners) == null || list.contains(iPickNoseDetectListener)) {
            return;
        }
        this.pickNoiseDetectListeners.add(iPickNoseDetectListener);
    }

    public void release() {
        stopExpressDetectInner();
        stopGestureDetectInner();
        stopObjectDetectInner();
        stopPickNoseDetectInner();
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void removeExpressDetectListener(IDetectManager.IExpressDetectListener iExpressDetectListener) {
        List<IDetectManager.IExpressDetectListener> list;
        if (iExpressDetectListener == null || (list = this.expressDetectListeners) == null) {
            return;
        }
        list.remove(iExpressDetectListener);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void removeGestureDetectListener(IDetectManager.IGestureDetectListener iGestureDetectListener) {
        List<IDetectManager.IGestureDetectListener> list;
        if (iGestureDetectListener == null || (list = this.gestureDetectListeners) == null) {
            return;
        }
        list.remove(iGestureDetectListener);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void removeObjectDetectListener(IDetectManager.IObjectDetectListener iObjectDetectListener) {
        List<IDetectManager.IObjectDetectListener> list = this.objectDetectListeners;
        if (list == null || iObjectDetectListener == null) {
            return;
        }
        list.remove(iObjectDetectListener);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void removePickNoiseDetectListener(IDetectManager.IPickNoseDetectListener iPickNoseDetectListener) {
        List<IDetectManager.IPickNoseDetectListener> list;
        if (iPickNoseDetectListener == null || (list = this.pickNoiseDetectListeners) == null) {
            return;
        }
        list.remove(iPickNoseDetectListener);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public synchronized void setExpressModelPath(String str) {
        ExpressDetector expressDetector = this.expressDetector;
        if (expressDetector != null) {
            expressDetector.setModelPath(str);
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void setGestureDetectInterval(int i) {
        NewHandGestureDetector newHandGestureDetector = this.gestureDetector;
        if (newHandGestureDetector != null) {
            newHandGestureDetector.setDetectInterval(i);
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void setGestureModelPath(String str) {
        jxk.m147356e().m147359g(str);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void setHandGestureType(int i) {
        NewHandGestureDetector newHandGestureDetector = this.gestureDetector;
        if (newHandGestureDetector != null) {
            newHandGestureDetector.setHandGestureType(i);
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public synchronized void setMMCVInfo(omw omwVar) {
        try {
            if (this.objectDetector != null && this.objectDetectOpened.get()) {
                this.objectDetector.setMMCVInfo(omwVar);
            }
            if (this.gestureDetector != null && this.gestureDetectOpened.get()) {
                this.gestureDetector.setMMCVInfo(omwVar);
            }
            if (this.expressDetector != null && this.expressDetectOpened.get()) {
                this.expressDetector.setMMCVInfo(omwVar);
            }
            if (this.pickNoiseOpen) {
                HandDetectLandmarkPostInfo handDetectLandmarkPostInfoProcess = this.pickNoseDetector.process(omwVar);
                Iterator<IDetectManager.IPickNoseDetectListener> it = this.pickNoiseDetectListeners.iterator();
                while (it.hasNext()) {
                    it.next().onPickNoseDetected(handDetectLandmarkPostInfoProcess);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void setObjectDetectInterval(int i) {
        GestureDetector gestureDetector = this.objectDetector;
        if (gestureDetector != null) {
            gestureDetector.setDetectInterval(i);
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void setObjectModelPath(String str) {
        c950.m108407b().m108410d(str);
    }

    public synchronized void setPickNoiseDetect(boolean z) {
        try {
            this.pickNoiseOpen = z;
            if (this.pickNoiseOpen) {
                DetectDelayStopHelper.getInstance().cancelRelease(DetectDelayStopHelper.TYPE_DETECT_PICKNOISE);
                if (this.pickNoseDetector == null) {
                    this.pickNoseDetector = new PickNoseDetector();
                }
            } else {
                stopPickNoseDetect();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public synchronized void startExpressDetect() {
        try {
            DetectDelayStopHelper.getInstance().cancelRelease(DetectDelayStopHelper.TYPE_DETECT_EXPRESS);
            if (!this.expressDetectOpened.get()) {
                if (this.expressDetector == null) {
                    this.expressDetector = new ExpressDetector();
                }
                this.expressDetector.setExpressDetectListener(getExpressDetectListener());
                this.expressDetector.startDetect();
                this.expressDetectOpened.set(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public synchronized void startGestureDetect() {
        try {
            DetectDelayStopHelper.getInstance().cancelRelease(DetectDelayStopHelper.TYPE_DETECT_GESTURE);
            if (!this.gestureDetectOpened.get()) {
                if (this.gestureDetector == null) {
                    this.gestureDetector = new NewHandGestureDetector();
                }
                this.gestureDetector.setGestureDetectorListener(getGestureDetectListener());
                this.gestureDetector.startDetect();
                this.gestureDetectOpened.set(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public synchronized void startObjectDetect() {
        try {
            DetectDelayStopHelper.getInstance().cancelRelease(DetectDelayStopHelper.TYPE_DETECT_OBJECT);
            if (!this.objectDetectOpened.get()) {
                if (this.objectDetector == null) {
                    this.objectDetector = new GestureDetector(null);
                }
                this.objectDetector.setGestureDetectorListener(getObjectDetectListener());
                this.objectDetector.startDetect();
                this.objectDetectOpened.set(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void stopExpressDetect() {
        DetectDelayStopHelper.getInstance().delayRelease(DetectDelayStopHelper.TYPE_DETECT_EXPRESS, new Runnable() { // from class: com.momo.mcamera.mask.detect.DetectManager.6
            @Override // java.lang.Runnable
            public void run() {
                DetectManager.this.stopExpressDetectInner();
            }
        });
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void stopGestureDetect() {
        DetectDelayStopHelper.getInstance().delayRelease(DetectDelayStopHelper.TYPE_DETECT_GESTURE, new Runnable() { // from class: com.momo.mcamera.mask.detect.DetectManager.5
            @Override // java.lang.Runnable
            public void run() {
                DetectManager.this.stopGestureDetectInner();
            }
        });
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager
    public void stopObjectDetect() {
        DetectDelayStopHelper.getInstance().delayRelease(DetectDelayStopHelper.TYPE_DETECT_OBJECT, new Runnable() { // from class: com.momo.mcamera.mask.detect.DetectManager.4
            @Override // java.lang.Runnable
            public void run() {
                DetectManager.this.stopObjectDetectInner();
            }
        });
    }
}
