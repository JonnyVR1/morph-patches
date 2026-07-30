package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14511j implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NetLivenessReqResultState f60800a;

    public C14511j(NetLivenessReqResultState netLivenessReqResultState) {
        this.f60800a = netLivenessReqResultState;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    public void onNetworkResponseEvent(HashMap<String, String> map, Exception exc) {
        CommonUtils.benchMarkEnd("reflect_request_s2");
        CommonUtils.benchMarkBegin("reflect_request_s3");
        YtLogger.m84639i("NetLivenessReqResultState", "handle reflection response");
        NetLivenessReqResultState.m84663a(this.f60800a, map, null);
        CommonUtils.benchMarkEnd("reflect_request_s3");
        NetLivenessReqResultState.m84662a(this.f60800a);
    }
}
