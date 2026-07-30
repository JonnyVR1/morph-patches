package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14509h implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NetLivenessReqResultState f60798a;

    public C14509h(NetLivenessReqResultState netLivenessReqResultState) {
        this.f60798a = netLivenessReqResultState;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    public void onNetworkResponseEvent(HashMap<String, String> map, Exception exc) {
        YtLogger.m84639i("NetLivenessReqResultState", "Handle action response");
        NetLivenessReqResultState.m84663a(this.f60798a, map, null);
        NetLivenessReqResultState.m84662a(this.f60798a);
    }
}
