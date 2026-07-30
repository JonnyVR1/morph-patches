package com.tencent.youtu.sdkkitframework.liveness;

import com.clevertap.android.sdk.Constants;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NetFetchState extends YtFSMBaseState {

    /* JADX INFO: renamed from: a */
    public String f60659a;

    /* JADX INFO: renamed from: b */
    public String f60660b;

    /* JADX INFO: renamed from: c */
    public String f60661c = "";

    /* JADX INFO: renamed from: d */
    public String f60662d = "";

    /* JADX INFO: renamed from: e */
    public boolean f60663e = false;

    /* JADX INFO: renamed from: f */
    public boolean f60664f = false;

    /* JADX INFO: renamed from: g */
    public String f60665g = "";

    /* JADX INFO: renamed from: h */
    public String f60666h = "";

    /* JADX INFO: renamed from: i */
    public int f60667i = 2;

    /* JADX INFO: renamed from: j */
    public JSONObject f60668j = null;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState$a */
    public class C14485a extends HashMap<String, Object> {
        public C14485a(NetFetchState netFetchState) {
            put(StateEvent.Name.UI_TIPS, StringCode.NET_FETCH_DATA);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState$b */
    public class C14486b extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f60669a;

        public C14486b(NetFetchState netFetchState, String str) {
            this.f60669a = str;
            put("ui_error", 4194304);
            put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, 4194304);
            put("message", CommonUtils.makeMessageJson(4194304, StringCode.MSG_PARAM_ERROR, str));
        }
    }

    /* JADX INFO: renamed from: a */
    public String m84661a(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str.split("&");
        if (strArrSplit.length > 0) {
            boolean z = false;
            boolean z2 = true;
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split("=");
                if (strArrSplit2.length > 1) {
                    if (strArrSplit2[0].equals("need_action_video")) {
                        if (!strArrSplit2[1].equals("true")) {
                            YtLogger.m84642w("NetFetchState", "Background configuration error！ 'need_action_video' is false,but must has video!!", null);
                        }
                        z = true;
                    } else if (z2) {
                        sb.append(strArrSplit2[0]);
                        sb.append("=");
                        sb.append(strArrSplit2[1]);
                        z2 = false;
                    } else {
                        sb.append("&");
                        sb.append(strArrSplit2[0]);
                        sb.append("=");
                        sb.append(strArrSplit2[1]);
                    }
                }
            }
            if (z) {
                sb.append("&need_action_video=true");
            }
        }
        return sb.toString();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        YtFSM.getInstance().sendFSMEvent(new C14485a(this));
        int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            String str = YTAGReflectLiveCheckInterface.TAG;
            LiveStyleRequester.SeleceData seleceData = new LiveStyleRequester.SeleceData(-10000.0f);
            this.stateData.put("select_data", seleceData);
            if ((this.f60661c.isEmpty() || !this.f60663e) && this.f60660b != null) {
                YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData = new YtLivenessNetProtoHelper.GetLiveTypeReqData();
                YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
                getLiveTypeReqData.baseInfo = netBaseInfoData;
                netBaseInfoData.appId = this.f60659a;
                netBaseInfoData.businessId = "wx_default";
                netBaseInfoData.lux = seleceData.android_data.lux;
                getLiveTypeReqData.reflectConfig = this.f60665g;
                getLiveTypeReqData.controlConfig = this.f60666h;
                getLiveTypeReqData.colorNum = this.f60667i;
                String strMakeGetLiveTypeReq = YtLivenessNetProtoHelper.makeGetLiveTypeReq(getLiveTypeReqData);
                YtLogger.m84639i("NetFetchState", "Use online data ---> on get config info: " + strMakeGetLiveTypeReq);
                YtFSM.getInstance().sendNetworkRequest(StringCode.NET_FETCH_DATA, this.f60660b, strMakeGetLiveTypeReq, null, new C14506e(this, getLiveTypeReqData));
                return;
            }
            YtLogger.m84639i("NetFetchState", "Use local data");
            this.stateData.put("color_data", this.f60661c);
            this.stateData.put("action_data", this.f60662d);
            YtLogger.m84637d("NetFetchState", "select data:" + this.f60668j);
            JSONObject jSONObject = this.f60668j;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has(Constants.KEY_CONFIG)) {
                        this.stateData.put("control_config", this.f60668j.getString(Constants.KEY_CONFIG));
                    }
                    if (this.f60668j.has("reflect_param")) {
                        this.stateData.put("extra_config", this.f60668j.getString("reflect_param"));
                    }
                    if (this.f60668j.has("change_point_num")) {
                        this.stateData.put("cp_num", this.f60668j.getString("change_point_num"));
                    }
                } catch (JSONException e) {
                    String str2 = "Select data parse failed " + e.getLocalizedMessage();
                    YtLogger.m84638e("NetFetchState", str2, e);
                    YtSDKStats.getInstance().reportInfo(str2);
                }
            } else {
                YtLogger.m84638e("NetFetchState", "select data is null", null);
                YtSDKStats.getInstance().reportInfo("select data is null");
            }
            moveToNextState();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.m84640o("NetFetchState", makeStateInfo("NetFetchState", 1));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        try {
            String string = jSONObject.getString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID);
            this.f60659a = string;
            if (string == null) {
                YtSDKStats.getInstance().reportError(3145728, "yt_param_error");
            }
            if (jSONObject.has("config_api_url")) {
                this.f60660b = jSONObject.getString("config_api_url");
            }
            if (jSONObject.has("color_data")) {
                this.f60661c = jSONObject.getString("color_data");
            }
            if (jSONObject.has("local_config_flag")) {
                this.f60663e = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("action_default_seq")) {
                JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f60662d += jSONArray.getString(i);
                    if (i < jSONArray.length() - 1) {
                        this.f60662d += Constants.SEPARATOR_COMMA;
                    }
                }
            } else {
                this.f60662d = "0";
            }
            if (jSONObject.has("extra_config")) {
                this.f60665g = jSONObject.getString("extra_config");
            } else {
                this.f60665g = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.f60666h = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f60667i = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("select_data")) {
                this.f60668j = jSONObject.getJSONObject("select_data");
            }
            if (jSONObject.has("backend_proto_type")) {
                jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
            this.f60664f = jSONObject.optBoolean("action_local_config_flag", false);
        } catch (JSONException e) {
            e.printStackTrace();
            YtLogger.m84638e("NetFetchState", "Failed to parse json:", e);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            YtFSM ytFSM = YtFSM.getInstance();
            YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            if (ytFSM.transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)) == -1) {
                sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName));
                return;
            }
            return;
        }
        String str = "msg_param_error current unknown work mode:" + YtFSM.getInstance().getWorkMode();
        YtSDKStats.getInstance().reportError(4194304, str);
        YtFSM.getInstance().sendFSMEvent(new C14486b(this, str));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
    }
}
