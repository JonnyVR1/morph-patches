package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14508g extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f60797a;

    public C14508g(NetLivenessReqResultState netLivenessReqResultState, String str) {
        this.f60797a = str;
        put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
        put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
        put(StateEvent.Name.PROCESS_RESULT, "failed");
        put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_NETWORK_ERROR));
        put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_NETWORK_ERROR, StringCode.MSG_NET_ERROR, str));
    }
}
