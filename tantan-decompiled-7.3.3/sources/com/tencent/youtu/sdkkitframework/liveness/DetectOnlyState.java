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
    public boolean f61483a = false;

    /* JADX INFO: renamed from: b */
    public String f61484b = "";

    /* JADX INFO: renamed from: c */
    public boolean f61485c = false;

    /* JADX INFO: renamed from: d */
    public int f61486d = 80;

    /* JADX INFO: renamed from: e */
    public YTFaceTracker f61487e;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState$a */
    public class C14630a extends HashMap<String, Object> {
        public C14630a(DetectOnlyState detectOnlyState) {
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
                this.f61483a = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.f61484b = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.f61485c = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("min_face_size")) {
                this.f61486d = jSONObject.getInt("min_face_size");
            }
        } catch (Exception e) {
            YtLogger.m85809e("DetectOnlyState", "Failed to parse json:", e);
        }
        if (!this.f61483a) {
            FileUtils.loadLibrary("YTFaceTracker");
        }
        Context context = YtFSM.getInstance().getContext().currentAppContext;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.f61483a) {
            absolutePath = this.f61484b;
            YtLogger.m85810i("DetectOnlyState", "Use online path:" + absolutePath);
        } else {
            YtLogger.m85810i("DetectOnlyState", "Use local path:" + absolutePath);
        }
        try {
            if (this.f61483a) {
                this.f61487e = new YTFaceTracker(absolutePath, "config.ini");
            } else {
                this.f61487e = new YTFaceTracker(context.getAssets(), "models/face-tracker-v001", "config.ini");
            }
            YTFaceTracker.Param param = this.f61487e.getParam();
            YtLogger.m85810i("DetectOnlyState", "big face mode" + this.f61485c);
            param.biggerFaceMode = this.f61485c ? 1 : 0;
            param.minFaceSize = this.f61486d;
            param.detInterval = -1;
            this.f61487e.setParam(param);
            YtLogger.m85810i("DetectOnlyState", "Detect version:" + YTFaceTracker.getVersion());
        } catch (Exception e2) {
            YtLogger.m85809e("DetectOnlyState", "init YTFaceTracker error", e2);
            e2.printStackTrace();
            YtSDKStats.getInstance().reportError(1, "failed to init face trace sdk");
            YtFSM.getInstance().sendFSMEvent(new C14630a(this));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j) {
        super.update(yTImageData, j);
    }
}
