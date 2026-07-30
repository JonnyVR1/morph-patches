package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSWidgeAnimationType;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.EncryptUtil;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo;
import com.tencent.youtu.ytposedetect.data.ActionData;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NetLivenessReqResultState extends YtFSMBaseState {

    /* JADX INFO: renamed from: a */
    public String f61517a;

    /* JADX INFO: renamed from: c */
    public String f61519c;

    /* JADX INFO: renamed from: d */
    public int f61520d;

    /* JADX INFO: renamed from: e */
    public YTImageData f61521e;

    /* JADX INFO: renamed from: b */
    public String f61518b = "";

    /* JADX INFO: renamed from: f */
    public boolean f61522f = false;

    /* JADX INFO: renamed from: g */
    public int f61523g = 70;

    /* JADX INFO: renamed from: h */
    public HashMap<String, String> f61524h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public JSONObject f61525i = null;

    /* JADX INFO: renamed from: j */
    public int f61526j = 0;

    /* JADX INFO: renamed from: k */
    public boolean f61527k = false;

    /* JADX INFO: renamed from: l */
    public String f61528l = "";

    /* JADX INFO: renamed from: m */
    public String f61529m = "";

    /* JADX INFO: renamed from: n */
    public int f61530n = 2;

    /* JADX INFO: renamed from: o */
    public boolean f61531o = false;

    /* JADX INFO: renamed from: p */
    public int f61532p = 0;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$a */
    public class C14635a extends HashMap<String, Object> {
        public C14635a(NetLivenessReqResultState netLivenessReqResultState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$b */
    public class C14636b extends HashMap<String, Object> {
        public C14636b(NetLivenessReqResultState netLivenessReqResultState) {
            put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.NET_REQ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b A[Catch: JSONException -> 0x0090, TryCatch #5 {JSONException -> 0x0090, blocks: (B:22:0x0087, B:24:0x008b, B:27:0x0095, B:29:0x009b, B:30:0x00a0, B:32:0x00a6), top: B:90:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0095 A[Catch: JSONException -> 0x0090, TryCatch #5 {JSONException -> 0x0090, blocks: (B:22:0x0087, B:24:0x008b, B:27:0x0095, B:29:0x009b, B:30:0x00a0, B:32:0x00a6), top: B:90:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b A[Catch: JSONException -> 0x0090, TryCatch #5 {JSONException -> 0x0090, blocks: (B:22:0x0087, B:24:0x008b, B:27:0x0095, B:29:0x009b, B:30:0x00a0, B:32:0x00a6), top: B:90:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[Catch: JSONException -> 0x0090, TryCatch #5 {JSONException -> 0x0090, blocks: (B:22:0x0087, B:24:0x008b, B:27:0x0095, B:29:0x009b, B:30:0x00a0, B:32:0x00a6), top: B:90:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[Catch: JSONException -> 0x0090, TRY_LEAVE, TryCatch #5 {JSONException -> 0x0090, blocks: (B:22:0x0087, B:24:0x008b, B:27:0x0095, B:29:0x009b, B:30:0x00a0, B:32:0x00a6), top: B:90:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: JSONException -> 0x00e5, TRY_LEAVE, TryCatch #2 {JSONException -> 0x00e5, blocks: (B:43:0x00ce, B:45:0x00d4, B:42:0x00b9), top: B:84:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x016b  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m85834a(NetLivenessReqResultState netLivenessReqResultState, HashMap map, Exception exc) {
        int i;
        boolean zHas;
        int i2;
        int i3;
        Object obj;
        int i4;
        HashMap<String, Object> map2;
        netLivenessReqResultState.getClass();
        YtSDKStats.getInstance().exitState();
        if (exc != null) {
            YtLogger.m85810i("NetLivenessReqResultState", "failed: error");
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_NETWORK_ERROR, exc.getMessage());
            String message = exc.getMessage();
            if (map != null && map.containsKey("response")) {
                message = (String) map.get("response");
            }
            YtFSM.getInstance().sendFSMEvent(new C14656g(netLivenessReqResultState, message));
            return;
        }
        int i5 = -1;
        try {
            JSONObject jSONObject = new JSONObject((String) map.get("response"));
            zHas = jSONObject.has(FirebaseAnalytics.Param.SCORE);
            try {
                if (jSONObject.has("errorcode")) {
                    i = 0;
                    if (netLivenessReqResultState.f61526j == 0) {
                        i4 = jSONObject.getInt("errorcode");
                    } else if (jSONObject.has(StateEvent.Name.ERROR_CODE)) {
                        i4 = jSONObject.getInt(StateEvent.Name.ERROR_CODE);
                    } else if (jSONObject.has("errorcode")) {
                        i4 = jSONObject.getInt("errorcode");
                    } else {
                        i4 = -1;
                    }
                    if (zHas) {
                        i2 = jSONObject.getInt(FirebaseAnalytics.Param.SCORE);
                    } else {
                        i2 = -1;
                    }
                    YtLogger.m85810i("NetLivenessReqResultState", "errorcode: " + i4 + " score " + i2);
                    if (jSONObject.has("similarity_float")) {
                        i3 = jSONObject.getInt("similarity_float");
                        if (i3 == -1) {
                            obj = StringCode.RST_FAILED;
                        } else if (i3 > netLivenessReqResultState.f61523g) {
                            obj = StringCode.RST_SUCCEED;
                        } else {
                            obj = StringCode.RST_FAILED;
                        }
                        i5 = i3;
                    } else {
                        obj = StringCode.RST_FAILED;
                    }
                } else {
                    try {
                        if (jSONObject.has(StateEvent.Name.ERROR_CODE)) {
                            i = 0;
                            try {
                                if (netLivenessReqResultState.f61526j == 0) {
                                    i4 = jSONObject.getInt("errorcode");
                                } else if (jSONObject.has(StateEvent.Name.ERROR_CODE)) {
                                    i4 = jSONObject.getInt(StateEvent.Name.ERROR_CODE);
                                } else if (jSONObject.has("errorcode")) {
                                    i4 = jSONObject.getInt("errorcode");
                                } else {
                                    i4 = -1;
                                }
                                if (zHas) {
                                    try {
                                        i2 = jSONObject.getInt(FirebaseAnalytics.Param.SCORE);
                                    } catch (JSONException e) {
                                        e = e;
                                        i2 = -1;
                                        i3 = -1;
                                        i5 = i4;
                                        YtLogger.m85809e("NetLivenessReqResultState", "handleResponseEvent error", e);
                                        obj = StringCode.RST_FAILED;
                                        i4 = i5;
                                        i5 = i3;
                                        map2 = new HashMap<>();
                                        YtLogger.m85810i("NetLivenessReqResultState", "errorcode: " + i4 + " score " + i2);
                                        int i6 = i5;
                                        if (i4 == 0) {
                                        }
                                        if (zHas) {
                                            map2.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(i4));
                                        } else {
                                            map2.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(i4));
                                        }
                                        map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                                        map2.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                                        map2.put(StateEvent.Name.PROCESS_RESULT, "failed");
                                        map2.put(StateEvent.Name.ERROR_CODE, 4194304);
                                        map2.put("message", CommonUtils.makeMessageJson(i4, StringCode.RST_FAILED, (String) map.get("response")));
                                        YtSDKStats.getInstance().reportInfo("errorCode " + i4);
                                        YtFSM.getInstance().sendFSMEvent(map2);
                                    }
                                } else {
                                    i2 = -1;
                                }
                                try {
                                    YtLogger.m85810i("NetLivenessReqResultState", "errorcode: " + i4 + " score " + i2);
                                } catch (JSONException e2) {
                                    e = e2;
                                    i3 = -1;
                                    i5 = i4;
                                    YtLogger.m85809e("NetLivenessReqResultState", "handleResponseEvent error", e);
                                    obj = StringCode.RST_FAILED;
                                    i4 = i5;
                                    i5 = i3;
                                    map2 = new HashMap<>();
                                    YtLogger.m85810i("NetLivenessReqResultState", "errorcode: " + i4 + " score " + i2);
                                    int i7 = i5;
                                    if (i4 == 0) {
                                    }
                                    if (zHas) {
                                        map2.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(i4));
                                    } else {
                                        map2.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(i4));
                                    }
                                    map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                                    map2.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                                    map2.put(StateEvent.Name.PROCESS_RESULT, "failed");
                                    map2.put(StateEvent.Name.ERROR_CODE, 4194304);
                                    map2.put("message", CommonUtils.makeMessageJson(i4, StringCode.RST_FAILED, (String) map.get("response")));
                                    YtSDKStats.getInstance().reportInfo("errorCode " + i4);
                                    YtFSM.getInstance().sendFSMEvent(map2);
                                }
                            } catch (JSONException e3) {
                                e = e3;
                                i2 = -1;
                                i3 = -1;
                                YtLogger.m85809e("NetLivenessReqResultState", "handleResponseEvent error", e);
                                obj = StringCode.RST_FAILED;
                                i4 = i5;
                            }
                        } else {
                            YtLogger.m85809e("NetLivenessReqResultState", "response not right", null);
                            i2 = -1;
                            i4 = -1;
                            i = 0;
                        }
                        if (jSONObject.has("similarity_float")) {
                            i3 = jSONObject.getInt("similarity_float");
                            if (i3 == -1) {
                                try {
                                    if (i3 > netLivenessReqResultState.f61523g) {
                                        obj = StringCode.RST_SUCCEED;
                                    } else {
                                        obj = StringCode.RST_FAILED;
                                    }
                                } catch (JSONException e4) {
                                    e = e4;
                                    i5 = i4;
                                    YtLogger.m85809e("NetLivenessReqResultState", "handleResponseEvent error", e);
                                    obj = StringCode.RST_FAILED;
                                    i4 = i5;
                                }
                            } else {
                                obj = StringCode.RST_FAILED;
                            }
                            i5 = i3;
                        } else {
                            obj = StringCode.RST_FAILED;
                        }
                    } catch (JSONException e5) {
                        e = e5;
                        i2 = -1;
                        i3 = -1;
                        i = 0;
                        YtLogger.m85809e("NetLivenessReqResultState", "handleResponseEvent error", e);
                        obj = StringCode.RST_FAILED;
                        i4 = i5;
                    }
                }
            } catch (JSONException e6) {
                e = e6;
                i = 0;
            }
        } catch (JSONException e7) {
            e = e7;
            i = 0;
            zHas = false;
        }
        map2 = new HashMap<>();
        YtLogger.m85810i("NetLivenessReqResultState", "errorcode: " + i4 + " score " + i2);
        int i8 = i5;
        if (i4 == 0 || (zHas && i2 < netLivenessReqResultState.f61520d)) {
            if (zHas || i2 >= netLivenessReqResultState.f61520d) {
                map2.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(i4));
            } else {
                map2.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(ErrorCode.YT_SDK_VERIFY_SCORE_FAILED));
            }
            map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
            map2.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
            map2.put(StateEvent.Name.PROCESS_RESULT, "failed");
            map2.put(StateEvent.Name.ERROR_CODE, 4194304);
            map2.put("message", CommonUtils.makeMessageJson(i4, StringCode.RST_FAILED, (String) map.get("response")));
        } else {
            map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
            map2.put(StateEvent.Name.UI_TIPS, StringCode.RST_SUCCEED);
            map2.put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.SUCCEED);
            map2.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(i));
            map2.put("message", CommonUtils.makeMessageJson(i, StringCode.RST_SUCCEED, (String) map.get("response")));
            map2.put(StateEvent.Name.EXTRA_MESSAGE, netLivenessReqResultState.f61521e);
            if (i8 > 0) {
                map2.put(StateEvent.Name.CMP_MESSAGE, obj);
                map2.put(StateEvent.Name.CMP_SCORE, Integer.valueOf(i8));
            }
        }
        YtSDKStats.getInstance().reportInfo("errorCode " + i4);
        YtFSM.getInstance().sendFSMEvent(map2);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        String strMakeReflectLiveReq;
        String str;
        String str2;
        String str3;
        String strGenerateSMReq;
        super.enter();
        if (this.isPause.get()) {
            YtFSM.getInstance().sendFSMEvent(new C14635a(this));
            try {
                Thread.sleep(30L);
            } catch (InterruptedException e) {
                YtLogger.m85809e("NetLivenessReqResultState", "Thread sleep error", e);
            }
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
            return;
        }
        YtFSM.getInstance().sendFSMEvent(new C14636b(this));
        int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            CommonUtils.benchMarkBegin("make_pack_use_time");
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            if (stateByName == null) {
                YtSDKStats.getInstance().reportInfo("action request action state is null");
                YtLogger.m85809e("NetLivenessReqResultState", "action request action state is null", null);
                return;
            }
            try {
                this.f61521e = (YTImageData) stateByName.getStateDataBy("best_frame");
                String str4 = stateByName.getStateDataBy("frames") instanceof String ? (String) stateByName.getStateDataBy("frames") : new String(Base64.encode(((ActionData) stateByName.getStateDataBy("frames")).video, 2));
                String strM85835a = m85835a((String[]) stateByName.getStateDataBy("action_seq"));
                m85836a();
                YtLivenessNetProtoHelper.ActionLiveReqData actionLiveReqData = new YtLivenessNetProtoHelper.ActionLiveReqData();
                YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
                actionLiveReqData.baseInfo = netBaseInfoData;
                netBaseInfoData.appId = this.f61517a;
                netBaseInfoData.sessionId = UUID.randomUUID().toString();
                actionLiveReqData.bestImage = new String(Base64.encode(this.f61521e.imgData, 2));
                actionLiveReqData.actionStr = strM85835a;
                actionLiveReqData.actionVideo = str4;
                actionLiveReqData.needEyeDetect = true;
                actionLiveReqData.needMouthDetect = true;
                actionLiveReqData.reflectConfig = this.f61528l;
                actionLiveReqData.controlConfig = this.f61529m;
                actionLiveReqData.colorNum = this.f61530n;
                String strMakeActionLiveReq = YtLivenessNetProtoHelper.makeActionLiveReq(actionLiveReqData);
                OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time"));
                YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.f61519c, strMakeActionLiveReq, null, new C14657h(this));
                return;
            } catch (Exception e2) {
                YtLogger.m85809e("NetLivenessReqResultState", "action request failed", e2);
                YtSDKStats.getInstance().reportInfo("action request failed: " + e2.getLocalizedMessage());
                YtFSM.getInstance().sendFSMEvent(new C14658i(this, e2));
                return;
            }
        }
        if (iOrdinal == 4) {
            CommonUtils.benchMarkBegin("make_pack_use_time");
            CommonUtils.benchMarkBegin("reflect_request_s1");
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            YTImageData yTImageData = (YTImageData) stateByName2.getStateDataBy("best_image");
            this.f61521e = yTImageData;
            byte[] bArrEncode = Base64.encode(yTImageData.imgData, 2);
            this.stateData.put("best_frame", this.f61521e);
            YtFSMBaseState stateByName3 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            YtFSMBaseState stateByName4 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            ReflectLiveReq reflectLiveReq = (ReflectLiveReq) stateByName3.getStateDataBy("reflect_request_object");
            String str5 = (String) stateByName4.getStateDataBy("extra_config");
            if (str5 != null) {
                this.f61528l = str5;
            }
            String str6 = (String) stateByName3.getStateDataBy("refcontrol_begin");
            if (str6 != null) {
                StringBuilder sb = new StringBuilder();
                String str7 = this.f61528l;
                sb.append(str7 != null ? str7 : "");
                sb.append(" refcontrol_begin ");
                sb.append(str6);
                this.f61528l = sb.toString();
            }
            String str8 = (String) stateByName4.getStateDataBy("cp_num");
            if (str8 != null) {
                this.f61530n = Integer.parseInt(str8);
            }
            reflectLiveReq.session_id = UUID.randomUUID().toString();
            YtLivenessNetProtoHelper.ReflectLiveReqData reflectLiveReqData = new YtLivenessNetProtoHelper.ReflectLiveReqData();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData2 = new YtLivenessNetProtoHelper.NetBaseInfoData();
            reflectLiveReqData.baseInfo = netBaseInfoData2;
            netBaseInfoData2.appId = this.f61517a;
            netBaseInfoData2.sessionId = UUID.randomUUID().toString();
            reflectLiveReqData.baseInfo.businessId = this.f61524h.containsKey("business_id") ? this.f61524h.get("business_id") : null;
            reflectLiveReqData.baseInfo.personId = this.f61524h.containsKey("person_id") ? this.f61524h.get("person_id") : null;
            reflectLiveReqData.baseInfo.personType = this.f61524h.containsKey("person_type") ? this.f61524h.get("person_type") : null;
            reflectLiveReqData.baseInfo.reqType = this.f61524h.containsKey("req_type") ? this.f61524h.get("req_type") : null;
            reflectLiveReqData.baseInfo.liveType = this.f61524h.containsKey("live_type") ? Integer.parseInt(this.f61524h.get("live_type")) : 0;
            reflectLiveReqData.colorData = reflectLiveReq.color_data;
            reflectLiveReqData.liveImage = new String(bArrEncode);
            reflectLiveReqData.reflectData = reflectLiveReq.reflect_data;
            reflectLiveReqData.config = this.f61528l;
            reflectLiveReqData.colorNum = this.f61530n;
            if (this.f61526j == 2) {
                YuvImage yuvImage = (YuvImage) stateByName2.getStateDataBy("best_image");
                float[] fArr = (float[]) stateByName2.getStateDataBy("best_shape");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yuvImage.compressToJpeg(new Rect(0, 0, this.f61521e.getWidth(), this.f61521e.getHeight()), 95, byteArrayOutputStream);
                reflectLiveReqData.bestImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream.toByteArray(), fArr, (String) null);
                YuvImage yuvImage2 = (YuvImage) stateByName2.getStateDataBy("openmouth_image");
                float[] fArr2 = (float[]) stateByName2.getStateDataBy("openmouth_shape");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                yuvImage2.compressToJpeg(new Rect(0, 0, yuvImage2.getWidth(), yuvImage2.getHeight()), 95, byteArrayOutputStream2);
                reflectLiveReqData.openMouthImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream2.toByteArray(), fArr2, (String) null);
                YuvImage yuvImage3 = (YuvImage) stateByName2.getStateDataBy("closeeye_image");
                float[] fArr3 = (float[]) stateByName2.getStateDataBy("closeeye_shape");
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                yuvImage3.compressToJpeg(new Rect(0, 0, yuvImage3.getWidth(), yuvImage3.getHeight()), 95, byteArrayOutputStream3);
                reflectLiveReqData.closeEyeImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream3.toByteArray(), fArr3, (String) null);
                strMakeReflectLiveReq = YtLivenessNetProtoHelper.makePersonLiveReq(reflectLiveReqData);
            } else {
                strMakeReflectLiveReq = YtLivenessNetProtoHelper.makeReflectLiveReq(reflectLiveReqData);
            }
            String str9 = strMakeReflectLiveReq;
            YtLogger.m85808d("NetLivenessReqResultState", "begin request...uploadsize " + str9.length());
            CommonUtils.benchMarkEnd("reflect_request_s1");
            CommonUtils.benchMarkBegin("reflect_request_s2");
            OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time"));
            YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.f61519c, str9, null, new C14659j(this));
            return;
        }
        if (iOrdinal != 5) {
            return;
        }
        try {
            CommonUtils.benchMarkBegin("make_pack_use_time");
            YtFSMBaseState stateByName5 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            YtFSMBaseState stateByName6 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            YTImageData yTImageData2 = (YTImageData) stateByName6.getStateDataBy("best_frame");
            this.f61521e = yTImageData2;
            this.stateData.put("best_frame", yTImageData2);
            YtFSMBaseState stateByName7 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            ActionReflectReq actionReflectReq = (ActionReflectReq) stateByName7.getStateDataBy("reflect_request_object");
            if (stateByName6.getStateDataBy("frames") instanceof String) {
                str2 = stateByName6.getStateDataBy("frames").toString();
                str3 = null;
                str = null;
            } else {
                ActionData actionData = (ActionData) stateByName6.getStateDataBy("frames");
                String str10 = actionData.videoMD;
                str = actionData.sdMD;
                byte[] bArr = actionData.video;
                if (bArr == null) {
                    YtLogger.m85813w("NetLivenessReqResultState", "action data is null", null);
                    str3 = str10;
                    str2 = null;
                } else {
                    str2 = new String(Base64.encode(bArr, 2));
                    str3 = str10;
                    str = str;
                }
            }
            String str11 = (String) stateByName5.getStateDataBy("control_config");
            if (str11 != null) {
                this.f61529m = str11;
            }
            String str12 = (String) stateByName5.getStateDataBy("extra_config");
            if (str12 != null) {
                this.f61528l = str12;
                YtLogger.m85808d("NetLivenessReqResultState", "extraconfig:" + this.f61528l);
            }
            String str13 = (String) stateByName7.getStateDataBy("refcontrol_begin");
            if (str13 != null) {
                StringBuilder sb2 = new StringBuilder();
                String str14 = this.f61528l;
                if (str14 == null) {
                    str14 = "";
                }
                sb2.append(str14);
                sb2.append(" refcontrol_begin ");
                sb2.append(str13);
                this.f61528l = sb2.toString();
            }
            String str15 = (String) stateByName5.getStateDataBy("cp_num");
            if (str15 != null) {
                this.f61530n = Integer.parseInt(str15);
                YtLogger.m85808d("NetLivenessReqResultState", "cpnum:" + this.f61530n);
            }
            m85836a();
            String strM85835a2 = m85835a((String[]) stateByName6.getStateDataBy("action_seq"));
            YtLivenessNetProtoHelper.ActionReflectLiveReqData actionReflectLiveReqData = new YtLivenessNetProtoHelper.ActionReflectLiveReqData();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData3 = new YtLivenessNetProtoHelper.NetBaseInfoData();
            actionReflectLiveReqData.baseInfo = netBaseInfoData3;
            netBaseInfoData3.sessionId = UUID.randomUUID().toString();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData4 = actionReflectLiveReqData.baseInfo;
            netBaseInfoData4.appId = this.f61517a;
            netBaseInfoData4.businessId = "";
            actionReflectLiveReqData.colorData = actionReflectReq.color_data;
            actionReflectLiveReqData.actionVideo = str2 != null ? str2 : "";
            actionReflectLiveReqData.actionStr = strM85835a2;
            YTImageInfo yTImageInfo = actionReflectReq.eye_image;
            actionReflectLiveReqData.eyeImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo.image, yTImageInfo.five_points, yTImageInfo.checksum);
            YTImageInfo yTImageInfo2 = actionReflectReq.mouth_image;
            actionReflectLiveReqData.mouthImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo2.image, yTImageInfo2.five_points, yTImageInfo2.checksum);
            YTImageInfo yTImageInfo3 = actionReflectReq.live_image;
            actionReflectLiveReqData.liveImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo3.image, yTImageInfo3.five_points, yTImageInfo3.checksum);
            actionReflectLiveReqData.reflectData = actionReflectReq.reflect_data;
            actionReflectLiveReqData.baseInfo.lux = actionReflectReq.select_data.android_data.lux;
            actionReflectLiveReqData.reflectConfig = this.f61528l;
            actionReflectLiveReqData.controlConfig = this.f61529m;
            actionReflectLiveReqData.colorNum = this.f61530n;
            String version = YTPoseDetectJNIInterface.getVersion();
            if (str3 != null) {
                actionReflectLiveReqData.config = "videochecksum=" + str3 + "&&client_version=" + version;
            } else {
                actionReflectLiveReqData.config = "client_version=" + version;
            }
            String strMakeActionReflectLiveReq = YtLivenessNetProtoHelper.makeActionReflectLiveReq(actionReflectLiveReqData, str3, str);
            YtFSM.getInstance().sendFSMEvent(new C14660k(this, str, str3));
            if (this.f61525i != null) {
                try {
                    JSONObject jSONObject = new JSONObject(strMakeActionReflectLiveReq);
                    Iterator<String> itKeys = this.f61525i.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, this.f61525i.get(next));
                    }
                    strMakeActionReflectLiveReq = jSONObject.toString();
                } catch (JSONException e3) {
                    YtLogger.m85809e("NetLivenessReqResultState", "lipread net request parse json failed ", e3);
                }
            }
            if (this.f61531o) {
                EncryptUtil encryptUtil = new EncryptUtil();
                int i = this.f61532p;
                if (i == 0) {
                    strGenerateSMReq = encryptUtil.generateEncReq(strMakeActionReflectLiveReq, this.f61517a, this.f61518b, Constants.KEY_CONFIG);
                } else if (i == 1) {
                    strGenerateSMReq = encryptUtil.generateSMReq(strMakeActionReflectLiveReq, this.f61517a, this.f61518b);
                }
                strMakeActionReflectLiveReq = strGenerateSMReq;
            }
            String str16 = strMakeActionReflectLiveReq;
            OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time"));
            YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.f61519c, str16, null, new C14661l(this));
        } catch (Exception e4) {
            YtLogger.m85809e("NetLivenessReqResultState", "actrefl request failed", e4);
            YtSDKStats.getInstance().reportInfo("actrefl request failed: " + e4.getLocalizedMessage());
            YtFSM.getInstance().sendFSMEvent(new C14655f(this, e4));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        try {
            this.f61517a = jSONObject.getString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID);
            String string = jSONObject.getString("result_api_url");
            this.f61519c = string;
            if (string == null) {
                YtSDKStats.getInstance().reportError(3145728, "yt_param_error");
                YtLogger.m85809e("NetLivenessReqResultState", "parse url failed", null);
                return;
            }
            if (jSONObject.has("secret_key")) {
                jSONObject.getString("secret_key");
            }
            if (jSONObject.has("secret_id")) {
                jSONObject.getString("secret_id");
            }
            if (jSONObject.has("user_id")) {
                jSONObject.getString("user_id");
            }
            if (jSONObject.has("similarity_threshold")) {
                this.f61523g = jSONObject.getInt("similarity_threshold");
            }
            if (jSONObject.has("final_liveness_confidence_threshold")) {
                this.f61520d = jSONObject.getInt("final_liveness_confidence_threshold");
            } else {
                this.f61520d = 85;
            }
            if (jSONObject.has("extra_config")) {
                this.f61528l = jSONObject.getString("extra_config");
            } else {
                this.f61528l = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.f61529m = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f61530n = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f61522f = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("request_options")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("request_options");
                this.f61525i = jSONObject2;
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.f61524h.put(next, this.f61525i.getString(next));
                }
            }
            if (jSONObject.has("backend_proto_type")) {
                this.f61526j = jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("need_encrypt")) {
                this.f61531o = jSONObject.getBoolean("need_encrypt");
            }
            if (jSONObject.has("session_id")) {
                this.f61518b = jSONObject.getString("session_id");
            }
            if (jSONObject.has("enhance_encrypt_method")) {
                this.f61532p = jSONObject.getInt("enhance_encrypt_method");
            }
            if (jSONObject.has("resource_online")) {
                this.f61527k = jSONObject.getBoolean("resource_online");
            }
            if (!this.f61527k && this.f61531o && this.f61532p == 1) {
                FileUtils.loadLibrary("TencentSM");
            }
        } catch (JSONException e) {
            YtLogger.m85809e("NetLivenessReqResultState", "Failed to parse json:", e);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
    }

    /* JADX INFO: renamed from: a */
    public static void m85833a(NetLivenessReqResultState netLivenessReqResultState) {
        if (netLivenessReqResultState.f61522f) {
            try {
                YtFSM ytFSM = YtFSM.getInstance();
                YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
                ytFSM.getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)).handleStateAction("reset_manual_trigger", null);
                if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)) == -1) {
                    netLivenessReqResultState.sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName));
                }
            } catch (Exception e) {
                String str = "on Check response manual failed " + e.getLocalizedMessage();
                YtLogger.m85809e("NetLivenessReqResultState", "on Check response manual failed", e);
                YtSDKStats.getInstance().reportInfo(str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m85836a() {
        if (this.f61529m.isEmpty()) {
            return;
        }
        String[] strArrSplit = this.f61529m.split("&");
        if (strArrSplit.length > 0) {
            for (String str : strArrSplit) {
                String[] strArrSplit2 = str.split("=");
                if (strArrSplit2.length > 1 && strArrSplit2[0].equals("actref_ux_mode")) {
                    Integer.parseInt(strArrSplit2[1]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m85835a(String[] strArr) {
        String str = "";
        for (int i = 0; i < strArr.length; i++) {
            int i2 = Integer.parseInt(strArr[i]);
            if (i2 == 0 || i2 == 1) {
                str = str + "blink";
            } else if (i2 == 2) {
                str = str + "mouth";
            } else if (i2 == 3) {
                str = str + "node";
            } else if (i2 == 4) {
                str = str + OMSWidgeAnimationType.shake;
            } else if (i2 == 5) {
                str = str + "silence";
            }
            if (i != strArr.length - 1) {
                str = str + Constants.SEPARATOR_COMMA;
            }
        }
        return str;
    }
}
