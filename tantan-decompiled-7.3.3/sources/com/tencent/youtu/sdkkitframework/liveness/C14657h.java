package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14657h implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NetLivenessReqResultState f61645a;

    public C14657h(NetLivenessReqResultState netLivenessReqResultState) {
        this.f61645a = netLivenessReqResultState;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    public void onNetworkResponseEvent(HashMap<String, String> map, Exception exc) {
        YtLogger.m85810i("NetLivenessReqResultState", "Handle action response");
        NetLivenessReqResultState.m85834a(this.f61645a, map, null);
        NetLivenessReqResultState.m85833a(this.f61645a);
    }
}
