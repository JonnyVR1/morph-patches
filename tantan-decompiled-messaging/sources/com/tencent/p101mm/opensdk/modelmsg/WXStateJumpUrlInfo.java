package com.tencent.p101mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p101mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXStateJumpUrlInfo implements WXStateSceneDataObject.IWXStateJumpInfo {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";
    public String jumpUrl;

    @Override // com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo
    public boolean checkArgs() {
        String str;
        String str2 = this.jumpUrl;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, jumpUrl is null";
        } else {
            if (this.jumpUrl.length() < LENGTH_LIMIT) {
                return true;
            }
            str = "checkArgs fail, jumpUrl is invalid";
        }
        Log.m84175e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo
    public void serialize(Bundle bundle) {
        bundle.putString("wx_state_jump_url", this.jumpUrl);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo
    public int type() {
        return 1;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo
    public void unserialize(Bundle bundle) {
        this.jumpUrl = bundle.getString("wx_state_jump_url", "");
    }
}
