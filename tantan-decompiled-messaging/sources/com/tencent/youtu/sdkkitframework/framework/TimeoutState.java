package com.tencent.youtu.sdkkitframework.framework;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TimeoutState extends YtFSMBaseState {
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() { // from class: com.tencent.youtu.sdkkitframework.framework.TimeoutState.1
            {
                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                put(StateEvent.Name.PROCESS_RESULT, "failed");
                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_VERIFY_TIMEOUT));
                put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_VERIFY_TIMEOUT, StringCode.MSG_TIMEOUT_ERROR, "Timeout"));
            }
        });
        YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }
}
