package com.tencent.youtu.sdkkitframework.liveness;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.could.huiyansdk.api.C13875e;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import com.tencent.youtu.ytposedetect.data.PoseDetectData;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ActionLivenessState extends YtFSMBaseState {

    /* JADX INFO: renamed from: E */
    public int f60578E;

    /* JADX INFO: renamed from: F */
    public String f60579F;

    /* JADX INFO: renamed from: J */
    public int f60583J;

    /* JADX INFO: renamed from: K */
    public int f60584K;

    /* JADX INFO: renamed from: L */
    public boolean f60585L;

    /* JADX INFO: renamed from: S */
    public int f60592S;

    /* JADX INFO: renamed from: X */
    public boolean f60597X;

    /* JADX INFO: renamed from: Y */
    public boolean f60598Y;

    /* JADX INFO: renamed from: c */
    public YTFaceTracker.TrackedFace[] f60601c;

    /* JADX INFO: renamed from: f */
    public YTPoseDetectInterface.InterfaceC14522b f60604f;

    /* JADX INFO: renamed from: h */
    public String[] f60606h;

    /* JADX INFO: renamed from: i */
    public int f60607i;

    /* JADX INFO: renamed from: k */
    public YtSDKKitCommon.StateNameHelper.StateClassName f60609k;

    /* JADX INFO: renamed from: m */
    public C14517p f60611m;

    /* JADX INFO: renamed from: p */
    public YTActRefData f60614p;

    /* JADX INFO: renamed from: y */
    public YTFaceTracker.Param f60623y;

    /* JADX INFO: renamed from: z */
    public YTFaceTracker f60624z;

    /* JADX INFO: renamed from: a */
    public String f60599a = "3.7.5";

    /* JADX INFO: renamed from: b */
    public int f60600b = 0;

    /* JADX INFO: renamed from: d */
    public int f60602d = -1;

    /* JADX INFO: renamed from: e */
    public int f60603e = 0;

    /* JADX INFO: renamed from: g */
    public int f60605g = 1;

    /* JADX INFO: renamed from: j */
    public int f60608j = 0;

    /* JADX INFO: renamed from: l */
    public boolean f60610l = false;

    /* JADX INFO: renamed from: n */
    public String f60612n = Environment.getExternalStorageDirectory().getPath() + "/temp.mp4";

    /* JADX INFO: renamed from: o */
    public int f60613o = 1;

    /* JADX INFO: renamed from: q */
    public boolean f60615q = false;

    /* JADX INFO: renamed from: r */
    public int f60616r = 2097152;

    /* JADX INFO: renamed from: s */
    public int f60617s = 30;

    /* JADX INFO: renamed from: t */
    public int f60618t = 1;

    /* JADX INFO: renamed from: u */
    public String f60619u = "";

    /* JADX INFO: renamed from: v */
    public String f60620v = "";

    /* JADX INFO: renamed from: w */
    public String f60621w = StateEvent.ActionValue.STAGE_PASS;

    /* JADX INFO: renamed from: x */
    public boolean f60622x = false;

    /* JADX INFO: renamed from: A */
    public int f60574A = 0;

    /* JADX INFO: renamed from: B */
    public int f60575B = 5;

    /* JADX INFO: renamed from: C */
    public String f60576C = "";

    /* JADX INFO: renamed from: D */
    public int f60577D = 20;

    /* JADX INFO: renamed from: G */
    public int f60580G = 0;

    /* JADX INFO: renamed from: H */
    public boolean f60581H = false;

    /* JADX INFO: renamed from: I */
    public boolean f60582I = false;

    /* JADX INFO: renamed from: M */
    public float f60586M = 50.0f;

    /* JADX INFO: renamed from: N */
    public float f60587N = 50.0f;

    /* JADX INFO: renamed from: O */
    public float f60588O = 50.0f;

    /* JADX INFO: renamed from: P */
    public int f60589P = -1;

    /* JADX INFO: renamed from: Q */
    public int f60590Q = -1;

    /* JADX INFO: renamed from: R */
    public int f60591R = 0;

    /* JADX INFO: renamed from: T */
    public float f60593T = 0.38f;

    /* JADX INFO: renamed from: U */
    public boolean f60594U = false;

    /* JADX INFO: renamed from: V */
    public int f60595V = 10;

    /* JADX INFO: renamed from: W */
    public boolean f60596W = false;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$a */
    public class C14470a extends HashMap<String, Object> {
        public C14470a() {
            put(StateEvent.Name.ACTION_DETECT_TYPE, Integer.valueOf(ActionLivenessState.this.f60605g));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$b */
    public class C14471b extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f60626a;

        public C14471b(String str) {
            this.f60626a = str;
            put(StateEvent.Name.UI_EXTRA_TIPS, ActionLivenessState.this.f60619u);
            put(StateEvent.Name.UI_TIPS, ActionLivenessState.this.f60620v != null ? ActionLivenessState.this.f60620v : str);
            put(StateEvent.Name.UI_ACTION, ActionLivenessState.this.f60621w);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$c */
    public class C14472c extends HashMap<String, Object> {
        public C14472c(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.RESET_CUSTOM_TIMEOUT);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$d */
    public class C14473d extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f60628a;

        public C14473d(String str) {
            this.f60628a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本异常！目标版本：" + ActionLivenessState.this.f60599a + " 当前版本：" + str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$e */
    public class C14474e extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f60630a;

        public C14474e(String str) {
            this.f60630a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本异常！目标版本：" + ActionLivenessState.this.f60599a + " 当前版本：" + str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$f */
    public class C14475f extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f60632a;

        public C14475f(String str) {
            this.f60632a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本过低！目标版本：" + ActionLivenessState.this.f60599a + " 当前版本：" + str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$g */
    public class C14476g extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f60634a;

        public C14476g(ActionLivenessState actionLivenessState, int i) {
            this.f60634a = i;
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YtPose SDK failed with " + i));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$h */
    public class C14477h implements YTPoseDetectJNIInterface.IYtLoggerListener {
        public C14477h(ActionLivenessState actionLivenessState) {
        }

        @Override // com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.IYtLoggerListener
        public void log(String str, String str2) {
            YtLogger.m84637d("[SUNNY]", str + "---" + str2);
            Log.e("sunny-->", "~~~~~" + str + "||||" + str2);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$i */
    public class C14478i extends HashMap<String, Object> {
        public C14478i(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$k */
    public class C14480k implements YTPoseDetectInterface.InterfaceC14523c {
        public C14480k(ActionLivenessState actionLivenessState) {
        }

        @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.InterfaceC14523c
        /* JADX INFO: renamed from: a */
        public void mo84656a() {
            YtLogger.m84637d("ActionLivenessState", "start success");
        }

        @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.InterfaceC14523c
        public void onFailed(int i, String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$l */
    public class C14481l extends HashMap<String, Object> {
        public C14481l(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84653a(String[] strArr, int i) {
        if (strArr.length == 0) {
            return false;
        }
        this.f60607i = i;
        if (i >= strArr.length) {
            return false;
        }
        int i2 = Integer.parseInt(strArr[i]);
        YtSDKStats.getInstance().reportEvent(i2);
        if (i2 == 0 || i2 == 1) {
            this.f60605g = 1;
        } else if (i2 == 2) {
            this.f60605g = 2;
        } else if (i2 == 3) {
            this.f60605g = 3;
        } else if (i2 == 4) {
            this.f60605g = 4;
        } else if (i2 == 5) {
            this.f60605g = 5;
        }
        this.stateData.put("current_action_type", Integer.valueOf(i2));
        YtLogger.m84640o("ActionLivenessState", "action check rounds: " + this.f60607i + "start check pose: " + this.f60605g);
        if (!this.f60582I) {
            YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", null);
        }
        this.f60574A = 0;
        return true;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            this.f60600b = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.f60601c = (YTFaceTracker.TrackedFace[]) stateByName.getStateDataBy("face_status");
            this.f60602d = ((Integer) stateByName.getStateDataBy("pose_state")).intValue();
            this.f60603e = ((Integer) stateByName.getStateDataBy("shelter_state")).intValue();
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null && !this.f60615q) {
                String str = (String) stateByName2.getStateDataBy("action_data");
                if (TextUtils.isEmpty(str)) {
                    throw new Exception("action_data is empty");
                }
                String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
                this.f60606h = strArrSplit;
                int length = strArrSplit.length;
                int i = this.f60607i;
                if (length > i) {
                    int i2 = Integer.parseInt(strArrSplit[i]);
                    switch (i2) {
                        case 0:
                        case 1:
                            this.f60605g = 1;
                            break;
                        case 2:
                            this.f60605g = 2;
                            break;
                        case 3:
                            this.f60605g = 3;
                            break;
                        case 4:
                            this.f60605g = 4;
                            break;
                        case 5:
                            this.f60605g = 5;
                            break;
                        case 6:
                            this.f60605g = 6;
                            break;
                        case 7:
                            this.f60605g = 7;
                            break;
                        case 8:
                            this.f60605g = 8;
                            break;
                        case 9:
                            this.f60605g = 9;
                            break;
                    }
                    this.stateData.put("current_action_type", Integer.valueOf(i2));
                }
            }
            if (this.f60580G == 1) {
                this.f60605g = 5;
                this.f60606h = new String[]{"5"};
            }
            this.stateData.put("action_seq", this.f60606h);
            if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                String[] strArrSplit2 = YtSDKKitFramework.getInstance().version().split("-");
                String strM82220a = C13875e.m82220a(this.f60606h);
                if (stateByName2 != null && !this.f60596W) {
                    String str2 = (String) stateByName2.getStateDataBy("color_data");
                    if (TextUtils.isEmpty(str2)) {
                        throw new Exception("color_data is empty");
                    }
                    YTPoseDetectJNIInterface.setColorData(str2, strArrSplit2[0], strM82220a, this.f60612n, (String) stateByName2.getStateDataBy("sd_data"));
                    this.f60596W = true;
                }
            } else {
                YTPoseDetectJNIInterface.setColorData("NULL", "NULL", "NULL", this.f60612n, "NULL");
            }
        } catch (Exception e) {
            YtLogger.m84638e("ActionLivenessState", "action enter failed ", e);
            CommonUtils.reportException("action enter failed ", e);
        }
        YtFSM.getInstance().updateCacheStrategy(YtFSM.YtFSMUpdateStrategy.CacheStrategy);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00db A[PHI: r8
      0x00db: PHI (r8v11 int) = (r8v7 int), (r8v8 int) binds: [B:41:0x00d9, B:44:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.m84640o("ActionLivenessState", makeStateInfo("ActionLivenessState", 1));
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        stateByName.handleStateAction("reset_timeout", null);
        YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
        if (stateByName2 != null) {
            try {
                Object stateDataBy = stateByName2.getStateDataBy("video_bitrate");
                if (stateDataBy != null) {
                    this.f60616r = ((Integer) stateDataBy).intValue();
                }
                Object stateDataBy2 = stateByName2.getStateDataBy("video_framerate");
                if (stateDataBy2 != null) {
                    this.f60617s = ((Integer) stateDataBy2).intValue();
                }
                Object stateDataBy3 = stateByName2.getStateDataBy("video_iframeinterval");
                if (stateDataBy3 != null) {
                    this.f60618t = ((Integer) stateDataBy3).intValue();
                }
                String str = (String) stateByName2.getStateDataBy("control_config");
                if (str != null) {
                    this.f60576C = str;
                }
            } catch (Exception e) {
                YtLogger.m84638e("ActionLivenessState", "action enter first failed:", e);
            }
        }
        if (!this.f60576C.isEmpty()) {
            String[] strArrSplit = this.f60576C.split("&");
            if (strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    String[] strArrSplit2 = str2.split("=");
                    if (strArrSplit2.length > 1 && strArrSplit2[0].equals("actref_ux_mode")) {
                        this.f60580G = Integer.parseInt(strArrSplit2[1]);
                    }
                    if (strArrSplit2.length > 1 && strArrSplit2[0].equals("action_video_shorten_strategy")) {
                        int i = Integer.parseInt(strArrSplit2[1]);
                        this.f60584K = i;
                        YTPoseDetectJNIInterface.updateParam("action_video_shorten_strategy", String.valueOf(i));
                    }
                    if (strArrSplit2.length > 1 && strArrSplit2[0].equals("compress_pose_image_score")) {
                        int i2 = Integer.parseInt(strArrSplit2[1]);
                        int i3 = 80;
                        if (i2 < 80) {
                            i2 = i3;
                        } else {
                            i3 = 99;
                            if (i2 > 99) {
                                i2 = i3;
                            }
                        }
                        YtLogger.m84640o("ActionLivenessState", "compress pose image score:" + i2);
                        YTPoseDetectJNIInterface.compressPoseImageScore = i2;
                    }
                }
            }
        }
        YTFaceTracker yTFaceTracker = (YTFaceTracker) stateByName.getStateDataBy("detect_instance");
        this.f60624z = yTFaceTracker;
        if (yTFaceTracker != null) {
            YTFaceTracker.Param param = yTFaceTracker.getParam();
            this.f60623y = param;
            if (param != null) {
                param.detInterval = this.f60577D;
                this.f60624z.setParam(param);
            }
        } else {
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模式初始化失败");
            YtFSM.getInstance().sendFSMEvent(new C14478i(this));
        }
        this.f60611m = new C14517p(this.f60612n, this.f60616r, this.f60617s, this.f60618t, this.f60576C);
        YTPoseDetectJNIInterface.updateParam("screen_orientation", String.valueOf(this.f60591R));
        YTPoseDetectJNIInterface.updateParam("video_color_format_type", String.valueOf(this.f60611m.f60812a.getColorFormat()));
        YTPoseDetectJNIInterface.updateParam("out_image_type", String.valueOf(0));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.f60622x && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            m84652a();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        String version = YTPoseDetectJNIInterface.getVersion();
        YtLogger.m84639i("ActionLivenessState", "YTPose Version: " + version);
        String[] strArrSplit = version.split("\\.");
        String str2 = this.f60599a;
        YtLogger.m84639i("ActionLivenessState", "Wanted YTPose Version: " + str2);
        String[] strArrSplit2 = str2.split("\\.");
        if (Integer.parseInt(strArrSplit[0]) != Integer.parseInt(strArrSplit2[0])) {
            YtFSM.getInstance().sendFSMEvent(new C14473d(version));
        } else if (Integer.parseInt(strArrSplit[1]) != Integer.parseInt(strArrSplit2[1])) {
            YtFSM.getInstance().sendFSMEvent(new C14474e(version));
        } else if (Integer.parseInt(strArrSplit[2]) < Integer.parseInt(strArrSplit2[2])) {
            YtFSM.getInstance().sendFSMEvent(new C14475f(version));
        }
        int iInitModel = YTPoseDetectInterface.initModel();
        if (iInitModel != 0) {
            YtLogger.m84638e("ActionLivenessState", "action load failed2: " + iInitModel, null);
            YtFSM.getInstance().sendFSMEvent(new C14476g(this, iInitModel));
            return;
        }
        this.f60600b = 0;
        this.stateData.put("action_type", Integer.valueOf(this.f60605g));
        try {
            if (jSONObject.has("action_security_level")) {
                this.f60613o = jSONObject.getInt("action_security_level");
            }
            JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
            if (jSONArray == null) {
                YtSDKStats.getInstance().reportError(3145728, "yt_param_error");
                return;
            }
            this.f60606h = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f60606h[i] = jSONArray.getString(i);
            }
            YtLogger.m84637d("ActionLivenessState", "load action sequence from sdkconfig " + jSONObject.getString("action_default_seq") + " size :" + this.f60606h.length);
            try {
                if (jSONObject.has("action_inner_settings")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("action_inner_settings");
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        YTPoseDetectJNIInterface.updateParam(next, jSONObject2.getString(next));
                    }
                }
            } catch (JSONException e) {
                YtLogger.m84638e("ActionLivenessState", "action load failed4: ", e);
            }
            YTPoseDetectJNIInterface.setLoggerListener(new C14477h(this));
            YTPoseDetectJNIInterface.configNativeLog(true);
            YTPoseDetectJNIInterface.updateParam("log_level", "3");
            YTPoseDetectJNIInterface.updateParam("frame_num", "" + this.f60577D);
            YTPoseDetectJNIInterface.updateParam("last_frame_num", "" + this.f60578E);
            YTPoseDetectJNIInterface.updateParam("anchor_widths", this.f60579F);
            YTPoseDetectJNIInterface.updateParam("need_best_original_size", String.valueOf(this.f60592S));
            YTPoseDetectJNIInterface.updateParam("action_close_mouth_threshold", String.valueOf(this.f60593T));
            YTPoseDetectJNIInterface.updateParam("need_frame_quality", String.valueOf(this.f60594U ? 1 : 0));
            YTPoseDetectJNIInterface.updateParam("continuous_quality_num_threshold", String.valueOf(this.f60595V));
            YTPoseDetectJNIInterface.updateParam("secondary_yaw_threshold", String.valueOf(this.f60586M));
            YTPoseDetectJNIInterface.updateParam("secondary_pitch_threshold", String.valueOf(this.f60587N));
            YTPoseDetectJNIInterface.updateParam("secondary_roll_threshold", String.valueOf(this.f60588O));
            int i2 = YtFSM.getInstance().getContext().currentRotateState;
            this.f60609k = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            YTPoseDetectJNIInterface.setSafetyLevel(this.f60613o);
            reset();
        } catch (JSONException e2) {
            YtLogger.m84638e("ActionLivenessState", "action load failed3: ", e2);
            this.f60606h = "0".split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.f60609k == YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f60609k)) == -1) {
                sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f60609k));
            }
        } else {
            this.f60585L = true;
            YTPoseDetectInterface.stop();
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f60609k));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        m84652a();
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        YtVideoEncoder ytVideoEncoder;
        super.unload();
        if (YTPoseDetectInterface.isDetecting()) {
            YTPoseDetectInterface.stop();
        }
        YTPoseDetectInterface.releaseModel();
        C14517p c14517p = this.f60611m;
        if (c14517p == null || (ytVideoEncoder = c14517p.f60812a) == null) {
            return;
        }
        c14517p.f60820i = false;
        try {
            try {
                ytVideoEncoder.abortEncoding();
                c14517p.f60812a.stopEncoding();
            } catch (Exception e) {
                YtLogger.m84638e("p", "video release error:", e);
            }
        } finally {
            c14517p.f60812a = null;
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j) {
        int i;
        boolean z;
        String str;
        super.update(yTImageData, j);
        if (this.f60582I && this.isPause.get()) {
            YtFSM.getInstance().sendFSMEvent(new C14481l(this));
            try {
                Thread.sleep(30L);
                return;
            } catch (InterruptedException e) {
                YtLogger.m84638e("ActionLivenessState", "Thread sleep error", e);
                return;
            }
        }
        YTFaceTracker.TrackedFace[] trackedFaceArr = this.f60601c;
        if (trackedFaceArr != null && trackedFaceArr.length > 0 && (i = this.f60600b) > 0) {
            if (i <= 1 || (this.f60581H && this.f60602d == 7)) {
                this.f60574A = this.f60575B;
                YTPoseDetectInterface.reset();
                this.f60610l = false;
            }
            if (this.f60604f == null) {
                YtLogger.m84638e("ActionLivenessState", "FrameHandle is null, check init first", null);
                return;
            }
            YtLogger.m84637d("ActionLivenessState", "pose count" + this.f60574A + " stable " + this.f60575B + " isAction" + this.f60610l);
            if (this.f60583J != this.f60605g && this.f60582I) {
                YtFSM.getInstance().sendFSMEvent(new C14470a());
                this.f60583J = this.f60605g;
            }
            int i2 = this.f60605g;
            if ((i2 == this.f60589P || i2 == this.f60590Q) && !C14516o.m84683a(this.f60601c[0], this.f60586M, this.f60587N, this.f60588O)) {
                this.f60574A = this.f60575B;
                YTPoseDetectInterface.reset();
                this.f60610l = false;
                YtLogger.m84640o("ActionLivenessState", "action correction face failure:" + this.f60605g);
                HashMap<String, Object> map = new HashMap<>();
                map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                map.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_INCORRECT);
                YtFSM.getInstance().sendFSMEvent(map);
                z = false;
            } else {
                z = true;
            }
            if (this.f60605g == 3 && Math.abs(this.f60601c[0].yaw) > 20.0f) {
                this.f60574A = this.f60575B;
                this.f60610l = false;
                HashMap<String, Object> map2 = new HashMap<>();
                map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_INCORRECT);
                YtFSM.getInstance().sendFSMEvent(map2);
                z = false;
            }
            if (this.f60598Y && this.f60605g != 2) {
                float[] fArr = this.f60601c[0].faceShape;
                float fAbs = Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / Math.abs(fArr[90] - fArr[102]);
                YtLogger.m84640o("ActionLivenessState", "action nod head mouth not close!ret:" + fAbs + "|threshold=" + this.f60593T + ",action type:" + this.f60605g);
                StringBuilder sb = new StringBuilder("isMouthCLose  rat=");
                sb.append(fAbs);
                sb.append("|threshold=");
                sb.append(this.f60593T);
                YtLogger.m84637d("ActionLivenessState", sb.toString());
                if (fAbs >= this.f60593T) {
                    this.f60574A = this.f60575B;
                    this.f60610l = false;
                    HashMap<String, Object> map3 = new HashMap<>();
                    map3.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                    map3.put(StateEvent.Name.UI_TIPS, StringCode.FL_CLOSE_MOUTH);
                    YtFSM.getInstance().sendFSMEvent(map3);
                    z = false;
                }
            }
            if (z && this.f60574A > this.f60575B + 10) {
                if (!this.f60610l && !this.f60585L) {
                    int i3 = this.f60605g;
                    if (i3 == 1) {
                        str = StringCode.FL_ACT_BLINK;
                    } else if (i3 == 2) {
                        str = StringCode.FL_ACT_OPEN_MOUTH;
                    } else if (i3 == 4) {
                        str = StringCode.FL_ACT_SHAKE_HEAD;
                    } else if (i3 == 3) {
                        str = StringCode.FL_ACT_NOD_HEAD;
                    } else if (i3 == 5) {
                        str = StringCode.FL_POSE_KEEP;
                    } else if (i3 == 6) {
                        str = StringCode.FL_ACT_TURN_LEFT;
                    } else if (i3 == 7) {
                        str = StringCode.FL_ACT_TURN_RIGHT;
                    } else if (i3 == 8) {
                        str = StringCode.FL_ACT_CLOSER_FAR;
                    } else if (i3 == 9) {
                        str = StringCode.FL_ACT_FAR_CLOSER;
                    } else {
                        YtLogger.m84638e("ActionLivenessState", "Action liveness state getTipsByPoseType action error", null);
                        str = StringCode.FL_POSE_KEEP;
                    }
                    YtFSM.getInstance().sendFSMEvent(new C14471b(str));
                }
                YTFaceTracker.TrackedFace trackedFace = this.f60601c[0];
                YTPoseDetectInterface.poseDetect(new PoseDetectData(trackedFace.faceShape, trackedFace.faceVisible, this.f60605g, yTImageData.imgData, trackedFace.pitch, trackedFace.yaw, trackedFace.roll, this.f60602d, this.f60603e, trackedFace.faceRect, yTImageData.width, yTImageData.height, false), this.f60604f, 1);
            }
            this.f60574A++;
        } else if ((trackedFaceArr == null || trackedFaceArr.length == 0) && this.f60597X) {
            YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = this.f60609k;
            YtSDKKitCommon.StateNameHelper.StateClassName stateClassName2 = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            if (stateClassName == stateClassName2) {
                reset();
                ((FaceQualityState) YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE))).reset();
                YTPoseDetectInterface.reset();
                if (this.f60582I) {
                    YtFSM.getInstance().sendFSMEvent(new C14472c(this));
                } else {
                    YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName2)).handleStateAction("reset_timeout", null);
                }
            }
        }
        moveToNextState();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        String[] strArrSplit;
        try {
            if (jSONObject.has("quality_close_eye_left_threshold")) {
                jSONObject.getDouble("quality_close_eye_left_threshold");
            }
            if (jSONObject.has("quality_close_eye_right_threshold")) {
                jSONObject.getDouble("quality_close_eye_right_threshold");
            }
            if (jSONObject.has("quality_close_mouth_threshold")) {
                jSONObject.getDouble("quality_close_mouth_threshold");
            }
            if (jSONObject.has("need_face_quality")) {
                this.f60594U = jSONObject.getBoolean("need_face_quality");
            }
            if (jSONObject.has("video_path")) {
                this.f60612n = jSONObject.getString("video_path");
            } else {
                this.f60612n = YtFSM.getInstance().getContext().currentAppContext.getFilesDir() + "/temp.mp4";
            }
            if (jSONObject.has("local_config_flag")) {
                this.f60615q = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("video_bitrate")) {
                this.f60616r = jSONObject.getInt("video_bitrate");
            }
            if (jSONObject.has("video_framerate")) {
                this.f60617s = jSONObject.getInt("video_framerate");
            }
            if (jSONObject.has("video_iframeinterval")) {
                this.f60618t = jSONObject.getInt("video_iframeinterval");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f60622x = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f60575B = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("control_config")) {
                this.f60576C = jSONObject.getString("control_config");
            }
            if (jSONObject.has("need_close_timeout")) {
                this.f60582I = jSONObject.getBoolean("need_close_timeout");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f60586M = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f60587N = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f60588O = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("continuous_quality_num_threshold")) {
                this.f60595V = jSONObject.getInt("continuous_quality_num_threshold");
            }
            if (jSONObject.has("screen_orientation")) {
                this.f60591R = jSONObject.getInt("screen_orientation");
            }
            if (jSONObject.has("need_best_original_size")) {
                this.f60592S = jSONObject.getInt("need_best_original_size");
            }
            if (jSONObject.has("action_close_mouth_threshold")) {
                this.f60593T = (float) jSONObject.getDouble("action_close_mouth_threshold");
            }
            if (jSONObject.has("need_local_face_best_image")) {
                this.f60597X = jSONObject.getBoolean("need_local_face_best_image");
            }
            if (jSONObject.has("correction_angle_action_type") && (strArrSplit = jSONObject.getString("correction_angle_action_type").split(Constants.SEPARATOR_COMMA)) != null && strArrSplit.length > 0) {
                for (int i = 0; i < strArrSplit.length; i++) {
                    if (i == 0) {
                        this.f60589P = Integer.parseInt(strArrSplit[i]);
                    } else if (i == 1) {
                        this.f60590Q = Integer.parseInt(strArrSplit[i]);
                    }
                }
            }
            this.f60577D = jSONObject.optInt("action_frame_num", 20);
            this.f60578E = jSONObject.optInt("last_action_frame_num", 3);
            this.f60579F = jSONObject.optString("anchor_widths", "480,240,240");
            this.f60581H = jSONObject.optBoolean("need_check_multiface", false);
            this.f60598Y = jSONObject.optBoolean("need_pose_check_mouth_open", false);
        } catch (JSONException e) {
            e.printStackTrace();
            YtLogger.m84638e("ActionLivenessState", "action load failed1:", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84652a() {
        this.f60608j = 0;
        this.f60610l = false;
        this.f60574A = 0;
        this.f60602d = -1;
        this.f60585L = false;
        this.f60596W = false;
        String[] strArr = this.f60606h;
        this.f60607i = 0;
        m84653a(strArr, 0);
        this.f60609k = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        try {
            C14517p c14517p = this.f60611m;
            if (c14517p != null) {
                c14517p.f60812a.abortEncoding();
            }
        } catch (Exception e) {
            YtLogger.m84638e("ActionLivenessState", "video error:", e);
        }
        this.f60604f = new C14479j();
        YTPoseDetectInterface.start(YtFSM.getInstance().getContext().currentAppContext, YtFSM.getInstance().getContext().currentRotateState, new C14480k(this));
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$j */
    public class C14479j implements YTPoseDetectInterface.InterfaceC14522b {
        public C14479j() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m84655a(byte[] bArr, int i, int i2, int i3) {
            YtLogger.m84639i("ActionLivenessState", "codec info: rotatedWith: " + i + "rotatedHeight: " + i2 + " bitrate: " + ActionLivenessState.this.f60616r + " framerate" + ActionLivenessState.this.f60617s + " iframeinterval" + ActionLivenessState.this.f60618t);
            ActionLivenessState actionLivenessState = ActionLivenessState.this;
            C14517p c14517p = actionLivenessState.f60611m;
            if (!c14517p.f60820i) {
                int i4 = actionLivenessState.f60591R;
                c14517p.f60820i = true;
                if (c14517p.f60821j) {
                    if (!c14517p.f60812a.isEncodingStarted()) {
                        try {
                            c14517p.f60812a.startEncoding(i, i2, new File(c14517p.f60813b), c14517p.f60814c, c14517p.f60815d, c14517p.f60816e, i4);
                        } catch (Exception unused) {
                        }
                    }
                }
                YtLogger.m84638e("p", "sunny-start video encode error", null);
                return false;
            }
            C14517p c14517p2 = ActionLivenessState.this.f60611m;
            c14517p2.getClass();
            try {
                c14517p2.f60812a.queueFrame(new YTImageData(bArr, i, i2));
                c14517p2.f60812a.encode(c14517p2.f60815d);
                return true;
            } catch (Exception e) {
                YtLogger.m84638e("p", "encode frame error:", e);
                return false;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m84654a(int i, String str, String str2) {
            YtSDKStats.getInstance().reportInfo("pose state " + i);
            YtLogger.m84637d("ActionLivenessState", "YTPoseDetectInterface.poseDetect.onFailed: " + i + " s: " + str);
            ActionLivenessState actionLivenessState = ActionLivenessState.this;
            actionLivenessState.f60608j = actionLivenessState.f60608j + 1;
        }
    }
}
