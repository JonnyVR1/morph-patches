package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14661l implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NetLivenessReqResultState f61650a;

    public C14661l(NetLivenessReqResultState netLivenessReqResultState) {
        this.f61650a = netLivenessReqResultState;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    public void onNetworkResponseEvent(HashMap<String, String> map, Exception exc) {
        YtLogger.m85810i("NetLivenessReqResultState", "handle actreflect response");
        NetLivenessReqResultState.m85834a(this.f61650a, map, null);
        NetLivenessReqResultState.m85833a(this.f61650a);
    }
}
