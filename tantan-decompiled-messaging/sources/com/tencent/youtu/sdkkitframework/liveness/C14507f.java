package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14507f extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Exception f60796a;

    public C14507f(NetLivenessReqResultState netLivenessReqResultState, Exception exc) {
        this.f60796a = exc;
        put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
        put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
        put(StateEvent.Name.PROCESS_RESULT, "failed");
        put(StateEvent.Name.ERROR_CODE, 3145728);
        put("message", CommonUtils.makeMessageJson(3145728, StringCode.MSG_PARAM_ERROR, exc.getLocalizedMessage()));
    }
}
