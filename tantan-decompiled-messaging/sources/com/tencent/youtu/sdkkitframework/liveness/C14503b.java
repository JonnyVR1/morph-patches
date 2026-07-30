package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14503b extends HashMap<String, Object> {
    public C14503b(ActionLivenessState.C14479j c14479j) {
        put(StateEvent.Name.PROCESS_RESULT, "failed");
        put(StateEvent.Name.ERROR_CODE, 4194304);
        put("message", CommonUtils.makeMessageJson(4194304, StringCode.MSG_INNER_ERROR, "pose detect error4194304"));
    }
}
