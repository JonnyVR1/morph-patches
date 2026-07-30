package com.tencent.youtu.sdkkitframework.framework;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class YtFSM {
    public static final String TAG = "YtFSM";
    public static YtFSM instance;
    public YTImageData currentImageData;
    public YtFSMBaseState currentState;
    public YtSDKKitFramework.IYtSDKKitFrameworkEventListener eventListener;
    public String firstStateName;
    public YtSDKKitFramework.YtSDKPlatformContext sdkPlatformContex;
    public Thread updateEventHandler;
    public YtSDKKitFramework.YtSDKKitFrameworkWorkMode currentWorkMode = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
    public boolean isStarted = false;
    public boolean needEventHandler = false;
    public YtFSMUpdateStrategy currentStrategy = YtFSMUpdateStrategy.CacheStrategy;
    public long feedTimeMs = 0;
    public boolean checkUpdateTimerFlag = true;
    public Map<String, YtFSMBaseState> stateMap = new ConcurrentHashMap();
    public Lock stateLock = new ReentrantLock();
    public Lock startStopLock = new ReentrantLock();
    public ConcurrentLinkedQueue<YtFSMUpdateData> updateQueue = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<Object> eventQueue = new ConcurrentLinkedQueue<>();

    public class YtFSMFireEventData {
        public YtSDKKitFramework.YtFrameworkFireEventType eventType;
        public Object extraData;

        public YtFSMFireEventData(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
            this.eventType = ytFrameworkFireEventType;
            this.extraData = obj;
        }
    }

    public class YtFSMUpdateData {
        public byte[] imageData;
        public int imageHeight;
        public int imageWidth;
        public long timeStamp;

        public YtFSMUpdateData() {
        }

        public void mirror() {
            int i;
            int i2;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = this.imageHeight;
                i2 = this.imageWidth;
                if (i4 >= i) {
                    break;
                }
                int i5 = i4 * i2;
                i4++;
                for (int i6 = (i2 * i4) - 1; i5 < i6; i6--) {
                    byte[] bArr = this.imageData;
                    byte b = bArr[i5];
                    bArr[i5] = bArr[i6];
                    bArr[i6] = b;
                    i5++;
                }
            }
            int i7 = i2 * i;
            while (i3 < this.imageHeight / 2) {
                int i8 = this.imageWidth;
                int i9 = i3 * i8;
                i3++;
                for (int i10 = (i8 * i3) - 2; i9 < i10; i10 -= 2) {
                    byte[] bArr2 = this.imageData;
                    int i11 = i9 + i7;
                    byte b2 = bArr2[i11];
                    int i12 = i10 + i7;
                    bArr2[i11] = bArr2[i12];
                    bArr2[i12] = b2;
                    int i13 = i11 + 1;
                    byte b3 = bArr2[i13];
                    int i14 = i12 + 1;
                    bArr2[i13] = bArr2[i14];
                    bArr2[i14] = b3;
                    i9 += 2;
                }
            }
        }
    }

    public enum YtFSMUpdateStrategy {
        CacheStrategy,
        NoCacheStrategy
    }

    public static synchronized void clearInstance() {
        if (instance != null) {
            instance = null;
        }
    }

    public static synchronized YtFSM getInstance() {
        try {
            if (instance == null) {
                instance = new YtFSM();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    public void cleanUpQueue() {
        this.updateQueue.clear();
    }

    public YtSDKKitFramework.YtSDKPlatformContext getContext() {
        if (this.sdkPlatformContex == null) {
            this.sdkPlatformContex = new YtSDKKitFramework.YtSDKPlatformContext();
        }
        return this.sdkPlatformContex;
    }

    public YtFSMBaseState getStateByName(String str) {
        if (this.stateMap.containsKey(str)) {
            return this.stateMap.get(str);
        }
        return null;
    }

    public YtSDKKitFramework.YtSDKKitFrameworkWorkMode getWorkMode() {
        return this.currentWorkMode;
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        try {
            this.eventQueue.add(new YtFSMFireEventData(ytFrameworkFireEventType, obj));
        } catch (Exception e) {
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
            YtLogger.m85809e(TAG, "Handle event failed:", e);
        }
    }

    public void handlePauseEvent() {
        Iterator<YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public void handleResumeEvent() {
        Iterator<YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    public int registerState(YtFSMBaseState ytFSMBaseState) {
        YtSDKStats.getInstance().registerStateName(ytFSMBaseState.getStateSimpleName());
        this.stateMap.put(ytFSMBaseState.getStateName(), ytFSMBaseState);
        return 0;
    }

    public void reset() {
        YtLogger.m85810i(TAG, "FSM reset work mode " + this.currentWorkMode);
        try {
            this.eventQueue.add("reset");
        } catch (Exception e) {
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
            YtLogger.m85809e(TAG, "handle reset failed:", e);
        }
    }

    public void sendFSMEvent(HashMap<String, Object> map) {
        if (this.eventListener == null) {
            YtLogger.m85809e(TAG, "Event listener not init", null);
            return;
        }
        if (map.containsKey(StateEvent.Name.PROCESS_RESULT)) {
            String strMakePackUseTime = OperateInfoManager.getInstance().makePackUseTime();
            String strMakeCatchErrorData = OperateInfoManager.getInstance().makeCatchErrorData();
            if (!TextUtils.isEmpty(strMakePackUseTime)) {
                YtLogger.m85808d("OPERATE", "FSM EVENT:" + strMakePackUseTime + SignParameters.NEW_LINE + strMakeCatchErrorData);
                map.put(StateEvent.Name.OPERATE_CATCH_ERROR, strMakeCatchErrorData);
                map.put(StateEvent.Name.OPERATE_PACK_USE_TIME, strMakePackUseTime);
            }
            YtLogger.m85808d(TAG, "send framework event result: " + map.get(StateEvent.Name.PROCESS_RESULT) + " errorcode:" + map.get(StateEvent.Name.ERROR_CODE));
        }
        YtLogger.m85808d(TAG, "eventDict=" + map);
        this.eventListener.onFrameworkEvent(map);
    }

    public void sendNetworkRequest(String str, String str2, String str3, HashMap<String, String> map, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        if (this.eventListener == null) {
            YtLogger.m85809e(TAG, "Event listener not init", null);
        } else {
            sendFSMEvent(new HashMap<String, Object>(str) { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.2
                public final /* synthetic */ String val$netType;

                {
                    this.val$netType = str;
                    String strMakePackUseTime = OperateInfoManager.getInstance().makePackUseTime();
                    String strMakeCatchErrorData = OperateInfoManager.getInstance().makeCatchErrorData();
                    if (!TextUtils.isEmpty(strMakePackUseTime)) {
                        YtLogger.m85808d("OPERATE", "NETWORK EVENT:" + strMakePackUseTime + SignParameters.NEW_LINE + strMakeCatchErrorData);
                        put(StateEvent.Name.OPERATE_CATCH_ERROR, strMakeCatchErrorData);
                        put(StateEvent.Name.OPERATE_PACK_USE_TIME, strMakePackUseTime);
                    }
                    put(StateEvent.Name.UI_TIPS, str);
                }
            });
            this.eventListener.onNetworkRequestEvent(str2, str3, map, iYtSDKKitNetResponseParser);
        }
    }

    public void setContext(YtSDKKitFramework.YtSDKPlatformContext ytSDKPlatformContext) {
        this.sdkPlatformContex = ytSDKPlatformContext;
    }

    public void setEventListener(YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        this.eventListener = iYtSDKKitFrameworkEventListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void start(String str, YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, final int i, final long j, final int i2, final int i3) throws Throwable {
        YtFSM ytFSM;
        Throwable th;
        YtFSM ytFSM2;
        Exception exc;
        Object obj = "start set current state:";
        String str2 = TAG;
        YtLogger.m85810i(str2, "FSM start use work mode " + ytSDKKitFrameworkWorkMode);
        try {
            try {
                this.startStopLock.lock();
                if (this.isStarted) {
                    ytFSM = this;
                } else {
                    this.firstStateName = str;
                    this.currentWorkMode = ytSDKKitFrameworkWorkMode;
                    this.isStarted = true;
                    this.needEventHandler = true;
                    this.checkUpdateTimerFlag = true;
                    if (this.stateMap.containsKey(str)) {
                        try {
                            YtLogger.m85808d(str2, "start set current state:" + str);
                            YtFSMBaseState ytFSMBaseState = this.stateMap.get(this.firstStateName);
                            this.currentState = ytFSMBaseState;
                            ytFSMBaseState.enter();
                        } catch (Exception e) {
                            exc = e;
                            ytFSM = this;
                            YtLogger.m85809e(TAG, "FSM error", exc);
                            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(exc));
                            ytFSM.startStopLock.unlock();
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            ytFSM2 = this;
                            ytFSM2.startStopLock.unlock();
                            throw th;
                        }
                    } else {
                        YtLogger.m85809e(str2, "Start " + str + " failed which is not found", null);
                    }
                    this.updateQueue.clear();
                    ytFSM = this;
                    try {
                        Thread thread = new Thread(new Runnable() { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.1
                            @Override // java.lang.Runnable
                            public void run() {
                                YtFSM ytFSM3;
                                YtFSMUpdateData ytFSMUpdateData;
                                Process.setThreadPriority(i);
                                while (YtFSM.this.needEventHandler) {
                                    if (YtFSM.this.isStarted) {
                                        while (true) {
                                            boolean zIsEmpty = YtFSM.this.eventQueue.isEmpty();
                                            ytFSM3 = YtFSM.this;
                                            ytFSMUpdateData = null;
                                            if (zIsEmpty) {
                                                try {
                                                    break;
                                                } catch (Throwable th3) {
                                                    YtFSM.this.stateLock.unlock();
                                                    throw th3;
                                                }
                                            }
                                            Object objPoll = ytFSM3.eventQueue.poll();
                                            if (objPoll instanceof String) {
                                                if (((String) objPoll).equals("reset")) {
                                                    Iterator it = YtFSM.this.stateMap.values().iterator();
                                                    while (it.hasNext()) {
                                                        ((YtFSMBaseState) it.next()).reset();
                                                    }
                                                    if (YtFSM.this.stateMap.containsKey(YtFSM.this.firstStateName)) {
                                                        YtLogger.m85808d(YtFSM.TAG, "reset set current state:" + YtFSM.this.firstStateName);
                                                        YtFSM ytFSM4 = YtFSM.this;
                                                        ytFSM4.currentState = (YtFSMBaseState) ytFSM4.stateMap.get(YtFSM.this.firstStateName);
                                                        YtFSM.this.currentState.enter();
                                                    } else {
                                                        YtLogger.m85809e(YtFSM.TAG, "reset failed: " + YtFSM.this.firstStateName + " state is not found", null);
                                                    }
                                                    YtFSM.this.updateQueue.clear();
                                                    YtFSM.this.checkUpdateTimerFlag = true;
                                                }
                                            } else if (objPoll instanceof YtFSMFireEventData) {
                                                YtFSMFireEventData ytFSMFireEventData = (YtFSMFireEventData) objPoll;
                                                YtLogger.m85808d(YtFSM.TAG, "handleevent " + ytFSMFireEventData.eventType + " for all states");
                                                Iterator it2 = YtFSM.this.stateMap.values().iterator();
                                                while (it2.hasNext()) {
                                                    ((YtFSMBaseState) it2.next()).handleEvent(ytFSMFireEventData.eventType, ytFSMFireEventData.extraData);
                                                }
                                            }
                                        }
                                        ytFSM3.stateLock.lock();
                                        YtFSMUpdateStrategy ytFSMUpdateStrategy = YtFSM.this.currentStrategy;
                                        YtFSMUpdateStrategy ytFSMUpdateStrategy2 = YtFSMUpdateStrategy.CacheStrategy;
                                        YtFSM ytFSM5 = YtFSM.this;
                                        if (ytFSMUpdateStrategy == ytFSMUpdateStrategy2) {
                                            ytFSMUpdateData = (YtFSMUpdateData) ytFSM5.updateQueue.poll();
                                        } else if (ytFSM5.currentStrategy == YtFSMUpdateStrategy.NoCacheStrategy) {
                                            YtLogger.m85810i(YtFSM.TAG, "no cache str size:" + YtFSM.this.updateQueue.size());
                                            while (YtFSM.this.updateQueue.size() > 0) {
                                                ytFSMUpdateData = (YtFSMUpdateData) YtFSM.this.updateQueue.poll();
                                            }
                                        } else {
                                            YtLogger.m85809e(YtFSM.TAG, "unknown strategy " + YtFSM.this.currentStrategy, null);
                                        }
                                        if (ytFSMUpdateData != null) {
                                            if (i2 == 1) {
                                                ytFSMUpdateData.mirror();
                                            }
                                            int i4 = i2;
                                            YtFSM.this.currentImageData = YtSDKKitFrameworkTool.yuvRotateAnd2bgrImge(ytFSMUpdateData.imageData, i4 == 0 ? ytFSMUpdateData.imageWidth : ytFSMUpdateData.imageHeight, i4 == 0 ? ytFSMUpdateData.imageHeight : ytFSMUpdateData.imageWidth, YtFSM.getInstance().getContext().currentRotateState, i3);
                                            YtFSM.this.currentImageData.timeStamp = ytFSMUpdateData.timeStamp;
                                            if (YtFSM.this.currentState != null) {
                                                YtFSM.this.currentState.update(YtFSM.this.currentImageData, YtFSM.this.currentImageData.timeStamp);
                                            }
                                        }
                                        YtFSM.this.stateLock.unlock();
                                    }
                                    try {
                                        Thread.sleep(2L);
                                    } catch (InterruptedException e2) {
                                        YtLogger.m85809e(YtFSM.TAG, "sleep failed", e2);
                                        OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e2));
                                    }
                                    if (YtFSM.this.currentState != null && YtFSM.this.currentState.getStateSimpleName().contains("ReqResult")) {
                                        YtFSM.this.checkUpdateTimerFlag = false;
                                    }
                                    if (YtFSM.this.checkUpdateTimerFlag && YtFSM.this.feedTimeMs > 0 && j > 0 && System.currentTimeMillis() > YtFSM.this.feedTimeMs + j) {
                                        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.1.1
                                            {
                                                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                                                put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                                                put(StateEvent.Name.PROCESS_RESULT, "failed");
                                                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_VERIFY_TIMEOUT));
                                                put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_VERIFY_TIMEOUT, StringCode.MSG_TIMEOUT_ERROR, "Timeout"));
                                            }
                                        });
                                        YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                                        return;
                                    }
                                }
                            }
                        });
                        ytFSM.updateEventHandler = thread;
                        thread.setName("YtEventUpdateThread");
                        ytFSM.updateEventHandler.start();
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        YtLogger.m85809e(TAG, "FSM error", exc);
                        OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(exc));
                        ytFSM.startStopLock.unlock();
                        return;
                    }
                }
                ytFSM.startStopLock.unlock();
            } catch (Throwable th3) {
                th = th3;
                th = th;
                ytFSM2 = obj;
                ytFSM2.startStopLock.unlock();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            ytFSM = this;
        } catch (Throwable th4) {
            th = th4;
            obj = this;
            th = th;
            ytFSM2 = obj;
            ytFSM2.startStopLock.unlock();
            throw th;
        }
    }

    public void stop() {
        YtLogger.m85810i(TAG, "FSM stop work mode " + this.currentWorkMode);
        try {
            this.startStopLock.lock();
            this.needEventHandler = false;
            Thread thread = this.updateEventHandler;
            if (thread != null && thread.isAlive()) {
                this.updateEventHandler.join();
            }
            if (this.isStarted) {
                this.isStarted = false;
                Iterator<YtFSMBaseState> it = this.stateMap.values().iterator();
                while (it.hasNext()) {
                    it.next().unload();
                }
                this.stateMap.clear();
                this.updateQueue.clear();
            }
        } catch (InterruptedException e) {
            YtLogger.m85809e(TAG, "FSM strop error", e);
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
        } finally {
            this.startStopLock.unlock();
        }
    }

    public int transitNextRound(String str) {
        if (!this.stateMap.containsKey(str)) {
            YtLogger.m85809e(TAG, "transitnextround faild:" + str + " state is not found", null);
            return -1;
        }
        this.currentState.exit();
        YtLogger.m85808d(TAG, "transitnextround set current state:" + str);
        YtFSMBaseState ytFSMBaseState = this.stateMap.get(str);
        this.currentState = ytFSMBaseState;
        if (ytFSMBaseState == null) {
            return -1;
        }
        ytFSMBaseState.enter();
        return 0;
    }

    public int transitNow(String str) {
        if (!this.stateMap.containsKey(str)) {
            YtLogger.m85809e(TAG, "transitnow failed:" + str + " state is not found", null);
            return -1;
        }
        this.currentState.exit();
        YtLogger.m85808d(TAG, "transitnow set current state:" + str);
        YtFSMBaseState ytFSMBaseState = this.stateMap.get(str);
        this.currentState = ytFSMBaseState;
        ytFSMBaseState.enter();
        YTImageData yTImageData = this.currentImageData;
        if (yTImageData != null) {
            this.currentState.update(yTImageData, yTImageData.timeStamp);
        }
        return 0;
    }

    public void update(byte[] bArr, int i, int i2, long j) {
        if (this.isStarted) {
            if (bArr == null) {
                YtLogger.m85810i(TAG, "imageData == null");
                return;
            }
            if (bArr.length == 0) {
                YtLogger.m85810i(TAG, "imageData.length == 0");
                return;
            }
            if (!this.updateQueue.isEmpty()) {
                this.updateQueue.clear();
            }
            try {
                YtFSMUpdateData ytFSMUpdateData = new YtFSMUpdateData();
                ytFSMUpdateData.imageData = (byte[]) bArr.clone();
                ytFSMUpdateData.imageWidth = i;
                ytFSMUpdateData.imageHeight = i2;
                ytFSMUpdateData.timeStamp = j;
                this.updateQueue.add(ytFSMUpdateData);
            } catch (Exception e) {
                YtLogger.m85813w(TAG, "YtFSMUpdateData create fail", e);
            }
            this.feedTimeMs = System.currentTimeMillis();
        }
    }

    public void updateCacheStrategy(YtFSMUpdateStrategy ytFSMUpdateStrategy) {
        this.currentStrategy = ytFSMUpdateStrategy;
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        Iterator<YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().updateSDKSetting(jSONObject);
        }
    }
}
