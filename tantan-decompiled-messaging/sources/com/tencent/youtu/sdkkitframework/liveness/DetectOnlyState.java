package com.tencent.youtu.sdkkitframework.liveness;

import android.content.Context;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DetectOnlyState extends YtFSMBaseState {

    /* JADX INFO: renamed from: a */
    public boolean f60636a = false;

    /* JADX INFO: renamed from: b */
    public String f60637b = "";

    /* JADX INFO: renamed from: c */
    public boolean f60638c = false;

    /* JADX INFO: renamed from: d */
    public int f60639d = 80;

    /* JADX INFO: renamed from: e */
    public YTFaceTracker f60640e;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState$a */
    public class C14482a extends HashMap<String, Object> {
        public C14482a(DetectOnlyState detectOnlyState) {
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "检测初始化失败"));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        try {
            if (jSONObject.has("resource_online")) {
                this.f60636a = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.f60637b = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.f60638c = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("min_face_size")) {
                this.f60639d = jSONObject.getInt("min_face_size");
            }
        } catch (Exception e) {
            YtLogger.m84638e("DetectOnlyState", "Failed to parse json:", e);
        }
        if (!this.f60636a) {
            FileUtils.loadLibrary("YTFaceTracker");
        }
        Context context = YtFSM.getInstance().getContext().currentAppContext;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.f60636a) {
            absolutePath = this.f60637b;
            YtLogger.m84639i("DetectOnlyState", "Use online path:" + absolutePath);
        } else {
            YtLogger.m84639i("DetectOnlyState", "Use local path:" + absolutePath);
        }
        try {
            if (this.f60636a) {
                this.f60640e = new YTFaceTracker(absolutePath, "config.ini");
            } else {
                this.f60640e = new YTFaceTracker(context.getAssets(), "models/face-tracker-v001", "config.ini");
            }
            YTFaceTracker.Param param = this.f60640e.getParam();
            YtLogger.m84639i("DetectOnlyState", "big face mode" + this.f60638c);
            param.biggerFaceMode = this.f60638c ? 1 : 0;
            param.minFaceSize = this.f60639d;
            param.detInterval = -1;
            this.f60640e.setParam(param);
            YtLogger.m84639i("DetectOnlyState", "Detect version:" + YTFaceTracker.getVersion());
        } catch (Exception e2) {
            YtLogger.m84638e("DetectOnlyState", "init YTFaceTracker error", e2);
            e2.printStackTrace();
            YtSDKStats.getInstance().reportError(1, "failed to init face trace sdk");
            YtFSM.getInstance().sendFSMEvent(new C14482a(this));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j) {
        super.update(yTImageData, j);
    }
}
