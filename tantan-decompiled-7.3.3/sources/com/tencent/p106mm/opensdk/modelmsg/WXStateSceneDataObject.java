package com.tencent.p106mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXStateSceneDataObject implements SendMessageToWX.IWXSceneDataObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXStateSceneDataObject";
    private static final String WX_STATE_JUMP_INFO_KEY_IDENTIFIER = "_wxapi_scene_data_state_jump_info_identifier";
    public String stateId;
    public IWXStateJumpInfo stateJumpInfo;
    public String stateTitle;
    public String token;

    public interface IWXStateJumpInfo {
        public static final int WX_STATE_JUMP_TYPE_CHANNEL_PROFILE = 3;
        public static final int WX_STATE_JUMP_TYPE_MINI_PROGRAM = 2;
        public static final int WX_STATE_JUMP_TYPE_UNKNOWN = 0;
        public static final int WX_STATE_JUMP_TYPE_URL = 1;

        boolean checkArgs();

        void serialize(Bundle bundle);

        int type();

        void unserialize(Bundle bundle);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public boolean checkArgs() {
        String str = this.stateId;
        if (str != null && str.length() > LENGTH_LIMIT) {
            Log.m85358e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        String str2 = this.stateTitle;
        if (str2 != null && str2.length() > LENGTH_LIMIT) {
            Log.m85358e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        String str3 = this.token;
        if (str3 != null && str3.length() > LENGTH_LIMIT) {
            Log.m85358e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo != null) {
            return iWXStateJumpInfo.checkArgs();
        }
        Log.m85358e(TAG, "checkArgs fail, statsJumpInfo is null");
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public int getJumpType() {
        IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo != null) {
            return iWXStateJumpInfo.type();
        }
        return 0;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxapi_scene_data_state_id", this.stateId);
        bundle.putString("_wxapi_scene_data_state_title", this.stateTitle);
        bundle.putString("_wxapi_scene_data_state_token", this.token);
        IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo != null) {
            bundle.putString(WX_STATE_JUMP_INFO_KEY_IDENTIFIER, iWXStateJumpInfo.getClass().getName());
            this.stateJumpInfo.serialize(bundle);
        }
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public void unserialize(Bundle bundle) {
        this.stateId = bundle.getString("_wxapi_scene_data_state_id");
        this.stateTitle = bundle.getString("_wxapi_scene_data_state_title");
        this.token = bundle.getString("_wxapi_scene_data_state_token");
        String string = bundle.getString(WX_STATE_JUMP_INFO_KEY_IDENTIFIER);
        if (string != null) {
            try {
                IWXStateJumpInfo iWXStateJumpInfo = (IWXStateJumpInfo) Class.forName(string).newInstance();
                this.stateJumpInfo = iWXStateJumpInfo;
                iWXStateJumpInfo.unserialize(bundle);
            } catch (Exception e) {
                Log.m85358e(TAG, "get WXSceneDataObject from bundle failed: unknown ident " + string + ", ex = " + e.getMessage());
            }
        }
    }
}
