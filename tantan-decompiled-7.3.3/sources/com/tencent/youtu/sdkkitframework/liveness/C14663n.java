package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.ytagreflectlivecheck.C14667a;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.n */
/* JADX INFO: loaded from: classes2.dex */
public class C14663n implements YTAGReflectLiveCheckInterface.LightLiveCheckResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReflectLivenessState f61651a;

    public C14663n(ReflectLivenessState reflectLivenessState) {
        this.f61651a = reflectLivenessState;
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onFailed(int i, String str, String str2) {
        this.f61651a.m85842a(i, str, str2);
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onReflectLiveImgData(RawImgData rawImgData) {
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onSuccess(C14667a c14667a) {
        YtLogger.m85811o("ReflectLivenessState", "reflect succeed,get frame count:" + c14667a.f61671a.length);
        this.f61651a.m85843a(c14667a);
    }
}
