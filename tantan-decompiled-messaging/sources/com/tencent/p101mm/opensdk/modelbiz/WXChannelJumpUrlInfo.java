package com.tencent.p101mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p101mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXChannelJumpUrlInfo extends WXChannelBaseJumpInfo {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXChannelJumpUrlInfo";
    public String url;

    @Override // com.tencent.p101mm.opensdk.modelbiz.WXChannelBaseJumpInfo, com.tencent.p101mm.opensdk.modelbiz.IWXChannelJumpInfo
    public boolean checkArgs() {
        String str;
        String str2 = this.url;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, url is null";
        } else {
            if (this.url.length() < LENGTH_LIMIT) {
                return true;
            }
            str = "checkArgs fail, url is invalid";
        }
        Log.m84175e(TAG, str);
        return false;
    }

    @Override // com.tencent.p101mm.opensdk.modelbiz.WXChannelBaseJumpInfo, com.tencent.p101mm.opensdk.modelbiz.IWXChannelJumpInfo
    public void serialize(Bundle bundle) {
        super.serialize(bundle);
        bundle.putString("wx_channel_jump_url", this.url);
    }

    @Override // com.tencent.p101mm.opensdk.modelbiz.IWXChannelJumpInfo
    public int type() {
        return 2;
    }

    @Override // com.tencent.p101mm.opensdk.modelbiz.WXChannelBaseJumpInfo, com.tencent.p101mm.opensdk.modelbiz.IWXChannelJumpInfo
    public void unserialize(Bundle bundle) {
        super.unserialize(bundle);
        this.url = bundle.getString("wx_channel_jump_url");
    }
}
