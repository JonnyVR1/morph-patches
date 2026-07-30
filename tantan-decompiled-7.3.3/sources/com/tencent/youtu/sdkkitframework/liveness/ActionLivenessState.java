package com.tencent.youtu.sdkkitframework.liveness;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.could.huiyansdk.api.C14038e;
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
    public int f61425E;

    /* JADX INFO: renamed from: F */
    public String f61426F;

    /* JADX INFO: renamed from: J */
    public int f61430J;

    /* JADX INFO: renamed from: K */
    public int f61431K;

    /* JADX INFO: renamed from: L */
    public boolean f61432L;

    /* JADX INFO: renamed from: S */
    public int f61439S;

    /* JADX INFO: renamed from: X */
    public boolean f61444X;

    /* JADX INFO: renamed from: Y */
    public boolean f61445Y;

    /* JADX INFO: renamed from: c */
    public YTFaceTracker.TrackedFace[] f61448c;

    /* JADX INFO: renamed from: f */
    public YTPoseDetectInterface.InterfaceC14670b f61451f;

    /* JADX INFO: renamed from: h */
    public String[] f61453h;

    /* JADX INFO: renamed from: i */
    public int f61454i;

    /* JADX INFO: renamed from: k */
    public YtSDKKitCommon.StateNameHelper.StateClassName f61456k;

    /* JADX INFO: renamed from: m */
    public C14665p f61458m;

    /* JADX INFO: renamed from: p */
    public YTActRefData f61461p;

    /* JADX INFO: renamed from: y */
    public YTFaceTracker.Param f61470y;

    /* JADX INFO: renamed from: z */
    public YTFaceTracker f61471z;

    /* JADX INFO: renamed from: a */
    public String f61446a = "3.7.5";

    /* JADX INFO: renamed from: b */
    public int f61447b = 0;

    /* JADX INFO: renamed from: d */
    public int f61449d = -1;

    /* JADX INFO: renamed from: e */
    public int f61450e = 0;

    /* JADX INFO: renamed from: g */
    public int f61452g = 1;

    /* JADX INFO: renamed from: j */
    public int f61455j = 0;

    /* JADX INFO: renamed from: l */
    public boolean f61457l = false;

    /* JADX INFO: renamed from: n */
    public String f61459n = Environment.getExternalStorageDirectory().getPath() + "/temp.mp4";

    /* JADX INFO: renamed from: o */
    public int f61460o = 1;

    /* JADX INFO: renamed from: q */
    public boolean f61462q = false;

    /* JADX INFO: renamed from: r */
    public int f61463r = 2097152;

    /* JADX INFO: renamed from: s */
    public int f61464s = 30;

    /* JADX INFO: renamed from: t */
    public int f61465t = 1;

    /* JADX INFO: renamed from: u */
    public String f61466u = "";

    /* JADX INFO: renamed from: v */
    public String f61467v = "";

    /* JADX INFO: renamed from: w */
    public String f61468w = StateEvent.ActionValue.STAGE_PASS;

    /* JADX INFO: renamed from: x */
    public boolean f61469x = false;

    /* JADX INFO: renamed from: A */
    public int f61421A = 0;

    /* JADX INFO: renamed from: B */
    public int f61422B = 5;

    /* JADX INFO: renamed from: C */
    public String f61423C = "";

    /* JADX INFO: renamed from: D */
    public int f61424D = 20;

    /* JADX INFO: renamed from: G */
    public int f61427G = 0;

    /* JADX INFO: renamed from: H */
    public boolean f61428H = false;

    /* JADX INFO: renamed from: I */
    public boolean f61429I = false;

    /* JADX INFO: renamed from: M */
    public float f61433M = 50.0f;

    /* JADX INFO: renamed from: N */
    public float f61434N = 50.0f;

    /* JADX INFO: renamed from: O */
    public float f61435O = 50.0f;

    /* JADX INFO: renamed from: P */
    public int f61436P = -1;

    /* JADX INFO: renamed from: Q */
    public int f61437Q = -1;

    /* JADX INFO: renamed from: R */
    public int f61438R = 0;

    /* JADX INFO: renamed from: T */
    public float f61440T = 0.38f;

    /* JADX INFO: renamed from: U */
    public boolean f61441U = false;

    /* JADX INFO: renamed from: V */
    public int f61442V = 10;

    /* JADX INFO: renamed from: W */
    public boolean f61443W = false;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$a */
    public class C14618a extends HashMap<String, Object> {
        public C14618a() {
            put(StateEvent.Name.ACTION_DETECT_TYPE, Integer.valueOf(ActionLivenessState.this.f61452g));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$b */
    public class C14619b extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f61473a;

        public C14619b(String str) {
            this.f61473a = str;
            put(StateEvent.Name.UI_EXTRA_TIPS, ActionLivenessState.this.f61466u);
            put(StateEvent.Name.UI_TIPS, ActionLivenessState.this.f61467v != null ? ActionLivenessState.this.f61467v : str);
            put(StateEvent.Name.UI_ACTION, ActionLivenessState.this.f61468w);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$c */
    public class C14620c extends HashMap<String, Object> {
        public C14620c(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.RESET_CUSTOM_TIMEOUT);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$d */
    public class C14621d extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f61475a;

        public C14621d(String str) {
            this.f61475a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本异常！目标版本：" + ActionLivenessState.this.f61446a + " 当前版本：" + str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$e */
    public class C14622e extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f61477a;

        public C14622e(String str) {
            this.f61477a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本异常！目标版本：" + ActionLivenessState.this.f61446a + " 当前版本：" + str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$f */
    public class C14623f extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f61479a;

        public C14623f(String str) {
            this.f61479a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本过低！目标版本：" + ActionLivenessState.this.f61446a + " 当前版本：" + str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$g */
    public class C14624g extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f61481a;

        public C14624g(ActionLivenessState actionLivenessState, int i) {
            this.f61481a = i;
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YtPose SDK failed with " + i));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$h */
    public class C14625h implements YTPoseDetectJNIInterface.IYtLoggerListener {
        public C14625h(ActionLivenessState actionLivenessState) {
        }

        @Override // com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.IYtLoggerListener
        public void log(String str, String str2) {
            YtLogger.m85808d("[SUNNY]", str + "---" + str2);
            Log.e("sunny-->", "~~~~~" + str + "||||" + str2);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$i */
    public class C14626i extends HashMap<String, Object> {
        public C14626i(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$k */
    public class C14628k implements YTPoseDetectInterface.InterfaceC14671c {
        public C14628k(ActionLivenessState actionLivenessState) {
        }

        @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.InterfaceC14671c
        /* JADX INFO: renamed from: a */
        public void mo85827a() {
            YtLogger.m85808d("ActionLivenessState", "start success");
        }

        @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.InterfaceC14671c
        public void onFailed(int i, String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$l */
    public class C14629l extends HashMap<String, Object> {
        public C14629l(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85824a(String[] strArr, int i) {
        if (strArr.length == 0) {
            return false;
        }
        this.f61454i = i;
        if (i >= strArr.length) {
            return false;
        }
        int i2 = Integer.parseInt(strArr[i]);
        YtSDKStats.getInstance().reportEvent(i2);
        if (i2 == 0 || i2 == 1) {
            this.f61452g = 1;
        } else if (i2 == 2) {
            this.f61452g = 2;
        } else if (i2 == 3) {
            this.f61452g = 3;
        } else if (i2 == 4) {
            this.f61452g = 4;
        } else if (i2 == 5) {
            this.f61452g = 5;
        }
        this.stateData.put("current_action_type", Integer.valueOf(i2));
        YtLogger.m85811o("ActionLivenessState", "action check rounds: " + this.f61454i + "start check pose: " + this.f61452g);
        if (!this.f61429I) {
            YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", null);
        }
        this.f61421A = 0;
        return true;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            this.f61447b = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.f61448c = (YTFaceTracker.TrackedFace[]) stateByName.getStateDataBy("face_status");
            this.f61449d = ((Integer) stateByName.getStateDataBy("pose_state")).intValue();
            this.f61450e = ((Integer) stateByName.getStateDataBy("shelter_state")).intValue();
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null && !this.f61462q) {
                String str = (String) stateByName2.getStateDataBy("action_data");
                if (TextUtils.isEmpty(str)) {
                    throw new Exception("action_data is empty");
                }
                String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
                this.f61453h = strArrSplit;
                int length = strArrSplit.length;
                int i = this.f61454i;
                if (length > i) {
                    int i2 = Integer.parseInt(strArrSplit[i]);
                    switch (i2) {
                        case 0:
                        case 1:
                            this.f61452g = 1;
                            break;
                        case 2:
                            this.f61452g = 2;
                            break;
                        case 3:
                            this.f61452g = 3;
                            break;
                        case 4:
                            this.f61452g = 4;
                            break;
                        case 5:
                            this.f61452g = 5;
                            break;
                        case 6:
                            this.f61452g = 6;
                            break;
                        case 7:
                            this.f61452g = 7;
                            break;
                        case 8:
                            this.f61452g = 8;
                            break;
                        case 9:
                            this.f61452g = 9;
                            break;
                    }
                    this.stateData.put("current_action_type", Integer.valueOf(i2));
                }
            }
            if (this.f61427G == 1) {
                this.f61452g = 5;
                this.f61453h = new String[]{"5"};
            }
            this.stateData.put("action_seq", this.f61453h);
            if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                String[] strArrSplit2 = YtSDKKitFramework.getInstance().version().split("-");
                String strM83403a = C14038e.m83403a(this.f61453h);
                if (stateByName2 != null && !this.f61443W) {
                    String str2 = (String) stateByName2.getStateDataBy("color_data");
                    if (TextUtils.isEmpty(str2)) {
                        throw new Exception("color_data is empty");
                    }
                    YTPoseDetectJNIInterface.setColorData(str2, strArrSplit2[0], strM83403a, this.f61459n, (String) stateByName2.getStateDataBy("sd_data"));
                    this.f61443W = true;
                }
            } else {
                YTPoseDetectJNIInterface.setColorData("NULL", "NULL", "NULL", this.f61459n, "NULL");
            }
        } catch (Exception e) {
            YtLogger.m85809e("ActionLivenessState", "action enter failed ", e);
            CommonUtils.reportException("action enter failed ", e);
        }
        YtFSM.getInstance().updateCacheStrategy(YtFSM.YtFSMUpdateStrategy.CacheStrategy);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00db A[PHI: r8
      0x00db: PHI (r8v11 int) = (r8v7 int), (r8v8 int) binds: [B:41:0x00d9, B:44:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.m85811o("ActionLivenessState", makeStateInfo("ActionLivenessState", 1));
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        stateByName.handleStateAction("reset_timeout", null);
        YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
        if (stateByName2 != null) {
            try {
                Object stateDataBy = stateByName2.getStateDataBy("video_bitrate");
                if (stateDataBy != null) {
                    this.f61463r = ((Integer) stateDataBy).intValue();
                }
                Object stateDataBy2 = stateByName2.getStateDataBy("video_framerate");
                if (stateDataBy2 != null) {
                    this.f61464s = ((Integer) stateDataBy2).intValue();
                }
                Object stateDataBy3 = stateByName2.getStateDataBy("video_iframeinterval");
                if (stateDataBy3 != null) {
                    this.f61465t = ((Integer) stateDataBy3).intValue();
                }
                String str = (String) stateByName2.getStateDataBy("control_config");
                if (str != null) {
                    this.f61423C = str;
                }
            } catch (Exception e) {
                YtLogger.m85809e("ActionLivenessState", "action enter first failed:", e);
            }
        }
        if (!this.f61423C.isEmpty()) {
            String[] strArrSplit = this.f61423C.split("&");
            if (strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    String[] strArrSplit2 = str2.split("=");
                    if (strArrSplit2.length > 1 && strArrSplit2[0].equals("actref_ux_mode")) {
                        this.f61427G = Integer.parseInt(strArrSplit2[1]);
                    }
                    if (strArrSplit2.length > 1 && strArrSplit2[0].equals("action_video_shorten_strategy")) {
                        int i = Integer.parseInt(strArrSplit2[1]);
                        this.f61431K = i;
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
                        YtLogger.m85811o("ActionLivenessState", "compress pose image score:" + i2);
                        YTPoseDetectJNIInterface.compressPoseImageScore = i2;
                    }
                }
            }
        }
        YTFaceTracker yTFaceTracker = (YTFaceTracker) stateByName.getStateDataBy("detect_instance");
        this.f61471z = yTFaceTracker;
        if (yTFaceTracker != null) {
            YTFaceTracker.Param param = yTFaceTracker.getParam();
            this.f61470y = param;
            if (param != null) {
                param.detInterval = this.f61424D;
                this.f61471z.setParam(param);
            }
        } else {
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模式初始化失败");
            YtFSM.getInstance().sendFSMEvent(new C14626i(this));
        }
        this.f61458m = new C14665p(this.f61459n, this.f61463r, this.f61464s, this.f61465t, this.f61423C);
        YTPoseDetectJNIInterface.updateParam("screen_orientation", String.valueOf(this.f61438R));
        YTPoseDetectJNIInterface.updateParam("video_color_format_type", String.valueOf(this.f61458m.f61659a.getColorFormat()));
        YTPoseDetectJNIInterface.updateParam("out_image_type", String.valueOf(0));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.f61469x && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            m85823a();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        String version = YTPoseDetectJNIInterface.getVersion();
        YtLogger.m85810i("ActionLivenessState", "YTPose Version: " + version);
        String[] strArrSplit = version.split("\\.");
        String str2 = this.f61446a;
        YtLogger.m85810i("ActionLivenessState", "Wanted YTPose Version: " + str2);
        String[] strArrSplit2 = str2.split("\\.");
        if (Integer.parseInt(strArrSplit[0]) != Integer.parseInt(strArrSplit2[0])) {
            YtFSM.getInstance().sendFSMEvent(new C14621d(version));
        } else if (Integer.parseInt(strArrSplit[1]) != Integer.parseInt(strArrSplit2[1])) {
            YtFSM.getInstance().sendFSMEvent(new C14622e(version));
        } else if (Integer.parseInt(strArrSplit[2]) < Integer.parseInt(strArrSplit2[2])) {
            YtFSM.getInstance().sendFSMEvent(new C14623f(version));
        }
        int iInitModel = YTPoseDetectInterface.initModel();
        if (iInitModel != 0) {
            YtLogger.m85809e("ActionLivenessState", "action load failed2: " + iInitModel, null);
            YtFSM.getInstance().sendFSMEvent(new C14624g(this, iInitModel));
            return;
        }
        this.f61447b = 0;
        this.stateData.put("action_type", Integer.valueOf(this.f61452g));
        try {
            if (jSONObject.has("action_security_level")) {
                this.f61460o = jSONObject.getInt("action_security_level");
            }
            JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
            if (jSONArray == null) {
                YtSDKStats.getInstance().reportError(3145728, "yt_param_error");
                return;
            }
            this.f61453h = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f61453h[i] = jSONArray.getString(i);
            }
            YtLogger.m85808d("ActionLivenessState", "load action sequence from sdkconfig " + jSONObject.getString("action_default_seq") + " size :" + this.f61453h.length);
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
                YtLogger.m85809e("ActionLivenessState", "action load failed4: ", e);
            }
            YTPoseDetectJNIInterface.setLoggerListener(new C14625h(this));
            YTPoseDetectJNIInterface.configNativeLog(true);
            YTPoseDetectJNIInterface.updateParam("log_level", "3");
            YTPoseDetectJNIInterface.updateParam("frame_num", "" + this.f61424D);
            YTPoseDetectJNIInterface.updateParam("last_frame_num", "" + this.f61425E);
            YTPoseDetectJNIInterface.updateParam("anchor_widths", this.f61426F);
            YTPoseDetectJNIInterface.updateParam("need_best_original_size", String.valueOf(this.f61439S));
            YTPoseDetectJNIInterface.updateParam("action_close_mouth_threshold", String.valueOf(this.f61440T));
            YTPoseDetectJNIInterface.updateParam("need_frame_quality", String.valueOf(this.f61441U ? 1 : 0));
            YTPoseDetectJNIInterface.updateParam("continuous_quality_num_threshold", String.valueOf(this.f61442V));
            YTPoseDetectJNIInterface.updateParam("secondary_yaw_threshold", String.valueOf(this.f61433M));
            YTPoseDetectJNIInterface.updateParam("secondary_pitch_threshold", String.valueOf(this.f61434N));
            YTPoseDetectJNIInterface.updateParam("secondary_roll_threshold", String.valueOf(this.f61435O));
            int i2 = YtFSM.getInstance().getContext().currentRotateState;
            this.f61456k = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            YTPoseDetectJNIInterface.setSafetyLevel(this.f61460o);
            reset();
        } catch (JSONException e2) {
            YtLogger.m85809e("ActionLivenessState", "action load failed3: ", e2);
            this.f61453h = "0".split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.f61456k == YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61456k)) == -1) {
                sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61456k));
            }
        } else {
            this.f61432L = true;
            YTPoseDetectInterface.stop();
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61456k));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        m85823a();
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
        C14665p c14665p = this.f61458m;
        if (c14665p == null || (ytVideoEncoder = c14665p.f61659a) == null) {
            return;
        }
        c14665p.f61667i = false;
        try {
            try {
                ytVideoEncoder.abortEncoding();
                c14665p.f61659a.stopEncoding();
            } catch (Exception e) {
                YtLogger.m85809e("p", "video release error:", e);
            }
        } finally {
            c14665p.f61659a = null;
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j) {
        int i;
        boolean z;
        String str;
        super.update(yTImageData, j);
        if (this.f61429I && this.isPause.get()) {
            YtFSM.getInstance().sendFSMEvent(new C14629l(this));
            try {
                Thread.sleep(30L);
                return;
            } catch (InterruptedException e) {
                YtLogger.m85809e("ActionLivenessState", "Thread sleep error", e);
                return;
            }
        }
        YTFaceTracker.TrackedFace[] trackedFaceArr = this.f61448c;
        if (trackedFaceArr != null && trackedFaceArr.length > 0 && (i = this.f61447b) > 0) {
            if (i <= 1 || (this.f61428H && this.f61449d == 7)) {
                this.f61421A = this.f61422B;
                YTPoseDetectInterface.reset();
                this.f61457l = false;
            }
            if (this.f61451f == null) {
                YtLogger.m85809e("ActionLivenessState", "FrameHandle is null, check init first", null);
                return;
            }
            YtLogger.m85808d("ActionLivenessState", "pose count" + this.f61421A + " stable " + this.f61422B + " isAction" + this.f61457l);
            if (this.f61430J != this.f61452g && this.f61429I) {
                YtFSM.getInstance().sendFSMEvent(new C14618a());
                this.f61430J = this.f61452g;
            }
            int i2 = this.f61452g;
            if ((i2 == this.f61436P || i2 == this.f61437Q) && !C14664o.m85854a(this.f61448c[0], this.f61433M, this.f61434N, this.f61435O)) {
                this.f61421A = this.f61422B;
                YTPoseDetectInterface.reset();
                this.f61457l = false;
                YtLogger.m85811o("ActionLivenessState", "action correction face failure:" + this.f61452g);
                HashMap<String, Object> map = new HashMap<>();
                map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                map.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_INCORRECT);
                YtFSM.getInstance().sendFSMEvent(map);
                z = false;
            } else {
                z = true;
            }
            if (this.f61452g == 3 && Math.abs(this.f61448c[0].yaw) > 20.0f) {
                this.f61421A = this.f61422B;
                this.f61457l = false;
                HashMap<String, Object> map2 = new HashMap<>();
                map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_INCORRECT);
                YtFSM.getInstance().sendFSMEvent(map2);
                z = false;
            }
            if (this.f61445Y && this.f61452g != 2) {
                float[] fArr = this.f61448c[0].faceShape;
                float fAbs = Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / Math.abs(fArr[90] - fArr[102]);
                YtLogger.m85811o("ActionLivenessState", "action nod head mouth not close!ret:" + fAbs + "|threshold=" + this.f61440T + ",action type:" + this.f61452g);
                StringBuilder sb = new StringBuilder("isMouthCLose  rat=");
                sb.append(fAbs);
                sb.append("|threshold=");
                sb.append(this.f61440T);
                YtLogger.m85808d("ActionLivenessState", sb.toString());
                if (fAbs >= this.f61440T) {
                    this.f61421A = this.f61422B;
                    this.f61457l = false;
                    HashMap<String, Object> map3 = new HashMap<>();
                    map3.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                    map3.put(StateEvent.Name.UI_TIPS, StringCode.FL_CLOSE_MOUTH);
                    YtFSM.getInstance().sendFSMEvent(map3);
                    z = false;
                }
            }
            if (z && this.f61421A > this.f61422B + 10) {
                if (!this.f61457l && !this.f61432L) {
                    int i3 = this.f61452g;
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
                        YtLogger.m85809e("ActionLivenessState", "Action liveness state getTipsByPoseType action error", null);
                        str = StringCode.FL_POSE_KEEP;
                    }
                    YtFSM.getInstance().sendFSMEvent(new C14619b(str));
                }
                YTFaceTracker.TrackedFace trackedFace = this.f61448c[0];
                YTPoseDetectInterface.poseDetect(new PoseDetectData(trackedFace.faceShape, trackedFace.faceVisible, this.f61452g, yTImageData.imgData, trackedFace.pitch, trackedFace.yaw, trackedFace.roll, this.f61449d, this.f61450e, trackedFace.faceRect, yTImageData.width, yTImageData.height, false), this.f61451f, 1);
            }
            this.f61421A++;
        } else if ((trackedFaceArr == null || trackedFaceArr.length == 0) && this.f61444X) {
            YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = this.f61456k;
            YtSDKKitCommon.StateNameHelper.StateClassName stateClassName2 = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            if (stateClassName == stateClassName2) {
                reset();
                ((FaceQualityState) YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE))).reset();
                YTPoseDetectInterface.reset();
                if (this.f61429I) {
                    YtFSM.getInstance().sendFSMEvent(new C14620c(this));
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
                this.f61441U = jSONObject.getBoolean("need_face_quality");
            }
            if (jSONObject.has("video_path")) {
                this.f61459n = jSONObject.getString("video_path");
            } else {
                this.f61459n = YtFSM.getInstance().getContext().currentAppContext.getFilesDir() + "/temp.mp4";
            }
            if (jSONObject.has("local_config_flag")) {
                this.f61462q = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("video_bitrate")) {
                this.f61463r = jSONObject.getInt("video_bitrate");
            }
            if (jSONObject.has("video_framerate")) {
                this.f61464s = jSONObject.getInt("video_framerate");
            }
            if (jSONObject.has("video_iframeinterval")) {
                this.f61465t = jSONObject.getInt("video_iframeinterval");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f61469x = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f61422B = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("control_config")) {
                this.f61423C = jSONObject.getString("control_config");
            }
            if (jSONObject.has("need_close_timeout")) {
                this.f61429I = jSONObject.getBoolean("need_close_timeout");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f61433M = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f61434N = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f61435O = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("continuous_quality_num_threshold")) {
                this.f61442V = jSONObject.getInt("continuous_quality_num_threshold");
            }
            if (jSONObject.has("screen_orientation")) {
                this.f61438R = jSONObject.getInt("screen_orientation");
            }
            if (jSONObject.has("need_best_original_size")) {
                this.f61439S = jSONObject.getInt("need_best_original_size");
            }
            if (jSONObject.has("action_close_mouth_threshold")) {
                this.f61440T = (float) jSONObject.getDouble("action_close_mouth_threshold");
            }
            if (jSONObject.has("need_local_face_best_image")) {
                this.f61444X = jSONObject.getBoolean("need_local_face_best_image");
            }
            if (jSONObject.has("correction_angle_action_type") && (strArrSplit = jSONObject.getString("correction_angle_action_type").split(Constants.SEPARATOR_COMMA)) != null && strArrSplit.length > 0) {
                for (int i = 0; i < strArrSplit.length; i++) {
                    if (i == 0) {
                        this.f61436P = Integer.parseInt(strArrSplit[i]);
                    } else if (i == 1) {
                        this.f61437Q = Integer.parseInt(strArrSplit[i]);
                    }
                }
            }
            this.f61424D = jSONObject.optInt("action_frame_num", 20);
            this.f61425E = jSONObject.optInt("last_action_frame_num", 3);
            this.f61426F = jSONObject.optString("anchor_widths", "480,240,240");
            this.f61428H = jSONObject.optBoolean("need_check_multiface", false);
            this.f61445Y = jSONObject.optBoolean("need_pose_check_mouth_open", false);
        } catch (JSONException e) {
            e.printStackTrace();
            YtLogger.m85809e("ActionLivenessState", "action load failed1:", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m85823a() {
        this.f61455j = 0;
        this.f61457l = false;
        this.f61421A = 0;
        this.f61449d = -1;
        this.f61432L = false;
        this.f61443W = false;
        String[] strArr = this.f61453h;
        this.f61454i = 0;
        m85824a(strArr, 0);
        this.f61456k = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        try {
            C14665p c14665p = this.f61458m;
            if (c14665p != null) {
                c14665p.f61659a.abortEncoding();
            }
        } catch (Exception e) {
            YtLogger.m85809e("ActionLivenessState", "video error:", e);
        }
        this.f61451f = new C14627j();
        YTPoseDetectInterface.start(YtFSM.getInstance().getContext().currentAppContext, YtFSM.getInstance().getContext().currentRotateState, new C14628k(this));
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState$j */
    public class C14627j implements YTPoseDetectInterface.InterfaceC14670b {
        public C14627j() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m85826a(byte[] bArr, int i, int i2, int i3) {
            YtLogger.m85810i("ActionLivenessState", "codec info: rotatedWith: " + i + "rotatedHeight: " + i2 + " bitrate: " + ActionLivenessState.this.f61463r + " framerate" + ActionLivenessState.this.f61464s + " iframeinterval" + ActionLivenessState.this.f61465t);
            ActionLivenessState actionLivenessState = ActionLivenessState.this;
            C14665p c14665p = actionLivenessState.f61458m;
            if (!c14665p.f61667i) {
                int i4 = actionLivenessState.f61438R;
                c14665p.f61667i = true;
                if (c14665p.f61668j) {
                    if (!c14665p.f61659a.isEncodingStarted()) {
                        try {
                            c14665p.f61659a.startEncoding(i, i2, new File(c14665p.f61660b), c14665p.f61661c, c14665p.f61662d, c14665p.f61663e, i4);
                        } catch (Exception unused) {
                        }
                    }
                }
                YtLogger.m85809e("p", "sunny-start video encode error", null);
                return false;
            }
            C14665p c14665p2 = ActionLivenessState.this.f61458m;
            c14665p2.getClass();
            try {
                c14665p2.f61659a.queueFrame(new YTImageData(bArr, i, i2));
                c14665p2.f61659a.encode(c14665p2.f61662d);
                return true;
            } catch (Exception e) {
                YtLogger.m85809e("p", "encode frame error:", e);
                return false;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m85825a(int i, String str, String str2) {
            YtSDKStats.getInstance().reportInfo("pose state " + i);
            YtLogger.m85808d("ActionLivenessState", "YTPoseDetectInterface.poseDetect.onFailed: " + i + " s: " + str);
            ActionLivenessState actionLivenessState = ActionLivenessState.this;
            actionLivenessState.f61455j = actionLivenessState.f61455j + 1;
        }
    }
}
