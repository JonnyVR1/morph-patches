package com.core.glcore.util;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DetectDelayStopHelper {
    private static final int DELAY_FRAME_LIMIT = 300;
    public static final int TYPE_DETECT_AR_GIFT = 754;
    public static final int TYPE_DETECT_BODY = 751;
    public static final int TYPE_DETECT_CARTOON = 752;
    public static final int TYPE_DETECT_CRYING_FACE = 753;
    public static final int TYPE_DETECT_EXPRESS = 747;
    public static final int TYPE_DETECT_GESTURE = 748;
    public static final int TYPE_DETECT_OBJECT = 749;
    public static final int TYPE_DETECT_PICKNOISE = 750;
    public static final int TYPE_DETECT_RIG = 682;
    private HashMap<Integer, DelayReleaseData> delayMap;

    public class DelayReleaseData {
        int frameCount;
        Runnable runnable;
        volatile boolean startDelay;

        private DelayReleaseData() {
            this.frameCount = 0;
            this.startDelay = false;
        }
    }

    public static class DetectDelayStopHolder {
        public static DetectDelayStopHelper detectDelayStop = new DetectDelayStopHelper();

        private DetectDelayStopHolder() {
        }
    }

    private DetectDelayStopHelper() {
        this.delayMap = new HashMap<>();
    }

    public static DetectDelayStopHelper getInstance() {
        return DetectDelayStopHolder.detectDelayStop;
    }

    public synchronized void cancelRelease(int i) {
        DelayReleaseData delayReleaseData = this.delayMap.get(Integer.valueOf(i));
        if (delayReleaseData == null) {
            return;
        }
        delayReleaseData.startDelay = false;
        delayReleaseData.frameCount = 0;
        delayReleaseData.runnable = null;
        this.delayMap.remove(Integer.valueOf(i));
    }

    public synchronized void delayRelease(int i, Runnable runnable) {
        try {
            DelayReleaseData delayReleaseData = this.delayMap.get(Integer.valueOf(i));
            if (delayReleaseData == null) {
                delayReleaseData = new DelayReleaseData();
                this.delayMap.put(Integer.valueOf(i), delayReleaseData);
            }
            delayReleaseData.startDelay = true;
            delayReleaseData.runnable = runnable;
            delayReleaseData.frameCount = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onNewFrame() {
        try {
            Iterator<Integer> it = this.delayMap.keySet().iterator();
            while (it.hasNext()) {
                DelayReleaseData delayReleaseData = this.delayMap.get(it.next());
                if (delayReleaseData != null && delayReleaseData.startDelay) {
                    int i = delayReleaseData.frameCount + 1;
                    delayReleaseData.frameCount = i;
                    if (i == 300) {
                        Runnable runnable = delayReleaseData.runnable;
                        if (runnable != null) {
                            runnable.run();
                        }
                        delayReleaseData.runnable = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
