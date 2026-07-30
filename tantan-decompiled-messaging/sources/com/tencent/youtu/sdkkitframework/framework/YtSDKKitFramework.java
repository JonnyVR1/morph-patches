package com.tencent.youtu.sdkkitframework.framework;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.RelativeLayout;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.net.C14518a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class YtSDKKitFramework {
    public static final String TAG = "YtSDKKitFramework";
    public static YtSDKKitFramework instance;
    public IYtSDKKitFrameworkEventListener eventListener;
    public Rect previewRect = new Rect(0, 0, 0, 0);
    public Rect detectRect = new Rect(0, 0, 0, 0);
    public Rect detectRectInset = new Rect(10, 110, 10, 110);
    public int networkRequestTimeoutMS = HuiYanResultSender.TIMEOUT_MS;
    public long defaultUpdateTimeoutMS = 8000;
    public AtomicBoolean sdkKitFrameworkStarted = new AtomicBoolean(false);

    public interface IYTBaseFunctionListener {
        String base64Encode(byte[] bArr, int i);

        void detectActionDone(int i);

        HashMap<String, Integer> getFrameResult(Object obj);

        byte[] getVoiceData();
    }

    public interface IYTReflectListener {
        float onGetAppBrightness();

        void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f);

        void onReflectStart(long j);
    }

    public interface IYtSDKKitFrameworkEventListener {
        void onFrameworkEvent(HashMap<String, Object> map);

        void onNetworkRequestEvent(String str, String str2, HashMap<String, String> map, IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser);
    }

    public interface IYtSDKKitNetResponseParser {
        void onNetworkResponseEvent(HashMap<String, String> map, Exception exc);
    }

    public enum YtFrameworkFireEventType {
        YT_EVENT_TRIGGER_BEGIN_LIVENESS,
        YT_EVENT_TRIGGER_CANCEL_LIVENESS
    }

    public enum YtSDKKitFrameworkWorkMode {
        YT_FW_UNKNOWN(0),
        YT_FW_OCR_TYPE(1),
        YT_FW_SILENT_TYPE(2),
        YT_FW_ACTION_TYPE(3),
        YT_FW_REFLECT_TYPE(4),
        YT_FW_ACTREFLECT_TYPE(5),
        YT_FW_DETECTONLY_TYPE(6),
        YT_FW_OCR_VIID_TYPE(7);

        public static HashMap<Integer, YtSDKKitFrameworkWorkMode> map = new HashMap<>();
        public int value;

        static {
            for (YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode : values()) {
                map.put(Integer.valueOf(ytSDKKitFrameworkWorkMode.value), ytSDKKitFrameworkWorkMode);
            }
        }

        YtSDKKitFrameworkWorkMode(int i) {
            this.value = i;
        }

        public static YtSDKKitFrameworkWorkMode valueOf(int i) {
            return map.get(Integer.valueOf(i)) == null ? YT_FW_UNKNOWN : map.get(Integer.valueOf(i));
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class YtSDKPlatformContext {
        public IYTBaseFunctionListener baseFunctionListener;
        public Context currentAppContext;
        public Camera currentCamera;
        public int currentCameraId;
        public int currentRotateState;
        public int imageToComapreType = 0;
        public Bitmap imageToCompare;
        public RelativeLayout reflectLayout;
        public IYTReflectListener reflectListener;
    }

    public static synchronized void clearInstance() {
        instance = null;
    }

    public static synchronized YtSDKKitFramework getInstance() {
        try {
            if (instance == null) {
                instance = new YtSDKKitFramework();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    private YtFSMBaseState parseStateFrom(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        YtFSMBaseState ytFSMBaseState;
        Throwable th;
        try {
            ytFSMBaseState = (YtFSMBaseState) Class.forName(str).getConstructor(null).newInstance(null);
            try {
                ytFSMBaseState.loadStateWith(str, jSONObject, ytSdkConfig);
                return ytFSMBaseState;
            } catch (Throwable th2) {
                th = th2;
                YtLogger.m84638e(TAG, "Parse state " + str + "failed:", th);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(th));
                return ytFSMBaseState;
            }
        } catch (Throwable th3) {
            ytFSMBaseState = null;
            th = th3;
        }
    }

    public int deInit() {
        if (!this.sdkKitFrameworkStarted.get()) {
            YtLogger.m84638e(TAG, "YouTu SDK Kit framework is not started!!!", null);
            return -2048;
        }
        this.sdkKitFrameworkStarted.set(false);
        YtLogger.m84640o(TAG, "sdk framework  deInit");
        synchronized (C14518a.class) {
            try {
                C14518a c14518a = C14518a.f60822b;
                if (c14518a != null) {
                    for (Map.Entry<Integer, Thread> entry : c14518a.f60823a.entrySet()) {
                        if (entry.getValue() == null) {
                            c14518a.f60823a.remove(entry.getKey());
                            YtLogger.m84637d("a", "network remove " + entry.getKey());
                            break;
                        }
                    }
                }
                C14518a.f60822b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        YtFSM.getInstance().stop();
        YtFSM.clearInstance();
        YtSDKStats.getInstance().exitState();
        YtSDKStats.clearInstance();
        OperateInfoManager.getInstance().clear();
        return 0;
    }

    public void doPause() {
        YtLogger.m84640o(TAG, "sdk framework  doPause");
        YtFSM.getInstance().handlePauseEvent();
    }

    public void doResume() {
        YtLogger.m84640o(TAG, "sdk framework  doResume");
        YtFSM.getInstance().handleResumeEvent();
    }

    public void fireEvent(YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        YtFSM.getInstance().handleEvent(ytFrameworkFireEventType, obj);
    }

    public Rect getDetectRect() {
        return this.detectRect;
    }

    public int getNetworkRequestTimeoutMS() {
        return this.networkRequestTimeoutMS;
    }

    public YtSDKPlatformContext getPlatformContext() {
        return YtFSM.getInstance().getContext();
    }

    public Rect getPreviewRect() {
        return this.previewRect;
    }

    public int init(YtSDKPlatformContext ytSDKPlatformContext, JSONObject jSONObject, YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, ArrayList<String> arrayList, IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) throws Throwable {
        boolean z;
        int i;
        int i2;
        int i3;
        String str = TAG;
        YtLogger.m84640o(str, "SDK init sdk config JSON:" + jSONObject.toString());
        if (this.sdkKitFrameworkStarted.get()) {
            YtLogger.m84638e(str, "YouTu SDK Kit framework is started!!!", null);
            return -2048;
        }
        this.sdkKitFrameworkStarted.set(true);
        if (ytSDKPlatformContext == null) {
            YtLogger.m84638e(str, "Context cannot be null", null);
            return -1;
        }
        if (arrayList.isEmpty()) {
            YtLogger.m84638e(str, "Pipeline state name cannot be empty", null);
            return -1;
        }
        if (iYtSDKKitFrameworkEventListener == null) {
            YtLogger.m84638e(str, "Event listener cannot be null", null);
            return -1;
        }
        YtSdkConfig ytSdkConfig = new YtSdkConfig();
        ytSdkConfig.updateSDKConfig(ytSDKKitFrameworkWorkMode, jSONObject);
        if (jSONObject.has("resource_online")) {
            try {
                if (jSONObject.getBoolean("resource_online")) {
                    YtLogger.m84640o(str, "model validity md5 start");
                    if (!jSONObject.has("resource_download_path")) {
                        YtLogger.m84638e(str, "resource_download_path is null", null);
                        return -2;
                    }
                    YtSDKKitFrameworkTool.ModelValidityCode modelValidityCodeMd5ValidityByDir = new YtSDKKitFrameworkTool().md5ValidityByDir(jSONObject.getString("resource_download_path"));
                    if (modelValidityCodeMd5ValidityByDir != YtSDKKitFrameworkTool.ModelValidityCode.VALIDITY_OK) {
                        YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模型初始化失败");
                        iYtSDKKitFrameworkEventListener.onFrameworkEvent(new HashMap<String, Object>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.1
                            {
                                put(StateEvent.Name.PROCESS_RESULT, "failed");
                                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
                                put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
                            }
                        });
                        YtLogger.m84638e(str, "init module error:" + modelValidityCodeMd5ValidityByDir.name(), null);
                        return -2;
                    }
                }
                YtLogger.m84640o(str, "model validity md5 done");
            } catch (JSONException e) {
                YtLogger.m84638e(TAG, "parse json error:", e);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
                return -2;
            }
        }
        if (jSONObject.has("resource_online")) {
            try {
                z = jSONObject.getBoolean("resource_online");
            } catch (JSONException e2) {
                YtLogger.m84638e(TAG, "json getBoolean 'resource_online' error", e2);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e2));
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            FileUtils.loadLibrary("YTLiveness");
        }
        if (jSONObject.has("need_bugly_shared")) {
            try {
                if (jSONObject.getBoolean("need_bugly_shared")) {
                    YtSDKKitFrameworkTool.openBuglyShared(ytSDKPlatformContext.currentAppContext);
                }
                YtLogger.m84640o(TAG, "update bugly shared data");
            } catch (JSONException e3) {
                YtLogger.m84638e(TAG, "parse json error:", e3);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e3));
                return -3;
            }
        }
        if (jSONObject.has("screen_orientation")) {
            try {
                i = jSONObject.getInt("screen_orientation");
            } catch (JSONException e4) {
                YtLogger.m84638e(TAG, "parse json error:", e4);
                i = 0;
            }
        } else {
            i = 0;
        }
        if (jSONObject.has("rear_camera_tag")) {
            try {
                i2 = jSONObject.getInt("rear_camera_tag");
            } catch (JSONException e5) {
                YtLogger.m84638e(TAG, "parse json error:", e5);
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        YtFSM.getInstance().stop();
        YtFSM.getInstance().setEventListener(iYtSDKKitFrameworkEventListener);
        YtFSM.getInstance().setContext(ytSDKPlatformContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            YtFSM.getInstance().registerState(parseStateFrom(it.next(), jSONObject, ytSdkConfig));
        }
        if (jSONObject.has("thread_priority")) {
            try {
                i3 = jSONObject.getInt("thread_priority");
            } catch (JSONException e6) {
                YtLogger.m84638e(TAG, "failed to get priority ", e6);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e6));
                i3 = -20;
            }
        } else {
            i3 = -20;
        }
        YtFSM.getInstance().start(arrayList.get(0), ytSDKKitFrameworkWorkMode, i3, jSONObject.optLong("frame_update_timeout_ms", this.defaultUpdateTimeoutMS), i, i2);
        return 0;
    }

    public void reset() {
        YtLogger.m84640o(TAG, "sdk framework  reset");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.2
            @Override // java.lang.Runnable
            public void run() {
                YtSDKStats.getInstance().reset();
                YtFSM.getInstance().reset();
            }
        });
    }

    public void setDetectRect(Rect rect) {
        if (rect == null) {
            ig3.m135964a("detectRect is null");
            return;
        }
        YtLogger.m84640o(TAG, "sdk framework detectRect：" + rect.toString());
        this.detectRect = rect;
    }

    public void setNetworkRequestTimeoutMS(int i) {
        if (i < 0) {
            i = 0;
        }
        this.networkRequestTimeoutMS = i;
    }

    public void setPreviewRect(Rect rect) {
        if (rect == null) {
            ig3.m135964a("previewRect is null");
            return;
        }
        YtLogger.m84640o(TAG, "sdk framework previewRect：" + rect.toString());
        this.previewRect = rect;
        int i = rect.left;
        Rect rect2 = this.detectRectInset;
        this.detectRect = new Rect(i + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        YtFSM.getInstance().updateSDKSetting(jSONObject);
    }

    public int updateWithFrameData(byte[] bArr, int i, int i2, int i3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis <= 946684800000L) {
            return ErrorCode.YT_SDK_TIMETICK_ERROR;
        }
        YtFSM.getInstance().update(bArr, i, i2, jCurrentTimeMillis);
        return 0;
    }

    public String version() {
        try {
            return YtSDKKitFrameworkTool.getFrameworkVersion();
        } catch (Exception e) {
            YtLogger.m84638e(TAG, "so not load", e);
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
            return "";
        }
    }
}
