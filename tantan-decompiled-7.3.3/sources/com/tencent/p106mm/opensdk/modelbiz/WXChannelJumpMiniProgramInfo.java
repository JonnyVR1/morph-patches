package com.tencent.p106mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXChannelJumpMiniProgramInfo extends WXChannelBaseJumpInfo {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXChannelJumpMiniProgramInfo";
    public String path;
    public String username;

    @Override // com.tencent.p106mm.opensdk.modelbiz.WXChannelBaseJumpInfo, com.tencent.p106mm.opensdk.modelbiz.IWXChannelJumpInfo
    public boolean checkArgs() {
        String str;
        String str2 = this.username;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, username is null";
        } else {
            String str3 = this.path;
            if (str3 == null || str3.length() < LENGTH_LIMIT) {
                return super.checkArgs();
            }
            str = "checkArgs fail, path is invalid";
        }
        Log.m85358e(TAG, str);
        return false;
    }

    @Override // com.tencent.p106mm.opensdk.modelbiz.WXChannelBaseJumpInfo, com.tencent.p106mm.opensdk.modelbiz.IWXChannelJumpInfo
    public void serialize(Bundle bundle) {
        super.serialize(bundle);
        bundle.putString("wx_channel_jump_mini_program_username", this.username);
        bundle.putString("wx_channel_jump_mini_program_path", this.path);
    }

    @Override // com.tencent.p106mm.opensdk.modelbiz.IWXChannelJumpInfo
    public int type() {
        return 1;
    }

    @Override // com.tencent.p106mm.opensdk.modelbiz.WXChannelBaseJumpInfo, com.tencent.p106mm.opensdk.modelbiz.IWXChannelJumpInfo
    public void unserialize(Bundle bundle) {
        super.unserialize(bundle);
        this.username = bundle.getString("wx_channel_jump_mini_program_username");
        this.path = bundle.getString("wx_channel_jump_mini_program_path");
    }
}
