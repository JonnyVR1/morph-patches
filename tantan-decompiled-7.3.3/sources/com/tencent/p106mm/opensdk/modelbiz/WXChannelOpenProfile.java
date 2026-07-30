package com.tencent.p106mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import com.tencent.p106mm.opensdk.utils.C14503b;
import com.tencent.p106mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXChannelOpenProfile {

    public static class Req extends BaseReq {
        private static final int LENGTH_LIMIT = 1024;
        private static final String TAG = "MicroMsg.SDK.WXChannelOpenProfile.Req";
        public String userName;

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            if (C14503b.m85366b(this.userName)) {
                str = "userName is null";
            } else {
                if (this.userName.length() <= 1024) {
                    return true;
                }
                str = "userName.length too long";
            }
            Log.m85358e(TAG, str);
            return false;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.userName = bundle.getString("_wxapi_finder_userName");
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 34;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_userName", this.userName);
        }
    }

    public static class Resp extends BaseResp {
        public String extMsg;

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
            this.extMsg = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 34;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }

        public Resp() {
        }
    }
}
