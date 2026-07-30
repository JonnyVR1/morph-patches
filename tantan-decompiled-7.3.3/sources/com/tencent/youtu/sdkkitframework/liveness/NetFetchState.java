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
    public String f61506a;

    /* JADX INFO: renamed from: b */
    public String f61507b;

    /* JADX INFO: renamed from: c */
    public String f61508c = "";

    /* JADX INFO: renamed from: d */
    public String f61509d = "";

    /* JADX INFO: renamed from: e */
    public boolean f61510e = false;

    /* JADX INFO: renamed from: f */
    public boolean f61511f = false;

    /* JADX INFO: renamed from: g */
    public String f61512g = "";

    /* JADX INFO: renamed from: h */
    public String f61513h = "";

    /* JADX INFO: renamed from: i */
    public int f61514i = 2;

    /* JADX INFO: renamed from: j */
    public JSONObject f61515j = null;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState$a */
    public class C14633a extends HashMap<String, Object> {
        public C14633a(NetFetchState netFetchState) {
            put(StateEvent.Name.UI_TIPS, StringCode.NET_FETCH_DATA);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState$b */
    public class C14634b extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f61516a;

        public C14634b(NetFetchState netFetchState, String str) {
            this.f61516a = str;
            put("ui_error", 4194304);
            put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, 4194304);
            put("message", CommonUtils.makeMessageJson(4194304, StringCode.MSG_PARAM_ERROR, str));
        }
    }

    /* JADX INFO: renamed from: a */
    public String m85832a(String str) {
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
                            YtLogger.m85813w("NetFetchState", "Background configuration error！ 'need_action_video' is false,but must has video!!", null);
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
        YtFSM.getInstance().sendFSMEvent(new C14633a(this));
        int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            String str = YTAGReflectLiveCheckInterface.TAG;
            LiveStyleRequester.SeleceData seleceData = new LiveStyleRequester.SeleceData(-10000.0f);
            this.stateData.put("select_data", seleceData);
            if ((this.f61508c.isEmpty() || !this.f61510e) && this.f61507b != null) {
                YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData = new YtLivenessNetProtoHelper.GetLiveTypeReqData();
                YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
                getLiveTypeReqData.baseInfo = netBaseInfoData;
                netBaseInfoData.appId = this.f61506a;
                netBaseInfoData.businessId = "wx_default";
                netBaseInfoData.lux = seleceData.android_data.lux;
                getLiveTypeReqData.reflectConfig = this.f61512g;
                getLiveTypeReqData.controlConfig = this.f61513h;
                getLiveTypeReqData.colorNum = this.f61514i;
                String strMakeGetLiveTypeReq = YtLivenessNetProtoHelper.makeGetLiveTypeReq(getLiveTypeReqData);
                YtLogger.m85810i("NetFetchState", "Use online data ---> on get config info: " + strMakeGetLiveTypeReq);
                YtFSM.getInstance().sendNetworkRequest(StringCode.NET_FETCH_DATA, this.f61507b, strMakeGetLiveTypeReq, null, new C14654e(this, getLiveTypeReqData));
                return;
            }
            YtLogger.m85810i("NetFetchState", "Use local data");
            this.stateData.put("color_data", this.f61508c);
            this.stateData.put("action_data", this.f61509d);
            YtLogger.m85808d("NetFetchState", "select data:" + this.f61515j);
            JSONObject jSONObject = this.f61515j;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has(Constants.KEY_CONFIG)) {
                        this.stateData.put("control_config", this.f61515j.getString(Constants.KEY_CONFIG));
                    }
                    if (this.f61515j.has("reflect_param")) {
                        this.stateData.put("extra_config", this.f61515j.getString("reflect_param"));
                    }
                    if (this.f61515j.has("change_point_num")) {
                        this.stateData.put("cp_num", this.f61515j.getString("change_point_num"));
                    }
                } catch (JSONException e) {
                    String str2 = "Select data parse failed " + e.getLocalizedMessage();
                    YtLogger.m85809e("NetFetchState", str2, e);
                    YtSDKStats.getInstance().reportInfo(str2);
                }
            } else {
                YtLogger.m85809e("NetFetchState", "select data is null", null);
                YtSDKStats.getInstance().reportInfo("select data is null");
            }
            moveToNextState();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.m85811o("NetFetchState", makeStateInfo("NetFetchState", 1));
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
            this.f61506a = string;
            if (string == null) {
                YtSDKStats.getInstance().reportError(3145728, "yt_param_error");
            }
            if (jSONObject.has("config_api_url")) {
                this.f61507b = jSONObject.getString("config_api_url");
            }
            if (jSONObject.has("color_data")) {
                this.f61508c = jSONObject.getString("color_data");
            }
            if (jSONObject.has("local_config_flag")) {
                this.f61510e = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("action_default_seq")) {
                JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f61509d += jSONArray.getString(i);
                    if (i < jSONArray.length() - 1) {
                        this.f61509d += Constants.SEPARATOR_COMMA;
                    }
                }
            } else {
                this.f61509d = "0";
            }
            if (jSONObject.has("extra_config")) {
                this.f61512g = jSONObject.getString("extra_config");
            } else {
                this.f61512g = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.f61513h = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f61514i = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("select_data")) {
                this.f61515j = jSONObject.getJSONObject("select_data");
            }
            if (jSONObject.has("backend_proto_type")) {
                jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
            this.f61511f = jSONObject.optBoolean("action_local_config_flag", false);
        } catch (JSONException e) {
            e.printStackTrace();
            YtLogger.m85809e("NetFetchState", "Failed to parse json:", e);
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
        YtFSM.getInstance().sendFSMEvent(new C14634b(this, str));
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
