package com.tencent.p106mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import com.tencent.p106mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class SendMessageToWX {

    public interface IWXSceneDataObject {
        boolean checkArgs();

        int getJumpType();

        void serialize(Bundle bundle);

        void unserialize(Bundle bundle);
    }

    public static class Req extends BaseReq {
        private static final int FAV_CONTENT_LENGTH_LIMIT = 26214400;
        private static final String SCENE_DATA_OBJECT_KEY_IDENTIFIER = "_scene_data_object_identifier";
        private static final String TAG = "MicroMsg.SDK.SendMessageToWX.Req";
        public static final int WXSceneFavorite = 2;
        public static final int WXSceneSession = 0;
        public static final int WXSceneSpecifiedContact = 3;
        public static final int WXSceneStatus = 4;
        public static final int WXSceneTimeline = 1;
        public WXMediaMessage message;
        public int scene;
        public IWXSceneDataObject sceneDataObject;
        public String userOpenId;

        public Req(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            WXMediaMessage wXMediaMessage = this.message;
            if (wXMediaMessage == null) {
                str = "checkArgs fail ,message is null";
            } else {
                if (wXMediaMessage.mediaObject.type() == 6 && this.scene == 2) {
                    ((WXFileObject) this.message.mediaObject).setContentLengthLimit(FAV_CONTENT_LENGTH_LIMIT);
                }
                int i = this.scene;
                if (i == 3 && this.userOpenId == null) {
                    str = "Send specifiedContact userOpenId can not be null.";
                } else if (i == 3 && this.openId == null) {
                    str = "Send specifiedContact openid can not be null.";
                } else {
                    if (i != 4) {
                        return this.message.checkArgs();
                    }
                    if (this.sceneDataObject != null) {
                        if (this.message.getType() == 1) {
                            return this.sceneDataObject.checkArgs();
                        }
                        return this.message.checkArgs() && this.sceneDataObject.checkArgs();
                    }
                    str = "checkArgs fail, sceneDataObject is null";
                }
            }
            Log.m85358e(TAG, str);
            return false;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.message = WXMediaMessage.Builder.fromBundle(bundle);
            this.scene = bundle.getInt("_wxapi_sendmessagetowx_req_scene");
            this.userOpenId = bundle.getString("_wxapi_sendmessagetowx_req_use_open_id");
            String string = bundle.getString(SCENE_DATA_OBJECT_KEY_IDENTIFIER);
            if (string != null) {
                try {
                    IWXSceneDataObject iWXSceneDataObject = (IWXSceneDataObject) Class.forName(string).newInstance();
                    this.sceneDataObject = iWXSceneDataObject;
                    iWXSceneDataObject.unserialize(bundle);
                } catch (Exception e) {
                    Log.m85358e(TAG, "get WXSceneDataObject from bundle failed: unknown ident " + string + ", ex = " + e.getMessage());
                }
            }
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 2;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putAll(WXMediaMessage.Builder.toBundle(this.message));
            bundle.putInt("_wxapi_sendmessagetowx_req_scene", this.scene);
            bundle.putInt("_wxapi_sendmessagetowx_req_media_type", this.message.getType());
            bundle.putString("_wxapi_sendmessagetowx_req_use_open_id", this.userOpenId);
            IWXSceneDataObject iWXSceneDataObject = this.sceneDataObject;
            if (iWXSceneDataObject != null) {
                bundle.putString(SCENE_DATA_OBJECT_KEY_IDENTIFIER, iWXSceneDataObject.getClass().getName());
                this.sceneDataObject.serialize(bundle);
            }
        }

        public Req() {
        }
    }

    public static class Resp extends BaseResp {
        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 2;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }

        public Resp() {
        }
    }

    private SendMessageToWX() {
    }
}
