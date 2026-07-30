package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14653d extends HashMap<String, Object> {
    public C14653d(ActionLivenessState.C14627j c14627j) {
        put(StateEvent.Name.PROCESS_RESULT, "failed");
        put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_ACTION_ENCODE_VIDEO_ERROR));
        put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_ACTION_ENCODE_VIDEO_ERROR, StringCode.MSG_INNER_ERROR, "read video error:400102"));
    }
}
