package com.tencent.youtu.sdkkitframework.liveness;

import com.clevertap.android.sdk.Constants;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14654e implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ YtLivenessNetProtoHelper.GetLiveTypeReqData f61640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NetFetchState f61641b;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.e$a */
    public class a extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f61642a;

        public a(C14654e c14654e, String str) {
            this.f61642a = str;
            put("ui_error", "Response failed");
            put(StateEvent.Name.UI_TIPS, StringCode.NET_FETCH_FAILED);
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_NETWORK_ERROR));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_NETWORK_ERROR, StringCode.NET_FETCH_FAILED, str));
        }
    }

    public C14654e(NetFetchState netFetchState, YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData) {
        this.f61641b = netFetchState;
        this.f61640a = getLiveTypeReqData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    public void onNetworkResponseEvent(HashMap<String, String> map, Exception exc) {
        ?? r13;
        ?? r14;
        ?? r3;
        ?? r15 = "&";
        YtLogger.m85808d("NetFetchState", "response : " + map.get("response"));
        try {
            JSONObject jSONObject = new JSONObject(map.get("response"));
            YtLogger.m85811o("NetFetchState", "online actionData: " + jSONObject);
            if ((jSONObject.has(StateEvent.Name.ERROR_CODE) ? jSONObject.getInt(StateEvent.Name.ERROR_CODE) : jSONObject.has("errorcode") ? jSONObject.getInt("errorcode") : -1) == 0) {
                String string = jSONObject.has("color_data") ? jSONObject.getString("color_data") : null;
                String string2 = jSONObject.has("action_data") ? jSONObject.getString("action_data") : null;
                this.f61641b.stateData.put("color_data", string);
                this.f61641b.stateData.put("action_data", string2);
                NetFetchState netFetchState = this.f61641b;
                if (netFetchState.f61511f) {
                    netFetchState.stateData.put("action_data", netFetchState.f61509d);
                }
                try {
                    if (jSONObject.has("select_data")) {
                        if (jSONObject.getJSONObject("select_data").has(Constants.KEY_CONFIG)) {
                            String strReplaceAll = Pattern.compile("u0026|\\\\u0026").matcher(jSONObject.getJSONObject("select_data").getString(Constants.KEY_CONFIG).replaceAll("&amp;", "&").replaceAll("%26", "&").replaceAll("%3D", "=")).replaceAll("&");
                            NetFetchState netFetchState2 = this.f61641b;
                            netFetchState2.stateData.put("control_config", netFetchState2.m85832a(strReplaceAll));
                            if (!strReplaceAll.isEmpty()) {
                                String[] strArrSplit = strReplaceAll.split("&");
                                if (strArrSplit.length > 0) {
                                    for (String str : strArrSplit) {
                                        String[] strArrSplit2 = str.split("=");
                                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("actref_ux_mode")) {
                                            boolean z = Integer.parseInt(strArrSplit2[1]) != 2;
                                            HashMap<String, Object> map2 = new HashMap<>();
                                            map2.put(StateEvent.Name.LIVE_MODE_REFLECTION_OPEN, Boolean.valueOf(z));
                                            YtFSM.getInstance().sendFSMEvent(map2);
                                        }
                                    }
                                }
                            }
                        }
                        r15 = 1;
                        r15 = 1;
                        if (jSONObject.getJSONObject("select_data").has("reflect_param")) {
                            this.f61641b.stateData.put("extra_config", jSONObject.getJSONObject("select_data").getString("reflect_param"));
                        }
                        if (jSONObject.getJSONObject("select_data").has("change_point_num")) {
                            this.f61641b.stateData.put("cp_num", jSONObject.getJSONObject("select_data").getString("change_point_num"));
                        }
                    } else {
                        r15 = 1;
                        YtLogger.m85809e("NetFetchState", "select_data not found or select_data.config not found", null);
                    }
                    if (jSONObject.has("video_config")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("video_config");
                        if (jSONObject2.has("video_bitrate")) {
                            this.f61641b.stateData.put("video_bitrate", Integer.valueOf(jSONObject2.getInt("video_bitrate")));
                        }
                        if (jSONObject2.has("video_framerate")) {
                            this.f61641b.stateData.put("video_framerate", Integer.valueOf(jSONObject2.getInt("video_framerate")));
                        }
                        if (jSONObject2.has("video_iframeinterval")) {
                            this.f61641b.stateData.put("video_iframeinterval", Integer.valueOf(jSONObject2.getInt("video_iframeinterval")));
                        }
                    }
                    YtLivenessNetProtoHelper.Version version = new YtLivenessNetProtoHelper.Version();
                    version.sdk_version = YtSDKKitFramework.getInstance().version();
                    version.ftrack_sdk_version = YTFaceTracker.getVersion();
                    version.faction_sdk_version = YTPoseDetectJNIInterface.getVersion();
                    version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
                    String strMakeVersion = version.makeVersion();
                    YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData = this.f61640a;
                    this.f61641b.stateData.put("sd_data", new YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData(getLiveTypeReqData.baseInfo.lux, getLiveTypeReqData.colorNum, getLiveTypeReqData.reflectConfig, strMakeVersion, getLiveTypeReqData.controlConfig).toString());
                    this.f61641b.moveToNextState();
                    r3 = 0;
                } catch (JSONException e) {
                    e = e;
                    r13 = r15;
                    YtLogger.m85809e("NetFetchState", "parse response json other object failed:", e);
                    r14 = r13;
                    r3 = r14;
                }
            } else {
                r14 = 1;
                r3 = r14;
            }
        } catch (JSONException e2) {
            e = e2;
            r13 = 1;
        }
        if (r3 != 0) {
            YtLogger.m85809e("NetFetchState", "parse response failed", null);
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_NETWORK_ERROR, "server return failed");
            YtFSM.getInstance().sendFSMEvent(new a(this, map.containsKey("response") ? map.get("response") : "server return failed"));
        }
    }
}
