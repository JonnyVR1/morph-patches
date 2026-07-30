package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.ytagreflectlivecheck.C14519a;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.n */
/* JADX INFO: loaded from: classes2.dex */
public class C14515n implements YTAGReflectLiveCheckInterface.LightLiveCheckResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReflectLivenessState f60804a;

    public C14515n(ReflectLivenessState reflectLivenessState) {
        this.f60804a = reflectLivenessState;
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onFailed(int i, String str, String str2) {
        this.f60804a.m84671a(i, str, str2);
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onReflectLiveImgData(RawImgData rawImgData) {
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onSuccess(C14519a c14519a) {
        YtLogger.m84640o("ReflectLivenessState", "reflect succeed,get frame count:" + c14519a.f60824a.length);
        this.f60804a.m84672a(c14519a);
    }
}
