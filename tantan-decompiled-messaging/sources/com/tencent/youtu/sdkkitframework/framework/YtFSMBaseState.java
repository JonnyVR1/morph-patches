package com.tencent.youtu.sdkkitframework.framework;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class YtFSMBaseState {
    public static final String TAG = "YtFSMBaseState";
    public boolean isFirstEnter = true;
    public AtomicBoolean isPause = new AtomicBoolean(false);
    public long printFrameLogTime;
    public HashMap<String, Object> stateData;
    public String stateName;
    public String stateSimpleName;

    public boolean containsKey(String str) {
        return this.stateData.containsKey(str);
    }

    public void enter() {
        YtSDKStats.getInstance().enterState(this.stateSimpleName);
        if (this.isFirstEnter) {
            this.isFirstEnter = false;
            enterFirst();
        }
        YtLogger.m84637d(TAG, this.stateName + " enter");
    }

    public abstract void enterFirst();

    public void exit() {
        YtLogger.m84637d(TAG, this.stateName + " exit");
    }

    public Object getStateDataBy(String str) {
        return this.stateData.get(str);
    }

    public String getStateName() {
        return this.stateName;
    }

    public String getStateSimpleName() {
        return this.stateSimpleName;
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
    }

    public void handleStateAction(String str, Object obj) {
    }

    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        this.stateName = str;
        try {
            this.stateSimpleName = Class.forName(str).getSimpleName();
        } catch (Exception e) {
            String[] strArrSplit = str.split("\\.");
            this.stateSimpleName = strArrSplit[strArrSplit.length - 1];
            YtLogger.m84638e(TAG, "load state with catch error:", e);
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
        }
        YtLogger.m84639i(TAG, "load " + this.stateSimpleName);
        this.stateData = new HashMap<>();
        YtSDKStats.getInstance().registerStateName(this.stateSimpleName);
        updateSDKSetting(jSONObject);
    }

    public JSONObject makeStateInfo(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state_name", str);
            jSONObject.put("state_code", i);
            return jSONObject;
        } catch (JSONException e) {
            YtLogger.m84638e(TAG, "make log info error", e);
            return jSONObject;
        }
    }

    public void moveToNextState() {
        YtLogger.m84637d(TAG, this.stateName + " move to next");
    }

    public void onPause() {
        this.isPause.getAndSet(true);
    }

    public void onResume() {
        this.isPause.getAndSet(false);
    }

    public void reset() {
        this.isFirstEnter = true;
        this.stateData.clear();
        YtLogger.m84639i(TAG, this.stateName + " reset");
    }

    public void sendFSMTransitError(String str) {
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(str) { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState.1
            public final /* synthetic */ String val$stateName;

            {
                this.val$stateName = str;
                put(StateEvent.Name.PROCESS_RESULT, "failed");
                put(StateEvent.Name.ERROR_CODE, 3145728);
                put("message", CommonUtils.makeMessageJson(3145728, StringCode.MSG_INNER_ERROR, "fsm transit next round  error:" + str));
            }
        });
    }

    public void unload() {
        YtLogger.m84639i(TAG, "unload " + this.stateSimpleName);
        this.stateData.clear();
    }

    public void update(YTImageData yTImageData, long j) {
        YtSDKStats.getInstance().updateState(this.stateName);
        if (System.currentTimeMillis() - this.printFrameLogTime > 2000) {
            this.printFrameLogTime = System.currentTimeMillis();
            YtLogger.m84637d(TAG, this.stateName + " update bgr image width:" + yTImageData.getWidth() + ",height:" + yTImageData.height);
        }
    }

    public void updateDataBy(String str, Object obj) {
        this.stateData.put(str, obj);
    }

    public void updateSDKSetting(JSONObject jSONObject) {
    }
}
