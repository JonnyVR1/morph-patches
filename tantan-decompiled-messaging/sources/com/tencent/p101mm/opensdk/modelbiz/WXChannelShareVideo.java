package com.tencent.p101mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p101mm.opensdk.modelbase.BaseReq;
import com.tencent.p101mm.opensdk.modelbase.BaseResp;
import com.tencent.p101mm.opensdk.utils.C14340b;
import com.tencent.p101mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXChannelShareVideo {

    public static class Req extends BaseReq {
        private static final int LENGTH_LIMIT = 1024;
        private static final String TAG = "MicroMsg.SDK.WXChannelShareVideo.Req";
        private static final String WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER = "_wxapi_channel_share_video_jump_info_identifier";
        public String extData;
        public IWXChannelJumpInfo jumpInfo;
        public String videoPath;

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            if (C14340b.m84183b(this.videoPath)) {
                str = "videoPath is null";
            } else {
                IWXChannelJumpInfo iWXChannelJumpInfo = this.jumpInfo;
                if (iWXChannelJumpInfo == null || iWXChannelJumpInfo.checkArgs()) {
                    return true;
                }
                str = "checkArgs fail, jumpInfo is invalid";
            }
            Log.m84175e(TAG, str);
            return false;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.videoPath = bundle.getString("_wxapi_finder_share_video_path");
            this.extData = bundle.getString("_wxapi_finder_share_video_extData");
            String string = bundle.getString(WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER);
            if (string != null) {
                try {
                    IWXChannelJumpInfo iWXChannelJumpInfo = (IWXChannelJumpInfo) Class.forName(string).newInstance();
                    this.jumpInfo = iWXChannelJumpInfo;
                    iWXChannelJumpInfo.unserialize(bundle);
                } catch (Exception e) {
                    Log.m84175e(TAG, "get WXChannelJumpInfo from bundle failed: unknown ident " + string + ", ex = " + e.getMessage());
                }
            }
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 33;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_share_video_path", this.videoPath);
            bundle.putString("_wxapi_finder_share_video_extData", this.extData);
            IWXChannelJumpInfo iWXChannelJumpInfo = this.jumpInfo;
            if (iWXChannelJumpInfo != null) {
                bundle.putString(WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER, iWXChannelJumpInfo.getClass().getName());
                this.jumpInfo.serialize(bundle);
            }
        }
    }

    public static class Resp extends BaseResp {
        public String extMsg;

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 33;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }

        public Resp() {
        }
    }
}
