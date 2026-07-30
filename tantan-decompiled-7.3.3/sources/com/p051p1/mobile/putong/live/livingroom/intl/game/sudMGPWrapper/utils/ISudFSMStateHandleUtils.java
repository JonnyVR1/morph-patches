package com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils;

import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.MGStateResponse;
import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: loaded from: classes5.dex */
public class ISudFSMStateHandleUtils {
    public static void handleSuccess(ISudFSMStateHandle iSudFSMStateHandle) {
        MGStateResponse mGStateResponse = new MGStateResponse();
        mGStateResponse.ret_code = 0;
        mGStateResponse.ret_msg = "success";
        iSudFSMStateHandle.success(SudJsonUtils.toJson(mGStateResponse));
    }
}
